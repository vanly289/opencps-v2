package org.opencps.api.controller.impl;

import java.util.LinkedHashMap;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

import org.apache.commons.httpclient.util.HttpURLConnection;
import org.opencps.api.controller.StatisticManagement;
import org.opencps.api.controller.exception.ErrorMsg;
import org.opencps.api.controller.util.StatisticUtils;
import org.opencps.api.statistic.model.StatisticDossierResults;
import org.opencps.api.statistic.model.StatisticDossierSearchModel;
import org.opencps.auth.api.BackendAuth;
import org.opencps.auth.api.BackendAuthImpl;
import org.opencps.auth.api.exception.UnauthenticationException;
import org.opencps.auth.api.exception.UnauthorizationException;
import org.opencps.auth.utils.APIDateTimeUtils;
import org.opencps.dossiermgt.action.DossierActions;
import org.opencps.dossiermgt.action.impl.DossierActionsImpl;
import org.opencps.dossiermgt.constants.DossierTerm;
import org.opencps.usermgt.model.WorkingUnit;
import org.opencps.usermgt.service.WorkingUnitLocalServiceUtil;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

public class StatisticManagementImpl implements StatisticManagement {

	private static final Log _log = LogFactoryUtil.getLog(StatisticManagementImpl.class);
	
	@Override
	public Response getDossiers(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, StatisticDossierSearchModel query, String govAgencyCodes, String from, String to) {

		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
		BackendAuth auth = new BackendAuthImpl();
		DossierActions actions = new DossierActionsImpl();
		
		try {

			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}
			
			String fromSubmitDate = APIDateTimeUtils.convertNormalDateToLuceneDate(from);
			String toSubmitDate = APIDateTimeUtils.convertNormalDateToLuceneDate(to);

			JSONArray arr = JSONFactoryUtil.createJSONArray();
			
			if (Validator.isNotNull(govAgencyCodes)) {
				String[] agencies = StringUtil.split(govAgencyCodes);
				
				for(String agency : agencies) {
					LinkedHashMap<String, Object> params = new LinkedHashMap<String, Object>();

					params.put(Field.GROUP_ID, String.valueOf(groupId));
//					params.put(DossierTerm.STATUS, query.getDossierStatus());
					params.put(DossierTerm.SUBSTATUS, query.getDossierSubStatus());
					params.put(Field.USER_ID, String.valueOf(user.getUserId()));
					params.put(DossierTerm.FOLLOW, String.valueOf(false));
					params.put(DossierTerm.FROM_SUBMIT_DATE, fromSubmitDate);
					params.put(DossierTerm.TO_SUBMIT_DATE, toSubmitDate);
					
					params.put(DossierTerm.AGENCY, agency);
					JSONObject jsonData = actions.getDossierStatistics(user.getUserId(), company.getCompanyId(), groupId, params,
								null, serviceContext);
					
					jsonData.put("govAgencyCode", agency);
					
					WorkingUnit workingUnit = WorkingUnitLocalServiceUtil.fetWorkingUnitByGovAgencyCode(groupId, agency);
					if(workingUnit != null) {
						jsonData.put("govAgencyName", workingUnit.getName());
					}
					
					arr.put(jsonData);
				}
			}

			//results.setTotal(jsonData.getInt("total"));

			/*results.getStatisticDossierModel()
					.addAll(StatisticUtils.mapperStatisticDossierList(jsonData.getJSONArray("data")));*/

			return Response.status(200).entity(arr.toString()).build();

		} catch (Exception e) {
			_log.error(e);
			return processException(e);
		}
	}

	@Override
	public Response getDossierTodo(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, StatisticDossierSearchModel query, String serviceCode, String govAgencyCode) {

		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
		BackendAuth auth = new BackendAuthImpl();
		DossierActions actions = new DossierActionsImpl();

		try {

			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			LinkedHashMap<String, Object> params = new LinkedHashMap<String, Object>();

			params.put(Field.GROUP_ID, String.valueOf(groupId));
			params.put(DossierTerm.STATUS, query.getDossierStatus());
			params.put(DossierTerm.SUBSTATUS, query.getDossierSubStatus());
			params.put(Field.USER_ID, String.valueOf(user.getUserId()));
			params.put(DossierTerm.FOLLOW, String.valueOf(false));

			if (Validator.isNotNull(serviceCode)) {
				params.put(DossierTerm.SERVICE, serviceCode);
			}
			if (Validator.isNotNull(govAgencyCode)) {
				params.put(DossierTerm.AGENCY, govAgencyCode);
			}
			JSONObject jsonData = actions.getDossierTodoPermission(user.getUserId(), company.getCompanyId(), groupId, params,
					null, serviceContext);

			StatisticDossierResults results = new StatisticDossierResults();

			results.setTotal(jsonData.getInt("total"));

			results.getStatisticDossierModel()
					.addAll(StatisticUtils.mapperStatisticDossierList(jsonData.getJSONArray("data")));

			return Response.status(200).entity(results).build();

		} catch (Exception e) {
			_log.error(e);
			return processException(e);
		}
	}

	@Override
	public Response getDossierCountTodo(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, StatisticDossierSearchModel query, String serviceCode, String govAgencyCode) {

		BackendAuth auth = new BackendAuthImpl();
		DossierActions actions = new DossierActionsImpl();

		try {

			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			LinkedHashMap<String, Object> params = new LinkedHashMap<String, Object>();
			long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
			long userId = user.getUserId();

			// Get info input
			long notStatusReg = query.getNotStatusReg();
			String status = query.getDossierStatus();
			String substatus = query.getDossierSubStatus();
			

			params.put(Field.GROUP_ID, String.valueOf(groupId));
			params.put(DossierTerm.STATUS, status);
			params.put(DossierTerm.SUBSTATUS, substatus);
			params.put(Field.USER_ID, String.valueOf(userId));
			params.put(DossierTerm.OWNER, String.valueOf(true));
			params.put(DossierTerm.NOT_STATUS_REG, notStatusReg);

			if (Validator.isNotNull(serviceCode)) {
				params.put(DossierTerm.SERVICE, serviceCode);
			}
			if (Validator.isNotNull(govAgencyCode)) {
				params.put(DossierTerm.AGENCY, govAgencyCode);
			}
			JSONObject jsonData = actions.getDossierCountTodoPermission(user.getUserId(), company.getCompanyId(), groupId, params,
					null, serviceContext);

			StatisticDossierResults results = new StatisticDossierResults();

			results.setTotal(jsonData.getInt("total"));

			results.getStatisticDossierModel()
					.addAll(StatisticUtils.mapperStatisticDossierList(jsonData.getJSONArray("data")));

			return Response.status(200).entity(results).build();

		} catch (Exception e) {
			_log.error(e);
			return processException(e);
		}
	}

	// Declare exception major process
	private Response processException (Exception e) {
		ErrorMsg error = new ErrorMsg();

		if (e instanceof UnauthenticationException) {
			error.setMessage("Non-Authoritative Information.");
			error.setCode(HttpURLConnection.HTTP_NOT_AUTHORITATIVE);
			error.setDescription("Non-Authoritative Information.");

			return Response.status(HttpURLConnection.HTTP_NOT_AUTHORITATIVE).entity(error).build();
		} else {
			if (e instanceof UnauthorizationException) {
				error.setMessage("Unauthorized.");
				error.setCode(HttpURLConnection.HTTP_NOT_AUTHORITATIVE);
				error.setDescription("Unauthorized.");

				return Response.status(HttpURLConnection.HTTP_UNAUTHORIZED).entity(error).build();

			} else {

				error.setMessage("Internal Server Error");
				error.setCode(HttpURLConnection.HTTP_FORBIDDEN);
				error.setDescription(e.getMessage());

				return Response.status(HttpURLConnection.HTTP_INTERNAL_ERROR).entity(error).build();

			}
		}
	}
}

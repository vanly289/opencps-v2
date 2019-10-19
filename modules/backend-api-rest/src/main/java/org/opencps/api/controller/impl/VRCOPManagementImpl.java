package org.opencps.api.controller.impl;

import com.fds.vr.cop.service.VRCOPProductTypeLocalServiceUtil;
import com.fds.vr.cop.service.VRCOPProductionPlantEmployeeLocalServiceUtil;
import com.fds.vr.cop.service.VRCOPProductionPlantEquipmentLocalServiceUtil;
import com.fds.vr.cop.service.VRCOPProductionPlantProdEquipmentLocalServiceUtil;
import com.fds.vr.cop.service.VRCOPReportAttachLocalServiceUtil;
import com.fds.vr.cop.service.VRCOPReportRepositoryLocalServiceUtil;
import com.fds.vr.cop.xmlmodel.VRCOPProductTypeModel;
import com.fds.vr.cop.xmlmodel.VRCOPProductTypeResultModel;
import com.fds.vr.cop.xmlmodel.VRCOPProductionPlantEmployeeModel;
import com.fds.vr.cop.xmlmodel.VRCOPProductionPlantEmployeeResultModel;
import com.fds.vr.cop.xmlmodel.VRCOPProductionPlantEquipmentModel;
import com.fds.vr.cop.xmlmodel.VRCOPProductionPlantEquipmentResultModel;
import com.fds.vr.cop.xmlmodel.VRCOPProductionPlantProdEquipmentModel;
import com.fds.vr.cop.xmlmodel.VRCOPProductionPlantProdEquipmentResultModel;
import com.fds.vr.cop.xmlmodel.VRCOPReportAttachModel;
import com.fds.vr.cop.xmlmodel.VRCOPReportAttachResultModel;
import com.fds.vr.cop.xmlmodel.VRCOPReportRepositoryModel;
import com.fds.vr.cop.xmlmodel.VRCOPReportRepositoryResultModel;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

import org.apache.commons.httpclient.util.HttpURLConnection;
import org.opencps.api.controller.VRCOPManagement;
import org.opencps.api.controller.exception.ErrorMsg;
import org.opencps.auth.api.exception.UnauthenticationException;
import org.opencps.auth.api.exception.UnauthorizationException;

public class VRCOPManagementImpl implements VRCOPManagement {

	private Log _log = LogFactoryUtil.getLog(VRCOPManagementImpl.class);

	@Override
	public Response getVRCOPReportRepositories(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, int start,int end ) {
		
		try {
			

			JSONArray result = VRCOPReportRepositoryLocalServiceUtil.getCOPReports(start, end);
			
			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {
			
			_log.error(e);
			ErrorMsg error = new ErrorMsg();

			if (e instanceof UnauthenticationException) {
				error.setMessage("Non-Authoritative Information.");
				error.setCode(HttpURLConnection.HTTP_NOT_AUTHORITATIVE);
				error.setDescription("Non-Authoritative Information.");

				return Response.status(HttpURLConnection.HTTP_NOT_AUTHORITATIVE).entity(error).build();
			} else {
				if (e instanceof UnauthorizationException) {
					error.setMessage("Unauthorized.");
					error.setCode(HttpURLConnection.HTTP_UNAUTHORIZED);
					error.setDescription("Unauthorized.");

					return Response.status(HttpURLConnection.HTTP_UNAUTHORIZED).entity(error).build();

				} else {

					error.setMessage("Internal Server Error");
					error.setCode(HttpURLConnection.HTTP_INTERNAL_ERROR);
					error.setDescription(e.getMessage());

					return Response.status(HttpURLConnection.HTTP_INTERNAL_ERROR).entity(error).build();

				}
			}
		}
	}
	
	@Override
	public Response getVRCOPReportRepositories(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext) {
		
		return getVRCOPReportRepositories(request, header, company, locale, user, serviceContext, 0, 50);
	}
	
	@Override
	public Response getVRCOPReportRepository(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String COPReportNo ) {
		
		try {
			
			JSONObject result = VRCOPReportRepositoryLocalServiceUtil.getCOPReport(COPReportNo);
			
			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {
			
			_log.error(e);
			ErrorMsg error = new ErrorMsg();

			if (e instanceof UnauthenticationException) {
				error.setMessage("Non-Authoritative Information.");
				error.setCode(HttpURLConnection.HTTP_NOT_AUTHORITATIVE);
				error.setDescription("Non-Authoritative Information.");

				return Response.status(HttpURLConnection.HTTP_NOT_AUTHORITATIVE).entity(error).build();
			} else {
				if (e instanceof UnauthorizationException) {
					error.setMessage("Unauthorized.");
					error.setCode(HttpURLConnection.HTTP_UNAUTHORIZED);
					error.setDescription("Unauthorized.");

					return Response.status(HttpURLConnection.HTTP_UNAUTHORIZED).entity(error).build();

				} else {

					error.setMessage("Internal Server Error");
					error.setCode(HttpURLConnection.HTTP_INTERNAL_ERROR);
					error.setDescription(e.getMessage());

					return Response.status(HttpURLConnection.HTTP_INTERNAL_ERROR).entity(error).build();

				}
			}
		}
	}
	
	@Override
	public Response getVRCOPProductionPlantEmployeeList(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String COPReportNo ) {
		
		try {

			JSONArray result = VRCOPProductionPlantEmployeeLocalServiceUtil.getListBy(COPReportNo);
			
			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {
			
			_log.error(e);
			ErrorMsg error = new ErrorMsg();

			if (e instanceof UnauthenticationException) {
				error.setMessage("Non-Authoritative Information.");
				error.setCode(HttpURLConnection.HTTP_NOT_AUTHORITATIVE);
				error.setDescription("Non-Authoritative Information.");

				return Response.status(HttpURLConnection.HTTP_NOT_AUTHORITATIVE).entity(error).build();
			} else {
				if (e instanceof UnauthorizationException) {
					error.setMessage("Unauthorized.");
					error.setCode(HttpURLConnection.HTTP_UNAUTHORIZED);
					error.setDescription("Unauthorized.");

					return Response.status(HttpURLConnection.HTTP_UNAUTHORIZED).entity(error).build();

				} else {

					error.setMessage("Internal Server Error");
					error.setCode(HttpURLConnection.HTTP_INTERNAL_ERROR);
					error.setDescription(e.getMessage());

					return Response.status(HttpURLConnection.HTTP_INTERNAL_ERROR).entity(error).build();

				}
			}
		}
	}
	
	@Override
	public Response getVRCOPProductionPlantEquipmentList(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String COPReportNo ) {
		
		try {

			JSONArray result = VRCOPProductionPlantEquipmentLocalServiceUtil.getListBy(COPReportNo);
			

			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {
			
			_log.error(e);
			ErrorMsg error = new ErrorMsg();

			if (e instanceof UnauthenticationException) {
				error.setMessage("Non-Authoritative Information.");
				error.setCode(HttpURLConnection.HTTP_NOT_AUTHORITATIVE);
				error.setDescription("Non-Authoritative Information.");

				return Response.status(HttpURLConnection.HTTP_NOT_AUTHORITATIVE).entity(error).build();
			} else {
				if (e instanceof UnauthorizationException) {
					error.setMessage("Unauthorized.");
					error.setCode(HttpURLConnection.HTTP_UNAUTHORIZED);
					error.setDescription("Unauthorized.");

					return Response.status(HttpURLConnection.HTTP_UNAUTHORIZED).entity(error).build();

				} else {

					error.setMessage("Internal Server Error");
					error.setCode(HttpURLConnection.HTTP_INTERNAL_ERROR);
					error.setDescription(e.getMessage());

					return Response.status(HttpURLConnection.HTTP_INTERNAL_ERROR).entity(error).build();

				}
			}
		}
	}
	
	@Override
	public Response getVRCOPProductionPlantProdEquipmentList(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String COPReportNo ) {
		
		try {

			JSONArray result = VRCOPProductionPlantProdEquipmentLocalServiceUtil.getListBy(COPReportNo);
			

			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {
			
			_log.error(e);
			ErrorMsg error = new ErrorMsg();

			if (e instanceof UnauthenticationException) {
				error.setMessage("Non-Authoritative Information.");
				error.setCode(HttpURLConnection.HTTP_NOT_AUTHORITATIVE);
				error.setDescription("Non-Authoritative Information.");

				return Response.status(HttpURLConnection.HTTP_NOT_AUTHORITATIVE).entity(error).build();
			} else {
				if (e instanceof UnauthorizationException) {
					error.setMessage("Unauthorized.");
					error.setCode(HttpURLConnection.HTTP_UNAUTHORIZED);
					error.setDescription("Unauthorized.");

					return Response.status(HttpURLConnection.HTTP_UNAUTHORIZED).entity(error).build();

				} else {

					error.setMessage("Internal Server Error");
					error.setCode(HttpURLConnection.HTTP_INTERNAL_ERROR);
					error.setDescription(e.getMessage());

					return Response.status(HttpURLConnection.HTTP_INTERNAL_ERROR).entity(error).build();

				}
			}
		}
	}
	
	@Override
	public Response getVRCOPProductTypeList(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String COPReportNo ) {
		
		try {

			JSONArray result = VRCOPProductTypeLocalServiceUtil.getListBy(COPReportNo);
			

			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {
			
			_log.error(e);
			ErrorMsg error = new ErrorMsg();

			if (e instanceof UnauthenticationException) {
				error.setMessage("Non-Authoritative Information.");
				error.setCode(HttpURLConnection.HTTP_NOT_AUTHORITATIVE);
				error.setDescription("Non-Authoritative Information.");

				return Response.status(HttpURLConnection.HTTP_NOT_AUTHORITATIVE).entity(error).build();
			} else {
				if (e instanceof UnauthorizationException) {
					error.setMessage("Unauthorized.");
					error.setCode(HttpURLConnection.HTTP_UNAUTHORIZED);
					error.setDescription("Unauthorized.");

					return Response.status(HttpURLConnection.HTTP_UNAUTHORIZED).entity(error).build();

				} else {

					error.setMessage("Internal Server Error");
					error.setCode(HttpURLConnection.HTTP_INTERNAL_ERROR);
					error.setDescription(e.getMessage());

					return Response.status(HttpURLConnection.HTTP_INTERNAL_ERROR).entity(error).build();

				}
			}
		}
	}
	
	@Override
	public Response getVRCOPReportAttachList(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String COPReportNo ) {
		
		try {

			JSONArray result = VRCOPReportAttachLocalServiceUtil.getListBy(COPReportNo);
			
			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {
			
			_log.error(e);
			ErrorMsg error = new ErrorMsg();

			if (e instanceof UnauthenticationException) {
				error.setMessage("Non-Authoritative Information.");
				error.setCode(HttpURLConnection.HTTP_NOT_AUTHORITATIVE);
				error.setDescription("Non-Authoritative Information.");

				return Response.status(HttpURLConnection.HTTP_NOT_AUTHORITATIVE).entity(error).build();
			} else {
				if (e instanceof UnauthorizationException) {
					error.setMessage("Unauthorized.");
					error.setCode(HttpURLConnection.HTTP_UNAUTHORIZED);
					error.setDescription("Unauthorized.");

					return Response.status(HttpURLConnection.HTTP_UNAUTHORIZED).entity(error).build();

				} else {

					error.setMessage("Internal Server Error");
					error.setCode(HttpURLConnection.HTTP_INTERNAL_ERROR);
					error.setDescription(e.getMessage());

					return Response.status(HttpURLConnection.HTTP_INTERNAL_ERROR).entity(error).build();

				}
			}
		}
	}


}

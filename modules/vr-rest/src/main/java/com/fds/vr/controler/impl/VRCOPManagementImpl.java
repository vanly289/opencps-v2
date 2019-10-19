package com.fds.vr.controler.impl;

import com.fds.vr.business.action.VRCOPReportRepositoryAction;
import com.fds.vr.business.action.impl.VRCOPReportRepositoryActionImpl;
import com.fds.vr.business.exception.NoSuchVRCOPReportRepositoryException;
import com.fds.vr.business.service.VRCOPProdEquipmentLocalServiceUtil;
import com.fds.vr.business.service.VRCOPProductTypeLocalServiceUtil;
import com.fds.vr.business.service.VRCOPProductionPlantEmployeeLocalServiceUtil;
import com.fds.vr.business.service.VRCOPProductionPlantEquipmentLocalServiceUtil;
import com.fds.vr.business.service.VRCOPReportAttachLocalServiceUtil;
import com.fds.vr.business.service.VRCOPReportRepositoryLocalServiceUtil;
import com.fds.vr.controler.VRCOPManagement;
import com.fds.vr.model.VRCOPReportRepositoryBeanParam;
import com.fds.vr.util.VRRestUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.StringPool;

import java.util.LinkedHashMap;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

/**
 * @author trungnt
 *
 */
public class VRCOPManagementImpl implements VRCOPManagement {
	private Log _log = LogFactoryUtil.getLog(VRCOPManagementImpl.class);

	@Override
	public Response findReportRepositoryYear(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRCOPReportRepositoryBeanParam query) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);
			VRCOPReportRepositoryAction actionImpl = new VRCOPReportRepositoryActionImpl();
			result = actionImpl.findVRCOPReportRepositoryYear(user, serviceContext, params);
			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get reportrepositoryyear")).build();
		}
	}

	@Override
	public Response findReportRepository(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, Integer year, VRCOPReportRepositoryBeanParam query) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);
			VRCOPReportRepositoryAction actionImpl = new VRCOPReportRepositoryActionImpl();
			result = actionImpl.findVRCOPReportRepository(user, serviceContext, year, params);
			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get reportrepository")).build();
		}
	}
	
//	@Override
//	public Response getVRCOPReportRepositories(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
//			User user, ServiceContext serviceContext, int start,int end ) {
//		
//		try {
//			
//
//			JSONArray result = VRCOPReportRepositoryLocalServiceUtil.getCOPReports(start, end);
//			
//			return Response.status(200).entity(result.toString()).build();
//
//		} catch (Exception e) {
//			
//			_log.error(e);
//
//			return Response.status(500).entity(VRRestUtil.errorMessage(StringPool.BLANK)).build();
//		}
//	}
	
//	@Override
//	public Response getVRCOPReportRepositories(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
//			User user, ServiceContext serviceContext) {
//		
//		return getVRCOPReportRepositories(request, header, company, locale, user, serviceContext, 0, 50);
//	}
	
	@Override
	public Response getVRCOPReportRepository(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext,long mtCore, String COPReportNo ) {
		
		try {
			
			JSONObject result = VRCOPReportRepositoryLocalServiceUtil.getByCOPReportNo(mtCore, COPReportNo);
			
			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {
			
			_log.error(e);
			
			return Response.status(500).entity(VRRestUtil.errorMessage(StringPool.BLANK)).build();
		}
	}
	
	@Override
	public Response getVRCOPProductionPlantEmployeeList(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext,long mtCore, String COPReportNo ) {
		
		try {

			JSONArray result = VRCOPProductionPlantEmployeeLocalServiceUtil.getByCOPReportNo(mtCore,COPReportNo);
			
			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {
			
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage(StringPool.BLANK)).build();
		}
	}
	
	@Override
	public Response getVRCOPProductionPlantEquipmentList(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext,long mtCore, String COPReportNo ) {
		
		try {

			JSONArray result = VRCOPProductionPlantEquipmentLocalServiceUtil.getByCOPReportNo(mtCore,COPReportNo);
			
			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {
			
			_log.error(e);
			

			return Response.status(500).entity(VRRestUtil.errorMessage(StringPool.BLANK)).build();
		}
	}
	
	@Override
	public Response getVRCOPProductionPlantProdEquipmentList(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext,long mtCore, String COPReportNo ) {
		
		try {

			JSONArray result = VRCOPProdEquipmentLocalServiceUtil.getByCOPReportNo(mtCore, COPReportNo);

			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {
			
			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage(StringPool.BLANK)).build();
		}
	}
	
	@Override
	public Response getVRCOPProductTypeList(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext,long mtCore, String COPReportNo ) {
		
		try {

			JSONArray result = VRCOPProductTypeLocalServiceUtil.getByCOPReportNo(mtCore,COPReportNo);
			
			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {
			
			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage(StringPool.BLANK)).build();
		}
	}
	
	@Override
	public Response getVRCOPReportAttachList(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext,long mtCore, String COPReportNo ) {
		
		try {

			JSONArray result = VRCOPReportAttachLocalServiceUtil.getByCOPReportNo(mtCore,COPReportNo);
			
			return Response.status(200).entity(result.toString()).build();

		} catch (Exception e) {
			
			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage(StringPool.BLANK)).build();
		}
	}

}

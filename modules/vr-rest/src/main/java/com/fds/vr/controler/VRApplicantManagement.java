package com.fds.vr.controler;

import com.fds.vr.model.VRApplicantProfileApiModel;
import com.fds.vr.model.VRApplicantProfileBeanParam;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.swagger.annotations.ApiOperation;


/**
 * @author trungnt
 *
 */
public interface VRApplicantManagement {

	@POST
	@Path("/applicant/profile/create")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "create VRProductionPlant", tags={ "vrproductionplantapimodel"})
	public Response createVRApplicantProfile(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, String data);
	
	/*@POST
	@Path("/applicant/profile/create")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "create VRProductionPlant", tags={ "vrproductionplantapimodel"})
	public Response createVRApplicantProfile(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, VRApplicantProfileApiModel model);*/
	
	@GET
	@Path("/applicant/profile/search")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findApplicantProfile(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user, @Context ServiceContext serviceContext,
			@BeanParam VRApplicantProfileBeanParam query);
	
	@GET
	@Path("/applicant/profile/detail")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findApplicantProfileDetail(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user, @Context ServiceContext serviceContext,
			@BeanParam VRApplicantProfileBeanParam query);
	
	
	@GET
	@Path("/applicant/profile/{applicantcode}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findApplicantProfileByCode(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user, @Context ServiceContext serviceContext,
			@PathParam("applicantcode") String applicantcode);
	
	@PUT
	@Path("/applicant/profile/update")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "update VRProductionPlant", tags={ "vrproductionplantapimodel"})
	public Response updateVRApplicantProfile(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, VRApplicantProfileApiModel model);
}

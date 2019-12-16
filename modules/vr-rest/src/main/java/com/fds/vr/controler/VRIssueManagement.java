package com.fds.vr.controler;

import com.fds.vr.model.VRIssueBeanParam;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author trungnt
 *
 */
@Path("/issue/")
public interface VRIssueManagement {
	@GET
	@Path("/count")
	@Produces(MediaType.APPLICATION_JSON)
	public Response countVRIssue(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @BeanParam VRIssueBeanParam query);
	@GET
	@Path("/search")
	@Produces(MediaType.APPLICATION_JSON)
	public Response searchVRIssue(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @BeanParam VRIssueBeanParam query);

	
}

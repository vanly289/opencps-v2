package com.fds.vr.controler;

import com.fds.vr.model.VRCOPReportRepositoryBeanParam;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author trungnt
 *
 */
public interface VRCOPManagement {
	@GET
	@Path("/cop/reportrepository/year")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findReportRepositoryYear(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @BeanParam VRCOPReportRepositoryBeanParam query);

	@GET
	@Path("/cop/reportrepository/{year}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findReportRepository(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @PathParam("year") Integer year,
			@BeanParam VRCOPReportRepositoryBeanParam query, String advancesearchParams);
}

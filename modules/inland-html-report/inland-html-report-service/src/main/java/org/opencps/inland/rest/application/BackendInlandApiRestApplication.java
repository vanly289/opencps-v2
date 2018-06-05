package org.opencps.inland.rest.application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.opencps.auth.api.BackendAuth;
import org.opencps.auth.api.BackendAuthImpl;
import org.opencps.auth.api.exception.UnauthenticationException;
import org.opencps.inland.api.inlandprinttemplate.model.ErrorMsg;
import org.opencps.inland.api.inlandprinttemplate.model.InlandPrintTemplateModel;
import org.opencps.inland.context.provider.CompanyContextProvider;
import org.opencps.inland.context.provider.LocaleContextProvider;
import org.opencps.inland.context.provider.ServiceContextProvider;
import org.opencps.inland.context.provider.UserContextProvider;
import org.opencps.inland.model.InlandPrintTemplate;
import org.opencps.inland.service.InlandPrintTemplateLocalServiceUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

@ApplicationPath("/v2/inland")
@Component(immediate = true, service = Application.class)
public class BackendInlandApiRestApplication extends Application {
	private static final Log _log = LogFactoryUtil.getLog(BackendInlandApiRestApplication.class.getName());

	public Set<Object> getSingletons() {
		Set<Object> singletons = new HashSet<Object>();
		singletons.add(this);
		
		singletons.add(_serviceContextProvider);
		singletons.add(_companyContextProvider);
		singletons.add(_localeContextProvider);
		singletons.add(_userContextProvider);
		
		return singletons;
	}
	
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response getInlandPrintTemplateDetail(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @QueryParam("serviceCode") String serviceCode,
			@QueryParam("dossierPartNo") String dossierPartNo,
			@QueryParam("fileTemplateNo") String fileTemplateNo,
			@QueryParam("templateNo") String templateNo) {
		
		BackendAuth auth = new BackendAuthImpl();

		try {
			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}
			
			_log.info("Get print template: " + user.getUserId() + "," + serviceCode + "," + templateNo + "," + dossierPartNo + "," + fileTemplateNo);
			
			InlandPrintTemplate printTemplate = null;
			printTemplate = InlandPrintTemplateLocalServiceUtil.findBySC_TN_PN_FTN(user.getUserId(), serviceCode, templateNo, dossierPartNo, fileTemplateNo);
			
			InlandPrintTemplateModel result = new InlandPrintTemplateModel();
			if (printTemplate != null) {
				result.setPrintTemplateId(printTemplate.getPrintTemplateId());
				result.setCreateDate("");
				result.setCreateUserId(user.getUserId());
				result.setDossierPartNo(dossierPartNo);
				result.setFileTemplateNo(fileTemplateNo);
				result.setTemplateNo(templateNo);
				result.setFormTemplate(printTemplate.getFormTemplate());
				result.setOriginalDocumentURL(printTemplate.getOriginalDocumentURL());
			}
			
			return Response.status(200).entity(result).build();
		} catch (Exception e) {
			ErrorMsg error = new ErrorMsg();

			error.setMessage("Content not found!");
			error.setCode(404);
			error.setDescription(e.getMessage());

			return Response.status(404).entity(error).build();
		}
		
	}
		
	@Reference
	private CompanyContextProvider _companyContextProvider;

	@Reference
	private LocaleContextProvider _localeContextProvider;

	@Reference
	private UserContextProvider _userContextProvider;

	@Reference
	private ServiceContextProvider _serviceContextProvider;
	
}

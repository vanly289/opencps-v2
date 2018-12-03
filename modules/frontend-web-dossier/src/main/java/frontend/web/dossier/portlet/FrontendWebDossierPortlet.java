package frontend.web.dossier.portlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;

import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.service.DossierLocalServiceUtil;
import org.opencps.usermgt.model.Employee;
import org.opencps.usermgt.model.EmployeeJobPos;
import org.opencps.usermgt.model.JobPos;
import org.opencps.usermgt.model.WorkingUnit;
import org.opencps.usermgt.service.EmployeeJobPosLocalServiceUtil;
import org.opencps.usermgt.service.EmployeeLocalServiceUtil;
import org.opencps.usermgt.service.JobPosLocalServiceUtil;
import org.opencps.usermgt.service.WorkingUnitLocalServiceUtil;
import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.util.bridges.freemarker.FreeMarkerPortlet;

/**
 * @author binhth
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=frontend-web-dossier Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/templates/view.ftl",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.footer-portlet-javascript=/js/main.js",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class FrontendWebDossierPortlet extends FreeMarkerPortlet {

	@Override
	public void render(
		RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {

		// TODO Auto-generated method stub
		
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		HttpServletRequest httpRequest = PortalUtil.getHttpServletRequest(renderRequest);
		
		
		String dossierId = PortalUtil.getOriginalServletRequest(httpRequest).getParameter("dossierId");
		
		try {
			Employee employee = EmployeeLocalServiceUtil.fetchByF_mappingUserId(themeDisplay.getScopeGroupId(), themeDisplay.getUserId());
			List<EmployeeJobPos> lstEmJobPos = EmployeeJobPosLocalServiceUtil.findByF_EmployeeId(employee.getEmployeeId());
			List<String> arrAgencies = new ArrayList<>();
			_log.info("------------------lstEmJobPos+++++++++++++++"+ lstEmJobPos.toString());
			for (EmployeeJobPos ejp : lstEmJobPos) {
				WorkingUnit wu = WorkingUnitLocalServiceUtil.fetchWorkingUnit(ejp.getWorkingUnitId());
				_log.info("------------------wuEm+++++++++++++++"+ wu.getGovAgencyCode());
				if (wu != null) {
//					if (agencies.toString().isEmpty()) {
//						agencies.append(wu.getGovAgencyCode());
//					}
//					else if (agencies.indexOf(wu.getGovAgencyCode()) == -1) {
//						agencies.append(",");
//						agencies.append(wu.getGovAgencyCode());
//					}
					if (arrAgencies.size() == 0) {
						arrAgencies.add(wu.getGovAgencyCode());
					} else if (!arrAgencies.contains(wu.getGovAgencyCode())) {
						arrAgencies.add(wu.getGovAgencyCode());
					}
				}
			}
			String employeeStr = JSONFactoryUtil.looseSerialize(employee);
			JSONObject employeeStrObj = JSONFactoryUtil.createJSONObject(employeeStr);
			String agencies = arrAgencies.stream().map(Object::toString).collect(Collectors.joining(","));
			if (employeeStrObj != null) {
				renderRequest.setAttribute("employee", employeeStrObj);
				renderRequest.setAttribute("agencies", agencies);
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			_log.info(e.getMessage());
		}
		
		try {
			Dossier dossier = DossierLocalServiceUtil.getDossier(Long.parseLong(dossierId));
			String dossierStr = JSONFactoryUtil.looseSerialize(dossier);
			JSONObject dossierObj = JSONFactoryUtil.createJSONObject(dossierStr);
			if (dossierObj != null) {
				renderRequest.setAttribute("dossier", dossierObj);
			}

		} catch (Exception e) {
			// TODO: handle exception
			_log.info(e.getMessage());
		}
		
		List<Role> rolesUser = RoleLocalServiceUtil.getUserRoles(themeDisplay.getUserId());
		boolean isPowerUser = false;
		_log.info("-----------------------rolesUser.toString()++++++++++++++++" + rolesUser.toString());
		for (Role role : rolesUser) {
			
		   if (role.getName().equals("Power User") || role.getName().equals("Administrator")) {
		    isPowerUser = true;
		   }
		}
		_log.info("isAdminUser============" + String.valueOf(isPowerUser));
		renderRequest.setAttribute("isAdminUser", String.valueOf(isPowerUser));
		
		String dossierPartNo = PortalUtil.getOriginalServletRequest(httpRequest).getParameter("dossierPartNo");
		String stateWindow = PortalUtil.getOriginalServletRequest(httpRequest).getParameter("stateWindow");
		
		_log.info("dossier============"+dossierId);
		_log.info("dossierPartNo============"+dossierPartNo);
		_log.info("stateWindow============"+stateWindow);
		
		
		renderRequest.setAttribute("dossierId", dossierId);
		renderRequest.setAttribute("dossierPartNo", dossierPartNo);
		renderRequest.setAttribute("stateWindow", stateWindow);
		
		super.render(renderRequest, renderResponse);
		

	}
	
	private static final Log _log = LogFactoryUtil.getLog(FrontendWebDossierPortlet.class);
	
}
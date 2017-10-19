package org.opencps.dossiermgt.action;

import java.io.InputStream;

import org.opencps.dossiermgt.model.DossierFile;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.service.ServiceContext;

public interface DossierFileActions {

	public DossierFile addDossierFile(long groupId, long dossierId, String referenceUid, String dossierTemplateNo,
			String dossierPartNo, String fileTemplateNo, String displayName, String sourceFileName, long fileSize,
			InputStream inputStream, ServiceContext serviceContext)
		throws SystemException, PortalException ;

	public DossierFile cloneDossierFile(long groupId, long dossierId, long dossierFileId, String dossierTemplateNo,
			String dossierPartNo, ServiceContext serviceContext) 
		throws SystemException, PortalException;

	public DossierFile updateDossierFile(long groupId, long dossierId, String referenceUid, String sourceFileName,
			InputStream inputStream, ServiceContext serviceContext) 
		throws SystemException, PortalException;

	public DossierFile deleteDossierFile(long groupId, long dossierId, String referenceUid, ServiceContext serviceContext) 
		throws PortalException;

	public JSONObject getDossierFiles(long groupId, String keyword, String template, Integer type, Boolean owner,
			Boolean original, int start, int end, String sort, String order, ServiceContext serviceContext);

	public DossierFile updateDossierFileFormData(long groupId, long dossierId, String referenceUid, String formData,
			ServiceContext serviceContext) throws SystemException, PortalException;
}
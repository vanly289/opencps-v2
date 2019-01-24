package org.opencps.dossiermgt.listenner;

import org.opencps.dossiermgt.model.Dossier;
import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;

@Component(immediate = true, service = ModelListener.class)
public class DossierListenner extends BaseModelListener<Dossier> {

	@Override
	public void onAfterCreate(Dossier model) throws ModelListenerException {
		
		/*
		 * 04/01/2017 ThanhNV: 
		 * add doossier log use DossierListennerUtils
		 */
		DossierListennerUltils.createDossierLog(model, false, false);
	
	}
}

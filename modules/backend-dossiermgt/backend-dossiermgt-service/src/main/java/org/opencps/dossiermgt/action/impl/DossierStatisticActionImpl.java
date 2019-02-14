package org.opencps.dossiermgt.action.impl;

import java.util.LinkedHashMap;
import java.util.List;

import org.opencps.datamgt.model.DictCollection;
import org.opencps.datamgt.model.DictItem;
import org.opencps.datamgt.service.DictCollectionLocalServiceUtil;
import org.opencps.datamgt.service.DictItemLocalServiceUtil;
import org.opencps.dossiermgt.action.DossierStatisticAction;
import org.opencps.dossiermgt.constants.DossierTerm;
import org.opencps.dossiermgt.model.DossierStatistic;
import org.opencps.dossiermgt.service.DossierLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierStatisticLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;

public class DossierStatisticActionImpl implements DossierStatisticAction {

	private Log _log = LogFactoryUtil.getLog(DossierStatisticActionImpl.class);

	@Override
	public org.opencps.dossiermgt.model.DossierStatistic insertDossierStatistic(
			org.opencps.dossiermgt.model.DossierStatistic dossierStatistic) {
		return DossierStatisticLocalServiceUtil.addDossierStatistic(dossierStatistic);
	}

	@Override
	public org.opencps.dossiermgt.model.DossierStatistic updateDossierStatistic(
			org.opencps.dossiermgt.model.DossierStatistic dossierStatistic) {
		return DossierStatisticLocalServiceUtil.updateDossierStatistic(dossierStatistic);
	}

	@Override
	public org.opencps.dossiermgt.model.DossierStatistic deleteDossierStatistic(long dossierStatisticId)
			throws PortalException {
		return DossierStatisticLocalServiceUtil.deleteDossierStatistic(dossierStatisticId);
	}

	@Override
	public DossierStatistic insertDossierStatistic(long groupId, int month, int year, int remainingCount,
			int receivedCount, int onlineCount, int undueCount, int overdueCount, int ontimeCount, int overtimeCount,
			String govAgencyCode, String govAgencyName, String domainCode, String domainName, int administrationLevel,
			boolean reporting, ServiceContext serviceContext) throws PortalException {

		return DossierStatisticLocalServiceUtil.insert(groupId, month, year, remainingCount, receivedCount, onlineCount,
				undueCount, overdueCount, ontimeCount, overtimeCount, govAgencyCode, govAgencyName, domainCode,
				domainName, administrationLevel, reporting, serviceContext);
	}

	@Override
	public JSONObject getDossierStatistic(long userId, long companyId, long groupId,
			LinkedHashMap<String, Object> params, Sort[] sorts, int start, int end, ServiceContext serviceContext) {
		JSONObject result = JSONFactoryUtil.createJSONObject();

		Hits hits = null;

		SearchContext searchContext = new SearchContext();
		searchContext.setCompanyId(companyId);

		try {

			hits = DossierStatisticLocalServiceUtil.searchLucene(params, sorts, start, end, searchContext);

			result.put("data", hits.toList());
			long total = DossierStatisticLocalServiceUtil.countLucene(params, searchContext);
			result.put("total", total);

		} catch (Exception e) {
			_log.error(e);
		}

		return result;
	}
	
	@Override
	public List<DossierStatistic> getDossierStatisticbyYear(long userId, long groupId, int year){
		return DossierStatisticLocalServiceUtil.getDossierStatisticbyYear(groupId, userId, year);
	}
	
	@Override
	public long countDossierStatistic(long companyId, long groupId,
			LinkedHashMap<String, Object> params, Sort[] sorts) {

		long total = 0;

		SearchContext searchContext = new SearchContext();

		searchContext.setCompanyId(companyId);

		try {
			String[] statusCodes = StringUtil.split(GetterUtil.getString(params.get(DossierTerm.STATUS)));

			String[] subStatusCodes = StringUtil.split(GetterUtil.getString(params.get(DossierTerm.SUBSTATUS)));

			if (subStatusCodes != null && subStatusCodes.length > 0) {
				for(String subStatusCode : subStatusCodes) {
					params.put(DossierTerm.SUBSTATUS, subStatusCode);
					
					total += DossierLocalServiceUtil.countLucene(params, searchContext);
				}

			} else if (statusCodes != null && statusCodes.length > 0) {
				for(String statusCode : statusCodes) {
					params.put(DossierTerm.STATUS, statusCode);
					
					total += DossierLocalServiceUtil.countLucene(params, searchContext);
				}

			} else {
				DictCollection dictCollection = DictCollectionLocalServiceUtil.fetchByF_dictCollectionCode("DOSSIER_STATUS",
						groupId);
				
				List<DictItem> dictItems = DictItemLocalServiceUtil
						.findByF_dictCollectionId(dictCollection.getDictCollectionId());

				for (DictItem dictItem : dictItems) {
					long count = DossierLocalServiceUtil.countLucene(params, searchContext);

					if (dictItem.getParentItemId() != 0) {
						total += count;
					}
				}
			}

		} catch (Exception e) {
			_log.error(e);
		}

		return total;
	}

}

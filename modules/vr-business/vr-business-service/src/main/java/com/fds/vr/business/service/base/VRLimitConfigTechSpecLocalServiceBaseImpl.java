/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.fds.vr.business.service.base;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.business.model.VRLimitConfigTechSpec;
import com.fds.vr.business.service.VRLimitConfigTechSpecLocalService;
import com.fds.vr.business.service.persistence.DeliverableFinder;
import com.fds.vr.business.service.persistence.DeliverablePersistence;
import com.fds.vr.business.service.persistence.DossierFilePersistence;
import com.fds.vr.business.service.persistence.DossierPersistence;
import com.fds.vr.business.service.persistence.ILCertificateFinder;
import com.fds.vr.business.service.persistence.ILCertificatePersistence;
import com.fds.vr.business.service.persistence.ILSyncDatePersistence;
import com.fds.vr.business.service.persistence.ILVehicleCustomsBorderGuardPersistence;
import com.fds.vr.business.service.persistence.ILVehiclePersistence;
import com.fds.vr.business.service.persistence.RegistrationPersistence;
import com.fds.vr.business.service.persistence.VRApplicantProfileFinder;
import com.fds.vr.business.service.persistence.VRApplicantProfileHistoryFinder;
import com.fds.vr.business.service.persistence.VRApplicantProfileHistoryPersistence;
import com.fds.vr.business.service.persistence.VRApplicantProfilePersistence;
import com.fds.vr.business.service.persistence.VRCFGStandardPersistence;
import com.fds.vr.business.service.persistence.VRCOPProdEquipmentFinder;
import com.fds.vr.business.service.persistence.VRCOPProdEquipmentPersistence;
import com.fds.vr.business.service.persistence.VRCOPProductClassificationFinder;
import com.fds.vr.business.service.persistence.VRCOPProductClassificationPersistence;
import com.fds.vr.business.service.persistence.VRCOPProductLineFinder;
import com.fds.vr.business.service.persistence.VRCOPProductLinePersistence;
import com.fds.vr.business.service.persistence.VRCOPProductTypeFinder;
import com.fds.vr.business.service.persistence.VRCOPProductTypePersistence;
import com.fds.vr.business.service.persistence.VRCOPProductionPlantEmployeeFinder;
import com.fds.vr.business.service.persistence.VRCOPProductionPlantEmployeePersistence;
import com.fds.vr.business.service.persistence.VRCOPProductionPlantEquipmentFinder;
import com.fds.vr.business.service.persistence.VRCOPProductionPlantEquipmentPersistence;
import com.fds.vr.business.service.persistence.VRCOPReportAttachFinder;
import com.fds.vr.business.service.persistence.VRCOPReportAttachPersistence;
import com.fds.vr.business.service.persistence.VRCOPReportRepositoryFinder;
import com.fds.vr.business.service.persistence.VRCOPReportRepositoryPersistence;
import com.fds.vr.business.service.persistence.VRCertificateProgressFilePersistence;
import com.fds.vr.business.service.persistence.VRCertificateProgressPersistence;
import com.fds.vr.business.service.persistence.VRClearingStampbookFinder;
import com.fds.vr.business.service.persistence.VRClearingStampbookPersistence;
import com.fds.vr.business.service.persistence.VRConfigTechSpecPersistence;
import com.fds.vr.business.service.persistence.VRCorporationInspectorFinder;
import com.fds.vr.business.service.persistence.VRCorporationInspectorPersistence;
import com.fds.vr.business.service.persistence.VRCorporationViewFinder;
import com.fds.vr.business.service.persistence.VRCorporationViewPersistence;
import com.fds.vr.business.service.persistence.VRInputSheetFinder;
import com.fds.vr.business.service.persistence.VRInputSheetPersistence;
import com.fds.vr.business.service.persistence.VRInputStampbookDetailsFinder;
import com.fds.vr.business.service.persistence.VRInputStampbookDetailsPersistence;
import com.fds.vr.business.service.persistence.VRInputStampbookFinder;
import com.fds.vr.business.service.persistence.VRInputStampbookPersistence;
import com.fds.vr.business.service.persistence.VRInspectionStandardFinder;
import com.fds.vr.business.service.persistence.VRInspectionStandardPersistence;
import com.fds.vr.business.service.persistence.VRInventoryFinder;
import com.fds.vr.business.service.persistence.VRInventoryPersistence;
import com.fds.vr.business.service.persistence.VRIssueEquipmentCertificateFinder;
import com.fds.vr.business.service.persistence.VRIssueEquipmentCertificatePersistence;
import com.fds.vr.business.service.persistence.VRIssueFinder;
import com.fds.vr.business.service.persistence.VRIssuePersistence;
import com.fds.vr.business.service.persistence.VRIssueVehiclecertificateFinder;
import com.fds.vr.business.service.persistence.VRIssueVehiclecertificatePersistence;
import com.fds.vr.business.service.persistence.VRLimitConfigTechSpecPersistence;
import com.fds.vr.business.service.persistence.VROutputSheetDetailsFinder;
import com.fds.vr.business.service.persistence.VROutputSheetDetailsPersistence;
import com.fds.vr.business.service.persistence.VROutputSheetFinder;
import com.fds.vr.business.service.persistence.VROutputSheetPersistence;
import com.fds.vr.business.service.persistence.VRProductClassificationFinder;
import com.fds.vr.business.service.persistence.VRProductClassificationPersistence;
import com.fds.vr.business.service.persistence.VRProductLinePersistence;
import com.fds.vr.business.service.persistence.VRProductTypePersistence;
import com.fds.vr.business.service.persistence.VRProductionPlantEmployeeFinder;
import com.fds.vr.business.service.persistence.VRProductionPlantEmployeePersistence;
import com.fds.vr.business.service.persistence.VRProductionPlantEquipmentFinder;
import com.fds.vr.business.service.persistence.VRProductionPlantEquipmentPersistence;
import com.fds.vr.business.service.persistence.VRProductionPlantFinder;
import com.fds.vr.business.service.persistence.VRProductionPlantPersistence;
import com.fds.vr.business.service.persistence.VRProductionPlantProdEquipmentFinder;
import com.fds.vr.business.service.persistence.VRProductionPlantProdEquipmentPersistence;
import com.fds.vr.business.service.persistence.VRRPDossierStatisticsFinder;
import com.fds.vr.business.service.persistence.VRRPDossierStatisticsPersistence;
import com.fds.vr.business.service.persistence.VRReportPersistence;
import com.fds.vr.business.service.persistence.VRSyncDatePersistence;
import com.fds.vr.business.service.persistence.VRTemplateNoPersistence;
import com.fds.vr.business.service.persistence.VRVehicleEquipmentFinder;
import com.fds.vr.business.service.persistence.VRVehicleEquipmentPersistence;
import com.fds.vr.business.service.persistence.VRVehicleRecordFinder;
import com.fds.vr.business.service.persistence.VRVehicleRecordPersistence;
import com.fds.vr.business.service.persistence.VRVehicleSpecificationPersistence;
import com.fds.vr.business.service.persistence.VRVehicleTypeCertificateFinder;
import com.fds.vr.business.service.persistence.VRVehicleTypeCertificatePersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the vr limit config tech spec local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.fds.vr.business.service.impl.VRLimitConfigTechSpecLocalServiceImpl}.
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.impl.VRLimitConfigTechSpecLocalServiceImpl
 * @see com.fds.vr.business.service.VRLimitConfigTechSpecLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class VRLimitConfigTechSpecLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements VRLimitConfigTechSpecLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.fds.vr.business.service.VRLimitConfigTechSpecLocalServiceUtil} to access the vr limit config tech spec local service.
	 */

	/**
	 * Adds the vr limit config tech spec to the database. Also notifies the appropriate model listeners.
	 *
	 * @param vrLimitConfigTechSpec the vr limit config tech spec
	 * @return the vr limit config tech spec that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public VRLimitConfigTechSpec addVRLimitConfigTechSpec(
		VRLimitConfigTechSpec vrLimitConfigTechSpec) {
		vrLimitConfigTechSpec.setNew(true);

		return vrLimitConfigTechSpecPersistence.update(vrLimitConfigTechSpec);
	}

	/**
	 * Creates a new vr limit config tech spec with the primary key. Does not add the vr limit config tech spec to the database.
	 *
	 * @param id the primary key for the new vr limit config tech spec
	 * @return the new vr limit config tech spec
	 */
	@Override
	public VRLimitConfigTechSpec createVRLimitConfigTechSpec(long id) {
		return vrLimitConfigTechSpecPersistence.create(id);
	}

	/**
	 * Deletes the vr limit config tech spec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr limit config tech spec
	 * @return the vr limit config tech spec that was removed
	 * @throws PortalException if a vr limit config tech spec with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public VRLimitConfigTechSpec deleteVRLimitConfigTechSpec(long id)
		throws PortalException {
		return vrLimitConfigTechSpecPersistence.remove(id);
	}

	/**
	 * Deletes the vr limit config tech spec from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vrLimitConfigTechSpec the vr limit config tech spec
	 * @return the vr limit config tech spec that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public VRLimitConfigTechSpec deleteVRLimitConfigTechSpec(
		VRLimitConfigTechSpec vrLimitConfigTechSpec) {
		return vrLimitConfigTechSpecPersistence.remove(vrLimitConfigTechSpec);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(VRLimitConfigTechSpec.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return vrLimitConfigTechSpecPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRLimitConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end) {
		return vrLimitConfigTechSpecPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRLimitConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator) {
		return vrLimitConfigTechSpecPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return vrLimitConfigTechSpecPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) {
		return vrLimitConfigTechSpecPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public VRLimitConfigTechSpec fetchVRLimitConfigTechSpec(long id) {
		return vrLimitConfigTechSpecPersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the vr limit config tech spec with the primary key.
	 *
	 * @param id the primary key of the vr limit config tech spec
	 * @return the vr limit config tech spec
	 * @throws PortalException if a vr limit config tech spec with the primary key could not be found
	 */
	@Override
	public VRLimitConfigTechSpec getVRLimitConfigTechSpec(long id)
		throws PortalException {
		return vrLimitConfigTechSpecPersistence.findByPrimaryKey(id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(vrLimitConfigTechSpecLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(VRLimitConfigTechSpec.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(vrLimitConfigTechSpecLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(VRLimitConfigTechSpec.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(vrLimitConfigTechSpecLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(VRLimitConfigTechSpec.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return vrLimitConfigTechSpecLocalService.deleteVRLimitConfigTechSpec((VRLimitConfigTechSpec)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return vrLimitConfigTechSpecPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the vr limit config tech specs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRLimitConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr limit config tech specs
	 * @param end the upper bound of the range of vr limit config tech specs (not inclusive)
	 * @return the range of vr limit config tech specs
	 */
	@Override
	public List<VRLimitConfigTechSpec> getVRLimitConfigTechSpecs(int start,
		int end) {
		return vrLimitConfigTechSpecPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of vr limit config tech specs.
	 *
	 * @return the number of vr limit config tech specs
	 */
	@Override
	public int getVRLimitConfigTechSpecsCount() {
		return vrLimitConfigTechSpecPersistence.countAll();
	}

	/**
	 * Updates the vr limit config tech spec in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param vrLimitConfigTechSpec the vr limit config tech spec
	 * @return the vr limit config tech spec that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public VRLimitConfigTechSpec updateVRLimitConfigTechSpec(
		VRLimitConfigTechSpec vrLimitConfigTechSpec) {
		return vrLimitConfigTechSpecPersistence.update(vrLimitConfigTechSpec);
	}

	/**
	 * Returns the deliverable local service.
	 *
	 * @return the deliverable local service
	 */
	public com.fds.vr.business.service.DeliverableLocalService getDeliverableLocalService() {
		return deliverableLocalService;
	}

	/**
	 * Sets the deliverable local service.
	 *
	 * @param deliverableLocalService the deliverable local service
	 */
	public void setDeliverableLocalService(
		com.fds.vr.business.service.DeliverableLocalService deliverableLocalService) {
		this.deliverableLocalService = deliverableLocalService;
	}

	/**
	 * Returns the deliverable persistence.
	 *
	 * @return the deliverable persistence
	 */
	public DeliverablePersistence getDeliverablePersistence() {
		return deliverablePersistence;
	}

	/**
	 * Sets the deliverable persistence.
	 *
	 * @param deliverablePersistence the deliverable persistence
	 */
	public void setDeliverablePersistence(
		DeliverablePersistence deliverablePersistence) {
		this.deliverablePersistence = deliverablePersistence;
	}

	/**
	 * Returns the deliverable finder.
	 *
	 * @return the deliverable finder
	 */
	public DeliverableFinder getDeliverableFinder() {
		return deliverableFinder;
	}

	/**
	 * Sets the deliverable finder.
	 *
	 * @param deliverableFinder the deliverable finder
	 */
	public void setDeliverableFinder(DeliverableFinder deliverableFinder) {
		this.deliverableFinder = deliverableFinder;
	}

	/**
	 * Returns the dossier local service.
	 *
	 * @return the dossier local service
	 */
	public com.fds.vr.business.service.DossierLocalService getDossierLocalService() {
		return dossierLocalService;
	}

	/**
	 * Sets the dossier local service.
	 *
	 * @param dossierLocalService the dossier local service
	 */
	public void setDossierLocalService(
		com.fds.vr.business.service.DossierLocalService dossierLocalService) {
		this.dossierLocalService = dossierLocalService;
	}

	/**
	 * Returns the dossier persistence.
	 *
	 * @return the dossier persistence
	 */
	public DossierPersistence getDossierPersistence() {
		return dossierPersistence;
	}

	/**
	 * Sets the dossier persistence.
	 *
	 * @param dossierPersistence the dossier persistence
	 */
	public void setDossierPersistence(DossierPersistence dossierPersistence) {
		this.dossierPersistence = dossierPersistence;
	}

	/**
	 * Returns the dossier file local service.
	 *
	 * @return the dossier file local service
	 */
	public com.fds.vr.business.service.DossierFileLocalService getDossierFileLocalService() {
		return dossierFileLocalService;
	}

	/**
	 * Sets the dossier file local service.
	 *
	 * @param dossierFileLocalService the dossier file local service
	 */
	public void setDossierFileLocalService(
		com.fds.vr.business.service.DossierFileLocalService dossierFileLocalService) {
		this.dossierFileLocalService = dossierFileLocalService;
	}

	/**
	 * Returns the dossier file persistence.
	 *
	 * @return the dossier file persistence
	 */
	public DossierFilePersistence getDossierFilePersistence() {
		return dossierFilePersistence;
	}

	/**
	 * Sets the dossier file persistence.
	 *
	 * @param dossierFilePersistence the dossier file persistence
	 */
	public void setDossierFilePersistence(
		DossierFilePersistence dossierFilePersistence) {
		this.dossierFilePersistence = dossierFilePersistence;
	}

	/**
	 * Returns the il certificate local service.
	 *
	 * @return the il certificate local service
	 */
	public com.fds.vr.business.service.ILCertificateLocalService getILCertificateLocalService() {
		return ilCertificateLocalService;
	}

	/**
	 * Sets the il certificate local service.
	 *
	 * @param ilCertificateLocalService the il certificate local service
	 */
	public void setILCertificateLocalService(
		com.fds.vr.business.service.ILCertificateLocalService ilCertificateLocalService) {
		this.ilCertificateLocalService = ilCertificateLocalService;
	}

	/**
	 * Returns the il certificate persistence.
	 *
	 * @return the il certificate persistence
	 */
	public ILCertificatePersistence getILCertificatePersistence() {
		return ilCertificatePersistence;
	}

	/**
	 * Sets the il certificate persistence.
	 *
	 * @param ilCertificatePersistence the il certificate persistence
	 */
	public void setILCertificatePersistence(
		ILCertificatePersistence ilCertificatePersistence) {
		this.ilCertificatePersistence = ilCertificatePersistence;
	}

	/**
	 * Returns the il certificate finder.
	 *
	 * @return the il certificate finder
	 */
	public ILCertificateFinder getILCertificateFinder() {
		return ilCertificateFinder;
	}

	/**
	 * Sets the il certificate finder.
	 *
	 * @param ilCertificateFinder the il certificate finder
	 */
	public void setILCertificateFinder(ILCertificateFinder ilCertificateFinder) {
		this.ilCertificateFinder = ilCertificateFinder;
	}

	/**
	 * Returns the il sync date local service.
	 *
	 * @return the il sync date local service
	 */
	public com.fds.vr.business.service.ILSyncDateLocalService getILSyncDateLocalService() {
		return ilSyncDateLocalService;
	}

	/**
	 * Sets the il sync date local service.
	 *
	 * @param ilSyncDateLocalService the il sync date local service
	 */
	public void setILSyncDateLocalService(
		com.fds.vr.business.service.ILSyncDateLocalService ilSyncDateLocalService) {
		this.ilSyncDateLocalService = ilSyncDateLocalService;
	}

	/**
	 * Returns the il sync date persistence.
	 *
	 * @return the il sync date persistence
	 */
	public ILSyncDatePersistence getILSyncDatePersistence() {
		return ilSyncDatePersistence;
	}

	/**
	 * Sets the il sync date persistence.
	 *
	 * @param ilSyncDatePersistence the il sync date persistence
	 */
	public void setILSyncDatePersistence(
		ILSyncDatePersistence ilSyncDatePersistence) {
		this.ilSyncDatePersistence = ilSyncDatePersistence;
	}

	/**
	 * Returns the il vehicle local service.
	 *
	 * @return the il vehicle local service
	 */
	public com.fds.vr.business.service.ILVehicleLocalService getILVehicleLocalService() {
		return ilVehicleLocalService;
	}

	/**
	 * Sets the il vehicle local service.
	 *
	 * @param ilVehicleLocalService the il vehicle local service
	 */
	public void setILVehicleLocalService(
		com.fds.vr.business.service.ILVehicleLocalService ilVehicleLocalService) {
		this.ilVehicleLocalService = ilVehicleLocalService;
	}

	/**
	 * Returns the il vehicle persistence.
	 *
	 * @return the il vehicle persistence
	 */
	public ILVehiclePersistence getILVehiclePersistence() {
		return ilVehiclePersistence;
	}

	/**
	 * Sets the il vehicle persistence.
	 *
	 * @param ilVehiclePersistence the il vehicle persistence
	 */
	public void setILVehiclePersistence(
		ILVehiclePersistence ilVehiclePersistence) {
		this.ilVehiclePersistence = ilVehiclePersistence;
	}

	/**
	 * Returns the il vehicle customs border guard local service.
	 *
	 * @return the il vehicle customs border guard local service
	 */
	public com.fds.vr.business.service.ILVehicleCustomsBorderGuardLocalService getILVehicleCustomsBorderGuardLocalService() {
		return ilVehicleCustomsBorderGuardLocalService;
	}

	/**
	 * Sets the il vehicle customs border guard local service.
	 *
	 * @param ilVehicleCustomsBorderGuardLocalService the il vehicle customs border guard local service
	 */
	public void setILVehicleCustomsBorderGuardLocalService(
		com.fds.vr.business.service.ILVehicleCustomsBorderGuardLocalService ilVehicleCustomsBorderGuardLocalService) {
		this.ilVehicleCustomsBorderGuardLocalService = ilVehicleCustomsBorderGuardLocalService;
	}

	/**
	 * Returns the il vehicle customs border guard persistence.
	 *
	 * @return the il vehicle customs border guard persistence
	 */
	public ILVehicleCustomsBorderGuardPersistence getILVehicleCustomsBorderGuardPersistence() {
		return ilVehicleCustomsBorderGuardPersistence;
	}

	/**
	 * Sets the il vehicle customs border guard persistence.
	 *
	 * @param ilVehicleCustomsBorderGuardPersistence the il vehicle customs border guard persistence
	 */
	public void setILVehicleCustomsBorderGuardPersistence(
		ILVehicleCustomsBorderGuardPersistence ilVehicleCustomsBorderGuardPersistence) {
		this.ilVehicleCustomsBorderGuardPersistence = ilVehicleCustomsBorderGuardPersistence;
	}

	/**
	 * Returns the registration local service.
	 *
	 * @return the registration local service
	 */
	public com.fds.vr.business.service.RegistrationLocalService getRegistrationLocalService() {
		return registrationLocalService;
	}

	/**
	 * Sets the registration local service.
	 *
	 * @param registrationLocalService the registration local service
	 */
	public void setRegistrationLocalService(
		com.fds.vr.business.service.RegistrationLocalService registrationLocalService) {
		this.registrationLocalService = registrationLocalService;
	}

	/**
	 * Returns the registration persistence.
	 *
	 * @return the registration persistence
	 */
	public RegistrationPersistence getRegistrationPersistence() {
		return registrationPersistence;
	}

	/**
	 * Sets the registration persistence.
	 *
	 * @param registrationPersistence the registration persistence
	 */
	public void setRegistrationPersistence(
		RegistrationPersistence registrationPersistence) {
		this.registrationPersistence = registrationPersistence;
	}

	/**
	 * Returns the vr applicant profile local service.
	 *
	 * @return the vr applicant profile local service
	 */
	public com.fds.vr.business.service.VRApplicantProfileLocalService getVRApplicantProfileLocalService() {
		return vrApplicantProfileLocalService;
	}

	/**
	 * Sets the vr applicant profile local service.
	 *
	 * @param vrApplicantProfileLocalService the vr applicant profile local service
	 */
	public void setVRApplicantProfileLocalService(
		com.fds.vr.business.service.VRApplicantProfileLocalService vrApplicantProfileLocalService) {
		this.vrApplicantProfileLocalService = vrApplicantProfileLocalService;
	}

	/**
	 * Returns the vr applicant profile persistence.
	 *
	 * @return the vr applicant profile persistence
	 */
	public VRApplicantProfilePersistence getVRApplicantProfilePersistence() {
		return vrApplicantProfilePersistence;
	}

	/**
	 * Sets the vr applicant profile persistence.
	 *
	 * @param vrApplicantProfilePersistence the vr applicant profile persistence
	 */
	public void setVRApplicantProfilePersistence(
		VRApplicantProfilePersistence vrApplicantProfilePersistence) {
		this.vrApplicantProfilePersistence = vrApplicantProfilePersistence;
	}

	/**
	 * Returns the vr applicant profile finder.
	 *
	 * @return the vr applicant profile finder
	 */
	public VRApplicantProfileFinder getVRApplicantProfileFinder() {
		return vrApplicantProfileFinder;
	}

	/**
	 * Sets the vr applicant profile finder.
	 *
	 * @param vrApplicantProfileFinder the vr applicant profile finder
	 */
	public void setVRApplicantProfileFinder(
		VRApplicantProfileFinder vrApplicantProfileFinder) {
		this.vrApplicantProfileFinder = vrApplicantProfileFinder;
	}

	/**
	 * Returns the vr applicant profile history local service.
	 *
	 * @return the vr applicant profile history local service
	 */
	public com.fds.vr.business.service.VRApplicantProfileHistoryLocalService getVRApplicantProfileHistoryLocalService() {
		return vrApplicantProfileHistoryLocalService;
	}

	/**
	 * Sets the vr applicant profile history local service.
	 *
	 * @param vrApplicantProfileHistoryLocalService the vr applicant profile history local service
	 */
	public void setVRApplicantProfileHistoryLocalService(
		com.fds.vr.business.service.VRApplicantProfileHistoryLocalService vrApplicantProfileHistoryLocalService) {
		this.vrApplicantProfileHistoryLocalService = vrApplicantProfileHistoryLocalService;
	}

	/**
	 * Returns the vr applicant profile history persistence.
	 *
	 * @return the vr applicant profile history persistence
	 */
	public VRApplicantProfileHistoryPersistence getVRApplicantProfileHistoryPersistence() {
		return vrApplicantProfileHistoryPersistence;
	}

	/**
	 * Sets the vr applicant profile history persistence.
	 *
	 * @param vrApplicantProfileHistoryPersistence the vr applicant profile history persistence
	 */
	public void setVRApplicantProfileHistoryPersistence(
		VRApplicantProfileHistoryPersistence vrApplicantProfileHistoryPersistence) {
		this.vrApplicantProfileHistoryPersistence = vrApplicantProfileHistoryPersistence;
	}

	/**
	 * Returns the vr applicant profile history finder.
	 *
	 * @return the vr applicant profile history finder
	 */
	public VRApplicantProfileHistoryFinder getVRApplicantProfileHistoryFinder() {
		return vrApplicantProfileHistoryFinder;
	}

	/**
	 * Sets the vr applicant profile history finder.
	 *
	 * @param vrApplicantProfileHistoryFinder the vr applicant profile history finder
	 */
	public void setVRApplicantProfileHistoryFinder(
		VRApplicantProfileHistoryFinder vrApplicantProfileHistoryFinder) {
		this.vrApplicantProfileHistoryFinder = vrApplicantProfileHistoryFinder;
	}

	/**
	 * Returns the vr certificate progress local service.
	 *
	 * @return the vr certificate progress local service
	 */
	public com.fds.vr.business.service.VRCertificateProgressLocalService getVRCertificateProgressLocalService() {
		return vrCertificateProgressLocalService;
	}

	/**
	 * Sets the vr certificate progress local service.
	 *
	 * @param vrCertificateProgressLocalService the vr certificate progress local service
	 */
	public void setVRCertificateProgressLocalService(
		com.fds.vr.business.service.VRCertificateProgressLocalService vrCertificateProgressLocalService) {
		this.vrCertificateProgressLocalService = vrCertificateProgressLocalService;
	}

	/**
	 * Returns the vr certificate progress persistence.
	 *
	 * @return the vr certificate progress persistence
	 */
	public VRCertificateProgressPersistence getVRCertificateProgressPersistence() {
		return vrCertificateProgressPersistence;
	}

	/**
	 * Sets the vr certificate progress persistence.
	 *
	 * @param vrCertificateProgressPersistence the vr certificate progress persistence
	 */
	public void setVRCertificateProgressPersistence(
		VRCertificateProgressPersistence vrCertificateProgressPersistence) {
		this.vrCertificateProgressPersistence = vrCertificateProgressPersistence;
	}

	/**
	 * Returns the vr certificate progress file local service.
	 *
	 * @return the vr certificate progress file local service
	 */
	public com.fds.vr.business.service.VRCertificateProgressFileLocalService getVRCertificateProgressFileLocalService() {
		return vrCertificateProgressFileLocalService;
	}

	/**
	 * Sets the vr certificate progress file local service.
	 *
	 * @param vrCertificateProgressFileLocalService the vr certificate progress file local service
	 */
	public void setVRCertificateProgressFileLocalService(
		com.fds.vr.business.service.VRCertificateProgressFileLocalService vrCertificateProgressFileLocalService) {
		this.vrCertificateProgressFileLocalService = vrCertificateProgressFileLocalService;
	}

	/**
	 * Returns the vr certificate progress file persistence.
	 *
	 * @return the vr certificate progress file persistence
	 */
	public VRCertificateProgressFilePersistence getVRCertificateProgressFilePersistence() {
		return vrCertificateProgressFilePersistence;
	}

	/**
	 * Sets the vr certificate progress file persistence.
	 *
	 * @param vrCertificateProgressFilePersistence the vr certificate progress file persistence
	 */
	public void setVRCertificateProgressFilePersistence(
		VRCertificateProgressFilePersistence vrCertificateProgressFilePersistence) {
		this.vrCertificateProgressFilePersistence = vrCertificateProgressFilePersistence;
	}

	/**
	 * Returns the vrcfg standard local service.
	 *
	 * @return the vrcfg standard local service
	 */
	public com.fds.vr.business.service.VRCFGStandardLocalService getVRCFGStandardLocalService() {
		return vrcfgStandardLocalService;
	}

	/**
	 * Sets the vrcfg standard local service.
	 *
	 * @param vrcfgStandardLocalService the vrcfg standard local service
	 */
	public void setVRCFGStandardLocalService(
		com.fds.vr.business.service.VRCFGStandardLocalService vrcfgStandardLocalService) {
		this.vrcfgStandardLocalService = vrcfgStandardLocalService;
	}

	/**
	 * Returns the vrcfg standard persistence.
	 *
	 * @return the vrcfg standard persistence
	 */
	public VRCFGStandardPersistence getVRCFGStandardPersistence() {
		return vrcfgStandardPersistence;
	}

	/**
	 * Sets the vrcfg standard persistence.
	 *
	 * @param vrcfgStandardPersistence the vrcfg standard persistence
	 */
	public void setVRCFGStandardPersistence(
		VRCFGStandardPersistence vrcfgStandardPersistence) {
		this.vrcfgStandardPersistence = vrcfgStandardPersistence;
	}

	/**
	 * Returns the vr clearing stampbook local service.
	 *
	 * @return the vr clearing stampbook local service
	 */
	public com.fds.vr.business.service.VRClearingStampbookLocalService getVRClearingStampbookLocalService() {
		return vrClearingStampbookLocalService;
	}

	/**
	 * Sets the vr clearing stampbook local service.
	 *
	 * @param vrClearingStampbookLocalService the vr clearing stampbook local service
	 */
	public void setVRClearingStampbookLocalService(
		com.fds.vr.business.service.VRClearingStampbookLocalService vrClearingStampbookLocalService) {
		this.vrClearingStampbookLocalService = vrClearingStampbookLocalService;
	}

	/**
	 * Returns the vr clearing stampbook persistence.
	 *
	 * @return the vr clearing stampbook persistence
	 */
	public VRClearingStampbookPersistence getVRClearingStampbookPersistence() {
		return vrClearingStampbookPersistence;
	}

	/**
	 * Sets the vr clearing stampbook persistence.
	 *
	 * @param vrClearingStampbookPersistence the vr clearing stampbook persistence
	 */
	public void setVRClearingStampbookPersistence(
		VRClearingStampbookPersistence vrClearingStampbookPersistence) {
		this.vrClearingStampbookPersistence = vrClearingStampbookPersistence;
	}

	/**
	 * Returns the vr clearing stampbook finder.
	 *
	 * @return the vr clearing stampbook finder
	 */
	public VRClearingStampbookFinder getVRClearingStampbookFinder() {
		return vrClearingStampbookFinder;
	}

	/**
	 * Sets the vr clearing stampbook finder.
	 *
	 * @param vrClearingStampbookFinder the vr clearing stampbook finder
	 */
	public void setVRClearingStampbookFinder(
		VRClearingStampbookFinder vrClearingStampbookFinder) {
		this.vrClearingStampbookFinder = vrClearingStampbookFinder;
	}

	/**
	 * Returns the vr config tech spec local service.
	 *
	 * @return the vr config tech spec local service
	 */
	public com.fds.vr.business.service.VRConfigTechSpecLocalService getVRConfigTechSpecLocalService() {
		return vrConfigTechSpecLocalService;
	}

	/**
	 * Sets the vr config tech spec local service.
	 *
	 * @param vrConfigTechSpecLocalService the vr config tech spec local service
	 */
	public void setVRConfigTechSpecLocalService(
		com.fds.vr.business.service.VRConfigTechSpecLocalService vrConfigTechSpecLocalService) {
		this.vrConfigTechSpecLocalService = vrConfigTechSpecLocalService;
	}

	/**
	 * Returns the vr config tech spec persistence.
	 *
	 * @return the vr config tech spec persistence
	 */
	public VRConfigTechSpecPersistence getVRConfigTechSpecPersistence() {
		return vrConfigTechSpecPersistence;
	}

	/**
	 * Sets the vr config tech spec persistence.
	 *
	 * @param vrConfigTechSpecPersistence the vr config tech spec persistence
	 */
	public void setVRConfigTechSpecPersistence(
		VRConfigTechSpecPersistence vrConfigTechSpecPersistence) {
		this.vrConfigTechSpecPersistence = vrConfigTechSpecPersistence;
	}

	/**
	 * Returns the vrcop prod equipment local service.
	 *
	 * @return the vrcop prod equipment local service
	 */
	public com.fds.vr.business.service.VRCOPProdEquipmentLocalService getVRCOPProdEquipmentLocalService() {
		return vrcopProdEquipmentLocalService;
	}

	/**
	 * Sets the vrcop prod equipment local service.
	 *
	 * @param vrcopProdEquipmentLocalService the vrcop prod equipment local service
	 */
	public void setVRCOPProdEquipmentLocalService(
		com.fds.vr.business.service.VRCOPProdEquipmentLocalService vrcopProdEquipmentLocalService) {
		this.vrcopProdEquipmentLocalService = vrcopProdEquipmentLocalService;
	}

	/**
	 * Returns the vrcop prod equipment persistence.
	 *
	 * @return the vrcop prod equipment persistence
	 */
	public VRCOPProdEquipmentPersistence getVRCOPProdEquipmentPersistence() {
		return vrcopProdEquipmentPersistence;
	}

	/**
	 * Sets the vrcop prod equipment persistence.
	 *
	 * @param vrcopProdEquipmentPersistence the vrcop prod equipment persistence
	 */
	public void setVRCOPProdEquipmentPersistence(
		VRCOPProdEquipmentPersistence vrcopProdEquipmentPersistence) {
		this.vrcopProdEquipmentPersistence = vrcopProdEquipmentPersistence;
	}

	/**
	 * Returns the vrcop prod equipment finder.
	 *
	 * @return the vrcop prod equipment finder
	 */
	public VRCOPProdEquipmentFinder getVRCOPProdEquipmentFinder() {
		return vrcopProdEquipmentFinder;
	}

	/**
	 * Sets the vrcop prod equipment finder.
	 *
	 * @param vrcopProdEquipmentFinder the vrcop prod equipment finder
	 */
	public void setVRCOPProdEquipmentFinder(
		VRCOPProdEquipmentFinder vrcopProdEquipmentFinder) {
		this.vrcopProdEquipmentFinder = vrcopProdEquipmentFinder;
	}

	/**
	 * Returns the vrcop product classification local service.
	 *
	 * @return the vrcop product classification local service
	 */
	public com.fds.vr.business.service.VRCOPProductClassificationLocalService getVRCOPProductClassificationLocalService() {
		return vrcopProductClassificationLocalService;
	}

	/**
	 * Sets the vrcop product classification local service.
	 *
	 * @param vrcopProductClassificationLocalService the vrcop product classification local service
	 */
	public void setVRCOPProductClassificationLocalService(
		com.fds.vr.business.service.VRCOPProductClassificationLocalService vrcopProductClassificationLocalService) {
		this.vrcopProductClassificationLocalService = vrcopProductClassificationLocalService;
	}

	/**
	 * Returns the vrcop product classification persistence.
	 *
	 * @return the vrcop product classification persistence
	 */
	public VRCOPProductClassificationPersistence getVRCOPProductClassificationPersistence() {
		return vrcopProductClassificationPersistence;
	}

	/**
	 * Sets the vrcop product classification persistence.
	 *
	 * @param vrcopProductClassificationPersistence the vrcop product classification persistence
	 */
	public void setVRCOPProductClassificationPersistence(
		VRCOPProductClassificationPersistence vrcopProductClassificationPersistence) {
		this.vrcopProductClassificationPersistence = vrcopProductClassificationPersistence;
	}

	/**
	 * Returns the vrcop product classification finder.
	 *
	 * @return the vrcop product classification finder
	 */
	public VRCOPProductClassificationFinder getVRCOPProductClassificationFinder() {
		return vrcopProductClassificationFinder;
	}

	/**
	 * Sets the vrcop product classification finder.
	 *
	 * @param vrcopProductClassificationFinder the vrcop product classification finder
	 */
	public void setVRCOPProductClassificationFinder(
		VRCOPProductClassificationFinder vrcopProductClassificationFinder) {
		this.vrcopProductClassificationFinder = vrcopProductClassificationFinder;
	}

	/**
	 * Returns the vrcop production plant employee local service.
	 *
	 * @return the vrcop production plant employee local service
	 */
	public com.fds.vr.business.service.VRCOPProductionPlantEmployeeLocalService getVRCOPProductionPlantEmployeeLocalService() {
		return vrcopProductionPlantEmployeeLocalService;
	}

	/**
	 * Sets the vrcop production plant employee local service.
	 *
	 * @param vrcopProductionPlantEmployeeLocalService the vrcop production plant employee local service
	 */
	public void setVRCOPProductionPlantEmployeeLocalService(
		com.fds.vr.business.service.VRCOPProductionPlantEmployeeLocalService vrcopProductionPlantEmployeeLocalService) {
		this.vrcopProductionPlantEmployeeLocalService = vrcopProductionPlantEmployeeLocalService;
	}

	/**
	 * Returns the vrcop production plant employee persistence.
	 *
	 * @return the vrcop production plant employee persistence
	 */
	public VRCOPProductionPlantEmployeePersistence getVRCOPProductionPlantEmployeePersistence() {
		return vrcopProductionPlantEmployeePersistence;
	}

	/**
	 * Sets the vrcop production plant employee persistence.
	 *
	 * @param vrcopProductionPlantEmployeePersistence the vrcop production plant employee persistence
	 */
	public void setVRCOPProductionPlantEmployeePersistence(
		VRCOPProductionPlantEmployeePersistence vrcopProductionPlantEmployeePersistence) {
		this.vrcopProductionPlantEmployeePersistence = vrcopProductionPlantEmployeePersistence;
	}

	/**
	 * Returns the vrcop production plant employee finder.
	 *
	 * @return the vrcop production plant employee finder
	 */
	public VRCOPProductionPlantEmployeeFinder getVRCOPProductionPlantEmployeeFinder() {
		return vrcopProductionPlantEmployeeFinder;
	}

	/**
	 * Sets the vrcop production plant employee finder.
	 *
	 * @param vrcopProductionPlantEmployeeFinder the vrcop production plant employee finder
	 */
	public void setVRCOPProductionPlantEmployeeFinder(
		VRCOPProductionPlantEmployeeFinder vrcopProductionPlantEmployeeFinder) {
		this.vrcopProductionPlantEmployeeFinder = vrcopProductionPlantEmployeeFinder;
	}

	/**
	 * Returns the vrcop production plant equipment local service.
	 *
	 * @return the vrcop production plant equipment local service
	 */
	public com.fds.vr.business.service.VRCOPProductionPlantEquipmentLocalService getVRCOPProductionPlantEquipmentLocalService() {
		return vrcopProductionPlantEquipmentLocalService;
	}

	/**
	 * Sets the vrcop production plant equipment local service.
	 *
	 * @param vrcopProductionPlantEquipmentLocalService the vrcop production plant equipment local service
	 */
	public void setVRCOPProductionPlantEquipmentLocalService(
		com.fds.vr.business.service.VRCOPProductionPlantEquipmentLocalService vrcopProductionPlantEquipmentLocalService) {
		this.vrcopProductionPlantEquipmentLocalService = vrcopProductionPlantEquipmentLocalService;
	}

	/**
	 * Returns the vrcop production plant equipment persistence.
	 *
	 * @return the vrcop production plant equipment persistence
	 */
	public VRCOPProductionPlantEquipmentPersistence getVRCOPProductionPlantEquipmentPersistence() {
		return vrcopProductionPlantEquipmentPersistence;
	}

	/**
	 * Sets the vrcop production plant equipment persistence.
	 *
	 * @param vrcopProductionPlantEquipmentPersistence the vrcop production plant equipment persistence
	 */
	public void setVRCOPProductionPlantEquipmentPersistence(
		VRCOPProductionPlantEquipmentPersistence vrcopProductionPlantEquipmentPersistence) {
		this.vrcopProductionPlantEquipmentPersistence = vrcopProductionPlantEquipmentPersistence;
	}

	/**
	 * Returns the vrcop production plant equipment finder.
	 *
	 * @return the vrcop production plant equipment finder
	 */
	public VRCOPProductionPlantEquipmentFinder getVRCOPProductionPlantEquipmentFinder() {
		return vrcopProductionPlantEquipmentFinder;
	}

	/**
	 * Sets the vrcop production plant equipment finder.
	 *
	 * @param vrcopProductionPlantEquipmentFinder the vrcop production plant equipment finder
	 */
	public void setVRCOPProductionPlantEquipmentFinder(
		VRCOPProductionPlantEquipmentFinder vrcopProductionPlantEquipmentFinder) {
		this.vrcopProductionPlantEquipmentFinder = vrcopProductionPlantEquipmentFinder;
	}

	/**
	 * Returns the vrcop product line local service.
	 *
	 * @return the vrcop product line local service
	 */
	public com.fds.vr.business.service.VRCOPProductLineLocalService getVRCOPProductLineLocalService() {
		return vrcopProductLineLocalService;
	}

	/**
	 * Sets the vrcop product line local service.
	 *
	 * @param vrcopProductLineLocalService the vrcop product line local service
	 */
	public void setVRCOPProductLineLocalService(
		com.fds.vr.business.service.VRCOPProductLineLocalService vrcopProductLineLocalService) {
		this.vrcopProductLineLocalService = vrcopProductLineLocalService;
	}

	/**
	 * Returns the vrcop product line persistence.
	 *
	 * @return the vrcop product line persistence
	 */
	public VRCOPProductLinePersistence getVRCOPProductLinePersistence() {
		return vrcopProductLinePersistence;
	}

	/**
	 * Sets the vrcop product line persistence.
	 *
	 * @param vrcopProductLinePersistence the vrcop product line persistence
	 */
	public void setVRCOPProductLinePersistence(
		VRCOPProductLinePersistence vrcopProductLinePersistence) {
		this.vrcopProductLinePersistence = vrcopProductLinePersistence;
	}

	/**
	 * Returns the vrcop product line finder.
	 *
	 * @return the vrcop product line finder
	 */
	public VRCOPProductLineFinder getVRCOPProductLineFinder() {
		return vrcopProductLineFinder;
	}

	/**
	 * Sets the vrcop product line finder.
	 *
	 * @param vrcopProductLineFinder the vrcop product line finder
	 */
	public void setVRCOPProductLineFinder(
		VRCOPProductLineFinder vrcopProductLineFinder) {
		this.vrcopProductLineFinder = vrcopProductLineFinder;
	}

	/**
	 * Returns the vrcop product type local service.
	 *
	 * @return the vrcop product type local service
	 */
	public com.fds.vr.business.service.VRCOPProductTypeLocalService getVRCOPProductTypeLocalService() {
		return vrcopProductTypeLocalService;
	}

	/**
	 * Sets the vrcop product type local service.
	 *
	 * @param vrcopProductTypeLocalService the vrcop product type local service
	 */
	public void setVRCOPProductTypeLocalService(
		com.fds.vr.business.service.VRCOPProductTypeLocalService vrcopProductTypeLocalService) {
		this.vrcopProductTypeLocalService = vrcopProductTypeLocalService;
	}

	/**
	 * Returns the vrcop product type persistence.
	 *
	 * @return the vrcop product type persistence
	 */
	public VRCOPProductTypePersistence getVRCOPProductTypePersistence() {
		return vrcopProductTypePersistence;
	}

	/**
	 * Sets the vrcop product type persistence.
	 *
	 * @param vrcopProductTypePersistence the vrcop product type persistence
	 */
	public void setVRCOPProductTypePersistence(
		VRCOPProductTypePersistence vrcopProductTypePersistence) {
		this.vrcopProductTypePersistence = vrcopProductTypePersistence;
	}

	/**
	 * Returns the vrcop product type finder.
	 *
	 * @return the vrcop product type finder
	 */
	public VRCOPProductTypeFinder getVRCOPProductTypeFinder() {
		return vrcopProductTypeFinder;
	}

	/**
	 * Sets the vrcop product type finder.
	 *
	 * @param vrcopProductTypeFinder the vrcop product type finder
	 */
	public void setVRCOPProductTypeFinder(
		VRCOPProductTypeFinder vrcopProductTypeFinder) {
		this.vrcopProductTypeFinder = vrcopProductTypeFinder;
	}

	/**
	 * Returns the vrcop report attach local service.
	 *
	 * @return the vrcop report attach local service
	 */
	public com.fds.vr.business.service.VRCOPReportAttachLocalService getVRCOPReportAttachLocalService() {
		return vrcopReportAttachLocalService;
	}

	/**
	 * Sets the vrcop report attach local service.
	 *
	 * @param vrcopReportAttachLocalService the vrcop report attach local service
	 */
	public void setVRCOPReportAttachLocalService(
		com.fds.vr.business.service.VRCOPReportAttachLocalService vrcopReportAttachLocalService) {
		this.vrcopReportAttachLocalService = vrcopReportAttachLocalService;
	}

	/**
	 * Returns the vrcop report attach persistence.
	 *
	 * @return the vrcop report attach persistence
	 */
	public VRCOPReportAttachPersistence getVRCOPReportAttachPersistence() {
		return vrcopReportAttachPersistence;
	}

	/**
	 * Sets the vrcop report attach persistence.
	 *
	 * @param vrcopReportAttachPersistence the vrcop report attach persistence
	 */
	public void setVRCOPReportAttachPersistence(
		VRCOPReportAttachPersistence vrcopReportAttachPersistence) {
		this.vrcopReportAttachPersistence = vrcopReportAttachPersistence;
	}

	/**
	 * Returns the vrcop report attach finder.
	 *
	 * @return the vrcop report attach finder
	 */
	public VRCOPReportAttachFinder getVRCOPReportAttachFinder() {
		return vrcopReportAttachFinder;
	}

	/**
	 * Sets the vrcop report attach finder.
	 *
	 * @param vrcopReportAttachFinder the vrcop report attach finder
	 */
	public void setVRCOPReportAttachFinder(
		VRCOPReportAttachFinder vrcopReportAttachFinder) {
		this.vrcopReportAttachFinder = vrcopReportAttachFinder;
	}

	/**
	 * Returns the vrcop report repository local service.
	 *
	 * @return the vrcop report repository local service
	 */
	public com.fds.vr.business.service.VRCOPReportRepositoryLocalService getVRCOPReportRepositoryLocalService() {
		return vrcopReportRepositoryLocalService;
	}

	/**
	 * Sets the vrcop report repository local service.
	 *
	 * @param vrcopReportRepositoryLocalService the vrcop report repository local service
	 */
	public void setVRCOPReportRepositoryLocalService(
		com.fds.vr.business.service.VRCOPReportRepositoryLocalService vrcopReportRepositoryLocalService) {
		this.vrcopReportRepositoryLocalService = vrcopReportRepositoryLocalService;
	}

	/**
	 * Returns the vrcop report repository persistence.
	 *
	 * @return the vrcop report repository persistence
	 */
	public VRCOPReportRepositoryPersistence getVRCOPReportRepositoryPersistence() {
		return vrcopReportRepositoryPersistence;
	}

	/**
	 * Sets the vrcop report repository persistence.
	 *
	 * @param vrcopReportRepositoryPersistence the vrcop report repository persistence
	 */
	public void setVRCOPReportRepositoryPersistence(
		VRCOPReportRepositoryPersistence vrcopReportRepositoryPersistence) {
		this.vrcopReportRepositoryPersistence = vrcopReportRepositoryPersistence;
	}

	/**
	 * Returns the vrcop report repository finder.
	 *
	 * @return the vrcop report repository finder
	 */
	public VRCOPReportRepositoryFinder getVRCOPReportRepositoryFinder() {
		return vrcopReportRepositoryFinder;
	}

	/**
	 * Sets the vrcop report repository finder.
	 *
	 * @param vrcopReportRepositoryFinder the vrcop report repository finder
	 */
	public void setVRCOPReportRepositoryFinder(
		VRCOPReportRepositoryFinder vrcopReportRepositoryFinder) {
		this.vrcopReportRepositoryFinder = vrcopReportRepositoryFinder;
	}

	/**
	 * Returns the vr corporation inspector local service.
	 *
	 * @return the vr corporation inspector local service
	 */
	public com.fds.vr.business.service.VRCorporationInspectorLocalService getVRCorporationInspectorLocalService() {
		return vrCorporationInspectorLocalService;
	}

	/**
	 * Sets the vr corporation inspector local service.
	 *
	 * @param vrCorporationInspectorLocalService the vr corporation inspector local service
	 */
	public void setVRCorporationInspectorLocalService(
		com.fds.vr.business.service.VRCorporationInspectorLocalService vrCorporationInspectorLocalService) {
		this.vrCorporationInspectorLocalService = vrCorporationInspectorLocalService;
	}

	/**
	 * Returns the vr corporation inspector persistence.
	 *
	 * @return the vr corporation inspector persistence
	 */
	public VRCorporationInspectorPersistence getVRCorporationInspectorPersistence() {
		return vrCorporationInspectorPersistence;
	}

	/**
	 * Sets the vr corporation inspector persistence.
	 *
	 * @param vrCorporationInspectorPersistence the vr corporation inspector persistence
	 */
	public void setVRCorporationInspectorPersistence(
		VRCorporationInspectorPersistence vrCorporationInspectorPersistence) {
		this.vrCorporationInspectorPersistence = vrCorporationInspectorPersistence;
	}

	/**
	 * Returns the vr corporation inspector finder.
	 *
	 * @return the vr corporation inspector finder
	 */
	public VRCorporationInspectorFinder getVRCorporationInspectorFinder() {
		return vrCorporationInspectorFinder;
	}

	/**
	 * Sets the vr corporation inspector finder.
	 *
	 * @param vrCorporationInspectorFinder the vr corporation inspector finder
	 */
	public void setVRCorporationInspectorFinder(
		VRCorporationInspectorFinder vrCorporationInspectorFinder) {
		this.vrCorporationInspectorFinder = vrCorporationInspectorFinder;
	}

	/**
	 * Returns the vr corporation view local service.
	 *
	 * @return the vr corporation view local service
	 */
	public com.fds.vr.business.service.VRCorporationViewLocalService getVRCorporationViewLocalService() {
		return vrCorporationViewLocalService;
	}

	/**
	 * Sets the vr corporation view local service.
	 *
	 * @param vrCorporationViewLocalService the vr corporation view local service
	 */
	public void setVRCorporationViewLocalService(
		com.fds.vr.business.service.VRCorporationViewLocalService vrCorporationViewLocalService) {
		this.vrCorporationViewLocalService = vrCorporationViewLocalService;
	}

	/**
	 * Returns the vr corporation view persistence.
	 *
	 * @return the vr corporation view persistence
	 */
	public VRCorporationViewPersistence getVRCorporationViewPersistence() {
		return vrCorporationViewPersistence;
	}

	/**
	 * Sets the vr corporation view persistence.
	 *
	 * @param vrCorporationViewPersistence the vr corporation view persistence
	 */
	public void setVRCorporationViewPersistence(
		VRCorporationViewPersistence vrCorporationViewPersistence) {
		this.vrCorporationViewPersistence = vrCorporationViewPersistence;
	}

	/**
	 * Returns the vr corporation view finder.
	 *
	 * @return the vr corporation view finder
	 */
	public VRCorporationViewFinder getVRCorporationViewFinder() {
		return vrCorporationViewFinder;
	}

	/**
	 * Sets the vr corporation view finder.
	 *
	 * @param vrCorporationViewFinder the vr corporation view finder
	 */
	public void setVRCorporationViewFinder(
		VRCorporationViewFinder vrCorporationViewFinder) {
		this.vrCorporationViewFinder = vrCorporationViewFinder;
	}

	/**
	 * Returns the vr input sheet local service.
	 *
	 * @return the vr input sheet local service
	 */
	public com.fds.vr.business.service.VRInputSheetLocalService getVRInputSheetLocalService() {
		return vrInputSheetLocalService;
	}

	/**
	 * Sets the vr input sheet local service.
	 *
	 * @param vrInputSheetLocalService the vr input sheet local service
	 */
	public void setVRInputSheetLocalService(
		com.fds.vr.business.service.VRInputSheetLocalService vrInputSheetLocalService) {
		this.vrInputSheetLocalService = vrInputSheetLocalService;
	}

	/**
	 * Returns the vr input sheet persistence.
	 *
	 * @return the vr input sheet persistence
	 */
	public VRInputSheetPersistence getVRInputSheetPersistence() {
		return vrInputSheetPersistence;
	}

	/**
	 * Sets the vr input sheet persistence.
	 *
	 * @param vrInputSheetPersistence the vr input sheet persistence
	 */
	public void setVRInputSheetPersistence(
		VRInputSheetPersistence vrInputSheetPersistence) {
		this.vrInputSheetPersistence = vrInputSheetPersistence;
	}

	/**
	 * Returns the vr input sheet finder.
	 *
	 * @return the vr input sheet finder
	 */
	public VRInputSheetFinder getVRInputSheetFinder() {
		return vrInputSheetFinder;
	}

	/**
	 * Sets the vr input sheet finder.
	 *
	 * @param vrInputSheetFinder the vr input sheet finder
	 */
	public void setVRInputSheetFinder(VRInputSheetFinder vrInputSheetFinder) {
		this.vrInputSheetFinder = vrInputSheetFinder;
	}

	/**
	 * Returns the vr input stampbook local service.
	 *
	 * @return the vr input stampbook local service
	 */
	public com.fds.vr.business.service.VRInputStampbookLocalService getVRInputStampbookLocalService() {
		return vrInputStampbookLocalService;
	}

	/**
	 * Sets the vr input stampbook local service.
	 *
	 * @param vrInputStampbookLocalService the vr input stampbook local service
	 */
	public void setVRInputStampbookLocalService(
		com.fds.vr.business.service.VRInputStampbookLocalService vrInputStampbookLocalService) {
		this.vrInputStampbookLocalService = vrInputStampbookLocalService;
	}

	/**
	 * Returns the vr input stampbook persistence.
	 *
	 * @return the vr input stampbook persistence
	 */
	public VRInputStampbookPersistence getVRInputStampbookPersistence() {
		return vrInputStampbookPersistence;
	}

	/**
	 * Sets the vr input stampbook persistence.
	 *
	 * @param vrInputStampbookPersistence the vr input stampbook persistence
	 */
	public void setVRInputStampbookPersistence(
		VRInputStampbookPersistence vrInputStampbookPersistence) {
		this.vrInputStampbookPersistence = vrInputStampbookPersistence;
	}

	/**
	 * Returns the vr input stampbook finder.
	 *
	 * @return the vr input stampbook finder
	 */
	public VRInputStampbookFinder getVRInputStampbookFinder() {
		return vrInputStampbookFinder;
	}

	/**
	 * Sets the vr input stampbook finder.
	 *
	 * @param vrInputStampbookFinder the vr input stampbook finder
	 */
	public void setVRInputStampbookFinder(
		VRInputStampbookFinder vrInputStampbookFinder) {
		this.vrInputStampbookFinder = vrInputStampbookFinder;
	}

	/**
	 * Returns the vr input stampbook details local service.
	 *
	 * @return the vr input stampbook details local service
	 */
	public com.fds.vr.business.service.VRInputStampbookDetailsLocalService getVRInputStampbookDetailsLocalService() {
		return vrInputStampbookDetailsLocalService;
	}

	/**
	 * Sets the vr input stampbook details local service.
	 *
	 * @param vrInputStampbookDetailsLocalService the vr input stampbook details local service
	 */
	public void setVRInputStampbookDetailsLocalService(
		com.fds.vr.business.service.VRInputStampbookDetailsLocalService vrInputStampbookDetailsLocalService) {
		this.vrInputStampbookDetailsLocalService = vrInputStampbookDetailsLocalService;
	}

	/**
	 * Returns the vr input stampbook details persistence.
	 *
	 * @return the vr input stampbook details persistence
	 */
	public VRInputStampbookDetailsPersistence getVRInputStampbookDetailsPersistence() {
		return vrInputStampbookDetailsPersistence;
	}

	/**
	 * Sets the vr input stampbook details persistence.
	 *
	 * @param vrInputStampbookDetailsPersistence the vr input stampbook details persistence
	 */
	public void setVRInputStampbookDetailsPersistence(
		VRInputStampbookDetailsPersistence vrInputStampbookDetailsPersistence) {
		this.vrInputStampbookDetailsPersistence = vrInputStampbookDetailsPersistence;
	}

	/**
	 * Returns the vr input stampbook details finder.
	 *
	 * @return the vr input stampbook details finder
	 */
	public VRInputStampbookDetailsFinder getVRInputStampbookDetailsFinder() {
		return vrInputStampbookDetailsFinder;
	}

	/**
	 * Sets the vr input stampbook details finder.
	 *
	 * @param vrInputStampbookDetailsFinder the vr input stampbook details finder
	 */
	public void setVRInputStampbookDetailsFinder(
		VRInputStampbookDetailsFinder vrInputStampbookDetailsFinder) {
		this.vrInputStampbookDetailsFinder = vrInputStampbookDetailsFinder;
	}

	/**
	 * Returns the vr inspection standard local service.
	 *
	 * @return the vr inspection standard local service
	 */
	public com.fds.vr.business.service.VRInspectionStandardLocalService getVRInspectionStandardLocalService() {
		return vrInspectionStandardLocalService;
	}

	/**
	 * Sets the vr inspection standard local service.
	 *
	 * @param vrInspectionStandardLocalService the vr inspection standard local service
	 */
	public void setVRInspectionStandardLocalService(
		com.fds.vr.business.service.VRInspectionStandardLocalService vrInspectionStandardLocalService) {
		this.vrInspectionStandardLocalService = vrInspectionStandardLocalService;
	}

	/**
	 * Returns the vr inspection standard persistence.
	 *
	 * @return the vr inspection standard persistence
	 */
	public VRInspectionStandardPersistence getVRInspectionStandardPersistence() {
		return vrInspectionStandardPersistence;
	}

	/**
	 * Sets the vr inspection standard persistence.
	 *
	 * @param vrInspectionStandardPersistence the vr inspection standard persistence
	 */
	public void setVRInspectionStandardPersistence(
		VRInspectionStandardPersistence vrInspectionStandardPersistence) {
		this.vrInspectionStandardPersistence = vrInspectionStandardPersistence;
	}

	/**
	 * Returns the vr inspection standard finder.
	 *
	 * @return the vr inspection standard finder
	 */
	public VRInspectionStandardFinder getVRInspectionStandardFinder() {
		return vrInspectionStandardFinder;
	}

	/**
	 * Sets the vr inspection standard finder.
	 *
	 * @param vrInspectionStandardFinder the vr inspection standard finder
	 */
	public void setVRInspectionStandardFinder(
		VRInspectionStandardFinder vrInspectionStandardFinder) {
		this.vrInspectionStandardFinder = vrInspectionStandardFinder;
	}

	/**
	 * Returns the vr inventory local service.
	 *
	 * @return the vr inventory local service
	 */
	public com.fds.vr.business.service.VRInventoryLocalService getVRInventoryLocalService() {
		return vrInventoryLocalService;
	}

	/**
	 * Sets the vr inventory local service.
	 *
	 * @param vrInventoryLocalService the vr inventory local service
	 */
	public void setVRInventoryLocalService(
		com.fds.vr.business.service.VRInventoryLocalService vrInventoryLocalService) {
		this.vrInventoryLocalService = vrInventoryLocalService;
	}

	/**
	 * Returns the vr inventory persistence.
	 *
	 * @return the vr inventory persistence
	 */
	public VRInventoryPersistence getVRInventoryPersistence() {
		return vrInventoryPersistence;
	}

	/**
	 * Sets the vr inventory persistence.
	 *
	 * @param vrInventoryPersistence the vr inventory persistence
	 */
	public void setVRInventoryPersistence(
		VRInventoryPersistence vrInventoryPersistence) {
		this.vrInventoryPersistence = vrInventoryPersistence;
	}

	/**
	 * Returns the vr inventory finder.
	 *
	 * @return the vr inventory finder
	 */
	public VRInventoryFinder getVRInventoryFinder() {
		return vrInventoryFinder;
	}

	/**
	 * Sets the vr inventory finder.
	 *
	 * @param vrInventoryFinder the vr inventory finder
	 */
	public void setVRInventoryFinder(VRInventoryFinder vrInventoryFinder) {
		this.vrInventoryFinder = vrInventoryFinder;
	}

	/**
	 * Returns the vr issue local service.
	 *
	 * @return the vr issue local service
	 */
	public com.fds.vr.business.service.VRIssueLocalService getVRIssueLocalService() {
		return vrIssueLocalService;
	}

	/**
	 * Sets the vr issue local service.
	 *
	 * @param vrIssueLocalService the vr issue local service
	 */
	public void setVRIssueLocalService(
		com.fds.vr.business.service.VRIssueLocalService vrIssueLocalService) {
		this.vrIssueLocalService = vrIssueLocalService;
	}

	/**
	 * Returns the vr issue persistence.
	 *
	 * @return the vr issue persistence
	 */
	public VRIssuePersistence getVRIssuePersistence() {
		return vrIssuePersistence;
	}

	/**
	 * Sets the vr issue persistence.
	 *
	 * @param vrIssuePersistence the vr issue persistence
	 */
	public void setVRIssuePersistence(VRIssuePersistence vrIssuePersistence) {
		this.vrIssuePersistence = vrIssuePersistence;
	}

	/**
	 * Returns the vr issue finder.
	 *
	 * @return the vr issue finder
	 */
	public VRIssueFinder getVRIssueFinder() {
		return vrIssueFinder;
	}

	/**
	 * Sets the vr issue finder.
	 *
	 * @param vrIssueFinder the vr issue finder
	 */
	public void setVRIssueFinder(VRIssueFinder vrIssueFinder) {
		this.vrIssueFinder = vrIssueFinder;
	}

	/**
	 * Returns the vr issue equipment certificate local service.
	 *
	 * @return the vr issue equipment certificate local service
	 */
	public com.fds.vr.business.service.VRIssueEquipmentCertificateLocalService getVRIssueEquipmentCertificateLocalService() {
		return vrIssueEquipmentCertificateLocalService;
	}

	/**
	 * Sets the vr issue equipment certificate local service.
	 *
	 * @param vrIssueEquipmentCertificateLocalService the vr issue equipment certificate local service
	 */
	public void setVRIssueEquipmentCertificateLocalService(
		com.fds.vr.business.service.VRIssueEquipmentCertificateLocalService vrIssueEquipmentCertificateLocalService) {
		this.vrIssueEquipmentCertificateLocalService = vrIssueEquipmentCertificateLocalService;
	}

	/**
	 * Returns the vr issue equipment certificate persistence.
	 *
	 * @return the vr issue equipment certificate persistence
	 */
	public VRIssueEquipmentCertificatePersistence getVRIssueEquipmentCertificatePersistence() {
		return vrIssueEquipmentCertificatePersistence;
	}

	/**
	 * Sets the vr issue equipment certificate persistence.
	 *
	 * @param vrIssueEquipmentCertificatePersistence the vr issue equipment certificate persistence
	 */
	public void setVRIssueEquipmentCertificatePersistence(
		VRIssueEquipmentCertificatePersistence vrIssueEquipmentCertificatePersistence) {
		this.vrIssueEquipmentCertificatePersistence = vrIssueEquipmentCertificatePersistence;
	}

	/**
	 * Returns the vr issue equipment certificate finder.
	 *
	 * @return the vr issue equipment certificate finder
	 */
	public VRIssueEquipmentCertificateFinder getVRIssueEquipmentCertificateFinder() {
		return vrIssueEquipmentCertificateFinder;
	}

	/**
	 * Sets the vr issue equipment certificate finder.
	 *
	 * @param vrIssueEquipmentCertificateFinder the vr issue equipment certificate finder
	 */
	public void setVRIssueEquipmentCertificateFinder(
		VRIssueEquipmentCertificateFinder vrIssueEquipmentCertificateFinder) {
		this.vrIssueEquipmentCertificateFinder = vrIssueEquipmentCertificateFinder;
	}

	/**
	 * Returns the vr issue vehiclecertificate local service.
	 *
	 * @return the vr issue vehiclecertificate local service
	 */
	public com.fds.vr.business.service.VRIssueVehiclecertificateLocalService getVRIssueVehiclecertificateLocalService() {
		return vrIssueVehiclecertificateLocalService;
	}

	/**
	 * Sets the vr issue vehiclecertificate local service.
	 *
	 * @param vrIssueVehiclecertificateLocalService the vr issue vehiclecertificate local service
	 */
	public void setVRIssueVehiclecertificateLocalService(
		com.fds.vr.business.service.VRIssueVehiclecertificateLocalService vrIssueVehiclecertificateLocalService) {
		this.vrIssueVehiclecertificateLocalService = vrIssueVehiclecertificateLocalService;
	}

	/**
	 * Returns the vr issue vehiclecertificate persistence.
	 *
	 * @return the vr issue vehiclecertificate persistence
	 */
	public VRIssueVehiclecertificatePersistence getVRIssueVehiclecertificatePersistence() {
		return vrIssueVehiclecertificatePersistence;
	}

	/**
	 * Sets the vr issue vehiclecertificate persistence.
	 *
	 * @param vrIssueVehiclecertificatePersistence the vr issue vehiclecertificate persistence
	 */
	public void setVRIssueVehiclecertificatePersistence(
		VRIssueVehiclecertificatePersistence vrIssueVehiclecertificatePersistence) {
		this.vrIssueVehiclecertificatePersistence = vrIssueVehiclecertificatePersistence;
	}

	/**
	 * Returns the vr issue vehiclecertificate finder.
	 *
	 * @return the vr issue vehiclecertificate finder
	 */
	public VRIssueVehiclecertificateFinder getVRIssueVehiclecertificateFinder() {
		return vrIssueVehiclecertificateFinder;
	}

	/**
	 * Sets the vr issue vehiclecertificate finder.
	 *
	 * @param vrIssueVehiclecertificateFinder the vr issue vehiclecertificate finder
	 */
	public void setVRIssueVehiclecertificateFinder(
		VRIssueVehiclecertificateFinder vrIssueVehiclecertificateFinder) {
		this.vrIssueVehiclecertificateFinder = vrIssueVehiclecertificateFinder;
	}

	/**
	 * Returns the vr limit config tech spec local service.
	 *
	 * @return the vr limit config tech spec local service
	 */
	public VRLimitConfigTechSpecLocalService getVRLimitConfigTechSpecLocalService() {
		return vrLimitConfigTechSpecLocalService;
	}

	/**
	 * Sets the vr limit config tech spec local service.
	 *
	 * @param vrLimitConfigTechSpecLocalService the vr limit config tech spec local service
	 */
	public void setVRLimitConfigTechSpecLocalService(
		VRLimitConfigTechSpecLocalService vrLimitConfigTechSpecLocalService) {
		this.vrLimitConfigTechSpecLocalService = vrLimitConfigTechSpecLocalService;
	}

	/**
	 * Returns the vr limit config tech spec persistence.
	 *
	 * @return the vr limit config tech spec persistence
	 */
	public VRLimitConfigTechSpecPersistence getVRLimitConfigTechSpecPersistence() {
		return vrLimitConfigTechSpecPersistence;
	}

	/**
	 * Sets the vr limit config tech spec persistence.
	 *
	 * @param vrLimitConfigTechSpecPersistence the vr limit config tech spec persistence
	 */
	public void setVRLimitConfigTechSpecPersistence(
		VRLimitConfigTechSpecPersistence vrLimitConfigTechSpecPersistence) {
		this.vrLimitConfigTechSpecPersistence = vrLimitConfigTechSpecPersistence;
	}

	/**
	 * Returns the vr output sheet local service.
	 *
	 * @return the vr output sheet local service
	 */
	public com.fds.vr.business.service.VROutputSheetLocalService getVROutputSheetLocalService() {
		return vrOutputSheetLocalService;
	}

	/**
	 * Sets the vr output sheet local service.
	 *
	 * @param vrOutputSheetLocalService the vr output sheet local service
	 */
	public void setVROutputSheetLocalService(
		com.fds.vr.business.service.VROutputSheetLocalService vrOutputSheetLocalService) {
		this.vrOutputSheetLocalService = vrOutputSheetLocalService;
	}

	/**
	 * Returns the vr output sheet persistence.
	 *
	 * @return the vr output sheet persistence
	 */
	public VROutputSheetPersistence getVROutputSheetPersistence() {
		return vrOutputSheetPersistence;
	}

	/**
	 * Sets the vr output sheet persistence.
	 *
	 * @param vrOutputSheetPersistence the vr output sheet persistence
	 */
	public void setVROutputSheetPersistence(
		VROutputSheetPersistence vrOutputSheetPersistence) {
		this.vrOutputSheetPersistence = vrOutputSheetPersistence;
	}

	/**
	 * Returns the vr output sheet finder.
	 *
	 * @return the vr output sheet finder
	 */
	public VROutputSheetFinder getVROutputSheetFinder() {
		return vrOutputSheetFinder;
	}

	/**
	 * Sets the vr output sheet finder.
	 *
	 * @param vrOutputSheetFinder the vr output sheet finder
	 */
	public void setVROutputSheetFinder(VROutputSheetFinder vrOutputSheetFinder) {
		this.vrOutputSheetFinder = vrOutputSheetFinder;
	}

	/**
	 * Returns the vr output sheet details local service.
	 *
	 * @return the vr output sheet details local service
	 */
	public com.fds.vr.business.service.VROutputSheetDetailsLocalService getVROutputSheetDetailsLocalService() {
		return vrOutputSheetDetailsLocalService;
	}

	/**
	 * Sets the vr output sheet details local service.
	 *
	 * @param vrOutputSheetDetailsLocalService the vr output sheet details local service
	 */
	public void setVROutputSheetDetailsLocalService(
		com.fds.vr.business.service.VROutputSheetDetailsLocalService vrOutputSheetDetailsLocalService) {
		this.vrOutputSheetDetailsLocalService = vrOutputSheetDetailsLocalService;
	}

	/**
	 * Returns the vr output sheet details persistence.
	 *
	 * @return the vr output sheet details persistence
	 */
	public VROutputSheetDetailsPersistence getVROutputSheetDetailsPersistence() {
		return vrOutputSheetDetailsPersistence;
	}

	/**
	 * Sets the vr output sheet details persistence.
	 *
	 * @param vrOutputSheetDetailsPersistence the vr output sheet details persistence
	 */
	public void setVROutputSheetDetailsPersistence(
		VROutputSheetDetailsPersistence vrOutputSheetDetailsPersistence) {
		this.vrOutputSheetDetailsPersistence = vrOutputSheetDetailsPersistence;
	}

	/**
	 * Returns the vr output sheet details finder.
	 *
	 * @return the vr output sheet details finder
	 */
	public VROutputSheetDetailsFinder getVROutputSheetDetailsFinder() {
		return vrOutputSheetDetailsFinder;
	}

	/**
	 * Sets the vr output sheet details finder.
	 *
	 * @param vrOutputSheetDetailsFinder the vr output sheet details finder
	 */
	public void setVROutputSheetDetailsFinder(
		VROutputSheetDetailsFinder vrOutputSheetDetailsFinder) {
		this.vrOutputSheetDetailsFinder = vrOutputSheetDetailsFinder;
	}

	/**
	 * Returns the vr product classification local service.
	 *
	 * @return the vr product classification local service
	 */
	public com.fds.vr.business.service.VRProductClassificationLocalService getVRProductClassificationLocalService() {
		return vrProductClassificationLocalService;
	}

	/**
	 * Sets the vr product classification local service.
	 *
	 * @param vrProductClassificationLocalService the vr product classification local service
	 */
	public void setVRProductClassificationLocalService(
		com.fds.vr.business.service.VRProductClassificationLocalService vrProductClassificationLocalService) {
		this.vrProductClassificationLocalService = vrProductClassificationLocalService;
	}

	/**
	 * Returns the vr product classification persistence.
	 *
	 * @return the vr product classification persistence
	 */
	public VRProductClassificationPersistence getVRProductClassificationPersistence() {
		return vrProductClassificationPersistence;
	}

	/**
	 * Sets the vr product classification persistence.
	 *
	 * @param vrProductClassificationPersistence the vr product classification persistence
	 */
	public void setVRProductClassificationPersistence(
		VRProductClassificationPersistence vrProductClassificationPersistence) {
		this.vrProductClassificationPersistence = vrProductClassificationPersistence;
	}

	/**
	 * Returns the vr product classification finder.
	 *
	 * @return the vr product classification finder
	 */
	public VRProductClassificationFinder getVRProductClassificationFinder() {
		return vrProductClassificationFinder;
	}

	/**
	 * Sets the vr product classification finder.
	 *
	 * @param vrProductClassificationFinder the vr product classification finder
	 */
	public void setVRProductClassificationFinder(
		VRProductClassificationFinder vrProductClassificationFinder) {
		this.vrProductClassificationFinder = vrProductClassificationFinder;
	}

	/**
	 * Returns the vr production plant local service.
	 *
	 * @return the vr production plant local service
	 */
	public com.fds.vr.business.service.VRProductionPlantLocalService getVRProductionPlantLocalService() {
		return vrProductionPlantLocalService;
	}

	/**
	 * Sets the vr production plant local service.
	 *
	 * @param vrProductionPlantLocalService the vr production plant local service
	 */
	public void setVRProductionPlantLocalService(
		com.fds.vr.business.service.VRProductionPlantLocalService vrProductionPlantLocalService) {
		this.vrProductionPlantLocalService = vrProductionPlantLocalService;
	}

	/**
	 * Returns the vr production plant persistence.
	 *
	 * @return the vr production plant persistence
	 */
	public VRProductionPlantPersistence getVRProductionPlantPersistence() {
		return vrProductionPlantPersistence;
	}

	/**
	 * Sets the vr production plant persistence.
	 *
	 * @param vrProductionPlantPersistence the vr production plant persistence
	 */
	public void setVRProductionPlantPersistence(
		VRProductionPlantPersistence vrProductionPlantPersistence) {
		this.vrProductionPlantPersistence = vrProductionPlantPersistence;
	}

	/**
	 * Returns the vr production plant finder.
	 *
	 * @return the vr production plant finder
	 */
	public VRProductionPlantFinder getVRProductionPlantFinder() {
		return vrProductionPlantFinder;
	}

	/**
	 * Sets the vr production plant finder.
	 *
	 * @param vrProductionPlantFinder the vr production plant finder
	 */
	public void setVRProductionPlantFinder(
		VRProductionPlantFinder vrProductionPlantFinder) {
		this.vrProductionPlantFinder = vrProductionPlantFinder;
	}

	/**
	 * Returns the vr production plant employee local service.
	 *
	 * @return the vr production plant employee local service
	 */
	public com.fds.vr.business.service.VRProductionPlantEmployeeLocalService getVRProductionPlantEmployeeLocalService() {
		return vrProductionPlantEmployeeLocalService;
	}

	/**
	 * Sets the vr production plant employee local service.
	 *
	 * @param vrProductionPlantEmployeeLocalService the vr production plant employee local service
	 */
	public void setVRProductionPlantEmployeeLocalService(
		com.fds.vr.business.service.VRProductionPlantEmployeeLocalService vrProductionPlantEmployeeLocalService) {
		this.vrProductionPlantEmployeeLocalService = vrProductionPlantEmployeeLocalService;
	}

	/**
	 * Returns the vr production plant employee persistence.
	 *
	 * @return the vr production plant employee persistence
	 */
	public VRProductionPlantEmployeePersistence getVRProductionPlantEmployeePersistence() {
		return vrProductionPlantEmployeePersistence;
	}

	/**
	 * Sets the vr production plant employee persistence.
	 *
	 * @param vrProductionPlantEmployeePersistence the vr production plant employee persistence
	 */
	public void setVRProductionPlantEmployeePersistence(
		VRProductionPlantEmployeePersistence vrProductionPlantEmployeePersistence) {
		this.vrProductionPlantEmployeePersistence = vrProductionPlantEmployeePersistence;
	}

	/**
	 * Returns the vr production plant employee finder.
	 *
	 * @return the vr production plant employee finder
	 */
	public VRProductionPlantEmployeeFinder getVRProductionPlantEmployeeFinder() {
		return vrProductionPlantEmployeeFinder;
	}

	/**
	 * Sets the vr production plant employee finder.
	 *
	 * @param vrProductionPlantEmployeeFinder the vr production plant employee finder
	 */
	public void setVRProductionPlantEmployeeFinder(
		VRProductionPlantEmployeeFinder vrProductionPlantEmployeeFinder) {
		this.vrProductionPlantEmployeeFinder = vrProductionPlantEmployeeFinder;
	}

	/**
	 * Returns the vr production plant equipment local service.
	 *
	 * @return the vr production plant equipment local service
	 */
	public com.fds.vr.business.service.VRProductionPlantEquipmentLocalService getVRProductionPlantEquipmentLocalService() {
		return vrProductionPlantEquipmentLocalService;
	}

	/**
	 * Sets the vr production plant equipment local service.
	 *
	 * @param vrProductionPlantEquipmentLocalService the vr production plant equipment local service
	 */
	public void setVRProductionPlantEquipmentLocalService(
		com.fds.vr.business.service.VRProductionPlantEquipmentLocalService vrProductionPlantEquipmentLocalService) {
		this.vrProductionPlantEquipmentLocalService = vrProductionPlantEquipmentLocalService;
	}

	/**
	 * Returns the vr production plant equipment persistence.
	 *
	 * @return the vr production plant equipment persistence
	 */
	public VRProductionPlantEquipmentPersistence getVRProductionPlantEquipmentPersistence() {
		return vrProductionPlantEquipmentPersistence;
	}

	/**
	 * Sets the vr production plant equipment persistence.
	 *
	 * @param vrProductionPlantEquipmentPersistence the vr production plant equipment persistence
	 */
	public void setVRProductionPlantEquipmentPersistence(
		VRProductionPlantEquipmentPersistence vrProductionPlantEquipmentPersistence) {
		this.vrProductionPlantEquipmentPersistence = vrProductionPlantEquipmentPersistence;
	}

	/**
	 * Returns the vr production plant equipment finder.
	 *
	 * @return the vr production plant equipment finder
	 */
	public VRProductionPlantEquipmentFinder getVRProductionPlantEquipmentFinder() {
		return vrProductionPlantEquipmentFinder;
	}

	/**
	 * Sets the vr production plant equipment finder.
	 *
	 * @param vrProductionPlantEquipmentFinder the vr production plant equipment finder
	 */
	public void setVRProductionPlantEquipmentFinder(
		VRProductionPlantEquipmentFinder vrProductionPlantEquipmentFinder) {
		this.vrProductionPlantEquipmentFinder = vrProductionPlantEquipmentFinder;
	}

	/**
	 * Returns the vr production plant prod equipment local service.
	 *
	 * @return the vr production plant prod equipment local service
	 */
	public com.fds.vr.business.service.VRProductionPlantProdEquipmentLocalService getVRProductionPlantProdEquipmentLocalService() {
		return vrProductionPlantProdEquipmentLocalService;
	}

	/**
	 * Sets the vr production plant prod equipment local service.
	 *
	 * @param vrProductionPlantProdEquipmentLocalService the vr production plant prod equipment local service
	 */
	public void setVRProductionPlantProdEquipmentLocalService(
		com.fds.vr.business.service.VRProductionPlantProdEquipmentLocalService vrProductionPlantProdEquipmentLocalService) {
		this.vrProductionPlantProdEquipmentLocalService = vrProductionPlantProdEquipmentLocalService;
	}

	/**
	 * Returns the vr production plant prod equipment persistence.
	 *
	 * @return the vr production plant prod equipment persistence
	 */
	public VRProductionPlantProdEquipmentPersistence getVRProductionPlantProdEquipmentPersistence() {
		return vrProductionPlantProdEquipmentPersistence;
	}

	/**
	 * Sets the vr production plant prod equipment persistence.
	 *
	 * @param vrProductionPlantProdEquipmentPersistence the vr production plant prod equipment persistence
	 */
	public void setVRProductionPlantProdEquipmentPersistence(
		VRProductionPlantProdEquipmentPersistence vrProductionPlantProdEquipmentPersistence) {
		this.vrProductionPlantProdEquipmentPersistence = vrProductionPlantProdEquipmentPersistence;
	}

	/**
	 * Returns the vr production plant prod equipment finder.
	 *
	 * @return the vr production plant prod equipment finder
	 */
	public VRProductionPlantProdEquipmentFinder getVRProductionPlantProdEquipmentFinder() {
		return vrProductionPlantProdEquipmentFinder;
	}

	/**
	 * Sets the vr production plant prod equipment finder.
	 *
	 * @param vrProductionPlantProdEquipmentFinder the vr production plant prod equipment finder
	 */
	public void setVRProductionPlantProdEquipmentFinder(
		VRProductionPlantProdEquipmentFinder vrProductionPlantProdEquipmentFinder) {
		this.vrProductionPlantProdEquipmentFinder = vrProductionPlantProdEquipmentFinder;
	}

	/**
	 * Returns the vr product line local service.
	 *
	 * @return the vr product line local service
	 */
	public com.fds.vr.business.service.VRProductLineLocalService getVRProductLineLocalService() {
		return vrProductLineLocalService;
	}

	/**
	 * Sets the vr product line local service.
	 *
	 * @param vrProductLineLocalService the vr product line local service
	 */
	public void setVRProductLineLocalService(
		com.fds.vr.business.service.VRProductLineLocalService vrProductLineLocalService) {
		this.vrProductLineLocalService = vrProductLineLocalService;
	}

	/**
	 * Returns the vr product line persistence.
	 *
	 * @return the vr product line persistence
	 */
	public VRProductLinePersistence getVRProductLinePersistence() {
		return vrProductLinePersistence;
	}

	/**
	 * Sets the vr product line persistence.
	 *
	 * @param vrProductLinePersistence the vr product line persistence
	 */
	public void setVRProductLinePersistence(
		VRProductLinePersistence vrProductLinePersistence) {
		this.vrProductLinePersistence = vrProductLinePersistence;
	}

	/**
	 * Returns the vr product type local service.
	 *
	 * @return the vr product type local service
	 */
	public com.fds.vr.business.service.VRProductTypeLocalService getVRProductTypeLocalService() {
		return vrProductTypeLocalService;
	}

	/**
	 * Sets the vr product type local service.
	 *
	 * @param vrProductTypeLocalService the vr product type local service
	 */
	public void setVRProductTypeLocalService(
		com.fds.vr.business.service.VRProductTypeLocalService vrProductTypeLocalService) {
		this.vrProductTypeLocalService = vrProductTypeLocalService;
	}

	/**
	 * Returns the vr product type persistence.
	 *
	 * @return the vr product type persistence
	 */
	public VRProductTypePersistence getVRProductTypePersistence() {
		return vrProductTypePersistence;
	}

	/**
	 * Sets the vr product type persistence.
	 *
	 * @param vrProductTypePersistence the vr product type persistence
	 */
	public void setVRProductTypePersistence(
		VRProductTypePersistence vrProductTypePersistence) {
		this.vrProductTypePersistence = vrProductTypePersistence;
	}

	/**
	 * Returns the vr report local service.
	 *
	 * @return the vr report local service
	 */
	public com.fds.vr.business.service.VRReportLocalService getVRReportLocalService() {
		return vrReportLocalService;
	}

	/**
	 * Sets the vr report local service.
	 *
	 * @param vrReportLocalService the vr report local service
	 */
	public void setVRReportLocalService(
		com.fds.vr.business.service.VRReportLocalService vrReportLocalService) {
		this.vrReportLocalService = vrReportLocalService;
	}

	/**
	 * Returns the vr report persistence.
	 *
	 * @return the vr report persistence
	 */
	public VRReportPersistence getVRReportPersistence() {
		return vrReportPersistence;
	}

	/**
	 * Sets the vr report persistence.
	 *
	 * @param vrReportPersistence the vr report persistence
	 */
	public void setVRReportPersistence(VRReportPersistence vrReportPersistence) {
		this.vrReportPersistence = vrReportPersistence;
	}

	/**
	 * Returns the vrrp dossier statistics local service.
	 *
	 * @return the vrrp dossier statistics local service
	 */
	public com.fds.vr.business.service.VRRPDossierStatisticsLocalService getVRRPDossierStatisticsLocalService() {
		return vrrpDossierStatisticsLocalService;
	}

	/**
	 * Sets the vrrp dossier statistics local service.
	 *
	 * @param vrrpDossierStatisticsLocalService the vrrp dossier statistics local service
	 */
	public void setVRRPDossierStatisticsLocalService(
		com.fds.vr.business.service.VRRPDossierStatisticsLocalService vrrpDossierStatisticsLocalService) {
		this.vrrpDossierStatisticsLocalService = vrrpDossierStatisticsLocalService;
	}

	/**
	 * Returns the vrrp dossier statistics persistence.
	 *
	 * @return the vrrp dossier statistics persistence
	 */
	public VRRPDossierStatisticsPersistence getVRRPDossierStatisticsPersistence() {
		return vrrpDossierStatisticsPersistence;
	}

	/**
	 * Sets the vrrp dossier statistics persistence.
	 *
	 * @param vrrpDossierStatisticsPersistence the vrrp dossier statistics persistence
	 */
	public void setVRRPDossierStatisticsPersistence(
		VRRPDossierStatisticsPersistence vrrpDossierStatisticsPersistence) {
		this.vrrpDossierStatisticsPersistence = vrrpDossierStatisticsPersistence;
	}

	/**
	 * Returns the vrrp dossier statistics finder.
	 *
	 * @return the vrrp dossier statistics finder
	 */
	public VRRPDossierStatisticsFinder getVRRPDossierStatisticsFinder() {
		return vrrpDossierStatisticsFinder;
	}

	/**
	 * Sets the vrrp dossier statistics finder.
	 *
	 * @param vrrpDossierStatisticsFinder the vrrp dossier statistics finder
	 */
	public void setVRRPDossierStatisticsFinder(
		VRRPDossierStatisticsFinder vrrpDossierStatisticsFinder) {
		this.vrrpDossierStatisticsFinder = vrrpDossierStatisticsFinder;
	}

	/**
	 * Returns the vr sync date local service.
	 *
	 * @return the vr sync date local service
	 */
	public com.fds.vr.business.service.VRSyncDateLocalService getVRSyncDateLocalService() {
		return vrSyncDateLocalService;
	}

	/**
	 * Sets the vr sync date local service.
	 *
	 * @param vrSyncDateLocalService the vr sync date local service
	 */
	public void setVRSyncDateLocalService(
		com.fds.vr.business.service.VRSyncDateLocalService vrSyncDateLocalService) {
		this.vrSyncDateLocalService = vrSyncDateLocalService;
	}

	/**
	 * Returns the vr sync date persistence.
	 *
	 * @return the vr sync date persistence
	 */
	public VRSyncDatePersistence getVRSyncDatePersistence() {
		return vrSyncDatePersistence;
	}

	/**
	 * Sets the vr sync date persistence.
	 *
	 * @param vrSyncDatePersistence the vr sync date persistence
	 */
	public void setVRSyncDatePersistence(
		VRSyncDatePersistence vrSyncDatePersistence) {
		this.vrSyncDatePersistence = vrSyncDatePersistence;
	}

	/**
	 * Returns the vr template no local service.
	 *
	 * @return the vr template no local service
	 */
	public com.fds.vr.business.service.VRTemplateNoLocalService getVRTemplateNoLocalService() {
		return vrTemplateNoLocalService;
	}

	/**
	 * Sets the vr template no local service.
	 *
	 * @param vrTemplateNoLocalService the vr template no local service
	 */
	public void setVRTemplateNoLocalService(
		com.fds.vr.business.service.VRTemplateNoLocalService vrTemplateNoLocalService) {
		this.vrTemplateNoLocalService = vrTemplateNoLocalService;
	}

	/**
	 * Returns the vr template no persistence.
	 *
	 * @return the vr template no persistence
	 */
	public VRTemplateNoPersistence getVRTemplateNoPersistence() {
		return vrTemplateNoPersistence;
	}

	/**
	 * Sets the vr template no persistence.
	 *
	 * @param vrTemplateNoPersistence the vr template no persistence
	 */
	public void setVRTemplateNoPersistence(
		VRTemplateNoPersistence vrTemplateNoPersistence) {
		this.vrTemplateNoPersistence = vrTemplateNoPersistence;
	}

	/**
	 * Returns the vr vehicle equipment local service.
	 *
	 * @return the vr vehicle equipment local service
	 */
	public com.fds.vr.business.service.VRVehicleEquipmentLocalService getVRVehicleEquipmentLocalService() {
		return vrVehicleEquipmentLocalService;
	}

	/**
	 * Sets the vr vehicle equipment local service.
	 *
	 * @param vrVehicleEquipmentLocalService the vr vehicle equipment local service
	 */
	public void setVRVehicleEquipmentLocalService(
		com.fds.vr.business.service.VRVehicleEquipmentLocalService vrVehicleEquipmentLocalService) {
		this.vrVehicleEquipmentLocalService = vrVehicleEquipmentLocalService;
	}

	/**
	 * Returns the vr vehicle equipment persistence.
	 *
	 * @return the vr vehicle equipment persistence
	 */
	public VRVehicleEquipmentPersistence getVRVehicleEquipmentPersistence() {
		return vrVehicleEquipmentPersistence;
	}

	/**
	 * Sets the vr vehicle equipment persistence.
	 *
	 * @param vrVehicleEquipmentPersistence the vr vehicle equipment persistence
	 */
	public void setVRVehicleEquipmentPersistence(
		VRVehicleEquipmentPersistence vrVehicleEquipmentPersistence) {
		this.vrVehicleEquipmentPersistence = vrVehicleEquipmentPersistence;
	}

	/**
	 * Returns the vr vehicle equipment finder.
	 *
	 * @return the vr vehicle equipment finder
	 */
	public VRVehicleEquipmentFinder getVRVehicleEquipmentFinder() {
		return vrVehicleEquipmentFinder;
	}

	/**
	 * Sets the vr vehicle equipment finder.
	 *
	 * @param vrVehicleEquipmentFinder the vr vehicle equipment finder
	 */
	public void setVRVehicleEquipmentFinder(
		VRVehicleEquipmentFinder vrVehicleEquipmentFinder) {
		this.vrVehicleEquipmentFinder = vrVehicleEquipmentFinder;
	}

	/**
	 * Returns the vr vehicle record local service.
	 *
	 * @return the vr vehicle record local service
	 */
	public com.fds.vr.business.service.VRVehicleRecordLocalService getVRVehicleRecordLocalService() {
		return vrVehicleRecordLocalService;
	}

	/**
	 * Sets the vr vehicle record local service.
	 *
	 * @param vrVehicleRecordLocalService the vr vehicle record local service
	 */
	public void setVRVehicleRecordLocalService(
		com.fds.vr.business.service.VRVehicleRecordLocalService vrVehicleRecordLocalService) {
		this.vrVehicleRecordLocalService = vrVehicleRecordLocalService;
	}

	/**
	 * Returns the vr vehicle record persistence.
	 *
	 * @return the vr vehicle record persistence
	 */
	public VRVehicleRecordPersistence getVRVehicleRecordPersistence() {
		return vrVehicleRecordPersistence;
	}

	/**
	 * Sets the vr vehicle record persistence.
	 *
	 * @param vrVehicleRecordPersistence the vr vehicle record persistence
	 */
	public void setVRVehicleRecordPersistence(
		VRVehicleRecordPersistence vrVehicleRecordPersistence) {
		this.vrVehicleRecordPersistence = vrVehicleRecordPersistence;
	}

	/**
	 * Returns the vr vehicle record finder.
	 *
	 * @return the vr vehicle record finder
	 */
	public VRVehicleRecordFinder getVRVehicleRecordFinder() {
		return vrVehicleRecordFinder;
	}

	/**
	 * Sets the vr vehicle record finder.
	 *
	 * @param vrVehicleRecordFinder the vr vehicle record finder
	 */
	public void setVRVehicleRecordFinder(
		VRVehicleRecordFinder vrVehicleRecordFinder) {
		this.vrVehicleRecordFinder = vrVehicleRecordFinder;
	}

	/**
	 * Returns the vr vehicle specification local service.
	 *
	 * @return the vr vehicle specification local service
	 */
	public com.fds.vr.business.service.VRVehicleSpecificationLocalService getVRVehicleSpecificationLocalService() {
		return vrVehicleSpecificationLocalService;
	}

	/**
	 * Sets the vr vehicle specification local service.
	 *
	 * @param vrVehicleSpecificationLocalService the vr vehicle specification local service
	 */
	public void setVRVehicleSpecificationLocalService(
		com.fds.vr.business.service.VRVehicleSpecificationLocalService vrVehicleSpecificationLocalService) {
		this.vrVehicleSpecificationLocalService = vrVehicleSpecificationLocalService;
	}

	/**
	 * Returns the vr vehicle specification persistence.
	 *
	 * @return the vr vehicle specification persistence
	 */
	public VRVehicleSpecificationPersistence getVRVehicleSpecificationPersistence() {
		return vrVehicleSpecificationPersistence;
	}

	/**
	 * Sets the vr vehicle specification persistence.
	 *
	 * @param vrVehicleSpecificationPersistence the vr vehicle specification persistence
	 */
	public void setVRVehicleSpecificationPersistence(
		VRVehicleSpecificationPersistence vrVehicleSpecificationPersistence) {
		this.vrVehicleSpecificationPersistence = vrVehicleSpecificationPersistence;
	}

	/**
	 * Returns the vr vehicle type certificate local service.
	 *
	 * @return the vr vehicle type certificate local service
	 */
	public com.fds.vr.business.service.VRVehicleTypeCertificateLocalService getVRVehicleTypeCertificateLocalService() {
		return vrVehicleTypeCertificateLocalService;
	}

	/**
	 * Sets the vr vehicle type certificate local service.
	 *
	 * @param vrVehicleTypeCertificateLocalService the vr vehicle type certificate local service
	 */
	public void setVRVehicleTypeCertificateLocalService(
		com.fds.vr.business.service.VRVehicleTypeCertificateLocalService vrVehicleTypeCertificateLocalService) {
		this.vrVehicleTypeCertificateLocalService = vrVehicleTypeCertificateLocalService;
	}

	/**
	 * Returns the vr vehicle type certificate persistence.
	 *
	 * @return the vr vehicle type certificate persistence
	 */
	public VRVehicleTypeCertificatePersistence getVRVehicleTypeCertificatePersistence() {
		return vrVehicleTypeCertificatePersistence;
	}

	/**
	 * Sets the vr vehicle type certificate persistence.
	 *
	 * @param vrVehicleTypeCertificatePersistence the vr vehicle type certificate persistence
	 */
	public void setVRVehicleTypeCertificatePersistence(
		VRVehicleTypeCertificatePersistence vrVehicleTypeCertificatePersistence) {
		this.vrVehicleTypeCertificatePersistence = vrVehicleTypeCertificatePersistence;
	}

	/**
	 * Returns the vr vehicle type certificate finder.
	 *
	 * @return the vr vehicle type certificate finder
	 */
	public VRVehicleTypeCertificateFinder getVRVehicleTypeCertificateFinder() {
		return vrVehicleTypeCertificateFinder;
	}

	/**
	 * Sets the vr vehicle type certificate finder.
	 *
	 * @param vrVehicleTypeCertificateFinder the vr vehicle type certificate finder
	 */
	public void setVRVehicleTypeCertificateFinder(
		VRVehicleTypeCertificateFinder vrVehicleTypeCertificateFinder) {
		this.vrVehicleTypeCertificateFinder = vrVehicleTypeCertificateFinder;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		persistedModelLocalServiceRegistry.register("com.fds.vr.business.model.VRLimitConfigTechSpec",
			vrLimitConfigTechSpecLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"com.fds.vr.business.model.VRLimitConfigTechSpec");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return VRLimitConfigTechSpecLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return VRLimitConfigTechSpec.class;
	}

	protected String getModelClassName() {
		return VRLimitConfigTechSpec.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = vrLimitConfigTechSpecPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.fds.vr.business.service.DeliverableLocalService.class)
	protected com.fds.vr.business.service.DeliverableLocalService deliverableLocalService;
	@BeanReference(type = DeliverablePersistence.class)
	protected DeliverablePersistence deliverablePersistence;
	@BeanReference(type = DeliverableFinder.class)
	protected DeliverableFinder deliverableFinder;
	@BeanReference(type = com.fds.vr.business.service.DossierLocalService.class)
	protected com.fds.vr.business.service.DossierLocalService dossierLocalService;
	@BeanReference(type = DossierPersistence.class)
	protected DossierPersistence dossierPersistence;
	@BeanReference(type = com.fds.vr.business.service.DossierFileLocalService.class)
	protected com.fds.vr.business.service.DossierFileLocalService dossierFileLocalService;
	@BeanReference(type = DossierFilePersistence.class)
	protected DossierFilePersistence dossierFilePersistence;
	@BeanReference(type = com.fds.vr.business.service.ILCertificateLocalService.class)
	protected com.fds.vr.business.service.ILCertificateLocalService ilCertificateLocalService;
	@BeanReference(type = ILCertificatePersistence.class)
	protected ILCertificatePersistence ilCertificatePersistence;
	@BeanReference(type = ILCertificateFinder.class)
	protected ILCertificateFinder ilCertificateFinder;
	@BeanReference(type = com.fds.vr.business.service.ILSyncDateLocalService.class)
	protected com.fds.vr.business.service.ILSyncDateLocalService ilSyncDateLocalService;
	@BeanReference(type = ILSyncDatePersistence.class)
	protected ILSyncDatePersistence ilSyncDatePersistence;
	@BeanReference(type = com.fds.vr.business.service.ILVehicleLocalService.class)
	protected com.fds.vr.business.service.ILVehicleLocalService ilVehicleLocalService;
	@BeanReference(type = ILVehiclePersistence.class)
	protected ILVehiclePersistence ilVehiclePersistence;
	@BeanReference(type = com.fds.vr.business.service.ILVehicleCustomsBorderGuardLocalService.class)
	protected com.fds.vr.business.service.ILVehicleCustomsBorderGuardLocalService ilVehicleCustomsBorderGuardLocalService;
	@BeanReference(type = ILVehicleCustomsBorderGuardPersistence.class)
	protected ILVehicleCustomsBorderGuardPersistence ilVehicleCustomsBorderGuardPersistence;
	@BeanReference(type = com.fds.vr.business.service.RegistrationLocalService.class)
	protected com.fds.vr.business.service.RegistrationLocalService registrationLocalService;
	@BeanReference(type = RegistrationPersistence.class)
	protected RegistrationPersistence registrationPersistence;
	@BeanReference(type = com.fds.vr.business.service.VRApplicantProfileLocalService.class)
	protected com.fds.vr.business.service.VRApplicantProfileLocalService vrApplicantProfileLocalService;
	@BeanReference(type = VRApplicantProfilePersistence.class)
	protected VRApplicantProfilePersistence vrApplicantProfilePersistence;
	@BeanReference(type = VRApplicantProfileFinder.class)
	protected VRApplicantProfileFinder vrApplicantProfileFinder;
	@BeanReference(type = com.fds.vr.business.service.VRApplicantProfileHistoryLocalService.class)
	protected com.fds.vr.business.service.VRApplicantProfileHistoryLocalService vrApplicantProfileHistoryLocalService;
	@BeanReference(type = VRApplicantProfileHistoryPersistence.class)
	protected VRApplicantProfileHistoryPersistence vrApplicantProfileHistoryPersistence;
	@BeanReference(type = VRApplicantProfileHistoryFinder.class)
	protected VRApplicantProfileHistoryFinder vrApplicantProfileHistoryFinder;
	@BeanReference(type = com.fds.vr.business.service.VRCertificateProgressLocalService.class)
	protected com.fds.vr.business.service.VRCertificateProgressLocalService vrCertificateProgressLocalService;
	@BeanReference(type = VRCertificateProgressPersistence.class)
	protected VRCertificateProgressPersistence vrCertificateProgressPersistence;
	@BeanReference(type = com.fds.vr.business.service.VRCertificateProgressFileLocalService.class)
	protected com.fds.vr.business.service.VRCertificateProgressFileLocalService vrCertificateProgressFileLocalService;
	@BeanReference(type = VRCertificateProgressFilePersistence.class)
	protected VRCertificateProgressFilePersistence vrCertificateProgressFilePersistence;
	@BeanReference(type = com.fds.vr.business.service.VRCFGStandardLocalService.class)
	protected com.fds.vr.business.service.VRCFGStandardLocalService vrcfgStandardLocalService;
	@BeanReference(type = VRCFGStandardPersistence.class)
	protected VRCFGStandardPersistence vrcfgStandardPersistence;
	@BeanReference(type = com.fds.vr.business.service.VRClearingStampbookLocalService.class)
	protected com.fds.vr.business.service.VRClearingStampbookLocalService vrClearingStampbookLocalService;
	@BeanReference(type = VRClearingStampbookPersistence.class)
	protected VRClearingStampbookPersistence vrClearingStampbookPersistence;
	@BeanReference(type = VRClearingStampbookFinder.class)
	protected VRClearingStampbookFinder vrClearingStampbookFinder;
	@BeanReference(type = com.fds.vr.business.service.VRConfigTechSpecLocalService.class)
	protected com.fds.vr.business.service.VRConfigTechSpecLocalService vrConfigTechSpecLocalService;
	@BeanReference(type = VRConfigTechSpecPersistence.class)
	protected VRConfigTechSpecPersistence vrConfigTechSpecPersistence;
	@BeanReference(type = com.fds.vr.business.service.VRCOPProdEquipmentLocalService.class)
	protected com.fds.vr.business.service.VRCOPProdEquipmentLocalService vrcopProdEquipmentLocalService;
	@BeanReference(type = VRCOPProdEquipmentPersistence.class)
	protected VRCOPProdEquipmentPersistence vrcopProdEquipmentPersistence;
	@BeanReference(type = VRCOPProdEquipmentFinder.class)
	protected VRCOPProdEquipmentFinder vrcopProdEquipmentFinder;
	@BeanReference(type = com.fds.vr.business.service.VRCOPProductClassificationLocalService.class)
	protected com.fds.vr.business.service.VRCOPProductClassificationLocalService vrcopProductClassificationLocalService;
	@BeanReference(type = VRCOPProductClassificationPersistence.class)
	protected VRCOPProductClassificationPersistence vrcopProductClassificationPersistence;
	@BeanReference(type = VRCOPProductClassificationFinder.class)
	protected VRCOPProductClassificationFinder vrcopProductClassificationFinder;
	@BeanReference(type = com.fds.vr.business.service.VRCOPProductionPlantEmployeeLocalService.class)
	protected com.fds.vr.business.service.VRCOPProductionPlantEmployeeLocalService vrcopProductionPlantEmployeeLocalService;
	@BeanReference(type = VRCOPProductionPlantEmployeePersistence.class)
	protected VRCOPProductionPlantEmployeePersistence vrcopProductionPlantEmployeePersistence;
	@BeanReference(type = VRCOPProductionPlantEmployeeFinder.class)
	protected VRCOPProductionPlantEmployeeFinder vrcopProductionPlantEmployeeFinder;
	@BeanReference(type = com.fds.vr.business.service.VRCOPProductionPlantEquipmentLocalService.class)
	protected com.fds.vr.business.service.VRCOPProductionPlantEquipmentLocalService vrcopProductionPlantEquipmentLocalService;
	@BeanReference(type = VRCOPProductionPlantEquipmentPersistence.class)
	protected VRCOPProductionPlantEquipmentPersistence vrcopProductionPlantEquipmentPersistence;
	@BeanReference(type = VRCOPProductionPlantEquipmentFinder.class)
	protected VRCOPProductionPlantEquipmentFinder vrcopProductionPlantEquipmentFinder;
	@BeanReference(type = com.fds.vr.business.service.VRCOPProductLineLocalService.class)
	protected com.fds.vr.business.service.VRCOPProductLineLocalService vrcopProductLineLocalService;
	@BeanReference(type = VRCOPProductLinePersistence.class)
	protected VRCOPProductLinePersistence vrcopProductLinePersistence;
	@BeanReference(type = VRCOPProductLineFinder.class)
	protected VRCOPProductLineFinder vrcopProductLineFinder;
	@BeanReference(type = com.fds.vr.business.service.VRCOPProductTypeLocalService.class)
	protected com.fds.vr.business.service.VRCOPProductTypeLocalService vrcopProductTypeLocalService;
	@BeanReference(type = VRCOPProductTypePersistence.class)
	protected VRCOPProductTypePersistence vrcopProductTypePersistence;
	@BeanReference(type = VRCOPProductTypeFinder.class)
	protected VRCOPProductTypeFinder vrcopProductTypeFinder;
	@BeanReference(type = com.fds.vr.business.service.VRCOPReportAttachLocalService.class)
	protected com.fds.vr.business.service.VRCOPReportAttachLocalService vrcopReportAttachLocalService;
	@BeanReference(type = VRCOPReportAttachPersistence.class)
	protected VRCOPReportAttachPersistence vrcopReportAttachPersistence;
	@BeanReference(type = VRCOPReportAttachFinder.class)
	protected VRCOPReportAttachFinder vrcopReportAttachFinder;
	@BeanReference(type = com.fds.vr.business.service.VRCOPReportRepositoryLocalService.class)
	protected com.fds.vr.business.service.VRCOPReportRepositoryLocalService vrcopReportRepositoryLocalService;
	@BeanReference(type = VRCOPReportRepositoryPersistence.class)
	protected VRCOPReportRepositoryPersistence vrcopReportRepositoryPersistence;
	@BeanReference(type = VRCOPReportRepositoryFinder.class)
	protected VRCOPReportRepositoryFinder vrcopReportRepositoryFinder;
	@BeanReference(type = com.fds.vr.business.service.VRCorporationInspectorLocalService.class)
	protected com.fds.vr.business.service.VRCorporationInspectorLocalService vrCorporationInspectorLocalService;
	@BeanReference(type = VRCorporationInspectorPersistence.class)
	protected VRCorporationInspectorPersistence vrCorporationInspectorPersistence;
	@BeanReference(type = VRCorporationInspectorFinder.class)
	protected VRCorporationInspectorFinder vrCorporationInspectorFinder;
	@BeanReference(type = com.fds.vr.business.service.VRCorporationViewLocalService.class)
	protected com.fds.vr.business.service.VRCorporationViewLocalService vrCorporationViewLocalService;
	@BeanReference(type = VRCorporationViewPersistence.class)
	protected VRCorporationViewPersistence vrCorporationViewPersistence;
	@BeanReference(type = VRCorporationViewFinder.class)
	protected VRCorporationViewFinder vrCorporationViewFinder;
	@BeanReference(type = com.fds.vr.business.service.VRInputSheetLocalService.class)
	protected com.fds.vr.business.service.VRInputSheetLocalService vrInputSheetLocalService;
	@BeanReference(type = VRInputSheetPersistence.class)
	protected VRInputSheetPersistence vrInputSheetPersistence;
	@BeanReference(type = VRInputSheetFinder.class)
	protected VRInputSheetFinder vrInputSheetFinder;
	@BeanReference(type = com.fds.vr.business.service.VRInputStampbookLocalService.class)
	protected com.fds.vr.business.service.VRInputStampbookLocalService vrInputStampbookLocalService;
	@BeanReference(type = VRInputStampbookPersistence.class)
	protected VRInputStampbookPersistence vrInputStampbookPersistence;
	@BeanReference(type = VRInputStampbookFinder.class)
	protected VRInputStampbookFinder vrInputStampbookFinder;
	@BeanReference(type = com.fds.vr.business.service.VRInputStampbookDetailsLocalService.class)
	protected com.fds.vr.business.service.VRInputStampbookDetailsLocalService vrInputStampbookDetailsLocalService;
	@BeanReference(type = VRInputStampbookDetailsPersistence.class)
	protected VRInputStampbookDetailsPersistence vrInputStampbookDetailsPersistence;
	@BeanReference(type = VRInputStampbookDetailsFinder.class)
	protected VRInputStampbookDetailsFinder vrInputStampbookDetailsFinder;
	@BeanReference(type = com.fds.vr.business.service.VRInspectionStandardLocalService.class)
	protected com.fds.vr.business.service.VRInspectionStandardLocalService vrInspectionStandardLocalService;
	@BeanReference(type = VRInspectionStandardPersistence.class)
	protected VRInspectionStandardPersistence vrInspectionStandardPersistence;
	@BeanReference(type = VRInspectionStandardFinder.class)
	protected VRInspectionStandardFinder vrInspectionStandardFinder;
	@BeanReference(type = com.fds.vr.business.service.VRInventoryLocalService.class)
	protected com.fds.vr.business.service.VRInventoryLocalService vrInventoryLocalService;
	@BeanReference(type = VRInventoryPersistence.class)
	protected VRInventoryPersistence vrInventoryPersistence;
	@BeanReference(type = VRInventoryFinder.class)
	protected VRInventoryFinder vrInventoryFinder;
	@BeanReference(type = com.fds.vr.business.service.VRIssueLocalService.class)
	protected com.fds.vr.business.service.VRIssueLocalService vrIssueLocalService;
	@BeanReference(type = VRIssuePersistence.class)
	protected VRIssuePersistence vrIssuePersistence;
	@BeanReference(type = VRIssueFinder.class)
	protected VRIssueFinder vrIssueFinder;
	@BeanReference(type = com.fds.vr.business.service.VRIssueEquipmentCertificateLocalService.class)
	protected com.fds.vr.business.service.VRIssueEquipmentCertificateLocalService vrIssueEquipmentCertificateLocalService;
	@BeanReference(type = VRIssueEquipmentCertificatePersistence.class)
	protected VRIssueEquipmentCertificatePersistence vrIssueEquipmentCertificatePersistence;
	@BeanReference(type = VRIssueEquipmentCertificateFinder.class)
	protected VRIssueEquipmentCertificateFinder vrIssueEquipmentCertificateFinder;
	@BeanReference(type = com.fds.vr.business.service.VRIssueVehiclecertificateLocalService.class)
	protected com.fds.vr.business.service.VRIssueVehiclecertificateLocalService vrIssueVehiclecertificateLocalService;
	@BeanReference(type = VRIssueVehiclecertificatePersistence.class)
	protected VRIssueVehiclecertificatePersistence vrIssueVehiclecertificatePersistence;
	@BeanReference(type = VRIssueVehiclecertificateFinder.class)
	protected VRIssueVehiclecertificateFinder vrIssueVehiclecertificateFinder;
	@BeanReference(type = VRLimitConfigTechSpecLocalService.class)
	protected VRLimitConfigTechSpecLocalService vrLimitConfigTechSpecLocalService;
	@BeanReference(type = VRLimitConfigTechSpecPersistence.class)
	protected VRLimitConfigTechSpecPersistence vrLimitConfigTechSpecPersistence;
	@BeanReference(type = com.fds.vr.business.service.VROutputSheetLocalService.class)
	protected com.fds.vr.business.service.VROutputSheetLocalService vrOutputSheetLocalService;
	@BeanReference(type = VROutputSheetPersistence.class)
	protected VROutputSheetPersistence vrOutputSheetPersistence;
	@BeanReference(type = VROutputSheetFinder.class)
	protected VROutputSheetFinder vrOutputSheetFinder;
	@BeanReference(type = com.fds.vr.business.service.VROutputSheetDetailsLocalService.class)
	protected com.fds.vr.business.service.VROutputSheetDetailsLocalService vrOutputSheetDetailsLocalService;
	@BeanReference(type = VROutputSheetDetailsPersistence.class)
	protected VROutputSheetDetailsPersistence vrOutputSheetDetailsPersistence;
	@BeanReference(type = VROutputSheetDetailsFinder.class)
	protected VROutputSheetDetailsFinder vrOutputSheetDetailsFinder;
	@BeanReference(type = com.fds.vr.business.service.VRProductClassificationLocalService.class)
	protected com.fds.vr.business.service.VRProductClassificationLocalService vrProductClassificationLocalService;
	@BeanReference(type = VRProductClassificationPersistence.class)
	protected VRProductClassificationPersistence vrProductClassificationPersistence;
	@BeanReference(type = VRProductClassificationFinder.class)
	protected VRProductClassificationFinder vrProductClassificationFinder;
	@BeanReference(type = com.fds.vr.business.service.VRProductionPlantLocalService.class)
	protected com.fds.vr.business.service.VRProductionPlantLocalService vrProductionPlantLocalService;
	@BeanReference(type = VRProductionPlantPersistence.class)
	protected VRProductionPlantPersistence vrProductionPlantPersistence;
	@BeanReference(type = VRProductionPlantFinder.class)
	protected VRProductionPlantFinder vrProductionPlantFinder;
	@BeanReference(type = com.fds.vr.business.service.VRProductionPlantEmployeeLocalService.class)
	protected com.fds.vr.business.service.VRProductionPlantEmployeeLocalService vrProductionPlantEmployeeLocalService;
	@BeanReference(type = VRProductionPlantEmployeePersistence.class)
	protected VRProductionPlantEmployeePersistence vrProductionPlantEmployeePersistence;
	@BeanReference(type = VRProductionPlantEmployeeFinder.class)
	protected VRProductionPlantEmployeeFinder vrProductionPlantEmployeeFinder;
	@BeanReference(type = com.fds.vr.business.service.VRProductionPlantEquipmentLocalService.class)
	protected com.fds.vr.business.service.VRProductionPlantEquipmentLocalService vrProductionPlantEquipmentLocalService;
	@BeanReference(type = VRProductionPlantEquipmentPersistence.class)
	protected VRProductionPlantEquipmentPersistence vrProductionPlantEquipmentPersistence;
	@BeanReference(type = VRProductionPlantEquipmentFinder.class)
	protected VRProductionPlantEquipmentFinder vrProductionPlantEquipmentFinder;
	@BeanReference(type = com.fds.vr.business.service.VRProductionPlantProdEquipmentLocalService.class)
	protected com.fds.vr.business.service.VRProductionPlantProdEquipmentLocalService vrProductionPlantProdEquipmentLocalService;
	@BeanReference(type = VRProductionPlantProdEquipmentPersistence.class)
	protected VRProductionPlantProdEquipmentPersistence vrProductionPlantProdEquipmentPersistence;
	@BeanReference(type = VRProductionPlantProdEquipmentFinder.class)
	protected VRProductionPlantProdEquipmentFinder vrProductionPlantProdEquipmentFinder;
	@BeanReference(type = com.fds.vr.business.service.VRProductLineLocalService.class)
	protected com.fds.vr.business.service.VRProductLineLocalService vrProductLineLocalService;
	@BeanReference(type = VRProductLinePersistence.class)
	protected VRProductLinePersistence vrProductLinePersistence;
	@BeanReference(type = com.fds.vr.business.service.VRProductTypeLocalService.class)
	protected com.fds.vr.business.service.VRProductTypeLocalService vrProductTypeLocalService;
	@BeanReference(type = VRProductTypePersistence.class)
	protected VRProductTypePersistence vrProductTypePersistence;
	@BeanReference(type = com.fds.vr.business.service.VRReportLocalService.class)
	protected com.fds.vr.business.service.VRReportLocalService vrReportLocalService;
	@BeanReference(type = VRReportPersistence.class)
	protected VRReportPersistence vrReportPersistence;
	@BeanReference(type = com.fds.vr.business.service.VRRPDossierStatisticsLocalService.class)
	protected com.fds.vr.business.service.VRRPDossierStatisticsLocalService vrrpDossierStatisticsLocalService;
	@BeanReference(type = VRRPDossierStatisticsPersistence.class)
	protected VRRPDossierStatisticsPersistence vrrpDossierStatisticsPersistence;
	@BeanReference(type = VRRPDossierStatisticsFinder.class)
	protected VRRPDossierStatisticsFinder vrrpDossierStatisticsFinder;
	@BeanReference(type = com.fds.vr.business.service.VRSyncDateLocalService.class)
	protected com.fds.vr.business.service.VRSyncDateLocalService vrSyncDateLocalService;
	@BeanReference(type = VRSyncDatePersistence.class)
	protected VRSyncDatePersistence vrSyncDatePersistence;
	@BeanReference(type = com.fds.vr.business.service.VRTemplateNoLocalService.class)
	protected com.fds.vr.business.service.VRTemplateNoLocalService vrTemplateNoLocalService;
	@BeanReference(type = VRTemplateNoPersistence.class)
	protected VRTemplateNoPersistence vrTemplateNoPersistence;
	@BeanReference(type = com.fds.vr.business.service.VRVehicleEquipmentLocalService.class)
	protected com.fds.vr.business.service.VRVehicleEquipmentLocalService vrVehicleEquipmentLocalService;
	@BeanReference(type = VRVehicleEquipmentPersistence.class)
	protected VRVehicleEquipmentPersistence vrVehicleEquipmentPersistence;
	@BeanReference(type = VRVehicleEquipmentFinder.class)
	protected VRVehicleEquipmentFinder vrVehicleEquipmentFinder;
	@BeanReference(type = com.fds.vr.business.service.VRVehicleRecordLocalService.class)
	protected com.fds.vr.business.service.VRVehicleRecordLocalService vrVehicleRecordLocalService;
	@BeanReference(type = VRVehicleRecordPersistence.class)
	protected VRVehicleRecordPersistence vrVehicleRecordPersistence;
	@BeanReference(type = VRVehicleRecordFinder.class)
	protected VRVehicleRecordFinder vrVehicleRecordFinder;
	@BeanReference(type = com.fds.vr.business.service.VRVehicleSpecificationLocalService.class)
	protected com.fds.vr.business.service.VRVehicleSpecificationLocalService vrVehicleSpecificationLocalService;
	@BeanReference(type = VRVehicleSpecificationPersistence.class)
	protected VRVehicleSpecificationPersistence vrVehicleSpecificationPersistence;
	@BeanReference(type = com.fds.vr.business.service.VRVehicleTypeCertificateLocalService.class)
	protected com.fds.vr.business.service.VRVehicleTypeCertificateLocalService vrVehicleTypeCertificateLocalService;
	@BeanReference(type = VRVehicleTypeCertificatePersistence.class)
	protected VRVehicleTypeCertificatePersistence vrVehicleTypeCertificatePersistence;
	@BeanReference(type = VRVehicleTypeCertificateFinder.class)
	protected VRVehicleTypeCertificateFinder vrVehicleTypeCertificateFinder;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry persistedModelLocalServiceRegistry;
}
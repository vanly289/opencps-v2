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

package com.backend.migrate.vr.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ILPhuongTienLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ILPhuongTienLocalService
 * @generated
 */
@ProviderType
public class ILPhuongTienLocalServiceWrapper implements ILPhuongTienLocalService,
	ServiceWrapper<ILPhuongTienLocalService> {
	public ILPhuongTienLocalServiceWrapper(
		ILPhuongTienLocalService ilPhuongTienLocalService) {
		_ilPhuongTienLocalService = ilPhuongTienLocalService;
	}

	/**
	* Adds the il phuong tien to the database. Also notifies the appropriate model listeners.
	*
	* @param ilPhuongTien the il phuong tien
	* @return the il phuong tien that was added
	*/
	@Override
	public com.backend.migrate.vr.model.ILPhuongTien addILPhuongTien(
		com.backend.migrate.vr.model.ILPhuongTien ilPhuongTien) {
		return _ilPhuongTienLocalService.addILPhuongTien(ilPhuongTien);
	}

	@Override
	public com.backend.migrate.vr.model.ILPhuongTien addPhuongTien(long id,
		java.lang.String bienkiemsoat, int succhua, long loaighe_id,
		int namsanxuat, long nuocsanxuat_id, long tenhieuxe_id, long mauson_id,
		java.lang.String sokhung, java.lang.String somay,
		int namhetnienhansudung, java.util.Date namcaitao, int trongtai,
		int loaihinhvantai_id, int la_xegiuongnam, int sogiuongnam,
		java.lang.String tennguoisohuu, int doanhnghiep_id,
		int tuyenkhaithac_id, java.lang.String web_giamsathanhtrinh,
		java.lang.String tendangnhap_gsht, java.lang.String ghichu,
		int trangthai, int coquanquanly_id, long congdan_id) {
		return _ilPhuongTienLocalService.addPhuongTien(id, bienkiemsoat,
			succhua, loaighe_id, namsanxuat, nuocsanxuat_id, tenhieuxe_id,
			mauson_id, sokhung, somay, namhetnienhansudung, namcaitao,
			trongtai, loaihinhvantai_id, la_xegiuongnam, sogiuongnam,
			tennguoisohuu, doanhnghiep_id, tuyenkhaithac_id,
			web_giamsathanhtrinh, tendangnhap_gsht, ghichu, trangthai,
			coquanquanly_id, congdan_id);
	}

	/**
	* Creates a new il phuong tien with the primary key. Does not add the il phuong tien to the database.
	*
	* @param id the primary key for the new il phuong tien
	* @return the new il phuong tien
	*/
	@Override
	public com.backend.migrate.vr.model.ILPhuongTien createILPhuongTien(long id) {
		return _ilPhuongTienLocalService.createILPhuongTien(id);
	}

	/**
	* Deletes the il phuong tien from the database. Also notifies the appropriate model listeners.
	*
	* @param ilPhuongTien the il phuong tien
	* @return the il phuong tien that was removed
	*/
	@Override
	public com.backend.migrate.vr.model.ILPhuongTien deleteILPhuongTien(
		com.backend.migrate.vr.model.ILPhuongTien ilPhuongTien) {
		return _ilPhuongTienLocalService.deleteILPhuongTien(ilPhuongTien);
	}

	/**
	* Deletes the il phuong tien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the il phuong tien
	* @return the il phuong tien that was removed
	* @throws PortalException if a il phuong tien with the primary key could not be found
	*/
	@Override
	public com.backend.migrate.vr.model.ILPhuongTien deleteILPhuongTien(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ilPhuongTienLocalService.deleteILPhuongTien(id);
	}

	@Override
	public com.backend.migrate.vr.model.ILPhuongTien deletePhuongTien(long id)
		throws com.backend.migrate.vr.exception.NoSuchILPhuongTienException {
		return _ilPhuongTienLocalService.deletePhuongTien(id);
	}

	@Override
	public com.backend.migrate.vr.model.ILPhuongTien fetchILPhuongTien(long id) {
		return _ilPhuongTienLocalService.fetchILPhuongTien(id);
	}

	/**
	* Returns the il phuong tien with the primary key.
	*
	* @param id the primary key of the il phuong tien
	* @return the il phuong tien
	* @throws PortalException if a il phuong tien with the primary key could not be found
	*/
	@Override
	public com.backend.migrate.vr.model.ILPhuongTien getILPhuongTien(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ilPhuongTienLocalService.getILPhuongTien(id);
	}

	@Override
	public com.backend.migrate.vr.model.ILPhuongTien getLastPhuongTien()
		throws com.backend.migrate.vr.exception.NoSuchILPhuongTienException {
		return _ilPhuongTienLocalService.getLastPhuongTien();
	}

	/**
	* Updates the il phuong tien in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ilPhuongTien the il phuong tien
	* @return the il phuong tien that was updated
	*/
	@Override
	public com.backend.migrate.vr.model.ILPhuongTien updateILPhuongTien(
		com.backend.migrate.vr.model.ILPhuongTien ilPhuongTien) {
		return _ilPhuongTienLocalService.updateILPhuongTien(ilPhuongTien);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _ilPhuongTienLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ilPhuongTienLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _ilPhuongTienLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ilPhuongTienLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ilPhuongTienLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of il phuong tiens.
	*
	* @return the number of il phuong tiens
	*/
	@Override
	public int getILPhuongTiensCount() {
		return _ilPhuongTienLocalService.getILPhuongTiensCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _ilPhuongTienLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _ilPhuongTienLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.ILPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _ilPhuongTienLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.ILPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _ilPhuongTienLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the il phuong tiens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.backend.migrate.vr.model.impl.ILPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of il phuong tiens
	* @param end the upper bound of the range of il phuong tiens (not inclusive)
	* @return the range of il phuong tiens
	*/
	@Override
	public java.util.List<com.backend.migrate.vr.model.ILPhuongTien> getILPhuongTiens(
		int start, int end) {
		return _ilPhuongTienLocalService.getILPhuongTiens(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _ilPhuongTienLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _ilPhuongTienLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public ILPhuongTienLocalService getWrappedService() {
		return _ilPhuongTienLocalService;
	}

	@Override
	public void setWrappedService(
		ILPhuongTienLocalService ilPhuongTienLocalService) {
		_ilPhuongTienLocalService = ilPhuongTienLocalService;
	}

	private ILPhuongTienLocalService _ilPhuongTienLocalService;
}
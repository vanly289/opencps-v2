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

package com.fds.vr.business.service.impl;

import aQute.bnd.annotation.ProviderType;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.exception.PortalException;
import com.fds.vr.business.model.VRInputStampbook;
import com.fds.vr.business.service.base.VRInputStampbookLocalServiceBaseImpl;

/**
 * The implementation of the vr input stampbook local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VRInputStampbookLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRInputStampbookLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRInputStampbookLocalServiceUtil
 */
@ProviderType
public class VRInputStampbookLocalServiceImpl
	extends VRInputStampbookLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VRInputStampbookLocalServiceUtil} to access the vr input stampbook local service.
	 */
	
	public VRInputStampbook updateInputStambook(long id, long mtCore, long inputSheetId, Long corporationId, 
			Long inputSheetType, String vehicleClass, String stampType, 
			String stampShortNo, Long serialStartNo, Long serialEndNo, 
			Long subTotalInDocument, Long subTotalQuantities, Long units, 
			Long unitPrice, Long totalAmount, Long totalInUse, Long totalNotUsed, 
			Long sum1, Long sum2, Long sum3, String remark, Long isApproval)
		throws PortalException, SystemException {
		
		VRInputStampbook inputStambook = null;
		
		if(id > 0) {
			inputStambook = vrInputStampbookPersistence.findByPrimaryKey(id);
		} else {
			id = counterLocalService.increment(VRInputStampbook.class.getName());
			inputStambook = vrInputStampbookPersistence.create(id);
		}
		
		long bookId = id;
		
		inputStambook.setModifyDate(new Date());
		inputStambook.setMtCore(mtCore);
		inputStambook.setInputSheetId(inputSheetId);
		
		inputStambook.setBookId(bookId);
		
		if(Validator.isNotNull(vehicleClass))
			inputStambook.setVehicleClass(vehicleClass);
		
		if(Validator.isNotNull(stampType))
			inputStambook.setStampType(stampType);
		
		if(Validator.isNotNull(stampShortNo))
			inputStambook.setStampShortNo(stampShortNo);
		
		if(Validator.isNotNull(serialStartNo))
			inputStambook.setSerialStartNo(serialStartNo);
		
		if(Validator.isNotNull(serialEndNo))
			inputStambook.setSerialEndNo(serialEndNo);
		
		if(Validator.isNotNull(subTotalInDocument))
			inputStambook.setSubTotalInDocument(subTotalInDocument);
		
		if(Validator.isNotNull(subTotalQuantities))
			inputStambook.setSubTotalQuantities(subTotalQuantities);
		
		if(Validator.isNotNull(units))
			inputStambook.setUnits(units);
		
		if(Validator.isNotNull(unitPrice))
			inputStambook.setUnitPrice(unitPrice);
		
		if(Validator.isNotNull(totalAmount))
			inputStambook.setTotalAmount(totalAmount);
		
		if(Validator.isNotNull(totalInUse))
			inputStambook.setTotalInUse(totalInUse);
		
		if(Validator.isNotNull(totalNotUsed))
			inputStambook.setTotalNotUsed(totalNotUsed);
		
		if(Validator.isNotNull(sum1))
			inputStambook.setSum1(sum1);
		
		if(Validator.isNotNull(sum2))
			inputStambook.setSum2(sum2);
		
		if(Validator.isNotNull(sum3))
			inputStambook.setSum3(sum3);
		
		if(Validator.isNotNull(remark))
			inputStambook.setRemark(remark);
		
		if(isApproval != null && isApproval == 1) {	//phieu nhap da duyet
			long year = Calendar.getInstance().get(Calendar.YEAR);
			
			// update inventory
			vrInventoryLocalService.updateInventory(0l, 1l, year, null, null,
					bookId, vehicleClass, stampType, stampShortNo, serialStartNo, serialEndNo, sum3,
					totalInUse, totalNotUsed, remark, corporationId, inputSheetType, 0l);
			
			for(long sequenNo = serialStartNo ; sequenNo <= serialEndNo ; sequenNo ++) {
				String stampSerialNo = stampShortNo + String.format("%06d", sequenNo);
				// update stampbookdetails
				vrInputStampbookDetailsLocalService.updateInputStampbookDetails(0l, 1l, stampSerialNo, sequenNo,
						null, null, null, null, null, null, null,
						null, null, null, null, null, remark, inputSheetId, bookId,
						null, corporationId, null, null, 0l, null,
						null, null, null, null, null,
						null);
			}
		}
		
		return vrInputStampbookPersistence.update(inputStambook);
		
	}
	
	public void updateJSONArrayInputStambook(long inputSheetId, Long corporationId, 
			Long inputSheetType, String stampbooks, Long isApproval)
			throws PortalException, SystemException {
		
		if(Validator.isNotNull(stampbooks)) {
			JSONArray stampbookArr = JSONFactoryUtil.createJSONArray(stampbooks);
			
			List<VRInputStampbook> inputStambooks = vrInputStampbookLocalService.findByInputSheetId(1l, inputSheetId);
			
			// them moi
			for (int i = 0; i < stampbookArr.length(); ++i) {
				JSONObject json = stampbookArr.getJSONObject(i);
	
				String vehicleClass = json.getString("vehicleClass");
				String stampType = json.getString("stampType");
				String stampShortNo = json.getString("stampShortNo");
				Long serialStartNo = json.getLong("serialStartNo");
				Long serialEndNo = json.getLong("serialEndNo");
				Long subTotalInDocument = json.getLong("subTotalInDocument");
				Long subTotalQuantities = json.getLong("subTotalQuantities");
				Long units = json.getLong("units");
				Long unitPrice = json.getLong("unitPrice");
				Long totalAmount_ = json.getLong("totalAmount");
				Long totalInUse = json.getLong("totalInUse");
				Long totalNotUsed = json.getLong("totalNotUsed");
				Long sum1 = json.getLong("sum1");
				Long sum2 = json.getLong("sum2");
				Long sum3 = json.getLong("sum3");
				String remark = json.getString("remark");
	
				vrInputStampbookLocalService.updateInputStambook(0l, 1l, inputSheetId, corporationId, inputSheetType,
						vehicleClass, stampType, stampShortNo, serialStartNo, serialEndNo, subTotalInDocument,
						subTotalQuantities, units, unitPrice, totalAmount_, totalInUse, totalNotUsed, sum1, sum2, sum3,
						remark, isApproval);
			}
			
			// xoa cu
			for(VRInputStampbook inputStambook : inputStambooks) {
				vrInputStampbookPersistence.remove(inputStambook.getPrimaryKey());
			}
		}
	}
	
	public VRInputStampbook updateByOutputSheet(long bookId, long subTotalInDocument, long serialStartNo, long serialEndNo, long corporationId, long outputSheetType) throws PortalException, SystemException {
		VRInputStampbook inputStambook = vrInputStampbookPersistence.findByPrimaryKey(bookId);
		
		long newSum3 = inputStambook.getSum3() - subTotalInDocument;
		long newSum2 = inputStambook.getSum2() + subTotalInDocument;
		
		inputStambook.setSum3(newSum3);
		inputStambook.setSum2(newSum2);
		inputStambook.setModifyDate(new Date());
		
		for(long sequenNo = serialStartNo ; sequenNo <= serialEndNo ; sequenNo ++) {
			long issuingStatus = outputSheetType == 5 ? 1 : 2;	// 1 chua cap phat - dang o doi, 2 cap phat cho cssx
			
			vrInputStampbookDetailsLocalService.updateByOutputSheet(bookId, sequenNo, corporationId, issuingStatus);
		}
		
		return vrInputStampbookPersistence.update(inputStambook);
	}
	
	public List<VRInputStampbook> findByInputSheetId(long mtCore, long inputSheetId) throws PortalException, SystemException {
		try {
			return vrInputStampbookPersistence.findByInputSheetId(mtCore, inputSheetId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRInputStampbook>();
		
	}


	public List<VRInputStampbook> findByInputSheetIdAndBookId(long mtCore, long inputSheetId, long bookId) throws PortalException, SystemException {
		try {
			return vrInputStampbookPersistence.findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRInputStampbook>();
		
	}
	
	public List<VRInputStampbook> findByInputSheetIdAndBookIdAndStampType(long mtCore, long inputSheetId, long bookId, String stampType) throws PortalException, SystemException {
		try {
			return vrInputStampbookPersistence.findByInputSheetIdAndBookIdAndStampType(mtCore, inputSheetId, bookId, stampType);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRInputStampbook>();
		
	}
	
	public List<VRInputStampbook> findBySum3GreaterThan() throws PortalException, SystemException {
		try {
			return vrInputStampbookPersistence.findBySum3GreaterThan(0l);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<VRInputStampbook>();
		
	}
	
	
	private Log _log = LogFactoryUtil.getLog(VRInputStampbookLocalServiceImpl.class);
}
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

package vn.gt.dao.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringPool;

import vn.gt.dao.model.CompressFileLog;
import vn.gt.dao.service.base.CompressFileLogLocalServiceBaseImpl;

/**
 * The implementation of the compress file log local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.gt.dao.service.CompressFileLogLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author huymq
 * @see vn.gt.dao.service.base.CompressFileLogLocalServiceBaseImpl
 * @see vn.gt.dao.service.CompressFileLogLocalServiceUtil
 */
public class CompressFileLogLocalServiceImpl
	extends CompressFileLogLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.gt.dao.service.CompressFileLogLocalServiceUtil} to access the compress file log local service.
	 */
	
	public CompressFileLog addCompressFileLog(long hoSoId, long fileEntryId, long oldSize, long newSize)
			throws SystemException {
		
		return addCompressFileLog(hoSoId, fileEntryId, oldSize, newSize, true, StringPool.BLANK);
	}
	
	public CompressFileLog addCompressFileLog(long hoSoId, long fileEntryId, long oldSize, long newSize, boolean status, String errorMsg)
			throws SystemException {
		
		long compressFileLogId = counterLocalService.increment(CompressFileLog.class.getName());
		CompressFileLog compressFileLog = compressFileLogPersistence.create(compressFileLogId);
		
		compressFileLog.setCreateDate(new Date());
		compressFileLog.setHoSoId(hoSoId);
		compressFileLog.setFileEntryId(fileEntryId);
		compressFileLog.setOldSize(oldSize);
		compressFileLog.setNewSize(newSize);
		compressFileLog.setStatus(status);
		compressFileLog.setErrorMsg(errorMsg);
		
		return compressFileLogPersistence.update(compressFileLog);
	}
	
	public long getLasted() throws SystemException {
		List<CompressFileLog> listCompress = compressFileLogPersistence.findAll(0, 1);
		
		if(listCompress != null && listCompress.size() > 0) {
			return listCompress.get(0).getHoSoId();
		} else {
			return 0;
		}
	}
	
	public CompressFileLog getCompressFileLog(long fileEntryId) throws SystemException {
		return compressFileLogPersistence.fetchByFileEntryId(fileEntryId);
	}
}
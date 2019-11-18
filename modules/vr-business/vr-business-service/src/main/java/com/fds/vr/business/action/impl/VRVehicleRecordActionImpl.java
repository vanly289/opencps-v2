package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRVehicleRecordAction;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.InputStream;
import java.util.Iterator;


/**
 * @author trungnt
 *
 */
public class VRVehicleRecordActionImpl implements VRVehicleRecordAction {
	private Log _log = LogFactoryUtil.getLog(VRVehicleTypeCertificateActionImpl.class);
	@Override
	public JSONObject importVRVehicleRecord(User user, ServiceContext serviceContext, InputStream inputStream) {
		_log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>POI");
		/*
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
			
			XSSFSheet sheet = workbook.getSheetAt(0);
			int count = 0;
			Iterator<Row> rowIterator = sheet.iterator();
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				if(count >= 3) {
					Iterator<Cell> cellIterator = row.cellIterator();
					while (cellIterator.hasNext()) {
						Cell cell = cellIterator.next();
						System.out.println(cell.getStringCellValue());
					}
				}
				
				count++;
			}
		} catch (Exception e) {
			_log.error(e);
		}
		 */
		return null;
	}

}

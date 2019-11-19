package com.fds.vr.business.action.impl;

import com.fds.vr.business.action.VRVehicleRecordAction;
import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.model.VRVehicleRecord;
import com.fds.vr.business.model.impl.VRVehicleRecordImpl;
import com.fds.vr.business.service.VRVehicleRecordLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.FileUtil;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author trungnt
 *
 */
public class VRVehicleRecordActionImpl implements VRVehicleRecordAction {
	private Log _log = LogFactoryUtil.getLog(VRVehicleTypeCertificateActionImpl.class);

	@Override
	public JSONObject importVRVehicleRecord(User user, ServiceContext serviceContext, InputStream inputStream) {

		try {
			ZipInputStream source = new ZipInputStream(inputStream);
			File destDir = FileUtil.createTempFolder();
			byte[] buffer = new byte[1024];
			ZipEntry ze = source.getNextEntry();
			List<File> files = new ArrayList<File>();
			while (ze != null) {
				File newFile = ActionUtil.newFile(destDir, ze);
				_log.info("newFile ====>>> " + newFile.getAbsolutePath() + "|" + newFile.getName());
				FileOutputStream fos = new FileOutputStream(newFile);
				int len;
				while ((len = source.read(buffer)) > 0) {
					fos.write(buffer, 0, len);
				}
				fos.close();
				files.add(newFile);
				ze = source.getNextEntry();
			}
			source.closeEntry();
			source.close();

			if (!files.isEmpty()) {
				for (File file : files) {
					OPCPackage pkg = OPCPackage.open(file);
					// XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
					XSSFWorkbook workbook = new XSSFWorkbook(pkg);

					XSSFSheet sheet = workbook.getSheetAt(0);
					int count = 0;
					Iterator<Row> rowIterator = sheet.iterator();
					while (rowIterator.hasNext()) {
						Row row = rowIterator.next();
						if (count >= 3) {
							Iterator<Cell> cellIterator = row.cellIterator();
							int colCount = 0;
							VRVehicleRecord vrVehicleRecord = new VRVehicleRecordImpl();
							while (cellIterator.hasNext()) {
								
								Cell cell = cellIterator.next();
								DataFormatter formatter = new DataFormatter();
								System.out.println(formatter.formatCellValue(cell) + "|" + colCount);
								switch (colCount) {
								case 1:
									vrVehicleRecord.setCertificaterecordno(formatter.formatCellValue(cell));
									break;
								case 2:
									vrVehicleRecord.setFrameNo(formatter.formatCellValue(cell));
									break;
								case 3:
									vrVehicleRecord.setEngineNo(formatter.formatCellValue(cell));
									break;
								case 4:
									vrVehicleRecord.setColor(formatter.formatCellValue(cell));
									break;
								default:
									break;
								}
								colCount++;
							}
							
							VRVehicleRecordLocalServiceUtil.createVRVehicleRecord(vrVehicleRecord);

						}

						count++;
					}
				}

			}

		} catch (Exception e) {
			_log.error(e);
		}

		return null;
	}

}

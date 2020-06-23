/**
 * 
 */
package com.fds.vr.service.util;

import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionCheckerFactoryUtil;
import com.liferay.portal.kernel.security.permission.PermissionThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;

import org.opencps.auth.utils.DLFolderUtil;

/**
 * @author ddung
 *
 */
public class FileUploadUtils {

	public static final String FOLDER_FORM_FILE = "FORM_FILE_STORE";

	public static FileEntry uploadFile(long userId, long groupId, long fileEntryId, InputStream inputStream,
			String sourceFileName, String fileType, String destination, ServiceContext serviceContext)
			throws Exception {

		FileEntry fileEntry = null;

		if (inputStream != null && Validator.isNotNull(sourceFileName)) {
//			_log.info("sourceFileName: "+sourceFileName);
//			_log.info("fileType: "+fileType);
			if (Validator.isNull(fileType)) {
				fileType = MimeTypesUtil.getContentType(sourceFileName);
//				_log.info("MimeTypesUtil.fileType: "+fileType);
			}

			String title = getFileName(sourceFileName);

			serviceContext.setAddGroupPermissions(true);
			serviceContext.setAddGuestPermissions(true);

			Calendar calendar = Calendar.getInstance();

			calendar.setTime(new Date());

			if (destination == null) {
				destination = StringPool.BLANK;
			}

			destination += calendar.get(Calendar.YEAR) + StringPool.SLASH;
			destination += calendar.get(Calendar.MONTH) + StringPool.SLASH;
			destination += calendar.get(Calendar.DAY_OF_MONTH);

			DLFolder dlFolder = DLFolderUtil.getTargetFolder(userId, groupId, groupId, false, 0, destination,
					StringPool.BLANK, false, serviceContext);

			User user = UserLocalServiceUtil.getUser(serviceContext.getUserId());

			PermissionChecker checker = PermissionCheckerFactoryUtil.create(user);
			PermissionThreadLocal.setPermissionChecker(checker);

			if (fileEntryId > 0) {
				fileEntry = DLAppLocalServiceUtil.updateFileEntry(userId, fileEntryId, sourceFileName, fileType, title,
						title, title, true, FileUtil.getBytes(inputStream), serviceContext);
			} else {
				fileEntry = DLAppLocalServiceUtil.addFileEntry(userId, groupId, dlFolder.getFolderId(), title, fileType,
						title, title, StringPool.BLANK, FileUtil.getBytes(inputStream), serviceContext);
			}

		}

		return fileEntry;
	}

	public static FileEntry uploadFormDataFile(long userId, long groupId, InputStream inputStream,
			String sourceFileName, String fileType, ServiceContext serviceContext) throws Exception {

		return uploadFile(userId, groupId, 0, inputStream, sourceFileName, fileType, FOLDER_FORM_FILE, serviceContext);
	}

	private static String getFileName(String sourceFileName) {
		String ext = FileUtil.getExtension(sourceFileName);

		return System.currentTimeMillis() + "." + ext;
	}

	public static File getFile(long fileEntryId) {
		File tempFile = null;
		try {
			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(fileEntryId);

			tempFile = DLFileEntryLocalServiceUtil.getFile(fileEntry.getFileEntryId(), fileEntry.getVersion(),
					true);

		} catch (Exception e) {
			// TODO: handle exception
		}

		return tempFile;
	}

	public static String fileToString(File file) {
		String content = StringPool.BLANK;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file.getAbsolutePath()));
			StringBuilder stringBuilder = new StringBuilder();
			char[] buffer = new char[10];
			while (reader.read(buffer) != -1) {
				stringBuilder.append(new String(buffer));
				buffer = new char[10];
			}
			reader.close();
			content = stringBuilder.toString();
		} catch (Exception e) {
		}
		return content;
	}
}

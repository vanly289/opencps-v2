package vn.gt.tool.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeoutException;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;

import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFileVersion;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFileVersionLocalServiceUtil;
import com.liferay.document.library.kernel.store.DLStoreUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import com.liferay.portal.kernel.util.FileUtil;

import vn.gt.dao.model.CompressFileLog;
import vn.gt.dao.service.CompressFileLogLocalServiceUtil;

public class CompressFileUtil {
	public static void compressFile(long hoSoId, long fileEntryId) {
		
		long oldSize = 0;
		File temp = null;
		File fileTemp = null;
		try {
			CompressFileLog compressFileLog = CompressFileLogLocalServiceUtil.getCompressFileLog(fileEntryId);
			
			if(compressFileLog != null) {
				_log.info("COMPRESSED:" + hoSoId + " " + fileEntryId);
				return ;
			}
			
			DLFileEntry flEntry = DLFileEntryLocalServiceUtil.getFileEntry(fileEntryId);
			DLFileVersion fileVersion = flEntry.getFileVersion();
			
			boolean hasFile = DLStoreUtil.hasFile(flEntry.getCompanyId(), flEntry.getDataRepositoryId(), flEntry.getName());
					
			if(hasFile) {
				
				_log.info("COMPRESS:" + flEntry.getFileEntryId() + " " + flEntry.getSize());
				
				oldSize = flEntry.getSize();
				
				if(flEntry.getTitle().toLowerCase().contains(".pdf")) {
					InputStream is = flEntry.getContentStream();
					
					temp = FileUtil.createTempFile(is);
					
					String fileName = "/tmp/"+ flEntry.getFileEntryId() + "_" + String.valueOf(System.currentTimeMillis()) + ".pdf";
					
					String command = "/usr/bin/gs -q "
							+ "-dNOPAUSE -dBATCH -dSAFER "
							+ "-sDEVICE=pdfwrite "
							+ "-dCompatibilityLevel=1.3 -dPDFSETTINGS=/screen -dEmbedAllFonts=true -dSubsetFonts=true "
							+ "-dColorImageDownsampleType=/Bicubic -dColorImageResolution=72 "
							+ "-dGrayImageDownsampleType=/Bicubic -dGrayImageResolution=72 "
							+ "-dMonoImageDownsampleType=/Bicubic -dMonoImageResolution=72 "
							+ "-sOutputFile=" + fileName + " " + temp.getAbsolutePath();
					
					int exitValue = executeCommandLine(command, 120000);	// 2 minute
		
					if (exitValue == 0) {
						fileTemp = new File(fileName);
						
						byte[] bytes = FileUtil.getBytes(fileTemp);
						
						long size = bytes.length;
						
						DLStoreUtil.deleteFile(flEntry.getCompanyId(), flEntry.getDataRepositoryId(), flEntry.getName());
						
						DLStoreUtil.addFile(flEntry.getCompanyId(), flEntry.getDataRepositoryId(), flEntry.getName(), bytes);
						
						fileVersion.setSize(size);
						DLFileVersionLocalServiceUtil.updateDLFileVersion(fileVersion);
						
						flEntry.setSize(size);
						DLFileEntryLocalServiceUtil.updateDLFileEntry(flEntry);
						
						CompressFileLogLocalServiceUtil.addCompressFileLog(hoSoId, 
								fileEntryId, oldSize, size);
						
						_log.info("COMPRESS:" + flEntry.getFileEntryId() + " " + size);
					}
				} else if(flEntry.getTitle().toLowerCase().contains(".jpg")) {
					InputStream is = flEntry.getContentStream();
					
					temp = FileUtil.createTempFile(is);
					
					String fileName = "/tmp/"+ flEntry.getFileEntryId() + "_" + String.valueOf(System.currentTimeMillis()) + ".jpg";
					
					fileTemp = new File(fileName);
					
					compressImage(temp, fileTemp);
					
					byte[] bytes = FileUtil.getBytes(fileTemp);
					
					long size = bytes.length;
					
					DLStoreUtil.deleteFile(flEntry.getCompanyId(), flEntry.getDataRepositoryId(), flEntry.getName());
					
					DLStoreUtil.addFile(flEntry.getCompanyId(), flEntry.getDataRepositoryId(), flEntry.getName(), bytes);
					
					fileVersion.setSize(size);
					DLFileVersionLocalServiceUtil.updateDLFileVersion(fileVersion);
					
					flEntry.setSize(size);
					flEntry.setModifiedDate(new Date());
					DLFileEntryLocalServiceUtil.updateDLFileEntry(flEntry);
					
					CompressFileLogLocalServiceUtil.addCompressFileLog(hoSoId, 
							fileEntryId, oldSize, size);
					
					_log.info("COMPRESS:" + flEntry.getFileEntryId() + " " + size);
				}
				_log.info("ok");
			}
		} catch(Exception e) {
			try {
				CompressFileLogLocalServiceUtil.addCompressFileLog(hoSoId, 
						fileEntryId, oldSize, 0, false, e.getMessage());
			} catch (SystemException e1) {
				_log.error(e1);
			}
			_log.error(e);
		} finally {
			if(temp != null) {
				FileUtil.delete(temp);
			}
			
			if(fileTemp != null) {
				FileUtil.delete(fileTemp);
			}
		}
	}
	
	public static void compressImage(File originalImage, File newImage) throws IOException {

		OutputStream os = new FileOutputStream(newImage);

		float quality = 0.5f;

		// create a BufferedImage as the result of decoding the supplied InputStream
		BufferedImage image = ImageIO.read(originalImage);

		// get all image writers for JPG format
		Iterator<ImageWriter> writers = ImageIO.getImageWritersByFormatName("jpg");

		if (!writers.hasNext()) {
			os.close();
			throw new IllegalStateException("No writers found");
		}

		ImageWriter writer = (ImageWriter) writers.next();
		ImageOutputStream ios = ImageIO.createImageOutputStream(os);
		writer.setOutput(ios);

		ImageWriteParam param = writer.getDefaultWriteParam();

		// compress to a given quality
		param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
		param.setCompressionQuality(quality);

		// appends a complete image stream containing a single image and
	    //associated stream and image metadata and thumbnails to the output
		writer.write(null, new IIOImage(image, null, null), param);

		// close all streams
		os.close();
		ios.close();
		writer.dispose();
	}
	
	public static long getCompressFileSumSize(String column) {
		long sum = 0;
		
		try {
			DynamicQuery query = DynamicQueryFactoryUtil.forClass(CompressFileLog.class, 
					PortletClassLoaderUtil.getClassLoader())
					.setProjection(ProjectionFactoryUtil.sum(column));
			
			sum = totalSize(query);
		} catch(Exception e) {
			_log.error(e);
		}
		
		return sum;
	}
	
	private static long totalSize(DynamicQuery query) throws SystemException {
		@SuppressWarnings("unchecked")
		List<Object> result = CompressFileLogLocalServiceUtil.dynamicQuery(query);
		if (result != null && result.size() > 0 && result.get(0) != null) {
			return (Long) result.get(0);
		} else {
			return 0;
		}
	}
	
	public static int executeCommandLine(final String commandLine,
			final long timeout) throws IOException, InterruptedException, TimeoutException {
		Runtime runtime = Runtime.getRuntime();
		Process process = runtime.exec(commandLine);
		Worker worker = new Worker(process);
		worker.start();
		try {
			worker.join(timeout);
			if (worker.exit != null)
				return worker.exit;
			else
				throw new TimeoutException();
		} catch (InterruptedException ex) {
			worker.interrupt();
			Thread.currentThread().interrupt();
			throw ex;
		} finally {
			process.destroy();
		}
	}

	private static class Worker extends Thread {
		private final Process process;
		private Integer exit;

		private Worker(Process process) {
			this.process = process;
		}

		public void run() {
			try {
				exit = process.waitFor();
			} catch (InterruptedException ignore) {
				return;
			}
		}
	}
	
	private static Log _log = LogFactoryUtil.getLog(CompressFileUtil.class);
}

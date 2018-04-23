package org.opencps.thirdparty.system.util;

import org.opencps.thirdparty.system.nsw.model.NSWRequest;
import org.opencps.thirdparty.system.scheduler.SOAPConverter;

public class OutsideSystemConverter {
	public static String convertToNSWXML(NSWRequest nswRequest) {
		return "<officeCode>" + nswRequest.getOfficeCode() + "</officeCode>\n<documentType>" + nswRequest.getDocumentType() + "</documentType>\n" + SOAPConverter.convertNSWRequest(nswRequest.getRequestPayload());
	}
}

package org.opencps.thirdparty.system.util;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.opencps.thirdparty.system.nsw.model.Envelope;
import org.opencps.thirdparty.system.nsw.model.NSWRequest;
import org.opencps.thirdparty.system.scheduler.SOAPConverter;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class OutsideSystemConverter {
	public static String convertToNSWXML(NSWRequest nswRequest) {
		return "<officeCode>" + nswRequest.getOfficeCode() + "</officeCode>\n<documentType>" + nswRequest.getDocumentType() + "</documentType>\n" + SOAPConverter.convertNSWRequest(nswRequest.getRequestPayload());
	}

	public static String convertToNSWXML(Envelope envelope) {
		return SOAPConverter.convertNSWRequest(envelope);
	}
	
	public static String convertToNSWXMLVT(org.opencps.thirdparty.system.nsw.vt.model.NSWRequest nswRequest) {
		return "<officeCode>" + nswRequest.getOfficeCode() + "</officeCode>\n<documentType>" + nswRequest.getDocumentType() + "</documentType>\n" + SOAPConverter.convertNSWRequestVT(nswRequest.getRequestPayload());
	}
	
	public static String convertToNSWXMLVT(org.opencps.thirdparty.system.nsw.vt.model.Envelope envelope) {
		return SOAPConverter.convertNSWRequestVT(envelope);
	}	
	
	public static String removeTag(String xmlData, String parentNodeName, String tagName) {
		
		String newXMLData = "";
		
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			InputSource is = new InputSource();
			is.setCharacterStream(new StringReader(xmlData));
	
			Document doc = db.parse(is);
			
			Node parentNode = doc.getElementsByTagName(parentNodeName).item(0);
			NodeList nodeList = doc.getElementsByTagName(tagName);
			for (int i = 0; i < nodeList.getLength(); i++) {
				parentNode.removeChild(nodeList.item(i));
			}
			
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");

			StreamResult result = new StreamResult(new StringWriter());
			DOMSource source = new DOMSource(doc);
			transformer.transform(source, result);

			return result.getWriter().toString();
		} catch(Exception e) {
			newXMLData = xmlData;
		}
		
		return newXMLData;
		
	}
}

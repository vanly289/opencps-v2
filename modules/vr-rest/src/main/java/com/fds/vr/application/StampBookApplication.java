package com.fds.vr.application;

import java.util.Collections;
import java.util.Date;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.osgi.service.component.annotations.Component;

import com.fds.vr.business.model.VRInputSheet;
import com.fds.vr.business.model.VROutputSheet;
import com.fds.vr.business.model.VROutputSheetDetails;
import com.fds.vr.business.service.VRInputSheetLocalServiceUtil;
import com.fds.vr.business.service.VRInputStampbookLocalServiceUtil;
import com.fds.vr.business.service.VROutputSheetDetailsLocalServiceUtil;
import com.fds.vr.business.service.VROutputSheetLocalServiceUtil;
import com.fds.vr.util.DateTimeUtils;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

@ApplicationPath("/vr-stamp")
@Component(immediate = true, service = Application.class)
public class StampBookApplication extends Application {
public Set<Object> getSingletons() {
		
		return Collections.<Object>singleton(this);
	}

	@POST
	@Path("/inputsheet")
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response addInputSheet(@Context HttpHeaders header,
			@FormParam("inputSheetNo") String inputSheetNo, @FormParam("inputSheetDate") String paramInputSheetDate, 
			@FormParam("originalDocumentNo") String originalDocumentNo, @FormParam("corporationId") Long corporationId, 
			@FormParam("inputSheetType") Long inputSheetType, @FormParam("maker") String maker, 
			@FormParam("checker") String checker, @FormParam("approver") String approver, 
			@FormParam("deliveryName") String deliveryName, @FormParam("inventoryName") String inventoryName, 
			@FormParam("inventoryPlace") String inventoryPlace, @FormParam("inventoryDate") String paramInventoryDate, 
			@FormParam("bookIDList") String bookIDList, @FormParam("isApproval") Long isApproval, 
			@FormParam("totalQuantities") Long totalQuantities, @FormParam("totalAmount") Long totalAmount, 
			@FormParam("amountInWords") String amountInWords, @FormParam("remark") String remark, @FormParam("stampbooks") String stampbooks) {
		
		// long groupId = GetterUtil.getLong(header.getHeaderString(Field.GROUP_ID));
	
		JSONObject jsObj = JSONFactoryUtil.createJSONObject();
		try {
			Date inputSheetDate = DateTimeUtils.stringToDate(paramInputSheetDate);
			Date inventoryDate = DateTimeUtils.stringToDate(paramInventoryDate);
			
			VRInputSheet inputSheet = VRInputSheetLocalServiceUtil.updateInputSheet(0l, 1l, inputSheetNo,
					inputSheetDate, originalDocumentNo, corporationId, inputSheetType, maker, checker, approver,
					deliveryName, inventoryName, inventoryPlace, inventoryDate, bookIDList, isApproval, totalQuantities,
					totalAmount, amountInWords, remark, stampbooks);
			
			return Response.status(200).entity(JSONFactoryUtil.looseSerialize(inputSheet)).build();
		} catch (Exception e) {
			_log.error(e);
			jsObj.put("status", "error");
			jsObj.put("msg", e.getClass().getName());
			return Response.status(500).entity(jsObj.toString()).build();
		}
	}
	
	@PUT
	@Path("/inputsheet/{id}")
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response updateInputSheet(@Context HttpHeaders header,
			@PathParam("id") long inputSheetId,
			@FormParam("inputSheetNo") String inputSheetNo, @FormParam("inputSheetDate") String paramInputSheetDate, 
			@FormParam("originalDocumentNo") String originalDocumentNo, @FormParam("corporationId") Long corporationId, 
			@FormParam("inputSheetType") Long inputSheetType, @FormParam("maker") String maker, 
			@FormParam("checker") String checker, @FormParam("approver") String approver, 
			@FormParam("deliveryName") String deliveryName, @FormParam("inventoryName") String inventoryName, 
			@FormParam("inventoryPlace") String inventoryPlace, @FormParam("inventoryDate") String paramInventoryDate, 
			@FormParam("bookIDList") String bookIDList, @FormParam("isApproval") Long isApproval, 
			@FormParam("totalQuantities") Long totalQuantities, @FormParam("totalAmount") Long totalAmount, 
			@FormParam("amountInWords") String amountInWords, @FormParam("remark") String remark, @FormParam("stampbooks") String stampbooks) {
		
		JSONObject jsObj = JSONFactoryUtil.createJSONObject();
		try {
			Date inputSheetDate = DateTimeUtils.stringToDate(paramInputSheetDate);
			Date inventoryDate = DateTimeUtils.stringToDate(paramInventoryDate);
			
			VRInputSheet inputSheet = VRInputSheetLocalServiceUtil.updateInputSheet(inputSheetId, 1l, inputSheetNo,
					inputSheetDate, originalDocumentNo, corporationId, inputSheetType, maker, checker, approver,
					deliveryName, inventoryName, inventoryPlace, inventoryDate, bookIDList, isApproval, totalQuantities,
					totalAmount, amountInWords, remark, stampbooks);
			
			return Response.status(200).entity(JSONFactoryUtil.looseSerialize(inputSheet)).build();
		} catch (Exception e) {
			_log.error(e);
			jsObj.put("status", "error");
			jsObj.put("msg", e.getClass().getName());
			return Response.status(500).entity(jsObj.toString()).build();
		}
	}
	
	@DELETE
	@Path("/inputstampbooks/{id}")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response deleteStampBook(@Context HttpHeaders header,
			@PathParam("id") long stampbookId) {
	
		// long groupId = GetterUtil.getLong(header.getHeaderString(Field.GROUP_ID));
	
		JSONObject jsObj = JSONFactoryUtil.createJSONObject();
		try {
			VRInputStampbookLocalServiceUtil.deleteVRInputStampbook(stampbookId);
			jsObj.put("status", "done");
			
			return Response.status(200).entity(jsObj.toString()).build();
		} catch (Exception e) {
			_log.error(e);
			jsObj.put("status", "error");
			jsObj.put("msg", e.getClass().getName());
			return Response.status(500).entity(jsObj.toString()).build();
		}
	}
	
	@POST
	@Path("/outputsheet")
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response addOutputSheet(@Context HttpHeaders header,
			@FormParam("outputSheetNo") String outputSheetNo, @FormParam("outputSheetDate") String outputSheetDate, 
			@FormParam("originalDocumentNo") String originalDocumentNo, @FormParam("supplierCorporationId") String supplierCorporationId,
			@FormParam("outputSheetType") Long outputSheetType, @FormParam("maker") String maker,
			@FormParam("checker") String checker, @FormParam("approver") String approver,
			@FormParam("receiverName") String receiverName, @FormParam("receiverPlace") String receiverPlace,
			@FormParam("receiverRequest") String receiverRequest, @FormParam("inventoryName") String inventoryName,
			@FormParam("inventoryPlace") String inventoryPlace, @FormParam("inventoryDate") String inventoryDate,
			@FormParam("dossierId") Long dossierId, @FormParam("issueId") Long issueId,
			@FormParam("purchaserId") String purchaserId, @FormParam("purchaserCorporationId") String purchaserCorporationId,
			@FormParam("bookIDList") String bookIDList, @FormParam("isApproval") Long isApproval,
			@FormParam("totalQuantities") Long totalQuantities, @FormParam("totalAmount") Long totalAmount,
			@FormParam("amountInWords") String amountInWords, @FormParam("remark") String remark) {
	
		// long groupId = GetterUtil.getLong(header.getHeaderString(Field.GROUP_ID));
	
		JSONObject jsObj = JSONFactoryUtil.createJSONObject();
		try {
			Date _outputSheetDate = DateTimeUtils.stringToDate(outputSheetDate);
			Date _inventoryDate = DateTimeUtils.stringToDate(inventoryDate);
			
			VROutputSheet outputSheet = VROutputSheetLocalServiceUtil.updateOutputSheet(0l, 1l, outputSheetNo,
					_outputSheetDate, originalDocumentNo, supplierCorporationId, outputSheetType, maker, checker,
					approver, receiverName, receiverPlace, receiverRequest, inventoryName, inventoryPlace,
					_inventoryDate, dossierId, issueId, purchaserId, purchaserCorporationId, bookIDList, isApproval,
					totalQuantities, totalAmount, amountInWords, remark);
			
			return Response.status(200).entity(JSONFactoryUtil.looseSerialize(outputSheet)).build();
		} catch (Exception e) {
			_log.error(e);
			jsObj.put("status", "error");
			jsObj.put("msg", e.getClass().getName());
			return Response.status(500).entity(jsObj.toString()).build();
		}
	}
	
	@PUT
	@Path("/outputsheet/{id}")
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response updateOutputSheet(@Context HttpHeaders header, @PathParam("id") long id, 
			@FormParam("outputSheetNo") String outputSheetNo, @FormParam("outputSheetDate") String outputSheetDate, 
			@FormParam("originalDocumentNo") String originalDocumentNo, @FormParam("supplierCorporationId") String supplierCorporationId,
			@FormParam("outputSheetType") Long outputSheetType, @FormParam("maker") String maker,
			@FormParam("checker") String checker, @FormParam("approver") String approver,
			@FormParam("receiverName") String receiverName, @FormParam("receiverPlace") String receiverPlace,
			@FormParam("receiverRequest") String receiverRequest, @FormParam("inventoryName") String inventoryName,
			@FormParam("inventoryPlace") String inventoryPlace, @FormParam("inventoryDate") String inventoryDate,
			@FormParam("dossierId") Long dossierId, @FormParam("issueId") Long issueId,
			@FormParam("purchaserId") String purchaserId, @FormParam("purchaserCorporationId") String purchaserCorporationId,
			@FormParam("bookIDList") String bookIDList, @FormParam("isApproval") Long isApproval,
			@FormParam("totalQuantities") Long totalQuantities, @FormParam("totalAmount") Long totalAmount,
			@FormParam("amountInWords") String amountInWords, @FormParam("remark") String remark) {
	
		// long groupId = GetterUtil.getLong(header.getHeaderString(Field.GROUP_ID));
	
		JSONObject jsObj = JSONFactoryUtil.createJSONObject();
		try {
			Date _outputSheetDate = DateTimeUtils.stringToDate(outputSheetDate);
			Date _inventoryDate = DateTimeUtils.stringToDate(inventoryDate);
			
			VROutputSheet outputSheet = VROutputSheetLocalServiceUtil.updateOutputSheet(id, 1l, outputSheetNo,
					_outputSheetDate, originalDocumentNo, supplierCorporationId, outputSheetType, maker, checker,
					approver, receiverName, receiverPlace, receiverRequest, inventoryName, inventoryPlace,
					_inventoryDate, dossierId, issueId, purchaserId, purchaserCorporationId, bookIDList, isApproval,
					totalQuantities, totalAmount, amountInWords, remark);
			
			return Response.status(200).entity(JSONFactoryUtil.looseSerialize(outputSheet)).build();
		} catch (Exception e) {
			_log.error(e);
			jsObj.put("status", "error");
			jsObj.put("msg", e.getClass().getName());
			return Response.status(500).entity(jsObj.toString()).build();
		}
	}
	
	@POST
	@Path("/outputsheet/{id}/details")
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response addOutputSheetDetails(@Context HttpHeaders header, @PathParam("id") long outputSheetId,
			@FormParam("inputSheetId") Long inputSheetId, @FormParam("bookId") Long bookId, 
			@FormParam("issueVehicleCertificateId") Long issueVehicleCertificateId, @FormParam("certificateId") Long certificateId,
			@FormParam("certificateNumber") String certificateNumber, @FormParam("certificateDate") String certificateDate,
			@FormParam("vehicleClass") String vehicleClass, @FormParam("stampType") String stampType,
			@FormParam("stampShortNo") String stampShortNo, @FormParam("serialStartNo") Long serialStartNo,
			@FormParam("serialEndNo") Long serialEndNo, @FormParam("subTotalInDocument") Long subTotalInDocument,
			@FormParam("subTotalQuantities") Long subTotalQuantities, @FormParam("unitPrice") Long unitPrice,
			@FormParam("totalAmount") Long totalAmount, @FormParam("totalInUse") Long totalInUse,
			@FormParam("totalNotUsed") Long totalNotUsed, @FormParam("totalLost") Long totalLost,
			@FormParam("totalCancelled") Long totalCancelled, @FormParam("totalReturned") Long totalReturned, @FormParam("remark") String remark
			) {
	
		// long groupId = GetterUtil.getLong(header.getHeaderString(Field.GROUP_ID));
	
		JSONObject jsObj = JSONFactoryUtil.createJSONObject();
		try {
			Date _certificateDate = DateTimeUtils.stringToDate(certificateDate);
			
			VROutputSheetDetails outputSheetDetails = VROutputSheetDetailsLocalServiceUtil.updateOutputSheetDetails(0l, 1l,
					inputSheetId, outputSheetId, bookId, issueVehicleCertificateId, certificateId, certificateNumber,
					_certificateDate, vehicleClass, stampType, stampShortNo, serialStartNo, serialEndNo,
					subTotalInDocument, subTotalQuantities, unitPrice, totalAmount, totalInUse, totalNotUsed, totalLost,
					totalCancelled, totalReturned, remark);
			
			return Response.status(200).entity(JSONFactoryUtil.looseSerialize(outputSheetDetails)).build();
		} catch (Exception e) {
			_log.error(e);
			jsObj.put("status", "error");
			jsObj.put("msg", e.getClass().getName());
			return Response.status(500).entity(jsObj.toString()).build();
		}
	}
	
	@PUT
	@Path("/outputsheet/{id}/details/{outputsheetDetailId}")
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response updateOutputSheetDetails(@Context HttpHeaders header, @PathParam("id") long outputSheetId, @PathParam("outputsheetDetailId") long outputsheetDetailId,
			@FormParam("inputSheetId") Long inputSheetId, @FormParam("bookId") Long bookId, 
			@FormParam("issueVehicleCertificateId") Long issueVehicleCertificateId, @FormParam("certificateId") Long certificateId,
			@FormParam("certificateNumber") String certificateNumber, @FormParam("certificateDate") String certificateDate,
			@FormParam("vehicleClass") String vehicleClass, @FormParam("stampType") String stampType,
			@FormParam("stampShortNo") String stampShortNo, @FormParam("serialStartNo") Long serialStartNo,
			@FormParam("serialEndNo") Long serialEndNo, @FormParam("subTotalInDocument") Long subTotalInDocument,
			@FormParam("subTotalQuantities") Long subTotalQuantities, @FormParam("unitPrice") Long unitPrice,
			@FormParam("totalAmount") Long totalAmount, @FormParam("totalInUse") Long totalInUse,
			@FormParam("totalNotUsed") Long totalNotUsed, @FormParam("totalLost") Long totalLost,
			@FormParam("totalCancelled") Long totalCancelled, @FormParam("totalReturned") Long totalReturned, @FormParam("remark") String remark
			) {
	
		JSONObject jsObj = JSONFactoryUtil.createJSONObject();
		try {
			Date _certificateDate = DateTimeUtils.stringToDate(certificateDate);
			
			VROutputSheetDetails outputSheetDetails = VROutputSheetDetailsLocalServiceUtil.updateOutputSheetDetails(outputsheetDetailId, 1l,
					inputSheetId, outputSheetId, bookId, issueVehicleCertificateId, certificateId, certificateNumber,
					_certificateDate, vehicleClass, stampType, stampShortNo, serialStartNo, serialEndNo,
					subTotalInDocument, subTotalQuantities, unitPrice, totalAmount, totalInUse, totalNotUsed, totalLost,
					totalCancelled, totalReturned, remark);
			
			return Response.status(200).entity(JSONFactoryUtil.looseSerialize(outputSheetDetails)).build();
		} catch (Exception e) {
			_log.error(e);
			jsObj.put("status", "error");
			jsObj.put("msg", e.getClass().getName());
			return Response.status(500).entity(jsObj.toString()).build();
		}
	}
	
	@DELETE
	@Path("/outputsheet/{id}/details/{outputsheetDetailId}")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response deleteOutputSheetDetails(@Context HttpHeaders header,
			@PathParam("id") long outputsheetId, @PathParam("outputsheetDetailId") long outputsheetDetailId) {
	
		JSONObject jsObj = JSONFactoryUtil.createJSONObject();
		try {
			VROutputSheetDetailsLocalServiceUtil.deleteVROutputSheetDetails(outputsheetDetailId);
			jsObj.put("status", "done");
			
			return Response.status(200).entity(jsObj.toString()).build();
		} catch (Exception e) {
			_log.error(e);
			jsObj.put("status", "error");
			jsObj.put("msg", e.getClass().getName());
			return Response.status(500).entity(jsObj.toString()).build();
		}
	}

	@GET
	@Produces("text/plain")
	public String working() {
		return "It works!";
	}
	
	private static final Log _log = LogFactoryUtil.getLog(StampBookApplication.class);
}

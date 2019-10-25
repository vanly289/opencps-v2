package com.fds.vr.controler;

import com.fds.vr.model.VRProductTypeApiModel;
import com.fds.vr.model.VRProductionPlantApiModel;
import com.fds.vr.model.VRProductionPlantBeanParam;
import com.fds.vr.model.VRProductionPlantEmployeeApiModel;
import com.fds.vr.model.VRProductionPlantEquipmentApiModel;
import com.fds.vr.model.VRProductionPlantProdEquipmentApiModel;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.swagger.annotations.ApiOperation;

/**
 * @author trungnt
 *
 */
@Path("/production/")
public interface VRProductionManagement {

	@GET
	@Path("/plant/search")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findProductionPlant(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @BeanParam VRProductionPlantBeanParam query);

	@GET
	@Path("/equipment/{productionPlantCode}/{productClassificationCode}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getProductionPlantEquipment(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext,
			@DefaultValue(" ") @PathParam("productionPlantCode") String productionPlantCode,
			@DefaultValue(" ") @PathParam("productClassificationCode") String productClassificationCode);

	@GET
	@Path("/prodequipment/{productionPlantCode}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getProductionPlantProdEquipment(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext,
			@DefaultValue(" ") @PathParam("productionPlantCode") String productionPlantCode);

	@GET
	@Path("/type/{productionPlantCode}/{productClassificationCode}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getProductType(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext,
			@DefaultValue(" ") @PathParam("productionPlantCode") String productionPlantCode,
			@DefaultValue(" ") @PathParam("productClassificationCode") String productClassificationCode);

	@GET
	@Path("/classification/{productionPlantCode}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getProductionClassification(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext,
			@DefaultValue(" ") @PathParam("productionPlantCode") String productionPlantCode);

	@GET
	@Path("/employee/{productionPlantCode}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getProductionPlantEmployee(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext,
			@DefaultValue(" ") @PathParam("productionPlantCode") String productionPlantCode);

	@PUT
	@Path("/plant/")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "create VRProductionPlant", tags={ "vrproductionplantapimodel"})
	public Response createVRProductionPlant(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, VRProductionPlantApiModel model);
	
	@POST
	@Path("/plant/")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "create VRProductionPlant", tags={ "vrproductionplantapimodel"})
	public Response updateVRProductionPlant(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, VRProductionPlantApiModel model);
	
	@PUT
	@Path("/employee/")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "create VRProductionPlant", tags={ "vrproductionplantapimodel"})
	public Response createVRProductionPlantEmployee(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, VRProductionPlantEmployeeApiModel model);
	
	@POST
	@Path("/employee/")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "create VRProductionPlant", tags={ "vrproductionplantapimodel"})
	public Response updateVRProductionPlantEmployee(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, VRProductionPlantEmployeeApiModel model);
	
	@PUT
	@Path("/equipment/")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "create VRProductionPlant", tags={ "vrproductionplantapimodel"})
	public Response createVRProductionPlantEquiptment(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, VRProductionPlantEquipmentApiModel model);
	
	@POST
	@Path("/equipment/")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "create VRProductionPlant", tags={ "vrproductionplantapimodel"})
	public Response updateVRProductionPlantEquiptment(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, VRProductionPlantEquipmentApiModel model);
	
	@PUT
	@Path("/prodequipment/")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "create VRProductionPlant", tags={ "vrproductionplantapimodel"})
	public Response createVRProductionPlantProdEquiment(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, VRProductionPlantProdEquipmentApiModel model);
	
	@POST
	@Path("/prodequipment/")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "create VRProductionPlant", tags={ "vrproductionplantapimodel"})
	public Response updateVRProductionPlantProdEquiment(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, VRProductionPlantProdEquipmentApiModel model);
	
	@PUT
	@Path("/type/")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "create VRProductionPlant", tags={ "vrproductionplantapimodel"})
	public Response createVRProductType(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, VRProductTypeApiModel model);
	
	@POST
	@Path("/type/")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "create VRProductionPlant", tags={ "vrproductionplantapimodel"})
	public Response updateVRProductType(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, VRProductTypeApiModel model);
	
}

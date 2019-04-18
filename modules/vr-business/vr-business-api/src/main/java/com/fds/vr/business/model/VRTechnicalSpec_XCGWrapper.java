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

package com.fds.vr.business.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link VRTechnicalSpec_XCG}.
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCG
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCGWrapper implements VRTechnicalSpec_XCG,
	ModelWrapper<VRTechnicalSpec_XCG> {
	public VRTechnicalSpec_XCGWrapper(VRTechnicalSpec_XCG vrTechnicalSpec_XCG) {
		_vrTechnicalSpec_XCG = vrTechnicalSpec_XCG;
	}

	@Override
	public Class<?> getModelClass() {
		return VRTechnicalSpec_XCG.class;
	}

	@Override
	public String getModelClassName() {
		return VRTechnicalSpec_XCG.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("convertAssembleId", getConvertAssembleId());
		attributes.put("dossierId", getDossierId());
		attributes.put("dossierNo", getDossierNo());
		attributes.put("referenceUid", getReferenceUid());
		attributes.put("dossierIdCTN", getDossierIdCTN());
		attributes.put("deliverableCode", getDeliverableCode());
		attributes.put("loai_dong_co", getLoai_dong_co());
		attributes.put("XCG01001", getXCG01001());
		attributes.put("XCG01002", getXCG01002());
		attributes.put("XCG01003", getXCG01003());
		attributes.put("XCG01004", getXCG01004());
		attributes.put("XCG01005", getXCG01005());
		attributes.put("XCG01006", getXCG01006());
		attributes.put("XCG01007", getXCG01007());
		attributes.put("XCG01008", getXCG01008());
		attributes.put("XCG01009", getXCG01009());
		attributes.put("XCG01010", getXCG01010());
		attributes.put("XCG01011", getXCG01011());
		attributes.put("XCG01012", getXCG01012());
		attributes.put("XCG01013", getXCG01013());
		attributes.put("XCG01014", getXCG01014());
		attributes.put("XCG01016", getXCG01016());
		attributes.put("XCG01017", getXCG01017());
		attributes.put("XCG01019", getXCG01019());
		attributes.put("XCG01020", getXCG01020());
		attributes.put("XCG01021", getXCG01021());
		attributes.put("XCG01022", getXCG01022());
		attributes.put("XCG01024", getXCG01024());
		attributes.put("XCG01025", getXCG01025());
		attributes.put("XCG01026", getXCG01026());
		attributes.put("XCG01027", getXCG01027());
		attributes.put("XCG01028", getXCG01028());
		attributes.put("XCG01030", getXCG01030());
		attributes.put("XCG01031", getXCG01031());
		attributes.put("XCG01032", getXCG01032());
		attributes.put("XCG01033", getXCG01033());
		attributes.put("XCG01034", getXCG01034());
		attributes.put("XCG01035", getXCG01035());
		attributes.put("XCG01036", getXCG01036());
		attributes.put("XCG01037", getXCG01037());
		attributes.put("XCG01038", getXCG01038());
		attributes.put("XCG01039", getXCG01039());
		attributes.put("XCG01040", getXCG01040());
		attributes.put("XCG01041", getXCG01041());
		attributes.put("XCG01042", getXCG01042());
		attributes.put("XCG01043", getXCG01043());
		attributes.put("XCG01044", getXCG01044());
		attributes.put("XCG01045", getXCG01045());
		attributes.put("XCG01046", getXCG01046());
		attributes.put("XCG01047", getXCG01047());
		attributes.put("XCG01049", getXCG01049());
		attributes.put("XCG01050", getXCG01050());
		attributes.put("XCG01051", getXCG01051());
		attributes.put("XCG01052", getXCG01052());
		attributes.put("XCG01053", getXCG01053());
		attributes.put("XCG01054", getXCG01054());
		attributes.put("XCG01055", getXCG01055());
		attributes.put("XCG01056", getXCG01056());
		attributes.put("XCG01057", getXCG01057());
		attributes.put("XCG01058", getXCG01058());
		attributes.put("XCG01059", getXCG01059());
		attributes.put("XCG01060", getXCG01060());
		attributes.put("XCG01062", getXCG01062());
		attributes.put("XCG01063", getXCG01063());
		attributes.put("XCG01064", getXCG01064());
		attributes.put("XCG01065", getXCG01065());
		attributes.put("XCG01066", getXCG01066());
		attributes.put("XCG01067", getXCG01067());
		attributes.put("XCG01068", getXCG01068());
		attributes.put("XCG01069", getXCG01069());
		attributes.put("XCG01070", getXCG01070());
		attributes.put("XCG01072", getXCG01072());
		attributes.put("XCG01073", getXCG01073());
		attributes.put("XCG01074", getXCG01074());
		attributes.put("XCG01075", getXCG01075());
		attributes.put("XCG01076", getXCG01076());
		attributes.put("XCG01077", getXCG01077());
		attributes.put("XCG01078", getXCG01078());
		attributes.put("XCG01079", getXCG01079());
		attributes.put("XCG01080", getXCG01080());
		attributes.put("XCG01081", getXCG01081());
		attributes.put("XCG01082", getXCG01082());
		attributes.put("XCG01083", getXCG01083());
		attributes.put("XCG01084", getXCG01084());
		attributes.put("XCG01085", getXCG01085());
		attributes.put("XCG01086", getXCG01086());
		attributes.put("XCG01087", getXCG01087());
		attributes.put("XCG01088", getXCG01088());
		attributes.put("XCG01089", getXCG01089());
		attributes.put("XCG01090", getXCG01090());
		attributes.put("XCG01091", getXCG01091());
		attributes.put("XCG01092", getXCG01092());
		attributes.put("XCG01093", getXCG01093());
		attributes.put("XCG01094", getXCG01094());
		attributes.put("XCG01095", getXCG01095());
		attributes.put("XCG01096", getXCG01096());
		attributes.put("XCG01097", getXCG01097());
		attributes.put("XCG01098", getXCG01098());
		attributes.put("XCG01099", getXCG01099());
		attributes.put("XCG01100", getXCG01100());
		attributes.put("XCG01101", getXCG01101());
		attributes.put("XCG01102", getXCG01102());
		attributes.put("XCG01103", getXCG01103());
		attributes.put("XCG01104", getXCG01104());
		attributes.put("XCG01105", getXCG01105());
		attributes.put("XCG01106", getXCG01106());
		attributes.put("XCG01107", getXCG01107());
		attributes.put("XCG01108", getXCG01108());
		attributes.put("XCG01109", getXCG01109());
		attributes.put("XCG01110", getXCG01110());
		attributes.put("XCG01111", getXCG01111());
		attributes.put("XCG01112", getXCG01112());
		attributes.put("XCG01113", getXCG01113());
		attributes.put("XCG01114", getXCG01114());
		attributes.put("XCG01115", getXCG01115());
		attributes.put("XCG01116", getXCG01116());
		attributes.put("XCG01117", getXCG01117());
		attributes.put("XCG01118", getXCG01118());
		attributes.put("XCG01119", getXCG01119());
		attributes.put("XCG01120", getXCG01120());
		attributes.put("XCG01121", getXCG01121());
		attributes.put("XCG01122", getXCG01122());
		attributes.put("XCG01123", getXCG01123());
		attributes.put("XCG01124", getXCG01124());
		attributes.put("XCG01125", getXCG01125());
		attributes.put("XCG01126", getXCG01126());
		attributes.put("XCG01127", getXCG01127());
		attributes.put("XCG01128", getXCG01128());
		attributes.put("XCG01129", getXCG01129());
		attributes.put("XCG01130", getXCG01130());
		attributes.put("XCG01131", getXCG01131());
		attributes.put("XCG01132", getXCG01132());
		attributes.put("XCG01133", getXCG01133());
		attributes.put("XCG01134", getXCG01134());
		attributes.put("XCG01135", getXCG01135());
		attributes.put("XCG01136", getXCG01136());
		attributes.put("XCG01137", getXCG01137());
		attributes.put("XCG01138", getXCG01138());
		attributes.put("XCG01139", getXCG01139());
		attributes.put("XCG01140", getXCG01140());
		attributes.put("XCG01141", getXCG01141());
		attributes.put("XCG01142", getXCG01142());
		attributes.put("XCG01143", getXCG01143());
		attributes.put("XCG01144", getXCG01144());
		attributes.put("XCG01145", getXCG01145());
		attributes.put("XCG01146", getXCG01146());
		attributes.put("XCG01147", getXCG01147());
		attributes.put("XCG01148", getXCG01148());
		attributes.put("XCG01149", getXCG01149());
		attributes.put("XCG01150", getXCG01150());
		attributes.put("XCG01151", getXCG01151());
		attributes.put("XCG01152", getXCG01152());
		attributes.put("XCG01153", getXCG01153());
		attributes.put("XCG01154", getXCG01154());
		attributes.put("XCG01155", getXCG01155());
		attributes.put("XCG01156", getXCG01156());
		attributes.put("XCG01157", getXCG01157());
		attributes.put("XCG01158", getXCG01158());
		attributes.put("XCG01159", getXCG01159());
		attributes.put("XCG01160", getXCG01160());
		attributes.put("XCG01161", getXCG01161());
		attributes.put("XCG01162", getXCG01162());
		attributes.put("XCG01163", getXCG01163());
		attributes.put("XCG01164", getXCG01164());
		attributes.put("XCG01165", getXCG01165());
		attributes.put("XCG01166", getXCG01166());
		attributes.put("XCG01167", getXCG01167());
		attributes.put("XCG01169", getXCG01169());
		attributes.put("XCG01170", getXCG01170());
		attributes.put("XCG01171", getXCG01171());
		attributes.put("XCG01172", getXCG01172());
		attributes.put("XCG01173", getXCG01173());
		attributes.put("XCG01174", getXCG01174());
		attributes.put("XCG01175", getXCG01175());
		attributes.put("XCG01176", getXCG01176());
		attributes.put("XCG01177", getXCG01177());
		attributes.put("XCG01178", getXCG01178());
		attributes.put("XCG01179", getXCG01179());
		attributes.put("XCG01180", getXCG01180());
		attributes.put("XCG01181", getXCG01181());
		attributes.put("XCG01182", getXCG01182());
		attributes.put("XCG01183", getXCG01183());
		attributes.put("XCG01184", getXCG01184());
		attributes.put("XCG01185", getXCG01185());
		attributes.put("XCG01186", getXCG01186());
		attributes.put("XCG01187", getXCG01187());
		attributes.put("XCG01188", getXCG01188());
		attributes.put("XCG01189", getXCG01189());
		attributes.put("XCG01190", getXCG01190());
		attributes.put("XCG01191", getXCG01191());
		attributes.put("XCG01192", getXCG01192());
		attributes.put("XCG01193", getXCG01193());
		attributes.put("XCG01194", getXCG01194());
		attributes.put("XCG01195", getXCG01195());
		attributes.put("XCG01196", getXCG01196());
		attributes.put("XCG01197", getXCG01197());
		attributes.put("XCG01198", getXCG01198());
		attributes.put("XCG01199", getXCG01199());
		attributes.put("XCG01200", getXCG01200());
		attributes.put("XCG01202", getXCG01202());
		attributes.put("XCG01203", getXCG01203());
		attributes.put("XCG01204", getXCG01204());
		attributes.put("XCG01205", getXCG01205());
		attributes.put("XCG01206", getXCG01206());
		attributes.put("XCG01207", getXCG01207());
		attributes.put("XCG01208", getXCG01208());
		attributes.put("XCG01209", getXCG01209());
		attributes.put("XCG01210", getXCG01210());
		attributes.put("XCG01212", getXCG01212());
		attributes.put("XCG01213", getXCG01213());
		attributes.put("XCG01214", getXCG01214());
		attributes.put("XCG01215", getXCG01215());
		attributes.put("XCG01216", getXCG01216());
		attributes.put("XCG01217", getXCG01217());
		attributes.put("XCG01218", getXCG01218());
		attributes.put("XCG01219", getXCG01219());
		attributes.put("XCG01220", getXCG01220());
		attributes.put("XCG01221", getXCG01221());
		attributes.put("XCG01222", getXCG01222());
		attributes.put("XCG01223", getXCG01223());
		attributes.put("XCG01224", getXCG01224());
		attributes.put("XCG01225", getXCG01225());
		attributes.put("XCG01226", getXCG01226());
		attributes.put("XCG01228", getXCG01228());
		attributes.put("XCG01230", getXCG01230());
		attributes.put("XCG01231", getXCG01231());
		attributes.put("XCG01232", getXCG01232());
		attributes.put("XCG01234", getXCG01234());
		attributes.put("XCG01236", getXCG01236());
		attributes.put("XCG01237", getXCG01237());
		attributes.put("XCG01229", getXCG01229());
		attributes.put("XCG01238", getXCG01238());
		attributes.put("XCG01239", getXCG01239());
		attributes.put("XCG01240", getXCG01240());
		attributes.put("XCG01241", getXCG01241());
		attributes.put("XCG01242", getXCG01242());
		attributes.put("XCG01243", getXCG01243());
		attributes.put("XCG01235", getXCG01235());
		attributes.put("XCG01244", getXCG01244());
		attributes.put("XCG01245", getXCG01245());
		attributes.put("XCG01246", getXCG01246());
		attributes.put("XCG01247", getXCG01247());
		attributes.put("XCG01248", getXCG01248());
		attributes.put("XCG01249", getXCG01249());
		attributes.put("XCG11248", getXCG11248());
		attributes.put("XCG11249", getXCG11249());
		attributes.put("XCG01250", getXCG01250());
		attributes.put("XCG01251", getXCG01251());
		attributes.put("XCG01252", getXCG01252());
		attributes.put("XCG01253", getXCG01253());
		attributes.put("XCG01255", getXCG01255());
		attributes.put("XCG01256", getXCG01256());
		attributes.put("XCG01257", getXCG01257());
		attributes.put("XCG01258", getXCG01258());
		attributes.put("XCG01259", getXCG01259());
		attributes.put("XCG01260", getXCG01260());
		attributes.put("XCG01261", getXCG01261());
		attributes.put("XCG01262", getXCG01262());
		attributes.put("XCG11253", getXCG11253());
		attributes.put("XCG01263", getXCG01263());
		attributes.put("XCG01264", getXCG01264());
		attributes.put("XCG01265", getXCG01265());
		attributes.put("XCG01266", getXCG01266());
		attributes.put("XCG01901", getXCG01901());
		attributes.put("XCG01267", getXCG01267());
		attributes.put("XCG01902", getXCG01902());
		attributes.put("XCG01268", getXCG01268());
		attributes.put("XCG01269", getXCG01269());
		attributes.put("XCG01903", getXCG01903());
		attributes.put("XCG01270", getXCG01270());
		attributes.put("XCG01271", getXCG01271());
		attributes.put("XCG01273", getXCG01273());
		attributes.put("XCG01274", getXCG01274());
		attributes.put("XCG01275", getXCG01275());
		attributes.put("XCG01276", getXCG01276());
		attributes.put("XCG01277", getXCG01277());
		attributes.put("XCG01278", getXCG01278());
		attributes.put("XCG01279", getXCG01279());
		attributes.put("XCG01280", getXCG01280());
		attributes.put("XCG01281", getXCG01281());
		attributes.put("XCG01282", getXCG01282());
		attributes.put("XCG01283", getXCG01283());
		attributes.put("XCG01284", getXCG01284());
		attributes.put("XCG01285", getXCG01285());
		attributes.put("XCG01286", getXCG01286());
		attributes.put("XCG01287", getXCG01287());
		attributes.put("XCG01288", getXCG01288());
		attributes.put("XCG01289", getXCG01289());
		attributes.put("XCG01290", getXCG01290());
		attributes.put("XCG01291", getXCG01291());
		attributes.put("XCG01292", getXCG01292());
		attributes.put("XCG01293", getXCG01293());
		attributes.put("XCG01294", getXCG01294());
		attributes.put("XCG01295", getXCG01295());
		attributes.put("XCG01296", getXCG01296());
		attributes.put("XCG01297", getXCG01297());
		attributes.put("XCG01298", getXCG01298());
		attributes.put("XCG01300", getXCG01300());
		attributes.put("XCG01301", getXCG01301());
		attributes.put("XCG01302", getXCG01302());
		attributes.put("XCG01303", getXCG01303());
		attributes.put("XCG01304", getXCG01304());
		attributes.put("XCG01305", getXCG01305());
		attributes.put("XCG01306", getXCG01306());
		attributes.put("XCG01307", getXCG01307());
		attributes.put("XCG01308", getXCG01308());
		attributes.put("XCG01310", getXCG01310());
		attributes.put("XCG01311", getXCG01311());
		attributes.put("XCG01312", getXCG01312());
		attributes.put("XCG01313", getXCG01313());
		attributes.put("XCG01314", getXCG01314());
		attributes.put("XCG01315", getXCG01315());
		attributes.put("XCG01316", getXCG01316());
		attributes.put("XCG01317", getXCG01317());
		attributes.put("XCG01318", getXCG01318());
		attributes.put("XCG01319", getXCG01319());
		attributes.put("XCG01320", getXCG01320());
		attributes.put("XCG01321", getXCG01321());
		attributes.put("XCG01322", getXCG01322());
		attributes.put("XCG01323", getXCG01323());
		attributes.put("XCG01324", getXCG01324());
		attributes.put("XCG01325", getXCG01325());
		attributes.put("XCG01326", getXCG01326());
		attributes.put("XCG01327", getXCG01327());
		attributes.put("XCG01328", getXCG01328());
		attributes.put("XCG01330", getXCG01330());
		attributes.put("XCG01331", getXCG01331());
		attributes.put("XCG01332", getXCG01332());
		attributes.put("XCG01333", getXCG01333());
		attributes.put("XCG01334", getXCG01334());
		attributes.put("XCG01335", getXCG01335());
		attributes.put("XCG01336", getXCG01336());
		attributes.put("XCG01337", getXCG01337());
		attributes.put("XCG01338", getXCG01338());
		attributes.put("XCG01339", getXCG01339());
		attributes.put("XCG01340", getXCG01340());
		attributes.put("XCG01341", getXCG01341());
		attributes.put("XCG01342", getXCG01342());
		attributes.put("XCG01343", getXCG01343());
		attributes.put("XCG01344", getXCG01344());
		attributes.put("XCG01345", getXCG01345());
		attributes.put("XCG01346", getXCG01346());
		attributes.put("XCG01347", getXCG01347());
		attributes.put("XCG01348", getXCG01348());
		attributes.put("XCG01349", getXCG01349());
		attributes.put("XCG01350", getXCG01350());
		attributes.put("XCG01351", getXCG01351());
		attributes.put("XCG01352", getXCG01352());
		attributes.put("XCG01353", getXCG01353());
		attributes.put("XCG01354", getXCG01354());
		attributes.put("XCG01355", getXCG01355());
		attributes.put("XCG01356", getXCG01356());
		attributes.put("XCG01357", getXCG01357());
		attributes.put("XCG01358", getXCG01358());
		attributes.put("XCG01359", getXCG01359());
		attributes.put("XCG01360", getXCG01360());
		attributes.put("XCG01361", getXCG01361());
		attributes.put("XCG01362", getXCG01362());
		attributes.put("XCG01363", getXCG01363());
		attributes.put("XCG01364", getXCG01364());
		attributes.put("XCG01365", getXCG01365());
		attributes.put("XCG01366", getXCG01366());
		attributes.put("XCG01367", getXCG01367());
		attributes.put("XCG01368", getXCG01368());
		attributes.put("XCG01369", getXCG01369());
		attributes.put("XCG01370", getXCG01370());
		attributes.put("XCG01371", getXCG01371());
		attributes.put("XCG01372", getXCG01372());
		attributes.put("XCG01373", getXCG01373());
		attributes.put("XCG01374", getXCG01374());
		attributes.put("XCG01375", getXCG01375());
		attributes.put("XCG01376", getXCG01376());
		attributes.put("XCG01377", getXCG01377());
		attributes.put("XCG01378", getXCG01378());
		attributes.put("XCG01379", getXCG01379());
		attributes.put("XCG01381", getXCG01381());
		attributes.put("XCG01382", getXCG01382());
		attributes.put("XCG01383", getXCG01383());
		attributes.put("XCG01384", getXCG01384());
		attributes.put("XCG01385", getXCG01385());
		attributes.put("XCG01386", getXCG01386());
		attributes.put("XCG01387", getXCG01387());
		attributes.put("XCG01388", getXCG01388());
		attributes.put("XCG01389", getXCG01389());
		attributes.put("XCG01390", getXCG01390());
		attributes.put("XCG01391", getXCG01391());
		attributes.put("XCG01392", getXCG01392());
		attributes.put("XCG01393", getXCG01393());
		attributes.put("XCG01394", getXCG01394());
		attributes.put("XCG01395", getXCG01395());
		attributes.put("XCG01396", getXCG01396());
		attributes.put("XCG01397", getXCG01397());
		attributes.put("XCG01398", getXCG01398());
		attributes.put("XCG01399", getXCG01399());
		attributes.put("XCG01400", getXCG01400());
		attributes.put("XCG01402", getXCG01402());
		attributes.put("XCG01403", getXCG01403());
		attributes.put("XCG01404", getXCG01404());
		attributes.put("XCG01405", getXCG01405());
		attributes.put("XCG01406", getXCG01406());
		attributes.put("XCG01407", getXCG01407());
		attributes.put("XCG01408", getXCG01408());
		attributes.put("XCG01409", getXCG01409());
		attributes.put("XCG01410", getXCG01410());
		attributes.put("XCG01411", getXCG01411());
		attributes.put("XCG01412", getXCG01412());
		attributes.put("XCG01413", getXCG01413());
		attributes.put("XCG01414", getXCG01414());
		attributes.put("XCG01415", getXCG01415());
		attributes.put("XCG01416", getXCG01416());
		attributes.put("XCG01417", getXCG01417());
		attributes.put("XCG01418", getXCG01418());
		attributes.put("XCG01419", getXCG01419());
		attributes.put("XCG01420", getXCG01420());
		attributes.put("XCG01421", getXCG01421());
		attributes.put("XCG01422", getXCG01422());
		attributes.put("XCG01423", getXCG01423());
		attributes.put("XCG01424", getXCG01424());
		attributes.put("XCG01425", getXCG01425());
		attributes.put("XCG01426", getXCG01426());
		attributes.put("XCG01427", getXCG01427());
		attributes.put("XCG01428", getXCG01428());
		attributes.put("XCG01437", getXCG01437());
		attributes.put("XCG01429", getXCG01429());
		attributes.put("XCG01430", getXCG01430());
		attributes.put("XCG01431", getXCG01431());
		attributes.put("XCG01432", getXCG01432());
		attributes.put("XCG01433", getXCG01433());
		attributes.put("XCG01434", getXCG01434());
		attributes.put("XCG01435", getXCG01435());
		attributes.put("XCG01436", getXCG01436());
		attributes.put("XCG01439", getXCG01439());
		attributes.put("XCG01440", getXCG01440());
		attributes.put("XCG01441", getXCG01441());
		attributes.put("XCG01442", getXCG01442());
		attributes.put("XCG01443", getXCG01443());
		attributes.put("XCG01445", getXCG01445());
		attributes.put("XCG01446", getXCG01446());
		attributes.put("XCG01447", getXCG01447());
		attributes.put("XCG01448", getXCG01448());
		attributes.put("XCG01449", getXCG01449());
		attributes.put("XCG01450", getXCG01450());
		attributes.put("XCG01451", getXCG01451());
		attributes.put("XCG01452", getXCG01452());
		attributes.put("XCG01453", getXCG01453());
		attributes.put("XCG01454", getXCG01454());
		attributes.put("XCG01455", getXCG01455());
		attributes.put("XCG01456", getXCG01456());
		attributes.put("XCG01457", getXCG01457());
		attributes.put("XCG01458", getXCG01458());
		attributes.put("XCG01459", getXCG01459());
		attributes.put("XCG01460", getXCG01460());
		attributes.put("XCG01461", getXCG01461());
		attributes.put("XCG01462", getXCG01462());
		attributes.put("XCG01463", getXCG01463());
		attributes.put("XCG01464", getXCG01464());
		attributes.put("XCG01465", getXCG01465());
		attributes.put("XCG01466", getXCG01466());
		attributes.put("XCG01467", getXCG01467());
		attributes.put("XCG01468", getXCG01468());
		attributes.put("XCG01469", getXCG01469());
		attributes.put("XCG01470", getXCG01470());
		attributes.put("XCG01471", getXCG01471());
		attributes.put("XCG01472", getXCG01472());
		attributes.put("XCG01473", getXCG01473());
		attributes.put("XCG01474", getXCG01474());
		attributes.put("XCG01475", getXCG01475());
		attributes.put("XCG01476", getXCG01476());
		attributes.put("XCG01477", getXCG01477());
		attributes.put("XCG01478", getXCG01478());
		attributes.put("XCG01479", getXCG01479());
		attributes.put("XCG01480", getXCG01480());
		attributes.put("XCG01481", getXCG01481());
		attributes.put("XCG01482", getXCG01482());
		attributes.put("XCG01483", getXCG01483());
		attributes.put("XCG01484", getXCG01484());
		attributes.put("XCG01485", getXCG01485());
		attributes.put("XCG01486", getXCG01486());
		attributes.put("XCG01487", getXCG01487());
		attributes.put("XCG01488", getXCG01488());
		attributes.put("XCG01489", getXCG01489());
		attributes.put("XCG01490", getXCG01490());
		attributes.put("XCG01491", getXCG01491());
		attributes.put("XCG01492", getXCG01492());
		attributes.put("XCG01493", getXCG01493());
		attributes.put("XCG01494", getXCG01494());
		attributes.put("XCG01496", getXCG01496());
		attributes.put("XCG01497", getXCG01497());
		attributes.put("XCG01498", getXCG01498());
		attributes.put("XCG01499", getXCG01499());
		attributes.put("XCG01500", getXCG01500());
		attributes.put("XCG01501", getXCG01501());
		attributes.put("XCG01502", getXCG01502());
		attributes.put("XCG01503", getXCG01503());
		attributes.put("XCG01504", getXCG01504());
		attributes.put("XCG01505", getXCG01505());
		attributes.put("XCG01506", getXCG01506());
		attributes.put("XCG01507", getXCG01507());
		attributes.put("XCG01508", getXCG01508());
		attributes.put("XCG01509", getXCG01509());
		attributes.put("XCG01510", getXCG01510());
		attributes.put("XCG01512", getXCG01512());
		attributes.put("XCG01513", getXCG01513());
		attributes.put("XCG01514", getXCG01514());
		attributes.put("XCG01515", getXCG01515());
		attributes.put("XCG01516", getXCG01516());
		attributes.put("XCG01517", getXCG01517());
		attributes.put("XCG01518", getXCG01518());
		attributes.put("XCG01519", getXCG01519());
		attributes.put("XCG01520", getXCG01520());
		attributes.put("XCG01521", getXCG01521());
		attributes.put("XCG01522", getXCG01522());
		attributes.put("XCG01523", getXCG01523());
		attributes.put("XCG01524", getXCG01524());
		attributes.put("XCG01525", getXCG01525());
		attributes.put("XCG01526", getXCG01526());
		attributes.put("XCG01527", getXCG01527());
		attributes.put("XCG01528", getXCG01528());
		attributes.put("XCG01529", getXCG01529());
		attributes.put("XCG01530", getXCG01530());
		attributes.put("XCG01531", getXCG01531());
		attributes.put("XCG01904", getXCG01904());
		attributes.put("XCG01533", getXCG01533());
		attributes.put("XCG01905", getXCG01905());
		attributes.put("XCG01534", getXCG01534());
		attributes.put("XCG01906", getXCG01906());
		attributes.put("XCG01535", getXCG01535());
		attributes.put("XCG01907", getXCG01907());
		attributes.put("XCG01536", getXCG01536());
		attributes.put("XCG01908", getXCG01908());
		attributes.put("XCG01537", getXCG01537());
		attributes.put("XCG01909", getXCG01909());
		attributes.put("XCG01538", getXCG01538());
		attributes.put("XCG01910", getXCG01910());
		attributes.put("XCG01539", getXCG01539());
		attributes.put("XCG11535", getXCG11535());
		attributes.put("XCG01541", getXCG01541());
		attributes.put("XCG01542", getXCG01542());
		attributes.put("XCG01911", getXCG01911());
		attributes.put("XCG01543", getXCG01543());
		attributes.put("XCG01912", getXCG01912());
		attributes.put("XCG01544", getXCG01544());
		attributes.put("XCG01545", getXCG01545());
		attributes.put("XCG01546", getXCG01546());
		attributes.put("XCG01547", getXCG01547());
		attributes.put("XCG01548", getXCG01548());
		attributes.put("XCG01913", getXCG01913());
		attributes.put("XCG01549", getXCG01549());
		attributes.put("XCG01914", getXCG01914());
		attributes.put("XCG01550", getXCG01550());
		attributes.put("XCG01551", getXCG01551());
		attributes.put("XCG01552", getXCG01552());
		attributes.put("XCG01553", getXCG01553());
		attributes.put("XCG01554", getXCG01554());
		attributes.put("XCG01915", getXCG01915());
		attributes.put("XCG01555", getXCG01555());
		attributes.put("XCG01556", getXCG01556());
		attributes.put("XCG01557", getXCG01557());
		attributes.put("XCG01558", getXCG01558());
		attributes.put("XCG01559", getXCG01559());
		attributes.put("XCG01560", getXCG01560());
		attributes.put("XCG01561", getXCG01561());
		attributes.put("XCG01916", getXCG01916());
		attributes.put("XCG01562", getXCG01562());
		attributes.put("XCG01917", getXCG01917());
		attributes.put("XCG01563", getXCG01563());
		attributes.put("XCG01918", getXCG01918());
		attributes.put("XCG01564", getXCG01564());
		attributes.put("XCG01565", getXCG01565());
		attributes.put("XCG01566", getXCG01566());
		attributes.put("XCG01567", getXCG01567());
		attributes.put("XCG01568", getXCG01568());
		attributes.put("XCG01919", getXCG01919());
		attributes.put("XCG01569", getXCG01569());
		attributes.put("XCG01570", getXCG01570());
		attributes.put("XCG01571", getXCG01571());
		attributes.put("XCG01572", getXCG01572());
		attributes.put("XCG01920", getXCG01920());
		attributes.put("XCG01573", getXCG01573());
		attributes.put("XCG01921", getXCG01921());
		attributes.put("XCG01574", getXCG01574());
		attributes.put("XCG01922", getXCG01922());
		attributes.put("XCG01575", getXCG01575());
		attributes.put("XCG01576", getXCG01576());
		attributes.put("XCG01577", getXCG01577());
		attributes.put("XCG01578", getXCG01578());
		attributes.put("XCG01579", getXCG01579());
		attributes.put("XCG01580", getXCG01580());
		attributes.put("XCG01581", getXCG01581());
		attributes.put("XCG01582", getXCG01582());
		attributes.put("XCG01583", getXCG01583());
		attributes.put("XCG01584", getXCG01584());
		attributes.put("XCG01585", getXCG01585());
		attributes.put("XCG01586", getXCG01586());
		attributes.put("XCG01587", getXCG01587());
		attributes.put("XCG01588", getXCG01588());
		attributes.put("XCG01589", getXCG01589());
		attributes.put("XCG01590", getXCG01590());
		attributes.put("XCG01591", getXCG01591());
		attributes.put("XCG01592", getXCG01592());
		attributes.put("XCG01593", getXCG01593());
		attributes.put("XCG01594", getXCG01594());
		attributes.put("XCG01595", getXCG01595());
		attributes.put("XCG01596", getXCG01596());
		attributes.put("XCG01597", getXCG01597());
		attributes.put("XCG01598", getXCG01598());
		attributes.put("XCG01599", getXCG01599());
		attributes.put("XCG01600", getXCG01600());
		attributes.put("XCG01601", getXCG01601());
		attributes.put("XCG01602", getXCG01602());
		attributes.put("XCG01603", getXCG01603());
		attributes.put("XCG01923", getXCG01923());
		attributes.put("XCG01604", getXCG01604());
		attributes.put("XCG01924", getXCG01924());
		attributes.put("XCG01605", getXCG01605());
		attributes.put("XCG01606", getXCG01606());
		attributes.put("XCG01607", getXCG01607());
		attributes.put("XCG01608", getXCG01608());
		attributes.put("XCG01609", getXCG01609());
		attributes.put("XCG01925", getXCG01925());
		attributes.put("XCG01610", getXCG01610());
		attributes.put("XCG01926", getXCG01926());
		attributes.put("XCG01611", getXCG01611());
		attributes.put("XCG01612", getXCG01612());
		attributes.put("XCG01928", getXCG01928());
		attributes.put("XCG01613", getXCG01613());
		attributes.put("XCG01929", getXCG01929());
		attributes.put("XCG01614", getXCG01614());
		attributes.put("XCG01930", getXCG01930());
		attributes.put("XCG01615", getXCG01615());
		attributes.put("XCG01931", getXCG01931());
		attributes.put("XCG01616", getXCG01616());
		attributes.put("XCG01932", getXCG01932());
		attributes.put("XCG01617", getXCG01617());
		attributes.put("XCG01933", getXCG01933());
		attributes.put("XCG01618", getXCG01618());
		attributes.put("XCG01934", getXCG01934());
		attributes.put("XCG01619", getXCG01619());
		attributes.put("XCG01935", getXCG01935());
		attributes.put("XCG01620", getXCG01620());
		attributes.put("XCG01936", getXCG01936());
		attributes.put("XCG01621", getXCG01621());
		attributes.put("XCG01937", getXCG01937());
		attributes.put("XCG01622", getXCG01622());
		attributes.put("XCG01938", getXCG01938());
		attributes.put("XCG01623", getXCG01623());
		attributes.put("XCG01939", getXCG01939());
		attributes.put("XCG01624", getXCG01624());
		attributes.put("XCG01940", getXCG01940());
		attributes.put("XCG01625", getXCG01625());
		attributes.put("XCG01941", getXCG01941());
		attributes.put("XCG01626", getXCG01626());
		attributes.put("XCG01942", getXCG01942());
		attributes.put("XCG01627", getXCG01627());
		attributes.put("XCG01943", getXCG01943());
		attributes.put("XCG01628", getXCG01628());
		attributes.put("XCG01944", getXCG01944());
		attributes.put("XCG01630", getXCG01630());
		attributes.put("XCG01631", getXCG01631());
		attributes.put("XCG01632", getXCG01632());
		attributes.put("XCG01633", getXCG01633());
		attributes.put("XCG01634", getXCG01634());
		attributes.put("XCG01635", getXCG01635());
		attributes.put("XCG01636", getXCG01636());
		attributes.put("XCG01637", getXCG01637());
		attributes.put("XCG01638", getXCG01638());
		attributes.put("XCG01639", getXCG01639());
		attributes.put("XCG01640", getXCG01640());
		attributes.put("XCG01641", getXCG01641());
		attributes.put("XCG01642", getXCG01642());
		attributes.put("XCG01643", getXCG01643());
		attributes.put("XCG01644", getXCG01644());
		attributes.put("XCG01645", getXCG01645());
		attributes.put("XCG01646", getXCG01646());
		attributes.put("XCG01647", getXCG01647());
		attributes.put("XCG01648", getXCG01648());
		attributes.put("XCG01649", getXCG01649());
		attributes.put("XCG01650", getXCG01650());
		attributes.put("XCG01651", getXCG01651());
		attributes.put("XCG01652", getXCG01652());
		attributes.put("XCG01653", getXCG01653());
		attributes.put("XCG01654", getXCG01654());
		attributes.put("XCG01655", getXCG01655());
		attributes.put("XCG01656", getXCG01656());
		attributes.put("XCG01657", getXCG01657());
		attributes.put("XCG01658", getXCG01658());
		attributes.put("XCG01659", getXCG01659());
		attributes.put("XCG01660", getXCG01660());
		attributes.put("XCG01661", getXCG01661());
		attributes.put("XCG01662", getXCG01662());
		attributes.put("XCG01663", getXCG01663());
		attributes.put("XCG01664", getXCG01664());
		attributes.put("XCG01665", getXCG01665());
		attributes.put("XCG01666", getXCG01666());
		attributes.put("XCG01667", getXCG01667());
		attributes.put("XCG01668", getXCG01668());
		attributes.put("XCG01669", getXCG01669());
		attributes.put("XCG01670", getXCG01670());
		attributes.put("XCG01671", getXCG01671());
		attributes.put("XCG01672", getXCG01672());
		attributes.put("XCG01673", getXCG01673());
		attributes.put("XCG01674", getXCG01674());
		attributes.put("XCG01675", getXCG01675());
		attributes.put("XCG01676", getXCG01676());
		attributes.put("XCG01677", getXCG01677());
		attributes.put("XCG01678", getXCG01678());
		attributes.put("XCG01679", getXCG01679());
		attributes.put("XCG01680", getXCG01680());
		attributes.put("XCG01681", getXCG01681());
		attributes.put("XCG01682", getXCG01682());
		attributes.put("XCG01683", getXCG01683());
		attributes.put("XCG01684", getXCG01684());
		attributes.put("XCG01685", getXCG01685());
		attributes.put("XCG01686", getXCG01686());
		attributes.put("XCG01687", getXCG01687());
		attributes.put("XCG01688", getXCG01688());
		attributes.put("XCG01689", getXCG01689());
		attributes.put("XCG01690", getXCG01690());
		attributes.put("XCG01691", getXCG01691());
		attributes.put("XCG01692", getXCG01692());
		attributes.put("XCG01693", getXCG01693());
		attributes.put("XCG01694", getXCG01694());
		attributes.put("XCG01695", getXCG01695());
		attributes.put("XCG01696", getXCG01696());
		attributes.put("XCG01697", getXCG01697());
		attributes.put("XCG01698", getXCG01698());
		attributes.put("XCG01699", getXCG01699());
		attributes.put("XCG01700", getXCG01700());
		attributes.put("XCG01701", getXCG01701());
		attributes.put("XCG01702", getXCG01702());
		attributes.put("XCG01703", getXCG01703());
		attributes.put("XCG01704", getXCG01704());
		attributes.put("XCG01705", getXCG01705());
		attributes.put("XCG01706", getXCG01706());
		attributes.put("XCG01707", getXCG01707());
		attributes.put("XCG01708", getXCG01708());
		attributes.put("XCG01709", getXCG01709());
		attributes.put("XCG01710", getXCG01710());
		attributes.put("XCG01711", getXCG01711());
		attributes.put("XCG01712", getXCG01712());
		attributes.put("XCG01713", getXCG01713());
		attributes.put("XCG01714", getXCG01714());
		attributes.put("XCG01715", getXCG01715());
		attributes.put("XCG01716", getXCG01716());
		attributes.put("XCG01717", getXCG01717());
		attributes.put("XCG01718", getXCG01718());
		attributes.put("XCG01719", getXCG01719());
		attributes.put("XCG01720", getXCG01720());
		attributes.put("XCG01721", getXCG01721());
		attributes.put("XCG01722", getXCG01722());
		attributes.put("XCG01723", getXCG01723());
		attributes.put("XCG01724", getXCG01724());
		attributes.put("XCG01725", getXCG01725());
		attributes.put("XCG01726", getXCG01726());
		attributes.put("XCG01727", getXCG01727());
		attributes.put("XCG01728", getXCG01728());
		attributes.put("XCG01729", getXCG01729());
		attributes.put("XCG01730", getXCG01730());
		attributes.put("XCG01731", getXCG01731());
		attributes.put("XCG01732", getXCG01732());
		attributes.put("XCG01733", getXCG01733());
		attributes.put("XCG01734", getXCG01734());
		attributes.put("XCG01735", getXCG01735());
		attributes.put("XCG01736", getXCG01736());
		attributes.put("XCG01737", getXCG01737());
		attributes.put("XCG01738", getXCG01738());
		attributes.put("XCG01739", getXCG01739());
		attributes.put("XCG01740", getXCG01740());
		attributes.put("XCG01741", getXCG01741());
		attributes.put("XCG01742", getXCG01742());
		attributes.put("XCG01744", getXCG01744());
		attributes.put("XCG01745", getXCG01745());
		attributes.put("XCG01746", getXCG01746());
		attributes.put("XCG01747", getXCG01747());
		attributes.put("XCG01748", getXCG01748());
		attributes.put("XCG01749", getXCG01749());
		attributes.put("XCG01945", getXCG01945());
		attributes.put("XCG01750", getXCG01750());
		attributes.put("XCG01946", getXCG01946());
		attributes.put("XCG01751", getXCG01751());
		attributes.put("XCG01752", getXCG01752());
		attributes.put("XCG01753", getXCG01753());
		attributes.put("XCG01754", getXCG01754());
		attributes.put("XCG01756", getXCG01756());
		attributes.put("XCG01757", getXCG01757());
		attributes.put("XCG01758", getXCG01758());
		attributes.put("XCG01759", getXCG01759());
		attributes.put("XCG01948", getXCG01948());
		attributes.put("XCG01760", getXCG01760());
		attributes.put("XCG01949", getXCG01949());
		attributes.put("XCG01761", getXCG01761());
		attributes.put("XCG01950", getXCG01950());
		attributes.put("XCG01762", getXCG01762());
		attributes.put("XCG01951", getXCG01951());
		attributes.put("XCG01763", getXCG01763());
		attributes.put("XCG01952", getXCG01952());
		attributes.put("XCG01764", getXCG01764());
		attributes.put("XCG01953", getXCG01953());
		attributes.put("XCG01765", getXCG01765());
		attributes.put("XCG01954", getXCG01954());
		attributes.put("XCG01766", getXCG01766());
		attributes.put("XCG01955", getXCG01955());
		attributes.put("XCG01767", getXCG01767());
		attributes.put("XCG01956", getXCG01956());
		attributes.put("XCG01768", getXCG01768());
		attributes.put("XCG01957", getXCG01957());
		attributes.put("XCG01769", getXCG01769());
		attributes.put("XCG01958", getXCG01958());
		attributes.put("XCG01770", getXCG01770());
		attributes.put("XCG01771", getXCG01771());
		attributes.put("XCG01959", getXCG01959());
		attributes.put("XCG01772", getXCG01772());
		attributes.put("XCG01773", getXCG01773());
		attributes.put("XCG01774", getXCG01774());
		attributes.put("XCG01775", getXCG01775());
		attributes.put("XCG01776", getXCG01776());
		attributes.put("XCG01777", getXCG01777());
		attributes.put("XCG01778", getXCG01778());
		attributes.put("XCG01779", getXCG01779());
		attributes.put("XCG01780", getXCG01780());
		attributes.put("XCG01781", getXCG01781());
		attributes.put("XCG01783", getXCG01783());
		attributes.put("XCG01785", getXCG01785());
		attributes.put("XCG01786", getXCG01786());
		attributes.put("XCG01787", getXCG01787());
		attributes.put("XCG01788", getXCG01788());
		attributes.put("XCG01789", getXCG01789());
		attributes.put("XCG01790", getXCG01790());
		attributes.put("XCG01791", getXCG01791());
		attributes.put("XCG01792", getXCG01792());
		attributes.put("XCG01793", getXCG01793());
		attributes.put("XCG01794", getXCG01794());
		attributes.put("XCG01795", getXCG01795());
		attributes.put("XCG01796", getXCG01796());
		attributes.put("XCG01797", getXCG01797());
		attributes.put("XCG01798", getXCG01798());
		attributes.put("XCG01799", getXCG01799());
		attributes.put("XCG01801", getXCG01801());
		attributes.put("XCG01802", getXCG01802());
		attributes.put("XCG01803", getXCG01803());
		attributes.put("XCG01804", getXCG01804());
		attributes.put("XCG01805", getXCG01805());
		attributes.put("XCG01806", getXCG01806());
		attributes.put("XCG01807", getXCG01807());
		attributes.put("XCG01808", getXCG01808());
		attributes.put("XCG01809", getXCG01809());
		attributes.put("XCG01810", getXCG01810());
		attributes.put("XCG01811", getXCG01811());
		attributes.put("XCG01812", getXCG01812());
		attributes.put("XCG01813", getXCG01813());
		attributes.put("XCG01814", getXCG01814());
		attributes.put("TDTKXCG001", getTDTKXCG001());
		attributes.put("TDTKXCG002", getTDTKXCG002());
		attributes.put("TDTKXCG003", getTDTKXCG003());
		attributes.put("TDTKXCG004", getTDTKXCG004());
		attributes.put("TDTKXCG005", getTDTKXCG005());
		attributes.put("TDTKXCG006", getTDTKXCG006());
		attributes.put("TDTKXCG007", getTDTKXCG007());
		attributes.put("TDTKXCG008", getTDTKXCG008());
		attributes.put("TDTKXCG009", getTDTKXCG009());
		attributes.put("TDTKXCG010", getTDTKXCG010());
		attributes.put("TDTKXCG011", getTDTKXCG011());
		attributes.put("TDTKXCG012", getTDTKXCG012());
		attributes.put("TDTKXCG013", getTDTKXCG013());
		attributes.put("TDTKXCG014", getTDTKXCG014());
		attributes.put("TDTKXCG015", getTDTKXCG015());
		attributes.put("TDTKXCG016", getTDTKXCG016());
		attributes.put("TDTKXCG017", getTDTKXCG017());
		attributes.put("TDTKXCG018", getTDTKXCG018());
		attributes.put("TDTKXCG019", getTDTKXCG019());
		attributes.put("TDTKXCG020", getTDTKXCG020());
		attributes.put("TDTKXCG021", getTDTKXCG021());
		attributes.put("TDTKXCG022", getTDTKXCG022());
		attributes.put("TDTKXCG023", getTDTKXCG023());
		attributes.put("TDTKXCG024", getTDTKXCG024());
		attributes.put("TDTKXCG025", getTDTKXCG025());
		attributes.put("TDTKXCG026", getTDTKXCG026());
		attributes.put("TDTKXCG027", getTDTKXCG027());
		attributes.put("TDTKXCG028", getTDTKXCG028());
		attributes.put("TDTKXCG029", getTDTKXCG029());
		attributes.put("TDTKXCG030", getTDTKXCG030());
		attributes.put("TDTKXCG031", getTDTKXCG031());
		attributes.put("TDTKXCG032", getTDTKXCG032());
		attributes.put("TDTKXCG033", getTDTKXCG033());
		attributes.put("TDTKXCG034", getTDTKXCG034());
		attributes.put("TDTKXCG035", getTDTKXCG035());
		attributes.put("TDTKXCG036", getTDTKXCG036());
		attributes.put("BBCNCLKLXCG01", getBBCNCLKLXCG01());
		attributes.put("BBCNCLKLXCG02", getBBCNCLKLXCG02());
		attributes.put("BBCNCLKLXCG03", getBBCNCLKLXCG03());
		attributes.put("BBCNCLKLXCG04", getBBCNCLKLXCG04());
		attributes.put("BBCNCLKLXCG05", getBBCNCLKLXCG05());
		attributes.put("BBCNCLKLXCG06", getBBCNCLKLXCG06());
		attributes.put("BBCNCLKLXCG07", getBBCNCLKLXCG07());
		attributes.put("BBCNCLKLXCG08", getBBCNCLKLXCG08());
		attributes.put("BBCNCLKLXCG09", getBBCNCLKLXCG09());
		attributes.put("BBCNCLKLXCG10", getBBCNCLKLXCG10());
		attributes.put("BBCNCLKLXCG11", getBBCNCLKLXCG11());
		attributes.put("BBCNCLKLXCG12", getBBCNCLKLXCG12());
		attributes.put("BBCNCLKLXCG13", getBBCNCLKLXCG13());
		attributes.put("BBCNCLKLXCG14", getBBCNCLKLXCG14());
		attributes.put("BBCNCLKLXCG15", getBBCNCLKLXCG15());
		attributes.put("BBCNCLKLXCG16", getBBCNCLKLXCG16());
		attributes.put("BBCNCLKLXCG17", getBBCNCLKLXCG17());
		attributes.put("BBCNCLKLXCG18", getBBCNCLKLXCG18());
		attributes.put("BBCNCLKLXCG19", getBBCNCLKLXCG19());
		attributes.put("BBCNCLKLXCG20", getBBCNCLKLXCG20());
		attributes.put("BBCNCLKLXCG21", getBBCNCLKLXCG21());
		attributes.put("BBCNCLKLXCG22", getBBCNCLKLXCG22());
		attributes.put("BBCNCLKLXCG23", getBBCNCLKLXCG23());
		attributes.put("BBCNCLKLXCG24", getBBCNCLKLXCG24());
		attributes.put("BBCNCLKLXCG26", getBBCNCLKLXCG26());
		attributes.put("BBCNCLKLXCG27", getBBCNCLKLXCG27());
		attributes.put("BBCNCLKLXCG28", getBBCNCLKLXCG28());
		attributes.put("BBCNCLKLXCG29", getBBCNCLKLXCG29());
		attributes.put("BBCNCLKLXCG30", getBBCNCLKLXCG30());
		attributes.put("BBCNCLKLXCG31", getBBCNCLKLXCG31());
		attributes.put("BBCNCLKLXCG33", getBBCNCLKLXCG33());
		attributes.put("BBCNCLKLXCG34", getBBCNCLKLXCG34());
		attributes.put("BBCNCLKLXCG35", getBBCNCLKLXCG35());
		attributes.put("BBCNCLKLXCG36", getBBCNCLKLXCG36());
		attributes.put("BBCNCLKLXCG38", getBBCNCLKLXCG38());
		attributes.put("BBCNCLKLXCG39", getBBCNCLKLXCG39());
		attributes.put("BBCNCLKLXCG40", getBBCNCLKLXCG40());
		attributes.put("BBCNCLKLXCG42", getBBCNCLKLXCG42());
		attributes.put("BBCNCLKLXCG43", getBBCNCLKLXCG43());
		attributes.put("BBCNCLKLXCG44", getBBCNCLKLXCG44());
		attributes.put("BBCNCLKLXCG45", getBBCNCLKLXCG45());
		attributes.put("BBCNCLKLXCG46", getBBCNCLKLXCG46());
		attributes.put("BBCNCLKLXCG47", getBBCNCLKLXCG47());
		attributes.put("BBCNCLKLXCG48", getBBCNCLKLXCG48());
		attributes.put("BBCNCLKLXCG49", getBBCNCLKLXCG49());
		attributes.put("BBCNCLKLXCG50", getBBCNCLKLXCG50());
		attributes.put("BBCNCLKLXCG51", getBBCNCLKLXCG51());
		attributes.put("BBCNCLKLXCG52", getBBCNCLKLXCG52());
		attributes.put("BBCNCLKLXCG53", getBBCNCLKLXCG53());
		attributes.put("BBCNCLKLXCG54", getBBCNCLKLXCG54());
		attributes.put("BBKTSPMXCG001", getBBKTSPMXCG001());
		attributes.put("BBKTSPMXCG002", getBBKTSPMXCG002());
		attributes.put("BBKTSPMXCG003", getBBKTSPMXCG003());
		attributes.put("BBKTSPMXCG004", getBBKTSPMXCG004());
		attributes.put("BBKTSPMXCG005", getBBKTSPMXCG005());
		attributes.put("BBKTSPMXCG006", getBBKTSPMXCG006());
		attributes.put("BBKTSPMXCG007", getBBKTSPMXCG007());
		attributes.put("BBKTSPMXCG008", getBBKTSPMXCG008());
		attributes.put("BBKTSPMXCG009", getBBKTSPMXCG009());
		attributes.put("BBKTSPMXCG010", getBBKTSPMXCG010());
		attributes.put("BBKTSPMXCG011", getBBKTSPMXCG011());
		attributes.put("BBKTSPMXCG012", getBBKTSPMXCG012());
		attributes.put("BBKTSPMXCG013", getBBKTSPMXCG013());
		attributes.put("BBKTSPMXCG014", getBBKTSPMXCG014());
		attributes.put("BBKTSPMXCG015", getBBKTSPMXCG015());
		attributes.put("BBKTSPMXCG016", getBBKTSPMXCG016());
		attributes.put("BBKTSPMXCG017", getBBKTSPMXCG017());
		attributes.put("BBKTSPMXCG018", getBBKTSPMXCG018());
		attributes.put("BBKTSPMXCG019", getBBKTSPMXCG019());
		attributes.put("BBKTSPMXCG020", getBBKTSPMXCG020());
		attributes.put("BBKTSPMXCG021", getBBKTSPMXCG021());
		attributes.put("BBKTSPMXCG022", getBBKTSPMXCG022());
		attributes.put("BBKTSPMXCG023", getBBKTSPMXCG023());
		attributes.put("BBKTSPMXCG024", getBBKTSPMXCG024());
		attributes.put("BBKTSPMXCG025", getBBKTSPMXCG025());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("syncDate", getSyncDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long mtCore = (Long)attributes.get("mtCore");

		if (mtCore != null) {
			setMtCore(mtCore);
		}

		Long convertAssembleId = (Long)attributes.get("convertAssembleId");

		if (convertAssembleId != null) {
			setConvertAssembleId(convertAssembleId);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		String dossierNo = (String)attributes.get("dossierNo");

		if (dossierNo != null) {
			setDossierNo(dossierNo);
		}

		String referenceUid = (String)attributes.get("referenceUid");

		if (referenceUid != null) {
			setReferenceUid(referenceUid);
		}

		String dossierIdCTN = (String)attributes.get("dossierIdCTN");

		if (dossierIdCTN != null) {
			setDossierIdCTN(dossierIdCTN);
		}

		String deliverableCode = (String)attributes.get("deliverableCode");

		if (deliverableCode != null) {
			setDeliverableCode(deliverableCode);
		}

		String loai_dong_co = (String)attributes.get("loai_dong_co");

		if (loai_dong_co != null) {
			setLoai_dong_co(loai_dong_co);
		}

		String XCG01001 = (String)attributes.get("XCG01001");

		if (XCG01001 != null) {
			setXCG01001(XCG01001);
		}

		String XCG01002 = (String)attributes.get("XCG01002");

		if (XCG01002 != null) {
			setXCG01002(XCG01002);
		}

		String XCG01003 = (String)attributes.get("XCG01003");

		if (XCG01003 != null) {
			setXCG01003(XCG01003);
		}

		String XCG01004 = (String)attributes.get("XCG01004");

		if (XCG01004 != null) {
			setXCG01004(XCG01004);
		}

		String XCG01005 = (String)attributes.get("XCG01005");

		if (XCG01005 != null) {
			setXCG01005(XCG01005);
		}

		String XCG01006 = (String)attributes.get("XCG01006");

		if (XCG01006 != null) {
			setXCG01006(XCG01006);
		}

		String XCG01007 = (String)attributes.get("XCG01007");

		if (XCG01007 != null) {
			setXCG01007(XCG01007);
		}

		String XCG01008 = (String)attributes.get("XCG01008");

		if (XCG01008 != null) {
			setXCG01008(XCG01008);
		}

		String XCG01009 = (String)attributes.get("XCG01009");

		if (XCG01009 != null) {
			setXCG01009(XCG01009);
		}

		String XCG01010 = (String)attributes.get("XCG01010");

		if (XCG01010 != null) {
			setXCG01010(XCG01010);
		}

		String XCG01011 = (String)attributes.get("XCG01011");

		if (XCG01011 != null) {
			setXCG01011(XCG01011);
		}

		String XCG01012 = (String)attributes.get("XCG01012");

		if (XCG01012 != null) {
			setXCG01012(XCG01012);
		}

		String XCG01013 = (String)attributes.get("XCG01013");

		if (XCG01013 != null) {
			setXCG01013(XCG01013);
		}

		String XCG01014 = (String)attributes.get("XCG01014");

		if (XCG01014 != null) {
			setXCG01014(XCG01014);
		}

		String XCG01016 = (String)attributes.get("XCG01016");

		if (XCG01016 != null) {
			setXCG01016(XCG01016);
		}

		String XCG01017 = (String)attributes.get("XCG01017");

		if (XCG01017 != null) {
			setXCG01017(XCG01017);
		}

		String XCG01019 = (String)attributes.get("XCG01019");

		if (XCG01019 != null) {
			setXCG01019(XCG01019);
		}

		String XCG01020 = (String)attributes.get("XCG01020");

		if (XCG01020 != null) {
			setXCG01020(XCG01020);
		}

		String XCG01021 = (String)attributes.get("XCG01021");

		if (XCG01021 != null) {
			setXCG01021(XCG01021);
		}

		String XCG01022 = (String)attributes.get("XCG01022");

		if (XCG01022 != null) {
			setXCG01022(XCG01022);
		}

		String XCG01024 = (String)attributes.get("XCG01024");

		if (XCG01024 != null) {
			setXCG01024(XCG01024);
		}

		String XCG01025 = (String)attributes.get("XCG01025");

		if (XCG01025 != null) {
			setXCG01025(XCG01025);
		}

		String XCG01026 = (String)attributes.get("XCG01026");

		if (XCG01026 != null) {
			setXCG01026(XCG01026);
		}

		String XCG01027 = (String)attributes.get("XCG01027");

		if (XCG01027 != null) {
			setXCG01027(XCG01027);
		}

		String XCG01028 = (String)attributes.get("XCG01028");

		if (XCG01028 != null) {
			setXCG01028(XCG01028);
		}

		String XCG01030 = (String)attributes.get("XCG01030");

		if (XCG01030 != null) {
			setXCG01030(XCG01030);
		}

		String XCG01031 = (String)attributes.get("XCG01031");

		if (XCG01031 != null) {
			setXCG01031(XCG01031);
		}

		String XCG01032 = (String)attributes.get("XCG01032");

		if (XCG01032 != null) {
			setXCG01032(XCG01032);
		}

		String XCG01033 = (String)attributes.get("XCG01033");

		if (XCG01033 != null) {
			setXCG01033(XCG01033);
		}

		String XCG01034 = (String)attributes.get("XCG01034");

		if (XCG01034 != null) {
			setXCG01034(XCG01034);
		}

		String XCG01035 = (String)attributes.get("XCG01035");

		if (XCG01035 != null) {
			setXCG01035(XCG01035);
		}

		String XCG01036 = (String)attributes.get("XCG01036");

		if (XCG01036 != null) {
			setXCG01036(XCG01036);
		}

		String XCG01037 = (String)attributes.get("XCG01037");

		if (XCG01037 != null) {
			setXCG01037(XCG01037);
		}

		String XCG01038 = (String)attributes.get("XCG01038");

		if (XCG01038 != null) {
			setXCG01038(XCG01038);
		}

		String XCG01039 = (String)attributes.get("XCG01039");

		if (XCG01039 != null) {
			setXCG01039(XCG01039);
		}

		String XCG01040 = (String)attributes.get("XCG01040");

		if (XCG01040 != null) {
			setXCG01040(XCG01040);
		}

		String XCG01041 = (String)attributes.get("XCG01041");

		if (XCG01041 != null) {
			setXCG01041(XCG01041);
		}

		String XCG01042 = (String)attributes.get("XCG01042");

		if (XCG01042 != null) {
			setXCG01042(XCG01042);
		}

		String XCG01043 = (String)attributes.get("XCG01043");

		if (XCG01043 != null) {
			setXCG01043(XCG01043);
		}

		String XCG01044 = (String)attributes.get("XCG01044");

		if (XCG01044 != null) {
			setXCG01044(XCG01044);
		}

		String XCG01045 = (String)attributes.get("XCG01045");

		if (XCG01045 != null) {
			setXCG01045(XCG01045);
		}

		String XCG01046 = (String)attributes.get("XCG01046");

		if (XCG01046 != null) {
			setXCG01046(XCG01046);
		}

		String XCG01047 = (String)attributes.get("XCG01047");

		if (XCG01047 != null) {
			setXCG01047(XCG01047);
		}

		String XCG01049 = (String)attributes.get("XCG01049");

		if (XCG01049 != null) {
			setXCG01049(XCG01049);
		}

		String XCG01050 = (String)attributes.get("XCG01050");

		if (XCG01050 != null) {
			setXCG01050(XCG01050);
		}

		String XCG01051 = (String)attributes.get("XCG01051");

		if (XCG01051 != null) {
			setXCG01051(XCG01051);
		}

		String XCG01052 = (String)attributes.get("XCG01052");

		if (XCG01052 != null) {
			setXCG01052(XCG01052);
		}

		String XCG01053 = (String)attributes.get("XCG01053");

		if (XCG01053 != null) {
			setXCG01053(XCG01053);
		}

		String XCG01054 = (String)attributes.get("XCG01054");

		if (XCG01054 != null) {
			setXCG01054(XCG01054);
		}

		String XCG01055 = (String)attributes.get("XCG01055");

		if (XCG01055 != null) {
			setXCG01055(XCG01055);
		}

		String XCG01056 = (String)attributes.get("XCG01056");

		if (XCG01056 != null) {
			setXCG01056(XCG01056);
		}

		String XCG01057 = (String)attributes.get("XCG01057");

		if (XCG01057 != null) {
			setXCG01057(XCG01057);
		}

		String XCG01058 = (String)attributes.get("XCG01058");

		if (XCG01058 != null) {
			setXCG01058(XCG01058);
		}

		String XCG01059 = (String)attributes.get("XCG01059");

		if (XCG01059 != null) {
			setXCG01059(XCG01059);
		}

		String XCG01060 = (String)attributes.get("XCG01060");

		if (XCG01060 != null) {
			setXCG01060(XCG01060);
		}

		String XCG01062 = (String)attributes.get("XCG01062");

		if (XCG01062 != null) {
			setXCG01062(XCG01062);
		}

		String XCG01063 = (String)attributes.get("XCG01063");

		if (XCG01063 != null) {
			setXCG01063(XCG01063);
		}

		String XCG01064 = (String)attributes.get("XCG01064");

		if (XCG01064 != null) {
			setXCG01064(XCG01064);
		}

		String XCG01065 = (String)attributes.get("XCG01065");

		if (XCG01065 != null) {
			setXCG01065(XCG01065);
		}

		String XCG01066 = (String)attributes.get("XCG01066");

		if (XCG01066 != null) {
			setXCG01066(XCG01066);
		}

		String XCG01067 = (String)attributes.get("XCG01067");

		if (XCG01067 != null) {
			setXCG01067(XCG01067);
		}

		String XCG01068 = (String)attributes.get("XCG01068");

		if (XCG01068 != null) {
			setXCG01068(XCG01068);
		}

		String XCG01069 = (String)attributes.get("XCG01069");

		if (XCG01069 != null) {
			setXCG01069(XCG01069);
		}

		String XCG01070 = (String)attributes.get("XCG01070");

		if (XCG01070 != null) {
			setXCG01070(XCG01070);
		}

		String XCG01072 = (String)attributes.get("XCG01072");

		if (XCG01072 != null) {
			setXCG01072(XCG01072);
		}

		String XCG01073 = (String)attributes.get("XCG01073");

		if (XCG01073 != null) {
			setXCG01073(XCG01073);
		}

		String XCG01074 = (String)attributes.get("XCG01074");

		if (XCG01074 != null) {
			setXCG01074(XCG01074);
		}

		String XCG01075 = (String)attributes.get("XCG01075");

		if (XCG01075 != null) {
			setXCG01075(XCG01075);
		}

		String XCG01076 = (String)attributes.get("XCG01076");

		if (XCG01076 != null) {
			setXCG01076(XCG01076);
		}

		String XCG01077 = (String)attributes.get("XCG01077");

		if (XCG01077 != null) {
			setXCG01077(XCG01077);
		}

		String XCG01078 = (String)attributes.get("XCG01078");

		if (XCG01078 != null) {
			setXCG01078(XCG01078);
		}

		String XCG01079 = (String)attributes.get("XCG01079");

		if (XCG01079 != null) {
			setXCG01079(XCG01079);
		}

		String XCG01080 = (String)attributes.get("XCG01080");

		if (XCG01080 != null) {
			setXCG01080(XCG01080);
		}

		String XCG01081 = (String)attributes.get("XCG01081");

		if (XCG01081 != null) {
			setXCG01081(XCG01081);
		}

		String XCG01082 = (String)attributes.get("XCG01082");

		if (XCG01082 != null) {
			setXCG01082(XCG01082);
		}

		String XCG01083 = (String)attributes.get("XCG01083");

		if (XCG01083 != null) {
			setXCG01083(XCG01083);
		}

		String XCG01084 = (String)attributes.get("XCG01084");

		if (XCG01084 != null) {
			setXCG01084(XCG01084);
		}

		String XCG01085 = (String)attributes.get("XCG01085");

		if (XCG01085 != null) {
			setXCG01085(XCG01085);
		}

		String XCG01086 = (String)attributes.get("XCG01086");

		if (XCG01086 != null) {
			setXCG01086(XCG01086);
		}

		String XCG01087 = (String)attributes.get("XCG01087");

		if (XCG01087 != null) {
			setXCG01087(XCG01087);
		}

		String XCG01088 = (String)attributes.get("XCG01088");

		if (XCG01088 != null) {
			setXCG01088(XCG01088);
		}

		String XCG01089 = (String)attributes.get("XCG01089");

		if (XCG01089 != null) {
			setXCG01089(XCG01089);
		}

		String XCG01090 = (String)attributes.get("XCG01090");

		if (XCG01090 != null) {
			setXCG01090(XCG01090);
		}

		String XCG01091 = (String)attributes.get("XCG01091");

		if (XCG01091 != null) {
			setXCG01091(XCG01091);
		}

		String XCG01092 = (String)attributes.get("XCG01092");

		if (XCG01092 != null) {
			setXCG01092(XCG01092);
		}

		String XCG01093 = (String)attributes.get("XCG01093");

		if (XCG01093 != null) {
			setXCG01093(XCG01093);
		}

		String XCG01094 = (String)attributes.get("XCG01094");

		if (XCG01094 != null) {
			setXCG01094(XCG01094);
		}

		String XCG01095 = (String)attributes.get("XCG01095");

		if (XCG01095 != null) {
			setXCG01095(XCG01095);
		}

		String XCG01096 = (String)attributes.get("XCG01096");

		if (XCG01096 != null) {
			setXCG01096(XCG01096);
		}

		String XCG01097 = (String)attributes.get("XCG01097");

		if (XCG01097 != null) {
			setXCG01097(XCG01097);
		}

		String XCG01098 = (String)attributes.get("XCG01098");

		if (XCG01098 != null) {
			setXCG01098(XCG01098);
		}

		String XCG01099 = (String)attributes.get("XCG01099");

		if (XCG01099 != null) {
			setXCG01099(XCG01099);
		}

		String XCG01100 = (String)attributes.get("XCG01100");

		if (XCG01100 != null) {
			setXCG01100(XCG01100);
		}

		String XCG01101 = (String)attributes.get("XCG01101");

		if (XCG01101 != null) {
			setXCG01101(XCG01101);
		}

		String XCG01102 = (String)attributes.get("XCG01102");

		if (XCG01102 != null) {
			setXCG01102(XCG01102);
		}

		String XCG01103 = (String)attributes.get("XCG01103");

		if (XCG01103 != null) {
			setXCG01103(XCG01103);
		}

		String XCG01104 = (String)attributes.get("XCG01104");

		if (XCG01104 != null) {
			setXCG01104(XCG01104);
		}

		String XCG01105 = (String)attributes.get("XCG01105");

		if (XCG01105 != null) {
			setXCG01105(XCG01105);
		}

		String XCG01106 = (String)attributes.get("XCG01106");

		if (XCG01106 != null) {
			setXCG01106(XCG01106);
		}

		String XCG01107 = (String)attributes.get("XCG01107");

		if (XCG01107 != null) {
			setXCG01107(XCG01107);
		}

		String XCG01108 = (String)attributes.get("XCG01108");

		if (XCG01108 != null) {
			setXCG01108(XCG01108);
		}

		String XCG01109 = (String)attributes.get("XCG01109");

		if (XCG01109 != null) {
			setXCG01109(XCG01109);
		}

		String XCG01110 = (String)attributes.get("XCG01110");

		if (XCG01110 != null) {
			setXCG01110(XCG01110);
		}

		String XCG01111 = (String)attributes.get("XCG01111");

		if (XCG01111 != null) {
			setXCG01111(XCG01111);
		}

		String XCG01112 = (String)attributes.get("XCG01112");

		if (XCG01112 != null) {
			setXCG01112(XCG01112);
		}

		String XCG01113 = (String)attributes.get("XCG01113");

		if (XCG01113 != null) {
			setXCG01113(XCG01113);
		}

		String XCG01114 = (String)attributes.get("XCG01114");

		if (XCG01114 != null) {
			setXCG01114(XCG01114);
		}

		String XCG01115 = (String)attributes.get("XCG01115");

		if (XCG01115 != null) {
			setXCG01115(XCG01115);
		}

		String XCG01116 = (String)attributes.get("XCG01116");

		if (XCG01116 != null) {
			setXCG01116(XCG01116);
		}

		String XCG01117 = (String)attributes.get("XCG01117");

		if (XCG01117 != null) {
			setXCG01117(XCG01117);
		}

		String XCG01118 = (String)attributes.get("XCG01118");

		if (XCG01118 != null) {
			setXCG01118(XCG01118);
		}

		String XCG01119 = (String)attributes.get("XCG01119");

		if (XCG01119 != null) {
			setXCG01119(XCG01119);
		}

		String XCG01120 = (String)attributes.get("XCG01120");

		if (XCG01120 != null) {
			setXCG01120(XCG01120);
		}

		String XCG01121 = (String)attributes.get("XCG01121");

		if (XCG01121 != null) {
			setXCG01121(XCG01121);
		}

		String XCG01122 = (String)attributes.get("XCG01122");

		if (XCG01122 != null) {
			setXCG01122(XCG01122);
		}

		String XCG01123 = (String)attributes.get("XCG01123");

		if (XCG01123 != null) {
			setXCG01123(XCG01123);
		}

		String XCG01124 = (String)attributes.get("XCG01124");

		if (XCG01124 != null) {
			setXCG01124(XCG01124);
		}

		String XCG01125 = (String)attributes.get("XCG01125");

		if (XCG01125 != null) {
			setXCG01125(XCG01125);
		}

		String XCG01126 = (String)attributes.get("XCG01126");

		if (XCG01126 != null) {
			setXCG01126(XCG01126);
		}

		String XCG01127 = (String)attributes.get("XCG01127");

		if (XCG01127 != null) {
			setXCG01127(XCG01127);
		}

		String XCG01128 = (String)attributes.get("XCG01128");

		if (XCG01128 != null) {
			setXCG01128(XCG01128);
		}

		String XCG01129 = (String)attributes.get("XCG01129");

		if (XCG01129 != null) {
			setXCG01129(XCG01129);
		}

		String XCG01130 = (String)attributes.get("XCG01130");

		if (XCG01130 != null) {
			setXCG01130(XCG01130);
		}

		String XCG01131 = (String)attributes.get("XCG01131");

		if (XCG01131 != null) {
			setXCG01131(XCG01131);
		}

		String XCG01132 = (String)attributes.get("XCG01132");

		if (XCG01132 != null) {
			setXCG01132(XCG01132);
		}

		String XCG01133 = (String)attributes.get("XCG01133");

		if (XCG01133 != null) {
			setXCG01133(XCG01133);
		}

		String XCG01134 = (String)attributes.get("XCG01134");

		if (XCG01134 != null) {
			setXCG01134(XCG01134);
		}

		String XCG01135 = (String)attributes.get("XCG01135");

		if (XCG01135 != null) {
			setXCG01135(XCG01135);
		}

		String XCG01136 = (String)attributes.get("XCG01136");

		if (XCG01136 != null) {
			setXCG01136(XCG01136);
		}

		String XCG01137 = (String)attributes.get("XCG01137");

		if (XCG01137 != null) {
			setXCG01137(XCG01137);
		}

		String XCG01138 = (String)attributes.get("XCG01138");

		if (XCG01138 != null) {
			setXCG01138(XCG01138);
		}

		String XCG01139 = (String)attributes.get("XCG01139");

		if (XCG01139 != null) {
			setXCG01139(XCG01139);
		}

		String XCG01140 = (String)attributes.get("XCG01140");

		if (XCG01140 != null) {
			setXCG01140(XCG01140);
		}

		String XCG01141 = (String)attributes.get("XCG01141");

		if (XCG01141 != null) {
			setXCG01141(XCG01141);
		}

		String XCG01142 = (String)attributes.get("XCG01142");

		if (XCG01142 != null) {
			setXCG01142(XCG01142);
		}

		String XCG01143 = (String)attributes.get("XCG01143");

		if (XCG01143 != null) {
			setXCG01143(XCG01143);
		}

		String XCG01144 = (String)attributes.get("XCG01144");

		if (XCG01144 != null) {
			setXCG01144(XCG01144);
		}

		String XCG01145 = (String)attributes.get("XCG01145");

		if (XCG01145 != null) {
			setXCG01145(XCG01145);
		}

		String XCG01146 = (String)attributes.get("XCG01146");

		if (XCG01146 != null) {
			setXCG01146(XCG01146);
		}

		String XCG01147 = (String)attributes.get("XCG01147");

		if (XCG01147 != null) {
			setXCG01147(XCG01147);
		}

		String XCG01148 = (String)attributes.get("XCG01148");

		if (XCG01148 != null) {
			setXCG01148(XCG01148);
		}

		String XCG01149 = (String)attributes.get("XCG01149");

		if (XCG01149 != null) {
			setXCG01149(XCG01149);
		}

		String XCG01150 = (String)attributes.get("XCG01150");

		if (XCG01150 != null) {
			setXCG01150(XCG01150);
		}

		String XCG01151 = (String)attributes.get("XCG01151");

		if (XCG01151 != null) {
			setXCG01151(XCG01151);
		}

		String XCG01152 = (String)attributes.get("XCG01152");

		if (XCG01152 != null) {
			setXCG01152(XCG01152);
		}

		String XCG01153 = (String)attributes.get("XCG01153");

		if (XCG01153 != null) {
			setXCG01153(XCG01153);
		}

		String XCG01154 = (String)attributes.get("XCG01154");

		if (XCG01154 != null) {
			setXCG01154(XCG01154);
		}

		String XCG01155 = (String)attributes.get("XCG01155");

		if (XCG01155 != null) {
			setXCG01155(XCG01155);
		}

		String XCG01156 = (String)attributes.get("XCG01156");

		if (XCG01156 != null) {
			setXCG01156(XCG01156);
		}

		String XCG01157 = (String)attributes.get("XCG01157");

		if (XCG01157 != null) {
			setXCG01157(XCG01157);
		}

		String XCG01158 = (String)attributes.get("XCG01158");

		if (XCG01158 != null) {
			setXCG01158(XCG01158);
		}

		String XCG01159 = (String)attributes.get("XCG01159");

		if (XCG01159 != null) {
			setXCG01159(XCG01159);
		}

		String XCG01160 = (String)attributes.get("XCG01160");

		if (XCG01160 != null) {
			setXCG01160(XCG01160);
		}

		String XCG01161 = (String)attributes.get("XCG01161");

		if (XCG01161 != null) {
			setXCG01161(XCG01161);
		}

		String XCG01162 = (String)attributes.get("XCG01162");

		if (XCG01162 != null) {
			setXCG01162(XCG01162);
		}

		String XCG01163 = (String)attributes.get("XCG01163");

		if (XCG01163 != null) {
			setXCG01163(XCG01163);
		}

		String XCG01164 = (String)attributes.get("XCG01164");

		if (XCG01164 != null) {
			setXCG01164(XCG01164);
		}

		String XCG01165 = (String)attributes.get("XCG01165");

		if (XCG01165 != null) {
			setXCG01165(XCG01165);
		}

		String XCG01166 = (String)attributes.get("XCG01166");

		if (XCG01166 != null) {
			setXCG01166(XCG01166);
		}

		String XCG01167 = (String)attributes.get("XCG01167");

		if (XCG01167 != null) {
			setXCG01167(XCG01167);
		}

		String XCG01169 = (String)attributes.get("XCG01169");

		if (XCG01169 != null) {
			setXCG01169(XCG01169);
		}

		String XCG01170 = (String)attributes.get("XCG01170");

		if (XCG01170 != null) {
			setXCG01170(XCG01170);
		}

		String XCG01171 = (String)attributes.get("XCG01171");

		if (XCG01171 != null) {
			setXCG01171(XCG01171);
		}

		String XCG01172 = (String)attributes.get("XCG01172");

		if (XCG01172 != null) {
			setXCG01172(XCG01172);
		}

		String XCG01173 = (String)attributes.get("XCG01173");

		if (XCG01173 != null) {
			setXCG01173(XCG01173);
		}

		String XCG01174 = (String)attributes.get("XCG01174");

		if (XCG01174 != null) {
			setXCG01174(XCG01174);
		}

		String XCG01175 = (String)attributes.get("XCG01175");

		if (XCG01175 != null) {
			setXCG01175(XCG01175);
		}

		String XCG01176 = (String)attributes.get("XCG01176");

		if (XCG01176 != null) {
			setXCG01176(XCG01176);
		}

		String XCG01177 = (String)attributes.get("XCG01177");

		if (XCG01177 != null) {
			setXCG01177(XCG01177);
		}

		String XCG01178 = (String)attributes.get("XCG01178");

		if (XCG01178 != null) {
			setXCG01178(XCG01178);
		}

		String XCG01179 = (String)attributes.get("XCG01179");

		if (XCG01179 != null) {
			setXCG01179(XCG01179);
		}

		String XCG01180 = (String)attributes.get("XCG01180");

		if (XCG01180 != null) {
			setXCG01180(XCG01180);
		}

		String XCG01181 = (String)attributes.get("XCG01181");

		if (XCG01181 != null) {
			setXCG01181(XCG01181);
		}

		String XCG01182 = (String)attributes.get("XCG01182");

		if (XCG01182 != null) {
			setXCG01182(XCG01182);
		}

		String XCG01183 = (String)attributes.get("XCG01183");

		if (XCG01183 != null) {
			setXCG01183(XCG01183);
		}

		String XCG01184 = (String)attributes.get("XCG01184");

		if (XCG01184 != null) {
			setXCG01184(XCG01184);
		}

		String XCG01185 = (String)attributes.get("XCG01185");

		if (XCG01185 != null) {
			setXCG01185(XCG01185);
		}

		String XCG01186 = (String)attributes.get("XCG01186");

		if (XCG01186 != null) {
			setXCG01186(XCG01186);
		}

		String XCG01187 = (String)attributes.get("XCG01187");

		if (XCG01187 != null) {
			setXCG01187(XCG01187);
		}

		String XCG01188 = (String)attributes.get("XCG01188");

		if (XCG01188 != null) {
			setXCG01188(XCG01188);
		}

		String XCG01189 = (String)attributes.get("XCG01189");

		if (XCG01189 != null) {
			setXCG01189(XCG01189);
		}

		String XCG01190 = (String)attributes.get("XCG01190");

		if (XCG01190 != null) {
			setXCG01190(XCG01190);
		}

		String XCG01191 = (String)attributes.get("XCG01191");

		if (XCG01191 != null) {
			setXCG01191(XCG01191);
		}

		String XCG01192 = (String)attributes.get("XCG01192");

		if (XCG01192 != null) {
			setXCG01192(XCG01192);
		}

		String XCG01193 = (String)attributes.get("XCG01193");

		if (XCG01193 != null) {
			setXCG01193(XCG01193);
		}

		String XCG01194 = (String)attributes.get("XCG01194");

		if (XCG01194 != null) {
			setXCG01194(XCG01194);
		}

		String XCG01195 = (String)attributes.get("XCG01195");

		if (XCG01195 != null) {
			setXCG01195(XCG01195);
		}

		String XCG01196 = (String)attributes.get("XCG01196");

		if (XCG01196 != null) {
			setXCG01196(XCG01196);
		}

		String XCG01197 = (String)attributes.get("XCG01197");

		if (XCG01197 != null) {
			setXCG01197(XCG01197);
		}

		String XCG01198 = (String)attributes.get("XCG01198");

		if (XCG01198 != null) {
			setXCG01198(XCG01198);
		}

		String XCG01199 = (String)attributes.get("XCG01199");

		if (XCG01199 != null) {
			setXCG01199(XCG01199);
		}

		String XCG01200 = (String)attributes.get("XCG01200");

		if (XCG01200 != null) {
			setXCG01200(XCG01200);
		}

		String XCG01202 = (String)attributes.get("XCG01202");

		if (XCG01202 != null) {
			setXCG01202(XCG01202);
		}

		String XCG01203 = (String)attributes.get("XCG01203");

		if (XCG01203 != null) {
			setXCG01203(XCG01203);
		}

		String XCG01204 = (String)attributes.get("XCG01204");

		if (XCG01204 != null) {
			setXCG01204(XCG01204);
		}

		String XCG01205 = (String)attributes.get("XCG01205");

		if (XCG01205 != null) {
			setXCG01205(XCG01205);
		}

		String XCG01206 = (String)attributes.get("XCG01206");

		if (XCG01206 != null) {
			setXCG01206(XCG01206);
		}

		String XCG01207 = (String)attributes.get("XCG01207");

		if (XCG01207 != null) {
			setXCG01207(XCG01207);
		}

		String XCG01208 = (String)attributes.get("XCG01208");

		if (XCG01208 != null) {
			setXCG01208(XCG01208);
		}

		String XCG01209 = (String)attributes.get("XCG01209");

		if (XCG01209 != null) {
			setXCG01209(XCG01209);
		}

		String XCG01210 = (String)attributes.get("XCG01210");

		if (XCG01210 != null) {
			setXCG01210(XCG01210);
		}

		String XCG01212 = (String)attributes.get("XCG01212");

		if (XCG01212 != null) {
			setXCG01212(XCG01212);
		}

		String XCG01213 = (String)attributes.get("XCG01213");

		if (XCG01213 != null) {
			setXCG01213(XCG01213);
		}

		String XCG01214 = (String)attributes.get("XCG01214");

		if (XCG01214 != null) {
			setXCG01214(XCG01214);
		}

		String XCG01215 = (String)attributes.get("XCG01215");

		if (XCG01215 != null) {
			setXCG01215(XCG01215);
		}

		String XCG01216 = (String)attributes.get("XCG01216");

		if (XCG01216 != null) {
			setXCG01216(XCG01216);
		}

		String XCG01217 = (String)attributes.get("XCG01217");

		if (XCG01217 != null) {
			setXCG01217(XCG01217);
		}

		String XCG01218 = (String)attributes.get("XCG01218");

		if (XCG01218 != null) {
			setXCG01218(XCG01218);
		}

		String XCG01219 = (String)attributes.get("XCG01219");

		if (XCG01219 != null) {
			setXCG01219(XCG01219);
		}

		String XCG01220 = (String)attributes.get("XCG01220");

		if (XCG01220 != null) {
			setXCG01220(XCG01220);
		}

		String XCG01221 = (String)attributes.get("XCG01221");

		if (XCG01221 != null) {
			setXCG01221(XCG01221);
		}

		String XCG01222 = (String)attributes.get("XCG01222");

		if (XCG01222 != null) {
			setXCG01222(XCG01222);
		}

		String XCG01223 = (String)attributes.get("XCG01223");

		if (XCG01223 != null) {
			setXCG01223(XCG01223);
		}

		String XCG01224 = (String)attributes.get("XCG01224");

		if (XCG01224 != null) {
			setXCG01224(XCG01224);
		}

		String XCG01225 = (String)attributes.get("XCG01225");

		if (XCG01225 != null) {
			setXCG01225(XCG01225);
		}

		String XCG01226 = (String)attributes.get("XCG01226");

		if (XCG01226 != null) {
			setXCG01226(XCG01226);
		}

		String XCG01228 = (String)attributes.get("XCG01228");

		if (XCG01228 != null) {
			setXCG01228(XCG01228);
		}

		String XCG01230 = (String)attributes.get("XCG01230");

		if (XCG01230 != null) {
			setXCG01230(XCG01230);
		}

		String XCG01231 = (String)attributes.get("XCG01231");

		if (XCG01231 != null) {
			setXCG01231(XCG01231);
		}

		String XCG01232 = (String)attributes.get("XCG01232");

		if (XCG01232 != null) {
			setXCG01232(XCG01232);
		}

		String XCG01234 = (String)attributes.get("XCG01234");

		if (XCG01234 != null) {
			setXCG01234(XCG01234);
		}

		String XCG01236 = (String)attributes.get("XCG01236");

		if (XCG01236 != null) {
			setXCG01236(XCG01236);
		}

		String XCG01237 = (String)attributes.get("XCG01237");

		if (XCG01237 != null) {
			setXCG01237(XCG01237);
		}

		String XCG01229 = (String)attributes.get("XCG01229");

		if (XCG01229 != null) {
			setXCG01229(XCG01229);
		}

		String XCG01238 = (String)attributes.get("XCG01238");

		if (XCG01238 != null) {
			setXCG01238(XCG01238);
		}

		String XCG01239 = (String)attributes.get("XCG01239");

		if (XCG01239 != null) {
			setXCG01239(XCG01239);
		}

		String XCG01240 = (String)attributes.get("XCG01240");

		if (XCG01240 != null) {
			setXCG01240(XCG01240);
		}

		String XCG01241 = (String)attributes.get("XCG01241");

		if (XCG01241 != null) {
			setXCG01241(XCG01241);
		}

		String XCG01242 = (String)attributes.get("XCG01242");

		if (XCG01242 != null) {
			setXCG01242(XCG01242);
		}

		String XCG01243 = (String)attributes.get("XCG01243");

		if (XCG01243 != null) {
			setXCG01243(XCG01243);
		}

		String XCG01235 = (String)attributes.get("XCG01235");

		if (XCG01235 != null) {
			setXCG01235(XCG01235);
		}

		String XCG01244 = (String)attributes.get("XCG01244");

		if (XCG01244 != null) {
			setXCG01244(XCG01244);
		}

		String XCG01245 = (String)attributes.get("XCG01245");

		if (XCG01245 != null) {
			setXCG01245(XCG01245);
		}

		String XCG01246 = (String)attributes.get("XCG01246");

		if (XCG01246 != null) {
			setXCG01246(XCG01246);
		}

		String XCG01247 = (String)attributes.get("XCG01247");

		if (XCG01247 != null) {
			setXCG01247(XCG01247);
		}

		String XCG01248 = (String)attributes.get("XCG01248");

		if (XCG01248 != null) {
			setXCG01248(XCG01248);
		}

		String XCG01249 = (String)attributes.get("XCG01249");

		if (XCG01249 != null) {
			setXCG01249(XCG01249);
		}

		String XCG11248 = (String)attributes.get("XCG11248");

		if (XCG11248 != null) {
			setXCG11248(XCG11248);
		}

		String XCG11249 = (String)attributes.get("XCG11249");

		if (XCG11249 != null) {
			setXCG11249(XCG11249);
		}

		String XCG01250 = (String)attributes.get("XCG01250");

		if (XCG01250 != null) {
			setXCG01250(XCG01250);
		}

		String XCG01251 = (String)attributes.get("XCG01251");

		if (XCG01251 != null) {
			setXCG01251(XCG01251);
		}

		String XCG01252 = (String)attributes.get("XCG01252");

		if (XCG01252 != null) {
			setXCG01252(XCG01252);
		}

		String XCG01253 = (String)attributes.get("XCG01253");

		if (XCG01253 != null) {
			setXCG01253(XCG01253);
		}

		String XCG01255 = (String)attributes.get("XCG01255");

		if (XCG01255 != null) {
			setXCG01255(XCG01255);
		}

		String XCG01256 = (String)attributes.get("XCG01256");

		if (XCG01256 != null) {
			setXCG01256(XCG01256);
		}

		String XCG01257 = (String)attributes.get("XCG01257");

		if (XCG01257 != null) {
			setXCG01257(XCG01257);
		}

		String XCG01258 = (String)attributes.get("XCG01258");

		if (XCG01258 != null) {
			setXCG01258(XCG01258);
		}

		String XCG01259 = (String)attributes.get("XCG01259");

		if (XCG01259 != null) {
			setXCG01259(XCG01259);
		}

		String XCG01260 = (String)attributes.get("XCG01260");

		if (XCG01260 != null) {
			setXCG01260(XCG01260);
		}

		String XCG01261 = (String)attributes.get("XCG01261");

		if (XCG01261 != null) {
			setXCG01261(XCG01261);
		}

		String XCG01262 = (String)attributes.get("XCG01262");

		if (XCG01262 != null) {
			setXCG01262(XCG01262);
		}

		String XCG11253 = (String)attributes.get("XCG11253");

		if (XCG11253 != null) {
			setXCG11253(XCG11253);
		}

		String XCG01263 = (String)attributes.get("XCG01263");

		if (XCG01263 != null) {
			setXCG01263(XCG01263);
		}

		String XCG01264 = (String)attributes.get("XCG01264");

		if (XCG01264 != null) {
			setXCG01264(XCG01264);
		}

		String XCG01265 = (String)attributes.get("XCG01265");

		if (XCG01265 != null) {
			setXCG01265(XCG01265);
		}

		String XCG01266 = (String)attributes.get("XCG01266");

		if (XCG01266 != null) {
			setXCG01266(XCG01266);
		}

		String XCG01901 = (String)attributes.get("XCG01901");

		if (XCG01901 != null) {
			setXCG01901(XCG01901);
		}

		String XCG01267 = (String)attributes.get("XCG01267");

		if (XCG01267 != null) {
			setXCG01267(XCG01267);
		}

		String XCG01902 = (String)attributes.get("XCG01902");

		if (XCG01902 != null) {
			setXCG01902(XCG01902);
		}

		String XCG01268 = (String)attributes.get("XCG01268");

		if (XCG01268 != null) {
			setXCG01268(XCG01268);
		}

		String XCG01269 = (String)attributes.get("XCG01269");

		if (XCG01269 != null) {
			setXCG01269(XCG01269);
		}

		String XCG01903 = (String)attributes.get("XCG01903");

		if (XCG01903 != null) {
			setXCG01903(XCG01903);
		}

		String XCG01270 = (String)attributes.get("XCG01270");

		if (XCG01270 != null) {
			setXCG01270(XCG01270);
		}

		String XCG01271 = (String)attributes.get("XCG01271");

		if (XCG01271 != null) {
			setXCG01271(XCG01271);
		}

		String XCG01273 = (String)attributes.get("XCG01273");

		if (XCG01273 != null) {
			setXCG01273(XCG01273);
		}

		String XCG01274 = (String)attributes.get("XCG01274");

		if (XCG01274 != null) {
			setXCG01274(XCG01274);
		}

		String XCG01275 = (String)attributes.get("XCG01275");

		if (XCG01275 != null) {
			setXCG01275(XCG01275);
		}

		String XCG01276 = (String)attributes.get("XCG01276");

		if (XCG01276 != null) {
			setXCG01276(XCG01276);
		}

		String XCG01277 = (String)attributes.get("XCG01277");

		if (XCG01277 != null) {
			setXCG01277(XCG01277);
		}

		String XCG01278 = (String)attributes.get("XCG01278");

		if (XCG01278 != null) {
			setXCG01278(XCG01278);
		}

		String XCG01279 = (String)attributes.get("XCG01279");

		if (XCG01279 != null) {
			setXCG01279(XCG01279);
		}

		String XCG01280 = (String)attributes.get("XCG01280");

		if (XCG01280 != null) {
			setXCG01280(XCG01280);
		}

		String XCG01281 = (String)attributes.get("XCG01281");

		if (XCG01281 != null) {
			setXCG01281(XCG01281);
		}

		String XCG01282 = (String)attributes.get("XCG01282");

		if (XCG01282 != null) {
			setXCG01282(XCG01282);
		}

		String XCG01283 = (String)attributes.get("XCG01283");

		if (XCG01283 != null) {
			setXCG01283(XCG01283);
		}

		String XCG01284 = (String)attributes.get("XCG01284");

		if (XCG01284 != null) {
			setXCG01284(XCG01284);
		}

		String XCG01285 = (String)attributes.get("XCG01285");

		if (XCG01285 != null) {
			setXCG01285(XCG01285);
		}

		String XCG01286 = (String)attributes.get("XCG01286");

		if (XCG01286 != null) {
			setXCG01286(XCG01286);
		}

		String XCG01287 = (String)attributes.get("XCG01287");

		if (XCG01287 != null) {
			setXCG01287(XCG01287);
		}

		String XCG01288 = (String)attributes.get("XCG01288");

		if (XCG01288 != null) {
			setXCG01288(XCG01288);
		}

		String XCG01289 = (String)attributes.get("XCG01289");

		if (XCG01289 != null) {
			setXCG01289(XCG01289);
		}

		String XCG01290 = (String)attributes.get("XCG01290");

		if (XCG01290 != null) {
			setXCG01290(XCG01290);
		}

		String XCG01291 = (String)attributes.get("XCG01291");

		if (XCG01291 != null) {
			setXCG01291(XCG01291);
		}

		String XCG01292 = (String)attributes.get("XCG01292");

		if (XCG01292 != null) {
			setXCG01292(XCG01292);
		}

		String XCG01293 = (String)attributes.get("XCG01293");

		if (XCG01293 != null) {
			setXCG01293(XCG01293);
		}

		String XCG01294 = (String)attributes.get("XCG01294");

		if (XCG01294 != null) {
			setXCG01294(XCG01294);
		}

		String XCG01295 = (String)attributes.get("XCG01295");

		if (XCG01295 != null) {
			setXCG01295(XCG01295);
		}

		String XCG01296 = (String)attributes.get("XCG01296");

		if (XCG01296 != null) {
			setXCG01296(XCG01296);
		}

		String XCG01297 = (String)attributes.get("XCG01297");

		if (XCG01297 != null) {
			setXCG01297(XCG01297);
		}

		String XCG01298 = (String)attributes.get("XCG01298");

		if (XCG01298 != null) {
			setXCG01298(XCG01298);
		}

		String XCG01300 = (String)attributes.get("XCG01300");

		if (XCG01300 != null) {
			setXCG01300(XCG01300);
		}

		String XCG01301 = (String)attributes.get("XCG01301");

		if (XCG01301 != null) {
			setXCG01301(XCG01301);
		}

		String XCG01302 = (String)attributes.get("XCG01302");

		if (XCG01302 != null) {
			setXCG01302(XCG01302);
		}

		String XCG01303 = (String)attributes.get("XCG01303");

		if (XCG01303 != null) {
			setXCG01303(XCG01303);
		}

		String XCG01304 = (String)attributes.get("XCG01304");

		if (XCG01304 != null) {
			setXCG01304(XCG01304);
		}

		String XCG01305 = (String)attributes.get("XCG01305");

		if (XCG01305 != null) {
			setXCG01305(XCG01305);
		}

		String XCG01306 = (String)attributes.get("XCG01306");

		if (XCG01306 != null) {
			setXCG01306(XCG01306);
		}

		String XCG01307 = (String)attributes.get("XCG01307");

		if (XCG01307 != null) {
			setXCG01307(XCG01307);
		}

		String XCG01308 = (String)attributes.get("XCG01308");

		if (XCG01308 != null) {
			setXCG01308(XCG01308);
		}

		String XCG01310 = (String)attributes.get("XCG01310");

		if (XCG01310 != null) {
			setXCG01310(XCG01310);
		}

		String XCG01311 = (String)attributes.get("XCG01311");

		if (XCG01311 != null) {
			setXCG01311(XCG01311);
		}

		String XCG01312 = (String)attributes.get("XCG01312");

		if (XCG01312 != null) {
			setXCG01312(XCG01312);
		}

		String XCG01313 = (String)attributes.get("XCG01313");

		if (XCG01313 != null) {
			setXCG01313(XCG01313);
		}

		String XCG01314 = (String)attributes.get("XCG01314");

		if (XCG01314 != null) {
			setXCG01314(XCG01314);
		}

		String XCG01315 = (String)attributes.get("XCG01315");

		if (XCG01315 != null) {
			setXCG01315(XCG01315);
		}

		String XCG01316 = (String)attributes.get("XCG01316");

		if (XCG01316 != null) {
			setXCG01316(XCG01316);
		}

		String XCG01317 = (String)attributes.get("XCG01317");

		if (XCG01317 != null) {
			setXCG01317(XCG01317);
		}

		String XCG01318 = (String)attributes.get("XCG01318");

		if (XCG01318 != null) {
			setXCG01318(XCG01318);
		}

		String XCG01319 = (String)attributes.get("XCG01319");

		if (XCG01319 != null) {
			setXCG01319(XCG01319);
		}

		String XCG01320 = (String)attributes.get("XCG01320");

		if (XCG01320 != null) {
			setXCG01320(XCG01320);
		}

		String XCG01321 = (String)attributes.get("XCG01321");

		if (XCG01321 != null) {
			setXCG01321(XCG01321);
		}

		String XCG01322 = (String)attributes.get("XCG01322");

		if (XCG01322 != null) {
			setXCG01322(XCG01322);
		}

		String XCG01323 = (String)attributes.get("XCG01323");

		if (XCG01323 != null) {
			setXCG01323(XCG01323);
		}

		String XCG01324 = (String)attributes.get("XCG01324");

		if (XCG01324 != null) {
			setXCG01324(XCG01324);
		}

		String XCG01325 = (String)attributes.get("XCG01325");

		if (XCG01325 != null) {
			setXCG01325(XCG01325);
		}

		String XCG01326 = (String)attributes.get("XCG01326");

		if (XCG01326 != null) {
			setXCG01326(XCG01326);
		}

		String XCG01327 = (String)attributes.get("XCG01327");

		if (XCG01327 != null) {
			setXCG01327(XCG01327);
		}

		String XCG01328 = (String)attributes.get("XCG01328");

		if (XCG01328 != null) {
			setXCG01328(XCG01328);
		}

		String XCG01330 = (String)attributes.get("XCG01330");

		if (XCG01330 != null) {
			setXCG01330(XCG01330);
		}

		String XCG01331 = (String)attributes.get("XCG01331");

		if (XCG01331 != null) {
			setXCG01331(XCG01331);
		}

		String XCG01332 = (String)attributes.get("XCG01332");

		if (XCG01332 != null) {
			setXCG01332(XCG01332);
		}

		String XCG01333 = (String)attributes.get("XCG01333");

		if (XCG01333 != null) {
			setXCG01333(XCG01333);
		}

		String XCG01334 = (String)attributes.get("XCG01334");

		if (XCG01334 != null) {
			setXCG01334(XCG01334);
		}

		String XCG01335 = (String)attributes.get("XCG01335");

		if (XCG01335 != null) {
			setXCG01335(XCG01335);
		}

		String XCG01336 = (String)attributes.get("XCG01336");

		if (XCG01336 != null) {
			setXCG01336(XCG01336);
		}

		String XCG01337 = (String)attributes.get("XCG01337");

		if (XCG01337 != null) {
			setXCG01337(XCG01337);
		}

		String XCG01338 = (String)attributes.get("XCG01338");

		if (XCG01338 != null) {
			setXCG01338(XCG01338);
		}

		String XCG01339 = (String)attributes.get("XCG01339");

		if (XCG01339 != null) {
			setXCG01339(XCG01339);
		}

		String XCG01340 = (String)attributes.get("XCG01340");

		if (XCG01340 != null) {
			setXCG01340(XCG01340);
		}

		String XCG01341 = (String)attributes.get("XCG01341");

		if (XCG01341 != null) {
			setXCG01341(XCG01341);
		}

		String XCG01342 = (String)attributes.get("XCG01342");

		if (XCG01342 != null) {
			setXCG01342(XCG01342);
		}

		String XCG01343 = (String)attributes.get("XCG01343");

		if (XCG01343 != null) {
			setXCG01343(XCG01343);
		}

		String XCG01344 = (String)attributes.get("XCG01344");

		if (XCG01344 != null) {
			setXCG01344(XCG01344);
		}

		String XCG01345 = (String)attributes.get("XCG01345");

		if (XCG01345 != null) {
			setXCG01345(XCG01345);
		}

		String XCG01346 = (String)attributes.get("XCG01346");

		if (XCG01346 != null) {
			setXCG01346(XCG01346);
		}

		String XCG01347 = (String)attributes.get("XCG01347");

		if (XCG01347 != null) {
			setXCG01347(XCG01347);
		}

		String XCG01348 = (String)attributes.get("XCG01348");

		if (XCG01348 != null) {
			setXCG01348(XCG01348);
		}

		String XCG01349 = (String)attributes.get("XCG01349");

		if (XCG01349 != null) {
			setXCG01349(XCG01349);
		}

		String XCG01350 = (String)attributes.get("XCG01350");

		if (XCG01350 != null) {
			setXCG01350(XCG01350);
		}

		String XCG01351 = (String)attributes.get("XCG01351");

		if (XCG01351 != null) {
			setXCG01351(XCG01351);
		}

		String XCG01352 = (String)attributes.get("XCG01352");

		if (XCG01352 != null) {
			setXCG01352(XCG01352);
		}

		String XCG01353 = (String)attributes.get("XCG01353");

		if (XCG01353 != null) {
			setXCG01353(XCG01353);
		}

		String XCG01354 = (String)attributes.get("XCG01354");

		if (XCG01354 != null) {
			setXCG01354(XCG01354);
		}

		String XCG01355 = (String)attributes.get("XCG01355");

		if (XCG01355 != null) {
			setXCG01355(XCG01355);
		}

		String XCG01356 = (String)attributes.get("XCG01356");

		if (XCG01356 != null) {
			setXCG01356(XCG01356);
		}

		String XCG01357 = (String)attributes.get("XCG01357");

		if (XCG01357 != null) {
			setXCG01357(XCG01357);
		}

		String XCG01358 = (String)attributes.get("XCG01358");

		if (XCG01358 != null) {
			setXCG01358(XCG01358);
		}

		String XCG01359 = (String)attributes.get("XCG01359");

		if (XCG01359 != null) {
			setXCG01359(XCG01359);
		}

		String XCG01360 = (String)attributes.get("XCG01360");

		if (XCG01360 != null) {
			setXCG01360(XCG01360);
		}

		String XCG01361 = (String)attributes.get("XCG01361");

		if (XCG01361 != null) {
			setXCG01361(XCG01361);
		}

		String XCG01362 = (String)attributes.get("XCG01362");

		if (XCG01362 != null) {
			setXCG01362(XCG01362);
		}

		String XCG01363 = (String)attributes.get("XCG01363");

		if (XCG01363 != null) {
			setXCG01363(XCG01363);
		}

		String XCG01364 = (String)attributes.get("XCG01364");

		if (XCG01364 != null) {
			setXCG01364(XCG01364);
		}

		String XCG01365 = (String)attributes.get("XCG01365");

		if (XCG01365 != null) {
			setXCG01365(XCG01365);
		}

		String XCG01366 = (String)attributes.get("XCG01366");

		if (XCG01366 != null) {
			setXCG01366(XCG01366);
		}

		String XCG01367 = (String)attributes.get("XCG01367");

		if (XCG01367 != null) {
			setXCG01367(XCG01367);
		}

		String XCG01368 = (String)attributes.get("XCG01368");

		if (XCG01368 != null) {
			setXCG01368(XCG01368);
		}

		String XCG01369 = (String)attributes.get("XCG01369");

		if (XCG01369 != null) {
			setXCG01369(XCG01369);
		}

		String XCG01370 = (String)attributes.get("XCG01370");

		if (XCG01370 != null) {
			setXCG01370(XCG01370);
		}

		String XCG01371 = (String)attributes.get("XCG01371");

		if (XCG01371 != null) {
			setXCG01371(XCG01371);
		}

		String XCG01372 = (String)attributes.get("XCG01372");

		if (XCG01372 != null) {
			setXCG01372(XCG01372);
		}

		String XCG01373 = (String)attributes.get("XCG01373");

		if (XCG01373 != null) {
			setXCG01373(XCG01373);
		}

		String XCG01374 = (String)attributes.get("XCG01374");

		if (XCG01374 != null) {
			setXCG01374(XCG01374);
		}

		String XCG01375 = (String)attributes.get("XCG01375");

		if (XCG01375 != null) {
			setXCG01375(XCG01375);
		}

		String XCG01376 = (String)attributes.get("XCG01376");

		if (XCG01376 != null) {
			setXCG01376(XCG01376);
		}

		String XCG01377 = (String)attributes.get("XCG01377");

		if (XCG01377 != null) {
			setXCG01377(XCG01377);
		}

		String XCG01378 = (String)attributes.get("XCG01378");

		if (XCG01378 != null) {
			setXCG01378(XCG01378);
		}

		String XCG01379 = (String)attributes.get("XCG01379");

		if (XCG01379 != null) {
			setXCG01379(XCG01379);
		}

		String XCG01381 = (String)attributes.get("XCG01381");

		if (XCG01381 != null) {
			setXCG01381(XCG01381);
		}

		String XCG01382 = (String)attributes.get("XCG01382");

		if (XCG01382 != null) {
			setXCG01382(XCG01382);
		}

		String XCG01383 = (String)attributes.get("XCG01383");

		if (XCG01383 != null) {
			setXCG01383(XCG01383);
		}

		String XCG01384 = (String)attributes.get("XCG01384");

		if (XCG01384 != null) {
			setXCG01384(XCG01384);
		}

		String XCG01385 = (String)attributes.get("XCG01385");

		if (XCG01385 != null) {
			setXCG01385(XCG01385);
		}

		String XCG01386 = (String)attributes.get("XCG01386");

		if (XCG01386 != null) {
			setXCG01386(XCG01386);
		}

		String XCG01387 = (String)attributes.get("XCG01387");

		if (XCG01387 != null) {
			setXCG01387(XCG01387);
		}

		String XCG01388 = (String)attributes.get("XCG01388");

		if (XCG01388 != null) {
			setXCG01388(XCG01388);
		}

		String XCG01389 = (String)attributes.get("XCG01389");

		if (XCG01389 != null) {
			setXCG01389(XCG01389);
		}

		String XCG01390 = (String)attributes.get("XCG01390");

		if (XCG01390 != null) {
			setXCG01390(XCG01390);
		}

		String XCG01391 = (String)attributes.get("XCG01391");

		if (XCG01391 != null) {
			setXCG01391(XCG01391);
		}

		String XCG01392 = (String)attributes.get("XCG01392");

		if (XCG01392 != null) {
			setXCG01392(XCG01392);
		}

		String XCG01393 = (String)attributes.get("XCG01393");

		if (XCG01393 != null) {
			setXCG01393(XCG01393);
		}

		String XCG01394 = (String)attributes.get("XCG01394");

		if (XCG01394 != null) {
			setXCG01394(XCG01394);
		}

		String XCG01395 = (String)attributes.get("XCG01395");

		if (XCG01395 != null) {
			setXCG01395(XCG01395);
		}

		String XCG01396 = (String)attributes.get("XCG01396");

		if (XCG01396 != null) {
			setXCG01396(XCG01396);
		}

		String XCG01397 = (String)attributes.get("XCG01397");

		if (XCG01397 != null) {
			setXCG01397(XCG01397);
		}

		String XCG01398 = (String)attributes.get("XCG01398");

		if (XCG01398 != null) {
			setXCG01398(XCG01398);
		}

		String XCG01399 = (String)attributes.get("XCG01399");

		if (XCG01399 != null) {
			setXCG01399(XCG01399);
		}

		String XCG01400 = (String)attributes.get("XCG01400");

		if (XCG01400 != null) {
			setXCG01400(XCG01400);
		}

		String XCG01402 = (String)attributes.get("XCG01402");

		if (XCG01402 != null) {
			setXCG01402(XCG01402);
		}

		String XCG01403 = (String)attributes.get("XCG01403");

		if (XCG01403 != null) {
			setXCG01403(XCG01403);
		}

		String XCG01404 = (String)attributes.get("XCG01404");

		if (XCG01404 != null) {
			setXCG01404(XCG01404);
		}

		String XCG01405 = (String)attributes.get("XCG01405");

		if (XCG01405 != null) {
			setXCG01405(XCG01405);
		}

		String XCG01406 = (String)attributes.get("XCG01406");

		if (XCG01406 != null) {
			setXCG01406(XCG01406);
		}

		String XCG01407 = (String)attributes.get("XCG01407");

		if (XCG01407 != null) {
			setXCG01407(XCG01407);
		}

		String XCG01408 = (String)attributes.get("XCG01408");

		if (XCG01408 != null) {
			setXCG01408(XCG01408);
		}

		String XCG01409 = (String)attributes.get("XCG01409");

		if (XCG01409 != null) {
			setXCG01409(XCG01409);
		}

		String XCG01410 = (String)attributes.get("XCG01410");

		if (XCG01410 != null) {
			setXCG01410(XCG01410);
		}

		String XCG01411 = (String)attributes.get("XCG01411");

		if (XCG01411 != null) {
			setXCG01411(XCG01411);
		}

		String XCG01412 = (String)attributes.get("XCG01412");

		if (XCG01412 != null) {
			setXCG01412(XCG01412);
		}

		String XCG01413 = (String)attributes.get("XCG01413");

		if (XCG01413 != null) {
			setXCG01413(XCG01413);
		}

		String XCG01414 = (String)attributes.get("XCG01414");

		if (XCG01414 != null) {
			setXCG01414(XCG01414);
		}

		String XCG01415 = (String)attributes.get("XCG01415");

		if (XCG01415 != null) {
			setXCG01415(XCG01415);
		}

		String XCG01416 = (String)attributes.get("XCG01416");

		if (XCG01416 != null) {
			setXCG01416(XCG01416);
		}

		String XCG01417 = (String)attributes.get("XCG01417");

		if (XCG01417 != null) {
			setXCG01417(XCG01417);
		}

		String XCG01418 = (String)attributes.get("XCG01418");

		if (XCG01418 != null) {
			setXCG01418(XCG01418);
		}

		String XCG01419 = (String)attributes.get("XCG01419");

		if (XCG01419 != null) {
			setXCG01419(XCG01419);
		}

		String XCG01420 = (String)attributes.get("XCG01420");

		if (XCG01420 != null) {
			setXCG01420(XCG01420);
		}

		String XCG01421 = (String)attributes.get("XCG01421");

		if (XCG01421 != null) {
			setXCG01421(XCG01421);
		}

		String XCG01422 = (String)attributes.get("XCG01422");

		if (XCG01422 != null) {
			setXCG01422(XCG01422);
		}

		String XCG01423 = (String)attributes.get("XCG01423");

		if (XCG01423 != null) {
			setXCG01423(XCG01423);
		}

		String XCG01424 = (String)attributes.get("XCG01424");

		if (XCG01424 != null) {
			setXCG01424(XCG01424);
		}

		String XCG01425 = (String)attributes.get("XCG01425");

		if (XCG01425 != null) {
			setXCG01425(XCG01425);
		}

		String XCG01426 = (String)attributes.get("XCG01426");

		if (XCG01426 != null) {
			setXCG01426(XCG01426);
		}

		String XCG01427 = (String)attributes.get("XCG01427");

		if (XCG01427 != null) {
			setXCG01427(XCG01427);
		}

		String XCG01428 = (String)attributes.get("XCG01428");

		if (XCG01428 != null) {
			setXCG01428(XCG01428);
		}

		String XCG01437 = (String)attributes.get("XCG01437");

		if (XCG01437 != null) {
			setXCG01437(XCG01437);
		}

		String XCG01429 = (String)attributes.get("XCG01429");

		if (XCG01429 != null) {
			setXCG01429(XCG01429);
		}

		String XCG01430 = (String)attributes.get("XCG01430");

		if (XCG01430 != null) {
			setXCG01430(XCG01430);
		}

		String XCG01431 = (String)attributes.get("XCG01431");

		if (XCG01431 != null) {
			setXCG01431(XCG01431);
		}

		String XCG01432 = (String)attributes.get("XCG01432");

		if (XCG01432 != null) {
			setXCG01432(XCG01432);
		}

		String XCG01433 = (String)attributes.get("XCG01433");

		if (XCG01433 != null) {
			setXCG01433(XCG01433);
		}

		String XCG01434 = (String)attributes.get("XCG01434");

		if (XCG01434 != null) {
			setXCG01434(XCG01434);
		}

		String XCG01435 = (String)attributes.get("XCG01435");

		if (XCG01435 != null) {
			setXCG01435(XCG01435);
		}

		String XCG01436 = (String)attributes.get("XCG01436");

		if (XCG01436 != null) {
			setXCG01436(XCG01436);
		}

		String XCG01439 = (String)attributes.get("XCG01439");

		if (XCG01439 != null) {
			setXCG01439(XCG01439);
		}

		String XCG01440 = (String)attributes.get("XCG01440");

		if (XCG01440 != null) {
			setXCG01440(XCG01440);
		}

		String XCG01441 = (String)attributes.get("XCG01441");

		if (XCG01441 != null) {
			setXCG01441(XCG01441);
		}

		String XCG01442 = (String)attributes.get("XCG01442");

		if (XCG01442 != null) {
			setXCG01442(XCG01442);
		}

		String XCG01443 = (String)attributes.get("XCG01443");

		if (XCG01443 != null) {
			setXCG01443(XCG01443);
		}

		String XCG01445 = (String)attributes.get("XCG01445");

		if (XCG01445 != null) {
			setXCG01445(XCG01445);
		}

		String XCG01446 = (String)attributes.get("XCG01446");

		if (XCG01446 != null) {
			setXCG01446(XCG01446);
		}

		String XCG01447 = (String)attributes.get("XCG01447");

		if (XCG01447 != null) {
			setXCG01447(XCG01447);
		}

		String XCG01448 = (String)attributes.get("XCG01448");

		if (XCG01448 != null) {
			setXCG01448(XCG01448);
		}

		String XCG01449 = (String)attributes.get("XCG01449");

		if (XCG01449 != null) {
			setXCG01449(XCG01449);
		}

		String XCG01450 = (String)attributes.get("XCG01450");

		if (XCG01450 != null) {
			setXCG01450(XCG01450);
		}

		String XCG01451 = (String)attributes.get("XCG01451");

		if (XCG01451 != null) {
			setXCG01451(XCG01451);
		}

		String XCG01452 = (String)attributes.get("XCG01452");

		if (XCG01452 != null) {
			setXCG01452(XCG01452);
		}

		String XCG01453 = (String)attributes.get("XCG01453");

		if (XCG01453 != null) {
			setXCG01453(XCG01453);
		}

		String XCG01454 = (String)attributes.get("XCG01454");

		if (XCG01454 != null) {
			setXCG01454(XCG01454);
		}

		String XCG01455 = (String)attributes.get("XCG01455");

		if (XCG01455 != null) {
			setXCG01455(XCG01455);
		}

		String XCG01456 = (String)attributes.get("XCG01456");

		if (XCG01456 != null) {
			setXCG01456(XCG01456);
		}

		String XCG01457 = (String)attributes.get("XCG01457");

		if (XCG01457 != null) {
			setXCG01457(XCG01457);
		}

		String XCG01458 = (String)attributes.get("XCG01458");

		if (XCG01458 != null) {
			setXCG01458(XCG01458);
		}

		String XCG01459 = (String)attributes.get("XCG01459");

		if (XCG01459 != null) {
			setXCG01459(XCG01459);
		}

		String XCG01460 = (String)attributes.get("XCG01460");

		if (XCG01460 != null) {
			setXCG01460(XCG01460);
		}

		String XCG01461 = (String)attributes.get("XCG01461");

		if (XCG01461 != null) {
			setXCG01461(XCG01461);
		}

		String XCG01462 = (String)attributes.get("XCG01462");

		if (XCG01462 != null) {
			setXCG01462(XCG01462);
		}

		String XCG01463 = (String)attributes.get("XCG01463");

		if (XCG01463 != null) {
			setXCG01463(XCG01463);
		}

		String XCG01464 = (String)attributes.get("XCG01464");

		if (XCG01464 != null) {
			setXCG01464(XCG01464);
		}

		String XCG01465 = (String)attributes.get("XCG01465");

		if (XCG01465 != null) {
			setXCG01465(XCG01465);
		}

		String XCG01466 = (String)attributes.get("XCG01466");

		if (XCG01466 != null) {
			setXCG01466(XCG01466);
		}

		String XCG01467 = (String)attributes.get("XCG01467");

		if (XCG01467 != null) {
			setXCG01467(XCG01467);
		}

		String XCG01468 = (String)attributes.get("XCG01468");

		if (XCG01468 != null) {
			setXCG01468(XCG01468);
		}

		String XCG01469 = (String)attributes.get("XCG01469");

		if (XCG01469 != null) {
			setXCG01469(XCG01469);
		}

		String XCG01470 = (String)attributes.get("XCG01470");

		if (XCG01470 != null) {
			setXCG01470(XCG01470);
		}

		String XCG01471 = (String)attributes.get("XCG01471");

		if (XCG01471 != null) {
			setXCG01471(XCG01471);
		}

		String XCG01472 = (String)attributes.get("XCG01472");

		if (XCG01472 != null) {
			setXCG01472(XCG01472);
		}

		String XCG01473 = (String)attributes.get("XCG01473");

		if (XCG01473 != null) {
			setXCG01473(XCG01473);
		}

		String XCG01474 = (String)attributes.get("XCG01474");

		if (XCG01474 != null) {
			setXCG01474(XCG01474);
		}

		String XCG01475 = (String)attributes.get("XCG01475");

		if (XCG01475 != null) {
			setXCG01475(XCG01475);
		}

		String XCG01476 = (String)attributes.get("XCG01476");

		if (XCG01476 != null) {
			setXCG01476(XCG01476);
		}

		String XCG01477 = (String)attributes.get("XCG01477");

		if (XCG01477 != null) {
			setXCG01477(XCG01477);
		}

		String XCG01478 = (String)attributes.get("XCG01478");

		if (XCG01478 != null) {
			setXCG01478(XCG01478);
		}

		String XCG01479 = (String)attributes.get("XCG01479");

		if (XCG01479 != null) {
			setXCG01479(XCG01479);
		}

		String XCG01480 = (String)attributes.get("XCG01480");

		if (XCG01480 != null) {
			setXCG01480(XCG01480);
		}

		String XCG01481 = (String)attributes.get("XCG01481");

		if (XCG01481 != null) {
			setXCG01481(XCG01481);
		}

		String XCG01482 = (String)attributes.get("XCG01482");

		if (XCG01482 != null) {
			setXCG01482(XCG01482);
		}

		String XCG01483 = (String)attributes.get("XCG01483");

		if (XCG01483 != null) {
			setXCG01483(XCG01483);
		}

		String XCG01484 = (String)attributes.get("XCG01484");

		if (XCG01484 != null) {
			setXCG01484(XCG01484);
		}

		String XCG01485 = (String)attributes.get("XCG01485");

		if (XCG01485 != null) {
			setXCG01485(XCG01485);
		}

		String XCG01486 = (String)attributes.get("XCG01486");

		if (XCG01486 != null) {
			setXCG01486(XCG01486);
		}

		String XCG01487 = (String)attributes.get("XCG01487");

		if (XCG01487 != null) {
			setXCG01487(XCG01487);
		}

		String XCG01488 = (String)attributes.get("XCG01488");

		if (XCG01488 != null) {
			setXCG01488(XCG01488);
		}

		String XCG01489 = (String)attributes.get("XCG01489");

		if (XCG01489 != null) {
			setXCG01489(XCG01489);
		}

		String XCG01490 = (String)attributes.get("XCG01490");

		if (XCG01490 != null) {
			setXCG01490(XCG01490);
		}

		String XCG01491 = (String)attributes.get("XCG01491");

		if (XCG01491 != null) {
			setXCG01491(XCG01491);
		}

		String XCG01492 = (String)attributes.get("XCG01492");

		if (XCG01492 != null) {
			setXCG01492(XCG01492);
		}

		String XCG01493 = (String)attributes.get("XCG01493");

		if (XCG01493 != null) {
			setXCG01493(XCG01493);
		}

		String XCG01494 = (String)attributes.get("XCG01494");

		if (XCG01494 != null) {
			setXCG01494(XCG01494);
		}

		String XCG01496 = (String)attributes.get("XCG01496");

		if (XCG01496 != null) {
			setXCG01496(XCG01496);
		}

		String XCG01497 = (String)attributes.get("XCG01497");

		if (XCG01497 != null) {
			setXCG01497(XCG01497);
		}

		String XCG01498 = (String)attributes.get("XCG01498");

		if (XCG01498 != null) {
			setXCG01498(XCG01498);
		}

		String XCG01499 = (String)attributes.get("XCG01499");

		if (XCG01499 != null) {
			setXCG01499(XCG01499);
		}

		String XCG01500 = (String)attributes.get("XCG01500");

		if (XCG01500 != null) {
			setXCG01500(XCG01500);
		}

		String XCG01501 = (String)attributes.get("XCG01501");

		if (XCG01501 != null) {
			setXCG01501(XCG01501);
		}

		String XCG01502 = (String)attributes.get("XCG01502");

		if (XCG01502 != null) {
			setXCG01502(XCG01502);
		}

		String XCG01503 = (String)attributes.get("XCG01503");

		if (XCG01503 != null) {
			setXCG01503(XCG01503);
		}

		String XCG01504 = (String)attributes.get("XCG01504");

		if (XCG01504 != null) {
			setXCG01504(XCG01504);
		}

		String XCG01505 = (String)attributes.get("XCG01505");

		if (XCG01505 != null) {
			setXCG01505(XCG01505);
		}

		String XCG01506 = (String)attributes.get("XCG01506");

		if (XCG01506 != null) {
			setXCG01506(XCG01506);
		}

		String XCG01507 = (String)attributes.get("XCG01507");

		if (XCG01507 != null) {
			setXCG01507(XCG01507);
		}

		String XCG01508 = (String)attributes.get("XCG01508");

		if (XCG01508 != null) {
			setXCG01508(XCG01508);
		}

		String XCG01509 = (String)attributes.get("XCG01509");

		if (XCG01509 != null) {
			setXCG01509(XCG01509);
		}

		String XCG01510 = (String)attributes.get("XCG01510");

		if (XCG01510 != null) {
			setXCG01510(XCG01510);
		}

		String XCG01512 = (String)attributes.get("XCG01512");

		if (XCG01512 != null) {
			setXCG01512(XCG01512);
		}

		String XCG01513 = (String)attributes.get("XCG01513");

		if (XCG01513 != null) {
			setXCG01513(XCG01513);
		}

		String XCG01514 = (String)attributes.get("XCG01514");

		if (XCG01514 != null) {
			setXCG01514(XCG01514);
		}

		String XCG01515 = (String)attributes.get("XCG01515");

		if (XCG01515 != null) {
			setXCG01515(XCG01515);
		}

		String XCG01516 = (String)attributes.get("XCG01516");

		if (XCG01516 != null) {
			setXCG01516(XCG01516);
		}

		String XCG01517 = (String)attributes.get("XCG01517");

		if (XCG01517 != null) {
			setXCG01517(XCG01517);
		}

		String XCG01518 = (String)attributes.get("XCG01518");

		if (XCG01518 != null) {
			setXCG01518(XCG01518);
		}

		String XCG01519 = (String)attributes.get("XCG01519");

		if (XCG01519 != null) {
			setXCG01519(XCG01519);
		}

		String XCG01520 = (String)attributes.get("XCG01520");

		if (XCG01520 != null) {
			setXCG01520(XCG01520);
		}

		String XCG01521 = (String)attributes.get("XCG01521");

		if (XCG01521 != null) {
			setXCG01521(XCG01521);
		}

		String XCG01522 = (String)attributes.get("XCG01522");

		if (XCG01522 != null) {
			setXCG01522(XCG01522);
		}

		String XCG01523 = (String)attributes.get("XCG01523");

		if (XCG01523 != null) {
			setXCG01523(XCG01523);
		}

		String XCG01524 = (String)attributes.get("XCG01524");

		if (XCG01524 != null) {
			setXCG01524(XCG01524);
		}

		String XCG01525 = (String)attributes.get("XCG01525");

		if (XCG01525 != null) {
			setXCG01525(XCG01525);
		}

		String XCG01526 = (String)attributes.get("XCG01526");

		if (XCG01526 != null) {
			setXCG01526(XCG01526);
		}

		String XCG01527 = (String)attributes.get("XCG01527");

		if (XCG01527 != null) {
			setXCG01527(XCG01527);
		}

		String XCG01528 = (String)attributes.get("XCG01528");

		if (XCG01528 != null) {
			setXCG01528(XCG01528);
		}

		String XCG01529 = (String)attributes.get("XCG01529");

		if (XCG01529 != null) {
			setXCG01529(XCG01529);
		}

		String XCG01530 = (String)attributes.get("XCG01530");

		if (XCG01530 != null) {
			setXCG01530(XCG01530);
		}

		String XCG01531 = (String)attributes.get("XCG01531");

		if (XCG01531 != null) {
			setXCG01531(XCG01531);
		}

		String XCG01904 = (String)attributes.get("XCG01904");

		if (XCG01904 != null) {
			setXCG01904(XCG01904);
		}

		String XCG01533 = (String)attributes.get("XCG01533");

		if (XCG01533 != null) {
			setXCG01533(XCG01533);
		}

		String XCG01905 = (String)attributes.get("XCG01905");

		if (XCG01905 != null) {
			setXCG01905(XCG01905);
		}

		String XCG01534 = (String)attributes.get("XCG01534");

		if (XCG01534 != null) {
			setXCG01534(XCG01534);
		}

		String XCG01906 = (String)attributes.get("XCG01906");

		if (XCG01906 != null) {
			setXCG01906(XCG01906);
		}

		String XCG01535 = (String)attributes.get("XCG01535");

		if (XCG01535 != null) {
			setXCG01535(XCG01535);
		}

		String XCG01907 = (String)attributes.get("XCG01907");

		if (XCG01907 != null) {
			setXCG01907(XCG01907);
		}

		String XCG01536 = (String)attributes.get("XCG01536");

		if (XCG01536 != null) {
			setXCG01536(XCG01536);
		}

		String XCG01908 = (String)attributes.get("XCG01908");

		if (XCG01908 != null) {
			setXCG01908(XCG01908);
		}

		String XCG01537 = (String)attributes.get("XCG01537");

		if (XCG01537 != null) {
			setXCG01537(XCG01537);
		}

		String XCG01909 = (String)attributes.get("XCG01909");

		if (XCG01909 != null) {
			setXCG01909(XCG01909);
		}

		String XCG01538 = (String)attributes.get("XCG01538");

		if (XCG01538 != null) {
			setXCG01538(XCG01538);
		}

		String XCG01910 = (String)attributes.get("XCG01910");

		if (XCG01910 != null) {
			setXCG01910(XCG01910);
		}

		String XCG01539 = (String)attributes.get("XCG01539");

		if (XCG01539 != null) {
			setXCG01539(XCG01539);
		}

		String XCG11535 = (String)attributes.get("XCG11535");

		if (XCG11535 != null) {
			setXCG11535(XCG11535);
		}

		String XCG01541 = (String)attributes.get("XCG01541");

		if (XCG01541 != null) {
			setXCG01541(XCG01541);
		}

		String XCG01542 = (String)attributes.get("XCG01542");

		if (XCG01542 != null) {
			setXCG01542(XCG01542);
		}

		String XCG01911 = (String)attributes.get("XCG01911");

		if (XCG01911 != null) {
			setXCG01911(XCG01911);
		}

		String XCG01543 = (String)attributes.get("XCG01543");

		if (XCG01543 != null) {
			setXCG01543(XCG01543);
		}

		String XCG01912 = (String)attributes.get("XCG01912");

		if (XCG01912 != null) {
			setXCG01912(XCG01912);
		}

		String XCG01544 = (String)attributes.get("XCG01544");

		if (XCG01544 != null) {
			setXCG01544(XCG01544);
		}

		String XCG01545 = (String)attributes.get("XCG01545");

		if (XCG01545 != null) {
			setXCG01545(XCG01545);
		}

		String XCG01546 = (String)attributes.get("XCG01546");

		if (XCG01546 != null) {
			setXCG01546(XCG01546);
		}

		String XCG01547 = (String)attributes.get("XCG01547");

		if (XCG01547 != null) {
			setXCG01547(XCG01547);
		}

		String XCG01548 = (String)attributes.get("XCG01548");

		if (XCG01548 != null) {
			setXCG01548(XCG01548);
		}

		String XCG01913 = (String)attributes.get("XCG01913");

		if (XCG01913 != null) {
			setXCG01913(XCG01913);
		}

		String XCG01549 = (String)attributes.get("XCG01549");

		if (XCG01549 != null) {
			setXCG01549(XCG01549);
		}

		String XCG01914 = (String)attributes.get("XCG01914");

		if (XCG01914 != null) {
			setXCG01914(XCG01914);
		}

		String XCG01550 = (String)attributes.get("XCG01550");

		if (XCG01550 != null) {
			setXCG01550(XCG01550);
		}

		String XCG01551 = (String)attributes.get("XCG01551");

		if (XCG01551 != null) {
			setXCG01551(XCG01551);
		}

		String XCG01552 = (String)attributes.get("XCG01552");

		if (XCG01552 != null) {
			setXCG01552(XCG01552);
		}

		String XCG01553 = (String)attributes.get("XCG01553");

		if (XCG01553 != null) {
			setXCG01553(XCG01553);
		}

		String XCG01554 = (String)attributes.get("XCG01554");

		if (XCG01554 != null) {
			setXCG01554(XCG01554);
		}

		String XCG01915 = (String)attributes.get("XCG01915");

		if (XCG01915 != null) {
			setXCG01915(XCG01915);
		}

		String XCG01555 = (String)attributes.get("XCG01555");

		if (XCG01555 != null) {
			setXCG01555(XCG01555);
		}

		String XCG01556 = (String)attributes.get("XCG01556");

		if (XCG01556 != null) {
			setXCG01556(XCG01556);
		}

		String XCG01557 = (String)attributes.get("XCG01557");

		if (XCG01557 != null) {
			setXCG01557(XCG01557);
		}

		String XCG01558 = (String)attributes.get("XCG01558");

		if (XCG01558 != null) {
			setXCG01558(XCG01558);
		}

		String XCG01559 = (String)attributes.get("XCG01559");

		if (XCG01559 != null) {
			setXCG01559(XCG01559);
		}

		String XCG01560 = (String)attributes.get("XCG01560");

		if (XCG01560 != null) {
			setXCG01560(XCG01560);
		}

		String XCG01561 = (String)attributes.get("XCG01561");

		if (XCG01561 != null) {
			setXCG01561(XCG01561);
		}

		String XCG01916 = (String)attributes.get("XCG01916");

		if (XCG01916 != null) {
			setXCG01916(XCG01916);
		}

		String XCG01562 = (String)attributes.get("XCG01562");

		if (XCG01562 != null) {
			setXCG01562(XCG01562);
		}

		String XCG01917 = (String)attributes.get("XCG01917");

		if (XCG01917 != null) {
			setXCG01917(XCG01917);
		}

		String XCG01563 = (String)attributes.get("XCG01563");

		if (XCG01563 != null) {
			setXCG01563(XCG01563);
		}

		String XCG01918 = (String)attributes.get("XCG01918");

		if (XCG01918 != null) {
			setXCG01918(XCG01918);
		}

		String XCG01564 = (String)attributes.get("XCG01564");

		if (XCG01564 != null) {
			setXCG01564(XCG01564);
		}

		String XCG01565 = (String)attributes.get("XCG01565");

		if (XCG01565 != null) {
			setXCG01565(XCG01565);
		}

		String XCG01566 = (String)attributes.get("XCG01566");

		if (XCG01566 != null) {
			setXCG01566(XCG01566);
		}

		String XCG01567 = (String)attributes.get("XCG01567");

		if (XCG01567 != null) {
			setXCG01567(XCG01567);
		}

		String XCG01568 = (String)attributes.get("XCG01568");

		if (XCG01568 != null) {
			setXCG01568(XCG01568);
		}

		String XCG01919 = (String)attributes.get("XCG01919");

		if (XCG01919 != null) {
			setXCG01919(XCG01919);
		}

		String XCG01569 = (String)attributes.get("XCG01569");

		if (XCG01569 != null) {
			setXCG01569(XCG01569);
		}

		String XCG01570 = (String)attributes.get("XCG01570");

		if (XCG01570 != null) {
			setXCG01570(XCG01570);
		}

		String XCG01571 = (String)attributes.get("XCG01571");

		if (XCG01571 != null) {
			setXCG01571(XCG01571);
		}

		String XCG01572 = (String)attributes.get("XCG01572");

		if (XCG01572 != null) {
			setXCG01572(XCG01572);
		}

		String XCG01920 = (String)attributes.get("XCG01920");

		if (XCG01920 != null) {
			setXCG01920(XCG01920);
		}

		String XCG01573 = (String)attributes.get("XCG01573");

		if (XCG01573 != null) {
			setXCG01573(XCG01573);
		}

		String XCG01921 = (String)attributes.get("XCG01921");

		if (XCG01921 != null) {
			setXCG01921(XCG01921);
		}

		String XCG01574 = (String)attributes.get("XCG01574");

		if (XCG01574 != null) {
			setXCG01574(XCG01574);
		}

		String XCG01922 = (String)attributes.get("XCG01922");

		if (XCG01922 != null) {
			setXCG01922(XCG01922);
		}

		String XCG01575 = (String)attributes.get("XCG01575");

		if (XCG01575 != null) {
			setXCG01575(XCG01575);
		}

		String XCG01576 = (String)attributes.get("XCG01576");

		if (XCG01576 != null) {
			setXCG01576(XCG01576);
		}

		String XCG01577 = (String)attributes.get("XCG01577");

		if (XCG01577 != null) {
			setXCG01577(XCG01577);
		}

		String XCG01578 = (String)attributes.get("XCG01578");

		if (XCG01578 != null) {
			setXCG01578(XCG01578);
		}

		String XCG01579 = (String)attributes.get("XCG01579");

		if (XCG01579 != null) {
			setXCG01579(XCG01579);
		}

		String XCG01580 = (String)attributes.get("XCG01580");

		if (XCG01580 != null) {
			setXCG01580(XCG01580);
		}

		String XCG01581 = (String)attributes.get("XCG01581");

		if (XCG01581 != null) {
			setXCG01581(XCG01581);
		}

		String XCG01582 = (String)attributes.get("XCG01582");

		if (XCG01582 != null) {
			setXCG01582(XCG01582);
		}

		String XCG01583 = (String)attributes.get("XCG01583");

		if (XCG01583 != null) {
			setXCG01583(XCG01583);
		}

		String XCG01584 = (String)attributes.get("XCG01584");

		if (XCG01584 != null) {
			setXCG01584(XCG01584);
		}

		String XCG01585 = (String)attributes.get("XCG01585");

		if (XCG01585 != null) {
			setXCG01585(XCG01585);
		}

		String XCG01586 = (String)attributes.get("XCG01586");

		if (XCG01586 != null) {
			setXCG01586(XCG01586);
		}

		String XCG01587 = (String)attributes.get("XCG01587");

		if (XCG01587 != null) {
			setXCG01587(XCG01587);
		}

		String XCG01588 = (String)attributes.get("XCG01588");

		if (XCG01588 != null) {
			setXCG01588(XCG01588);
		}

		String XCG01589 = (String)attributes.get("XCG01589");

		if (XCG01589 != null) {
			setXCG01589(XCG01589);
		}

		String XCG01590 = (String)attributes.get("XCG01590");

		if (XCG01590 != null) {
			setXCG01590(XCG01590);
		}

		String XCG01591 = (String)attributes.get("XCG01591");

		if (XCG01591 != null) {
			setXCG01591(XCG01591);
		}

		String XCG01592 = (String)attributes.get("XCG01592");

		if (XCG01592 != null) {
			setXCG01592(XCG01592);
		}

		String XCG01593 = (String)attributes.get("XCG01593");

		if (XCG01593 != null) {
			setXCG01593(XCG01593);
		}

		String XCG01594 = (String)attributes.get("XCG01594");

		if (XCG01594 != null) {
			setXCG01594(XCG01594);
		}

		String XCG01595 = (String)attributes.get("XCG01595");

		if (XCG01595 != null) {
			setXCG01595(XCG01595);
		}

		String XCG01596 = (String)attributes.get("XCG01596");

		if (XCG01596 != null) {
			setXCG01596(XCG01596);
		}

		String XCG01597 = (String)attributes.get("XCG01597");

		if (XCG01597 != null) {
			setXCG01597(XCG01597);
		}

		String XCG01598 = (String)attributes.get("XCG01598");

		if (XCG01598 != null) {
			setXCG01598(XCG01598);
		}

		String XCG01599 = (String)attributes.get("XCG01599");

		if (XCG01599 != null) {
			setXCG01599(XCG01599);
		}

		String XCG01600 = (String)attributes.get("XCG01600");

		if (XCG01600 != null) {
			setXCG01600(XCG01600);
		}

		String XCG01601 = (String)attributes.get("XCG01601");

		if (XCG01601 != null) {
			setXCG01601(XCG01601);
		}

		String XCG01602 = (String)attributes.get("XCG01602");

		if (XCG01602 != null) {
			setXCG01602(XCG01602);
		}

		String XCG01603 = (String)attributes.get("XCG01603");

		if (XCG01603 != null) {
			setXCG01603(XCG01603);
		}

		String XCG01923 = (String)attributes.get("XCG01923");

		if (XCG01923 != null) {
			setXCG01923(XCG01923);
		}

		String XCG01604 = (String)attributes.get("XCG01604");

		if (XCG01604 != null) {
			setXCG01604(XCG01604);
		}

		String XCG01924 = (String)attributes.get("XCG01924");

		if (XCG01924 != null) {
			setXCG01924(XCG01924);
		}

		String XCG01605 = (String)attributes.get("XCG01605");

		if (XCG01605 != null) {
			setXCG01605(XCG01605);
		}

		String XCG01606 = (String)attributes.get("XCG01606");

		if (XCG01606 != null) {
			setXCG01606(XCG01606);
		}

		String XCG01607 = (String)attributes.get("XCG01607");

		if (XCG01607 != null) {
			setXCG01607(XCG01607);
		}

		String XCG01608 = (String)attributes.get("XCG01608");

		if (XCG01608 != null) {
			setXCG01608(XCG01608);
		}

		String XCG01609 = (String)attributes.get("XCG01609");

		if (XCG01609 != null) {
			setXCG01609(XCG01609);
		}

		String XCG01925 = (String)attributes.get("XCG01925");

		if (XCG01925 != null) {
			setXCG01925(XCG01925);
		}

		String XCG01610 = (String)attributes.get("XCG01610");

		if (XCG01610 != null) {
			setXCG01610(XCG01610);
		}

		String XCG01926 = (String)attributes.get("XCG01926");

		if (XCG01926 != null) {
			setXCG01926(XCG01926);
		}

		String XCG01611 = (String)attributes.get("XCG01611");

		if (XCG01611 != null) {
			setXCG01611(XCG01611);
		}

		String XCG01612 = (String)attributes.get("XCG01612");

		if (XCG01612 != null) {
			setXCG01612(XCG01612);
		}

		String XCG01928 = (String)attributes.get("XCG01928");

		if (XCG01928 != null) {
			setXCG01928(XCG01928);
		}

		String XCG01613 = (String)attributes.get("XCG01613");

		if (XCG01613 != null) {
			setXCG01613(XCG01613);
		}

		String XCG01929 = (String)attributes.get("XCG01929");

		if (XCG01929 != null) {
			setXCG01929(XCG01929);
		}

		String XCG01614 = (String)attributes.get("XCG01614");

		if (XCG01614 != null) {
			setXCG01614(XCG01614);
		}

		String XCG01930 = (String)attributes.get("XCG01930");

		if (XCG01930 != null) {
			setXCG01930(XCG01930);
		}

		String XCG01615 = (String)attributes.get("XCG01615");

		if (XCG01615 != null) {
			setXCG01615(XCG01615);
		}

		String XCG01931 = (String)attributes.get("XCG01931");

		if (XCG01931 != null) {
			setXCG01931(XCG01931);
		}

		String XCG01616 = (String)attributes.get("XCG01616");

		if (XCG01616 != null) {
			setXCG01616(XCG01616);
		}

		String XCG01932 = (String)attributes.get("XCG01932");

		if (XCG01932 != null) {
			setXCG01932(XCG01932);
		}

		String XCG01617 = (String)attributes.get("XCG01617");

		if (XCG01617 != null) {
			setXCG01617(XCG01617);
		}

		String XCG01933 = (String)attributes.get("XCG01933");

		if (XCG01933 != null) {
			setXCG01933(XCG01933);
		}

		String XCG01618 = (String)attributes.get("XCG01618");

		if (XCG01618 != null) {
			setXCG01618(XCG01618);
		}

		String XCG01934 = (String)attributes.get("XCG01934");

		if (XCG01934 != null) {
			setXCG01934(XCG01934);
		}

		String XCG01619 = (String)attributes.get("XCG01619");

		if (XCG01619 != null) {
			setXCG01619(XCG01619);
		}

		String XCG01935 = (String)attributes.get("XCG01935");

		if (XCG01935 != null) {
			setXCG01935(XCG01935);
		}

		String XCG01620 = (String)attributes.get("XCG01620");

		if (XCG01620 != null) {
			setXCG01620(XCG01620);
		}

		String XCG01936 = (String)attributes.get("XCG01936");

		if (XCG01936 != null) {
			setXCG01936(XCG01936);
		}

		String XCG01621 = (String)attributes.get("XCG01621");

		if (XCG01621 != null) {
			setXCG01621(XCG01621);
		}

		String XCG01937 = (String)attributes.get("XCG01937");

		if (XCG01937 != null) {
			setXCG01937(XCG01937);
		}

		String XCG01622 = (String)attributes.get("XCG01622");

		if (XCG01622 != null) {
			setXCG01622(XCG01622);
		}

		String XCG01938 = (String)attributes.get("XCG01938");

		if (XCG01938 != null) {
			setXCG01938(XCG01938);
		}

		String XCG01623 = (String)attributes.get("XCG01623");

		if (XCG01623 != null) {
			setXCG01623(XCG01623);
		}

		String XCG01939 = (String)attributes.get("XCG01939");

		if (XCG01939 != null) {
			setXCG01939(XCG01939);
		}

		String XCG01624 = (String)attributes.get("XCG01624");

		if (XCG01624 != null) {
			setXCG01624(XCG01624);
		}

		String XCG01940 = (String)attributes.get("XCG01940");

		if (XCG01940 != null) {
			setXCG01940(XCG01940);
		}

		String XCG01625 = (String)attributes.get("XCG01625");

		if (XCG01625 != null) {
			setXCG01625(XCG01625);
		}

		String XCG01941 = (String)attributes.get("XCG01941");

		if (XCG01941 != null) {
			setXCG01941(XCG01941);
		}

		String XCG01626 = (String)attributes.get("XCG01626");

		if (XCG01626 != null) {
			setXCG01626(XCG01626);
		}

		String XCG01942 = (String)attributes.get("XCG01942");

		if (XCG01942 != null) {
			setXCG01942(XCG01942);
		}

		String XCG01627 = (String)attributes.get("XCG01627");

		if (XCG01627 != null) {
			setXCG01627(XCG01627);
		}

		String XCG01943 = (String)attributes.get("XCG01943");

		if (XCG01943 != null) {
			setXCG01943(XCG01943);
		}

		String XCG01628 = (String)attributes.get("XCG01628");

		if (XCG01628 != null) {
			setXCG01628(XCG01628);
		}

		String XCG01944 = (String)attributes.get("XCG01944");

		if (XCG01944 != null) {
			setXCG01944(XCG01944);
		}

		String XCG01630 = (String)attributes.get("XCG01630");

		if (XCG01630 != null) {
			setXCG01630(XCG01630);
		}

		String XCG01631 = (String)attributes.get("XCG01631");

		if (XCG01631 != null) {
			setXCG01631(XCG01631);
		}

		String XCG01632 = (String)attributes.get("XCG01632");

		if (XCG01632 != null) {
			setXCG01632(XCG01632);
		}

		String XCG01633 = (String)attributes.get("XCG01633");

		if (XCG01633 != null) {
			setXCG01633(XCG01633);
		}

		String XCG01634 = (String)attributes.get("XCG01634");

		if (XCG01634 != null) {
			setXCG01634(XCG01634);
		}

		String XCG01635 = (String)attributes.get("XCG01635");

		if (XCG01635 != null) {
			setXCG01635(XCG01635);
		}

		String XCG01636 = (String)attributes.get("XCG01636");

		if (XCG01636 != null) {
			setXCG01636(XCG01636);
		}

		String XCG01637 = (String)attributes.get("XCG01637");

		if (XCG01637 != null) {
			setXCG01637(XCG01637);
		}

		String XCG01638 = (String)attributes.get("XCG01638");

		if (XCG01638 != null) {
			setXCG01638(XCG01638);
		}

		String XCG01639 = (String)attributes.get("XCG01639");

		if (XCG01639 != null) {
			setXCG01639(XCG01639);
		}

		String XCG01640 = (String)attributes.get("XCG01640");

		if (XCG01640 != null) {
			setXCG01640(XCG01640);
		}

		String XCG01641 = (String)attributes.get("XCG01641");

		if (XCG01641 != null) {
			setXCG01641(XCG01641);
		}

		String XCG01642 = (String)attributes.get("XCG01642");

		if (XCG01642 != null) {
			setXCG01642(XCG01642);
		}

		String XCG01643 = (String)attributes.get("XCG01643");

		if (XCG01643 != null) {
			setXCG01643(XCG01643);
		}

		String XCG01644 = (String)attributes.get("XCG01644");

		if (XCG01644 != null) {
			setXCG01644(XCG01644);
		}

		String XCG01645 = (String)attributes.get("XCG01645");

		if (XCG01645 != null) {
			setXCG01645(XCG01645);
		}

		String XCG01646 = (String)attributes.get("XCG01646");

		if (XCG01646 != null) {
			setXCG01646(XCG01646);
		}

		String XCG01647 = (String)attributes.get("XCG01647");

		if (XCG01647 != null) {
			setXCG01647(XCG01647);
		}

		String XCG01648 = (String)attributes.get("XCG01648");

		if (XCG01648 != null) {
			setXCG01648(XCG01648);
		}

		String XCG01649 = (String)attributes.get("XCG01649");

		if (XCG01649 != null) {
			setXCG01649(XCG01649);
		}

		String XCG01650 = (String)attributes.get("XCG01650");

		if (XCG01650 != null) {
			setXCG01650(XCG01650);
		}

		String XCG01651 = (String)attributes.get("XCG01651");

		if (XCG01651 != null) {
			setXCG01651(XCG01651);
		}

		String XCG01652 = (String)attributes.get("XCG01652");

		if (XCG01652 != null) {
			setXCG01652(XCG01652);
		}

		String XCG01653 = (String)attributes.get("XCG01653");

		if (XCG01653 != null) {
			setXCG01653(XCG01653);
		}

		String XCG01654 = (String)attributes.get("XCG01654");

		if (XCG01654 != null) {
			setXCG01654(XCG01654);
		}

		String XCG01655 = (String)attributes.get("XCG01655");

		if (XCG01655 != null) {
			setXCG01655(XCG01655);
		}

		String XCG01656 = (String)attributes.get("XCG01656");

		if (XCG01656 != null) {
			setXCG01656(XCG01656);
		}

		String XCG01657 = (String)attributes.get("XCG01657");

		if (XCG01657 != null) {
			setXCG01657(XCG01657);
		}

		String XCG01658 = (String)attributes.get("XCG01658");

		if (XCG01658 != null) {
			setXCG01658(XCG01658);
		}

		String XCG01659 = (String)attributes.get("XCG01659");

		if (XCG01659 != null) {
			setXCG01659(XCG01659);
		}

		String XCG01660 = (String)attributes.get("XCG01660");

		if (XCG01660 != null) {
			setXCG01660(XCG01660);
		}

		String XCG01661 = (String)attributes.get("XCG01661");

		if (XCG01661 != null) {
			setXCG01661(XCG01661);
		}

		String XCG01662 = (String)attributes.get("XCG01662");

		if (XCG01662 != null) {
			setXCG01662(XCG01662);
		}

		String XCG01663 = (String)attributes.get("XCG01663");

		if (XCG01663 != null) {
			setXCG01663(XCG01663);
		}

		String XCG01664 = (String)attributes.get("XCG01664");

		if (XCG01664 != null) {
			setXCG01664(XCG01664);
		}

		String XCG01665 = (String)attributes.get("XCG01665");

		if (XCG01665 != null) {
			setXCG01665(XCG01665);
		}

		String XCG01666 = (String)attributes.get("XCG01666");

		if (XCG01666 != null) {
			setXCG01666(XCG01666);
		}

		String XCG01667 = (String)attributes.get("XCG01667");

		if (XCG01667 != null) {
			setXCG01667(XCG01667);
		}

		String XCG01668 = (String)attributes.get("XCG01668");

		if (XCG01668 != null) {
			setXCG01668(XCG01668);
		}

		String XCG01669 = (String)attributes.get("XCG01669");

		if (XCG01669 != null) {
			setXCG01669(XCG01669);
		}

		String XCG01670 = (String)attributes.get("XCG01670");

		if (XCG01670 != null) {
			setXCG01670(XCG01670);
		}

		String XCG01671 = (String)attributes.get("XCG01671");

		if (XCG01671 != null) {
			setXCG01671(XCG01671);
		}

		String XCG01672 = (String)attributes.get("XCG01672");

		if (XCG01672 != null) {
			setXCG01672(XCG01672);
		}

		String XCG01673 = (String)attributes.get("XCG01673");

		if (XCG01673 != null) {
			setXCG01673(XCG01673);
		}

		String XCG01674 = (String)attributes.get("XCG01674");

		if (XCG01674 != null) {
			setXCG01674(XCG01674);
		}

		String XCG01675 = (String)attributes.get("XCG01675");

		if (XCG01675 != null) {
			setXCG01675(XCG01675);
		}

		String XCG01676 = (String)attributes.get("XCG01676");

		if (XCG01676 != null) {
			setXCG01676(XCG01676);
		}

		String XCG01677 = (String)attributes.get("XCG01677");

		if (XCG01677 != null) {
			setXCG01677(XCG01677);
		}

		String XCG01678 = (String)attributes.get("XCG01678");

		if (XCG01678 != null) {
			setXCG01678(XCG01678);
		}

		String XCG01679 = (String)attributes.get("XCG01679");

		if (XCG01679 != null) {
			setXCG01679(XCG01679);
		}

		String XCG01680 = (String)attributes.get("XCG01680");

		if (XCG01680 != null) {
			setXCG01680(XCG01680);
		}

		String XCG01681 = (String)attributes.get("XCG01681");

		if (XCG01681 != null) {
			setXCG01681(XCG01681);
		}

		String XCG01682 = (String)attributes.get("XCG01682");

		if (XCG01682 != null) {
			setXCG01682(XCG01682);
		}

		String XCG01683 = (String)attributes.get("XCG01683");

		if (XCG01683 != null) {
			setXCG01683(XCG01683);
		}

		String XCG01684 = (String)attributes.get("XCG01684");

		if (XCG01684 != null) {
			setXCG01684(XCG01684);
		}

		String XCG01685 = (String)attributes.get("XCG01685");

		if (XCG01685 != null) {
			setXCG01685(XCG01685);
		}

		String XCG01686 = (String)attributes.get("XCG01686");

		if (XCG01686 != null) {
			setXCG01686(XCG01686);
		}

		String XCG01687 = (String)attributes.get("XCG01687");

		if (XCG01687 != null) {
			setXCG01687(XCG01687);
		}

		String XCG01688 = (String)attributes.get("XCG01688");

		if (XCG01688 != null) {
			setXCG01688(XCG01688);
		}

		String XCG01689 = (String)attributes.get("XCG01689");

		if (XCG01689 != null) {
			setXCG01689(XCG01689);
		}

		String XCG01690 = (String)attributes.get("XCG01690");

		if (XCG01690 != null) {
			setXCG01690(XCG01690);
		}

		String XCG01691 = (String)attributes.get("XCG01691");

		if (XCG01691 != null) {
			setXCG01691(XCG01691);
		}

		String XCG01692 = (String)attributes.get("XCG01692");

		if (XCG01692 != null) {
			setXCG01692(XCG01692);
		}

		String XCG01693 = (String)attributes.get("XCG01693");

		if (XCG01693 != null) {
			setXCG01693(XCG01693);
		}

		String XCG01694 = (String)attributes.get("XCG01694");

		if (XCG01694 != null) {
			setXCG01694(XCG01694);
		}

		String XCG01695 = (String)attributes.get("XCG01695");

		if (XCG01695 != null) {
			setXCG01695(XCG01695);
		}

		String XCG01696 = (String)attributes.get("XCG01696");

		if (XCG01696 != null) {
			setXCG01696(XCG01696);
		}

		String XCG01697 = (String)attributes.get("XCG01697");

		if (XCG01697 != null) {
			setXCG01697(XCG01697);
		}

		String XCG01698 = (String)attributes.get("XCG01698");

		if (XCG01698 != null) {
			setXCG01698(XCG01698);
		}

		String XCG01699 = (String)attributes.get("XCG01699");

		if (XCG01699 != null) {
			setXCG01699(XCG01699);
		}

		String XCG01700 = (String)attributes.get("XCG01700");

		if (XCG01700 != null) {
			setXCG01700(XCG01700);
		}

		String XCG01701 = (String)attributes.get("XCG01701");

		if (XCG01701 != null) {
			setXCG01701(XCG01701);
		}

		String XCG01702 = (String)attributes.get("XCG01702");

		if (XCG01702 != null) {
			setXCG01702(XCG01702);
		}

		String XCG01703 = (String)attributes.get("XCG01703");

		if (XCG01703 != null) {
			setXCG01703(XCG01703);
		}

		String XCG01704 = (String)attributes.get("XCG01704");

		if (XCG01704 != null) {
			setXCG01704(XCG01704);
		}

		String XCG01705 = (String)attributes.get("XCG01705");

		if (XCG01705 != null) {
			setXCG01705(XCG01705);
		}

		String XCG01706 = (String)attributes.get("XCG01706");

		if (XCG01706 != null) {
			setXCG01706(XCG01706);
		}

		String XCG01707 = (String)attributes.get("XCG01707");

		if (XCG01707 != null) {
			setXCG01707(XCG01707);
		}

		String XCG01708 = (String)attributes.get("XCG01708");

		if (XCG01708 != null) {
			setXCG01708(XCG01708);
		}

		String XCG01709 = (String)attributes.get("XCG01709");

		if (XCG01709 != null) {
			setXCG01709(XCG01709);
		}

		String XCG01710 = (String)attributes.get("XCG01710");

		if (XCG01710 != null) {
			setXCG01710(XCG01710);
		}

		String XCG01711 = (String)attributes.get("XCG01711");

		if (XCG01711 != null) {
			setXCG01711(XCG01711);
		}

		String XCG01712 = (String)attributes.get("XCG01712");

		if (XCG01712 != null) {
			setXCG01712(XCG01712);
		}

		String XCG01713 = (String)attributes.get("XCG01713");

		if (XCG01713 != null) {
			setXCG01713(XCG01713);
		}

		String XCG01714 = (String)attributes.get("XCG01714");

		if (XCG01714 != null) {
			setXCG01714(XCG01714);
		}

		String XCG01715 = (String)attributes.get("XCG01715");

		if (XCG01715 != null) {
			setXCG01715(XCG01715);
		}

		String XCG01716 = (String)attributes.get("XCG01716");

		if (XCG01716 != null) {
			setXCG01716(XCG01716);
		}

		String XCG01717 = (String)attributes.get("XCG01717");

		if (XCG01717 != null) {
			setXCG01717(XCG01717);
		}

		String XCG01718 = (String)attributes.get("XCG01718");

		if (XCG01718 != null) {
			setXCG01718(XCG01718);
		}

		String XCG01719 = (String)attributes.get("XCG01719");

		if (XCG01719 != null) {
			setXCG01719(XCG01719);
		}

		String XCG01720 = (String)attributes.get("XCG01720");

		if (XCG01720 != null) {
			setXCG01720(XCG01720);
		}

		String XCG01721 = (String)attributes.get("XCG01721");

		if (XCG01721 != null) {
			setXCG01721(XCG01721);
		}

		String XCG01722 = (String)attributes.get("XCG01722");

		if (XCG01722 != null) {
			setXCG01722(XCG01722);
		}

		String XCG01723 = (String)attributes.get("XCG01723");

		if (XCG01723 != null) {
			setXCG01723(XCG01723);
		}

		String XCG01724 = (String)attributes.get("XCG01724");

		if (XCG01724 != null) {
			setXCG01724(XCG01724);
		}

		String XCG01725 = (String)attributes.get("XCG01725");

		if (XCG01725 != null) {
			setXCG01725(XCG01725);
		}

		String XCG01726 = (String)attributes.get("XCG01726");

		if (XCG01726 != null) {
			setXCG01726(XCG01726);
		}

		String XCG01727 = (String)attributes.get("XCG01727");

		if (XCG01727 != null) {
			setXCG01727(XCG01727);
		}

		String XCG01728 = (String)attributes.get("XCG01728");

		if (XCG01728 != null) {
			setXCG01728(XCG01728);
		}

		String XCG01729 = (String)attributes.get("XCG01729");

		if (XCG01729 != null) {
			setXCG01729(XCG01729);
		}

		String XCG01730 = (String)attributes.get("XCG01730");

		if (XCG01730 != null) {
			setXCG01730(XCG01730);
		}

		String XCG01731 = (String)attributes.get("XCG01731");

		if (XCG01731 != null) {
			setXCG01731(XCG01731);
		}

		String XCG01732 = (String)attributes.get("XCG01732");

		if (XCG01732 != null) {
			setXCG01732(XCG01732);
		}

		String XCG01733 = (String)attributes.get("XCG01733");

		if (XCG01733 != null) {
			setXCG01733(XCG01733);
		}

		String XCG01734 = (String)attributes.get("XCG01734");

		if (XCG01734 != null) {
			setXCG01734(XCG01734);
		}

		String XCG01735 = (String)attributes.get("XCG01735");

		if (XCG01735 != null) {
			setXCG01735(XCG01735);
		}

		String XCG01736 = (String)attributes.get("XCG01736");

		if (XCG01736 != null) {
			setXCG01736(XCG01736);
		}

		String XCG01737 = (String)attributes.get("XCG01737");

		if (XCG01737 != null) {
			setXCG01737(XCG01737);
		}

		String XCG01738 = (String)attributes.get("XCG01738");

		if (XCG01738 != null) {
			setXCG01738(XCG01738);
		}

		String XCG01739 = (String)attributes.get("XCG01739");

		if (XCG01739 != null) {
			setXCG01739(XCG01739);
		}

		String XCG01740 = (String)attributes.get("XCG01740");

		if (XCG01740 != null) {
			setXCG01740(XCG01740);
		}

		String XCG01741 = (String)attributes.get("XCG01741");

		if (XCG01741 != null) {
			setXCG01741(XCG01741);
		}

		String XCG01742 = (String)attributes.get("XCG01742");

		if (XCG01742 != null) {
			setXCG01742(XCG01742);
		}

		String XCG01744 = (String)attributes.get("XCG01744");

		if (XCG01744 != null) {
			setXCG01744(XCG01744);
		}

		String XCG01745 = (String)attributes.get("XCG01745");

		if (XCG01745 != null) {
			setXCG01745(XCG01745);
		}

		String XCG01746 = (String)attributes.get("XCG01746");

		if (XCG01746 != null) {
			setXCG01746(XCG01746);
		}

		String XCG01747 = (String)attributes.get("XCG01747");

		if (XCG01747 != null) {
			setXCG01747(XCG01747);
		}

		String XCG01748 = (String)attributes.get("XCG01748");

		if (XCG01748 != null) {
			setXCG01748(XCG01748);
		}

		String XCG01749 = (String)attributes.get("XCG01749");

		if (XCG01749 != null) {
			setXCG01749(XCG01749);
		}

		String XCG01945 = (String)attributes.get("XCG01945");

		if (XCG01945 != null) {
			setXCG01945(XCG01945);
		}

		String XCG01750 = (String)attributes.get("XCG01750");

		if (XCG01750 != null) {
			setXCG01750(XCG01750);
		}

		String XCG01946 = (String)attributes.get("XCG01946");

		if (XCG01946 != null) {
			setXCG01946(XCG01946);
		}

		String XCG01751 = (String)attributes.get("XCG01751");

		if (XCG01751 != null) {
			setXCG01751(XCG01751);
		}

		String XCG01752 = (String)attributes.get("XCG01752");

		if (XCG01752 != null) {
			setXCG01752(XCG01752);
		}

		String XCG01753 = (String)attributes.get("XCG01753");

		if (XCG01753 != null) {
			setXCG01753(XCG01753);
		}

		String XCG01754 = (String)attributes.get("XCG01754");

		if (XCG01754 != null) {
			setXCG01754(XCG01754);
		}

		String XCG01756 = (String)attributes.get("XCG01756");

		if (XCG01756 != null) {
			setXCG01756(XCG01756);
		}

		String XCG01757 = (String)attributes.get("XCG01757");

		if (XCG01757 != null) {
			setXCG01757(XCG01757);
		}

		String XCG01758 = (String)attributes.get("XCG01758");

		if (XCG01758 != null) {
			setXCG01758(XCG01758);
		}

		String XCG01759 = (String)attributes.get("XCG01759");

		if (XCG01759 != null) {
			setXCG01759(XCG01759);
		}

		String XCG01948 = (String)attributes.get("XCG01948");

		if (XCG01948 != null) {
			setXCG01948(XCG01948);
		}

		String XCG01760 = (String)attributes.get("XCG01760");

		if (XCG01760 != null) {
			setXCG01760(XCG01760);
		}

		String XCG01949 = (String)attributes.get("XCG01949");

		if (XCG01949 != null) {
			setXCG01949(XCG01949);
		}

		String XCG01761 = (String)attributes.get("XCG01761");

		if (XCG01761 != null) {
			setXCG01761(XCG01761);
		}

		String XCG01950 = (String)attributes.get("XCG01950");

		if (XCG01950 != null) {
			setXCG01950(XCG01950);
		}

		String XCG01762 = (String)attributes.get("XCG01762");

		if (XCG01762 != null) {
			setXCG01762(XCG01762);
		}

		String XCG01951 = (String)attributes.get("XCG01951");

		if (XCG01951 != null) {
			setXCG01951(XCG01951);
		}

		String XCG01763 = (String)attributes.get("XCG01763");

		if (XCG01763 != null) {
			setXCG01763(XCG01763);
		}

		String XCG01952 = (String)attributes.get("XCG01952");

		if (XCG01952 != null) {
			setXCG01952(XCG01952);
		}

		String XCG01764 = (String)attributes.get("XCG01764");

		if (XCG01764 != null) {
			setXCG01764(XCG01764);
		}

		String XCG01953 = (String)attributes.get("XCG01953");

		if (XCG01953 != null) {
			setXCG01953(XCG01953);
		}

		String XCG01765 = (String)attributes.get("XCG01765");

		if (XCG01765 != null) {
			setXCG01765(XCG01765);
		}

		String XCG01954 = (String)attributes.get("XCG01954");

		if (XCG01954 != null) {
			setXCG01954(XCG01954);
		}

		String XCG01766 = (String)attributes.get("XCG01766");

		if (XCG01766 != null) {
			setXCG01766(XCG01766);
		}

		String XCG01955 = (String)attributes.get("XCG01955");

		if (XCG01955 != null) {
			setXCG01955(XCG01955);
		}

		String XCG01767 = (String)attributes.get("XCG01767");

		if (XCG01767 != null) {
			setXCG01767(XCG01767);
		}

		String XCG01956 = (String)attributes.get("XCG01956");

		if (XCG01956 != null) {
			setXCG01956(XCG01956);
		}

		String XCG01768 = (String)attributes.get("XCG01768");

		if (XCG01768 != null) {
			setXCG01768(XCG01768);
		}

		String XCG01957 = (String)attributes.get("XCG01957");

		if (XCG01957 != null) {
			setXCG01957(XCG01957);
		}

		String XCG01769 = (String)attributes.get("XCG01769");

		if (XCG01769 != null) {
			setXCG01769(XCG01769);
		}

		String XCG01958 = (String)attributes.get("XCG01958");

		if (XCG01958 != null) {
			setXCG01958(XCG01958);
		}

		String XCG01770 = (String)attributes.get("XCG01770");

		if (XCG01770 != null) {
			setXCG01770(XCG01770);
		}

		String XCG01771 = (String)attributes.get("XCG01771");

		if (XCG01771 != null) {
			setXCG01771(XCG01771);
		}

		String XCG01959 = (String)attributes.get("XCG01959");

		if (XCG01959 != null) {
			setXCG01959(XCG01959);
		}

		String XCG01772 = (String)attributes.get("XCG01772");

		if (XCG01772 != null) {
			setXCG01772(XCG01772);
		}

		String XCG01773 = (String)attributes.get("XCG01773");

		if (XCG01773 != null) {
			setXCG01773(XCG01773);
		}

		String XCG01774 = (String)attributes.get("XCG01774");

		if (XCG01774 != null) {
			setXCG01774(XCG01774);
		}

		String XCG01775 = (String)attributes.get("XCG01775");

		if (XCG01775 != null) {
			setXCG01775(XCG01775);
		}

		String XCG01776 = (String)attributes.get("XCG01776");

		if (XCG01776 != null) {
			setXCG01776(XCG01776);
		}

		String XCG01777 = (String)attributes.get("XCG01777");

		if (XCG01777 != null) {
			setXCG01777(XCG01777);
		}

		String XCG01778 = (String)attributes.get("XCG01778");

		if (XCG01778 != null) {
			setXCG01778(XCG01778);
		}

		String XCG01779 = (String)attributes.get("XCG01779");

		if (XCG01779 != null) {
			setXCG01779(XCG01779);
		}

		String XCG01780 = (String)attributes.get("XCG01780");

		if (XCG01780 != null) {
			setXCG01780(XCG01780);
		}

		String XCG01781 = (String)attributes.get("XCG01781");

		if (XCG01781 != null) {
			setXCG01781(XCG01781);
		}

		String XCG01783 = (String)attributes.get("XCG01783");

		if (XCG01783 != null) {
			setXCG01783(XCG01783);
		}

		String XCG01785 = (String)attributes.get("XCG01785");

		if (XCG01785 != null) {
			setXCG01785(XCG01785);
		}

		String XCG01786 = (String)attributes.get("XCG01786");

		if (XCG01786 != null) {
			setXCG01786(XCG01786);
		}

		String XCG01787 = (String)attributes.get("XCG01787");

		if (XCG01787 != null) {
			setXCG01787(XCG01787);
		}

		String XCG01788 = (String)attributes.get("XCG01788");

		if (XCG01788 != null) {
			setXCG01788(XCG01788);
		}

		String XCG01789 = (String)attributes.get("XCG01789");

		if (XCG01789 != null) {
			setXCG01789(XCG01789);
		}

		String XCG01790 = (String)attributes.get("XCG01790");

		if (XCG01790 != null) {
			setXCG01790(XCG01790);
		}

		String XCG01791 = (String)attributes.get("XCG01791");

		if (XCG01791 != null) {
			setXCG01791(XCG01791);
		}

		String XCG01792 = (String)attributes.get("XCG01792");

		if (XCG01792 != null) {
			setXCG01792(XCG01792);
		}

		String XCG01793 = (String)attributes.get("XCG01793");

		if (XCG01793 != null) {
			setXCG01793(XCG01793);
		}

		String XCG01794 = (String)attributes.get("XCG01794");

		if (XCG01794 != null) {
			setXCG01794(XCG01794);
		}

		String XCG01795 = (String)attributes.get("XCG01795");

		if (XCG01795 != null) {
			setXCG01795(XCG01795);
		}

		String XCG01796 = (String)attributes.get("XCG01796");

		if (XCG01796 != null) {
			setXCG01796(XCG01796);
		}

		String XCG01797 = (String)attributes.get("XCG01797");

		if (XCG01797 != null) {
			setXCG01797(XCG01797);
		}

		String XCG01798 = (String)attributes.get("XCG01798");

		if (XCG01798 != null) {
			setXCG01798(XCG01798);
		}

		String XCG01799 = (String)attributes.get("XCG01799");

		if (XCG01799 != null) {
			setXCG01799(XCG01799);
		}

		String XCG01801 = (String)attributes.get("XCG01801");

		if (XCG01801 != null) {
			setXCG01801(XCG01801);
		}

		String XCG01802 = (String)attributes.get("XCG01802");

		if (XCG01802 != null) {
			setXCG01802(XCG01802);
		}

		String XCG01803 = (String)attributes.get("XCG01803");

		if (XCG01803 != null) {
			setXCG01803(XCG01803);
		}

		String XCG01804 = (String)attributes.get("XCG01804");

		if (XCG01804 != null) {
			setXCG01804(XCG01804);
		}

		String XCG01805 = (String)attributes.get("XCG01805");

		if (XCG01805 != null) {
			setXCG01805(XCG01805);
		}

		String XCG01806 = (String)attributes.get("XCG01806");

		if (XCG01806 != null) {
			setXCG01806(XCG01806);
		}

		String XCG01807 = (String)attributes.get("XCG01807");

		if (XCG01807 != null) {
			setXCG01807(XCG01807);
		}

		String XCG01808 = (String)attributes.get("XCG01808");

		if (XCG01808 != null) {
			setXCG01808(XCG01808);
		}

		String XCG01809 = (String)attributes.get("XCG01809");

		if (XCG01809 != null) {
			setXCG01809(XCG01809);
		}

		String XCG01810 = (String)attributes.get("XCG01810");

		if (XCG01810 != null) {
			setXCG01810(XCG01810);
		}

		String XCG01811 = (String)attributes.get("XCG01811");

		if (XCG01811 != null) {
			setXCG01811(XCG01811);
		}

		String XCG01812 = (String)attributes.get("XCG01812");

		if (XCG01812 != null) {
			setXCG01812(XCG01812);
		}

		String XCG01813 = (String)attributes.get("XCG01813");

		if (XCG01813 != null) {
			setXCG01813(XCG01813);
		}

		String XCG01814 = (String)attributes.get("XCG01814");

		if (XCG01814 != null) {
			setXCG01814(XCG01814);
		}

		String TDTKXCG001 = (String)attributes.get("TDTKXCG001");

		if (TDTKXCG001 != null) {
			setTDTKXCG001(TDTKXCG001);
		}

		String TDTKXCG002 = (String)attributes.get("TDTKXCG002");

		if (TDTKXCG002 != null) {
			setTDTKXCG002(TDTKXCG002);
		}

		String TDTKXCG003 = (String)attributes.get("TDTKXCG003");

		if (TDTKXCG003 != null) {
			setTDTKXCG003(TDTKXCG003);
		}

		String TDTKXCG004 = (String)attributes.get("TDTKXCG004");

		if (TDTKXCG004 != null) {
			setTDTKXCG004(TDTKXCG004);
		}

		String TDTKXCG005 = (String)attributes.get("TDTKXCG005");

		if (TDTKXCG005 != null) {
			setTDTKXCG005(TDTKXCG005);
		}

		String TDTKXCG006 = (String)attributes.get("TDTKXCG006");

		if (TDTKXCG006 != null) {
			setTDTKXCG006(TDTKXCG006);
		}

		String TDTKXCG007 = (String)attributes.get("TDTKXCG007");

		if (TDTKXCG007 != null) {
			setTDTKXCG007(TDTKXCG007);
		}

		String TDTKXCG008 = (String)attributes.get("TDTKXCG008");

		if (TDTKXCG008 != null) {
			setTDTKXCG008(TDTKXCG008);
		}

		String TDTKXCG009 = (String)attributes.get("TDTKXCG009");

		if (TDTKXCG009 != null) {
			setTDTKXCG009(TDTKXCG009);
		}

		String TDTKXCG010 = (String)attributes.get("TDTKXCG010");

		if (TDTKXCG010 != null) {
			setTDTKXCG010(TDTKXCG010);
		}

		String TDTKXCG011 = (String)attributes.get("TDTKXCG011");

		if (TDTKXCG011 != null) {
			setTDTKXCG011(TDTKXCG011);
		}

		String TDTKXCG012 = (String)attributes.get("TDTKXCG012");

		if (TDTKXCG012 != null) {
			setTDTKXCG012(TDTKXCG012);
		}

		String TDTKXCG013 = (String)attributes.get("TDTKXCG013");

		if (TDTKXCG013 != null) {
			setTDTKXCG013(TDTKXCG013);
		}

		String TDTKXCG014 = (String)attributes.get("TDTKXCG014");

		if (TDTKXCG014 != null) {
			setTDTKXCG014(TDTKXCG014);
		}

		String TDTKXCG015 = (String)attributes.get("TDTKXCG015");

		if (TDTKXCG015 != null) {
			setTDTKXCG015(TDTKXCG015);
		}

		String TDTKXCG016 = (String)attributes.get("TDTKXCG016");

		if (TDTKXCG016 != null) {
			setTDTKXCG016(TDTKXCG016);
		}

		String TDTKXCG017 = (String)attributes.get("TDTKXCG017");

		if (TDTKXCG017 != null) {
			setTDTKXCG017(TDTKXCG017);
		}

		String TDTKXCG018 = (String)attributes.get("TDTKXCG018");

		if (TDTKXCG018 != null) {
			setTDTKXCG018(TDTKXCG018);
		}

		String TDTKXCG019 = (String)attributes.get("TDTKXCG019");

		if (TDTKXCG019 != null) {
			setTDTKXCG019(TDTKXCG019);
		}

		String TDTKXCG020 = (String)attributes.get("TDTKXCG020");

		if (TDTKXCG020 != null) {
			setTDTKXCG020(TDTKXCG020);
		}

		String TDTKXCG021 = (String)attributes.get("TDTKXCG021");

		if (TDTKXCG021 != null) {
			setTDTKXCG021(TDTKXCG021);
		}

		String TDTKXCG022 = (String)attributes.get("TDTKXCG022");

		if (TDTKXCG022 != null) {
			setTDTKXCG022(TDTKXCG022);
		}

		String TDTKXCG023 = (String)attributes.get("TDTKXCG023");

		if (TDTKXCG023 != null) {
			setTDTKXCG023(TDTKXCG023);
		}

		String TDTKXCG024 = (String)attributes.get("TDTKXCG024");

		if (TDTKXCG024 != null) {
			setTDTKXCG024(TDTKXCG024);
		}

		String TDTKXCG025 = (String)attributes.get("TDTKXCG025");

		if (TDTKXCG025 != null) {
			setTDTKXCG025(TDTKXCG025);
		}

		String TDTKXCG026 = (String)attributes.get("TDTKXCG026");

		if (TDTKXCG026 != null) {
			setTDTKXCG026(TDTKXCG026);
		}

		String TDTKXCG027 = (String)attributes.get("TDTKXCG027");

		if (TDTKXCG027 != null) {
			setTDTKXCG027(TDTKXCG027);
		}

		String TDTKXCG028 = (String)attributes.get("TDTKXCG028");

		if (TDTKXCG028 != null) {
			setTDTKXCG028(TDTKXCG028);
		}

		String TDTKXCG029 = (String)attributes.get("TDTKXCG029");

		if (TDTKXCG029 != null) {
			setTDTKXCG029(TDTKXCG029);
		}

		String TDTKXCG030 = (String)attributes.get("TDTKXCG030");

		if (TDTKXCG030 != null) {
			setTDTKXCG030(TDTKXCG030);
		}

		String TDTKXCG031 = (String)attributes.get("TDTKXCG031");

		if (TDTKXCG031 != null) {
			setTDTKXCG031(TDTKXCG031);
		}

		String TDTKXCG032 = (String)attributes.get("TDTKXCG032");

		if (TDTKXCG032 != null) {
			setTDTKXCG032(TDTKXCG032);
		}

		String TDTKXCG033 = (String)attributes.get("TDTKXCG033");

		if (TDTKXCG033 != null) {
			setTDTKXCG033(TDTKXCG033);
		}

		String TDTKXCG034 = (String)attributes.get("TDTKXCG034");

		if (TDTKXCG034 != null) {
			setTDTKXCG034(TDTKXCG034);
		}

		String TDTKXCG035 = (String)attributes.get("TDTKXCG035");

		if (TDTKXCG035 != null) {
			setTDTKXCG035(TDTKXCG035);
		}

		String TDTKXCG036 = (String)attributes.get("TDTKXCG036");

		if (TDTKXCG036 != null) {
			setTDTKXCG036(TDTKXCG036);
		}

		String BBCNCLKLXCG01 = (String)attributes.get("BBCNCLKLXCG01");

		if (BBCNCLKLXCG01 != null) {
			setBBCNCLKLXCG01(BBCNCLKLXCG01);
		}

		String BBCNCLKLXCG02 = (String)attributes.get("BBCNCLKLXCG02");

		if (BBCNCLKLXCG02 != null) {
			setBBCNCLKLXCG02(BBCNCLKLXCG02);
		}

		String BBCNCLKLXCG03 = (String)attributes.get("BBCNCLKLXCG03");

		if (BBCNCLKLXCG03 != null) {
			setBBCNCLKLXCG03(BBCNCLKLXCG03);
		}

		String BBCNCLKLXCG04 = (String)attributes.get("BBCNCLKLXCG04");

		if (BBCNCLKLXCG04 != null) {
			setBBCNCLKLXCG04(BBCNCLKLXCG04);
		}

		String BBCNCLKLXCG05 = (String)attributes.get("BBCNCLKLXCG05");

		if (BBCNCLKLXCG05 != null) {
			setBBCNCLKLXCG05(BBCNCLKLXCG05);
		}

		String BBCNCLKLXCG06 = (String)attributes.get("BBCNCLKLXCG06");

		if (BBCNCLKLXCG06 != null) {
			setBBCNCLKLXCG06(BBCNCLKLXCG06);
		}

		String BBCNCLKLXCG07 = (String)attributes.get("BBCNCLKLXCG07");

		if (BBCNCLKLXCG07 != null) {
			setBBCNCLKLXCG07(BBCNCLKLXCG07);
		}

		String BBCNCLKLXCG08 = (String)attributes.get("BBCNCLKLXCG08");

		if (BBCNCLKLXCG08 != null) {
			setBBCNCLKLXCG08(BBCNCLKLXCG08);
		}

		String BBCNCLKLXCG09 = (String)attributes.get("BBCNCLKLXCG09");

		if (BBCNCLKLXCG09 != null) {
			setBBCNCLKLXCG09(BBCNCLKLXCG09);
		}

		String BBCNCLKLXCG10 = (String)attributes.get("BBCNCLKLXCG10");

		if (BBCNCLKLXCG10 != null) {
			setBBCNCLKLXCG10(BBCNCLKLXCG10);
		}

		String BBCNCLKLXCG11 = (String)attributes.get("BBCNCLKLXCG11");

		if (BBCNCLKLXCG11 != null) {
			setBBCNCLKLXCG11(BBCNCLKLXCG11);
		}

		String BBCNCLKLXCG12 = (String)attributes.get("BBCNCLKLXCG12");

		if (BBCNCLKLXCG12 != null) {
			setBBCNCLKLXCG12(BBCNCLKLXCG12);
		}

		String BBCNCLKLXCG13 = (String)attributes.get("BBCNCLKLXCG13");

		if (BBCNCLKLXCG13 != null) {
			setBBCNCLKLXCG13(BBCNCLKLXCG13);
		}

		String BBCNCLKLXCG14 = (String)attributes.get("BBCNCLKLXCG14");

		if (BBCNCLKLXCG14 != null) {
			setBBCNCLKLXCG14(BBCNCLKLXCG14);
		}

		String BBCNCLKLXCG15 = (String)attributes.get("BBCNCLKLXCG15");

		if (BBCNCLKLXCG15 != null) {
			setBBCNCLKLXCG15(BBCNCLKLXCG15);
		}

		String BBCNCLKLXCG16 = (String)attributes.get("BBCNCLKLXCG16");

		if (BBCNCLKLXCG16 != null) {
			setBBCNCLKLXCG16(BBCNCLKLXCG16);
		}

		String BBCNCLKLXCG17 = (String)attributes.get("BBCNCLKLXCG17");

		if (BBCNCLKLXCG17 != null) {
			setBBCNCLKLXCG17(BBCNCLKLXCG17);
		}

		String BBCNCLKLXCG18 = (String)attributes.get("BBCNCLKLXCG18");

		if (BBCNCLKLXCG18 != null) {
			setBBCNCLKLXCG18(BBCNCLKLXCG18);
		}

		String BBCNCLKLXCG19 = (String)attributes.get("BBCNCLKLXCG19");

		if (BBCNCLKLXCG19 != null) {
			setBBCNCLKLXCG19(BBCNCLKLXCG19);
		}

		String BBCNCLKLXCG20 = (String)attributes.get("BBCNCLKLXCG20");

		if (BBCNCLKLXCG20 != null) {
			setBBCNCLKLXCG20(BBCNCLKLXCG20);
		}

		String BBCNCLKLXCG21 = (String)attributes.get("BBCNCLKLXCG21");

		if (BBCNCLKLXCG21 != null) {
			setBBCNCLKLXCG21(BBCNCLKLXCG21);
		}

		String BBCNCLKLXCG22 = (String)attributes.get("BBCNCLKLXCG22");

		if (BBCNCLKLXCG22 != null) {
			setBBCNCLKLXCG22(BBCNCLKLXCG22);
		}

		String BBCNCLKLXCG23 = (String)attributes.get("BBCNCLKLXCG23");

		if (BBCNCLKLXCG23 != null) {
			setBBCNCLKLXCG23(BBCNCLKLXCG23);
		}

		String BBCNCLKLXCG24 = (String)attributes.get("BBCNCLKLXCG24");

		if (BBCNCLKLXCG24 != null) {
			setBBCNCLKLXCG24(BBCNCLKLXCG24);
		}

		String BBCNCLKLXCG26 = (String)attributes.get("BBCNCLKLXCG26");

		if (BBCNCLKLXCG26 != null) {
			setBBCNCLKLXCG26(BBCNCLKLXCG26);
		}

		String BBCNCLKLXCG27 = (String)attributes.get("BBCNCLKLXCG27");

		if (BBCNCLKLXCG27 != null) {
			setBBCNCLKLXCG27(BBCNCLKLXCG27);
		}

		String BBCNCLKLXCG28 = (String)attributes.get("BBCNCLKLXCG28");

		if (BBCNCLKLXCG28 != null) {
			setBBCNCLKLXCG28(BBCNCLKLXCG28);
		}

		String BBCNCLKLXCG29 = (String)attributes.get("BBCNCLKLXCG29");

		if (BBCNCLKLXCG29 != null) {
			setBBCNCLKLXCG29(BBCNCLKLXCG29);
		}

		String BBCNCLKLXCG30 = (String)attributes.get("BBCNCLKLXCG30");

		if (BBCNCLKLXCG30 != null) {
			setBBCNCLKLXCG30(BBCNCLKLXCG30);
		}

		String BBCNCLKLXCG31 = (String)attributes.get("BBCNCLKLXCG31");

		if (BBCNCLKLXCG31 != null) {
			setBBCNCLKLXCG31(BBCNCLKLXCG31);
		}

		String BBCNCLKLXCG33 = (String)attributes.get("BBCNCLKLXCG33");

		if (BBCNCLKLXCG33 != null) {
			setBBCNCLKLXCG33(BBCNCLKLXCG33);
		}

		String BBCNCLKLXCG34 = (String)attributes.get("BBCNCLKLXCG34");

		if (BBCNCLKLXCG34 != null) {
			setBBCNCLKLXCG34(BBCNCLKLXCG34);
		}

		String BBCNCLKLXCG35 = (String)attributes.get("BBCNCLKLXCG35");

		if (BBCNCLKLXCG35 != null) {
			setBBCNCLKLXCG35(BBCNCLKLXCG35);
		}

		String BBCNCLKLXCG36 = (String)attributes.get("BBCNCLKLXCG36");

		if (BBCNCLKLXCG36 != null) {
			setBBCNCLKLXCG36(BBCNCLKLXCG36);
		}

		String BBCNCLKLXCG38 = (String)attributes.get("BBCNCLKLXCG38");

		if (BBCNCLKLXCG38 != null) {
			setBBCNCLKLXCG38(BBCNCLKLXCG38);
		}

		String BBCNCLKLXCG39 = (String)attributes.get("BBCNCLKLXCG39");

		if (BBCNCLKLXCG39 != null) {
			setBBCNCLKLXCG39(BBCNCLKLXCG39);
		}

		String BBCNCLKLXCG40 = (String)attributes.get("BBCNCLKLXCG40");

		if (BBCNCLKLXCG40 != null) {
			setBBCNCLKLXCG40(BBCNCLKLXCG40);
		}

		String BBCNCLKLXCG42 = (String)attributes.get("BBCNCLKLXCG42");

		if (BBCNCLKLXCG42 != null) {
			setBBCNCLKLXCG42(BBCNCLKLXCG42);
		}

		String BBCNCLKLXCG43 = (String)attributes.get("BBCNCLKLXCG43");

		if (BBCNCLKLXCG43 != null) {
			setBBCNCLKLXCG43(BBCNCLKLXCG43);
		}

		String BBCNCLKLXCG44 = (String)attributes.get("BBCNCLKLXCG44");

		if (BBCNCLKLXCG44 != null) {
			setBBCNCLKLXCG44(BBCNCLKLXCG44);
		}

		String BBCNCLKLXCG45 = (String)attributes.get("BBCNCLKLXCG45");

		if (BBCNCLKLXCG45 != null) {
			setBBCNCLKLXCG45(BBCNCLKLXCG45);
		}

		String BBCNCLKLXCG46 = (String)attributes.get("BBCNCLKLXCG46");

		if (BBCNCLKLXCG46 != null) {
			setBBCNCLKLXCG46(BBCNCLKLXCG46);
		}

		String BBCNCLKLXCG47 = (String)attributes.get("BBCNCLKLXCG47");

		if (BBCNCLKLXCG47 != null) {
			setBBCNCLKLXCG47(BBCNCLKLXCG47);
		}

		String BBCNCLKLXCG48 = (String)attributes.get("BBCNCLKLXCG48");

		if (BBCNCLKLXCG48 != null) {
			setBBCNCLKLXCG48(BBCNCLKLXCG48);
		}

		String BBCNCLKLXCG49 = (String)attributes.get("BBCNCLKLXCG49");

		if (BBCNCLKLXCG49 != null) {
			setBBCNCLKLXCG49(BBCNCLKLXCG49);
		}

		String BBCNCLKLXCG50 = (String)attributes.get("BBCNCLKLXCG50");

		if (BBCNCLKLXCG50 != null) {
			setBBCNCLKLXCG50(BBCNCLKLXCG50);
		}

		String BBCNCLKLXCG51 = (String)attributes.get("BBCNCLKLXCG51");

		if (BBCNCLKLXCG51 != null) {
			setBBCNCLKLXCG51(BBCNCLKLXCG51);
		}

		String BBCNCLKLXCG52 = (String)attributes.get("BBCNCLKLXCG52");

		if (BBCNCLKLXCG52 != null) {
			setBBCNCLKLXCG52(BBCNCLKLXCG52);
		}

		String BBCNCLKLXCG53 = (String)attributes.get("BBCNCLKLXCG53");

		if (BBCNCLKLXCG53 != null) {
			setBBCNCLKLXCG53(BBCNCLKLXCG53);
		}

		String BBCNCLKLXCG54 = (String)attributes.get("BBCNCLKLXCG54");

		if (BBCNCLKLXCG54 != null) {
			setBBCNCLKLXCG54(BBCNCLKLXCG54);
		}

		String BBKTSPMXCG001 = (String)attributes.get("BBKTSPMXCG001");

		if (BBKTSPMXCG001 != null) {
			setBBKTSPMXCG001(BBKTSPMXCG001);
		}

		String BBKTSPMXCG002 = (String)attributes.get("BBKTSPMXCG002");

		if (BBKTSPMXCG002 != null) {
			setBBKTSPMXCG002(BBKTSPMXCG002);
		}

		String BBKTSPMXCG003 = (String)attributes.get("BBKTSPMXCG003");

		if (BBKTSPMXCG003 != null) {
			setBBKTSPMXCG003(BBKTSPMXCG003);
		}

		String BBKTSPMXCG004 = (String)attributes.get("BBKTSPMXCG004");

		if (BBKTSPMXCG004 != null) {
			setBBKTSPMXCG004(BBKTSPMXCG004);
		}

		String BBKTSPMXCG005 = (String)attributes.get("BBKTSPMXCG005");

		if (BBKTSPMXCG005 != null) {
			setBBKTSPMXCG005(BBKTSPMXCG005);
		}

		String BBKTSPMXCG006 = (String)attributes.get("BBKTSPMXCG006");

		if (BBKTSPMXCG006 != null) {
			setBBKTSPMXCG006(BBKTSPMXCG006);
		}

		String BBKTSPMXCG007 = (String)attributes.get("BBKTSPMXCG007");

		if (BBKTSPMXCG007 != null) {
			setBBKTSPMXCG007(BBKTSPMXCG007);
		}

		String BBKTSPMXCG008 = (String)attributes.get("BBKTSPMXCG008");

		if (BBKTSPMXCG008 != null) {
			setBBKTSPMXCG008(BBKTSPMXCG008);
		}

		String BBKTSPMXCG009 = (String)attributes.get("BBKTSPMXCG009");

		if (BBKTSPMXCG009 != null) {
			setBBKTSPMXCG009(BBKTSPMXCG009);
		}

		String BBKTSPMXCG010 = (String)attributes.get("BBKTSPMXCG010");

		if (BBKTSPMXCG010 != null) {
			setBBKTSPMXCG010(BBKTSPMXCG010);
		}

		String BBKTSPMXCG011 = (String)attributes.get("BBKTSPMXCG011");

		if (BBKTSPMXCG011 != null) {
			setBBKTSPMXCG011(BBKTSPMXCG011);
		}

		String BBKTSPMXCG012 = (String)attributes.get("BBKTSPMXCG012");

		if (BBKTSPMXCG012 != null) {
			setBBKTSPMXCG012(BBKTSPMXCG012);
		}

		String BBKTSPMXCG013 = (String)attributes.get("BBKTSPMXCG013");

		if (BBKTSPMXCG013 != null) {
			setBBKTSPMXCG013(BBKTSPMXCG013);
		}

		String BBKTSPMXCG014 = (String)attributes.get("BBKTSPMXCG014");

		if (BBKTSPMXCG014 != null) {
			setBBKTSPMXCG014(BBKTSPMXCG014);
		}

		String BBKTSPMXCG015 = (String)attributes.get("BBKTSPMXCG015");

		if (BBKTSPMXCG015 != null) {
			setBBKTSPMXCG015(BBKTSPMXCG015);
		}

		String BBKTSPMXCG016 = (String)attributes.get("BBKTSPMXCG016");

		if (BBKTSPMXCG016 != null) {
			setBBKTSPMXCG016(BBKTSPMXCG016);
		}

		String BBKTSPMXCG017 = (String)attributes.get("BBKTSPMXCG017");

		if (BBKTSPMXCG017 != null) {
			setBBKTSPMXCG017(BBKTSPMXCG017);
		}

		String BBKTSPMXCG018 = (String)attributes.get("BBKTSPMXCG018");

		if (BBKTSPMXCG018 != null) {
			setBBKTSPMXCG018(BBKTSPMXCG018);
		}

		String BBKTSPMXCG019 = (String)attributes.get("BBKTSPMXCG019");

		if (BBKTSPMXCG019 != null) {
			setBBKTSPMXCG019(BBKTSPMXCG019);
		}

		String BBKTSPMXCG020 = (String)attributes.get("BBKTSPMXCG020");

		if (BBKTSPMXCG020 != null) {
			setBBKTSPMXCG020(BBKTSPMXCG020);
		}

		String BBKTSPMXCG021 = (String)attributes.get("BBKTSPMXCG021");

		if (BBKTSPMXCG021 != null) {
			setBBKTSPMXCG021(BBKTSPMXCG021);
		}

		String BBKTSPMXCG022 = (String)attributes.get("BBKTSPMXCG022");

		if (BBKTSPMXCG022 != null) {
			setBBKTSPMXCG022(BBKTSPMXCG022);
		}

		String BBKTSPMXCG023 = (String)attributes.get("BBKTSPMXCG023");

		if (BBKTSPMXCG023 != null) {
			setBBKTSPMXCG023(BBKTSPMXCG023);
		}

		String BBKTSPMXCG024 = (String)attributes.get("BBKTSPMXCG024");

		if (BBKTSPMXCG024 != null) {
			setBBKTSPMXCG024(BBKTSPMXCG024);
		}

		String BBKTSPMXCG025 = (String)attributes.get("BBKTSPMXCG025");

		if (BBKTSPMXCG025 != null) {
			setBBKTSPMXCG025(BBKTSPMXCG025);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}

		Date syncDate = (Date)attributes.get("syncDate");

		if (syncDate != null) {
			setSyncDate(syncDate);
		}
	}

	@Override
	public VRTechnicalSpec_XCG toEscapedModel() {
		return new VRTechnicalSpec_XCGWrapper(_vrTechnicalSpec_XCG.toEscapedModel());
	}

	@Override
	public VRTechnicalSpec_XCG toUnescapedModel() {
		return new VRTechnicalSpec_XCGWrapper(_vrTechnicalSpec_XCG.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrTechnicalSpec_XCG.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrTechnicalSpec_XCG.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrTechnicalSpec_XCG.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrTechnicalSpec_XCG.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRTechnicalSpec_XCG> toCacheModel() {
		return _vrTechnicalSpec_XCG.toCacheModel();
	}

	@Override
	public int compareTo(VRTechnicalSpec_XCG vrTechnicalSpec_XCG) {
		return _vrTechnicalSpec_XCG.compareTo(vrTechnicalSpec_XCG);
	}

	@Override
	public int hashCode() {
		return _vrTechnicalSpec_XCG.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrTechnicalSpec_XCG.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRTechnicalSpec_XCGWrapper((VRTechnicalSpec_XCG)_vrTechnicalSpec_XCG.clone());
	}

	/**
	* Returns the bbcnclklxcg01 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg01 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG01() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG01();
	}

	/**
	* Returns the bbcnclklxcg02 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg02 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG02() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG02();
	}

	/**
	* Returns the bbcnclklxcg03 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg03 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG03() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG03();
	}

	/**
	* Returns the bbcnclklxcg04 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg04 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG04() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG04();
	}

	/**
	* Returns the bbcnclklxcg05 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg05 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG05() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG05();
	}

	/**
	* Returns the bbcnclklxcg06 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg06 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG06() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG06();
	}

	/**
	* Returns the bbcnclklxcg07 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg07 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG07() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG07();
	}

	/**
	* Returns the bbcnclklxcg08 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg08 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG08() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG08();
	}

	/**
	* Returns the bbcnclklxcg09 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg09 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG09() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG09();
	}

	/**
	* Returns the bbcnclklxcg10 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg10 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG10() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG10();
	}

	/**
	* Returns the bbcnclklxcg11 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg11 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG11() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG11();
	}

	/**
	* Returns the bbcnclklxcg12 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg12 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG12() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG12();
	}

	/**
	* Returns the bbcnclklxcg13 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg13 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG13() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG13();
	}

	/**
	* Returns the bbcnclklxcg14 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg14 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG14() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG14();
	}

	/**
	* Returns the bbcnclklxcg15 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg15 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG15() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG15();
	}

	/**
	* Returns the bbcnclklxcg16 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg16 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG16() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG16();
	}

	/**
	* Returns the bbcnclklxcg17 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg17 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG17() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG17();
	}

	/**
	* Returns the bbcnclklxcg18 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg18 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG18() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG18();
	}

	/**
	* Returns the bbcnclklxcg19 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg19 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG19() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG19();
	}

	/**
	* Returns the bbcnclklxcg20 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg20 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG20() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG20();
	}

	/**
	* Returns the bbcnclklxcg21 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg21 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG21() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG21();
	}

	/**
	* Returns the bbcnclklxcg22 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg22 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG22() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG22();
	}

	/**
	* Returns the bbcnclklxcg23 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg23 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG23() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG23();
	}

	/**
	* Returns the bbcnclklxcg24 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg24 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG24() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG24();
	}

	/**
	* Returns the bbcnclklxcg26 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg26 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG26() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG26();
	}

	/**
	* Returns the bbcnclklxcg27 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg27 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG27() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG27();
	}

	/**
	* Returns the bbcnclklxcg28 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg28 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG28() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG28();
	}

	/**
	* Returns the bbcnclklxcg29 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg29 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG29() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG29();
	}

	/**
	* Returns the bbcnclklxcg30 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg30 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG30() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG30();
	}

	/**
	* Returns the bbcnclklxcg31 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg31 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG31() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG31();
	}

	/**
	* Returns the bbcnclklxcg33 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg33 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG33() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG33();
	}

	/**
	* Returns the bbcnclklxcg34 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg34 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG34() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG34();
	}

	/**
	* Returns the bbcnclklxcg35 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg35 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG35() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG35();
	}

	/**
	* Returns the bbcnclklxcg36 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg36 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG36() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG36();
	}

	/**
	* Returns the bbcnclklxcg38 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg38 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG38() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG38();
	}

	/**
	* Returns the bbcnclklxcg39 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg39 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG39() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG39();
	}

	/**
	* Returns the bbcnclklxcg40 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg40 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG40() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG40();
	}

	/**
	* Returns the bbcnclklxcg42 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg42 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG42() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG42();
	}

	/**
	* Returns the bbcnclklxcg43 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg43 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG43() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG43();
	}

	/**
	* Returns the bbcnclklxcg44 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg44 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG44() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG44();
	}

	/**
	* Returns the bbcnclklxcg45 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg45 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG45() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG45();
	}

	/**
	* Returns the bbcnclklxcg46 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg46 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG46() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG46();
	}

	/**
	* Returns the bbcnclklxcg47 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg47 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG47() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG47();
	}

	/**
	* Returns the bbcnclklxcg48 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg48 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG48() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG48();
	}

	/**
	* Returns the bbcnclklxcg49 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg49 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG49() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG49();
	}

	/**
	* Returns the bbcnclklxcg50 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg50 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG50() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG50();
	}

	/**
	* Returns the bbcnclklxcg51 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg51 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG51() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG51();
	}

	/**
	* Returns the bbcnclklxcg52 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg52 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG52() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG52();
	}

	/**
	* Returns the bbcnclklxcg53 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg53 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG53() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG53();
	}

	/**
	* Returns the bbcnclklxcg54 of this vr technical spec_xcg.
	*
	* @return the bbcnclklxcg54 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBCNCLKLXCG54() {
		return _vrTechnicalSpec_XCG.getBBCNCLKLXCG54();
	}

	/**
	* Returns the bbktspmxcg001 of this vr technical spec_xcg.
	*
	* @return the bbktspmxcg001 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBKTSPMXCG001() {
		return _vrTechnicalSpec_XCG.getBBKTSPMXCG001();
	}

	/**
	* Returns the bbktspmxcg002 of this vr technical spec_xcg.
	*
	* @return the bbktspmxcg002 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBKTSPMXCG002() {
		return _vrTechnicalSpec_XCG.getBBKTSPMXCG002();
	}

	/**
	* Returns the bbktspmxcg003 of this vr technical spec_xcg.
	*
	* @return the bbktspmxcg003 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBKTSPMXCG003() {
		return _vrTechnicalSpec_XCG.getBBKTSPMXCG003();
	}

	/**
	* Returns the bbktspmxcg004 of this vr technical spec_xcg.
	*
	* @return the bbktspmxcg004 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBKTSPMXCG004() {
		return _vrTechnicalSpec_XCG.getBBKTSPMXCG004();
	}

	/**
	* Returns the bbktspmxcg005 of this vr technical spec_xcg.
	*
	* @return the bbktspmxcg005 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBKTSPMXCG005() {
		return _vrTechnicalSpec_XCG.getBBKTSPMXCG005();
	}

	/**
	* Returns the bbktspmxcg006 of this vr technical spec_xcg.
	*
	* @return the bbktspmxcg006 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBKTSPMXCG006() {
		return _vrTechnicalSpec_XCG.getBBKTSPMXCG006();
	}

	/**
	* Returns the bbktspmxcg007 of this vr technical spec_xcg.
	*
	* @return the bbktspmxcg007 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBKTSPMXCG007() {
		return _vrTechnicalSpec_XCG.getBBKTSPMXCG007();
	}

	/**
	* Returns the bbktspmxcg008 of this vr technical spec_xcg.
	*
	* @return the bbktspmxcg008 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBKTSPMXCG008() {
		return _vrTechnicalSpec_XCG.getBBKTSPMXCG008();
	}

	/**
	* Returns the bbktspmxcg009 of this vr technical spec_xcg.
	*
	* @return the bbktspmxcg009 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBKTSPMXCG009() {
		return _vrTechnicalSpec_XCG.getBBKTSPMXCG009();
	}

	/**
	* Returns the bbktspmxcg010 of this vr technical spec_xcg.
	*
	* @return the bbktspmxcg010 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBKTSPMXCG010() {
		return _vrTechnicalSpec_XCG.getBBKTSPMXCG010();
	}

	/**
	* Returns the bbktspmxcg011 of this vr technical spec_xcg.
	*
	* @return the bbktspmxcg011 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBKTSPMXCG011() {
		return _vrTechnicalSpec_XCG.getBBKTSPMXCG011();
	}

	/**
	* Returns the bbktspmxcg012 of this vr technical spec_xcg.
	*
	* @return the bbktspmxcg012 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBKTSPMXCG012() {
		return _vrTechnicalSpec_XCG.getBBKTSPMXCG012();
	}

	/**
	* Returns the bbktspmxcg013 of this vr technical spec_xcg.
	*
	* @return the bbktspmxcg013 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBKTSPMXCG013() {
		return _vrTechnicalSpec_XCG.getBBKTSPMXCG013();
	}

	/**
	* Returns the bbktspmxcg014 of this vr technical spec_xcg.
	*
	* @return the bbktspmxcg014 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBKTSPMXCG014() {
		return _vrTechnicalSpec_XCG.getBBKTSPMXCG014();
	}

	/**
	* Returns the bbktspmxcg015 of this vr technical spec_xcg.
	*
	* @return the bbktspmxcg015 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBKTSPMXCG015() {
		return _vrTechnicalSpec_XCG.getBBKTSPMXCG015();
	}

	/**
	* Returns the bbktspmxcg016 of this vr technical spec_xcg.
	*
	* @return the bbktspmxcg016 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBKTSPMXCG016() {
		return _vrTechnicalSpec_XCG.getBBKTSPMXCG016();
	}

	/**
	* Returns the bbktspmxcg017 of this vr technical spec_xcg.
	*
	* @return the bbktspmxcg017 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBKTSPMXCG017() {
		return _vrTechnicalSpec_XCG.getBBKTSPMXCG017();
	}

	/**
	* Returns the bbktspmxcg018 of this vr technical spec_xcg.
	*
	* @return the bbktspmxcg018 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBKTSPMXCG018() {
		return _vrTechnicalSpec_XCG.getBBKTSPMXCG018();
	}

	/**
	* Returns the bbktspmxcg019 of this vr technical spec_xcg.
	*
	* @return the bbktspmxcg019 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBKTSPMXCG019() {
		return _vrTechnicalSpec_XCG.getBBKTSPMXCG019();
	}

	/**
	* Returns the bbktspmxcg020 of this vr technical spec_xcg.
	*
	* @return the bbktspmxcg020 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBKTSPMXCG020() {
		return _vrTechnicalSpec_XCG.getBBKTSPMXCG020();
	}

	/**
	* Returns the bbktspmxcg021 of this vr technical spec_xcg.
	*
	* @return the bbktspmxcg021 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBKTSPMXCG021() {
		return _vrTechnicalSpec_XCG.getBBKTSPMXCG021();
	}

	/**
	* Returns the bbktspmxcg022 of this vr technical spec_xcg.
	*
	* @return the bbktspmxcg022 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBKTSPMXCG022() {
		return _vrTechnicalSpec_XCG.getBBKTSPMXCG022();
	}

	/**
	* Returns the bbktspmxcg023 of this vr technical spec_xcg.
	*
	* @return the bbktspmxcg023 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBKTSPMXCG023() {
		return _vrTechnicalSpec_XCG.getBBKTSPMXCG023();
	}

	/**
	* Returns the bbktspmxcg024 of this vr technical spec_xcg.
	*
	* @return the bbktspmxcg024 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBKTSPMXCG024() {
		return _vrTechnicalSpec_XCG.getBBKTSPMXCG024();
	}

	/**
	* Returns the bbktspmxcg025 of this vr technical spec_xcg.
	*
	* @return the bbktspmxcg025 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getBBKTSPMXCG025() {
		return _vrTechnicalSpec_XCG.getBBKTSPMXCG025();
	}

	/**
	* Returns the deliverable code of this vr technical spec_xcg.
	*
	* @return the deliverable code of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getDeliverableCode() {
		return _vrTechnicalSpec_XCG.getDeliverableCode();
	}

	/**
	* Returns the dossier ID ctn of this vr technical spec_xcg.
	*
	* @return the dossier ID ctn of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getDossierIdCTN() {
		return _vrTechnicalSpec_XCG.getDossierIdCTN();
	}

	/**
	* Returns the dossier no of this vr technical spec_xcg.
	*
	* @return the dossier no of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getDossierNo() {
		return _vrTechnicalSpec_XCG.getDossierNo();
	}

	/**
	* Returns the loai_dong_co of this vr technical spec_xcg.
	*
	* @return the loai_dong_co of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getLoai_dong_co() {
		return _vrTechnicalSpec_XCG.getLoai_dong_co();
	}

	/**
	* Returns the reference uid of this vr technical spec_xcg.
	*
	* @return the reference uid of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getReferenceUid() {
		return _vrTechnicalSpec_XCG.getReferenceUid();
	}

	/**
	* Returns the tdtkxcg001 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg001 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG001() {
		return _vrTechnicalSpec_XCG.getTDTKXCG001();
	}

	/**
	* Returns the tdtkxcg002 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg002 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG002() {
		return _vrTechnicalSpec_XCG.getTDTKXCG002();
	}

	/**
	* Returns the tdtkxcg003 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg003 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG003() {
		return _vrTechnicalSpec_XCG.getTDTKXCG003();
	}

	/**
	* Returns the tdtkxcg004 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg004 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG004() {
		return _vrTechnicalSpec_XCG.getTDTKXCG004();
	}

	/**
	* Returns the tdtkxcg005 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg005 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG005() {
		return _vrTechnicalSpec_XCG.getTDTKXCG005();
	}

	/**
	* Returns the tdtkxcg006 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg006 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG006() {
		return _vrTechnicalSpec_XCG.getTDTKXCG006();
	}

	/**
	* Returns the tdtkxcg007 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg007 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG007() {
		return _vrTechnicalSpec_XCG.getTDTKXCG007();
	}

	/**
	* Returns the tdtkxcg008 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg008 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG008() {
		return _vrTechnicalSpec_XCG.getTDTKXCG008();
	}

	/**
	* Returns the tdtkxcg009 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg009 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG009() {
		return _vrTechnicalSpec_XCG.getTDTKXCG009();
	}

	/**
	* Returns the tdtkxcg010 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg010 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG010() {
		return _vrTechnicalSpec_XCG.getTDTKXCG010();
	}

	/**
	* Returns the tdtkxcg011 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg011 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG011() {
		return _vrTechnicalSpec_XCG.getTDTKXCG011();
	}

	/**
	* Returns the tdtkxcg012 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg012 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG012() {
		return _vrTechnicalSpec_XCG.getTDTKXCG012();
	}

	/**
	* Returns the tdtkxcg013 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg013 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG013() {
		return _vrTechnicalSpec_XCG.getTDTKXCG013();
	}

	/**
	* Returns the tdtkxcg014 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg014 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG014() {
		return _vrTechnicalSpec_XCG.getTDTKXCG014();
	}

	/**
	* Returns the tdtkxcg015 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg015 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG015() {
		return _vrTechnicalSpec_XCG.getTDTKXCG015();
	}

	/**
	* Returns the tdtkxcg016 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg016 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG016() {
		return _vrTechnicalSpec_XCG.getTDTKXCG016();
	}

	/**
	* Returns the tdtkxcg017 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg017 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG017() {
		return _vrTechnicalSpec_XCG.getTDTKXCG017();
	}

	/**
	* Returns the tdtkxcg018 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg018 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG018() {
		return _vrTechnicalSpec_XCG.getTDTKXCG018();
	}

	/**
	* Returns the tdtkxcg019 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg019 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG019() {
		return _vrTechnicalSpec_XCG.getTDTKXCG019();
	}

	/**
	* Returns the tdtkxcg020 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg020 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG020() {
		return _vrTechnicalSpec_XCG.getTDTKXCG020();
	}

	/**
	* Returns the tdtkxcg021 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg021 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG021() {
		return _vrTechnicalSpec_XCG.getTDTKXCG021();
	}

	/**
	* Returns the tdtkxcg022 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg022 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG022() {
		return _vrTechnicalSpec_XCG.getTDTKXCG022();
	}

	/**
	* Returns the tdtkxcg023 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg023 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG023() {
		return _vrTechnicalSpec_XCG.getTDTKXCG023();
	}

	/**
	* Returns the tdtkxcg024 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg024 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG024() {
		return _vrTechnicalSpec_XCG.getTDTKXCG024();
	}

	/**
	* Returns the tdtkxcg025 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg025 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG025() {
		return _vrTechnicalSpec_XCG.getTDTKXCG025();
	}

	/**
	* Returns the tdtkxcg026 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg026 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG026() {
		return _vrTechnicalSpec_XCG.getTDTKXCG026();
	}

	/**
	* Returns the tdtkxcg027 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg027 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG027() {
		return _vrTechnicalSpec_XCG.getTDTKXCG027();
	}

	/**
	* Returns the tdtkxcg028 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg028 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG028() {
		return _vrTechnicalSpec_XCG.getTDTKXCG028();
	}

	/**
	* Returns the tdtkxcg029 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg029 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG029() {
		return _vrTechnicalSpec_XCG.getTDTKXCG029();
	}

	/**
	* Returns the tdtkxcg030 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg030 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG030() {
		return _vrTechnicalSpec_XCG.getTDTKXCG030();
	}

	/**
	* Returns the tdtkxcg031 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg031 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG031() {
		return _vrTechnicalSpec_XCG.getTDTKXCG031();
	}

	/**
	* Returns the tdtkxcg032 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg032 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG032() {
		return _vrTechnicalSpec_XCG.getTDTKXCG032();
	}

	/**
	* Returns the tdtkxcg033 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg033 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG033() {
		return _vrTechnicalSpec_XCG.getTDTKXCG033();
	}

	/**
	* Returns the tdtkxcg034 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg034 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG034() {
		return _vrTechnicalSpec_XCG.getTDTKXCG034();
	}

	/**
	* Returns the tdtkxcg035 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg035 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG035() {
		return _vrTechnicalSpec_XCG.getTDTKXCG035();
	}

	/**
	* Returns the tdtkxcg036 of this vr technical spec_xcg.
	*
	* @return the tdtkxcg036 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getTDTKXCG036() {
		return _vrTechnicalSpec_XCG.getTDTKXCG036();
	}

	/**
	* Returns the xcg01001 of this vr technical spec_xcg.
	*
	* @return the xcg01001 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01001() {
		return _vrTechnicalSpec_XCG.getXCG01001();
	}

	/**
	* Returns the xcg01002 of this vr technical spec_xcg.
	*
	* @return the xcg01002 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01002() {
		return _vrTechnicalSpec_XCG.getXCG01002();
	}

	/**
	* Returns the xcg01003 of this vr technical spec_xcg.
	*
	* @return the xcg01003 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01003() {
		return _vrTechnicalSpec_XCG.getXCG01003();
	}

	/**
	* Returns the xcg01004 of this vr technical spec_xcg.
	*
	* @return the xcg01004 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01004() {
		return _vrTechnicalSpec_XCG.getXCG01004();
	}

	/**
	* Returns the xcg01005 of this vr technical spec_xcg.
	*
	* @return the xcg01005 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01005() {
		return _vrTechnicalSpec_XCG.getXCG01005();
	}

	/**
	* Returns the xcg01006 of this vr technical spec_xcg.
	*
	* @return the xcg01006 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01006() {
		return _vrTechnicalSpec_XCG.getXCG01006();
	}

	/**
	* Returns the xcg01007 of this vr technical spec_xcg.
	*
	* @return the xcg01007 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01007() {
		return _vrTechnicalSpec_XCG.getXCG01007();
	}

	/**
	* Returns the xcg01008 of this vr technical spec_xcg.
	*
	* @return the xcg01008 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01008() {
		return _vrTechnicalSpec_XCG.getXCG01008();
	}

	/**
	* Returns the xcg01009 of this vr technical spec_xcg.
	*
	* @return the xcg01009 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01009() {
		return _vrTechnicalSpec_XCG.getXCG01009();
	}

	/**
	* Returns the xcg01010 of this vr technical spec_xcg.
	*
	* @return the xcg01010 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01010() {
		return _vrTechnicalSpec_XCG.getXCG01010();
	}

	/**
	* Returns the xcg01011 of this vr technical spec_xcg.
	*
	* @return the xcg01011 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01011() {
		return _vrTechnicalSpec_XCG.getXCG01011();
	}

	/**
	* Returns the xcg01012 of this vr technical spec_xcg.
	*
	* @return the xcg01012 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01012() {
		return _vrTechnicalSpec_XCG.getXCG01012();
	}

	/**
	* Returns the xcg01013 of this vr technical spec_xcg.
	*
	* @return the xcg01013 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01013() {
		return _vrTechnicalSpec_XCG.getXCG01013();
	}

	/**
	* Returns the xcg01014 of this vr technical spec_xcg.
	*
	* @return the xcg01014 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01014() {
		return _vrTechnicalSpec_XCG.getXCG01014();
	}

	/**
	* Returns the xcg01016 of this vr technical spec_xcg.
	*
	* @return the xcg01016 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01016() {
		return _vrTechnicalSpec_XCG.getXCG01016();
	}

	/**
	* Returns the xcg01017 of this vr technical spec_xcg.
	*
	* @return the xcg01017 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01017() {
		return _vrTechnicalSpec_XCG.getXCG01017();
	}

	/**
	* Returns the xcg01019 of this vr technical spec_xcg.
	*
	* @return the xcg01019 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01019() {
		return _vrTechnicalSpec_XCG.getXCG01019();
	}

	/**
	* Returns the xcg01020 of this vr technical spec_xcg.
	*
	* @return the xcg01020 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01020() {
		return _vrTechnicalSpec_XCG.getXCG01020();
	}

	/**
	* Returns the xcg01021 of this vr technical spec_xcg.
	*
	* @return the xcg01021 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01021() {
		return _vrTechnicalSpec_XCG.getXCG01021();
	}

	/**
	* Returns the xcg01022 of this vr technical spec_xcg.
	*
	* @return the xcg01022 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01022() {
		return _vrTechnicalSpec_XCG.getXCG01022();
	}

	/**
	* Returns the xcg01024 of this vr technical spec_xcg.
	*
	* @return the xcg01024 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01024() {
		return _vrTechnicalSpec_XCG.getXCG01024();
	}

	/**
	* Returns the xcg01025 of this vr technical spec_xcg.
	*
	* @return the xcg01025 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01025() {
		return _vrTechnicalSpec_XCG.getXCG01025();
	}

	/**
	* Returns the xcg01026 of this vr technical spec_xcg.
	*
	* @return the xcg01026 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01026() {
		return _vrTechnicalSpec_XCG.getXCG01026();
	}

	/**
	* Returns the xcg01027 of this vr technical spec_xcg.
	*
	* @return the xcg01027 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01027() {
		return _vrTechnicalSpec_XCG.getXCG01027();
	}

	/**
	* Returns the xcg01028 of this vr technical spec_xcg.
	*
	* @return the xcg01028 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01028() {
		return _vrTechnicalSpec_XCG.getXCG01028();
	}

	/**
	* Returns the xcg01030 of this vr technical spec_xcg.
	*
	* @return the xcg01030 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01030() {
		return _vrTechnicalSpec_XCG.getXCG01030();
	}

	/**
	* Returns the xcg01031 of this vr technical spec_xcg.
	*
	* @return the xcg01031 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01031() {
		return _vrTechnicalSpec_XCG.getXCG01031();
	}

	/**
	* Returns the xcg01032 of this vr technical spec_xcg.
	*
	* @return the xcg01032 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01032() {
		return _vrTechnicalSpec_XCG.getXCG01032();
	}

	/**
	* Returns the xcg01033 of this vr technical spec_xcg.
	*
	* @return the xcg01033 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01033() {
		return _vrTechnicalSpec_XCG.getXCG01033();
	}

	/**
	* Returns the xcg01034 of this vr technical spec_xcg.
	*
	* @return the xcg01034 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01034() {
		return _vrTechnicalSpec_XCG.getXCG01034();
	}

	/**
	* Returns the xcg01035 of this vr technical spec_xcg.
	*
	* @return the xcg01035 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01035() {
		return _vrTechnicalSpec_XCG.getXCG01035();
	}

	/**
	* Returns the xcg01036 of this vr technical spec_xcg.
	*
	* @return the xcg01036 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01036() {
		return _vrTechnicalSpec_XCG.getXCG01036();
	}

	/**
	* Returns the xcg01037 of this vr technical spec_xcg.
	*
	* @return the xcg01037 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01037() {
		return _vrTechnicalSpec_XCG.getXCG01037();
	}

	/**
	* Returns the xcg01038 of this vr technical spec_xcg.
	*
	* @return the xcg01038 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01038() {
		return _vrTechnicalSpec_XCG.getXCG01038();
	}

	/**
	* Returns the xcg01039 of this vr technical spec_xcg.
	*
	* @return the xcg01039 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01039() {
		return _vrTechnicalSpec_XCG.getXCG01039();
	}

	/**
	* Returns the xcg01040 of this vr technical spec_xcg.
	*
	* @return the xcg01040 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01040() {
		return _vrTechnicalSpec_XCG.getXCG01040();
	}

	/**
	* Returns the xcg01041 of this vr technical spec_xcg.
	*
	* @return the xcg01041 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01041() {
		return _vrTechnicalSpec_XCG.getXCG01041();
	}

	/**
	* Returns the xcg01042 of this vr technical spec_xcg.
	*
	* @return the xcg01042 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01042() {
		return _vrTechnicalSpec_XCG.getXCG01042();
	}

	/**
	* Returns the xcg01043 of this vr technical spec_xcg.
	*
	* @return the xcg01043 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01043() {
		return _vrTechnicalSpec_XCG.getXCG01043();
	}

	/**
	* Returns the xcg01044 of this vr technical spec_xcg.
	*
	* @return the xcg01044 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01044() {
		return _vrTechnicalSpec_XCG.getXCG01044();
	}

	/**
	* Returns the xcg01045 of this vr technical spec_xcg.
	*
	* @return the xcg01045 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01045() {
		return _vrTechnicalSpec_XCG.getXCG01045();
	}

	/**
	* Returns the xcg01046 of this vr technical spec_xcg.
	*
	* @return the xcg01046 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01046() {
		return _vrTechnicalSpec_XCG.getXCG01046();
	}

	/**
	* Returns the xcg01047 of this vr technical spec_xcg.
	*
	* @return the xcg01047 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01047() {
		return _vrTechnicalSpec_XCG.getXCG01047();
	}

	/**
	* Returns the xcg01049 of this vr technical spec_xcg.
	*
	* @return the xcg01049 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01049() {
		return _vrTechnicalSpec_XCG.getXCG01049();
	}

	/**
	* Returns the xcg01050 of this vr technical spec_xcg.
	*
	* @return the xcg01050 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01050() {
		return _vrTechnicalSpec_XCG.getXCG01050();
	}

	/**
	* Returns the xcg01051 of this vr technical spec_xcg.
	*
	* @return the xcg01051 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01051() {
		return _vrTechnicalSpec_XCG.getXCG01051();
	}

	/**
	* Returns the xcg01052 of this vr technical spec_xcg.
	*
	* @return the xcg01052 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01052() {
		return _vrTechnicalSpec_XCG.getXCG01052();
	}

	/**
	* Returns the xcg01053 of this vr technical spec_xcg.
	*
	* @return the xcg01053 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01053() {
		return _vrTechnicalSpec_XCG.getXCG01053();
	}

	/**
	* Returns the xcg01054 of this vr technical spec_xcg.
	*
	* @return the xcg01054 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01054() {
		return _vrTechnicalSpec_XCG.getXCG01054();
	}

	/**
	* Returns the xcg01055 of this vr technical spec_xcg.
	*
	* @return the xcg01055 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01055() {
		return _vrTechnicalSpec_XCG.getXCG01055();
	}

	/**
	* Returns the xcg01056 of this vr technical spec_xcg.
	*
	* @return the xcg01056 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01056() {
		return _vrTechnicalSpec_XCG.getXCG01056();
	}

	/**
	* Returns the xcg01057 of this vr technical spec_xcg.
	*
	* @return the xcg01057 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01057() {
		return _vrTechnicalSpec_XCG.getXCG01057();
	}

	/**
	* Returns the xcg01058 of this vr technical spec_xcg.
	*
	* @return the xcg01058 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01058() {
		return _vrTechnicalSpec_XCG.getXCG01058();
	}

	/**
	* Returns the xcg01059 of this vr technical spec_xcg.
	*
	* @return the xcg01059 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01059() {
		return _vrTechnicalSpec_XCG.getXCG01059();
	}

	/**
	* Returns the xcg01060 of this vr technical spec_xcg.
	*
	* @return the xcg01060 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01060() {
		return _vrTechnicalSpec_XCG.getXCG01060();
	}

	/**
	* Returns the xcg01062 of this vr technical spec_xcg.
	*
	* @return the xcg01062 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01062() {
		return _vrTechnicalSpec_XCG.getXCG01062();
	}

	/**
	* Returns the xcg01063 of this vr technical spec_xcg.
	*
	* @return the xcg01063 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01063() {
		return _vrTechnicalSpec_XCG.getXCG01063();
	}

	/**
	* Returns the xcg01064 of this vr technical spec_xcg.
	*
	* @return the xcg01064 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01064() {
		return _vrTechnicalSpec_XCG.getXCG01064();
	}

	/**
	* Returns the xcg01065 of this vr technical spec_xcg.
	*
	* @return the xcg01065 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01065() {
		return _vrTechnicalSpec_XCG.getXCG01065();
	}

	/**
	* Returns the xcg01066 of this vr technical spec_xcg.
	*
	* @return the xcg01066 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01066() {
		return _vrTechnicalSpec_XCG.getXCG01066();
	}

	/**
	* Returns the xcg01067 of this vr technical spec_xcg.
	*
	* @return the xcg01067 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01067() {
		return _vrTechnicalSpec_XCG.getXCG01067();
	}

	/**
	* Returns the xcg01068 of this vr technical spec_xcg.
	*
	* @return the xcg01068 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01068() {
		return _vrTechnicalSpec_XCG.getXCG01068();
	}

	/**
	* Returns the xcg01069 of this vr technical spec_xcg.
	*
	* @return the xcg01069 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01069() {
		return _vrTechnicalSpec_XCG.getXCG01069();
	}

	/**
	* Returns the xcg01070 of this vr technical spec_xcg.
	*
	* @return the xcg01070 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01070() {
		return _vrTechnicalSpec_XCG.getXCG01070();
	}

	/**
	* Returns the xcg01072 of this vr technical spec_xcg.
	*
	* @return the xcg01072 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01072() {
		return _vrTechnicalSpec_XCG.getXCG01072();
	}

	/**
	* Returns the xcg01073 of this vr technical spec_xcg.
	*
	* @return the xcg01073 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01073() {
		return _vrTechnicalSpec_XCG.getXCG01073();
	}

	/**
	* Returns the xcg01074 of this vr technical spec_xcg.
	*
	* @return the xcg01074 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01074() {
		return _vrTechnicalSpec_XCG.getXCG01074();
	}

	/**
	* Returns the xcg01075 of this vr technical spec_xcg.
	*
	* @return the xcg01075 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01075() {
		return _vrTechnicalSpec_XCG.getXCG01075();
	}

	/**
	* Returns the xcg01076 of this vr technical spec_xcg.
	*
	* @return the xcg01076 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01076() {
		return _vrTechnicalSpec_XCG.getXCG01076();
	}

	/**
	* Returns the xcg01077 of this vr technical spec_xcg.
	*
	* @return the xcg01077 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01077() {
		return _vrTechnicalSpec_XCG.getXCG01077();
	}

	/**
	* Returns the xcg01078 of this vr technical spec_xcg.
	*
	* @return the xcg01078 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01078() {
		return _vrTechnicalSpec_XCG.getXCG01078();
	}

	/**
	* Returns the xcg01079 of this vr technical spec_xcg.
	*
	* @return the xcg01079 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01079() {
		return _vrTechnicalSpec_XCG.getXCG01079();
	}

	/**
	* Returns the xcg01080 of this vr technical spec_xcg.
	*
	* @return the xcg01080 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01080() {
		return _vrTechnicalSpec_XCG.getXCG01080();
	}

	/**
	* Returns the xcg01081 of this vr technical spec_xcg.
	*
	* @return the xcg01081 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01081() {
		return _vrTechnicalSpec_XCG.getXCG01081();
	}

	/**
	* Returns the xcg01082 of this vr technical spec_xcg.
	*
	* @return the xcg01082 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01082() {
		return _vrTechnicalSpec_XCG.getXCG01082();
	}

	/**
	* Returns the xcg01083 of this vr technical spec_xcg.
	*
	* @return the xcg01083 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01083() {
		return _vrTechnicalSpec_XCG.getXCG01083();
	}

	/**
	* Returns the xcg01084 of this vr technical spec_xcg.
	*
	* @return the xcg01084 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01084() {
		return _vrTechnicalSpec_XCG.getXCG01084();
	}

	/**
	* Returns the xcg01085 of this vr technical spec_xcg.
	*
	* @return the xcg01085 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01085() {
		return _vrTechnicalSpec_XCG.getXCG01085();
	}

	/**
	* Returns the xcg01086 of this vr technical spec_xcg.
	*
	* @return the xcg01086 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01086() {
		return _vrTechnicalSpec_XCG.getXCG01086();
	}

	/**
	* Returns the xcg01087 of this vr technical spec_xcg.
	*
	* @return the xcg01087 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01087() {
		return _vrTechnicalSpec_XCG.getXCG01087();
	}

	/**
	* Returns the xcg01088 of this vr technical spec_xcg.
	*
	* @return the xcg01088 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01088() {
		return _vrTechnicalSpec_XCG.getXCG01088();
	}

	/**
	* Returns the xcg01089 of this vr technical spec_xcg.
	*
	* @return the xcg01089 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01089() {
		return _vrTechnicalSpec_XCG.getXCG01089();
	}

	/**
	* Returns the xcg01090 of this vr technical spec_xcg.
	*
	* @return the xcg01090 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01090() {
		return _vrTechnicalSpec_XCG.getXCG01090();
	}

	/**
	* Returns the xcg01091 of this vr technical spec_xcg.
	*
	* @return the xcg01091 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01091() {
		return _vrTechnicalSpec_XCG.getXCG01091();
	}

	/**
	* Returns the xcg01092 of this vr technical spec_xcg.
	*
	* @return the xcg01092 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01092() {
		return _vrTechnicalSpec_XCG.getXCG01092();
	}

	/**
	* Returns the xcg01093 of this vr technical spec_xcg.
	*
	* @return the xcg01093 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01093() {
		return _vrTechnicalSpec_XCG.getXCG01093();
	}

	/**
	* Returns the xcg01094 of this vr technical spec_xcg.
	*
	* @return the xcg01094 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01094() {
		return _vrTechnicalSpec_XCG.getXCG01094();
	}

	/**
	* Returns the xcg01095 of this vr technical spec_xcg.
	*
	* @return the xcg01095 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01095() {
		return _vrTechnicalSpec_XCG.getXCG01095();
	}

	/**
	* Returns the xcg01096 of this vr technical spec_xcg.
	*
	* @return the xcg01096 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01096() {
		return _vrTechnicalSpec_XCG.getXCG01096();
	}

	/**
	* Returns the xcg01097 of this vr technical spec_xcg.
	*
	* @return the xcg01097 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01097() {
		return _vrTechnicalSpec_XCG.getXCG01097();
	}

	/**
	* Returns the xcg01098 of this vr technical spec_xcg.
	*
	* @return the xcg01098 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01098() {
		return _vrTechnicalSpec_XCG.getXCG01098();
	}

	/**
	* Returns the xcg01099 of this vr technical spec_xcg.
	*
	* @return the xcg01099 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01099() {
		return _vrTechnicalSpec_XCG.getXCG01099();
	}

	/**
	* Returns the xcg01100 of this vr technical spec_xcg.
	*
	* @return the xcg01100 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01100() {
		return _vrTechnicalSpec_XCG.getXCG01100();
	}

	/**
	* Returns the xcg01101 of this vr technical spec_xcg.
	*
	* @return the xcg01101 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01101() {
		return _vrTechnicalSpec_XCG.getXCG01101();
	}

	/**
	* Returns the xcg01102 of this vr technical spec_xcg.
	*
	* @return the xcg01102 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01102() {
		return _vrTechnicalSpec_XCG.getXCG01102();
	}

	/**
	* Returns the xcg01103 of this vr technical spec_xcg.
	*
	* @return the xcg01103 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01103() {
		return _vrTechnicalSpec_XCG.getXCG01103();
	}

	/**
	* Returns the xcg01104 of this vr technical spec_xcg.
	*
	* @return the xcg01104 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01104() {
		return _vrTechnicalSpec_XCG.getXCG01104();
	}

	/**
	* Returns the xcg01105 of this vr technical spec_xcg.
	*
	* @return the xcg01105 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01105() {
		return _vrTechnicalSpec_XCG.getXCG01105();
	}

	/**
	* Returns the xcg01106 of this vr technical spec_xcg.
	*
	* @return the xcg01106 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01106() {
		return _vrTechnicalSpec_XCG.getXCG01106();
	}

	/**
	* Returns the xcg01107 of this vr technical spec_xcg.
	*
	* @return the xcg01107 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01107() {
		return _vrTechnicalSpec_XCG.getXCG01107();
	}

	/**
	* Returns the xcg01108 of this vr technical spec_xcg.
	*
	* @return the xcg01108 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01108() {
		return _vrTechnicalSpec_XCG.getXCG01108();
	}

	/**
	* Returns the xcg01109 of this vr technical spec_xcg.
	*
	* @return the xcg01109 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01109() {
		return _vrTechnicalSpec_XCG.getXCG01109();
	}

	/**
	* Returns the xcg01110 of this vr technical spec_xcg.
	*
	* @return the xcg01110 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01110() {
		return _vrTechnicalSpec_XCG.getXCG01110();
	}

	/**
	* Returns the xcg01111 of this vr technical spec_xcg.
	*
	* @return the xcg01111 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01111() {
		return _vrTechnicalSpec_XCG.getXCG01111();
	}

	/**
	* Returns the xcg01112 of this vr technical spec_xcg.
	*
	* @return the xcg01112 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01112() {
		return _vrTechnicalSpec_XCG.getXCG01112();
	}

	/**
	* Returns the xcg01113 of this vr technical spec_xcg.
	*
	* @return the xcg01113 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01113() {
		return _vrTechnicalSpec_XCG.getXCG01113();
	}

	/**
	* Returns the xcg01114 of this vr technical spec_xcg.
	*
	* @return the xcg01114 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01114() {
		return _vrTechnicalSpec_XCG.getXCG01114();
	}

	/**
	* Returns the xcg01115 of this vr technical spec_xcg.
	*
	* @return the xcg01115 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01115() {
		return _vrTechnicalSpec_XCG.getXCG01115();
	}

	/**
	* Returns the xcg01116 of this vr technical spec_xcg.
	*
	* @return the xcg01116 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01116() {
		return _vrTechnicalSpec_XCG.getXCG01116();
	}

	/**
	* Returns the xcg01117 of this vr technical spec_xcg.
	*
	* @return the xcg01117 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01117() {
		return _vrTechnicalSpec_XCG.getXCG01117();
	}

	/**
	* Returns the xcg01118 of this vr technical spec_xcg.
	*
	* @return the xcg01118 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01118() {
		return _vrTechnicalSpec_XCG.getXCG01118();
	}

	/**
	* Returns the xcg01119 of this vr technical spec_xcg.
	*
	* @return the xcg01119 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01119() {
		return _vrTechnicalSpec_XCG.getXCG01119();
	}

	/**
	* Returns the xcg01120 of this vr technical spec_xcg.
	*
	* @return the xcg01120 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01120() {
		return _vrTechnicalSpec_XCG.getXCG01120();
	}

	/**
	* Returns the xcg01121 of this vr technical spec_xcg.
	*
	* @return the xcg01121 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01121() {
		return _vrTechnicalSpec_XCG.getXCG01121();
	}

	/**
	* Returns the xcg01122 of this vr technical spec_xcg.
	*
	* @return the xcg01122 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01122() {
		return _vrTechnicalSpec_XCG.getXCG01122();
	}

	/**
	* Returns the xcg01123 of this vr technical spec_xcg.
	*
	* @return the xcg01123 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01123() {
		return _vrTechnicalSpec_XCG.getXCG01123();
	}

	/**
	* Returns the xcg01124 of this vr technical spec_xcg.
	*
	* @return the xcg01124 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01124() {
		return _vrTechnicalSpec_XCG.getXCG01124();
	}

	/**
	* Returns the xcg01125 of this vr technical spec_xcg.
	*
	* @return the xcg01125 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01125() {
		return _vrTechnicalSpec_XCG.getXCG01125();
	}

	/**
	* Returns the xcg01126 of this vr technical spec_xcg.
	*
	* @return the xcg01126 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01126() {
		return _vrTechnicalSpec_XCG.getXCG01126();
	}

	/**
	* Returns the xcg01127 of this vr technical spec_xcg.
	*
	* @return the xcg01127 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01127() {
		return _vrTechnicalSpec_XCG.getXCG01127();
	}

	/**
	* Returns the xcg01128 of this vr technical spec_xcg.
	*
	* @return the xcg01128 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01128() {
		return _vrTechnicalSpec_XCG.getXCG01128();
	}

	/**
	* Returns the xcg01129 of this vr technical spec_xcg.
	*
	* @return the xcg01129 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01129() {
		return _vrTechnicalSpec_XCG.getXCG01129();
	}

	/**
	* Returns the xcg01130 of this vr technical spec_xcg.
	*
	* @return the xcg01130 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01130() {
		return _vrTechnicalSpec_XCG.getXCG01130();
	}

	/**
	* Returns the xcg01131 of this vr technical spec_xcg.
	*
	* @return the xcg01131 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01131() {
		return _vrTechnicalSpec_XCG.getXCG01131();
	}

	/**
	* Returns the xcg01132 of this vr technical spec_xcg.
	*
	* @return the xcg01132 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01132() {
		return _vrTechnicalSpec_XCG.getXCG01132();
	}

	/**
	* Returns the xcg01133 of this vr technical spec_xcg.
	*
	* @return the xcg01133 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01133() {
		return _vrTechnicalSpec_XCG.getXCG01133();
	}

	/**
	* Returns the xcg01134 of this vr technical spec_xcg.
	*
	* @return the xcg01134 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01134() {
		return _vrTechnicalSpec_XCG.getXCG01134();
	}

	/**
	* Returns the xcg01135 of this vr technical spec_xcg.
	*
	* @return the xcg01135 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01135() {
		return _vrTechnicalSpec_XCG.getXCG01135();
	}

	/**
	* Returns the xcg01136 of this vr technical spec_xcg.
	*
	* @return the xcg01136 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01136() {
		return _vrTechnicalSpec_XCG.getXCG01136();
	}

	/**
	* Returns the xcg01137 of this vr technical spec_xcg.
	*
	* @return the xcg01137 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01137() {
		return _vrTechnicalSpec_XCG.getXCG01137();
	}

	/**
	* Returns the xcg01138 of this vr technical spec_xcg.
	*
	* @return the xcg01138 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01138() {
		return _vrTechnicalSpec_XCG.getXCG01138();
	}

	/**
	* Returns the xcg01139 of this vr technical spec_xcg.
	*
	* @return the xcg01139 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01139() {
		return _vrTechnicalSpec_XCG.getXCG01139();
	}

	/**
	* Returns the xcg01140 of this vr technical spec_xcg.
	*
	* @return the xcg01140 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01140() {
		return _vrTechnicalSpec_XCG.getXCG01140();
	}

	/**
	* Returns the xcg01141 of this vr technical spec_xcg.
	*
	* @return the xcg01141 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01141() {
		return _vrTechnicalSpec_XCG.getXCG01141();
	}

	/**
	* Returns the xcg01142 of this vr technical spec_xcg.
	*
	* @return the xcg01142 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01142() {
		return _vrTechnicalSpec_XCG.getXCG01142();
	}

	/**
	* Returns the xcg01143 of this vr technical spec_xcg.
	*
	* @return the xcg01143 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01143() {
		return _vrTechnicalSpec_XCG.getXCG01143();
	}

	/**
	* Returns the xcg01144 of this vr technical spec_xcg.
	*
	* @return the xcg01144 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01144() {
		return _vrTechnicalSpec_XCG.getXCG01144();
	}

	/**
	* Returns the xcg01145 of this vr technical spec_xcg.
	*
	* @return the xcg01145 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01145() {
		return _vrTechnicalSpec_XCG.getXCG01145();
	}

	/**
	* Returns the xcg01146 of this vr technical spec_xcg.
	*
	* @return the xcg01146 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01146() {
		return _vrTechnicalSpec_XCG.getXCG01146();
	}

	/**
	* Returns the xcg01147 of this vr technical spec_xcg.
	*
	* @return the xcg01147 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01147() {
		return _vrTechnicalSpec_XCG.getXCG01147();
	}

	/**
	* Returns the xcg01148 of this vr technical spec_xcg.
	*
	* @return the xcg01148 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01148() {
		return _vrTechnicalSpec_XCG.getXCG01148();
	}

	/**
	* Returns the xcg01149 of this vr technical spec_xcg.
	*
	* @return the xcg01149 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01149() {
		return _vrTechnicalSpec_XCG.getXCG01149();
	}

	/**
	* Returns the xcg01150 of this vr technical spec_xcg.
	*
	* @return the xcg01150 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01150() {
		return _vrTechnicalSpec_XCG.getXCG01150();
	}

	/**
	* Returns the xcg01151 of this vr technical spec_xcg.
	*
	* @return the xcg01151 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01151() {
		return _vrTechnicalSpec_XCG.getXCG01151();
	}

	/**
	* Returns the xcg01152 of this vr technical spec_xcg.
	*
	* @return the xcg01152 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01152() {
		return _vrTechnicalSpec_XCG.getXCG01152();
	}

	/**
	* Returns the xcg01153 of this vr technical spec_xcg.
	*
	* @return the xcg01153 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01153() {
		return _vrTechnicalSpec_XCG.getXCG01153();
	}

	/**
	* Returns the xcg01154 of this vr technical spec_xcg.
	*
	* @return the xcg01154 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01154() {
		return _vrTechnicalSpec_XCG.getXCG01154();
	}

	/**
	* Returns the xcg01155 of this vr technical spec_xcg.
	*
	* @return the xcg01155 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01155() {
		return _vrTechnicalSpec_XCG.getXCG01155();
	}

	/**
	* Returns the xcg01156 of this vr technical spec_xcg.
	*
	* @return the xcg01156 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01156() {
		return _vrTechnicalSpec_XCG.getXCG01156();
	}

	/**
	* Returns the xcg01157 of this vr technical spec_xcg.
	*
	* @return the xcg01157 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01157() {
		return _vrTechnicalSpec_XCG.getXCG01157();
	}

	/**
	* Returns the xcg01158 of this vr technical spec_xcg.
	*
	* @return the xcg01158 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01158() {
		return _vrTechnicalSpec_XCG.getXCG01158();
	}

	/**
	* Returns the xcg01159 of this vr technical spec_xcg.
	*
	* @return the xcg01159 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01159() {
		return _vrTechnicalSpec_XCG.getXCG01159();
	}

	/**
	* Returns the xcg01160 of this vr technical spec_xcg.
	*
	* @return the xcg01160 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01160() {
		return _vrTechnicalSpec_XCG.getXCG01160();
	}

	/**
	* Returns the xcg01161 of this vr technical spec_xcg.
	*
	* @return the xcg01161 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01161() {
		return _vrTechnicalSpec_XCG.getXCG01161();
	}

	/**
	* Returns the xcg01162 of this vr technical spec_xcg.
	*
	* @return the xcg01162 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01162() {
		return _vrTechnicalSpec_XCG.getXCG01162();
	}

	/**
	* Returns the xcg01163 of this vr technical spec_xcg.
	*
	* @return the xcg01163 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01163() {
		return _vrTechnicalSpec_XCG.getXCG01163();
	}

	/**
	* Returns the xcg01164 of this vr technical spec_xcg.
	*
	* @return the xcg01164 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01164() {
		return _vrTechnicalSpec_XCG.getXCG01164();
	}

	/**
	* Returns the xcg01165 of this vr technical spec_xcg.
	*
	* @return the xcg01165 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01165() {
		return _vrTechnicalSpec_XCG.getXCG01165();
	}

	/**
	* Returns the xcg01166 of this vr technical spec_xcg.
	*
	* @return the xcg01166 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01166() {
		return _vrTechnicalSpec_XCG.getXCG01166();
	}

	/**
	* Returns the xcg01167 of this vr technical spec_xcg.
	*
	* @return the xcg01167 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01167() {
		return _vrTechnicalSpec_XCG.getXCG01167();
	}

	/**
	* Returns the xcg01169 of this vr technical spec_xcg.
	*
	* @return the xcg01169 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01169() {
		return _vrTechnicalSpec_XCG.getXCG01169();
	}

	/**
	* Returns the xcg01170 of this vr technical spec_xcg.
	*
	* @return the xcg01170 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01170() {
		return _vrTechnicalSpec_XCG.getXCG01170();
	}

	/**
	* Returns the xcg01171 of this vr technical spec_xcg.
	*
	* @return the xcg01171 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01171() {
		return _vrTechnicalSpec_XCG.getXCG01171();
	}

	/**
	* Returns the xcg01172 of this vr technical spec_xcg.
	*
	* @return the xcg01172 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01172() {
		return _vrTechnicalSpec_XCG.getXCG01172();
	}

	/**
	* Returns the xcg01173 of this vr technical spec_xcg.
	*
	* @return the xcg01173 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01173() {
		return _vrTechnicalSpec_XCG.getXCG01173();
	}

	/**
	* Returns the xcg01174 of this vr technical spec_xcg.
	*
	* @return the xcg01174 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01174() {
		return _vrTechnicalSpec_XCG.getXCG01174();
	}

	/**
	* Returns the xcg01175 of this vr technical spec_xcg.
	*
	* @return the xcg01175 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01175() {
		return _vrTechnicalSpec_XCG.getXCG01175();
	}

	/**
	* Returns the xcg01176 of this vr technical spec_xcg.
	*
	* @return the xcg01176 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01176() {
		return _vrTechnicalSpec_XCG.getXCG01176();
	}

	/**
	* Returns the xcg01177 of this vr technical spec_xcg.
	*
	* @return the xcg01177 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01177() {
		return _vrTechnicalSpec_XCG.getXCG01177();
	}

	/**
	* Returns the xcg01178 of this vr technical spec_xcg.
	*
	* @return the xcg01178 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01178() {
		return _vrTechnicalSpec_XCG.getXCG01178();
	}

	/**
	* Returns the xcg01179 of this vr technical spec_xcg.
	*
	* @return the xcg01179 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01179() {
		return _vrTechnicalSpec_XCG.getXCG01179();
	}

	/**
	* Returns the xcg01180 of this vr technical spec_xcg.
	*
	* @return the xcg01180 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01180() {
		return _vrTechnicalSpec_XCG.getXCG01180();
	}

	/**
	* Returns the xcg01181 of this vr technical spec_xcg.
	*
	* @return the xcg01181 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01181() {
		return _vrTechnicalSpec_XCG.getXCG01181();
	}

	/**
	* Returns the xcg01182 of this vr technical spec_xcg.
	*
	* @return the xcg01182 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01182() {
		return _vrTechnicalSpec_XCG.getXCG01182();
	}

	/**
	* Returns the xcg01183 of this vr technical spec_xcg.
	*
	* @return the xcg01183 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01183() {
		return _vrTechnicalSpec_XCG.getXCG01183();
	}

	/**
	* Returns the xcg01184 of this vr technical spec_xcg.
	*
	* @return the xcg01184 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01184() {
		return _vrTechnicalSpec_XCG.getXCG01184();
	}

	/**
	* Returns the xcg01185 of this vr technical spec_xcg.
	*
	* @return the xcg01185 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01185() {
		return _vrTechnicalSpec_XCG.getXCG01185();
	}

	/**
	* Returns the xcg01186 of this vr technical spec_xcg.
	*
	* @return the xcg01186 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01186() {
		return _vrTechnicalSpec_XCG.getXCG01186();
	}

	/**
	* Returns the xcg01187 of this vr technical spec_xcg.
	*
	* @return the xcg01187 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01187() {
		return _vrTechnicalSpec_XCG.getXCG01187();
	}

	/**
	* Returns the xcg01188 of this vr technical spec_xcg.
	*
	* @return the xcg01188 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01188() {
		return _vrTechnicalSpec_XCG.getXCG01188();
	}

	/**
	* Returns the xcg01189 of this vr technical spec_xcg.
	*
	* @return the xcg01189 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01189() {
		return _vrTechnicalSpec_XCG.getXCG01189();
	}

	/**
	* Returns the xcg01190 of this vr technical spec_xcg.
	*
	* @return the xcg01190 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01190() {
		return _vrTechnicalSpec_XCG.getXCG01190();
	}

	/**
	* Returns the xcg01191 of this vr technical spec_xcg.
	*
	* @return the xcg01191 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01191() {
		return _vrTechnicalSpec_XCG.getXCG01191();
	}

	/**
	* Returns the xcg01192 of this vr technical spec_xcg.
	*
	* @return the xcg01192 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01192() {
		return _vrTechnicalSpec_XCG.getXCG01192();
	}

	/**
	* Returns the xcg01193 of this vr technical spec_xcg.
	*
	* @return the xcg01193 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01193() {
		return _vrTechnicalSpec_XCG.getXCG01193();
	}

	/**
	* Returns the xcg01194 of this vr technical spec_xcg.
	*
	* @return the xcg01194 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01194() {
		return _vrTechnicalSpec_XCG.getXCG01194();
	}

	/**
	* Returns the xcg01195 of this vr technical spec_xcg.
	*
	* @return the xcg01195 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01195() {
		return _vrTechnicalSpec_XCG.getXCG01195();
	}

	/**
	* Returns the xcg01196 of this vr technical spec_xcg.
	*
	* @return the xcg01196 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01196() {
		return _vrTechnicalSpec_XCG.getXCG01196();
	}

	/**
	* Returns the xcg01197 of this vr technical spec_xcg.
	*
	* @return the xcg01197 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01197() {
		return _vrTechnicalSpec_XCG.getXCG01197();
	}

	/**
	* Returns the xcg01198 of this vr technical spec_xcg.
	*
	* @return the xcg01198 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01198() {
		return _vrTechnicalSpec_XCG.getXCG01198();
	}

	/**
	* Returns the xcg01199 of this vr technical spec_xcg.
	*
	* @return the xcg01199 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01199() {
		return _vrTechnicalSpec_XCG.getXCG01199();
	}

	/**
	* Returns the xcg01200 of this vr technical spec_xcg.
	*
	* @return the xcg01200 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01200() {
		return _vrTechnicalSpec_XCG.getXCG01200();
	}

	/**
	* Returns the xcg01202 of this vr technical spec_xcg.
	*
	* @return the xcg01202 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01202() {
		return _vrTechnicalSpec_XCG.getXCG01202();
	}

	/**
	* Returns the xcg01203 of this vr technical spec_xcg.
	*
	* @return the xcg01203 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01203() {
		return _vrTechnicalSpec_XCG.getXCG01203();
	}

	/**
	* Returns the xcg01204 of this vr technical spec_xcg.
	*
	* @return the xcg01204 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01204() {
		return _vrTechnicalSpec_XCG.getXCG01204();
	}

	/**
	* Returns the xcg01205 of this vr technical spec_xcg.
	*
	* @return the xcg01205 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01205() {
		return _vrTechnicalSpec_XCG.getXCG01205();
	}

	/**
	* Returns the xcg01206 of this vr technical spec_xcg.
	*
	* @return the xcg01206 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01206() {
		return _vrTechnicalSpec_XCG.getXCG01206();
	}

	/**
	* Returns the xcg01207 of this vr technical spec_xcg.
	*
	* @return the xcg01207 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01207() {
		return _vrTechnicalSpec_XCG.getXCG01207();
	}

	/**
	* Returns the xcg01208 of this vr technical spec_xcg.
	*
	* @return the xcg01208 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01208() {
		return _vrTechnicalSpec_XCG.getXCG01208();
	}

	/**
	* Returns the xcg01209 of this vr technical spec_xcg.
	*
	* @return the xcg01209 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01209() {
		return _vrTechnicalSpec_XCG.getXCG01209();
	}

	/**
	* Returns the xcg01210 of this vr technical spec_xcg.
	*
	* @return the xcg01210 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01210() {
		return _vrTechnicalSpec_XCG.getXCG01210();
	}

	/**
	* Returns the xcg01212 of this vr technical spec_xcg.
	*
	* @return the xcg01212 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01212() {
		return _vrTechnicalSpec_XCG.getXCG01212();
	}

	/**
	* Returns the xcg01213 of this vr technical spec_xcg.
	*
	* @return the xcg01213 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01213() {
		return _vrTechnicalSpec_XCG.getXCG01213();
	}

	/**
	* Returns the xcg01214 of this vr technical spec_xcg.
	*
	* @return the xcg01214 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01214() {
		return _vrTechnicalSpec_XCG.getXCG01214();
	}

	/**
	* Returns the xcg01215 of this vr technical spec_xcg.
	*
	* @return the xcg01215 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01215() {
		return _vrTechnicalSpec_XCG.getXCG01215();
	}

	/**
	* Returns the xcg01216 of this vr technical spec_xcg.
	*
	* @return the xcg01216 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01216() {
		return _vrTechnicalSpec_XCG.getXCG01216();
	}

	/**
	* Returns the xcg01217 of this vr technical spec_xcg.
	*
	* @return the xcg01217 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01217() {
		return _vrTechnicalSpec_XCG.getXCG01217();
	}

	/**
	* Returns the xcg01218 of this vr technical spec_xcg.
	*
	* @return the xcg01218 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01218() {
		return _vrTechnicalSpec_XCG.getXCG01218();
	}

	/**
	* Returns the xcg01219 of this vr technical spec_xcg.
	*
	* @return the xcg01219 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01219() {
		return _vrTechnicalSpec_XCG.getXCG01219();
	}

	/**
	* Returns the xcg01220 of this vr technical spec_xcg.
	*
	* @return the xcg01220 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01220() {
		return _vrTechnicalSpec_XCG.getXCG01220();
	}

	/**
	* Returns the xcg01221 of this vr technical spec_xcg.
	*
	* @return the xcg01221 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01221() {
		return _vrTechnicalSpec_XCG.getXCG01221();
	}

	/**
	* Returns the xcg01222 of this vr technical spec_xcg.
	*
	* @return the xcg01222 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01222() {
		return _vrTechnicalSpec_XCG.getXCG01222();
	}

	/**
	* Returns the xcg01223 of this vr technical spec_xcg.
	*
	* @return the xcg01223 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01223() {
		return _vrTechnicalSpec_XCG.getXCG01223();
	}

	/**
	* Returns the xcg01224 of this vr technical spec_xcg.
	*
	* @return the xcg01224 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01224() {
		return _vrTechnicalSpec_XCG.getXCG01224();
	}

	/**
	* Returns the xcg01225 of this vr technical spec_xcg.
	*
	* @return the xcg01225 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01225() {
		return _vrTechnicalSpec_XCG.getXCG01225();
	}

	/**
	* Returns the xcg01226 of this vr technical spec_xcg.
	*
	* @return the xcg01226 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01226() {
		return _vrTechnicalSpec_XCG.getXCG01226();
	}

	/**
	* Returns the xcg01228 of this vr technical spec_xcg.
	*
	* @return the xcg01228 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01228() {
		return _vrTechnicalSpec_XCG.getXCG01228();
	}

	/**
	* Returns the xcg01229 of this vr technical spec_xcg.
	*
	* @return the xcg01229 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01229() {
		return _vrTechnicalSpec_XCG.getXCG01229();
	}

	/**
	* Returns the xcg01230 of this vr technical spec_xcg.
	*
	* @return the xcg01230 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01230() {
		return _vrTechnicalSpec_XCG.getXCG01230();
	}

	/**
	* Returns the xcg01231 of this vr technical spec_xcg.
	*
	* @return the xcg01231 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01231() {
		return _vrTechnicalSpec_XCG.getXCG01231();
	}

	/**
	* Returns the xcg01232 of this vr technical spec_xcg.
	*
	* @return the xcg01232 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01232() {
		return _vrTechnicalSpec_XCG.getXCG01232();
	}

	/**
	* Returns the xcg01234 of this vr technical spec_xcg.
	*
	* @return the xcg01234 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01234() {
		return _vrTechnicalSpec_XCG.getXCG01234();
	}

	/**
	* Returns the xcg01235 of this vr technical spec_xcg.
	*
	* @return the xcg01235 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01235() {
		return _vrTechnicalSpec_XCG.getXCG01235();
	}

	/**
	* Returns the xcg01236 of this vr technical spec_xcg.
	*
	* @return the xcg01236 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01236() {
		return _vrTechnicalSpec_XCG.getXCG01236();
	}

	/**
	* Returns the xcg01237 of this vr technical spec_xcg.
	*
	* @return the xcg01237 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01237() {
		return _vrTechnicalSpec_XCG.getXCG01237();
	}

	/**
	* Returns the xcg01238 of this vr technical spec_xcg.
	*
	* @return the xcg01238 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01238() {
		return _vrTechnicalSpec_XCG.getXCG01238();
	}

	/**
	* Returns the xcg01239 of this vr technical spec_xcg.
	*
	* @return the xcg01239 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01239() {
		return _vrTechnicalSpec_XCG.getXCG01239();
	}

	/**
	* Returns the xcg01240 of this vr technical spec_xcg.
	*
	* @return the xcg01240 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01240() {
		return _vrTechnicalSpec_XCG.getXCG01240();
	}

	/**
	* Returns the xcg01241 of this vr technical spec_xcg.
	*
	* @return the xcg01241 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01241() {
		return _vrTechnicalSpec_XCG.getXCG01241();
	}

	/**
	* Returns the xcg01242 of this vr technical spec_xcg.
	*
	* @return the xcg01242 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01242() {
		return _vrTechnicalSpec_XCG.getXCG01242();
	}

	/**
	* Returns the xcg01243 of this vr technical spec_xcg.
	*
	* @return the xcg01243 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01243() {
		return _vrTechnicalSpec_XCG.getXCG01243();
	}

	/**
	* Returns the xcg01244 of this vr technical spec_xcg.
	*
	* @return the xcg01244 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01244() {
		return _vrTechnicalSpec_XCG.getXCG01244();
	}

	/**
	* Returns the xcg01245 of this vr technical spec_xcg.
	*
	* @return the xcg01245 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01245() {
		return _vrTechnicalSpec_XCG.getXCG01245();
	}

	/**
	* Returns the xcg01246 of this vr technical spec_xcg.
	*
	* @return the xcg01246 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01246() {
		return _vrTechnicalSpec_XCG.getXCG01246();
	}

	/**
	* Returns the xcg01247 of this vr technical spec_xcg.
	*
	* @return the xcg01247 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01247() {
		return _vrTechnicalSpec_XCG.getXCG01247();
	}

	/**
	* Returns the xcg01248 of this vr technical spec_xcg.
	*
	* @return the xcg01248 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01248() {
		return _vrTechnicalSpec_XCG.getXCG01248();
	}

	/**
	* Returns the xcg01249 of this vr technical spec_xcg.
	*
	* @return the xcg01249 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01249() {
		return _vrTechnicalSpec_XCG.getXCG01249();
	}

	/**
	* Returns the xcg01250 of this vr technical spec_xcg.
	*
	* @return the xcg01250 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01250() {
		return _vrTechnicalSpec_XCG.getXCG01250();
	}

	/**
	* Returns the xcg01251 of this vr technical spec_xcg.
	*
	* @return the xcg01251 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01251() {
		return _vrTechnicalSpec_XCG.getXCG01251();
	}

	/**
	* Returns the xcg01252 of this vr technical spec_xcg.
	*
	* @return the xcg01252 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01252() {
		return _vrTechnicalSpec_XCG.getXCG01252();
	}

	/**
	* Returns the xcg01253 of this vr technical spec_xcg.
	*
	* @return the xcg01253 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01253() {
		return _vrTechnicalSpec_XCG.getXCG01253();
	}

	/**
	* Returns the xcg01255 of this vr technical spec_xcg.
	*
	* @return the xcg01255 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01255() {
		return _vrTechnicalSpec_XCG.getXCG01255();
	}

	/**
	* Returns the xcg01256 of this vr technical spec_xcg.
	*
	* @return the xcg01256 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01256() {
		return _vrTechnicalSpec_XCG.getXCG01256();
	}

	/**
	* Returns the xcg01257 of this vr technical spec_xcg.
	*
	* @return the xcg01257 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01257() {
		return _vrTechnicalSpec_XCG.getXCG01257();
	}

	/**
	* Returns the xcg01258 of this vr technical spec_xcg.
	*
	* @return the xcg01258 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01258() {
		return _vrTechnicalSpec_XCG.getXCG01258();
	}

	/**
	* Returns the xcg01259 of this vr technical spec_xcg.
	*
	* @return the xcg01259 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01259() {
		return _vrTechnicalSpec_XCG.getXCG01259();
	}

	/**
	* Returns the xcg01260 of this vr technical spec_xcg.
	*
	* @return the xcg01260 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01260() {
		return _vrTechnicalSpec_XCG.getXCG01260();
	}

	/**
	* Returns the xcg01261 of this vr technical spec_xcg.
	*
	* @return the xcg01261 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01261() {
		return _vrTechnicalSpec_XCG.getXCG01261();
	}

	/**
	* Returns the xcg01262 of this vr technical spec_xcg.
	*
	* @return the xcg01262 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01262() {
		return _vrTechnicalSpec_XCG.getXCG01262();
	}

	/**
	* Returns the xcg01263 of this vr technical spec_xcg.
	*
	* @return the xcg01263 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01263() {
		return _vrTechnicalSpec_XCG.getXCG01263();
	}

	/**
	* Returns the xcg01264 of this vr technical spec_xcg.
	*
	* @return the xcg01264 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01264() {
		return _vrTechnicalSpec_XCG.getXCG01264();
	}

	/**
	* Returns the xcg01265 of this vr technical spec_xcg.
	*
	* @return the xcg01265 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01265() {
		return _vrTechnicalSpec_XCG.getXCG01265();
	}

	/**
	* Returns the xcg01266 of this vr technical spec_xcg.
	*
	* @return the xcg01266 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01266() {
		return _vrTechnicalSpec_XCG.getXCG01266();
	}

	/**
	* Returns the xcg01267 of this vr technical spec_xcg.
	*
	* @return the xcg01267 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01267() {
		return _vrTechnicalSpec_XCG.getXCG01267();
	}

	/**
	* Returns the xcg01268 of this vr technical spec_xcg.
	*
	* @return the xcg01268 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01268() {
		return _vrTechnicalSpec_XCG.getXCG01268();
	}

	/**
	* Returns the xcg01269 of this vr technical spec_xcg.
	*
	* @return the xcg01269 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01269() {
		return _vrTechnicalSpec_XCG.getXCG01269();
	}

	/**
	* Returns the xcg01270 of this vr technical spec_xcg.
	*
	* @return the xcg01270 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01270() {
		return _vrTechnicalSpec_XCG.getXCG01270();
	}

	/**
	* Returns the xcg01271 of this vr technical spec_xcg.
	*
	* @return the xcg01271 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01271() {
		return _vrTechnicalSpec_XCG.getXCG01271();
	}

	/**
	* Returns the xcg01273 of this vr technical spec_xcg.
	*
	* @return the xcg01273 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01273() {
		return _vrTechnicalSpec_XCG.getXCG01273();
	}

	/**
	* Returns the xcg01274 of this vr technical spec_xcg.
	*
	* @return the xcg01274 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01274() {
		return _vrTechnicalSpec_XCG.getXCG01274();
	}

	/**
	* Returns the xcg01275 of this vr technical spec_xcg.
	*
	* @return the xcg01275 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01275() {
		return _vrTechnicalSpec_XCG.getXCG01275();
	}

	/**
	* Returns the xcg01276 of this vr technical spec_xcg.
	*
	* @return the xcg01276 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01276() {
		return _vrTechnicalSpec_XCG.getXCG01276();
	}

	/**
	* Returns the xcg01277 of this vr technical spec_xcg.
	*
	* @return the xcg01277 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01277() {
		return _vrTechnicalSpec_XCG.getXCG01277();
	}

	/**
	* Returns the xcg01278 of this vr technical spec_xcg.
	*
	* @return the xcg01278 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01278() {
		return _vrTechnicalSpec_XCG.getXCG01278();
	}

	/**
	* Returns the xcg01279 of this vr technical spec_xcg.
	*
	* @return the xcg01279 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01279() {
		return _vrTechnicalSpec_XCG.getXCG01279();
	}

	/**
	* Returns the xcg01280 of this vr technical spec_xcg.
	*
	* @return the xcg01280 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01280() {
		return _vrTechnicalSpec_XCG.getXCG01280();
	}

	/**
	* Returns the xcg01281 of this vr technical spec_xcg.
	*
	* @return the xcg01281 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01281() {
		return _vrTechnicalSpec_XCG.getXCG01281();
	}

	/**
	* Returns the xcg01282 of this vr technical spec_xcg.
	*
	* @return the xcg01282 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01282() {
		return _vrTechnicalSpec_XCG.getXCG01282();
	}

	/**
	* Returns the xcg01283 of this vr technical spec_xcg.
	*
	* @return the xcg01283 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01283() {
		return _vrTechnicalSpec_XCG.getXCG01283();
	}

	/**
	* Returns the xcg01284 of this vr technical spec_xcg.
	*
	* @return the xcg01284 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01284() {
		return _vrTechnicalSpec_XCG.getXCG01284();
	}

	/**
	* Returns the xcg01285 of this vr technical spec_xcg.
	*
	* @return the xcg01285 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01285() {
		return _vrTechnicalSpec_XCG.getXCG01285();
	}

	/**
	* Returns the xcg01286 of this vr technical spec_xcg.
	*
	* @return the xcg01286 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01286() {
		return _vrTechnicalSpec_XCG.getXCG01286();
	}

	/**
	* Returns the xcg01287 of this vr technical spec_xcg.
	*
	* @return the xcg01287 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01287() {
		return _vrTechnicalSpec_XCG.getXCG01287();
	}

	/**
	* Returns the xcg01288 of this vr technical spec_xcg.
	*
	* @return the xcg01288 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01288() {
		return _vrTechnicalSpec_XCG.getXCG01288();
	}

	/**
	* Returns the xcg01289 of this vr technical spec_xcg.
	*
	* @return the xcg01289 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01289() {
		return _vrTechnicalSpec_XCG.getXCG01289();
	}

	/**
	* Returns the xcg01290 of this vr technical spec_xcg.
	*
	* @return the xcg01290 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01290() {
		return _vrTechnicalSpec_XCG.getXCG01290();
	}

	/**
	* Returns the xcg01291 of this vr technical spec_xcg.
	*
	* @return the xcg01291 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01291() {
		return _vrTechnicalSpec_XCG.getXCG01291();
	}

	/**
	* Returns the xcg01292 of this vr technical spec_xcg.
	*
	* @return the xcg01292 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01292() {
		return _vrTechnicalSpec_XCG.getXCG01292();
	}

	/**
	* Returns the xcg01293 of this vr technical spec_xcg.
	*
	* @return the xcg01293 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01293() {
		return _vrTechnicalSpec_XCG.getXCG01293();
	}

	/**
	* Returns the xcg01294 of this vr technical spec_xcg.
	*
	* @return the xcg01294 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01294() {
		return _vrTechnicalSpec_XCG.getXCG01294();
	}

	/**
	* Returns the xcg01295 of this vr technical spec_xcg.
	*
	* @return the xcg01295 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01295() {
		return _vrTechnicalSpec_XCG.getXCG01295();
	}

	/**
	* Returns the xcg01296 of this vr technical spec_xcg.
	*
	* @return the xcg01296 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01296() {
		return _vrTechnicalSpec_XCG.getXCG01296();
	}

	/**
	* Returns the xcg01297 of this vr technical spec_xcg.
	*
	* @return the xcg01297 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01297() {
		return _vrTechnicalSpec_XCG.getXCG01297();
	}

	/**
	* Returns the xcg01298 of this vr technical spec_xcg.
	*
	* @return the xcg01298 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01298() {
		return _vrTechnicalSpec_XCG.getXCG01298();
	}

	/**
	* Returns the xcg01300 of this vr technical spec_xcg.
	*
	* @return the xcg01300 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01300() {
		return _vrTechnicalSpec_XCG.getXCG01300();
	}

	/**
	* Returns the xcg01301 of this vr technical spec_xcg.
	*
	* @return the xcg01301 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01301() {
		return _vrTechnicalSpec_XCG.getXCG01301();
	}

	/**
	* Returns the xcg01302 of this vr technical spec_xcg.
	*
	* @return the xcg01302 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01302() {
		return _vrTechnicalSpec_XCG.getXCG01302();
	}

	/**
	* Returns the xcg01303 of this vr technical spec_xcg.
	*
	* @return the xcg01303 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01303() {
		return _vrTechnicalSpec_XCG.getXCG01303();
	}

	/**
	* Returns the xcg01304 of this vr technical spec_xcg.
	*
	* @return the xcg01304 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01304() {
		return _vrTechnicalSpec_XCG.getXCG01304();
	}

	/**
	* Returns the xcg01305 of this vr technical spec_xcg.
	*
	* @return the xcg01305 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01305() {
		return _vrTechnicalSpec_XCG.getXCG01305();
	}

	/**
	* Returns the xcg01306 of this vr technical spec_xcg.
	*
	* @return the xcg01306 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01306() {
		return _vrTechnicalSpec_XCG.getXCG01306();
	}

	/**
	* Returns the xcg01307 of this vr technical spec_xcg.
	*
	* @return the xcg01307 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01307() {
		return _vrTechnicalSpec_XCG.getXCG01307();
	}

	/**
	* Returns the xcg01308 of this vr technical spec_xcg.
	*
	* @return the xcg01308 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01308() {
		return _vrTechnicalSpec_XCG.getXCG01308();
	}

	/**
	* Returns the xcg01310 of this vr technical spec_xcg.
	*
	* @return the xcg01310 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01310() {
		return _vrTechnicalSpec_XCG.getXCG01310();
	}

	/**
	* Returns the xcg01311 of this vr technical spec_xcg.
	*
	* @return the xcg01311 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01311() {
		return _vrTechnicalSpec_XCG.getXCG01311();
	}

	/**
	* Returns the xcg01312 of this vr technical spec_xcg.
	*
	* @return the xcg01312 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01312() {
		return _vrTechnicalSpec_XCG.getXCG01312();
	}

	/**
	* Returns the xcg01313 of this vr technical spec_xcg.
	*
	* @return the xcg01313 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01313() {
		return _vrTechnicalSpec_XCG.getXCG01313();
	}

	/**
	* Returns the xcg01314 of this vr technical spec_xcg.
	*
	* @return the xcg01314 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01314() {
		return _vrTechnicalSpec_XCG.getXCG01314();
	}

	/**
	* Returns the xcg01315 of this vr technical spec_xcg.
	*
	* @return the xcg01315 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01315() {
		return _vrTechnicalSpec_XCG.getXCG01315();
	}

	/**
	* Returns the xcg01316 of this vr technical spec_xcg.
	*
	* @return the xcg01316 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01316() {
		return _vrTechnicalSpec_XCG.getXCG01316();
	}

	/**
	* Returns the xcg01317 of this vr technical spec_xcg.
	*
	* @return the xcg01317 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01317() {
		return _vrTechnicalSpec_XCG.getXCG01317();
	}

	/**
	* Returns the xcg01318 of this vr technical spec_xcg.
	*
	* @return the xcg01318 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01318() {
		return _vrTechnicalSpec_XCG.getXCG01318();
	}

	/**
	* Returns the xcg01319 of this vr technical spec_xcg.
	*
	* @return the xcg01319 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01319() {
		return _vrTechnicalSpec_XCG.getXCG01319();
	}

	/**
	* Returns the xcg01320 of this vr technical spec_xcg.
	*
	* @return the xcg01320 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01320() {
		return _vrTechnicalSpec_XCG.getXCG01320();
	}

	/**
	* Returns the xcg01321 of this vr technical spec_xcg.
	*
	* @return the xcg01321 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01321() {
		return _vrTechnicalSpec_XCG.getXCG01321();
	}

	/**
	* Returns the xcg01322 of this vr technical spec_xcg.
	*
	* @return the xcg01322 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01322() {
		return _vrTechnicalSpec_XCG.getXCG01322();
	}

	/**
	* Returns the xcg01323 of this vr technical spec_xcg.
	*
	* @return the xcg01323 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01323() {
		return _vrTechnicalSpec_XCG.getXCG01323();
	}

	/**
	* Returns the xcg01324 of this vr technical spec_xcg.
	*
	* @return the xcg01324 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01324() {
		return _vrTechnicalSpec_XCG.getXCG01324();
	}

	/**
	* Returns the xcg01325 of this vr technical spec_xcg.
	*
	* @return the xcg01325 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01325() {
		return _vrTechnicalSpec_XCG.getXCG01325();
	}

	/**
	* Returns the xcg01326 of this vr technical spec_xcg.
	*
	* @return the xcg01326 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01326() {
		return _vrTechnicalSpec_XCG.getXCG01326();
	}

	/**
	* Returns the xcg01327 of this vr technical spec_xcg.
	*
	* @return the xcg01327 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01327() {
		return _vrTechnicalSpec_XCG.getXCG01327();
	}

	/**
	* Returns the xcg01328 of this vr technical spec_xcg.
	*
	* @return the xcg01328 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01328() {
		return _vrTechnicalSpec_XCG.getXCG01328();
	}

	/**
	* Returns the xcg01330 of this vr technical spec_xcg.
	*
	* @return the xcg01330 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01330() {
		return _vrTechnicalSpec_XCG.getXCG01330();
	}

	/**
	* Returns the xcg01331 of this vr technical spec_xcg.
	*
	* @return the xcg01331 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01331() {
		return _vrTechnicalSpec_XCG.getXCG01331();
	}

	/**
	* Returns the xcg01332 of this vr technical spec_xcg.
	*
	* @return the xcg01332 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01332() {
		return _vrTechnicalSpec_XCG.getXCG01332();
	}

	/**
	* Returns the xcg01333 of this vr technical spec_xcg.
	*
	* @return the xcg01333 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01333() {
		return _vrTechnicalSpec_XCG.getXCG01333();
	}

	/**
	* Returns the xcg01334 of this vr technical spec_xcg.
	*
	* @return the xcg01334 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01334() {
		return _vrTechnicalSpec_XCG.getXCG01334();
	}

	/**
	* Returns the xcg01335 of this vr technical spec_xcg.
	*
	* @return the xcg01335 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01335() {
		return _vrTechnicalSpec_XCG.getXCG01335();
	}

	/**
	* Returns the xcg01336 of this vr technical spec_xcg.
	*
	* @return the xcg01336 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01336() {
		return _vrTechnicalSpec_XCG.getXCG01336();
	}

	/**
	* Returns the xcg01337 of this vr technical spec_xcg.
	*
	* @return the xcg01337 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01337() {
		return _vrTechnicalSpec_XCG.getXCG01337();
	}

	/**
	* Returns the xcg01338 of this vr technical spec_xcg.
	*
	* @return the xcg01338 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01338() {
		return _vrTechnicalSpec_XCG.getXCG01338();
	}

	/**
	* Returns the xcg01339 of this vr technical spec_xcg.
	*
	* @return the xcg01339 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01339() {
		return _vrTechnicalSpec_XCG.getXCG01339();
	}

	/**
	* Returns the xcg01340 of this vr technical spec_xcg.
	*
	* @return the xcg01340 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01340() {
		return _vrTechnicalSpec_XCG.getXCG01340();
	}

	/**
	* Returns the xcg01341 of this vr technical spec_xcg.
	*
	* @return the xcg01341 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01341() {
		return _vrTechnicalSpec_XCG.getXCG01341();
	}

	/**
	* Returns the xcg01342 of this vr technical spec_xcg.
	*
	* @return the xcg01342 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01342() {
		return _vrTechnicalSpec_XCG.getXCG01342();
	}

	/**
	* Returns the xcg01343 of this vr technical spec_xcg.
	*
	* @return the xcg01343 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01343() {
		return _vrTechnicalSpec_XCG.getXCG01343();
	}

	/**
	* Returns the xcg01344 of this vr technical spec_xcg.
	*
	* @return the xcg01344 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01344() {
		return _vrTechnicalSpec_XCG.getXCG01344();
	}

	/**
	* Returns the xcg01345 of this vr technical spec_xcg.
	*
	* @return the xcg01345 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01345() {
		return _vrTechnicalSpec_XCG.getXCG01345();
	}

	/**
	* Returns the xcg01346 of this vr technical spec_xcg.
	*
	* @return the xcg01346 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01346() {
		return _vrTechnicalSpec_XCG.getXCG01346();
	}

	/**
	* Returns the xcg01347 of this vr technical spec_xcg.
	*
	* @return the xcg01347 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01347() {
		return _vrTechnicalSpec_XCG.getXCG01347();
	}

	/**
	* Returns the xcg01348 of this vr technical spec_xcg.
	*
	* @return the xcg01348 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01348() {
		return _vrTechnicalSpec_XCG.getXCG01348();
	}

	/**
	* Returns the xcg01349 of this vr technical spec_xcg.
	*
	* @return the xcg01349 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01349() {
		return _vrTechnicalSpec_XCG.getXCG01349();
	}

	/**
	* Returns the xcg01350 of this vr technical spec_xcg.
	*
	* @return the xcg01350 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01350() {
		return _vrTechnicalSpec_XCG.getXCG01350();
	}

	/**
	* Returns the xcg01351 of this vr technical spec_xcg.
	*
	* @return the xcg01351 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01351() {
		return _vrTechnicalSpec_XCG.getXCG01351();
	}

	/**
	* Returns the xcg01352 of this vr technical spec_xcg.
	*
	* @return the xcg01352 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01352() {
		return _vrTechnicalSpec_XCG.getXCG01352();
	}

	/**
	* Returns the xcg01353 of this vr technical spec_xcg.
	*
	* @return the xcg01353 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01353() {
		return _vrTechnicalSpec_XCG.getXCG01353();
	}

	/**
	* Returns the xcg01354 of this vr technical spec_xcg.
	*
	* @return the xcg01354 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01354() {
		return _vrTechnicalSpec_XCG.getXCG01354();
	}

	/**
	* Returns the xcg01355 of this vr technical spec_xcg.
	*
	* @return the xcg01355 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01355() {
		return _vrTechnicalSpec_XCG.getXCG01355();
	}

	/**
	* Returns the xcg01356 of this vr technical spec_xcg.
	*
	* @return the xcg01356 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01356() {
		return _vrTechnicalSpec_XCG.getXCG01356();
	}

	/**
	* Returns the xcg01357 of this vr technical spec_xcg.
	*
	* @return the xcg01357 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01357() {
		return _vrTechnicalSpec_XCG.getXCG01357();
	}

	/**
	* Returns the xcg01358 of this vr technical spec_xcg.
	*
	* @return the xcg01358 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01358() {
		return _vrTechnicalSpec_XCG.getXCG01358();
	}

	/**
	* Returns the xcg01359 of this vr technical spec_xcg.
	*
	* @return the xcg01359 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01359() {
		return _vrTechnicalSpec_XCG.getXCG01359();
	}

	/**
	* Returns the xcg01360 of this vr technical spec_xcg.
	*
	* @return the xcg01360 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01360() {
		return _vrTechnicalSpec_XCG.getXCG01360();
	}

	/**
	* Returns the xcg01361 of this vr technical spec_xcg.
	*
	* @return the xcg01361 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01361() {
		return _vrTechnicalSpec_XCG.getXCG01361();
	}

	/**
	* Returns the xcg01362 of this vr technical spec_xcg.
	*
	* @return the xcg01362 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01362() {
		return _vrTechnicalSpec_XCG.getXCG01362();
	}

	/**
	* Returns the xcg01363 of this vr technical spec_xcg.
	*
	* @return the xcg01363 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01363() {
		return _vrTechnicalSpec_XCG.getXCG01363();
	}

	/**
	* Returns the xcg01364 of this vr technical spec_xcg.
	*
	* @return the xcg01364 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01364() {
		return _vrTechnicalSpec_XCG.getXCG01364();
	}

	/**
	* Returns the xcg01365 of this vr technical spec_xcg.
	*
	* @return the xcg01365 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01365() {
		return _vrTechnicalSpec_XCG.getXCG01365();
	}

	/**
	* Returns the xcg01366 of this vr technical spec_xcg.
	*
	* @return the xcg01366 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01366() {
		return _vrTechnicalSpec_XCG.getXCG01366();
	}

	/**
	* Returns the xcg01367 of this vr technical spec_xcg.
	*
	* @return the xcg01367 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01367() {
		return _vrTechnicalSpec_XCG.getXCG01367();
	}

	/**
	* Returns the xcg01368 of this vr technical spec_xcg.
	*
	* @return the xcg01368 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01368() {
		return _vrTechnicalSpec_XCG.getXCG01368();
	}

	/**
	* Returns the xcg01369 of this vr technical spec_xcg.
	*
	* @return the xcg01369 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01369() {
		return _vrTechnicalSpec_XCG.getXCG01369();
	}

	/**
	* Returns the xcg01370 of this vr technical spec_xcg.
	*
	* @return the xcg01370 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01370() {
		return _vrTechnicalSpec_XCG.getXCG01370();
	}

	/**
	* Returns the xcg01371 of this vr technical spec_xcg.
	*
	* @return the xcg01371 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01371() {
		return _vrTechnicalSpec_XCG.getXCG01371();
	}

	/**
	* Returns the xcg01372 of this vr technical spec_xcg.
	*
	* @return the xcg01372 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01372() {
		return _vrTechnicalSpec_XCG.getXCG01372();
	}

	/**
	* Returns the xcg01373 of this vr technical spec_xcg.
	*
	* @return the xcg01373 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01373() {
		return _vrTechnicalSpec_XCG.getXCG01373();
	}

	/**
	* Returns the xcg01374 of this vr technical spec_xcg.
	*
	* @return the xcg01374 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01374() {
		return _vrTechnicalSpec_XCG.getXCG01374();
	}

	/**
	* Returns the xcg01375 of this vr technical spec_xcg.
	*
	* @return the xcg01375 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01375() {
		return _vrTechnicalSpec_XCG.getXCG01375();
	}

	/**
	* Returns the xcg01376 of this vr technical spec_xcg.
	*
	* @return the xcg01376 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01376() {
		return _vrTechnicalSpec_XCG.getXCG01376();
	}

	/**
	* Returns the xcg01377 of this vr technical spec_xcg.
	*
	* @return the xcg01377 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01377() {
		return _vrTechnicalSpec_XCG.getXCG01377();
	}

	/**
	* Returns the xcg01378 of this vr technical spec_xcg.
	*
	* @return the xcg01378 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01378() {
		return _vrTechnicalSpec_XCG.getXCG01378();
	}

	/**
	* Returns the xcg01379 of this vr technical spec_xcg.
	*
	* @return the xcg01379 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01379() {
		return _vrTechnicalSpec_XCG.getXCG01379();
	}

	/**
	* Returns the xcg01381 of this vr technical spec_xcg.
	*
	* @return the xcg01381 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01381() {
		return _vrTechnicalSpec_XCG.getXCG01381();
	}

	/**
	* Returns the xcg01382 of this vr technical spec_xcg.
	*
	* @return the xcg01382 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01382() {
		return _vrTechnicalSpec_XCG.getXCG01382();
	}

	/**
	* Returns the xcg01383 of this vr technical spec_xcg.
	*
	* @return the xcg01383 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01383() {
		return _vrTechnicalSpec_XCG.getXCG01383();
	}

	/**
	* Returns the xcg01384 of this vr technical spec_xcg.
	*
	* @return the xcg01384 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01384() {
		return _vrTechnicalSpec_XCG.getXCG01384();
	}

	/**
	* Returns the xcg01385 of this vr technical spec_xcg.
	*
	* @return the xcg01385 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01385() {
		return _vrTechnicalSpec_XCG.getXCG01385();
	}

	/**
	* Returns the xcg01386 of this vr technical spec_xcg.
	*
	* @return the xcg01386 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01386() {
		return _vrTechnicalSpec_XCG.getXCG01386();
	}

	/**
	* Returns the xcg01387 of this vr technical spec_xcg.
	*
	* @return the xcg01387 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01387() {
		return _vrTechnicalSpec_XCG.getXCG01387();
	}

	/**
	* Returns the xcg01388 of this vr technical spec_xcg.
	*
	* @return the xcg01388 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01388() {
		return _vrTechnicalSpec_XCG.getXCG01388();
	}

	/**
	* Returns the xcg01389 of this vr technical spec_xcg.
	*
	* @return the xcg01389 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01389() {
		return _vrTechnicalSpec_XCG.getXCG01389();
	}

	/**
	* Returns the xcg01390 of this vr technical spec_xcg.
	*
	* @return the xcg01390 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01390() {
		return _vrTechnicalSpec_XCG.getXCG01390();
	}

	/**
	* Returns the xcg01391 of this vr technical spec_xcg.
	*
	* @return the xcg01391 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01391() {
		return _vrTechnicalSpec_XCG.getXCG01391();
	}

	/**
	* Returns the xcg01392 of this vr technical spec_xcg.
	*
	* @return the xcg01392 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01392() {
		return _vrTechnicalSpec_XCG.getXCG01392();
	}

	/**
	* Returns the xcg01393 of this vr technical spec_xcg.
	*
	* @return the xcg01393 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01393() {
		return _vrTechnicalSpec_XCG.getXCG01393();
	}

	/**
	* Returns the xcg01394 of this vr technical spec_xcg.
	*
	* @return the xcg01394 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01394() {
		return _vrTechnicalSpec_XCG.getXCG01394();
	}

	/**
	* Returns the xcg01395 of this vr technical spec_xcg.
	*
	* @return the xcg01395 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01395() {
		return _vrTechnicalSpec_XCG.getXCG01395();
	}

	/**
	* Returns the xcg01396 of this vr technical spec_xcg.
	*
	* @return the xcg01396 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01396() {
		return _vrTechnicalSpec_XCG.getXCG01396();
	}

	/**
	* Returns the xcg01397 of this vr technical spec_xcg.
	*
	* @return the xcg01397 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01397() {
		return _vrTechnicalSpec_XCG.getXCG01397();
	}

	/**
	* Returns the xcg01398 of this vr technical spec_xcg.
	*
	* @return the xcg01398 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01398() {
		return _vrTechnicalSpec_XCG.getXCG01398();
	}

	/**
	* Returns the xcg01399 of this vr technical spec_xcg.
	*
	* @return the xcg01399 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01399() {
		return _vrTechnicalSpec_XCG.getXCG01399();
	}

	/**
	* Returns the xcg01400 of this vr technical spec_xcg.
	*
	* @return the xcg01400 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01400() {
		return _vrTechnicalSpec_XCG.getXCG01400();
	}

	/**
	* Returns the xcg01402 of this vr technical spec_xcg.
	*
	* @return the xcg01402 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01402() {
		return _vrTechnicalSpec_XCG.getXCG01402();
	}

	/**
	* Returns the xcg01403 of this vr technical spec_xcg.
	*
	* @return the xcg01403 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01403() {
		return _vrTechnicalSpec_XCG.getXCG01403();
	}

	/**
	* Returns the xcg01404 of this vr technical spec_xcg.
	*
	* @return the xcg01404 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01404() {
		return _vrTechnicalSpec_XCG.getXCG01404();
	}

	/**
	* Returns the xcg01405 of this vr technical spec_xcg.
	*
	* @return the xcg01405 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01405() {
		return _vrTechnicalSpec_XCG.getXCG01405();
	}

	/**
	* Returns the xcg01406 of this vr technical spec_xcg.
	*
	* @return the xcg01406 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01406() {
		return _vrTechnicalSpec_XCG.getXCG01406();
	}

	/**
	* Returns the xcg01407 of this vr technical spec_xcg.
	*
	* @return the xcg01407 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01407() {
		return _vrTechnicalSpec_XCG.getXCG01407();
	}

	/**
	* Returns the xcg01408 of this vr technical spec_xcg.
	*
	* @return the xcg01408 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01408() {
		return _vrTechnicalSpec_XCG.getXCG01408();
	}

	/**
	* Returns the xcg01409 of this vr technical spec_xcg.
	*
	* @return the xcg01409 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01409() {
		return _vrTechnicalSpec_XCG.getXCG01409();
	}

	/**
	* Returns the xcg01410 of this vr technical spec_xcg.
	*
	* @return the xcg01410 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01410() {
		return _vrTechnicalSpec_XCG.getXCG01410();
	}

	/**
	* Returns the xcg01411 of this vr technical spec_xcg.
	*
	* @return the xcg01411 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01411() {
		return _vrTechnicalSpec_XCG.getXCG01411();
	}

	/**
	* Returns the xcg01412 of this vr technical spec_xcg.
	*
	* @return the xcg01412 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01412() {
		return _vrTechnicalSpec_XCG.getXCG01412();
	}

	/**
	* Returns the xcg01413 of this vr technical spec_xcg.
	*
	* @return the xcg01413 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01413() {
		return _vrTechnicalSpec_XCG.getXCG01413();
	}

	/**
	* Returns the xcg01414 of this vr technical spec_xcg.
	*
	* @return the xcg01414 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01414() {
		return _vrTechnicalSpec_XCG.getXCG01414();
	}

	/**
	* Returns the xcg01415 of this vr technical spec_xcg.
	*
	* @return the xcg01415 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01415() {
		return _vrTechnicalSpec_XCG.getXCG01415();
	}

	/**
	* Returns the xcg01416 of this vr technical spec_xcg.
	*
	* @return the xcg01416 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01416() {
		return _vrTechnicalSpec_XCG.getXCG01416();
	}

	/**
	* Returns the xcg01417 of this vr technical spec_xcg.
	*
	* @return the xcg01417 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01417() {
		return _vrTechnicalSpec_XCG.getXCG01417();
	}

	/**
	* Returns the xcg01418 of this vr technical spec_xcg.
	*
	* @return the xcg01418 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01418() {
		return _vrTechnicalSpec_XCG.getXCG01418();
	}

	/**
	* Returns the xcg01419 of this vr technical spec_xcg.
	*
	* @return the xcg01419 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01419() {
		return _vrTechnicalSpec_XCG.getXCG01419();
	}

	/**
	* Returns the xcg01420 of this vr technical spec_xcg.
	*
	* @return the xcg01420 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01420() {
		return _vrTechnicalSpec_XCG.getXCG01420();
	}

	/**
	* Returns the xcg01421 of this vr technical spec_xcg.
	*
	* @return the xcg01421 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01421() {
		return _vrTechnicalSpec_XCG.getXCG01421();
	}

	/**
	* Returns the xcg01422 of this vr technical spec_xcg.
	*
	* @return the xcg01422 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01422() {
		return _vrTechnicalSpec_XCG.getXCG01422();
	}

	/**
	* Returns the xcg01423 of this vr technical spec_xcg.
	*
	* @return the xcg01423 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01423() {
		return _vrTechnicalSpec_XCG.getXCG01423();
	}

	/**
	* Returns the xcg01424 of this vr technical spec_xcg.
	*
	* @return the xcg01424 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01424() {
		return _vrTechnicalSpec_XCG.getXCG01424();
	}

	/**
	* Returns the xcg01425 of this vr technical spec_xcg.
	*
	* @return the xcg01425 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01425() {
		return _vrTechnicalSpec_XCG.getXCG01425();
	}

	/**
	* Returns the xcg01426 of this vr technical spec_xcg.
	*
	* @return the xcg01426 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01426() {
		return _vrTechnicalSpec_XCG.getXCG01426();
	}

	/**
	* Returns the xcg01427 of this vr technical spec_xcg.
	*
	* @return the xcg01427 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01427() {
		return _vrTechnicalSpec_XCG.getXCG01427();
	}

	/**
	* Returns the xcg01428 of this vr technical spec_xcg.
	*
	* @return the xcg01428 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01428() {
		return _vrTechnicalSpec_XCG.getXCG01428();
	}

	/**
	* Returns the xcg01429 of this vr technical spec_xcg.
	*
	* @return the xcg01429 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01429() {
		return _vrTechnicalSpec_XCG.getXCG01429();
	}

	/**
	* Returns the xcg01430 of this vr technical spec_xcg.
	*
	* @return the xcg01430 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01430() {
		return _vrTechnicalSpec_XCG.getXCG01430();
	}

	/**
	* Returns the xcg01431 of this vr technical spec_xcg.
	*
	* @return the xcg01431 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01431() {
		return _vrTechnicalSpec_XCG.getXCG01431();
	}

	/**
	* Returns the xcg01432 of this vr technical spec_xcg.
	*
	* @return the xcg01432 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01432() {
		return _vrTechnicalSpec_XCG.getXCG01432();
	}

	/**
	* Returns the xcg01433 of this vr technical spec_xcg.
	*
	* @return the xcg01433 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01433() {
		return _vrTechnicalSpec_XCG.getXCG01433();
	}

	/**
	* Returns the xcg01434 of this vr technical spec_xcg.
	*
	* @return the xcg01434 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01434() {
		return _vrTechnicalSpec_XCG.getXCG01434();
	}

	/**
	* Returns the xcg01435 of this vr technical spec_xcg.
	*
	* @return the xcg01435 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01435() {
		return _vrTechnicalSpec_XCG.getXCG01435();
	}

	/**
	* Returns the xcg01436 of this vr technical spec_xcg.
	*
	* @return the xcg01436 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01436() {
		return _vrTechnicalSpec_XCG.getXCG01436();
	}

	/**
	* Returns the xcg01437 of this vr technical spec_xcg.
	*
	* @return the xcg01437 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01437() {
		return _vrTechnicalSpec_XCG.getXCG01437();
	}

	/**
	* Returns the xcg01439 of this vr technical spec_xcg.
	*
	* @return the xcg01439 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01439() {
		return _vrTechnicalSpec_XCG.getXCG01439();
	}

	/**
	* Returns the xcg01440 of this vr technical spec_xcg.
	*
	* @return the xcg01440 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01440() {
		return _vrTechnicalSpec_XCG.getXCG01440();
	}

	/**
	* Returns the xcg01441 of this vr technical spec_xcg.
	*
	* @return the xcg01441 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01441() {
		return _vrTechnicalSpec_XCG.getXCG01441();
	}

	/**
	* Returns the xcg01442 of this vr technical spec_xcg.
	*
	* @return the xcg01442 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01442() {
		return _vrTechnicalSpec_XCG.getXCG01442();
	}

	/**
	* Returns the xcg01443 of this vr technical spec_xcg.
	*
	* @return the xcg01443 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01443() {
		return _vrTechnicalSpec_XCG.getXCG01443();
	}

	/**
	* Returns the xcg01445 of this vr technical spec_xcg.
	*
	* @return the xcg01445 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01445() {
		return _vrTechnicalSpec_XCG.getXCG01445();
	}

	/**
	* Returns the xcg01446 of this vr technical spec_xcg.
	*
	* @return the xcg01446 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01446() {
		return _vrTechnicalSpec_XCG.getXCG01446();
	}

	/**
	* Returns the xcg01447 of this vr technical spec_xcg.
	*
	* @return the xcg01447 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01447() {
		return _vrTechnicalSpec_XCG.getXCG01447();
	}

	/**
	* Returns the xcg01448 of this vr technical spec_xcg.
	*
	* @return the xcg01448 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01448() {
		return _vrTechnicalSpec_XCG.getXCG01448();
	}

	/**
	* Returns the xcg01449 of this vr technical spec_xcg.
	*
	* @return the xcg01449 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01449() {
		return _vrTechnicalSpec_XCG.getXCG01449();
	}

	/**
	* Returns the xcg01450 of this vr technical spec_xcg.
	*
	* @return the xcg01450 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01450() {
		return _vrTechnicalSpec_XCG.getXCG01450();
	}

	/**
	* Returns the xcg01451 of this vr technical spec_xcg.
	*
	* @return the xcg01451 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01451() {
		return _vrTechnicalSpec_XCG.getXCG01451();
	}

	/**
	* Returns the xcg01452 of this vr technical spec_xcg.
	*
	* @return the xcg01452 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01452() {
		return _vrTechnicalSpec_XCG.getXCG01452();
	}

	/**
	* Returns the xcg01453 of this vr technical spec_xcg.
	*
	* @return the xcg01453 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01453() {
		return _vrTechnicalSpec_XCG.getXCG01453();
	}

	/**
	* Returns the xcg01454 of this vr technical spec_xcg.
	*
	* @return the xcg01454 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01454() {
		return _vrTechnicalSpec_XCG.getXCG01454();
	}

	/**
	* Returns the xcg01455 of this vr technical spec_xcg.
	*
	* @return the xcg01455 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01455() {
		return _vrTechnicalSpec_XCG.getXCG01455();
	}

	/**
	* Returns the xcg01456 of this vr technical spec_xcg.
	*
	* @return the xcg01456 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01456() {
		return _vrTechnicalSpec_XCG.getXCG01456();
	}

	/**
	* Returns the xcg01457 of this vr technical spec_xcg.
	*
	* @return the xcg01457 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01457() {
		return _vrTechnicalSpec_XCG.getXCG01457();
	}

	/**
	* Returns the xcg01458 of this vr technical spec_xcg.
	*
	* @return the xcg01458 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01458() {
		return _vrTechnicalSpec_XCG.getXCG01458();
	}

	/**
	* Returns the xcg01459 of this vr technical spec_xcg.
	*
	* @return the xcg01459 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01459() {
		return _vrTechnicalSpec_XCG.getXCG01459();
	}

	/**
	* Returns the xcg01460 of this vr technical spec_xcg.
	*
	* @return the xcg01460 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01460() {
		return _vrTechnicalSpec_XCG.getXCG01460();
	}

	/**
	* Returns the xcg01461 of this vr technical spec_xcg.
	*
	* @return the xcg01461 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01461() {
		return _vrTechnicalSpec_XCG.getXCG01461();
	}

	/**
	* Returns the xcg01462 of this vr technical spec_xcg.
	*
	* @return the xcg01462 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01462() {
		return _vrTechnicalSpec_XCG.getXCG01462();
	}

	/**
	* Returns the xcg01463 of this vr technical spec_xcg.
	*
	* @return the xcg01463 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01463() {
		return _vrTechnicalSpec_XCG.getXCG01463();
	}

	/**
	* Returns the xcg01464 of this vr technical spec_xcg.
	*
	* @return the xcg01464 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01464() {
		return _vrTechnicalSpec_XCG.getXCG01464();
	}

	/**
	* Returns the xcg01465 of this vr technical spec_xcg.
	*
	* @return the xcg01465 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01465() {
		return _vrTechnicalSpec_XCG.getXCG01465();
	}

	/**
	* Returns the xcg01466 of this vr technical spec_xcg.
	*
	* @return the xcg01466 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01466() {
		return _vrTechnicalSpec_XCG.getXCG01466();
	}

	/**
	* Returns the xcg01467 of this vr technical spec_xcg.
	*
	* @return the xcg01467 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01467() {
		return _vrTechnicalSpec_XCG.getXCG01467();
	}

	/**
	* Returns the xcg01468 of this vr technical spec_xcg.
	*
	* @return the xcg01468 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01468() {
		return _vrTechnicalSpec_XCG.getXCG01468();
	}

	/**
	* Returns the xcg01469 of this vr technical spec_xcg.
	*
	* @return the xcg01469 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01469() {
		return _vrTechnicalSpec_XCG.getXCG01469();
	}

	/**
	* Returns the xcg01470 of this vr technical spec_xcg.
	*
	* @return the xcg01470 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01470() {
		return _vrTechnicalSpec_XCG.getXCG01470();
	}

	/**
	* Returns the xcg01471 of this vr technical spec_xcg.
	*
	* @return the xcg01471 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01471() {
		return _vrTechnicalSpec_XCG.getXCG01471();
	}

	/**
	* Returns the xcg01472 of this vr technical spec_xcg.
	*
	* @return the xcg01472 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01472() {
		return _vrTechnicalSpec_XCG.getXCG01472();
	}

	/**
	* Returns the xcg01473 of this vr technical spec_xcg.
	*
	* @return the xcg01473 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01473() {
		return _vrTechnicalSpec_XCG.getXCG01473();
	}

	/**
	* Returns the xcg01474 of this vr technical spec_xcg.
	*
	* @return the xcg01474 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01474() {
		return _vrTechnicalSpec_XCG.getXCG01474();
	}

	/**
	* Returns the xcg01475 of this vr technical spec_xcg.
	*
	* @return the xcg01475 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01475() {
		return _vrTechnicalSpec_XCG.getXCG01475();
	}

	/**
	* Returns the xcg01476 of this vr technical spec_xcg.
	*
	* @return the xcg01476 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01476() {
		return _vrTechnicalSpec_XCG.getXCG01476();
	}

	/**
	* Returns the xcg01477 of this vr technical spec_xcg.
	*
	* @return the xcg01477 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01477() {
		return _vrTechnicalSpec_XCG.getXCG01477();
	}

	/**
	* Returns the xcg01478 of this vr technical spec_xcg.
	*
	* @return the xcg01478 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01478() {
		return _vrTechnicalSpec_XCG.getXCG01478();
	}

	/**
	* Returns the xcg01479 of this vr technical spec_xcg.
	*
	* @return the xcg01479 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01479() {
		return _vrTechnicalSpec_XCG.getXCG01479();
	}

	/**
	* Returns the xcg01480 of this vr technical spec_xcg.
	*
	* @return the xcg01480 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01480() {
		return _vrTechnicalSpec_XCG.getXCG01480();
	}

	/**
	* Returns the xcg01481 of this vr technical spec_xcg.
	*
	* @return the xcg01481 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01481() {
		return _vrTechnicalSpec_XCG.getXCG01481();
	}

	/**
	* Returns the xcg01482 of this vr technical spec_xcg.
	*
	* @return the xcg01482 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01482() {
		return _vrTechnicalSpec_XCG.getXCG01482();
	}

	/**
	* Returns the xcg01483 of this vr technical spec_xcg.
	*
	* @return the xcg01483 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01483() {
		return _vrTechnicalSpec_XCG.getXCG01483();
	}

	/**
	* Returns the xcg01484 of this vr technical spec_xcg.
	*
	* @return the xcg01484 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01484() {
		return _vrTechnicalSpec_XCG.getXCG01484();
	}

	/**
	* Returns the xcg01485 of this vr technical spec_xcg.
	*
	* @return the xcg01485 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01485() {
		return _vrTechnicalSpec_XCG.getXCG01485();
	}

	/**
	* Returns the xcg01486 of this vr technical spec_xcg.
	*
	* @return the xcg01486 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01486() {
		return _vrTechnicalSpec_XCG.getXCG01486();
	}

	/**
	* Returns the xcg01487 of this vr technical spec_xcg.
	*
	* @return the xcg01487 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01487() {
		return _vrTechnicalSpec_XCG.getXCG01487();
	}

	/**
	* Returns the xcg01488 of this vr technical spec_xcg.
	*
	* @return the xcg01488 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01488() {
		return _vrTechnicalSpec_XCG.getXCG01488();
	}

	/**
	* Returns the xcg01489 of this vr technical spec_xcg.
	*
	* @return the xcg01489 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01489() {
		return _vrTechnicalSpec_XCG.getXCG01489();
	}

	/**
	* Returns the xcg01490 of this vr technical spec_xcg.
	*
	* @return the xcg01490 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01490() {
		return _vrTechnicalSpec_XCG.getXCG01490();
	}

	/**
	* Returns the xcg01491 of this vr technical spec_xcg.
	*
	* @return the xcg01491 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01491() {
		return _vrTechnicalSpec_XCG.getXCG01491();
	}

	/**
	* Returns the xcg01492 of this vr technical spec_xcg.
	*
	* @return the xcg01492 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01492() {
		return _vrTechnicalSpec_XCG.getXCG01492();
	}

	/**
	* Returns the xcg01493 of this vr technical spec_xcg.
	*
	* @return the xcg01493 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01493() {
		return _vrTechnicalSpec_XCG.getXCG01493();
	}

	/**
	* Returns the xcg01494 of this vr technical spec_xcg.
	*
	* @return the xcg01494 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01494() {
		return _vrTechnicalSpec_XCG.getXCG01494();
	}

	/**
	* Returns the xcg01496 of this vr technical spec_xcg.
	*
	* @return the xcg01496 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01496() {
		return _vrTechnicalSpec_XCG.getXCG01496();
	}

	/**
	* Returns the xcg01497 of this vr technical spec_xcg.
	*
	* @return the xcg01497 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01497() {
		return _vrTechnicalSpec_XCG.getXCG01497();
	}

	/**
	* Returns the xcg01498 of this vr technical spec_xcg.
	*
	* @return the xcg01498 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01498() {
		return _vrTechnicalSpec_XCG.getXCG01498();
	}

	/**
	* Returns the xcg01499 of this vr technical spec_xcg.
	*
	* @return the xcg01499 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01499() {
		return _vrTechnicalSpec_XCG.getXCG01499();
	}

	/**
	* Returns the xcg01500 of this vr technical spec_xcg.
	*
	* @return the xcg01500 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01500() {
		return _vrTechnicalSpec_XCG.getXCG01500();
	}

	/**
	* Returns the xcg01501 of this vr technical spec_xcg.
	*
	* @return the xcg01501 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01501() {
		return _vrTechnicalSpec_XCG.getXCG01501();
	}

	/**
	* Returns the xcg01502 of this vr technical spec_xcg.
	*
	* @return the xcg01502 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01502() {
		return _vrTechnicalSpec_XCG.getXCG01502();
	}

	/**
	* Returns the xcg01503 of this vr technical spec_xcg.
	*
	* @return the xcg01503 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01503() {
		return _vrTechnicalSpec_XCG.getXCG01503();
	}

	/**
	* Returns the xcg01504 of this vr technical spec_xcg.
	*
	* @return the xcg01504 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01504() {
		return _vrTechnicalSpec_XCG.getXCG01504();
	}

	/**
	* Returns the xcg01505 of this vr technical spec_xcg.
	*
	* @return the xcg01505 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01505() {
		return _vrTechnicalSpec_XCG.getXCG01505();
	}

	/**
	* Returns the xcg01506 of this vr technical spec_xcg.
	*
	* @return the xcg01506 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01506() {
		return _vrTechnicalSpec_XCG.getXCG01506();
	}

	/**
	* Returns the xcg01507 of this vr technical spec_xcg.
	*
	* @return the xcg01507 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01507() {
		return _vrTechnicalSpec_XCG.getXCG01507();
	}

	/**
	* Returns the xcg01508 of this vr technical spec_xcg.
	*
	* @return the xcg01508 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01508() {
		return _vrTechnicalSpec_XCG.getXCG01508();
	}

	/**
	* Returns the xcg01509 of this vr technical spec_xcg.
	*
	* @return the xcg01509 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01509() {
		return _vrTechnicalSpec_XCG.getXCG01509();
	}

	/**
	* Returns the xcg01510 of this vr technical spec_xcg.
	*
	* @return the xcg01510 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01510() {
		return _vrTechnicalSpec_XCG.getXCG01510();
	}

	/**
	* Returns the xcg01512 of this vr technical spec_xcg.
	*
	* @return the xcg01512 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01512() {
		return _vrTechnicalSpec_XCG.getXCG01512();
	}

	/**
	* Returns the xcg01513 of this vr technical spec_xcg.
	*
	* @return the xcg01513 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01513() {
		return _vrTechnicalSpec_XCG.getXCG01513();
	}

	/**
	* Returns the xcg01514 of this vr technical spec_xcg.
	*
	* @return the xcg01514 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01514() {
		return _vrTechnicalSpec_XCG.getXCG01514();
	}

	/**
	* Returns the xcg01515 of this vr technical spec_xcg.
	*
	* @return the xcg01515 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01515() {
		return _vrTechnicalSpec_XCG.getXCG01515();
	}

	/**
	* Returns the xcg01516 of this vr technical spec_xcg.
	*
	* @return the xcg01516 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01516() {
		return _vrTechnicalSpec_XCG.getXCG01516();
	}

	/**
	* Returns the xcg01517 of this vr technical spec_xcg.
	*
	* @return the xcg01517 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01517() {
		return _vrTechnicalSpec_XCG.getXCG01517();
	}

	/**
	* Returns the xcg01518 of this vr technical spec_xcg.
	*
	* @return the xcg01518 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01518() {
		return _vrTechnicalSpec_XCG.getXCG01518();
	}

	/**
	* Returns the xcg01519 of this vr technical spec_xcg.
	*
	* @return the xcg01519 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01519() {
		return _vrTechnicalSpec_XCG.getXCG01519();
	}

	/**
	* Returns the xcg01520 of this vr technical spec_xcg.
	*
	* @return the xcg01520 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01520() {
		return _vrTechnicalSpec_XCG.getXCG01520();
	}

	/**
	* Returns the xcg01521 of this vr technical spec_xcg.
	*
	* @return the xcg01521 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01521() {
		return _vrTechnicalSpec_XCG.getXCG01521();
	}

	/**
	* Returns the xcg01522 of this vr technical spec_xcg.
	*
	* @return the xcg01522 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01522() {
		return _vrTechnicalSpec_XCG.getXCG01522();
	}

	/**
	* Returns the xcg01523 of this vr technical spec_xcg.
	*
	* @return the xcg01523 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01523() {
		return _vrTechnicalSpec_XCG.getXCG01523();
	}

	/**
	* Returns the xcg01524 of this vr technical spec_xcg.
	*
	* @return the xcg01524 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01524() {
		return _vrTechnicalSpec_XCG.getXCG01524();
	}

	/**
	* Returns the xcg01525 of this vr technical spec_xcg.
	*
	* @return the xcg01525 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01525() {
		return _vrTechnicalSpec_XCG.getXCG01525();
	}

	/**
	* Returns the xcg01526 of this vr technical spec_xcg.
	*
	* @return the xcg01526 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01526() {
		return _vrTechnicalSpec_XCG.getXCG01526();
	}

	/**
	* Returns the xcg01527 of this vr technical spec_xcg.
	*
	* @return the xcg01527 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01527() {
		return _vrTechnicalSpec_XCG.getXCG01527();
	}

	/**
	* Returns the xcg01528 of this vr technical spec_xcg.
	*
	* @return the xcg01528 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01528() {
		return _vrTechnicalSpec_XCG.getXCG01528();
	}

	/**
	* Returns the xcg01529 of this vr technical spec_xcg.
	*
	* @return the xcg01529 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01529() {
		return _vrTechnicalSpec_XCG.getXCG01529();
	}

	/**
	* Returns the xcg01530 of this vr technical spec_xcg.
	*
	* @return the xcg01530 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01530() {
		return _vrTechnicalSpec_XCG.getXCG01530();
	}

	/**
	* Returns the xcg01531 of this vr technical spec_xcg.
	*
	* @return the xcg01531 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01531() {
		return _vrTechnicalSpec_XCG.getXCG01531();
	}

	/**
	* Returns the xcg01533 of this vr technical spec_xcg.
	*
	* @return the xcg01533 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01533() {
		return _vrTechnicalSpec_XCG.getXCG01533();
	}

	/**
	* Returns the xcg01534 of this vr technical spec_xcg.
	*
	* @return the xcg01534 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01534() {
		return _vrTechnicalSpec_XCG.getXCG01534();
	}

	/**
	* Returns the xcg01535 of this vr technical spec_xcg.
	*
	* @return the xcg01535 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01535() {
		return _vrTechnicalSpec_XCG.getXCG01535();
	}

	/**
	* Returns the xcg01536 of this vr technical spec_xcg.
	*
	* @return the xcg01536 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01536() {
		return _vrTechnicalSpec_XCG.getXCG01536();
	}

	/**
	* Returns the xcg01537 of this vr technical spec_xcg.
	*
	* @return the xcg01537 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01537() {
		return _vrTechnicalSpec_XCG.getXCG01537();
	}

	/**
	* Returns the xcg01538 of this vr technical spec_xcg.
	*
	* @return the xcg01538 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01538() {
		return _vrTechnicalSpec_XCG.getXCG01538();
	}

	/**
	* Returns the xcg01539 of this vr technical spec_xcg.
	*
	* @return the xcg01539 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01539() {
		return _vrTechnicalSpec_XCG.getXCG01539();
	}

	/**
	* Returns the xcg01541 of this vr technical spec_xcg.
	*
	* @return the xcg01541 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01541() {
		return _vrTechnicalSpec_XCG.getXCG01541();
	}

	/**
	* Returns the xcg01542 of this vr technical spec_xcg.
	*
	* @return the xcg01542 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01542() {
		return _vrTechnicalSpec_XCG.getXCG01542();
	}

	/**
	* Returns the xcg01543 of this vr technical spec_xcg.
	*
	* @return the xcg01543 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01543() {
		return _vrTechnicalSpec_XCG.getXCG01543();
	}

	/**
	* Returns the xcg01544 of this vr technical spec_xcg.
	*
	* @return the xcg01544 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01544() {
		return _vrTechnicalSpec_XCG.getXCG01544();
	}

	/**
	* Returns the xcg01545 of this vr technical spec_xcg.
	*
	* @return the xcg01545 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01545() {
		return _vrTechnicalSpec_XCG.getXCG01545();
	}

	/**
	* Returns the xcg01546 of this vr technical spec_xcg.
	*
	* @return the xcg01546 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01546() {
		return _vrTechnicalSpec_XCG.getXCG01546();
	}

	/**
	* Returns the xcg01547 of this vr technical spec_xcg.
	*
	* @return the xcg01547 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01547() {
		return _vrTechnicalSpec_XCG.getXCG01547();
	}

	/**
	* Returns the xcg01548 of this vr technical spec_xcg.
	*
	* @return the xcg01548 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01548() {
		return _vrTechnicalSpec_XCG.getXCG01548();
	}

	/**
	* Returns the xcg01549 of this vr technical spec_xcg.
	*
	* @return the xcg01549 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01549() {
		return _vrTechnicalSpec_XCG.getXCG01549();
	}

	/**
	* Returns the xcg01550 of this vr technical spec_xcg.
	*
	* @return the xcg01550 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01550() {
		return _vrTechnicalSpec_XCG.getXCG01550();
	}

	/**
	* Returns the xcg01551 of this vr technical spec_xcg.
	*
	* @return the xcg01551 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01551() {
		return _vrTechnicalSpec_XCG.getXCG01551();
	}

	/**
	* Returns the xcg01552 of this vr technical spec_xcg.
	*
	* @return the xcg01552 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01552() {
		return _vrTechnicalSpec_XCG.getXCG01552();
	}

	/**
	* Returns the xcg01553 of this vr technical spec_xcg.
	*
	* @return the xcg01553 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01553() {
		return _vrTechnicalSpec_XCG.getXCG01553();
	}

	/**
	* Returns the xcg01554 of this vr technical spec_xcg.
	*
	* @return the xcg01554 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01554() {
		return _vrTechnicalSpec_XCG.getXCG01554();
	}

	/**
	* Returns the xcg01555 of this vr technical spec_xcg.
	*
	* @return the xcg01555 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01555() {
		return _vrTechnicalSpec_XCG.getXCG01555();
	}

	/**
	* Returns the xcg01556 of this vr technical spec_xcg.
	*
	* @return the xcg01556 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01556() {
		return _vrTechnicalSpec_XCG.getXCG01556();
	}

	/**
	* Returns the xcg01557 of this vr technical spec_xcg.
	*
	* @return the xcg01557 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01557() {
		return _vrTechnicalSpec_XCG.getXCG01557();
	}

	/**
	* Returns the xcg01558 of this vr technical spec_xcg.
	*
	* @return the xcg01558 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01558() {
		return _vrTechnicalSpec_XCG.getXCG01558();
	}

	/**
	* Returns the xcg01559 of this vr technical spec_xcg.
	*
	* @return the xcg01559 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01559() {
		return _vrTechnicalSpec_XCG.getXCG01559();
	}

	/**
	* Returns the xcg01560 of this vr technical spec_xcg.
	*
	* @return the xcg01560 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01560() {
		return _vrTechnicalSpec_XCG.getXCG01560();
	}

	/**
	* Returns the xcg01561 of this vr technical spec_xcg.
	*
	* @return the xcg01561 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01561() {
		return _vrTechnicalSpec_XCG.getXCG01561();
	}

	/**
	* Returns the xcg01562 of this vr technical spec_xcg.
	*
	* @return the xcg01562 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01562() {
		return _vrTechnicalSpec_XCG.getXCG01562();
	}

	/**
	* Returns the xcg01563 of this vr technical spec_xcg.
	*
	* @return the xcg01563 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01563() {
		return _vrTechnicalSpec_XCG.getXCG01563();
	}

	/**
	* Returns the xcg01564 of this vr technical spec_xcg.
	*
	* @return the xcg01564 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01564() {
		return _vrTechnicalSpec_XCG.getXCG01564();
	}

	/**
	* Returns the xcg01565 of this vr technical spec_xcg.
	*
	* @return the xcg01565 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01565() {
		return _vrTechnicalSpec_XCG.getXCG01565();
	}

	/**
	* Returns the xcg01566 of this vr technical spec_xcg.
	*
	* @return the xcg01566 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01566() {
		return _vrTechnicalSpec_XCG.getXCG01566();
	}

	/**
	* Returns the xcg01567 of this vr technical spec_xcg.
	*
	* @return the xcg01567 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01567() {
		return _vrTechnicalSpec_XCG.getXCG01567();
	}

	/**
	* Returns the xcg01568 of this vr technical spec_xcg.
	*
	* @return the xcg01568 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01568() {
		return _vrTechnicalSpec_XCG.getXCG01568();
	}

	/**
	* Returns the xcg01569 of this vr technical spec_xcg.
	*
	* @return the xcg01569 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01569() {
		return _vrTechnicalSpec_XCG.getXCG01569();
	}

	/**
	* Returns the xcg01570 of this vr technical spec_xcg.
	*
	* @return the xcg01570 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01570() {
		return _vrTechnicalSpec_XCG.getXCG01570();
	}

	/**
	* Returns the xcg01571 of this vr technical spec_xcg.
	*
	* @return the xcg01571 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01571() {
		return _vrTechnicalSpec_XCG.getXCG01571();
	}

	/**
	* Returns the xcg01572 of this vr technical spec_xcg.
	*
	* @return the xcg01572 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01572() {
		return _vrTechnicalSpec_XCG.getXCG01572();
	}

	/**
	* Returns the xcg01573 of this vr technical spec_xcg.
	*
	* @return the xcg01573 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01573() {
		return _vrTechnicalSpec_XCG.getXCG01573();
	}

	/**
	* Returns the xcg01574 of this vr technical spec_xcg.
	*
	* @return the xcg01574 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01574() {
		return _vrTechnicalSpec_XCG.getXCG01574();
	}

	/**
	* Returns the xcg01575 of this vr technical spec_xcg.
	*
	* @return the xcg01575 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01575() {
		return _vrTechnicalSpec_XCG.getXCG01575();
	}

	/**
	* Returns the xcg01576 of this vr technical spec_xcg.
	*
	* @return the xcg01576 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01576() {
		return _vrTechnicalSpec_XCG.getXCG01576();
	}

	/**
	* Returns the xcg01577 of this vr technical spec_xcg.
	*
	* @return the xcg01577 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01577() {
		return _vrTechnicalSpec_XCG.getXCG01577();
	}

	/**
	* Returns the xcg01578 of this vr technical spec_xcg.
	*
	* @return the xcg01578 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01578() {
		return _vrTechnicalSpec_XCG.getXCG01578();
	}

	/**
	* Returns the xcg01579 of this vr technical spec_xcg.
	*
	* @return the xcg01579 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01579() {
		return _vrTechnicalSpec_XCG.getXCG01579();
	}

	/**
	* Returns the xcg01580 of this vr technical spec_xcg.
	*
	* @return the xcg01580 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01580() {
		return _vrTechnicalSpec_XCG.getXCG01580();
	}

	/**
	* Returns the xcg01581 of this vr technical spec_xcg.
	*
	* @return the xcg01581 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01581() {
		return _vrTechnicalSpec_XCG.getXCG01581();
	}

	/**
	* Returns the xcg01582 of this vr technical spec_xcg.
	*
	* @return the xcg01582 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01582() {
		return _vrTechnicalSpec_XCG.getXCG01582();
	}

	/**
	* Returns the xcg01583 of this vr technical spec_xcg.
	*
	* @return the xcg01583 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01583() {
		return _vrTechnicalSpec_XCG.getXCG01583();
	}

	/**
	* Returns the xcg01584 of this vr technical spec_xcg.
	*
	* @return the xcg01584 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01584() {
		return _vrTechnicalSpec_XCG.getXCG01584();
	}

	/**
	* Returns the xcg01585 of this vr technical spec_xcg.
	*
	* @return the xcg01585 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01585() {
		return _vrTechnicalSpec_XCG.getXCG01585();
	}

	/**
	* Returns the xcg01586 of this vr technical spec_xcg.
	*
	* @return the xcg01586 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01586() {
		return _vrTechnicalSpec_XCG.getXCG01586();
	}

	/**
	* Returns the xcg01587 of this vr technical spec_xcg.
	*
	* @return the xcg01587 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01587() {
		return _vrTechnicalSpec_XCG.getXCG01587();
	}

	/**
	* Returns the xcg01588 of this vr technical spec_xcg.
	*
	* @return the xcg01588 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01588() {
		return _vrTechnicalSpec_XCG.getXCG01588();
	}

	/**
	* Returns the xcg01589 of this vr technical spec_xcg.
	*
	* @return the xcg01589 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01589() {
		return _vrTechnicalSpec_XCG.getXCG01589();
	}

	/**
	* Returns the xcg01590 of this vr technical spec_xcg.
	*
	* @return the xcg01590 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01590() {
		return _vrTechnicalSpec_XCG.getXCG01590();
	}

	/**
	* Returns the xcg01591 of this vr technical spec_xcg.
	*
	* @return the xcg01591 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01591() {
		return _vrTechnicalSpec_XCG.getXCG01591();
	}

	/**
	* Returns the xcg01592 of this vr technical spec_xcg.
	*
	* @return the xcg01592 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01592() {
		return _vrTechnicalSpec_XCG.getXCG01592();
	}

	/**
	* Returns the xcg01593 of this vr technical spec_xcg.
	*
	* @return the xcg01593 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01593() {
		return _vrTechnicalSpec_XCG.getXCG01593();
	}

	/**
	* Returns the xcg01594 of this vr technical spec_xcg.
	*
	* @return the xcg01594 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01594() {
		return _vrTechnicalSpec_XCG.getXCG01594();
	}

	/**
	* Returns the xcg01595 of this vr technical spec_xcg.
	*
	* @return the xcg01595 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01595() {
		return _vrTechnicalSpec_XCG.getXCG01595();
	}

	/**
	* Returns the xcg01596 of this vr technical spec_xcg.
	*
	* @return the xcg01596 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01596() {
		return _vrTechnicalSpec_XCG.getXCG01596();
	}

	/**
	* Returns the xcg01597 of this vr technical spec_xcg.
	*
	* @return the xcg01597 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01597() {
		return _vrTechnicalSpec_XCG.getXCG01597();
	}

	/**
	* Returns the xcg01598 of this vr technical spec_xcg.
	*
	* @return the xcg01598 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01598() {
		return _vrTechnicalSpec_XCG.getXCG01598();
	}

	/**
	* Returns the xcg01599 of this vr technical spec_xcg.
	*
	* @return the xcg01599 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01599() {
		return _vrTechnicalSpec_XCG.getXCG01599();
	}

	/**
	* Returns the xcg01600 of this vr technical spec_xcg.
	*
	* @return the xcg01600 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01600() {
		return _vrTechnicalSpec_XCG.getXCG01600();
	}

	/**
	* Returns the xcg01601 of this vr technical spec_xcg.
	*
	* @return the xcg01601 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01601() {
		return _vrTechnicalSpec_XCG.getXCG01601();
	}

	/**
	* Returns the xcg01602 of this vr technical spec_xcg.
	*
	* @return the xcg01602 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01602() {
		return _vrTechnicalSpec_XCG.getXCG01602();
	}

	/**
	* Returns the xcg01603 of this vr technical spec_xcg.
	*
	* @return the xcg01603 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01603() {
		return _vrTechnicalSpec_XCG.getXCG01603();
	}

	/**
	* Returns the xcg01604 of this vr technical spec_xcg.
	*
	* @return the xcg01604 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01604() {
		return _vrTechnicalSpec_XCG.getXCG01604();
	}

	/**
	* Returns the xcg01605 of this vr technical spec_xcg.
	*
	* @return the xcg01605 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01605() {
		return _vrTechnicalSpec_XCG.getXCG01605();
	}

	/**
	* Returns the xcg01606 of this vr technical spec_xcg.
	*
	* @return the xcg01606 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01606() {
		return _vrTechnicalSpec_XCG.getXCG01606();
	}

	/**
	* Returns the xcg01607 of this vr technical spec_xcg.
	*
	* @return the xcg01607 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01607() {
		return _vrTechnicalSpec_XCG.getXCG01607();
	}

	/**
	* Returns the xcg01608 of this vr technical spec_xcg.
	*
	* @return the xcg01608 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01608() {
		return _vrTechnicalSpec_XCG.getXCG01608();
	}

	/**
	* Returns the xcg01609 of this vr technical spec_xcg.
	*
	* @return the xcg01609 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01609() {
		return _vrTechnicalSpec_XCG.getXCG01609();
	}

	/**
	* Returns the xcg01610 of this vr technical spec_xcg.
	*
	* @return the xcg01610 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01610() {
		return _vrTechnicalSpec_XCG.getXCG01610();
	}

	/**
	* Returns the xcg01611 of this vr technical spec_xcg.
	*
	* @return the xcg01611 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01611() {
		return _vrTechnicalSpec_XCG.getXCG01611();
	}

	/**
	* Returns the xcg01612 of this vr technical spec_xcg.
	*
	* @return the xcg01612 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01612() {
		return _vrTechnicalSpec_XCG.getXCG01612();
	}

	/**
	* Returns the xcg01613 of this vr technical spec_xcg.
	*
	* @return the xcg01613 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01613() {
		return _vrTechnicalSpec_XCG.getXCG01613();
	}

	/**
	* Returns the xcg01614 of this vr technical spec_xcg.
	*
	* @return the xcg01614 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01614() {
		return _vrTechnicalSpec_XCG.getXCG01614();
	}

	/**
	* Returns the xcg01615 of this vr technical spec_xcg.
	*
	* @return the xcg01615 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01615() {
		return _vrTechnicalSpec_XCG.getXCG01615();
	}

	/**
	* Returns the xcg01616 of this vr technical spec_xcg.
	*
	* @return the xcg01616 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01616() {
		return _vrTechnicalSpec_XCG.getXCG01616();
	}

	/**
	* Returns the xcg01617 of this vr technical spec_xcg.
	*
	* @return the xcg01617 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01617() {
		return _vrTechnicalSpec_XCG.getXCG01617();
	}

	/**
	* Returns the xcg01618 of this vr technical spec_xcg.
	*
	* @return the xcg01618 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01618() {
		return _vrTechnicalSpec_XCG.getXCG01618();
	}

	/**
	* Returns the xcg01619 of this vr technical spec_xcg.
	*
	* @return the xcg01619 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01619() {
		return _vrTechnicalSpec_XCG.getXCG01619();
	}

	/**
	* Returns the xcg01620 of this vr technical spec_xcg.
	*
	* @return the xcg01620 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01620() {
		return _vrTechnicalSpec_XCG.getXCG01620();
	}

	/**
	* Returns the xcg01621 of this vr technical spec_xcg.
	*
	* @return the xcg01621 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01621() {
		return _vrTechnicalSpec_XCG.getXCG01621();
	}

	/**
	* Returns the xcg01622 of this vr technical spec_xcg.
	*
	* @return the xcg01622 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01622() {
		return _vrTechnicalSpec_XCG.getXCG01622();
	}

	/**
	* Returns the xcg01623 of this vr technical spec_xcg.
	*
	* @return the xcg01623 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01623() {
		return _vrTechnicalSpec_XCG.getXCG01623();
	}

	/**
	* Returns the xcg01624 of this vr technical spec_xcg.
	*
	* @return the xcg01624 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01624() {
		return _vrTechnicalSpec_XCG.getXCG01624();
	}

	/**
	* Returns the xcg01625 of this vr technical spec_xcg.
	*
	* @return the xcg01625 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01625() {
		return _vrTechnicalSpec_XCG.getXCG01625();
	}

	/**
	* Returns the xcg01626 of this vr technical spec_xcg.
	*
	* @return the xcg01626 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01626() {
		return _vrTechnicalSpec_XCG.getXCG01626();
	}

	/**
	* Returns the xcg01627 of this vr technical spec_xcg.
	*
	* @return the xcg01627 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01627() {
		return _vrTechnicalSpec_XCG.getXCG01627();
	}

	/**
	* Returns the xcg01628 of this vr technical spec_xcg.
	*
	* @return the xcg01628 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01628() {
		return _vrTechnicalSpec_XCG.getXCG01628();
	}

	/**
	* Returns the xcg01630 of this vr technical spec_xcg.
	*
	* @return the xcg01630 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01630() {
		return _vrTechnicalSpec_XCG.getXCG01630();
	}

	/**
	* Returns the xcg01631 of this vr technical spec_xcg.
	*
	* @return the xcg01631 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01631() {
		return _vrTechnicalSpec_XCG.getXCG01631();
	}

	/**
	* Returns the xcg01632 of this vr technical spec_xcg.
	*
	* @return the xcg01632 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01632() {
		return _vrTechnicalSpec_XCG.getXCG01632();
	}

	/**
	* Returns the xcg01633 of this vr technical spec_xcg.
	*
	* @return the xcg01633 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01633() {
		return _vrTechnicalSpec_XCG.getXCG01633();
	}

	/**
	* Returns the xcg01634 of this vr technical spec_xcg.
	*
	* @return the xcg01634 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01634() {
		return _vrTechnicalSpec_XCG.getXCG01634();
	}

	/**
	* Returns the xcg01635 of this vr technical spec_xcg.
	*
	* @return the xcg01635 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01635() {
		return _vrTechnicalSpec_XCG.getXCG01635();
	}

	/**
	* Returns the xcg01636 of this vr technical spec_xcg.
	*
	* @return the xcg01636 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01636() {
		return _vrTechnicalSpec_XCG.getXCG01636();
	}

	/**
	* Returns the xcg01637 of this vr technical spec_xcg.
	*
	* @return the xcg01637 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01637() {
		return _vrTechnicalSpec_XCG.getXCG01637();
	}

	/**
	* Returns the xcg01638 of this vr technical spec_xcg.
	*
	* @return the xcg01638 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01638() {
		return _vrTechnicalSpec_XCG.getXCG01638();
	}

	/**
	* Returns the xcg01639 of this vr technical spec_xcg.
	*
	* @return the xcg01639 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01639() {
		return _vrTechnicalSpec_XCG.getXCG01639();
	}

	/**
	* Returns the xcg01640 of this vr technical spec_xcg.
	*
	* @return the xcg01640 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01640() {
		return _vrTechnicalSpec_XCG.getXCG01640();
	}

	/**
	* Returns the xcg01641 of this vr technical spec_xcg.
	*
	* @return the xcg01641 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01641() {
		return _vrTechnicalSpec_XCG.getXCG01641();
	}

	/**
	* Returns the xcg01642 of this vr technical spec_xcg.
	*
	* @return the xcg01642 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01642() {
		return _vrTechnicalSpec_XCG.getXCG01642();
	}

	/**
	* Returns the xcg01643 of this vr technical spec_xcg.
	*
	* @return the xcg01643 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01643() {
		return _vrTechnicalSpec_XCG.getXCG01643();
	}

	/**
	* Returns the xcg01644 of this vr technical spec_xcg.
	*
	* @return the xcg01644 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01644() {
		return _vrTechnicalSpec_XCG.getXCG01644();
	}

	/**
	* Returns the xcg01645 of this vr technical spec_xcg.
	*
	* @return the xcg01645 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01645() {
		return _vrTechnicalSpec_XCG.getXCG01645();
	}

	/**
	* Returns the xcg01646 of this vr technical spec_xcg.
	*
	* @return the xcg01646 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01646() {
		return _vrTechnicalSpec_XCG.getXCG01646();
	}

	/**
	* Returns the xcg01647 of this vr technical spec_xcg.
	*
	* @return the xcg01647 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01647() {
		return _vrTechnicalSpec_XCG.getXCG01647();
	}

	/**
	* Returns the xcg01648 of this vr technical spec_xcg.
	*
	* @return the xcg01648 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01648() {
		return _vrTechnicalSpec_XCG.getXCG01648();
	}

	/**
	* Returns the xcg01649 of this vr technical spec_xcg.
	*
	* @return the xcg01649 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01649() {
		return _vrTechnicalSpec_XCG.getXCG01649();
	}

	/**
	* Returns the xcg01650 of this vr technical spec_xcg.
	*
	* @return the xcg01650 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01650() {
		return _vrTechnicalSpec_XCG.getXCG01650();
	}

	/**
	* Returns the xcg01651 of this vr technical spec_xcg.
	*
	* @return the xcg01651 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01651() {
		return _vrTechnicalSpec_XCG.getXCG01651();
	}

	/**
	* Returns the xcg01652 of this vr technical spec_xcg.
	*
	* @return the xcg01652 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01652() {
		return _vrTechnicalSpec_XCG.getXCG01652();
	}

	/**
	* Returns the xcg01653 of this vr technical spec_xcg.
	*
	* @return the xcg01653 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01653() {
		return _vrTechnicalSpec_XCG.getXCG01653();
	}

	/**
	* Returns the xcg01654 of this vr technical spec_xcg.
	*
	* @return the xcg01654 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01654() {
		return _vrTechnicalSpec_XCG.getXCG01654();
	}

	/**
	* Returns the xcg01655 of this vr technical spec_xcg.
	*
	* @return the xcg01655 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01655() {
		return _vrTechnicalSpec_XCG.getXCG01655();
	}

	/**
	* Returns the xcg01656 of this vr technical spec_xcg.
	*
	* @return the xcg01656 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01656() {
		return _vrTechnicalSpec_XCG.getXCG01656();
	}

	/**
	* Returns the xcg01657 of this vr technical spec_xcg.
	*
	* @return the xcg01657 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01657() {
		return _vrTechnicalSpec_XCG.getXCG01657();
	}

	/**
	* Returns the xcg01658 of this vr technical spec_xcg.
	*
	* @return the xcg01658 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01658() {
		return _vrTechnicalSpec_XCG.getXCG01658();
	}

	/**
	* Returns the xcg01659 of this vr technical spec_xcg.
	*
	* @return the xcg01659 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01659() {
		return _vrTechnicalSpec_XCG.getXCG01659();
	}

	/**
	* Returns the xcg01660 of this vr technical spec_xcg.
	*
	* @return the xcg01660 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01660() {
		return _vrTechnicalSpec_XCG.getXCG01660();
	}

	/**
	* Returns the xcg01661 of this vr technical spec_xcg.
	*
	* @return the xcg01661 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01661() {
		return _vrTechnicalSpec_XCG.getXCG01661();
	}

	/**
	* Returns the xcg01662 of this vr technical spec_xcg.
	*
	* @return the xcg01662 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01662() {
		return _vrTechnicalSpec_XCG.getXCG01662();
	}

	/**
	* Returns the xcg01663 of this vr technical spec_xcg.
	*
	* @return the xcg01663 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01663() {
		return _vrTechnicalSpec_XCG.getXCG01663();
	}

	/**
	* Returns the xcg01664 of this vr technical spec_xcg.
	*
	* @return the xcg01664 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01664() {
		return _vrTechnicalSpec_XCG.getXCG01664();
	}

	/**
	* Returns the xcg01665 of this vr technical spec_xcg.
	*
	* @return the xcg01665 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01665() {
		return _vrTechnicalSpec_XCG.getXCG01665();
	}

	/**
	* Returns the xcg01666 of this vr technical spec_xcg.
	*
	* @return the xcg01666 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01666() {
		return _vrTechnicalSpec_XCG.getXCG01666();
	}

	/**
	* Returns the xcg01667 of this vr technical spec_xcg.
	*
	* @return the xcg01667 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01667() {
		return _vrTechnicalSpec_XCG.getXCG01667();
	}

	/**
	* Returns the xcg01668 of this vr technical spec_xcg.
	*
	* @return the xcg01668 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01668() {
		return _vrTechnicalSpec_XCG.getXCG01668();
	}

	/**
	* Returns the xcg01669 of this vr technical spec_xcg.
	*
	* @return the xcg01669 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01669() {
		return _vrTechnicalSpec_XCG.getXCG01669();
	}

	/**
	* Returns the xcg01670 of this vr technical spec_xcg.
	*
	* @return the xcg01670 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01670() {
		return _vrTechnicalSpec_XCG.getXCG01670();
	}

	/**
	* Returns the xcg01671 of this vr technical spec_xcg.
	*
	* @return the xcg01671 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01671() {
		return _vrTechnicalSpec_XCG.getXCG01671();
	}

	/**
	* Returns the xcg01672 of this vr technical spec_xcg.
	*
	* @return the xcg01672 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01672() {
		return _vrTechnicalSpec_XCG.getXCG01672();
	}

	/**
	* Returns the xcg01673 of this vr technical spec_xcg.
	*
	* @return the xcg01673 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01673() {
		return _vrTechnicalSpec_XCG.getXCG01673();
	}

	/**
	* Returns the xcg01674 of this vr technical spec_xcg.
	*
	* @return the xcg01674 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01674() {
		return _vrTechnicalSpec_XCG.getXCG01674();
	}

	/**
	* Returns the xcg01675 of this vr technical spec_xcg.
	*
	* @return the xcg01675 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01675() {
		return _vrTechnicalSpec_XCG.getXCG01675();
	}

	/**
	* Returns the xcg01676 of this vr technical spec_xcg.
	*
	* @return the xcg01676 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01676() {
		return _vrTechnicalSpec_XCG.getXCG01676();
	}

	/**
	* Returns the xcg01677 of this vr technical spec_xcg.
	*
	* @return the xcg01677 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01677() {
		return _vrTechnicalSpec_XCG.getXCG01677();
	}

	/**
	* Returns the xcg01678 of this vr technical spec_xcg.
	*
	* @return the xcg01678 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01678() {
		return _vrTechnicalSpec_XCG.getXCG01678();
	}

	/**
	* Returns the xcg01679 of this vr technical spec_xcg.
	*
	* @return the xcg01679 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01679() {
		return _vrTechnicalSpec_XCG.getXCG01679();
	}

	/**
	* Returns the xcg01680 of this vr technical spec_xcg.
	*
	* @return the xcg01680 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01680() {
		return _vrTechnicalSpec_XCG.getXCG01680();
	}

	/**
	* Returns the xcg01681 of this vr technical spec_xcg.
	*
	* @return the xcg01681 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01681() {
		return _vrTechnicalSpec_XCG.getXCG01681();
	}

	/**
	* Returns the xcg01682 of this vr technical spec_xcg.
	*
	* @return the xcg01682 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01682() {
		return _vrTechnicalSpec_XCG.getXCG01682();
	}

	/**
	* Returns the xcg01683 of this vr technical spec_xcg.
	*
	* @return the xcg01683 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01683() {
		return _vrTechnicalSpec_XCG.getXCG01683();
	}

	/**
	* Returns the xcg01684 of this vr technical spec_xcg.
	*
	* @return the xcg01684 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01684() {
		return _vrTechnicalSpec_XCG.getXCG01684();
	}

	/**
	* Returns the xcg01685 of this vr technical spec_xcg.
	*
	* @return the xcg01685 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01685() {
		return _vrTechnicalSpec_XCG.getXCG01685();
	}

	/**
	* Returns the xcg01686 of this vr technical spec_xcg.
	*
	* @return the xcg01686 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01686() {
		return _vrTechnicalSpec_XCG.getXCG01686();
	}

	/**
	* Returns the xcg01687 of this vr technical spec_xcg.
	*
	* @return the xcg01687 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01687() {
		return _vrTechnicalSpec_XCG.getXCG01687();
	}

	/**
	* Returns the xcg01688 of this vr technical spec_xcg.
	*
	* @return the xcg01688 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01688() {
		return _vrTechnicalSpec_XCG.getXCG01688();
	}

	/**
	* Returns the xcg01689 of this vr technical spec_xcg.
	*
	* @return the xcg01689 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01689() {
		return _vrTechnicalSpec_XCG.getXCG01689();
	}

	/**
	* Returns the xcg01690 of this vr technical spec_xcg.
	*
	* @return the xcg01690 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01690() {
		return _vrTechnicalSpec_XCG.getXCG01690();
	}

	/**
	* Returns the xcg01691 of this vr technical spec_xcg.
	*
	* @return the xcg01691 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01691() {
		return _vrTechnicalSpec_XCG.getXCG01691();
	}

	/**
	* Returns the xcg01692 of this vr technical spec_xcg.
	*
	* @return the xcg01692 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01692() {
		return _vrTechnicalSpec_XCG.getXCG01692();
	}

	/**
	* Returns the xcg01693 of this vr technical spec_xcg.
	*
	* @return the xcg01693 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01693() {
		return _vrTechnicalSpec_XCG.getXCG01693();
	}

	/**
	* Returns the xcg01694 of this vr technical spec_xcg.
	*
	* @return the xcg01694 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01694() {
		return _vrTechnicalSpec_XCG.getXCG01694();
	}

	/**
	* Returns the xcg01695 of this vr technical spec_xcg.
	*
	* @return the xcg01695 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01695() {
		return _vrTechnicalSpec_XCG.getXCG01695();
	}

	/**
	* Returns the xcg01696 of this vr technical spec_xcg.
	*
	* @return the xcg01696 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01696() {
		return _vrTechnicalSpec_XCG.getXCG01696();
	}

	/**
	* Returns the xcg01697 of this vr technical spec_xcg.
	*
	* @return the xcg01697 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01697() {
		return _vrTechnicalSpec_XCG.getXCG01697();
	}

	/**
	* Returns the xcg01698 of this vr technical spec_xcg.
	*
	* @return the xcg01698 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01698() {
		return _vrTechnicalSpec_XCG.getXCG01698();
	}

	/**
	* Returns the xcg01699 of this vr technical spec_xcg.
	*
	* @return the xcg01699 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01699() {
		return _vrTechnicalSpec_XCG.getXCG01699();
	}

	/**
	* Returns the xcg01700 of this vr technical spec_xcg.
	*
	* @return the xcg01700 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01700() {
		return _vrTechnicalSpec_XCG.getXCG01700();
	}

	/**
	* Returns the xcg01701 of this vr technical spec_xcg.
	*
	* @return the xcg01701 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01701() {
		return _vrTechnicalSpec_XCG.getXCG01701();
	}

	/**
	* Returns the xcg01702 of this vr technical spec_xcg.
	*
	* @return the xcg01702 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01702() {
		return _vrTechnicalSpec_XCG.getXCG01702();
	}

	/**
	* Returns the xcg01703 of this vr technical spec_xcg.
	*
	* @return the xcg01703 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01703() {
		return _vrTechnicalSpec_XCG.getXCG01703();
	}

	/**
	* Returns the xcg01704 of this vr technical spec_xcg.
	*
	* @return the xcg01704 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01704() {
		return _vrTechnicalSpec_XCG.getXCG01704();
	}

	/**
	* Returns the xcg01705 of this vr technical spec_xcg.
	*
	* @return the xcg01705 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01705() {
		return _vrTechnicalSpec_XCG.getXCG01705();
	}

	/**
	* Returns the xcg01706 of this vr technical spec_xcg.
	*
	* @return the xcg01706 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01706() {
		return _vrTechnicalSpec_XCG.getXCG01706();
	}

	/**
	* Returns the xcg01707 of this vr technical spec_xcg.
	*
	* @return the xcg01707 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01707() {
		return _vrTechnicalSpec_XCG.getXCG01707();
	}

	/**
	* Returns the xcg01708 of this vr technical spec_xcg.
	*
	* @return the xcg01708 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01708() {
		return _vrTechnicalSpec_XCG.getXCG01708();
	}

	/**
	* Returns the xcg01709 of this vr technical spec_xcg.
	*
	* @return the xcg01709 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01709() {
		return _vrTechnicalSpec_XCG.getXCG01709();
	}

	/**
	* Returns the xcg01710 of this vr technical spec_xcg.
	*
	* @return the xcg01710 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01710() {
		return _vrTechnicalSpec_XCG.getXCG01710();
	}

	/**
	* Returns the xcg01711 of this vr technical spec_xcg.
	*
	* @return the xcg01711 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01711() {
		return _vrTechnicalSpec_XCG.getXCG01711();
	}

	/**
	* Returns the xcg01712 of this vr technical spec_xcg.
	*
	* @return the xcg01712 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01712() {
		return _vrTechnicalSpec_XCG.getXCG01712();
	}

	/**
	* Returns the xcg01713 of this vr technical spec_xcg.
	*
	* @return the xcg01713 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01713() {
		return _vrTechnicalSpec_XCG.getXCG01713();
	}

	/**
	* Returns the xcg01714 of this vr technical spec_xcg.
	*
	* @return the xcg01714 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01714() {
		return _vrTechnicalSpec_XCG.getXCG01714();
	}

	/**
	* Returns the xcg01715 of this vr technical spec_xcg.
	*
	* @return the xcg01715 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01715() {
		return _vrTechnicalSpec_XCG.getXCG01715();
	}

	/**
	* Returns the xcg01716 of this vr technical spec_xcg.
	*
	* @return the xcg01716 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01716() {
		return _vrTechnicalSpec_XCG.getXCG01716();
	}

	/**
	* Returns the xcg01717 of this vr technical spec_xcg.
	*
	* @return the xcg01717 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01717() {
		return _vrTechnicalSpec_XCG.getXCG01717();
	}

	/**
	* Returns the xcg01718 of this vr technical spec_xcg.
	*
	* @return the xcg01718 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01718() {
		return _vrTechnicalSpec_XCG.getXCG01718();
	}

	/**
	* Returns the xcg01719 of this vr technical spec_xcg.
	*
	* @return the xcg01719 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01719() {
		return _vrTechnicalSpec_XCG.getXCG01719();
	}

	/**
	* Returns the xcg01720 of this vr technical spec_xcg.
	*
	* @return the xcg01720 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01720() {
		return _vrTechnicalSpec_XCG.getXCG01720();
	}

	/**
	* Returns the xcg01721 of this vr technical spec_xcg.
	*
	* @return the xcg01721 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01721() {
		return _vrTechnicalSpec_XCG.getXCG01721();
	}

	/**
	* Returns the xcg01722 of this vr technical spec_xcg.
	*
	* @return the xcg01722 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01722() {
		return _vrTechnicalSpec_XCG.getXCG01722();
	}

	/**
	* Returns the xcg01723 of this vr technical spec_xcg.
	*
	* @return the xcg01723 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01723() {
		return _vrTechnicalSpec_XCG.getXCG01723();
	}

	/**
	* Returns the xcg01724 of this vr technical spec_xcg.
	*
	* @return the xcg01724 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01724() {
		return _vrTechnicalSpec_XCG.getXCG01724();
	}

	/**
	* Returns the xcg01725 of this vr technical spec_xcg.
	*
	* @return the xcg01725 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01725() {
		return _vrTechnicalSpec_XCG.getXCG01725();
	}

	/**
	* Returns the xcg01726 of this vr technical spec_xcg.
	*
	* @return the xcg01726 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01726() {
		return _vrTechnicalSpec_XCG.getXCG01726();
	}

	/**
	* Returns the xcg01727 of this vr technical spec_xcg.
	*
	* @return the xcg01727 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01727() {
		return _vrTechnicalSpec_XCG.getXCG01727();
	}

	/**
	* Returns the xcg01728 of this vr technical spec_xcg.
	*
	* @return the xcg01728 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01728() {
		return _vrTechnicalSpec_XCG.getXCG01728();
	}

	/**
	* Returns the xcg01729 of this vr technical spec_xcg.
	*
	* @return the xcg01729 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01729() {
		return _vrTechnicalSpec_XCG.getXCG01729();
	}

	/**
	* Returns the xcg01730 of this vr technical spec_xcg.
	*
	* @return the xcg01730 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01730() {
		return _vrTechnicalSpec_XCG.getXCG01730();
	}

	/**
	* Returns the xcg01731 of this vr technical spec_xcg.
	*
	* @return the xcg01731 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01731() {
		return _vrTechnicalSpec_XCG.getXCG01731();
	}

	/**
	* Returns the xcg01732 of this vr technical spec_xcg.
	*
	* @return the xcg01732 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01732() {
		return _vrTechnicalSpec_XCG.getXCG01732();
	}

	/**
	* Returns the xcg01733 of this vr technical spec_xcg.
	*
	* @return the xcg01733 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01733() {
		return _vrTechnicalSpec_XCG.getXCG01733();
	}

	/**
	* Returns the xcg01734 of this vr technical spec_xcg.
	*
	* @return the xcg01734 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01734() {
		return _vrTechnicalSpec_XCG.getXCG01734();
	}

	/**
	* Returns the xcg01735 of this vr technical spec_xcg.
	*
	* @return the xcg01735 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01735() {
		return _vrTechnicalSpec_XCG.getXCG01735();
	}

	/**
	* Returns the xcg01736 of this vr technical spec_xcg.
	*
	* @return the xcg01736 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01736() {
		return _vrTechnicalSpec_XCG.getXCG01736();
	}

	/**
	* Returns the xcg01737 of this vr technical spec_xcg.
	*
	* @return the xcg01737 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01737() {
		return _vrTechnicalSpec_XCG.getXCG01737();
	}

	/**
	* Returns the xcg01738 of this vr technical spec_xcg.
	*
	* @return the xcg01738 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01738() {
		return _vrTechnicalSpec_XCG.getXCG01738();
	}

	/**
	* Returns the xcg01739 of this vr technical spec_xcg.
	*
	* @return the xcg01739 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01739() {
		return _vrTechnicalSpec_XCG.getXCG01739();
	}

	/**
	* Returns the xcg01740 of this vr technical spec_xcg.
	*
	* @return the xcg01740 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01740() {
		return _vrTechnicalSpec_XCG.getXCG01740();
	}

	/**
	* Returns the xcg01741 of this vr technical spec_xcg.
	*
	* @return the xcg01741 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01741() {
		return _vrTechnicalSpec_XCG.getXCG01741();
	}

	/**
	* Returns the xcg01742 of this vr technical spec_xcg.
	*
	* @return the xcg01742 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01742() {
		return _vrTechnicalSpec_XCG.getXCG01742();
	}

	/**
	* Returns the xcg01744 of this vr technical spec_xcg.
	*
	* @return the xcg01744 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01744() {
		return _vrTechnicalSpec_XCG.getXCG01744();
	}

	/**
	* Returns the xcg01745 of this vr technical spec_xcg.
	*
	* @return the xcg01745 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01745() {
		return _vrTechnicalSpec_XCG.getXCG01745();
	}

	/**
	* Returns the xcg01746 of this vr technical spec_xcg.
	*
	* @return the xcg01746 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01746() {
		return _vrTechnicalSpec_XCG.getXCG01746();
	}

	/**
	* Returns the xcg01747 of this vr technical spec_xcg.
	*
	* @return the xcg01747 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01747() {
		return _vrTechnicalSpec_XCG.getXCG01747();
	}

	/**
	* Returns the xcg01748 of this vr technical spec_xcg.
	*
	* @return the xcg01748 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01748() {
		return _vrTechnicalSpec_XCG.getXCG01748();
	}

	/**
	* Returns the xcg01749 of this vr technical spec_xcg.
	*
	* @return the xcg01749 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01749() {
		return _vrTechnicalSpec_XCG.getXCG01749();
	}

	/**
	* Returns the xcg01750 of this vr technical spec_xcg.
	*
	* @return the xcg01750 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01750() {
		return _vrTechnicalSpec_XCG.getXCG01750();
	}

	/**
	* Returns the xcg01751 of this vr technical spec_xcg.
	*
	* @return the xcg01751 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01751() {
		return _vrTechnicalSpec_XCG.getXCG01751();
	}

	/**
	* Returns the xcg01752 of this vr technical spec_xcg.
	*
	* @return the xcg01752 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01752() {
		return _vrTechnicalSpec_XCG.getXCG01752();
	}

	/**
	* Returns the xcg01753 of this vr technical spec_xcg.
	*
	* @return the xcg01753 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01753() {
		return _vrTechnicalSpec_XCG.getXCG01753();
	}

	/**
	* Returns the xcg01754 of this vr technical spec_xcg.
	*
	* @return the xcg01754 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01754() {
		return _vrTechnicalSpec_XCG.getXCG01754();
	}

	/**
	* Returns the xcg01756 of this vr technical spec_xcg.
	*
	* @return the xcg01756 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01756() {
		return _vrTechnicalSpec_XCG.getXCG01756();
	}

	/**
	* Returns the xcg01757 of this vr technical spec_xcg.
	*
	* @return the xcg01757 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01757() {
		return _vrTechnicalSpec_XCG.getXCG01757();
	}

	/**
	* Returns the xcg01758 of this vr technical spec_xcg.
	*
	* @return the xcg01758 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01758() {
		return _vrTechnicalSpec_XCG.getXCG01758();
	}

	/**
	* Returns the xcg01759 of this vr technical spec_xcg.
	*
	* @return the xcg01759 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01759() {
		return _vrTechnicalSpec_XCG.getXCG01759();
	}

	/**
	* Returns the xcg01760 of this vr technical spec_xcg.
	*
	* @return the xcg01760 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01760() {
		return _vrTechnicalSpec_XCG.getXCG01760();
	}

	/**
	* Returns the xcg01761 of this vr technical spec_xcg.
	*
	* @return the xcg01761 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01761() {
		return _vrTechnicalSpec_XCG.getXCG01761();
	}

	/**
	* Returns the xcg01762 of this vr technical spec_xcg.
	*
	* @return the xcg01762 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01762() {
		return _vrTechnicalSpec_XCG.getXCG01762();
	}

	/**
	* Returns the xcg01763 of this vr technical spec_xcg.
	*
	* @return the xcg01763 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01763() {
		return _vrTechnicalSpec_XCG.getXCG01763();
	}

	/**
	* Returns the xcg01764 of this vr technical spec_xcg.
	*
	* @return the xcg01764 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01764() {
		return _vrTechnicalSpec_XCG.getXCG01764();
	}

	/**
	* Returns the xcg01765 of this vr technical spec_xcg.
	*
	* @return the xcg01765 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01765() {
		return _vrTechnicalSpec_XCG.getXCG01765();
	}

	/**
	* Returns the xcg01766 of this vr technical spec_xcg.
	*
	* @return the xcg01766 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01766() {
		return _vrTechnicalSpec_XCG.getXCG01766();
	}

	/**
	* Returns the xcg01767 of this vr technical spec_xcg.
	*
	* @return the xcg01767 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01767() {
		return _vrTechnicalSpec_XCG.getXCG01767();
	}

	/**
	* Returns the xcg01768 of this vr technical spec_xcg.
	*
	* @return the xcg01768 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01768() {
		return _vrTechnicalSpec_XCG.getXCG01768();
	}

	/**
	* Returns the xcg01769 of this vr technical spec_xcg.
	*
	* @return the xcg01769 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01769() {
		return _vrTechnicalSpec_XCG.getXCG01769();
	}

	/**
	* Returns the xcg01770 of this vr technical spec_xcg.
	*
	* @return the xcg01770 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01770() {
		return _vrTechnicalSpec_XCG.getXCG01770();
	}

	/**
	* Returns the xcg01771 of this vr technical spec_xcg.
	*
	* @return the xcg01771 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01771() {
		return _vrTechnicalSpec_XCG.getXCG01771();
	}

	/**
	* Returns the xcg01772 of this vr technical spec_xcg.
	*
	* @return the xcg01772 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01772() {
		return _vrTechnicalSpec_XCG.getXCG01772();
	}

	/**
	* Returns the xcg01773 of this vr technical spec_xcg.
	*
	* @return the xcg01773 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01773() {
		return _vrTechnicalSpec_XCG.getXCG01773();
	}

	/**
	* Returns the xcg01774 of this vr technical spec_xcg.
	*
	* @return the xcg01774 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01774() {
		return _vrTechnicalSpec_XCG.getXCG01774();
	}

	/**
	* Returns the xcg01775 of this vr technical spec_xcg.
	*
	* @return the xcg01775 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01775() {
		return _vrTechnicalSpec_XCG.getXCG01775();
	}

	/**
	* Returns the xcg01776 of this vr technical spec_xcg.
	*
	* @return the xcg01776 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01776() {
		return _vrTechnicalSpec_XCG.getXCG01776();
	}

	/**
	* Returns the xcg01777 of this vr technical spec_xcg.
	*
	* @return the xcg01777 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01777() {
		return _vrTechnicalSpec_XCG.getXCG01777();
	}

	/**
	* Returns the xcg01778 of this vr technical spec_xcg.
	*
	* @return the xcg01778 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01778() {
		return _vrTechnicalSpec_XCG.getXCG01778();
	}

	/**
	* Returns the xcg01779 of this vr technical spec_xcg.
	*
	* @return the xcg01779 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01779() {
		return _vrTechnicalSpec_XCG.getXCG01779();
	}

	/**
	* Returns the xcg01780 of this vr technical spec_xcg.
	*
	* @return the xcg01780 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01780() {
		return _vrTechnicalSpec_XCG.getXCG01780();
	}

	/**
	* Returns the xcg01781 of this vr technical spec_xcg.
	*
	* @return the xcg01781 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01781() {
		return _vrTechnicalSpec_XCG.getXCG01781();
	}

	/**
	* Returns the xcg01783 of this vr technical spec_xcg.
	*
	* @return the xcg01783 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01783() {
		return _vrTechnicalSpec_XCG.getXCG01783();
	}

	/**
	* Returns the xcg01785 of this vr technical spec_xcg.
	*
	* @return the xcg01785 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01785() {
		return _vrTechnicalSpec_XCG.getXCG01785();
	}

	/**
	* Returns the xcg01786 of this vr technical spec_xcg.
	*
	* @return the xcg01786 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01786() {
		return _vrTechnicalSpec_XCG.getXCG01786();
	}

	/**
	* Returns the xcg01787 of this vr technical spec_xcg.
	*
	* @return the xcg01787 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01787() {
		return _vrTechnicalSpec_XCG.getXCG01787();
	}

	/**
	* Returns the xcg01788 of this vr technical spec_xcg.
	*
	* @return the xcg01788 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01788() {
		return _vrTechnicalSpec_XCG.getXCG01788();
	}

	/**
	* Returns the xcg01789 of this vr technical spec_xcg.
	*
	* @return the xcg01789 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01789() {
		return _vrTechnicalSpec_XCG.getXCG01789();
	}

	/**
	* Returns the xcg01790 of this vr technical spec_xcg.
	*
	* @return the xcg01790 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01790() {
		return _vrTechnicalSpec_XCG.getXCG01790();
	}

	/**
	* Returns the xcg01791 of this vr technical spec_xcg.
	*
	* @return the xcg01791 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01791() {
		return _vrTechnicalSpec_XCG.getXCG01791();
	}

	/**
	* Returns the xcg01792 of this vr technical spec_xcg.
	*
	* @return the xcg01792 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01792() {
		return _vrTechnicalSpec_XCG.getXCG01792();
	}

	/**
	* Returns the xcg01793 of this vr technical spec_xcg.
	*
	* @return the xcg01793 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01793() {
		return _vrTechnicalSpec_XCG.getXCG01793();
	}

	/**
	* Returns the xcg01794 of this vr technical spec_xcg.
	*
	* @return the xcg01794 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01794() {
		return _vrTechnicalSpec_XCG.getXCG01794();
	}

	/**
	* Returns the xcg01795 of this vr technical spec_xcg.
	*
	* @return the xcg01795 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01795() {
		return _vrTechnicalSpec_XCG.getXCG01795();
	}

	/**
	* Returns the xcg01796 of this vr technical spec_xcg.
	*
	* @return the xcg01796 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01796() {
		return _vrTechnicalSpec_XCG.getXCG01796();
	}

	/**
	* Returns the xcg01797 of this vr technical spec_xcg.
	*
	* @return the xcg01797 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01797() {
		return _vrTechnicalSpec_XCG.getXCG01797();
	}

	/**
	* Returns the xcg01798 of this vr technical spec_xcg.
	*
	* @return the xcg01798 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01798() {
		return _vrTechnicalSpec_XCG.getXCG01798();
	}

	/**
	* Returns the xcg01799 of this vr technical spec_xcg.
	*
	* @return the xcg01799 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01799() {
		return _vrTechnicalSpec_XCG.getXCG01799();
	}

	/**
	* Returns the xcg01801 of this vr technical spec_xcg.
	*
	* @return the xcg01801 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01801() {
		return _vrTechnicalSpec_XCG.getXCG01801();
	}

	/**
	* Returns the xcg01802 of this vr technical spec_xcg.
	*
	* @return the xcg01802 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01802() {
		return _vrTechnicalSpec_XCG.getXCG01802();
	}

	/**
	* Returns the xcg01803 of this vr technical spec_xcg.
	*
	* @return the xcg01803 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01803() {
		return _vrTechnicalSpec_XCG.getXCG01803();
	}

	/**
	* Returns the xcg01804 of this vr technical spec_xcg.
	*
	* @return the xcg01804 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01804() {
		return _vrTechnicalSpec_XCG.getXCG01804();
	}

	/**
	* Returns the xcg01805 of this vr technical spec_xcg.
	*
	* @return the xcg01805 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01805() {
		return _vrTechnicalSpec_XCG.getXCG01805();
	}

	/**
	* Returns the xcg01806 of this vr technical spec_xcg.
	*
	* @return the xcg01806 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01806() {
		return _vrTechnicalSpec_XCG.getXCG01806();
	}

	/**
	* Returns the xcg01807 of this vr technical spec_xcg.
	*
	* @return the xcg01807 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01807() {
		return _vrTechnicalSpec_XCG.getXCG01807();
	}

	/**
	* Returns the xcg01808 of this vr technical spec_xcg.
	*
	* @return the xcg01808 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01808() {
		return _vrTechnicalSpec_XCG.getXCG01808();
	}

	/**
	* Returns the xcg01809 of this vr technical spec_xcg.
	*
	* @return the xcg01809 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01809() {
		return _vrTechnicalSpec_XCG.getXCG01809();
	}

	/**
	* Returns the xcg01810 of this vr technical spec_xcg.
	*
	* @return the xcg01810 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01810() {
		return _vrTechnicalSpec_XCG.getXCG01810();
	}

	/**
	* Returns the xcg01811 of this vr technical spec_xcg.
	*
	* @return the xcg01811 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01811() {
		return _vrTechnicalSpec_XCG.getXCG01811();
	}

	/**
	* Returns the xcg01812 of this vr technical spec_xcg.
	*
	* @return the xcg01812 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01812() {
		return _vrTechnicalSpec_XCG.getXCG01812();
	}

	/**
	* Returns the xcg01813 of this vr technical spec_xcg.
	*
	* @return the xcg01813 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01813() {
		return _vrTechnicalSpec_XCG.getXCG01813();
	}

	/**
	* Returns the xcg01814 of this vr technical spec_xcg.
	*
	* @return the xcg01814 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01814() {
		return _vrTechnicalSpec_XCG.getXCG01814();
	}

	/**
	* Returns the xcg01901 of this vr technical spec_xcg.
	*
	* @return the xcg01901 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01901() {
		return _vrTechnicalSpec_XCG.getXCG01901();
	}

	/**
	* Returns the xcg01902 of this vr technical spec_xcg.
	*
	* @return the xcg01902 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01902() {
		return _vrTechnicalSpec_XCG.getXCG01902();
	}

	/**
	* Returns the xcg01903 of this vr technical spec_xcg.
	*
	* @return the xcg01903 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01903() {
		return _vrTechnicalSpec_XCG.getXCG01903();
	}

	/**
	* Returns the xcg01904 of this vr technical spec_xcg.
	*
	* @return the xcg01904 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01904() {
		return _vrTechnicalSpec_XCG.getXCG01904();
	}

	/**
	* Returns the xcg01905 of this vr technical spec_xcg.
	*
	* @return the xcg01905 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01905() {
		return _vrTechnicalSpec_XCG.getXCG01905();
	}

	/**
	* Returns the xcg01906 of this vr technical spec_xcg.
	*
	* @return the xcg01906 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01906() {
		return _vrTechnicalSpec_XCG.getXCG01906();
	}

	/**
	* Returns the xcg01907 of this vr technical spec_xcg.
	*
	* @return the xcg01907 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01907() {
		return _vrTechnicalSpec_XCG.getXCG01907();
	}

	/**
	* Returns the xcg01908 of this vr technical spec_xcg.
	*
	* @return the xcg01908 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01908() {
		return _vrTechnicalSpec_XCG.getXCG01908();
	}

	/**
	* Returns the xcg01909 of this vr technical spec_xcg.
	*
	* @return the xcg01909 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01909() {
		return _vrTechnicalSpec_XCG.getXCG01909();
	}

	/**
	* Returns the xcg01910 of this vr technical spec_xcg.
	*
	* @return the xcg01910 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01910() {
		return _vrTechnicalSpec_XCG.getXCG01910();
	}

	/**
	* Returns the xcg01911 of this vr technical spec_xcg.
	*
	* @return the xcg01911 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01911() {
		return _vrTechnicalSpec_XCG.getXCG01911();
	}

	/**
	* Returns the xcg01912 of this vr technical spec_xcg.
	*
	* @return the xcg01912 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01912() {
		return _vrTechnicalSpec_XCG.getXCG01912();
	}

	/**
	* Returns the xcg01913 of this vr technical spec_xcg.
	*
	* @return the xcg01913 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01913() {
		return _vrTechnicalSpec_XCG.getXCG01913();
	}

	/**
	* Returns the xcg01914 of this vr technical spec_xcg.
	*
	* @return the xcg01914 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01914() {
		return _vrTechnicalSpec_XCG.getXCG01914();
	}

	/**
	* Returns the xcg01915 of this vr technical spec_xcg.
	*
	* @return the xcg01915 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01915() {
		return _vrTechnicalSpec_XCG.getXCG01915();
	}

	/**
	* Returns the xcg01916 of this vr technical spec_xcg.
	*
	* @return the xcg01916 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01916() {
		return _vrTechnicalSpec_XCG.getXCG01916();
	}

	/**
	* Returns the xcg01917 of this vr technical spec_xcg.
	*
	* @return the xcg01917 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01917() {
		return _vrTechnicalSpec_XCG.getXCG01917();
	}

	/**
	* Returns the xcg01918 of this vr technical spec_xcg.
	*
	* @return the xcg01918 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01918() {
		return _vrTechnicalSpec_XCG.getXCG01918();
	}

	/**
	* Returns the xcg01919 of this vr technical spec_xcg.
	*
	* @return the xcg01919 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01919() {
		return _vrTechnicalSpec_XCG.getXCG01919();
	}

	/**
	* Returns the xcg01920 of this vr technical spec_xcg.
	*
	* @return the xcg01920 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01920() {
		return _vrTechnicalSpec_XCG.getXCG01920();
	}

	/**
	* Returns the xcg01921 of this vr technical spec_xcg.
	*
	* @return the xcg01921 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01921() {
		return _vrTechnicalSpec_XCG.getXCG01921();
	}

	/**
	* Returns the xcg01922 of this vr technical spec_xcg.
	*
	* @return the xcg01922 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01922() {
		return _vrTechnicalSpec_XCG.getXCG01922();
	}

	/**
	* Returns the xcg01923 of this vr technical spec_xcg.
	*
	* @return the xcg01923 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01923() {
		return _vrTechnicalSpec_XCG.getXCG01923();
	}

	/**
	* Returns the xcg01924 of this vr technical spec_xcg.
	*
	* @return the xcg01924 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01924() {
		return _vrTechnicalSpec_XCG.getXCG01924();
	}

	/**
	* Returns the xcg01925 of this vr technical spec_xcg.
	*
	* @return the xcg01925 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01925() {
		return _vrTechnicalSpec_XCG.getXCG01925();
	}

	/**
	* Returns the xcg01926 of this vr technical spec_xcg.
	*
	* @return the xcg01926 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01926() {
		return _vrTechnicalSpec_XCG.getXCG01926();
	}

	/**
	* Returns the xcg01928 of this vr technical spec_xcg.
	*
	* @return the xcg01928 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01928() {
		return _vrTechnicalSpec_XCG.getXCG01928();
	}

	/**
	* Returns the xcg01929 of this vr technical spec_xcg.
	*
	* @return the xcg01929 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01929() {
		return _vrTechnicalSpec_XCG.getXCG01929();
	}

	/**
	* Returns the xcg01930 of this vr technical spec_xcg.
	*
	* @return the xcg01930 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01930() {
		return _vrTechnicalSpec_XCG.getXCG01930();
	}

	/**
	* Returns the xcg01931 of this vr technical spec_xcg.
	*
	* @return the xcg01931 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01931() {
		return _vrTechnicalSpec_XCG.getXCG01931();
	}

	/**
	* Returns the xcg01932 of this vr technical spec_xcg.
	*
	* @return the xcg01932 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01932() {
		return _vrTechnicalSpec_XCG.getXCG01932();
	}

	/**
	* Returns the xcg01933 of this vr technical spec_xcg.
	*
	* @return the xcg01933 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01933() {
		return _vrTechnicalSpec_XCG.getXCG01933();
	}

	/**
	* Returns the xcg01934 of this vr technical spec_xcg.
	*
	* @return the xcg01934 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01934() {
		return _vrTechnicalSpec_XCG.getXCG01934();
	}

	/**
	* Returns the xcg01935 of this vr technical spec_xcg.
	*
	* @return the xcg01935 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01935() {
		return _vrTechnicalSpec_XCG.getXCG01935();
	}

	/**
	* Returns the xcg01936 of this vr technical spec_xcg.
	*
	* @return the xcg01936 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01936() {
		return _vrTechnicalSpec_XCG.getXCG01936();
	}

	/**
	* Returns the xcg01937 of this vr technical spec_xcg.
	*
	* @return the xcg01937 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01937() {
		return _vrTechnicalSpec_XCG.getXCG01937();
	}

	/**
	* Returns the xcg01938 of this vr technical spec_xcg.
	*
	* @return the xcg01938 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01938() {
		return _vrTechnicalSpec_XCG.getXCG01938();
	}

	/**
	* Returns the xcg01939 of this vr technical spec_xcg.
	*
	* @return the xcg01939 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01939() {
		return _vrTechnicalSpec_XCG.getXCG01939();
	}

	/**
	* Returns the xcg01940 of this vr technical spec_xcg.
	*
	* @return the xcg01940 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01940() {
		return _vrTechnicalSpec_XCG.getXCG01940();
	}

	/**
	* Returns the xcg01941 of this vr technical spec_xcg.
	*
	* @return the xcg01941 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01941() {
		return _vrTechnicalSpec_XCG.getXCG01941();
	}

	/**
	* Returns the xcg01942 of this vr technical spec_xcg.
	*
	* @return the xcg01942 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01942() {
		return _vrTechnicalSpec_XCG.getXCG01942();
	}

	/**
	* Returns the xcg01943 of this vr technical spec_xcg.
	*
	* @return the xcg01943 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01943() {
		return _vrTechnicalSpec_XCG.getXCG01943();
	}

	/**
	* Returns the xcg01944 of this vr technical spec_xcg.
	*
	* @return the xcg01944 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01944() {
		return _vrTechnicalSpec_XCG.getXCG01944();
	}

	/**
	* Returns the xcg01945 of this vr technical spec_xcg.
	*
	* @return the xcg01945 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01945() {
		return _vrTechnicalSpec_XCG.getXCG01945();
	}

	/**
	* Returns the xcg01946 of this vr technical spec_xcg.
	*
	* @return the xcg01946 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01946() {
		return _vrTechnicalSpec_XCG.getXCG01946();
	}

	/**
	* Returns the xcg01948 of this vr technical spec_xcg.
	*
	* @return the xcg01948 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01948() {
		return _vrTechnicalSpec_XCG.getXCG01948();
	}

	/**
	* Returns the xcg01949 of this vr technical spec_xcg.
	*
	* @return the xcg01949 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01949() {
		return _vrTechnicalSpec_XCG.getXCG01949();
	}

	/**
	* Returns the xcg01950 of this vr technical spec_xcg.
	*
	* @return the xcg01950 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01950() {
		return _vrTechnicalSpec_XCG.getXCG01950();
	}

	/**
	* Returns the xcg01951 of this vr technical spec_xcg.
	*
	* @return the xcg01951 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01951() {
		return _vrTechnicalSpec_XCG.getXCG01951();
	}

	/**
	* Returns the xcg01952 of this vr technical spec_xcg.
	*
	* @return the xcg01952 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01952() {
		return _vrTechnicalSpec_XCG.getXCG01952();
	}

	/**
	* Returns the xcg01953 of this vr technical spec_xcg.
	*
	* @return the xcg01953 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01953() {
		return _vrTechnicalSpec_XCG.getXCG01953();
	}

	/**
	* Returns the xcg01954 of this vr technical spec_xcg.
	*
	* @return the xcg01954 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01954() {
		return _vrTechnicalSpec_XCG.getXCG01954();
	}

	/**
	* Returns the xcg01955 of this vr technical spec_xcg.
	*
	* @return the xcg01955 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01955() {
		return _vrTechnicalSpec_XCG.getXCG01955();
	}

	/**
	* Returns the xcg01956 of this vr technical spec_xcg.
	*
	* @return the xcg01956 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01956() {
		return _vrTechnicalSpec_XCG.getXCG01956();
	}

	/**
	* Returns the xcg01957 of this vr technical spec_xcg.
	*
	* @return the xcg01957 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01957() {
		return _vrTechnicalSpec_XCG.getXCG01957();
	}

	/**
	* Returns the xcg01958 of this vr technical spec_xcg.
	*
	* @return the xcg01958 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01958() {
		return _vrTechnicalSpec_XCG.getXCG01958();
	}

	/**
	* Returns the xcg01959 of this vr technical spec_xcg.
	*
	* @return the xcg01959 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG01959() {
		return _vrTechnicalSpec_XCG.getXCG01959();
	}

	/**
	* Returns the xcg11248 of this vr technical spec_xcg.
	*
	* @return the xcg11248 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG11248() {
		return _vrTechnicalSpec_XCG.getXCG11248();
	}

	/**
	* Returns the xcg11249 of this vr technical spec_xcg.
	*
	* @return the xcg11249 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG11249() {
		return _vrTechnicalSpec_XCG.getXCG11249();
	}

	/**
	* Returns the xcg11253 of this vr technical spec_xcg.
	*
	* @return the xcg11253 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG11253() {
		return _vrTechnicalSpec_XCG.getXCG11253();
	}

	/**
	* Returns the xcg11535 of this vr technical spec_xcg.
	*
	* @return the xcg11535 of this vr technical spec_xcg
	*/
	@Override
	public java.lang.String getXCG11535() {
		return _vrTechnicalSpec_XCG.getXCG11535();
	}

	@Override
	public java.lang.String toString() {
		return _vrTechnicalSpec_XCG.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrTechnicalSpec_XCG.toXmlString();
	}

	/**
	* Returns the modify date of this vr technical spec_xcg.
	*
	* @return the modify date of this vr technical spec_xcg
	*/
	@Override
	public Date getModifyDate() {
		return _vrTechnicalSpec_XCG.getModifyDate();
	}

	/**
	* Returns the sync date of this vr technical spec_xcg.
	*
	* @return the sync date of this vr technical spec_xcg
	*/
	@Override
	public Date getSyncDate() {
		return _vrTechnicalSpec_XCG.getSyncDate();
	}

	/**
	* Returns the convert assemble ID of this vr technical spec_xcg.
	*
	* @return the convert assemble ID of this vr technical spec_xcg
	*/
	@Override
	public long getConvertAssembleId() {
		return _vrTechnicalSpec_XCG.getConvertAssembleId();
	}

	/**
	* Returns the dossier ID of this vr technical spec_xcg.
	*
	* @return the dossier ID of this vr technical spec_xcg
	*/
	@Override
	public long getDossierId() {
		return _vrTechnicalSpec_XCG.getDossierId();
	}

	/**
	* Returns the ID of this vr technical spec_xcg.
	*
	* @return the ID of this vr technical spec_xcg
	*/
	@Override
	public long getId() {
		return _vrTechnicalSpec_XCG.getId();
	}

	/**
	* Returns the mt core of this vr technical spec_xcg.
	*
	* @return the mt core of this vr technical spec_xcg
	*/
	@Override
	public long getMtCore() {
		return _vrTechnicalSpec_XCG.getMtCore();
	}

	/**
	* Returns the primary key of this vr technical spec_xcg.
	*
	* @return the primary key of this vr technical spec_xcg
	*/
	@Override
	public long getPrimaryKey() {
		return _vrTechnicalSpec_XCG.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vrTechnicalSpec_XCG.persist();
	}

	/**
	* Sets the bbcnclklxcg01 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG01 the bbcnclklxcg01 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG01(java.lang.String BBCNCLKLXCG01) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG01(BBCNCLKLXCG01);
	}

	/**
	* Sets the bbcnclklxcg02 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG02 the bbcnclklxcg02 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG02(java.lang.String BBCNCLKLXCG02) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG02(BBCNCLKLXCG02);
	}

	/**
	* Sets the bbcnclklxcg03 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG03 the bbcnclklxcg03 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG03(java.lang.String BBCNCLKLXCG03) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG03(BBCNCLKLXCG03);
	}

	/**
	* Sets the bbcnclklxcg04 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG04 the bbcnclklxcg04 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG04(java.lang.String BBCNCLKLXCG04) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG04(BBCNCLKLXCG04);
	}

	/**
	* Sets the bbcnclklxcg05 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG05 the bbcnclklxcg05 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG05(java.lang.String BBCNCLKLXCG05) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG05(BBCNCLKLXCG05);
	}

	/**
	* Sets the bbcnclklxcg06 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG06 the bbcnclklxcg06 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG06(java.lang.String BBCNCLKLXCG06) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG06(BBCNCLKLXCG06);
	}

	/**
	* Sets the bbcnclklxcg07 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG07 the bbcnclklxcg07 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG07(java.lang.String BBCNCLKLXCG07) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG07(BBCNCLKLXCG07);
	}

	/**
	* Sets the bbcnclklxcg08 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG08 the bbcnclklxcg08 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG08(java.lang.String BBCNCLKLXCG08) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG08(BBCNCLKLXCG08);
	}

	/**
	* Sets the bbcnclklxcg09 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG09 the bbcnclklxcg09 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG09(java.lang.String BBCNCLKLXCG09) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG09(BBCNCLKLXCG09);
	}

	/**
	* Sets the bbcnclklxcg10 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG10 the bbcnclklxcg10 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG10(java.lang.String BBCNCLKLXCG10) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG10(BBCNCLKLXCG10);
	}

	/**
	* Sets the bbcnclklxcg11 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG11 the bbcnclklxcg11 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG11(java.lang.String BBCNCLKLXCG11) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG11(BBCNCLKLXCG11);
	}

	/**
	* Sets the bbcnclklxcg12 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG12 the bbcnclklxcg12 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG12(java.lang.String BBCNCLKLXCG12) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG12(BBCNCLKLXCG12);
	}

	/**
	* Sets the bbcnclklxcg13 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG13 the bbcnclklxcg13 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG13(java.lang.String BBCNCLKLXCG13) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG13(BBCNCLKLXCG13);
	}

	/**
	* Sets the bbcnclklxcg14 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG14 the bbcnclklxcg14 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG14(java.lang.String BBCNCLKLXCG14) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG14(BBCNCLKLXCG14);
	}

	/**
	* Sets the bbcnclklxcg15 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG15 the bbcnclklxcg15 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG15(java.lang.String BBCNCLKLXCG15) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG15(BBCNCLKLXCG15);
	}

	/**
	* Sets the bbcnclklxcg16 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG16 the bbcnclklxcg16 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG16(java.lang.String BBCNCLKLXCG16) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG16(BBCNCLKLXCG16);
	}

	/**
	* Sets the bbcnclklxcg17 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG17 the bbcnclklxcg17 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG17(java.lang.String BBCNCLKLXCG17) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG17(BBCNCLKLXCG17);
	}

	/**
	* Sets the bbcnclklxcg18 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG18 the bbcnclklxcg18 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG18(java.lang.String BBCNCLKLXCG18) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG18(BBCNCLKLXCG18);
	}

	/**
	* Sets the bbcnclklxcg19 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG19 the bbcnclklxcg19 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG19(java.lang.String BBCNCLKLXCG19) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG19(BBCNCLKLXCG19);
	}

	/**
	* Sets the bbcnclklxcg20 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG20 the bbcnclklxcg20 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG20(java.lang.String BBCNCLKLXCG20) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG20(BBCNCLKLXCG20);
	}

	/**
	* Sets the bbcnclklxcg21 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG21 the bbcnclklxcg21 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG21(java.lang.String BBCNCLKLXCG21) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG21(BBCNCLKLXCG21);
	}

	/**
	* Sets the bbcnclklxcg22 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG22 the bbcnclklxcg22 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG22(java.lang.String BBCNCLKLXCG22) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG22(BBCNCLKLXCG22);
	}

	/**
	* Sets the bbcnclklxcg23 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG23 the bbcnclklxcg23 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG23(java.lang.String BBCNCLKLXCG23) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG23(BBCNCLKLXCG23);
	}

	/**
	* Sets the bbcnclklxcg24 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG24 the bbcnclklxcg24 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG24(java.lang.String BBCNCLKLXCG24) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG24(BBCNCLKLXCG24);
	}

	/**
	* Sets the bbcnclklxcg26 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG26 the bbcnclklxcg26 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG26(java.lang.String BBCNCLKLXCG26) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG26(BBCNCLKLXCG26);
	}

	/**
	* Sets the bbcnclklxcg27 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG27 the bbcnclklxcg27 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG27(java.lang.String BBCNCLKLXCG27) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG27(BBCNCLKLXCG27);
	}

	/**
	* Sets the bbcnclklxcg28 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG28 the bbcnclklxcg28 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG28(java.lang.String BBCNCLKLXCG28) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG28(BBCNCLKLXCG28);
	}

	/**
	* Sets the bbcnclklxcg29 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG29 the bbcnclklxcg29 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG29(java.lang.String BBCNCLKLXCG29) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG29(BBCNCLKLXCG29);
	}

	/**
	* Sets the bbcnclklxcg30 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG30 the bbcnclklxcg30 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG30(java.lang.String BBCNCLKLXCG30) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG30(BBCNCLKLXCG30);
	}

	/**
	* Sets the bbcnclklxcg31 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG31 the bbcnclklxcg31 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG31(java.lang.String BBCNCLKLXCG31) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG31(BBCNCLKLXCG31);
	}

	/**
	* Sets the bbcnclklxcg33 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG33 the bbcnclklxcg33 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG33(java.lang.String BBCNCLKLXCG33) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG33(BBCNCLKLXCG33);
	}

	/**
	* Sets the bbcnclklxcg34 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG34 the bbcnclklxcg34 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG34(java.lang.String BBCNCLKLXCG34) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG34(BBCNCLKLXCG34);
	}

	/**
	* Sets the bbcnclklxcg35 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG35 the bbcnclklxcg35 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG35(java.lang.String BBCNCLKLXCG35) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG35(BBCNCLKLXCG35);
	}

	/**
	* Sets the bbcnclklxcg36 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG36 the bbcnclklxcg36 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG36(java.lang.String BBCNCLKLXCG36) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG36(BBCNCLKLXCG36);
	}

	/**
	* Sets the bbcnclklxcg38 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG38 the bbcnclklxcg38 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG38(java.lang.String BBCNCLKLXCG38) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG38(BBCNCLKLXCG38);
	}

	/**
	* Sets the bbcnclklxcg39 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG39 the bbcnclklxcg39 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG39(java.lang.String BBCNCLKLXCG39) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG39(BBCNCLKLXCG39);
	}

	/**
	* Sets the bbcnclklxcg40 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG40 the bbcnclklxcg40 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG40(java.lang.String BBCNCLKLXCG40) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG40(BBCNCLKLXCG40);
	}

	/**
	* Sets the bbcnclklxcg42 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG42 the bbcnclklxcg42 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG42(java.lang.String BBCNCLKLXCG42) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG42(BBCNCLKLXCG42);
	}

	/**
	* Sets the bbcnclklxcg43 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG43 the bbcnclklxcg43 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG43(java.lang.String BBCNCLKLXCG43) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG43(BBCNCLKLXCG43);
	}

	/**
	* Sets the bbcnclklxcg44 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG44 the bbcnclklxcg44 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG44(java.lang.String BBCNCLKLXCG44) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG44(BBCNCLKLXCG44);
	}

	/**
	* Sets the bbcnclklxcg45 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG45 the bbcnclklxcg45 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG45(java.lang.String BBCNCLKLXCG45) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG45(BBCNCLKLXCG45);
	}

	/**
	* Sets the bbcnclklxcg46 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG46 the bbcnclklxcg46 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG46(java.lang.String BBCNCLKLXCG46) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG46(BBCNCLKLXCG46);
	}

	/**
	* Sets the bbcnclklxcg47 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG47 the bbcnclklxcg47 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG47(java.lang.String BBCNCLKLXCG47) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG47(BBCNCLKLXCG47);
	}

	/**
	* Sets the bbcnclklxcg48 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG48 the bbcnclklxcg48 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG48(java.lang.String BBCNCLKLXCG48) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG48(BBCNCLKLXCG48);
	}

	/**
	* Sets the bbcnclklxcg49 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG49 the bbcnclklxcg49 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG49(java.lang.String BBCNCLKLXCG49) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG49(BBCNCLKLXCG49);
	}

	/**
	* Sets the bbcnclklxcg50 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG50 the bbcnclklxcg50 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG50(java.lang.String BBCNCLKLXCG50) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG50(BBCNCLKLXCG50);
	}

	/**
	* Sets the bbcnclklxcg51 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG51 the bbcnclklxcg51 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG51(java.lang.String BBCNCLKLXCG51) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG51(BBCNCLKLXCG51);
	}

	/**
	* Sets the bbcnclklxcg52 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG52 the bbcnclklxcg52 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG52(java.lang.String BBCNCLKLXCG52) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG52(BBCNCLKLXCG52);
	}

	/**
	* Sets the bbcnclklxcg53 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG53 the bbcnclklxcg53 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG53(java.lang.String BBCNCLKLXCG53) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG53(BBCNCLKLXCG53);
	}

	/**
	* Sets the bbcnclklxcg54 of this vr technical spec_xcg.
	*
	* @param BBCNCLKLXCG54 the bbcnclklxcg54 of this vr technical spec_xcg
	*/
	@Override
	public void setBBCNCLKLXCG54(java.lang.String BBCNCLKLXCG54) {
		_vrTechnicalSpec_XCG.setBBCNCLKLXCG54(BBCNCLKLXCG54);
	}

	/**
	* Sets the bbktspmxcg001 of this vr technical spec_xcg.
	*
	* @param BBKTSPMXCG001 the bbktspmxcg001 of this vr technical spec_xcg
	*/
	@Override
	public void setBBKTSPMXCG001(java.lang.String BBKTSPMXCG001) {
		_vrTechnicalSpec_XCG.setBBKTSPMXCG001(BBKTSPMXCG001);
	}

	/**
	* Sets the bbktspmxcg002 of this vr technical spec_xcg.
	*
	* @param BBKTSPMXCG002 the bbktspmxcg002 of this vr technical spec_xcg
	*/
	@Override
	public void setBBKTSPMXCG002(java.lang.String BBKTSPMXCG002) {
		_vrTechnicalSpec_XCG.setBBKTSPMXCG002(BBKTSPMXCG002);
	}

	/**
	* Sets the bbktspmxcg003 of this vr technical spec_xcg.
	*
	* @param BBKTSPMXCG003 the bbktspmxcg003 of this vr technical spec_xcg
	*/
	@Override
	public void setBBKTSPMXCG003(java.lang.String BBKTSPMXCG003) {
		_vrTechnicalSpec_XCG.setBBKTSPMXCG003(BBKTSPMXCG003);
	}

	/**
	* Sets the bbktspmxcg004 of this vr technical spec_xcg.
	*
	* @param BBKTSPMXCG004 the bbktspmxcg004 of this vr technical spec_xcg
	*/
	@Override
	public void setBBKTSPMXCG004(java.lang.String BBKTSPMXCG004) {
		_vrTechnicalSpec_XCG.setBBKTSPMXCG004(BBKTSPMXCG004);
	}

	/**
	* Sets the bbktspmxcg005 of this vr technical spec_xcg.
	*
	* @param BBKTSPMXCG005 the bbktspmxcg005 of this vr technical spec_xcg
	*/
	@Override
	public void setBBKTSPMXCG005(java.lang.String BBKTSPMXCG005) {
		_vrTechnicalSpec_XCG.setBBKTSPMXCG005(BBKTSPMXCG005);
	}

	/**
	* Sets the bbktspmxcg006 of this vr technical spec_xcg.
	*
	* @param BBKTSPMXCG006 the bbktspmxcg006 of this vr technical spec_xcg
	*/
	@Override
	public void setBBKTSPMXCG006(java.lang.String BBKTSPMXCG006) {
		_vrTechnicalSpec_XCG.setBBKTSPMXCG006(BBKTSPMXCG006);
	}

	/**
	* Sets the bbktspmxcg007 of this vr technical spec_xcg.
	*
	* @param BBKTSPMXCG007 the bbktspmxcg007 of this vr technical spec_xcg
	*/
	@Override
	public void setBBKTSPMXCG007(java.lang.String BBKTSPMXCG007) {
		_vrTechnicalSpec_XCG.setBBKTSPMXCG007(BBKTSPMXCG007);
	}

	/**
	* Sets the bbktspmxcg008 of this vr technical spec_xcg.
	*
	* @param BBKTSPMXCG008 the bbktspmxcg008 of this vr technical spec_xcg
	*/
	@Override
	public void setBBKTSPMXCG008(java.lang.String BBKTSPMXCG008) {
		_vrTechnicalSpec_XCG.setBBKTSPMXCG008(BBKTSPMXCG008);
	}

	/**
	* Sets the bbktspmxcg009 of this vr technical spec_xcg.
	*
	* @param BBKTSPMXCG009 the bbktspmxcg009 of this vr technical spec_xcg
	*/
	@Override
	public void setBBKTSPMXCG009(java.lang.String BBKTSPMXCG009) {
		_vrTechnicalSpec_XCG.setBBKTSPMXCG009(BBKTSPMXCG009);
	}

	/**
	* Sets the bbktspmxcg010 of this vr technical spec_xcg.
	*
	* @param BBKTSPMXCG010 the bbktspmxcg010 of this vr technical spec_xcg
	*/
	@Override
	public void setBBKTSPMXCG010(java.lang.String BBKTSPMXCG010) {
		_vrTechnicalSpec_XCG.setBBKTSPMXCG010(BBKTSPMXCG010);
	}

	/**
	* Sets the bbktspmxcg011 of this vr technical spec_xcg.
	*
	* @param BBKTSPMXCG011 the bbktspmxcg011 of this vr technical spec_xcg
	*/
	@Override
	public void setBBKTSPMXCG011(java.lang.String BBKTSPMXCG011) {
		_vrTechnicalSpec_XCG.setBBKTSPMXCG011(BBKTSPMXCG011);
	}

	/**
	* Sets the bbktspmxcg012 of this vr technical spec_xcg.
	*
	* @param BBKTSPMXCG012 the bbktspmxcg012 of this vr technical spec_xcg
	*/
	@Override
	public void setBBKTSPMXCG012(java.lang.String BBKTSPMXCG012) {
		_vrTechnicalSpec_XCG.setBBKTSPMXCG012(BBKTSPMXCG012);
	}

	/**
	* Sets the bbktspmxcg013 of this vr technical spec_xcg.
	*
	* @param BBKTSPMXCG013 the bbktspmxcg013 of this vr technical spec_xcg
	*/
	@Override
	public void setBBKTSPMXCG013(java.lang.String BBKTSPMXCG013) {
		_vrTechnicalSpec_XCG.setBBKTSPMXCG013(BBKTSPMXCG013);
	}

	/**
	* Sets the bbktspmxcg014 of this vr technical spec_xcg.
	*
	* @param BBKTSPMXCG014 the bbktspmxcg014 of this vr technical spec_xcg
	*/
	@Override
	public void setBBKTSPMXCG014(java.lang.String BBKTSPMXCG014) {
		_vrTechnicalSpec_XCG.setBBKTSPMXCG014(BBKTSPMXCG014);
	}

	/**
	* Sets the bbktspmxcg015 of this vr technical spec_xcg.
	*
	* @param BBKTSPMXCG015 the bbktspmxcg015 of this vr technical spec_xcg
	*/
	@Override
	public void setBBKTSPMXCG015(java.lang.String BBKTSPMXCG015) {
		_vrTechnicalSpec_XCG.setBBKTSPMXCG015(BBKTSPMXCG015);
	}

	/**
	* Sets the bbktspmxcg016 of this vr technical spec_xcg.
	*
	* @param BBKTSPMXCG016 the bbktspmxcg016 of this vr technical spec_xcg
	*/
	@Override
	public void setBBKTSPMXCG016(java.lang.String BBKTSPMXCG016) {
		_vrTechnicalSpec_XCG.setBBKTSPMXCG016(BBKTSPMXCG016);
	}

	/**
	* Sets the bbktspmxcg017 of this vr technical spec_xcg.
	*
	* @param BBKTSPMXCG017 the bbktspmxcg017 of this vr technical spec_xcg
	*/
	@Override
	public void setBBKTSPMXCG017(java.lang.String BBKTSPMXCG017) {
		_vrTechnicalSpec_XCG.setBBKTSPMXCG017(BBKTSPMXCG017);
	}

	/**
	* Sets the bbktspmxcg018 of this vr technical spec_xcg.
	*
	* @param BBKTSPMXCG018 the bbktspmxcg018 of this vr technical spec_xcg
	*/
	@Override
	public void setBBKTSPMXCG018(java.lang.String BBKTSPMXCG018) {
		_vrTechnicalSpec_XCG.setBBKTSPMXCG018(BBKTSPMXCG018);
	}

	/**
	* Sets the bbktspmxcg019 of this vr technical spec_xcg.
	*
	* @param BBKTSPMXCG019 the bbktspmxcg019 of this vr technical spec_xcg
	*/
	@Override
	public void setBBKTSPMXCG019(java.lang.String BBKTSPMXCG019) {
		_vrTechnicalSpec_XCG.setBBKTSPMXCG019(BBKTSPMXCG019);
	}

	/**
	* Sets the bbktspmxcg020 of this vr technical spec_xcg.
	*
	* @param BBKTSPMXCG020 the bbktspmxcg020 of this vr technical spec_xcg
	*/
	@Override
	public void setBBKTSPMXCG020(java.lang.String BBKTSPMXCG020) {
		_vrTechnicalSpec_XCG.setBBKTSPMXCG020(BBKTSPMXCG020);
	}

	/**
	* Sets the bbktspmxcg021 of this vr technical spec_xcg.
	*
	* @param BBKTSPMXCG021 the bbktspmxcg021 of this vr technical spec_xcg
	*/
	@Override
	public void setBBKTSPMXCG021(java.lang.String BBKTSPMXCG021) {
		_vrTechnicalSpec_XCG.setBBKTSPMXCG021(BBKTSPMXCG021);
	}

	/**
	* Sets the bbktspmxcg022 of this vr technical spec_xcg.
	*
	* @param BBKTSPMXCG022 the bbktspmxcg022 of this vr technical spec_xcg
	*/
	@Override
	public void setBBKTSPMXCG022(java.lang.String BBKTSPMXCG022) {
		_vrTechnicalSpec_XCG.setBBKTSPMXCG022(BBKTSPMXCG022);
	}

	/**
	* Sets the bbktspmxcg023 of this vr technical spec_xcg.
	*
	* @param BBKTSPMXCG023 the bbktspmxcg023 of this vr technical spec_xcg
	*/
	@Override
	public void setBBKTSPMXCG023(java.lang.String BBKTSPMXCG023) {
		_vrTechnicalSpec_XCG.setBBKTSPMXCG023(BBKTSPMXCG023);
	}

	/**
	* Sets the bbktspmxcg024 of this vr technical spec_xcg.
	*
	* @param BBKTSPMXCG024 the bbktspmxcg024 of this vr technical spec_xcg
	*/
	@Override
	public void setBBKTSPMXCG024(java.lang.String BBKTSPMXCG024) {
		_vrTechnicalSpec_XCG.setBBKTSPMXCG024(BBKTSPMXCG024);
	}

	/**
	* Sets the bbktspmxcg025 of this vr technical spec_xcg.
	*
	* @param BBKTSPMXCG025 the bbktspmxcg025 of this vr technical spec_xcg
	*/
	@Override
	public void setBBKTSPMXCG025(java.lang.String BBKTSPMXCG025) {
		_vrTechnicalSpec_XCG.setBBKTSPMXCG025(BBKTSPMXCG025);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrTechnicalSpec_XCG.setCachedModel(cachedModel);
	}

	/**
	* Sets the convert assemble ID of this vr technical spec_xcg.
	*
	* @param convertAssembleId the convert assemble ID of this vr technical spec_xcg
	*/
	@Override
	public void setConvertAssembleId(long convertAssembleId) {
		_vrTechnicalSpec_XCG.setConvertAssembleId(convertAssembleId);
	}

	/**
	* Sets the deliverable code of this vr technical spec_xcg.
	*
	* @param deliverableCode the deliverable code of this vr technical spec_xcg
	*/
	@Override
	public void setDeliverableCode(java.lang.String deliverableCode) {
		_vrTechnicalSpec_XCG.setDeliverableCode(deliverableCode);
	}

	/**
	* Sets the dossier ID of this vr technical spec_xcg.
	*
	* @param dossierId the dossier ID of this vr technical spec_xcg
	*/
	@Override
	public void setDossierId(long dossierId) {
		_vrTechnicalSpec_XCG.setDossierId(dossierId);
	}

	/**
	* Sets the dossier ID ctn of this vr technical spec_xcg.
	*
	* @param dossierIdCTN the dossier ID ctn of this vr technical spec_xcg
	*/
	@Override
	public void setDossierIdCTN(java.lang.String dossierIdCTN) {
		_vrTechnicalSpec_XCG.setDossierIdCTN(dossierIdCTN);
	}

	/**
	* Sets the dossier no of this vr technical spec_xcg.
	*
	* @param dossierNo the dossier no of this vr technical spec_xcg
	*/
	@Override
	public void setDossierNo(java.lang.String dossierNo) {
		_vrTechnicalSpec_XCG.setDossierNo(dossierNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrTechnicalSpec_XCG.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrTechnicalSpec_XCG.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrTechnicalSpec_XCG.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr technical spec_xcg.
	*
	* @param id the ID of this vr technical spec_xcg
	*/
	@Override
	public void setId(long id) {
		_vrTechnicalSpec_XCG.setId(id);
	}

	/**
	* Sets the loai_dong_co of this vr technical spec_xcg.
	*
	* @param loai_dong_co the loai_dong_co of this vr technical spec_xcg
	*/
	@Override
	public void setLoai_dong_co(java.lang.String loai_dong_co) {
		_vrTechnicalSpec_XCG.setLoai_dong_co(loai_dong_co);
	}

	/**
	* Sets the modify date of this vr technical spec_xcg.
	*
	* @param modifyDate the modify date of this vr technical spec_xcg
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrTechnicalSpec_XCG.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vr technical spec_xcg.
	*
	* @param mtCore the mt core of this vr technical spec_xcg
	*/
	@Override
	public void setMtCore(long mtCore) {
		_vrTechnicalSpec_XCG.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrTechnicalSpec_XCG.setNew(n);
	}

	/**
	* Sets the primary key of this vr technical spec_xcg.
	*
	* @param primaryKey the primary key of this vr technical spec_xcg
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrTechnicalSpec_XCG.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrTechnicalSpec_XCG.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the reference uid of this vr technical spec_xcg.
	*
	* @param referenceUid the reference uid of this vr technical spec_xcg
	*/
	@Override
	public void setReferenceUid(java.lang.String referenceUid) {
		_vrTechnicalSpec_XCG.setReferenceUid(referenceUid);
	}

	/**
	* Sets the sync date of this vr technical spec_xcg.
	*
	* @param syncDate the sync date of this vr technical spec_xcg
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrTechnicalSpec_XCG.setSyncDate(syncDate);
	}

	/**
	* Sets the tdtkxcg001 of this vr technical spec_xcg.
	*
	* @param TDTKXCG001 the tdtkxcg001 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG001(java.lang.String TDTKXCG001) {
		_vrTechnicalSpec_XCG.setTDTKXCG001(TDTKXCG001);
	}

	/**
	* Sets the tdtkxcg002 of this vr technical spec_xcg.
	*
	* @param TDTKXCG002 the tdtkxcg002 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG002(java.lang.String TDTKXCG002) {
		_vrTechnicalSpec_XCG.setTDTKXCG002(TDTKXCG002);
	}

	/**
	* Sets the tdtkxcg003 of this vr technical spec_xcg.
	*
	* @param TDTKXCG003 the tdtkxcg003 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG003(java.lang.String TDTKXCG003) {
		_vrTechnicalSpec_XCG.setTDTKXCG003(TDTKXCG003);
	}

	/**
	* Sets the tdtkxcg004 of this vr technical spec_xcg.
	*
	* @param TDTKXCG004 the tdtkxcg004 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG004(java.lang.String TDTKXCG004) {
		_vrTechnicalSpec_XCG.setTDTKXCG004(TDTKXCG004);
	}

	/**
	* Sets the tdtkxcg005 of this vr technical spec_xcg.
	*
	* @param TDTKXCG005 the tdtkxcg005 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG005(java.lang.String TDTKXCG005) {
		_vrTechnicalSpec_XCG.setTDTKXCG005(TDTKXCG005);
	}

	/**
	* Sets the tdtkxcg006 of this vr technical spec_xcg.
	*
	* @param TDTKXCG006 the tdtkxcg006 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG006(java.lang.String TDTKXCG006) {
		_vrTechnicalSpec_XCG.setTDTKXCG006(TDTKXCG006);
	}

	/**
	* Sets the tdtkxcg007 of this vr technical spec_xcg.
	*
	* @param TDTKXCG007 the tdtkxcg007 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG007(java.lang.String TDTKXCG007) {
		_vrTechnicalSpec_XCG.setTDTKXCG007(TDTKXCG007);
	}

	/**
	* Sets the tdtkxcg008 of this vr technical spec_xcg.
	*
	* @param TDTKXCG008 the tdtkxcg008 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG008(java.lang.String TDTKXCG008) {
		_vrTechnicalSpec_XCG.setTDTKXCG008(TDTKXCG008);
	}

	/**
	* Sets the tdtkxcg009 of this vr technical spec_xcg.
	*
	* @param TDTKXCG009 the tdtkxcg009 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG009(java.lang.String TDTKXCG009) {
		_vrTechnicalSpec_XCG.setTDTKXCG009(TDTKXCG009);
	}

	/**
	* Sets the tdtkxcg010 of this vr technical spec_xcg.
	*
	* @param TDTKXCG010 the tdtkxcg010 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG010(java.lang.String TDTKXCG010) {
		_vrTechnicalSpec_XCG.setTDTKXCG010(TDTKXCG010);
	}

	/**
	* Sets the tdtkxcg011 of this vr technical spec_xcg.
	*
	* @param TDTKXCG011 the tdtkxcg011 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG011(java.lang.String TDTKXCG011) {
		_vrTechnicalSpec_XCG.setTDTKXCG011(TDTKXCG011);
	}

	/**
	* Sets the tdtkxcg012 of this vr technical spec_xcg.
	*
	* @param TDTKXCG012 the tdtkxcg012 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG012(java.lang.String TDTKXCG012) {
		_vrTechnicalSpec_XCG.setTDTKXCG012(TDTKXCG012);
	}

	/**
	* Sets the tdtkxcg013 of this vr technical spec_xcg.
	*
	* @param TDTKXCG013 the tdtkxcg013 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG013(java.lang.String TDTKXCG013) {
		_vrTechnicalSpec_XCG.setTDTKXCG013(TDTKXCG013);
	}

	/**
	* Sets the tdtkxcg014 of this vr technical spec_xcg.
	*
	* @param TDTKXCG014 the tdtkxcg014 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG014(java.lang.String TDTKXCG014) {
		_vrTechnicalSpec_XCG.setTDTKXCG014(TDTKXCG014);
	}

	/**
	* Sets the tdtkxcg015 of this vr technical spec_xcg.
	*
	* @param TDTKXCG015 the tdtkxcg015 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG015(java.lang.String TDTKXCG015) {
		_vrTechnicalSpec_XCG.setTDTKXCG015(TDTKXCG015);
	}

	/**
	* Sets the tdtkxcg016 of this vr technical spec_xcg.
	*
	* @param TDTKXCG016 the tdtkxcg016 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG016(java.lang.String TDTKXCG016) {
		_vrTechnicalSpec_XCG.setTDTKXCG016(TDTKXCG016);
	}

	/**
	* Sets the tdtkxcg017 of this vr technical spec_xcg.
	*
	* @param TDTKXCG017 the tdtkxcg017 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG017(java.lang.String TDTKXCG017) {
		_vrTechnicalSpec_XCG.setTDTKXCG017(TDTKXCG017);
	}

	/**
	* Sets the tdtkxcg018 of this vr technical spec_xcg.
	*
	* @param TDTKXCG018 the tdtkxcg018 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG018(java.lang.String TDTKXCG018) {
		_vrTechnicalSpec_XCG.setTDTKXCG018(TDTKXCG018);
	}

	/**
	* Sets the tdtkxcg019 of this vr technical spec_xcg.
	*
	* @param TDTKXCG019 the tdtkxcg019 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG019(java.lang.String TDTKXCG019) {
		_vrTechnicalSpec_XCG.setTDTKXCG019(TDTKXCG019);
	}

	/**
	* Sets the tdtkxcg020 of this vr technical spec_xcg.
	*
	* @param TDTKXCG020 the tdtkxcg020 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG020(java.lang.String TDTKXCG020) {
		_vrTechnicalSpec_XCG.setTDTKXCG020(TDTKXCG020);
	}

	/**
	* Sets the tdtkxcg021 of this vr technical spec_xcg.
	*
	* @param TDTKXCG021 the tdtkxcg021 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG021(java.lang.String TDTKXCG021) {
		_vrTechnicalSpec_XCG.setTDTKXCG021(TDTKXCG021);
	}

	/**
	* Sets the tdtkxcg022 of this vr technical spec_xcg.
	*
	* @param TDTKXCG022 the tdtkxcg022 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG022(java.lang.String TDTKXCG022) {
		_vrTechnicalSpec_XCG.setTDTKXCG022(TDTKXCG022);
	}

	/**
	* Sets the tdtkxcg023 of this vr technical spec_xcg.
	*
	* @param TDTKXCG023 the tdtkxcg023 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG023(java.lang.String TDTKXCG023) {
		_vrTechnicalSpec_XCG.setTDTKXCG023(TDTKXCG023);
	}

	/**
	* Sets the tdtkxcg024 of this vr technical spec_xcg.
	*
	* @param TDTKXCG024 the tdtkxcg024 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG024(java.lang.String TDTKXCG024) {
		_vrTechnicalSpec_XCG.setTDTKXCG024(TDTKXCG024);
	}

	/**
	* Sets the tdtkxcg025 of this vr technical spec_xcg.
	*
	* @param TDTKXCG025 the tdtkxcg025 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG025(java.lang.String TDTKXCG025) {
		_vrTechnicalSpec_XCG.setTDTKXCG025(TDTKXCG025);
	}

	/**
	* Sets the tdtkxcg026 of this vr technical spec_xcg.
	*
	* @param TDTKXCG026 the tdtkxcg026 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG026(java.lang.String TDTKXCG026) {
		_vrTechnicalSpec_XCG.setTDTKXCG026(TDTKXCG026);
	}

	/**
	* Sets the tdtkxcg027 of this vr technical spec_xcg.
	*
	* @param TDTKXCG027 the tdtkxcg027 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG027(java.lang.String TDTKXCG027) {
		_vrTechnicalSpec_XCG.setTDTKXCG027(TDTKXCG027);
	}

	/**
	* Sets the tdtkxcg028 of this vr technical spec_xcg.
	*
	* @param TDTKXCG028 the tdtkxcg028 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG028(java.lang.String TDTKXCG028) {
		_vrTechnicalSpec_XCG.setTDTKXCG028(TDTKXCG028);
	}

	/**
	* Sets the tdtkxcg029 of this vr technical spec_xcg.
	*
	* @param TDTKXCG029 the tdtkxcg029 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG029(java.lang.String TDTKXCG029) {
		_vrTechnicalSpec_XCG.setTDTKXCG029(TDTKXCG029);
	}

	/**
	* Sets the tdtkxcg030 of this vr technical spec_xcg.
	*
	* @param TDTKXCG030 the tdtkxcg030 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG030(java.lang.String TDTKXCG030) {
		_vrTechnicalSpec_XCG.setTDTKXCG030(TDTKXCG030);
	}

	/**
	* Sets the tdtkxcg031 of this vr technical spec_xcg.
	*
	* @param TDTKXCG031 the tdtkxcg031 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG031(java.lang.String TDTKXCG031) {
		_vrTechnicalSpec_XCG.setTDTKXCG031(TDTKXCG031);
	}

	/**
	* Sets the tdtkxcg032 of this vr technical spec_xcg.
	*
	* @param TDTKXCG032 the tdtkxcg032 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG032(java.lang.String TDTKXCG032) {
		_vrTechnicalSpec_XCG.setTDTKXCG032(TDTKXCG032);
	}

	/**
	* Sets the tdtkxcg033 of this vr technical spec_xcg.
	*
	* @param TDTKXCG033 the tdtkxcg033 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG033(java.lang.String TDTKXCG033) {
		_vrTechnicalSpec_XCG.setTDTKXCG033(TDTKXCG033);
	}

	/**
	* Sets the tdtkxcg034 of this vr technical spec_xcg.
	*
	* @param TDTKXCG034 the tdtkxcg034 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG034(java.lang.String TDTKXCG034) {
		_vrTechnicalSpec_XCG.setTDTKXCG034(TDTKXCG034);
	}

	/**
	* Sets the tdtkxcg035 of this vr technical spec_xcg.
	*
	* @param TDTKXCG035 the tdtkxcg035 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG035(java.lang.String TDTKXCG035) {
		_vrTechnicalSpec_XCG.setTDTKXCG035(TDTKXCG035);
	}

	/**
	* Sets the tdtkxcg036 of this vr technical spec_xcg.
	*
	* @param TDTKXCG036 the tdtkxcg036 of this vr technical spec_xcg
	*/
	@Override
	public void setTDTKXCG036(java.lang.String TDTKXCG036) {
		_vrTechnicalSpec_XCG.setTDTKXCG036(TDTKXCG036);
	}

	/**
	* Sets the xcg01001 of this vr technical spec_xcg.
	*
	* @param XCG01001 the xcg01001 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01001(java.lang.String XCG01001) {
		_vrTechnicalSpec_XCG.setXCG01001(XCG01001);
	}

	/**
	* Sets the xcg01002 of this vr technical spec_xcg.
	*
	* @param XCG01002 the xcg01002 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01002(java.lang.String XCG01002) {
		_vrTechnicalSpec_XCG.setXCG01002(XCG01002);
	}

	/**
	* Sets the xcg01003 of this vr technical spec_xcg.
	*
	* @param XCG01003 the xcg01003 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01003(java.lang.String XCG01003) {
		_vrTechnicalSpec_XCG.setXCG01003(XCG01003);
	}

	/**
	* Sets the xcg01004 of this vr technical spec_xcg.
	*
	* @param XCG01004 the xcg01004 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01004(java.lang.String XCG01004) {
		_vrTechnicalSpec_XCG.setXCG01004(XCG01004);
	}

	/**
	* Sets the xcg01005 of this vr technical spec_xcg.
	*
	* @param XCG01005 the xcg01005 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01005(java.lang.String XCG01005) {
		_vrTechnicalSpec_XCG.setXCG01005(XCG01005);
	}

	/**
	* Sets the xcg01006 of this vr technical spec_xcg.
	*
	* @param XCG01006 the xcg01006 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01006(java.lang.String XCG01006) {
		_vrTechnicalSpec_XCG.setXCG01006(XCG01006);
	}

	/**
	* Sets the xcg01007 of this vr technical spec_xcg.
	*
	* @param XCG01007 the xcg01007 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01007(java.lang.String XCG01007) {
		_vrTechnicalSpec_XCG.setXCG01007(XCG01007);
	}

	/**
	* Sets the xcg01008 of this vr technical spec_xcg.
	*
	* @param XCG01008 the xcg01008 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01008(java.lang.String XCG01008) {
		_vrTechnicalSpec_XCG.setXCG01008(XCG01008);
	}

	/**
	* Sets the xcg01009 of this vr technical spec_xcg.
	*
	* @param XCG01009 the xcg01009 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01009(java.lang.String XCG01009) {
		_vrTechnicalSpec_XCG.setXCG01009(XCG01009);
	}

	/**
	* Sets the xcg01010 of this vr technical spec_xcg.
	*
	* @param XCG01010 the xcg01010 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01010(java.lang.String XCG01010) {
		_vrTechnicalSpec_XCG.setXCG01010(XCG01010);
	}

	/**
	* Sets the xcg01011 of this vr technical spec_xcg.
	*
	* @param XCG01011 the xcg01011 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01011(java.lang.String XCG01011) {
		_vrTechnicalSpec_XCG.setXCG01011(XCG01011);
	}

	/**
	* Sets the xcg01012 of this vr technical spec_xcg.
	*
	* @param XCG01012 the xcg01012 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01012(java.lang.String XCG01012) {
		_vrTechnicalSpec_XCG.setXCG01012(XCG01012);
	}

	/**
	* Sets the xcg01013 of this vr technical spec_xcg.
	*
	* @param XCG01013 the xcg01013 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01013(java.lang.String XCG01013) {
		_vrTechnicalSpec_XCG.setXCG01013(XCG01013);
	}

	/**
	* Sets the xcg01014 of this vr technical spec_xcg.
	*
	* @param XCG01014 the xcg01014 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01014(java.lang.String XCG01014) {
		_vrTechnicalSpec_XCG.setXCG01014(XCG01014);
	}

	/**
	* Sets the xcg01016 of this vr technical spec_xcg.
	*
	* @param XCG01016 the xcg01016 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01016(java.lang.String XCG01016) {
		_vrTechnicalSpec_XCG.setXCG01016(XCG01016);
	}

	/**
	* Sets the xcg01017 of this vr technical spec_xcg.
	*
	* @param XCG01017 the xcg01017 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01017(java.lang.String XCG01017) {
		_vrTechnicalSpec_XCG.setXCG01017(XCG01017);
	}

	/**
	* Sets the xcg01019 of this vr technical spec_xcg.
	*
	* @param XCG01019 the xcg01019 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01019(java.lang.String XCG01019) {
		_vrTechnicalSpec_XCG.setXCG01019(XCG01019);
	}

	/**
	* Sets the xcg01020 of this vr technical spec_xcg.
	*
	* @param XCG01020 the xcg01020 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01020(java.lang.String XCG01020) {
		_vrTechnicalSpec_XCG.setXCG01020(XCG01020);
	}

	/**
	* Sets the xcg01021 of this vr technical spec_xcg.
	*
	* @param XCG01021 the xcg01021 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01021(java.lang.String XCG01021) {
		_vrTechnicalSpec_XCG.setXCG01021(XCG01021);
	}

	/**
	* Sets the xcg01022 of this vr technical spec_xcg.
	*
	* @param XCG01022 the xcg01022 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01022(java.lang.String XCG01022) {
		_vrTechnicalSpec_XCG.setXCG01022(XCG01022);
	}

	/**
	* Sets the xcg01024 of this vr technical spec_xcg.
	*
	* @param XCG01024 the xcg01024 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01024(java.lang.String XCG01024) {
		_vrTechnicalSpec_XCG.setXCG01024(XCG01024);
	}

	/**
	* Sets the xcg01025 of this vr technical spec_xcg.
	*
	* @param XCG01025 the xcg01025 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01025(java.lang.String XCG01025) {
		_vrTechnicalSpec_XCG.setXCG01025(XCG01025);
	}

	/**
	* Sets the xcg01026 of this vr technical spec_xcg.
	*
	* @param XCG01026 the xcg01026 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01026(java.lang.String XCG01026) {
		_vrTechnicalSpec_XCG.setXCG01026(XCG01026);
	}

	/**
	* Sets the xcg01027 of this vr technical spec_xcg.
	*
	* @param XCG01027 the xcg01027 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01027(java.lang.String XCG01027) {
		_vrTechnicalSpec_XCG.setXCG01027(XCG01027);
	}

	/**
	* Sets the xcg01028 of this vr technical spec_xcg.
	*
	* @param XCG01028 the xcg01028 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01028(java.lang.String XCG01028) {
		_vrTechnicalSpec_XCG.setXCG01028(XCG01028);
	}

	/**
	* Sets the xcg01030 of this vr technical spec_xcg.
	*
	* @param XCG01030 the xcg01030 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01030(java.lang.String XCG01030) {
		_vrTechnicalSpec_XCG.setXCG01030(XCG01030);
	}

	/**
	* Sets the xcg01031 of this vr technical spec_xcg.
	*
	* @param XCG01031 the xcg01031 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01031(java.lang.String XCG01031) {
		_vrTechnicalSpec_XCG.setXCG01031(XCG01031);
	}

	/**
	* Sets the xcg01032 of this vr technical spec_xcg.
	*
	* @param XCG01032 the xcg01032 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01032(java.lang.String XCG01032) {
		_vrTechnicalSpec_XCG.setXCG01032(XCG01032);
	}

	/**
	* Sets the xcg01033 of this vr technical spec_xcg.
	*
	* @param XCG01033 the xcg01033 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01033(java.lang.String XCG01033) {
		_vrTechnicalSpec_XCG.setXCG01033(XCG01033);
	}

	/**
	* Sets the xcg01034 of this vr technical spec_xcg.
	*
	* @param XCG01034 the xcg01034 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01034(java.lang.String XCG01034) {
		_vrTechnicalSpec_XCG.setXCG01034(XCG01034);
	}

	/**
	* Sets the xcg01035 of this vr technical spec_xcg.
	*
	* @param XCG01035 the xcg01035 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01035(java.lang.String XCG01035) {
		_vrTechnicalSpec_XCG.setXCG01035(XCG01035);
	}

	/**
	* Sets the xcg01036 of this vr technical spec_xcg.
	*
	* @param XCG01036 the xcg01036 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01036(java.lang.String XCG01036) {
		_vrTechnicalSpec_XCG.setXCG01036(XCG01036);
	}

	/**
	* Sets the xcg01037 of this vr technical spec_xcg.
	*
	* @param XCG01037 the xcg01037 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01037(java.lang.String XCG01037) {
		_vrTechnicalSpec_XCG.setXCG01037(XCG01037);
	}

	/**
	* Sets the xcg01038 of this vr technical spec_xcg.
	*
	* @param XCG01038 the xcg01038 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01038(java.lang.String XCG01038) {
		_vrTechnicalSpec_XCG.setXCG01038(XCG01038);
	}

	/**
	* Sets the xcg01039 of this vr technical spec_xcg.
	*
	* @param XCG01039 the xcg01039 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01039(java.lang.String XCG01039) {
		_vrTechnicalSpec_XCG.setXCG01039(XCG01039);
	}

	/**
	* Sets the xcg01040 of this vr technical spec_xcg.
	*
	* @param XCG01040 the xcg01040 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01040(java.lang.String XCG01040) {
		_vrTechnicalSpec_XCG.setXCG01040(XCG01040);
	}

	/**
	* Sets the xcg01041 of this vr technical spec_xcg.
	*
	* @param XCG01041 the xcg01041 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01041(java.lang.String XCG01041) {
		_vrTechnicalSpec_XCG.setXCG01041(XCG01041);
	}

	/**
	* Sets the xcg01042 of this vr technical spec_xcg.
	*
	* @param XCG01042 the xcg01042 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01042(java.lang.String XCG01042) {
		_vrTechnicalSpec_XCG.setXCG01042(XCG01042);
	}

	/**
	* Sets the xcg01043 of this vr technical spec_xcg.
	*
	* @param XCG01043 the xcg01043 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01043(java.lang.String XCG01043) {
		_vrTechnicalSpec_XCG.setXCG01043(XCG01043);
	}

	/**
	* Sets the xcg01044 of this vr technical spec_xcg.
	*
	* @param XCG01044 the xcg01044 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01044(java.lang.String XCG01044) {
		_vrTechnicalSpec_XCG.setXCG01044(XCG01044);
	}

	/**
	* Sets the xcg01045 of this vr technical spec_xcg.
	*
	* @param XCG01045 the xcg01045 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01045(java.lang.String XCG01045) {
		_vrTechnicalSpec_XCG.setXCG01045(XCG01045);
	}

	/**
	* Sets the xcg01046 of this vr technical spec_xcg.
	*
	* @param XCG01046 the xcg01046 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01046(java.lang.String XCG01046) {
		_vrTechnicalSpec_XCG.setXCG01046(XCG01046);
	}

	/**
	* Sets the xcg01047 of this vr technical spec_xcg.
	*
	* @param XCG01047 the xcg01047 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01047(java.lang.String XCG01047) {
		_vrTechnicalSpec_XCG.setXCG01047(XCG01047);
	}

	/**
	* Sets the xcg01049 of this vr technical spec_xcg.
	*
	* @param XCG01049 the xcg01049 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01049(java.lang.String XCG01049) {
		_vrTechnicalSpec_XCG.setXCG01049(XCG01049);
	}

	/**
	* Sets the xcg01050 of this vr technical spec_xcg.
	*
	* @param XCG01050 the xcg01050 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01050(java.lang.String XCG01050) {
		_vrTechnicalSpec_XCG.setXCG01050(XCG01050);
	}

	/**
	* Sets the xcg01051 of this vr technical spec_xcg.
	*
	* @param XCG01051 the xcg01051 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01051(java.lang.String XCG01051) {
		_vrTechnicalSpec_XCG.setXCG01051(XCG01051);
	}

	/**
	* Sets the xcg01052 of this vr technical spec_xcg.
	*
	* @param XCG01052 the xcg01052 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01052(java.lang.String XCG01052) {
		_vrTechnicalSpec_XCG.setXCG01052(XCG01052);
	}

	/**
	* Sets the xcg01053 of this vr technical spec_xcg.
	*
	* @param XCG01053 the xcg01053 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01053(java.lang.String XCG01053) {
		_vrTechnicalSpec_XCG.setXCG01053(XCG01053);
	}

	/**
	* Sets the xcg01054 of this vr technical spec_xcg.
	*
	* @param XCG01054 the xcg01054 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01054(java.lang.String XCG01054) {
		_vrTechnicalSpec_XCG.setXCG01054(XCG01054);
	}

	/**
	* Sets the xcg01055 of this vr technical spec_xcg.
	*
	* @param XCG01055 the xcg01055 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01055(java.lang.String XCG01055) {
		_vrTechnicalSpec_XCG.setXCG01055(XCG01055);
	}

	/**
	* Sets the xcg01056 of this vr technical spec_xcg.
	*
	* @param XCG01056 the xcg01056 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01056(java.lang.String XCG01056) {
		_vrTechnicalSpec_XCG.setXCG01056(XCG01056);
	}

	/**
	* Sets the xcg01057 of this vr technical spec_xcg.
	*
	* @param XCG01057 the xcg01057 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01057(java.lang.String XCG01057) {
		_vrTechnicalSpec_XCG.setXCG01057(XCG01057);
	}

	/**
	* Sets the xcg01058 of this vr technical spec_xcg.
	*
	* @param XCG01058 the xcg01058 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01058(java.lang.String XCG01058) {
		_vrTechnicalSpec_XCG.setXCG01058(XCG01058);
	}

	/**
	* Sets the xcg01059 of this vr technical spec_xcg.
	*
	* @param XCG01059 the xcg01059 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01059(java.lang.String XCG01059) {
		_vrTechnicalSpec_XCG.setXCG01059(XCG01059);
	}

	/**
	* Sets the xcg01060 of this vr technical spec_xcg.
	*
	* @param XCG01060 the xcg01060 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01060(java.lang.String XCG01060) {
		_vrTechnicalSpec_XCG.setXCG01060(XCG01060);
	}

	/**
	* Sets the xcg01062 of this vr technical spec_xcg.
	*
	* @param XCG01062 the xcg01062 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01062(java.lang.String XCG01062) {
		_vrTechnicalSpec_XCG.setXCG01062(XCG01062);
	}

	/**
	* Sets the xcg01063 of this vr technical spec_xcg.
	*
	* @param XCG01063 the xcg01063 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01063(java.lang.String XCG01063) {
		_vrTechnicalSpec_XCG.setXCG01063(XCG01063);
	}

	/**
	* Sets the xcg01064 of this vr technical spec_xcg.
	*
	* @param XCG01064 the xcg01064 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01064(java.lang.String XCG01064) {
		_vrTechnicalSpec_XCG.setXCG01064(XCG01064);
	}

	/**
	* Sets the xcg01065 of this vr technical spec_xcg.
	*
	* @param XCG01065 the xcg01065 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01065(java.lang.String XCG01065) {
		_vrTechnicalSpec_XCG.setXCG01065(XCG01065);
	}

	/**
	* Sets the xcg01066 of this vr technical spec_xcg.
	*
	* @param XCG01066 the xcg01066 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01066(java.lang.String XCG01066) {
		_vrTechnicalSpec_XCG.setXCG01066(XCG01066);
	}

	/**
	* Sets the xcg01067 of this vr technical spec_xcg.
	*
	* @param XCG01067 the xcg01067 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01067(java.lang.String XCG01067) {
		_vrTechnicalSpec_XCG.setXCG01067(XCG01067);
	}

	/**
	* Sets the xcg01068 of this vr technical spec_xcg.
	*
	* @param XCG01068 the xcg01068 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01068(java.lang.String XCG01068) {
		_vrTechnicalSpec_XCG.setXCG01068(XCG01068);
	}

	/**
	* Sets the xcg01069 of this vr technical spec_xcg.
	*
	* @param XCG01069 the xcg01069 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01069(java.lang.String XCG01069) {
		_vrTechnicalSpec_XCG.setXCG01069(XCG01069);
	}

	/**
	* Sets the xcg01070 of this vr technical spec_xcg.
	*
	* @param XCG01070 the xcg01070 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01070(java.lang.String XCG01070) {
		_vrTechnicalSpec_XCG.setXCG01070(XCG01070);
	}

	/**
	* Sets the xcg01072 of this vr technical spec_xcg.
	*
	* @param XCG01072 the xcg01072 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01072(java.lang.String XCG01072) {
		_vrTechnicalSpec_XCG.setXCG01072(XCG01072);
	}

	/**
	* Sets the xcg01073 of this vr technical spec_xcg.
	*
	* @param XCG01073 the xcg01073 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01073(java.lang.String XCG01073) {
		_vrTechnicalSpec_XCG.setXCG01073(XCG01073);
	}

	/**
	* Sets the xcg01074 of this vr technical spec_xcg.
	*
	* @param XCG01074 the xcg01074 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01074(java.lang.String XCG01074) {
		_vrTechnicalSpec_XCG.setXCG01074(XCG01074);
	}

	/**
	* Sets the xcg01075 of this vr technical spec_xcg.
	*
	* @param XCG01075 the xcg01075 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01075(java.lang.String XCG01075) {
		_vrTechnicalSpec_XCG.setXCG01075(XCG01075);
	}

	/**
	* Sets the xcg01076 of this vr technical spec_xcg.
	*
	* @param XCG01076 the xcg01076 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01076(java.lang.String XCG01076) {
		_vrTechnicalSpec_XCG.setXCG01076(XCG01076);
	}

	/**
	* Sets the xcg01077 of this vr technical spec_xcg.
	*
	* @param XCG01077 the xcg01077 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01077(java.lang.String XCG01077) {
		_vrTechnicalSpec_XCG.setXCG01077(XCG01077);
	}

	/**
	* Sets the xcg01078 of this vr technical spec_xcg.
	*
	* @param XCG01078 the xcg01078 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01078(java.lang.String XCG01078) {
		_vrTechnicalSpec_XCG.setXCG01078(XCG01078);
	}

	/**
	* Sets the xcg01079 of this vr technical spec_xcg.
	*
	* @param XCG01079 the xcg01079 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01079(java.lang.String XCG01079) {
		_vrTechnicalSpec_XCG.setXCG01079(XCG01079);
	}

	/**
	* Sets the xcg01080 of this vr technical spec_xcg.
	*
	* @param XCG01080 the xcg01080 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01080(java.lang.String XCG01080) {
		_vrTechnicalSpec_XCG.setXCG01080(XCG01080);
	}

	/**
	* Sets the xcg01081 of this vr technical spec_xcg.
	*
	* @param XCG01081 the xcg01081 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01081(java.lang.String XCG01081) {
		_vrTechnicalSpec_XCG.setXCG01081(XCG01081);
	}

	/**
	* Sets the xcg01082 of this vr technical spec_xcg.
	*
	* @param XCG01082 the xcg01082 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01082(java.lang.String XCG01082) {
		_vrTechnicalSpec_XCG.setXCG01082(XCG01082);
	}

	/**
	* Sets the xcg01083 of this vr technical spec_xcg.
	*
	* @param XCG01083 the xcg01083 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01083(java.lang.String XCG01083) {
		_vrTechnicalSpec_XCG.setXCG01083(XCG01083);
	}

	/**
	* Sets the xcg01084 of this vr technical spec_xcg.
	*
	* @param XCG01084 the xcg01084 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01084(java.lang.String XCG01084) {
		_vrTechnicalSpec_XCG.setXCG01084(XCG01084);
	}

	/**
	* Sets the xcg01085 of this vr technical spec_xcg.
	*
	* @param XCG01085 the xcg01085 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01085(java.lang.String XCG01085) {
		_vrTechnicalSpec_XCG.setXCG01085(XCG01085);
	}

	/**
	* Sets the xcg01086 of this vr technical spec_xcg.
	*
	* @param XCG01086 the xcg01086 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01086(java.lang.String XCG01086) {
		_vrTechnicalSpec_XCG.setXCG01086(XCG01086);
	}

	/**
	* Sets the xcg01087 of this vr technical spec_xcg.
	*
	* @param XCG01087 the xcg01087 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01087(java.lang.String XCG01087) {
		_vrTechnicalSpec_XCG.setXCG01087(XCG01087);
	}

	/**
	* Sets the xcg01088 of this vr technical spec_xcg.
	*
	* @param XCG01088 the xcg01088 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01088(java.lang.String XCG01088) {
		_vrTechnicalSpec_XCG.setXCG01088(XCG01088);
	}

	/**
	* Sets the xcg01089 of this vr technical spec_xcg.
	*
	* @param XCG01089 the xcg01089 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01089(java.lang.String XCG01089) {
		_vrTechnicalSpec_XCG.setXCG01089(XCG01089);
	}

	/**
	* Sets the xcg01090 of this vr technical spec_xcg.
	*
	* @param XCG01090 the xcg01090 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01090(java.lang.String XCG01090) {
		_vrTechnicalSpec_XCG.setXCG01090(XCG01090);
	}

	/**
	* Sets the xcg01091 of this vr technical spec_xcg.
	*
	* @param XCG01091 the xcg01091 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01091(java.lang.String XCG01091) {
		_vrTechnicalSpec_XCG.setXCG01091(XCG01091);
	}

	/**
	* Sets the xcg01092 of this vr technical spec_xcg.
	*
	* @param XCG01092 the xcg01092 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01092(java.lang.String XCG01092) {
		_vrTechnicalSpec_XCG.setXCG01092(XCG01092);
	}

	/**
	* Sets the xcg01093 of this vr technical spec_xcg.
	*
	* @param XCG01093 the xcg01093 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01093(java.lang.String XCG01093) {
		_vrTechnicalSpec_XCG.setXCG01093(XCG01093);
	}

	/**
	* Sets the xcg01094 of this vr technical spec_xcg.
	*
	* @param XCG01094 the xcg01094 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01094(java.lang.String XCG01094) {
		_vrTechnicalSpec_XCG.setXCG01094(XCG01094);
	}

	/**
	* Sets the xcg01095 of this vr technical spec_xcg.
	*
	* @param XCG01095 the xcg01095 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01095(java.lang.String XCG01095) {
		_vrTechnicalSpec_XCG.setXCG01095(XCG01095);
	}

	/**
	* Sets the xcg01096 of this vr technical spec_xcg.
	*
	* @param XCG01096 the xcg01096 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01096(java.lang.String XCG01096) {
		_vrTechnicalSpec_XCG.setXCG01096(XCG01096);
	}

	/**
	* Sets the xcg01097 of this vr technical spec_xcg.
	*
	* @param XCG01097 the xcg01097 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01097(java.lang.String XCG01097) {
		_vrTechnicalSpec_XCG.setXCG01097(XCG01097);
	}

	/**
	* Sets the xcg01098 of this vr technical spec_xcg.
	*
	* @param XCG01098 the xcg01098 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01098(java.lang.String XCG01098) {
		_vrTechnicalSpec_XCG.setXCG01098(XCG01098);
	}

	/**
	* Sets the xcg01099 of this vr technical spec_xcg.
	*
	* @param XCG01099 the xcg01099 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01099(java.lang.String XCG01099) {
		_vrTechnicalSpec_XCG.setXCG01099(XCG01099);
	}

	/**
	* Sets the xcg01100 of this vr technical spec_xcg.
	*
	* @param XCG01100 the xcg01100 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01100(java.lang.String XCG01100) {
		_vrTechnicalSpec_XCG.setXCG01100(XCG01100);
	}

	/**
	* Sets the xcg01101 of this vr technical spec_xcg.
	*
	* @param XCG01101 the xcg01101 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01101(java.lang.String XCG01101) {
		_vrTechnicalSpec_XCG.setXCG01101(XCG01101);
	}

	/**
	* Sets the xcg01102 of this vr technical spec_xcg.
	*
	* @param XCG01102 the xcg01102 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01102(java.lang.String XCG01102) {
		_vrTechnicalSpec_XCG.setXCG01102(XCG01102);
	}

	/**
	* Sets the xcg01103 of this vr technical spec_xcg.
	*
	* @param XCG01103 the xcg01103 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01103(java.lang.String XCG01103) {
		_vrTechnicalSpec_XCG.setXCG01103(XCG01103);
	}

	/**
	* Sets the xcg01104 of this vr technical spec_xcg.
	*
	* @param XCG01104 the xcg01104 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01104(java.lang.String XCG01104) {
		_vrTechnicalSpec_XCG.setXCG01104(XCG01104);
	}

	/**
	* Sets the xcg01105 of this vr technical spec_xcg.
	*
	* @param XCG01105 the xcg01105 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01105(java.lang.String XCG01105) {
		_vrTechnicalSpec_XCG.setXCG01105(XCG01105);
	}

	/**
	* Sets the xcg01106 of this vr technical spec_xcg.
	*
	* @param XCG01106 the xcg01106 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01106(java.lang.String XCG01106) {
		_vrTechnicalSpec_XCG.setXCG01106(XCG01106);
	}

	/**
	* Sets the xcg01107 of this vr technical spec_xcg.
	*
	* @param XCG01107 the xcg01107 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01107(java.lang.String XCG01107) {
		_vrTechnicalSpec_XCG.setXCG01107(XCG01107);
	}

	/**
	* Sets the xcg01108 of this vr technical spec_xcg.
	*
	* @param XCG01108 the xcg01108 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01108(java.lang.String XCG01108) {
		_vrTechnicalSpec_XCG.setXCG01108(XCG01108);
	}

	/**
	* Sets the xcg01109 of this vr technical spec_xcg.
	*
	* @param XCG01109 the xcg01109 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01109(java.lang.String XCG01109) {
		_vrTechnicalSpec_XCG.setXCG01109(XCG01109);
	}

	/**
	* Sets the xcg01110 of this vr technical spec_xcg.
	*
	* @param XCG01110 the xcg01110 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01110(java.lang.String XCG01110) {
		_vrTechnicalSpec_XCG.setXCG01110(XCG01110);
	}

	/**
	* Sets the xcg01111 of this vr technical spec_xcg.
	*
	* @param XCG01111 the xcg01111 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01111(java.lang.String XCG01111) {
		_vrTechnicalSpec_XCG.setXCG01111(XCG01111);
	}

	/**
	* Sets the xcg01112 of this vr technical spec_xcg.
	*
	* @param XCG01112 the xcg01112 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01112(java.lang.String XCG01112) {
		_vrTechnicalSpec_XCG.setXCG01112(XCG01112);
	}

	/**
	* Sets the xcg01113 of this vr technical spec_xcg.
	*
	* @param XCG01113 the xcg01113 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01113(java.lang.String XCG01113) {
		_vrTechnicalSpec_XCG.setXCG01113(XCG01113);
	}

	/**
	* Sets the xcg01114 of this vr technical spec_xcg.
	*
	* @param XCG01114 the xcg01114 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01114(java.lang.String XCG01114) {
		_vrTechnicalSpec_XCG.setXCG01114(XCG01114);
	}

	/**
	* Sets the xcg01115 of this vr technical spec_xcg.
	*
	* @param XCG01115 the xcg01115 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01115(java.lang.String XCG01115) {
		_vrTechnicalSpec_XCG.setXCG01115(XCG01115);
	}

	/**
	* Sets the xcg01116 of this vr technical spec_xcg.
	*
	* @param XCG01116 the xcg01116 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01116(java.lang.String XCG01116) {
		_vrTechnicalSpec_XCG.setXCG01116(XCG01116);
	}

	/**
	* Sets the xcg01117 of this vr technical spec_xcg.
	*
	* @param XCG01117 the xcg01117 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01117(java.lang.String XCG01117) {
		_vrTechnicalSpec_XCG.setXCG01117(XCG01117);
	}

	/**
	* Sets the xcg01118 of this vr technical spec_xcg.
	*
	* @param XCG01118 the xcg01118 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01118(java.lang.String XCG01118) {
		_vrTechnicalSpec_XCG.setXCG01118(XCG01118);
	}

	/**
	* Sets the xcg01119 of this vr technical spec_xcg.
	*
	* @param XCG01119 the xcg01119 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01119(java.lang.String XCG01119) {
		_vrTechnicalSpec_XCG.setXCG01119(XCG01119);
	}

	/**
	* Sets the xcg01120 of this vr technical spec_xcg.
	*
	* @param XCG01120 the xcg01120 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01120(java.lang.String XCG01120) {
		_vrTechnicalSpec_XCG.setXCG01120(XCG01120);
	}

	/**
	* Sets the xcg01121 of this vr technical spec_xcg.
	*
	* @param XCG01121 the xcg01121 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01121(java.lang.String XCG01121) {
		_vrTechnicalSpec_XCG.setXCG01121(XCG01121);
	}

	/**
	* Sets the xcg01122 of this vr technical spec_xcg.
	*
	* @param XCG01122 the xcg01122 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01122(java.lang.String XCG01122) {
		_vrTechnicalSpec_XCG.setXCG01122(XCG01122);
	}

	/**
	* Sets the xcg01123 of this vr technical spec_xcg.
	*
	* @param XCG01123 the xcg01123 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01123(java.lang.String XCG01123) {
		_vrTechnicalSpec_XCG.setXCG01123(XCG01123);
	}

	/**
	* Sets the xcg01124 of this vr technical spec_xcg.
	*
	* @param XCG01124 the xcg01124 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01124(java.lang.String XCG01124) {
		_vrTechnicalSpec_XCG.setXCG01124(XCG01124);
	}

	/**
	* Sets the xcg01125 of this vr technical spec_xcg.
	*
	* @param XCG01125 the xcg01125 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01125(java.lang.String XCG01125) {
		_vrTechnicalSpec_XCG.setXCG01125(XCG01125);
	}

	/**
	* Sets the xcg01126 of this vr technical spec_xcg.
	*
	* @param XCG01126 the xcg01126 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01126(java.lang.String XCG01126) {
		_vrTechnicalSpec_XCG.setXCG01126(XCG01126);
	}

	/**
	* Sets the xcg01127 of this vr technical spec_xcg.
	*
	* @param XCG01127 the xcg01127 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01127(java.lang.String XCG01127) {
		_vrTechnicalSpec_XCG.setXCG01127(XCG01127);
	}

	/**
	* Sets the xcg01128 of this vr technical spec_xcg.
	*
	* @param XCG01128 the xcg01128 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01128(java.lang.String XCG01128) {
		_vrTechnicalSpec_XCG.setXCG01128(XCG01128);
	}

	/**
	* Sets the xcg01129 of this vr technical spec_xcg.
	*
	* @param XCG01129 the xcg01129 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01129(java.lang.String XCG01129) {
		_vrTechnicalSpec_XCG.setXCG01129(XCG01129);
	}

	/**
	* Sets the xcg01130 of this vr technical spec_xcg.
	*
	* @param XCG01130 the xcg01130 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01130(java.lang.String XCG01130) {
		_vrTechnicalSpec_XCG.setXCG01130(XCG01130);
	}

	/**
	* Sets the xcg01131 of this vr technical spec_xcg.
	*
	* @param XCG01131 the xcg01131 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01131(java.lang.String XCG01131) {
		_vrTechnicalSpec_XCG.setXCG01131(XCG01131);
	}

	/**
	* Sets the xcg01132 of this vr technical spec_xcg.
	*
	* @param XCG01132 the xcg01132 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01132(java.lang.String XCG01132) {
		_vrTechnicalSpec_XCG.setXCG01132(XCG01132);
	}

	/**
	* Sets the xcg01133 of this vr technical spec_xcg.
	*
	* @param XCG01133 the xcg01133 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01133(java.lang.String XCG01133) {
		_vrTechnicalSpec_XCG.setXCG01133(XCG01133);
	}

	/**
	* Sets the xcg01134 of this vr technical spec_xcg.
	*
	* @param XCG01134 the xcg01134 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01134(java.lang.String XCG01134) {
		_vrTechnicalSpec_XCG.setXCG01134(XCG01134);
	}

	/**
	* Sets the xcg01135 of this vr technical spec_xcg.
	*
	* @param XCG01135 the xcg01135 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01135(java.lang.String XCG01135) {
		_vrTechnicalSpec_XCG.setXCG01135(XCG01135);
	}

	/**
	* Sets the xcg01136 of this vr technical spec_xcg.
	*
	* @param XCG01136 the xcg01136 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01136(java.lang.String XCG01136) {
		_vrTechnicalSpec_XCG.setXCG01136(XCG01136);
	}

	/**
	* Sets the xcg01137 of this vr technical spec_xcg.
	*
	* @param XCG01137 the xcg01137 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01137(java.lang.String XCG01137) {
		_vrTechnicalSpec_XCG.setXCG01137(XCG01137);
	}

	/**
	* Sets the xcg01138 of this vr technical spec_xcg.
	*
	* @param XCG01138 the xcg01138 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01138(java.lang.String XCG01138) {
		_vrTechnicalSpec_XCG.setXCG01138(XCG01138);
	}

	/**
	* Sets the xcg01139 of this vr technical spec_xcg.
	*
	* @param XCG01139 the xcg01139 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01139(java.lang.String XCG01139) {
		_vrTechnicalSpec_XCG.setXCG01139(XCG01139);
	}

	/**
	* Sets the xcg01140 of this vr technical spec_xcg.
	*
	* @param XCG01140 the xcg01140 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01140(java.lang.String XCG01140) {
		_vrTechnicalSpec_XCG.setXCG01140(XCG01140);
	}

	/**
	* Sets the xcg01141 of this vr technical spec_xcg.
	*
	* @param XCG01141 the xcg01141 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01141(java.lang.String XCG01141) {
		_vrTechnicalSpec_XCG.setXCG01141(XCG01141);
	}

	/**
	* Sets the xcg01142 of this vr technical spec_xcg.
	*
	* @param XCG01142 the xcg01142 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01142(java.lang.String XCG01142) {
		_vrTechnicalSpec_XCG.setXCG01142(XCG01142);
	}

	/**
	* Sets the xcg01143 of this vr technical spec_xcg.
	*
	* @param XCG01143 the xcg01143 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01143(java.lang.String XCG01143) {
		_vrTechnicalSpec_XCG.setXCG01143(XCG01143);
	}

	/**
	* Sets the xcg01144 of this vr technical spec_xcg.
	*
	* @param XCG01144 the xcg01144 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01144(java.lang.String XCG01144) {
		_vrTechnicalSpec_XCG.setXCG01144(XCG01144);
	}

	/**
	* Sets the xcg01145 of this vr technical spec_xcg.
	*
	* @param XCG01145 the xcg01145 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01145(java.lang.String XCG01145) {
		_vrTechnicalSpec_XCG.setXCG01145(XCG01145);
	}

	/**
	* Sets the xcg01146 of this vr technical spec_xcg.
	*
	* @param XCG01146 the xcg01146 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01146(java.lang.String XCG01146) {
		_vrTechnicalSpec_XCG.setXCG01146(XCG01146);
	}

	/**
	* Sets the xcg01147 of this vr technical spec_xcg.
	*
	* @param XCG01147 the xcg01147 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01147(java.lang.String XCG01147) {
		_vrTechnicalSpec_XCG.setXCG01147(XCG01147);
	}

	/**
	* Sets the xcg01148 of this vr technical spec_xcg.
	*
	* @param XCG01148 the xcg01148 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01148(java.lang.String XCG01148) {
		_vrTechnicalSpec_XCG.setXCG01148(XCG01148);
	}

	/**
	* Sets the xcg01149 of this vr technical spec_xcg.
	*
	* @param XCG01149 the xcg01149 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01149(java.lang.String XCG01149) {
		_vrTechnicalSpec_XCG.setXCG01149(XCG01149);
	}

	/**
	* Sets the xcg01150 of this vr technical spec_xcg.
	*
	* @param XCG01150 the xcg01150 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01150(java.lang.String XCG01150) {
		_vrTechnicalSpec_XCG.setXCG01150(XCG01150);
	}

	/**
	* Sets the xcg01151 of this vr technical spec_xcg.
	*
	* @param XCG01151 the xcg01151 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01151(java.lang.String XCG01151) {
		_vrTechnicalSpec_XCG.setXCG01151(XCG01151);
	}

	/**
	* Sets the xcg01152 of this vr technical spec_xcg.
	*
	* @param XCG01152 the xcg01152 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01152(java.lang.String XCG01152) {
		_vrTechnicalSpec_XCG.setXCG01152(XCG01152);
	}

	/**
	* Sets the xcg01153 of this vr technical spec_xcg.
	*
	* @param XCG01153 the xcg01153 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01153(java.lang.String XCG01153) {
		_vrTechnicalSpec_XCG.setXCG01153(XCG01153);
	}

	/**
	* Sets the xcg01154 of this vr technical spec_xcg.
	*
	* @param XCG01154 the xcg01154 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01154(java.lang.String XCG01154) {
		_vrTechnicalSpec_XCG.setXCG01154(XCG01154);
	}

	/**
	* Sets the xcg01155 of this vr technical spec_xcg.
	*
	* @param XCG01155 the xcg01155 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01155(java.lang.String XCG01155) {
		_vrTechnicalSpec_XCG.setXCG01155(XCG01155);
	}

	/**
	* Sets the xcg01156 of this vr technical spec_xcg.
	*
	* @param XCG01156 the xcg01156 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01156(java.lang.String XCG01156) {
		_vrTechnicalSpec_XCG.setXCG01156(XCG01156);
	}

	/**
	* Sets the xcg01157 of this vr technical spec_xcg.
	*
	* @param XCG01157 the xcg01157 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01157(java.lang.String XCG01157) {
		_vrTechnicalSpec_XCG.setXCG01157(XCG01157);
	}

	/**
	* Sets the xcg01158 of this vr technical spec_xcg.
	*
	* @param XCG01158 the xcg01158 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01158(java.lang.String XCG01158) {
		_vrTechnicalSpec_XCG.setXCG01158(XCG01158);
	}

	/**
	* Sets the xcg01159 of this vr technical spec_xcg.
	*
	* @param XCG01159 the xcg01159 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01159(java.lang.String XCG01159) {
		_vrTechnicalSpec_XCG.setXCG01159(XCG01159);
	}

	/**
	* Sets the xcg01160 of this vr technical spec_xcg.
	*
	* @param XCG01160 the xcg01160 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01160(java.lang.String XCG01160) {
		_vrTechnicalSpec_XCG.setXCG01160(XCG01160);
	}

	/**
	* Sets the xcg01161 of this vr technical spec_xcg.
	*
	* @param XCG01161 the xcg01161 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01161(java.lang.String XCG01161) {
		_vrTechnicalSpec_XCG.setXCG01161(XCG01161);
	}

	/**
	* Sets the xcg01162 of this vr technical spec_xcg.
	*
	* @param XCG01162 the xcg01162 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01162(java.lang.String XCG01162) {
		_vrTechnicalSpec_XCG.setXCG01162(XCG01162);
	}

	/**
	* Sets the xcg01163 of this vr technical spec_xcg.
	*
	* @param XCG01163 the xcg01163 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01163(java.lang.String XCG01163) {
		_vrTechnicalSpec_XCG.setXCG01163(XCG01163);
	}

	/**
	* Sets the xcg01164 of this vr technical spec_xcg.
	*
	* @param XCG01164 the xcg01164 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01164(java.lang.String XCG01164) {
		_vrTechnicalSpec_XCG.setXCG01164(XCG01164);
	}

	/**
	* Sets the xcg01165 of this vr technical spec_xcg.
	*
	* @param XCG01165 the xcg01165 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01165(java.lang.String XCG01165) {
		_vrTechnicalSpec_XCG.setXCG01165(XCG01165);
	}

	/**
	* Sets the xcg01166 of this vr technical spec_xcg.
	*
	* @param XCG01166 the xcg01166 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01166(java.lang.String XCG01166) {
		_vrTechnicalSpec_XCG.setXCG01166(XCG01166);
	}

	/**
	* Sets the xcg01167 of this vr technical spec_xcg.
	*
	* @param XCG01167 the xcg01167 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01167(java.lang.String XCG01167) {
		_vrTechnicalSpec_XCG.setXCG01167(XCG01167);
	}

	/**
	* Sets the xcg01169 of this vr technical spec_xcg.
	*
	* @param XCG01169 the xcg01169 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01169(java.lang.String XCG01169) {
		_vrTechnicalSpec_XCG.setXCG01169(XCG01169);
	}

	/**
	* Sets the xcg01170 of this vr technical spec_xcg.
	*
	* @param XCG01170 the xcg01170 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01170(java.lang.String XCG01170) {
		_vrTechnicalSpec_XCG.setXCG01170(XCG01170);
	}

	/**
	* Sets the xcg01171 of this vr technical spec_xcg.
	*
	* @param XCG01171 the xcg01171 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01171(java.lang.String XCG01171) {
		_vrTechnicalSpec_XCG.setXCG01171(XCG01171);
	}

	/**
	* Sets the xcg01172 of this vr technical spec_xcg.
	*
	* @param XCG01172 the xcg01172 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01172(java.lang.String XCG01172) {
		_vrTechnicalSpec_XCG.setXCG01172(XCG01172);
	}

	/**
	* Sets the xcg01173 of this vr technical spec_xcg.
	*
	* @param XCG01173 the xcg01173 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01173(java.lang.String XCG01173) {
		_vrTechnicalSpec_XCG.setXCG01173(XCG01173);
	}

	/**
	* Sets the xcg01174 of this vr technical spec_xcg.
	*
	* @param XCG01174 the xcg01174 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01174(java.lang.String XCG01174) {
		_vrTechnicalSpec_XCG.setXCG01174(XCG01174);
	}

	/**
	* Sets the xcg01175 of this vr technical spec_xcg.
	*
	* @param XCG01175 the xcg01175 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01175(java.lang.String XCG01175) {
		_vrTechnicalSpec_XCG.setXCG01175(XCG01175);
	}

	/**
	* Sets the xcg01176 of this vr technical spec_xcg.
	*
	* @param XCG01176 the xcg01176 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01176(java.lang.String XCG01176) {
		_vrTechnicalSpec_XCG.setXCG01176(XCG01176);
	}

	/**
	* Sets the xcg01177 of this vr technical spec_xcg.
	*
	* @param XCG01177 the xcg01177 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01177(java.lang.String XCG01177) {
		_vrTechnicalSpec_XCG.setXCG01177(XCG01177);
	}

	/**
	* Sets the xcg01178 of this vr technical spec_xcg.
	*
	* @param XCG01178 the xcg01178 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01178(java.lang.String XCG01178) {
		_vrTechnicalSpec_XCG.setXCG01178(XCG01178);
	}

	/**
	* Sets the xcg01179 of this vr technical spec_xcg.
	*
	* @param XCG01179 the xcg01179 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01179(java.lang.String XCG01179) {
		_vrTechnicalSpec_XCG.setXCG01179(XCG01179);
	}

	/**
	* Sets the xcg01180 of this vr technical spec_xcg.
	*
	* @param XCG01180 the xcg01180 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01180(java.lang.String XCG01180) {
		_vrTechnicalSpec_XCG.setXCG01180(XCG01180);
	}

	/**
	* Sets the xcg01181 of this vr technical spec_xcg.
	*
	* @param XCG01181 the xcg01181 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01181(java.lang.String XCG01181) {
		_vrTechnicalSpec_XCG.setXCG01181(XCG01181);
	}

	/**
	* Sets the xcg01182 of this vr technical spec_xcg.
	*
	* @param XCG01182 the xcg01182 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01182(java.lang.String XCG01182) {
		_vrTechnicalSpec_XCG.setXCG01182(XCG01182);
	}

	/**
	* Sets the xcg01183 of this vr technical spec_xcg.
	*
	* @param XCG01183 the xcg01183 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01183(java.lang.String XCG01183) {
		_vrTechnicalSpec_XCG.setXCG01183(XCG01183);
	}

	/**
	* Sets the xcg01184 of this vr technical spec_xcg.
	*
	* @param XCG01184 the xcg01184 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01184(java.lang.String XCG01184) {
		_vrTechnicalSpec_XCG.setXCG01184(XCG01184);
	}

	/**
	* Sets the xcg01185 of this vr technical spec_xcg.
	*
	* @param XCG01185 the xcg01185 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01185(java.lang.String XCG01185) {
		_vrTechnicalSpec_XCG.setXCG01185(XCG01185);
	}

	/**
	* Sets the xcg01186 of this vr technical spec_xcg.
	*
	* @param XCG01186 the xcg01186 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01186(java.lang.String XCG01186) {
		_vrTechnicalSpec_XCG.setXCG01186(XCG01186);
	}

	/**
	* Sets the xcg01187 of this vr technical spec_xcg.
	*
	* @param XCG01187 the xcg01187 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01187(java.lang.String XCG01187) {
		_vrTechnicalSpec_XCG.setXCG01187(XCG01187);
	}

	/**
	* Sets the xcg01188 of this vr technical spec_xcg.
	*
	* @param XCG01188 the xcg01188 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01188(java.lang.String XCG01188) {
		_vrTechnicalSpec_XCG.setXCG01188(XCG01188);
	}

	/**
	* Sets the xcg01189 of this vr technical spec_xcg.
	*
	* @param XCG01189 the xcg01189 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01189(java.lang.String XCG01189) {
		_vrTechnicalSpec_XCG.setXCG01189(XCG01189);
	}

	/**
	* Sets the xcg01190 of this vr technical spec_xcg.
	*
	* @param XCG01190 the xcg01190 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01190(java.lang.String XCG01190) {
		_vrTechnicalSpec_XCG.setXCG01190(XCG01190);
	}

	/**
	* Sets the xcg01191 of this vr technical spec_xcg.
	*
	* @param XCG01191 the xcg01191 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01191(java.lang.String XCG01191) {
		_vrTechnicalSpec_XCG.setXCG01191(XCG01191);
	}

	/**
	* Sets the xcg01192 of this vr technical spec_xcg.
	*
	* @param XCG01192 the xcg01192 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01192(java.lang.String XCG01192) {
		_vrTechnicalSpec_XCG.setXCG01192(XCG01192);
	}

	/**
	* Sets the xcg01193 of this vr technical spec_xcg.
	*
	* @param XCG01193 the xcg01193 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01193(java.lang.String XCG01193) {
		_vrTechnicalSpec_XCG.setXCG01193(XCG01193);
	}

	/**
	* Sets the xcg01194 of this vr technical spec_xcg.
	*
	* @param XCG01194 the xcg01194 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01194(java.lang.String XCG01194) {
		_vrTechnicalSpec_XCG.setXCG01194(XCG01194);
	}

	/**
	* Sets the xcg01195 of this vr technical spec_xcg.
	*
	* @param XCG01195 the xcg01195 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01195(java.lang.String XCG01195) {
		_vrTechnicalSpec_XCG.setXCG01195(XCG01195);
	}

	/**
	* Sets the xcg01196 of this vr technical spec_xcg.
	*
	* @param XCG01196 the xcg01196 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01196(java.lang.String XCG01196) {
		_vrTechnicalSpec_XCG.setXCG01196(XCG01196);
	}

	/**
	* Sets the xcg01197 of this vr technical spec_xcg.
	*
	* @param XCG01197 the xcg01197 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01197(java.lang.String XCG01197) {
		_vrTechnicalSpec_XCG.setXCG01197(XCG01197);
	}

	/**
	* Sets the xcg01198 of this vr technical spec_xcg.
	*
	* @param XCG01198 the xcg01198 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01198(java.lang.String XCG01198) {
		_vrTechnicalSpec_XCG.setXCG01198(XCG01198);
	}

	/**
	* Sets the xcg01199 of this vr technical spec_xcg.
	*
	* @param XCG01199 the xcg01199 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01199(java.lang.String XCG01199) {
		_vrTechnicalSpec_XCG.setXCG01199(XCG01199);
	}

	/**
	* Sets the xcg01200 of this vr technical spec_xcg.
	*
	* @param XCG01200 the xcg01200 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01200(java.lang.String XCG01200) {
		_vrTechnicalSpec_XCG.setXCG01200(XCG01200);
	}

	/**
	* Sets the xcg01202 of this vr technical spec_xcg.
	*
	* @param XCG01202 the xcg01202 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01202(java.lang.String XCG01202) {
		_vrTechnicalSpec_XCG.setXCG01202(XCG01202);
	}

	/**
	* Sets the xcg01203 of this vr technical spec_xcg.
	*
	* @param XCG01203 the xcg01203 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01203(java.lang.String XCG01203) {
		_vrTechnicalSpec_XCG.setXCG01203(XCG01203);
	}

	/**
	* Sets the xcg01204 of this vr technical spec_xcg.
	*
	* @param XCG01204 the xcg01204 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01204(java.lang.String XCG01204) {
		_vrTechnicalSpec_XCG.setXCG01204(XCG01204);
	}

	/**
	* Sets the xcg01205 of this vr technical spec_xcg.
	*
	* @param XCG01205 the xcg01205 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01205(java.lang.String XCG01205) {
		_vrTechnicalSpec_XCG.setXCG01205(XCG01205);
	}

	/**
	* Sets the xcg01206 of this vr technical spec_xcg.
	*
	* @param XCG01206 the xcg01206 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01206(java.lang.String XCG01206) {
		_vrTechnicalSpec_XCG.setXCG01206(XCG01206);
	}

	/**
	* Sets the xcg01207 of this vr technical spec_xcg.
	*
	* @param XCG01207 the xcg01207 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01207(java.lang.String XCG01207) {
		_vrTechnicalSpec_XCG.setXCG01207(XCG01207);
	}

	/**
	* Sets the xcg01208 of this vr technical spec_xcg.
	*
	* @param XCG01208 the xcg01208 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01208(java.lang.String XCG01208) {
		_vrTechnicalSpec_XCG.setXCG01208(XCG01208);
	}

	/**
	* Sets the xcg01209 of this vr technical spec_xcg.
	*
	* @param XCG01209 the xcg01209 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01209(java.lang.String XCG01209) {
		_vrTechnicalSpec_XCG.setXCG01209(XCG01209);
	}

	/**
	* Sets the xcg01210 of this vr technical spec_xcg.
	*
	* @param XCG01210 the xcg01210 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01210(java.lang.String XCG01210) {
		_vrTechnicalSpec_XCG.setXCG01210(XCG01210);
	}

	/**
	* Sets the xcg01212 of this vr technical spec_xcg.
	*
	* @param XCG01212 the xcg01212 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01212(java.lang.String XCG01212) {
		_vrTechnicalSpec_XCG.setXCG01212(XCG01212);
	}

	/**
	* Sets the xcg01213 of this vr technical spec_xcg.
	*
	* @param XCG01213 the xcg01213 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01213(java.lang.String XCG01213) {
		_vrTechnicalSpec_XCG.setXCG01213(XCG01213);
	}

	/**
	* Sets the xcg01214 of this vr technical spec_xcg.
	*
	* @param XCG01214 the xcg01214 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01214(java.lang.String XCG01214) {
		_vrTechnicalSpec_XCG.setXCG01214(XCG01214);
	}

	/**
	* Sets the xcg01215 of this vr technical spec_xcg.
	*
	* @param XCG01215 the xcg01215 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01215(java.lang.String XCG01215) {
		_vrTechnicalSpec_XCG.setXCG01215(XCG01215);
	}

	/**
	* Sets the xcg01216 of this vr technical spec_xcg.
	*
	* @param XCG01216 the xcg01216 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01216(java.lang.String XCG01216) {
		_vrTechnicalSpec_XCG.setXCG01216(XCG01216);
	}

	/**
	* Sets the xcg01217 of this vr technical spec_xcg.
	*
	* @param XCG01217 the xcg01217 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01217(java.lang.String XCG01217) {
		_vrTechnicalSpec_XCG.setXCG01217(XCG01217);
	}

	/**
	* Sets the xcg01218 of this vr technical spec_xcg.
	*
	* @param XCG01218 the xcg01218 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01218(java.lang.String XCG01218) {
		_vrTechnicalSpec_XCG.setXCG01218(XCG01218);
	}

	/**
	* Sets the xcg01219 of this vr technical spec_xcg.
	*
	* @param XCG01219 the xcg01219 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01219(java.lang.String XCG01219) {
		_vrTechnicalSpec_XCG.setXCG01219(XCG01219);
	}

	/**
	* Sets the xcg01220 of this vr technical spec_xcg.
	*
	* @param XCG01220 the xcg01220 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01220(java.lang.String XCG01220) {
		_vrTechnicalSpec_XCG.setXCG01220(XCG01220);
	}

	/**
	* Sets the xcg01221 of this vr technical spec_xcg.
	*
	* @param XCG01221 the xcg01221 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01221(java.lang.String XCG01221) {
		_vrTechnicalSpec_XCG.setXCG01221(XCG01221);
	}

	/**
	* Sets the xcg01222 of this vr technical spec_xcg.
	*
	* @param XCG01222 the xcg01222 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01222(java.lang.String XCG01222) {
		_vrTechnicalSpec_XCG.setXCG01222(XCG01222);
	}

	/**
	* Sets the xcg01223 of this vr technical spec_xcg.
	*
	* @param XCG01223 the xcg01223 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01223(java.lang.String XCG01223) {
		_vrTechnicalSpec_XCG.setXCG01223(XCG01223);
	}

	/**
	* Sets the xcg01224 of this vr technical spec_xcg.
	*
	* @param XCG01224 the xcg01224 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01224(java.lang.String XCG01224) {
		_vrTechnicalSpec_XCG.setXCG01224(XCG01224);
	}

	/**
	* Sets the xcg01225 of this vr technical spec_xcg.
	*
	* @param XCG01225 the xcg01225 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01225(java.lang.String XCG01225) {
		_vrTechnicalSpec_XCG.setXCG01225(XCG01225);
	}

	/**
	* Sets the xcg01226 of this vr technical spec_xcg.
	*
	* @param XCG01226 the xcg01226 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01226(java.lang.String XCG01226) {
		_vrTechnicalSpec_XCG.setXCG01226(XCG01226);
	}

	/**
	* Sets the xcg01228 of this vr technical spec_xcg.
	*
	* @param XCG01228 the xcg01228 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01228(java.lang.String XCG01228) {
		_vrTechnicalSpec_XCG.setXCG01228(XCG01228);
	}

	/**
	* Sets the xcg01229 of this vr technical spec_xcg.
	*
	* @param XCG01229 the xcg01229 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01229(java.lang.String XCG01229) {
		_vrTechnicalSpec_XCG.setXCG01229(XCG01229);
	}

	/**
	* Sets the xcg01230 of this vr technical spec_xcg.
	*
	* @param XCG01230 the xcg01230 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01230(java.lang.String XCG01230) {
		_vrTechnicalSpec_XCG.setXCG01230(XCG01230);
	}

	/**
	* Sets the xcg01231 of this vr technical spec_xcg.
	*
	* @param XCG01231 the xcg01231 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01231(java.lang.String XCG01231) {
		_vrTechnicalSpec_XCG.setXCG01231(XCG01231);
	}

	/**
	* Sets the xcg01232 of this vr technical spec_xcg.
	*
	* @param XCG01232 the xcg01232 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01232(java.lang.String XCG01232) {
		_vrTechnicalSpec_XCG.setXCG01232(XCG01232);
	}

	/**
	* Sets the xcg01234 of this vr technical spec_xcg.
	*
	* @param XCG01234 the xcg01234 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01234(java.lang.String XCG01234) {
		_vrTechnicalSpec_XCG.setXCG01234(XCG01234);
	}

	/**
	* Sets the xcg01235 of this vr technical spec_xcg.
	*
	* @param XCG01235 the xcg01235 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01235(java.lang.String XCG01235) {
		_vrTechnicalSpec_XCG.setXCG01235(XCG01235);
	}

	/**
	* Sets the xcg01236 of this vr technical spec_xcg.
	*
	* @param XCG01236 the xcg01236 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01236(java.lang.String XCG01236) {
		_vrTechnicalSpec_XCG.setXCG01236(XCG01236);
	}

	/**
	* Sets the xcg01237 of this vr technical spec_xcg.
	*
	* @param XCG01237 the xcg01237 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01237(java.lang.String XCG01237) {
		_vrTechnicalSpec_XCG.setXCG01237(XCG01237);
	}

	/**
	* Sets the xcg01238 of this vr technical spec_xcg.
	*
	* @param XCG01238 the xcg01238 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01238(java.lang.String XCG01238) {
		_vrTechnicalSpec_XCG.setXCG01238(XCG01238);
	}

	/**
	* Sets the xcg01239 of this vr technical spec_xcg.
	*
	* @param XCG01239 the xcg01239 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01239(java.lang.String XCG01239) {
		_vrTechnicalSpec_XCG.setXCG01239(XCG01239);
	}

	/**
	* Sets the xcg01240 of this vr technical spec_xcg.
	*
	* @param XCG01240 the xcg01240 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01240(java.lang.String XCG01240) {
		_vrTechnicalSpec_XCG.setXCG01240(XCG01240);
	}

	/**
	* Sets the xcg01241 of this vr technical spec_xcg.
	*
	* @param XCG01241 the xcg01241 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01241(java.lang.String XCG01241) {
		_vrTechnicalSpec_XCG.setXCG01241(XCG01241);
	}

	/**
	* Sets the xcg01242 of this vr technical spec_xcg.
	*
	* @param XCG01242 the xcg01242 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01242(java.lang.String XCG01242) {
		_vrTechnicalSpec_XCG.setXCG01242(XCG01242);
	}

	/**
	* Sets the xcg01243 of this vr technical spec_xcg.
	*
	* @param XCG01243 the xcg01243 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01243(java.lang.String XCG01243) {
		_vrTechnicalSpec_XCG.setXCG01243(XCG01243);
	}

	/**
	* Sets the xcg01244 of this vr technical spec_xcg.
	*
	* @param XCG01244 the xcg01244 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01244(java.lang.String XCG01244) {
		_vrTechnicalSpec_XCG.setXCG01244(XCG01244);
	}

	/**
	* Sets the xcg01245 of this vr technical spec_xcg.
	*
	* @param XCG01245 the xcg01245 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01245(java.lang.String XCG01245) {
		_vrTechnicalSpec_XCG.setXCG01245(XCG01245);
	}

	/**
	* Sets the xcg01246 of this vr technical spec_xcg.
	*
	* @param XCG01246 the xcg01246 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01246(java.lang.String XCG01246) {
		_vrTechnicalSpec_XCG.setXCG01246(XCG01246);
	}

	/**
	* Sets the xcg01247 of this vr technical spec_xcg.
	*
	* @param XCG01247 the xcg01247 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01247(java.lang.String XCG01247) {
		_vrTechnicalSpec_XCG.setXCG01247(XCG01247);
	}

	/**
	* Sets the xcg01248 of this vr technical spec_xcg.
	*
	* @param XCG01248 the xcg01248 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01248(java.lang.String XCG01248) {
		_vrTechnicalSpec_XCG.setXCG01248(XCG01248);
	}

	/**
	* Sets the xcg01249 of this vr technical spec_xcg.
	*
	* @param XCG01249 the xcg01249 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01249(java.lang.String XCG01249) {
		_vrTechnicalSpec_XCG.setXCG01249(XCG01249);
	}

	/**
	* Sets the xcg01250 of this vr technical spec_xcg.
	*
	* @param XCG01250 the xcg01250 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01250(java.lang.String XCG01250) {
		_vrTechnicalSpec_XCG.setXCG01250(XCG01250);
	}

	/**
	* Sets the xcg01251 of this vr technical spec_xcg.
	*
	* @param XCG01251 the xcg01251 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01251(java.lang.String XCG01251) {
		_vrTechnicalSpec_XCG.setXCG01251(XCG01251);
	}

	/**
	* Sets the xcg01252 of this vr technical spec_xcg.
	*
	* @param XCG01252 the xcg01252 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01252(java.lang.String XCG01252) {
		_vrTechnicalSpec_XCG.setXCG01252(XCG01252);
	}

	/**
	* Sets the xcg01253 of this vr technical spec_xcg.
	*
	* @param XCG01253 the xcg01253 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01253(java.lang.String XCG01253) {
		_vrTechnicalSpec_XCG.setXCG01253(XCG01253);
	}

	/**
	* Sets the xcg01255 of this vr technical spec_xcg.
	*
	* @param XCG01255 the xcg01255 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01255(java.lang.String XCG01255) {
		_vrTechnicalSpec_XCG.setXCG01255(XCG01255);
	}

	/**
	* Sets the xcg01256 of this vr technical spec_xcg.
	*
	* @param XCG01256 the xcg01256 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01256(java.lang.String XCG01256) {
		_vrTechnicalSpec_XCG.setXCG01256(XCG01256);
	}

	/**
	* Sets the xcg01257 of this vr technical spec_xcg.
	*
	* @param XCG01257 the xcg01257 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01257(java.lang.String XCG01257) {
		_vrTechnicalSpec_XCG.setXCG01257(XCG01257);
	}

	/**
	* Sets the xcg01258 of this vr technical spec_xcg.
	*
	* @param XCG01258 the xcg01258 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01258(java.lang.String XCG01258) {
		_vrTechnicalSpec_XCG.setXCG01258(XCG01258);
	}

	/**
	* Sets the xcg01259 of this vr technical spec_xcg.
	*
	* @param XCG01259 the xcg01259 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01259(java.lang.String XCG01259) {
		_vrTechnicalSpec_XCG.setXCG01259(XCG01259);
	}

	/**
	* Sets the xcg01260 of this vr technical spec_xcg.
	*
	* @param XCG01260 the xcg01260 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01260(java.lang.String XCG01260) {
		_vrTechnicalSpec_XCG.setXCG01260(XCG01260);
	}

	/**
	* Sets the xcg01261 of this vr technical spec_xcg.
	*
	* @param XCG01261 the xcg01261 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01261(java.lang.String XCG01261) {
		_vrTechnicalSpec_XCG.setXCG01261(XCG01261);
	}

	/**
	* Sets the xcg01262 of this vr technical spec_xcg.
	*
	* @param XCG01262 the xcg01262 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01262(java.lang.String XCG01262) {
		_vrTechnicalSpec_XCG.setXCG01262(XCG01262);
	}

	/**
	* Sets the xcg01263 of this vr technical spec_xcg.
	*
	* @param XCG01263 the xcg01263 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01263(java.lang.String XCG01263) {
		_vrTechnicalSpec_XCG.setXCG01263(XCG01263);
	}

	/**
	* Sets the xcg01264 of this vr technical spec_xcg.
	*
	* @param XCG01264 the xcg01264 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01264(java.lang.String XCG01264) {
		_vrTechnicalSpec_XCG.setXCG01264(XCG01264);
	}

	/**
	* Sets the xcg01265 of this vr technical spec_xcg.
	*
	* @param XCG01265 the xcg01265 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01265(java.lang.String XCG01265) {
		_vrTechnicalSpec_XCG.setXCG01265(XCG01265);
	}

	/**
	* Sets the xcg01266 of this vr technical spec_xcg.
	*
	* @param XCG01266 the xcg01266 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01266(java.lang.String XCG01266) {
		_vrTechnicalSpec_XCG.setXCG01266(XCG01266);
	}

	/**
	* Sets the xcg01267 of this vr technical spec_xcg.
	*
	* @param XCG01267 the xcg01267 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01267(java.lang.String XCG01267) {
		_vrTechnicalSpec_XCG.setXCG01267(XCG01267);
	}

	/**
	* Sets the xcg01268 of this vr technical spec_xcg.
	*
	* @param XCG01268 the xcg01268 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01268(java.lang.String XCG01268) {
		_vrTechnicalSpec_XCG.setXCG01268(XCG01268);
	}

	/**
	* Sets the xcg01269 of this vr technical spec_xcg.
	*
	* @param XCG01269 the xcg01269 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01269(java.lang.String XCG01269) {
		_vrTechnicalSpec_XCG.setXCG01269(XCG01269);
	}

	/**
	* Sets the xcg01270 of this vr technical spec_xcg.
	*
	* @param XCG01270 the xcg01270 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01270(java.lang.String XCG01270) {
		_vrTechnicalSpec_XCG.setXCG01270(XCG01270);
	}

	/**
	* Sets the xcg01271 of this vr technical spec_xcg.
	*
	* @param XCG01271 the xcg01271 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01271(java.lang.String XCG01271) {
		_vrTechnicalSpec_XCG.setXCG01271(XCG01271);
	}

	/**
	* Sets the xcg01273 of this vr technical spec_xcg.
	*
	* @param XCG01273 the xcg01273 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01273(java.lang.String XCG01273) {
		_vrTechnicalSpec_XCG.setXCG01273(XCG01273);
	}

	/**
	* Sets the xcg01274 of this vr technical spec_xcg.
	*
	* @param XCG01274 the xcg01274 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01274(java.lang.String XCG01274) {
		_vrTechnicalSpec_XCG.setXCG01274(XCG01274);
	}

	/**
	* Sets the xcg01275 of this vr technical spec_xcg.
	*
	* @param XCG01275 the xcg01275 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01275(java.lang.String XCG01275) {
		_vrTechnicalSpec_XCG.setXCG01275(XCG01275);
	}

	/**
	* Sets the xcg01276 of this vr technical spec_xcg.
	*
	* @param XCG01276 the xcg01276 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01276(java.lang.String XCG01276) {
		_vrTechnicalSpec_XCG.setXCG01276(XCG01276);
	}

	/**
	* Sets the xcg01277 of this vr technical spec_xcg.
	*
	* @param XCG01277 the xcg01277 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01277(java.lang.String XCG01277) {
		_vrTechnicalSpec_XCG.setXCG01277(XCG01277);
	}

	/**
	* Sets the xcg01278 of this vr technical spec_xcg.
	*
	* @param XCG01278 the xcg01278 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01278(java.lang.String XCG01278) {
		_vrTechnicalSpec_XCG.setXCG01278(XCG01278);
	}

	/**
	* Sets the xcg01279 of this vr technical spec_xcg.
	*
	* @param XCG01279 the xcg01279 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01279(java.lang.String XCG01279) {
		_vrTechnicalSpec_XCG.setXCG01279(XCG01279);
	}

	/**
	* Sets the xcg01280 of this vr technical spec_xcg.
	*
	* @param XCG01280 the xcg01280 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01280(java.lang.String XCG01280) {
		_vrTechnicalSpec_XCG.setXCG01280(XCG01280);
	}

	/**
	* Sets the xcg01281 of this vr technical spec_xcg.
	*
	* @param XCG01281 the xcg01281 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01281(java.lang.String XCG01281) {
		_vrTechnicalSpec_XCG.setXCG01281(XCG01281);
	}

	/**
	* Sets the xcg01282 of this vr technical spec_xcg.
	*
	* @param XCG01282 the xcg01282 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01282(java.lang.String XCG01282) {
		_vrTechnicalSpec_XCG.setXCG01282(XCG01282);
	}

	/**
	* Sets the xcg01283 of this vr technical spec_xcg.
	*
	* @param XCG01283 the xcg01283 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01283(java.lang.String XCG01283) {
		_vrTechnicalSpec_XCG.setXCG01283(XCG01283);
	}

	/**
	* Sets the xcg01284 of this vr technical spec_xcg.
	*
	* @param XCG01284 the xcg01284 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01284(java.lang.String XCG01284) {
		_vrTechnicalSpec_XCG.setXCG01284(XCG01284);
	}

	/**
	* Sets the xcg01285 of this vr technical spec_xcg.
	*
	* @param XCG01285 the xcg01285 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01285(java.lang.String XCG01285) {
		_vrTechnicalSpec_XCG.setXCG01285(XCG01285);
	}

	/**
	* Sets the xcg01286 of this vr technical spec_xcg.
	*
	* @param XCG01286 the xcg01286 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01286(java.lang.String XCG01286) {
		_vrTechnicalSpec_XCG.setXCG01286(XCG01286);
	}

	/**
	* Sets the xcg01287 of this vr technical spec_xcg.
	*
	* @param XCG01287 the xcg01287 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01287(java.lang.String XCG01287) {
		_vrTechnicalSpec_XCG.setXCG01287(XCG01287);
	}

	/**
	* Sets the xcg01288 of this vr technical spec_xcg.
	*
	* @param XCG01288 the xcg01288 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01288(java.lang.String XCG01288) {
		_vrTechnicalSpec_XCG.setXCG01288(XCG01288);
	}

	/**
	* Sets the xcg01289 of this vr technical spec_xcg.
	*
	* @param XCG01289 the xcg01289 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01289(java.lang.String XCG01289) {
		_vrTechnicalSpec_XCG.setXCG01289(XCG01289);
	}

	/**
	* Sets the xcg01290 of this vr technical spec_xcg.
	*
	* @param XCG01290 the xcg01290 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01290(java.lang.String XCG01290) {
		_vrTechnicalSpec_XCG.setXCG01290(XCG01290);
	}

	/**
	* Sets the xcg01291 of this vr technical spec_xcg.
	*
	* @param XCG01291 the xcg01291 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01291(java.lang.String XCG01291) {
		_vrTechnicalSpec_XCG.setXCG01291(XCG01291);
	}

	/**
	* Sets the xcg01292 of this vr technical spec_xcg.
	*
	* @param XCG01292 the xcg01292 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01292(java.lang.String XCG01292) {
		_vrTechnicalSpec_XCG.setXCG01292(XCG01292);
	}

	/**
	* Sets the xcg01293 of this vr technical spec_xcg.
	*
	* @param XCG01293 the xcg01293 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01293(java.lang.String XCG01293) {
		_vrTechnicalSpec_XCG.setXCG01293(XCG01293);
	}

	/**
	* Sets the xcg01294 of this vr technical spec_xcg.
	*
	* @param XCG01294 the xcg01294 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01294(java.lang.String XCG01294) {
		_vrTechnicalSpec_XCG.setXCG01294(XCG01294);
	}

	/**
	* Sets the xcg01295 of this vr technical spec_xcg.
	*
	* @param XCG01295 the xcg01295 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01295(java.lang.String XCG01295) {
		_vrTechnicalSpec_XCG.setXCG01295(XCG01295);
	}

	/**
	* Sets the xcg01296 of this vr technical spec_xcg.
	*
	* @param XCG01296 the xcg01296 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01296(java.lang.String XCG01296) {
		_vrTechnicalSpec_XCG.setXCG01296(XCG01296);
	}

	/**
	* Sets the xcg01297 of this vr technical spec_xcg.
	*
	* @param XCG01297 the xcg01297 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01297(java.lang.String XCG01297) {
		_vrTechnicalSpec_XCG.setXCG01297(XCG01297);
	}

	/**
	* Sets the xcg01298 of this vr technical spec_xcg.
	*
	* @param XCG01298 the xcg01298 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01298(java.lang.String XCG01298) {
		_vrTechnicalSpec_XCG.setXCG01298(XCG01298);
	}

	/**
	* Sets the xcg01300 of this vr technical spec_xcg.
	*
	* @param XCG01300 the xcg01300 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01300(java.lang.String XCG01300) {
		_vrTechnicalSpec_XCG.setXCG01300(XCG01300);
	}

	/**
	* Sets the xcg01301 of this vr technical spec_xcg.
	*
	* @param XCG01301 the xcg01301 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01301(java.lang.String XCG01301) {
		_vrTechnicalSpec_XCG.setXCG01301(XCG01301);
	}

	/**
	* Sets the xcg01302 of this vr technical spec_xcg.
	*
	* @param XCG01302 the xcg01302 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01302(java.lang.String XCG01302) {
		_vrTechnicalSpec_XCG.setXCG01302(XCG01302);
	}

	/**
	* Sets the xcg01303 of this vr technical spec_xcg.
	*
	* @param XCG01303 the xcg01303 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01303(java.lang.String XCG01303) {
		_vrTechnicalSpec_XCG.setXCG01303(XCG01303);
	}

	/**
	* Sets the xcg01304 of this vr technical spec_xcg.
	*
	* @param XCG01304 the xcg01304 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01304(java.lang.String XCG01304) {
		_vrTechnicalSpec_XCG.setXCG01304(XCG01304);
	}

	/**
	* Sets the xcg01305 of this vr technical spec_xcg.
	*
	* @param XCG01305 the xcg01305 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01305(java.lang.String XCG01305) {
		_vrTechnicalSpec_XCG.setXCG01305(XCG01305);
	}

	/**
	* Sets the xcg01306 of this vr technical spec_xcg.
	*
	* @param XCG01306 the xcg01306 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01306(java.lang.String XCG01306) {
		_vrTechnicalSpec_XCG.setXCG01306(XCG01306);
	}

	/**
	* Sets the xcg01307 of this vr technical spec_xcg.
	*
	* @param XCG01307 the xcg01307 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01307(java.lang.String XCG01307) {
		_vrTechnicalSpec_XCG.setXCG01307(XCG01307);
	}

	/**
	* Sets the xcg01308 of this vr technical spec_xcg.
	*
	* @param XCG01308 the xcg01308 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01308(java.lang.String XCG01308) {
		_vrTechnicalSpec_XCG.setXCG01308(XCG01308);
	}

	/**
	* Sets the xcg01310 of this vr technical spec_xcg.
	*
	* @param XCG01310 the xcg01310 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01310(java.lang.String XCG01310) {
		_vrTechnicalSpec_XCG.setXCG01310(XCG01310);
	}

	/**
	* Sets the xcg01311 of this vr technical spec_xcg.
	*
	* @param XCG01311 the xcg01311 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01311(java.lang.String XCG01311) {
		_vrTechnicalSpec_XCG.setXCG01311(XCG01311);
	}

	/**
	* Sets the xcg01312 of this vr technical spec_xcg.
	*
	* @param XCG01312 the xcg01312 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01312(java.lang.String XCG01312) {
		_vrTechnicalSpec_XCG.setXCG01312(XCG01312);
	}

	/**
	* Sets the xcg01313 of this vr technical spec_xcg.
	*
	* @param XCG01313 the xcg01313 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01313(java.lang.String XCG01313) {
		_vrTechnicalSpec_XCG.setXCG01313(XCG01313);
	}

	/**
	* Sets the xcg01314 of this vr technical spec_xcg.
	*
	* @param XCG01314 the xcg01314 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01314(java.lang.String XCG01314) {
		_vrTechnicalSpec_XCG.setXCG01314(XCG01314);
	}

	/**
	* Sets the xcg01315 of this vr technical spec_xcg.
	*
	* @param XCG01315 the xcg01315 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01315(java.lang.String XCG01315) {
		_vrTechnicalSpec_XCG.setXCG01315(XCG01315);
	}

	/**
	* Sets the xcg01316 of this vr technical spec_xcg.
	*
	* @param XCG01316 the xcg01316 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01316(java.lang.String XCG01316) {
		_vrTechnicalSpec_XCG.setXCG01316(XCG01316);
	}

	/**
	* Sets the xcg01317 of this vr technical spec_xcg.
	*
	* @param XCG01317 the xcg01317 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01317(java.lang.String XCG01317) {
		_vrTechnicalSpec_XCG.setXCG01317(XCG01317);
	}

	/**
	* Sets the xcg01318 of this vr technical spec_xcg.
	*
	* @param XCG01318 the xcg01318 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01318(java.lang.String XCG01318) {
		_vrTechnicalSpec_XCG.setXCG01318(XCG01318);
	}

	/**
	* Sets the xcg01319 of this vr technical spec_xcg.
	*
	* @param XCG01319 the xcg01319 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01319(java.lang.String XCG01319) {
		_vrTechnicalSpec_XCG.setXCG01319(XCG01319);
	}

	/**
	* Sets the xcg01320 of this vr technical spec_xcg.
	*
	* @param XCG01320 the xcg01320 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01320(java.lang.String XCG01320) {
		_vrTechnicalSpec_XCG.setXCG01320(XCG01320);
	}

	/**
	* Sets the xcg01321 of this vr technical spec_xcg.
	*
	* @param XCG01321 the xcg01321 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01321(java.lang.String XCG01321) {
		_vrTechnicalSpec_XCG.setXCG01321(XCG01321);
	}

	/**
	* Sets the xcg01322 of this vr technical spec_xcg.
	*
	* @param XCG01322 the xcg01322 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01322(java.lang.String XCG01322) {
		_vrTechnicalSpec_XCG.setXCG01322(XCG01322);
	}

	/**
	* Sets the xcg01323 of this vr technical spec_xcg.
	*
	* @param XCG01323 the xcg01323 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01323(java.lang.String XCG01323) {
		_vrTechnicalSpec_XCG.setXCG01323(XCG01323);
	}

	/**
	* Sets the xcg01324 of this vr technical spec_xcg.
	*
	* @param XCG01324 the xcg01324 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01324(java.lang.String XCG01324) {
		_vrTechnicalSpec_XCG.setXCG01324(XCG01324);
	}

	/**
	* Sets the xcg01325 of this vr technical spec_xcg.
	*
	* @param XCG01325 the xcg01325 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01325(java.lang.String XCG01325) {
		_vrTechnicalSpec_XCG.setXCG01325(XCG01325);
	}

	/**
	* Sets the xcg01326 of this vr technical spec_xcg.
	*
	* @param XCG01326 the xcg01326 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01326(java.lang.String XCG01326) {
		_vrTechnicalSpec_XCG.setXCG01326(XCG01326);
	}

	/**
	* Sets the xcg01327 of this vr technical spec_xcg.
	*
	* @param XCG01327 the xcg01327 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01327(java.lang.String XCG01327) {
		_vrTechnicalSpec_XCG.setXCG01327(XCG01327);
	}

	/**
	* Sets the xcg01328 of this vr technical spec_xcg.
	*
	* @param XCG01328 the xcg01328 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01328(java.lang.String XCG01328) {
		_vrTechnicalSpec_XCG.setXCG01328(XCG01328);
	}

	/**
	* Sets the xcg01330 of this vr technical spec_xcg.
	*
	* @param XCG01330 the xcg01330 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01330(java.lang.String XCG01330) {
		_vrTechnicalSpec_XCG.setXCG01330(XCG01330);
	}

	/**
	* Sets the xcg01331 of this vr technical spec_xcg.
	*
	* @param XCG01331 the xcg01331 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01331(java.lang.String XCG01331) {
		_vrTechnicalSpec_XCG.setXCG01331(XCG01331);
	}

	/**
	* Sets the xcg01332 of this vr technical spec_xcg.
	*
	* @param XCG01332 the xcg01332 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01332(java.lang.String XCG01332) {
		_vrTechnicalSpec_XCG.setXCG01332(XCG01332);
	}

	/**
	* Sets the xcg01333 of this vr technical spec_xcg.
	*
	* @param XCG01333 the xcg01333 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01333(java.lang.String XCG01333) {
		_vrTechnicalSpec_XCG.setXCG01333(XCG01333);
	}

	/**
	* Sets the xcg01334 of this vr technical spec_xcg.
	*
	* @param XCG01334 the xcg01334 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01334(java.lang.String XCG01334) {
		_vrTechnicalSpec_XCG.setXCG01334(XCG01334);
	}

	/**
	* Sets the xcg01335 of this vr technical spec_xcg.
	*
	* @param XCG01335 the xcg01335 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01335(java.lang.String XCG01335) {
		_vrTechnicalSpec_XCG.setXCG01335(XCG01335);
	}

	/**
	* Sets the xcg01336 of this vr technical spec_xcg.
	*
	* @param XCG01336 the xcg01336 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01336(java.lang.String XCG01336) {
		_vrTechnicalSpec_XCG.setXCG01336(XCG01336);
	}

	/**
	* Sets the xcg01337 of this vr technical spec_xcg.
	*
	* @param XCG01337 the xcg01337 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01337(java.lang.String XCG01337) {
		_vrTechnicalSpec_XCG.setXCG01337(XCG01337);
	}

	/**
	* Sets the xcg01338 of this vr technical spec_xcg.
	*
	* @param XCG01338 the xcg01338 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01338(java.lang.String XCG01338) {
		_vrTechnicalSpec_XCG.setXCG01338(XCG01338);
	}

	/**
	* Sets the xcg01339 of this vr technical spec_xcg.
	*
	* @param XCG01339 the xcg01339 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01339(java.lang.String XCG01339) {
		_vrTechnicalSpec_XCG.setXCG01339(XCG01339);
	}

	/**
	* Sets the xcg01340 of this vr technical spec_xcg.
	*
	* @param XCG01340 the xcg01340 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01340(java.lang.String XCG01340) {
		_vrTechnicalSpec_XCG.setXCG01340(XCG01340);
	}

	/**
	* Sets the xcg01341 of this vr technical spec_xcg.
	*
	* @param XCG01341 the xcg01341 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01341(java.lang.String XCG01341) {
		_vrTechnicalSpec_XCG.setXCG01341(XCG01341);
	}

	/**
	* Sets the xcg01342 of this vr technical spec_xcg.
	*
	* @param XCG01342 the xcg01342 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01342(java.lang.String XCG01342) {
		_vrTechnicalSpec_XCG.setXCG01342(XCG01342);
	}

	/**
	* Sets the xcg01343 of this vr technical spec_xcg.
	*
	* @param XCG01343 the xcg01343 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01343(java.lang.String XCG01343) {
		_vrTechnicalSpec_XCG.setXCG01343(XCG01343);
	}

	/**
	* Sets the xcg01344 of this vr technical spec_xcg.
	*
	* @param XCG01344 the xcg01344 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01344(java.lang.String XCG01344) {
		_vrTechnicalSpec_XCG.setXCG01344(XCG01344);
	}

	/**
	* Sets the xcg01345 of this vr technical spec_xcg.
	*
	* @param XCG01345 the xcg01345 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01345(java.lang.String XCG01345) {
		_vrTechnicalSpec_XCG.setXCG01345(XCG01345);
	}

	/**
	* Sets the xcg01346 of this vr technical spec_xcg.
	*
	* @param XCG01346 the xcg01346 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01346(java.lang.String XCG01346) {
		_vrTechnicalSpec_XCG.setXCG01346(XCG01346);
	}

	/**
	* Sets the xcg01347 of this vr technical spec_xcg.
	*
	* @param XCG01347 the xcg01347 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01347(java.lang.String XCG01347) {
		_vrTechnicalSpec_XCG.setXCG01347(XCG01347);
	}

	/**
	* Sets the xcg01348 of this vr technical spec_xcg.
	*
	* @param XCG01348 the xcg01348 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01348(java.lang.String XCG01348) {
		_vrTechnicalSpec_XCG.setXCG01348(XCG01348);
	}

	/**
	* Sets the xcg01349 of this vr technical spec_xcg.
	*
	* @param XCG01349 the xcg01349 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01349(java.lang.String XCG01349) {
		_vrTechnicalSpec_XCG.setXCG01349(XCG01349);
	}

	/**
	* Sets the xcg01350 of this vr technical spec_xcg.
	*
	* @param XCG01350 the xcg01350 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01350(java.lang.String XCG01350) {
		_vrTechnicalSpec_XCG.setXCG01350(XCG01350);
	}

	/**
	* Sets the xcg01351 of this vr technical spec_xcg.
	*
	* @param XCG01351 the xcg01351 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01351(java.lang.String XCG01351) {
		_vrTechnicalSpec_XCG.setXCG01351(XCG01351);
	}

	/**
	* Sets the xcg01352 of this vr technical spec_xcg.
	*
	* @param XCG01352 the xcg01352 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01352(java.lang.String XCG01352) {
		_vrTechnicalSpec_XCG.setXCG01352(XCG01352);
	}

	/**
	* Sets the xcg01353 of this vr technical spec_xcg.
	*
	* @param XCG01353 the xcg01353 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01353(java.lang.String XCG01353) {
		_vrTechnicalSpec_XCG.setXCG01353(XCG01353);
	}

	/**
	* Sets the xcg01354 of this vr technical spec_xcg.
	*
	* @param XCG01354 the xcg01354 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01354(java.lang.String XCG01354) {
		_vrTechnicalSpec_XCG.setXCG01354(XCG01354);
	}

	/**
	* Sets the xcg01355 of this vr technical spec_xcg.
	*
	* @param XCG01355 the xcg01355 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01355(java.lang.String XCG01355) {
		_vrTechnicalSpec_XCG.setXCG01355(XCG01355);
	}

	/**
	* Sets the xcg01356 of this vr technical spec_xcg.
	*
	* @param XCG01356 the xcg01356 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01356(java.lang.String XCG01356) {
		_vrTechnicalSpec_XCG.setXCG01356(XCG01356);
	}

	/**
	* Sets the xcg01357 of this vr technical spec_xcg.
	*
	* @param XCG01357 the xcg01357 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01357(java.lang.String XCG01357) {
		_vrTechnicalSpec_XCG.setXCG01357(XCG01357);
	}

	/**
	* Sets the xcg01358 of this vr technical spec_xcg.
	*
	* @param XCG01358 the xcg01358 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01358(java.lang.String XCG01358) {
		_vrTechnicalSpec_XCG.setXCG01358(XCG01358);
	}

	/**
	* Sets the xcg01359 of this vr technical spec_xcg.
	*
	* @param XCG01359 the xcg01359 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01359(java.lang.String XCG01359) {
		_vrTechnicalSpec_XCG.setXCG01359(XCG01359);
	}

	/**
	* Sets the xcg01360 of this vr technical spec_xcg.
	*
	* @param XCG01360 the xcg01360 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01360(java.lang.String XCG01360) {
		_vrTechnicalSpec_XCG.setXCG01360(XCG01360);
	}

	/**
	* Sets the xcg01361 of this vr technical spec_xcg.
	*
	* @param XCG01361 the xcg01361 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01361(java.lang.String XCG01361) {
		_vrTechnicalSpec_XCG.setXCG01361(XCG01361);
	}

	/**
	* Sets the xcg01362 of this vr technical spec_xcg.
	*
	* @param XCG01362 the xcg01362 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01362(java.lang.String XCG01362) {
		_vrTechnicalSpec_XCG.setXCG01362(XCG01362);
	}

	/**
	* Sets the xcg01363 of this vr technical spec_xcg.
	*
	* @param XCG01363 the xcg01363 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01363(java.lang.String XCG01363) {
		_vrTechnicalSpec_XCG.setXCG01363(XCG01363);
	}

	/**
	* Sets the xcg01364 of this vr technical spec_xcg.
	*
	* @param XCG01364 the xcg01364 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01364(java.lang.String XCG01364) {
		_vrTechnicalSpec_XCG.setXCG01364(XCG01364);
	}

	/**
	* Sets the xcg01365 of this vr technical spec_xcg.
	*
	* @param XCG01365 the xcg01365 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01365(java.lang.String XCG01365) {
		_vrTechnicalSpec_XCG.setXCG01365(XCG01365);
	}

	/**
	* Sets the xcg01366 of this vr technical spec_xcg.
	*
	* @param XCG01366 the xcg01366 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01366(java.lang.String XCG01366) {
		_vrTechnicalSpec_XCG.setXCG01366(XCG01366);
	}

	/**
	* Sets the xcg01367 of this vr technical spec_xcg.
	*
	* @param XCG01367 the xcg01367 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01367(java.lang.String XCG01367) {
		_vrTechnicalSpec_XCG.setXCG01367(XCG01367);
	}

	/**
	* Sets the xcg01368 of this vr technical spec_xcg.
	*
	* @param XCG01368 the xcg01368 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01368(java.lang.String XCG01368) {
		_vrTechnicalSpec_XCG.setXCG01368(XCG01368);
	}

	/**
	* Sets the xcg01369 of this vr technical spec_xcg.
	*
	* @param XCG01369 the xcg01369 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01369(java.lang.String XCG01369) {
		_vrTechnicalSpec_XCG.setXCG01369(XCG01369);
	}

	/**
	* Sets the xcg01370 of this vr technical spec_xcg.
	*
	* @param XCG01370 the xcg01370 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01370(java.lang.String XCG01370) {
		_vrTechnicalSpec_XCG.setXCG01370(XCG01370);
	}

	/**
	* Sets the xcg01371 of this vr technical spec_xcg.
	*
	* @param XCG01371 the xcg01371 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01371(java.lang.String XCG01371) {
		_vrTechnicalSpec_XCG.setXCG01371(XCG01371);
	}

	/**
	* Sets the xcg01372 of this vr technical spec_xcg.
	*
	* @param XCG01372 the xcg01372 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01372(java.lang.String XCG01372) {
		_vrTechnicalSpec_XCG.setXCG01372(XCG01372);
	}

	/**
	* Sets the xcg01373 of this vr technical spec_xcg.
	*
	* @param XCG01373 the xcg01373 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01373(java.lang.String XCG01373) {
		_vrTechnicalSpec_XCG.setXCG01373(XCG01373);
	}

	/**
	* Sets the xcg01374 of this vr technical spec_xcg.
	*
	* @param XCG01374 the xcg01374 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01374(java.lang.String XCG01374) {
		_vrTechnicalSpec_XCG.setXCG01374(XCG01374);
	}

	/**
	* Sets the xcg01375 of this vr technical spec_xcg.
	*
	* @param XCG01375 the xcg01375 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01375(java.lang.String XCG01375) {
		_vrTechnicalSpec_XCG.setXCG01375(XCG01375);
	}

	/**
	* Sets the xcg01376 of this vr technical spec_xcg.
	*
	* @param XCG01376 the xcg01376 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01376(java.lang.String XCG01376) {
		_vrTechnicalSpec_XCG.setXCG01376(XCG01376);
	}

	/**
	* Sets the xcg01377 of this vr technical spec_xcg.
	*
	* @param XCG01377 the xcg01377 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01377(java.lang.String XCG01377) {
		_vrTechnicalSpec_XCG.setXCG01377(XCG01377);
	}

	/**
	* Sets the xcg01378 of this vr technical spec_xcg.
	*
	* @param XCG01378 the xcg01378 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01378(java.lang.String XCG01378) {
		_vrTechnicalSpec_XCG.setXCG01378(XCG01378);
	}

	/**
	* Sets the xcg01379 of this vr technical spec_xcg.
	*
	* @param XCG01379 the xcg01379 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01379(java.lang.String XCG01379) {
		_vrTechnicalSpec_XCG.setXCG01379(XCG01379);
	}

	/**
	* Sets the xcg01381 of this vr technical spec_xcg.
	*
	* @param XCG01381 the xcg01381 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01381(java.lang.String XCG01381) {
		_vrTechnicalSpec_XCG.setXCG01381(XCG01381);
	}

	/**
	* Sets the xcg01382 of this vr technical spec_xcg.
	*
	* @param XCG01382 the xcg01382 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01382(java.lang.String XCG01382) {
		_vrTechnicalSpec_XCG.setXCG01382(XCG01382);
	}

	/**
	* Sets the xcg01383 of this vr technical spec_xcg.
	*
	* @param XCG01383 the xcg01383 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01383(java.lang.String XCG01383) {
		_vrTechnicalSpec_XCG.setXCG01383(XCG01383);
	}

	/**
	* Sets the xcg01384 of this vr technical spec_xcg.
	*
	* @param XCG01384 the xcg01384 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01384(java.lang.String XCG01384) {
		_vrTechnicalSpec_XCG.setXCG01384(XCG01384);
	}

	/**
	* Sets the xcg01385 of this vr technical spec_xcg.
	*
	* @param XCG01385 the xcg01385 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01385(java.lang.String XCG01385) {
		_vrTechnicalSpec_XCG.setXCG01385(XCG01385);
	}

	/**
	* Sets the xcg01386 of this vr technical spec_xcg.
	*
	* @param XCG01386 the xcg01386 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01386(java.lang.String XCG01386) {
		_vrTechnicalSpec_XCG.setXCG01386(XCG01386);
	}

	/**
	* Sets the xcg01387 of this vr technical spec_xcg.
	*
	* @param XCG01387 the xcg01387 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01387(java.lang.String XCG01387) {
		_vrTechnicalSpec_XCG.setXCG01387(XCG01387);
	}

	/**
	* Sets the xcg01388 of this vr technical spec_xcg.
	*
	* @param XCG01388 the xcg01388 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01388(java.lang.String XCG01388) {
		_vrTechnicalSpec_XCG.setXCG01388(XCG01388);
	}

	/**
	* Sets the xcg01389 of this vr technical spec_xcg.
	*
	* @param XCG01389 the xcg01389 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01389(java.lang.String XCG01389) {
		_vrTechnicalSpec_XCG.setXCG01389(XCG01389);
	}

	/**
	* Sets the xcg01390 of this vr technical spec_xcg.
	*
	* @param XCG01390 the xcg01390 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01390(java.lang.String XCG01390) {
		_vrTechnicalSpec_XCG.setXCG01390(XCG01390);
	}

	/**
	* Sets the xcg01391 of this vr technical spec_xcg.
	*
	* @param XCG01391 the xcg01391 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01391(java.lang.String XCG01391) {
		_vrTechnicalSpec_XCG.setXCG01391(XCG01391);
	}

	/**
	* Sets the xcg01392 of this vr technical spec_xcg.
	*
	* @param XCG01392 the xcg01392 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01392(java.lang.String XCG01392) {
		_vrTechnicalSpec_XCG.setXCG01392(XCG01392);
	}

	/**
	* Sets the xcg01393 of this vr technical spec_xcg.
	*
	* @param XCG01393 the xcg01393 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01393(java.lang.String XCG01393) {
		_vrTechnicalSpec_XCG.setXCG01393(XCG01393);
	}

	/**
	* Sets the xcg01394 of this vr technical spec_xcg.
	*
	* @param XCG01394 the xcg01394 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01394(java.lang.String XCG01394) {
		_vrTechnicalSpec_XCG.setXCG01394(XCG01394);
	}

	/**
	* Sets the xcg01395 of this vr technical spec_xcg.
	*
	* @param XCG01395 the xcg01395 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01395(java.lang.String XCG01395) {
		_vrTechnicalSpec_XCG.setXCG01395(XCG01395);
	}

	/**
	* Sets the xcg01396 of this vr technical spec_xcg.
	*
	* @param XCG01396 the xcg01396 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01396(java.lang.String XCG01396) {
		_vrTechnicalSpec_XCG.setXCG01396(XCG01396);
	}

	/**
	* Sets the xcg01397 of this vr technical spec_xcg.
	*
	* @param XCG01397 the xcg01397 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01397(java.lang.String XCG01397) {
		_vrTechnicalSpec_XCG.setXCG01397(XCG01397);
	}

	/**
	* Sets the xcg01398 of this vr technical spec_xcg.
	*
	* @param XCG01398 the xcg01398 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01398(java.lang.String XCG01398) {
		_vrTechnicalSpec_XCG.setXCG01398(XCG01398);
	}

	/**
	* Sets the xcg01399 of this vr technical spec_xcg.
	*
	* @param XCG01399 the xcg01399 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01399(java.lang.String XCG01399) {
		_vrTechnicalSpec_XCG.setXCG01399(XCG01399);
	}

	/**
	* Sets the xcg01400 of this vr technical spec_xcg.
	*
	* @param XCG01400 the xcg01400 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01400(java.lang.String XCG01400) {
		_vrTechnicalSpec_XCG.setXCG01400(XCG01400);
	}

	/**
	* Sets the xcg01402 of this vr technical spec_xcg.
	*
	* @param XCG01402 the xcg01402 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01402(java.lang.String XCG01402) {
		_vrTechnicalSpec_XCG.setXCG01402(XCG01402);
	}

	/**
	* Sets the xcg01403 of this vr technical spec_xcg.
	*
	* @param XCG01403 the xcg01403 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01403(java.lang.String XCG01403) {
		_vrTechnicalSpec_XCG.setXCG01403(XCG01403);
	}

	/**
	* Sets the xcg01404 of this vr technical spec_xcg.
	*
	* @param XCG01404 the xcg01404 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01404(java.lang.String XCG01404) {
		_vrTechnicalSpec_XCG.setXCG01404(XCG01404);
	}

	/**
	* Sets the xcg01405 of this vr technical spec_xcg.
	*
	* @param XCG01405 the xcg01405 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01405(java.lang.String XCG01405) {
		_vrTechnicalSpec_XCG.setXCG01405(XCG01405);
	}

	/**
	* Sets the xcg01406 of this vr technical spec_xcg.
	*
	* @param XCG01406 the xcg01406 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01406(java.lang.String XCG01406) {
		_vrTechnicalSpec_XCG.setXCG01406(XCG01406);
	}

	/**
	* Sets the xcg01407 of this vr technical spec_xcg.
	*
	* @param XCG01407 the xcg01407 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01407(java.lang.String XCG01407) {
		_vrTechnicalSpec_XCG.setXCG01407(XCG01407);
	}

	/**
	* Sets the xcg01408 of this vr technical spec_xcg.
	*
	* @param XCG01408 the xcg01408 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01408(java.lang.String XCG01408) {
		_vrTechnicalSpec_XCG.setXCG01408(XCG01408);
	}

	/**
	* Sets the xcg01409 of this vr technical spec_xcg.
	*
	* @param XCG01409 the xcg01409 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01409(java.lang.String XCG01409) {
		_vrTechnicalSpec_XCG.setXCG01409(XCG01409);
	}

	/**
	* Sets the xcg01410 of this vr technical spec_xcg.
	*
	* @param XCG01410 the xcg01410 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01410(java.lang.String XCG01410) {
		_vrTechnicalSpec_XCG.setXCG01410(XCG01410);
	}

	/**
	* Sets the xcg01411 of this vr technical spec_xcg.
	*
	* @param XCG01411 the xcg01411 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01411(java.lang.String XCG01411) {
		_vrTechnicalSpec_XCG.setXCG01411(XCG01411);
	}

	/**
	* Sets the xcg01412 of this vr technical spec_xcg.
	*
	* @param XCG01412 the xcg01412 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01412(java.lang.String XCG01412) {
		_vrTechnicalSpec_XCG.setXCG01412(XCG01412);
	}

	/**
	* Sets the xcg01413 of this vr technical spec_xcg.
	*
	* @param XCG01413 the xcg01413 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01413(java.lang.String XCG01413) {
		_vrTechnicalSpec_XCG.setXCG01413(XCG01413);
	}

	/**
	* Sets the xcg01414 of this vr technical spec_xcg.
	*
	* @param XCG01414 the xcg01414 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01414(java.lang.String XCG01414) {
		_vrTechnicalSpec_XCG.setXCG01414(XCG01414);
	}

	/**
	* Sets the xcg01415 of this vr technical spec_xcg.
	*
	* @param XCG01415 the xcg01415 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01415(java.lang.String XCG01415) {
		_vrTechnicalSpec_XCG.setXCG01415(XCG01415);
	}

	/**
	* Sets the xcg01416 of this vr technical spec_xcg.
	*
	* @param XCG01416 the xcg01416 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01416(java.lang.String XCG01416) {
		_vrTechnicalSpec_XCG.setXCG01416(XCG01416);
	}

	/**
	* Sets the xcg01417 of this vr technical spec_xcg.
	*
	* @param XCG01417 the xcg01417 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01417(java.lang.String XCG01417) {
		_vrTechnicalSpec_XCG.setXCG01417(XCG01417);
	}

	/**
	* Sets the xcg01418 of this vr technical spec_xcg.
	*
	* @param XCG01418 the xcg01418 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01418(java.lang.String XCG01418) {
		_vrTechnicalSpec_XCG.setXCG01418(XCG01418);
	}

	/**
	* Sets the xcg01419 of this vr technical spec_xcg.
	*
	* @param XCG01419 the xcg01419 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01419(java.lang.String XCG01419) {
		_vrTechnicalSpec_XCG.setXCG01419(XCG01419);
	}

	/**
	* Sets the xcg01420 of this vr technical spec_xcg.
	*
	* @param XCG01420 the xcg01420 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01420(java.lang.String XCG01420) {
		_vrTechnicalSpec_XCG.setXCG01420(XCG01420);
	}

	/**
	* Sets the xcg01421 of this vr technical spec_xcg.
	*
	* @param XCG01421 the xcg01421 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01421(java.lang.String XCG01421) {
		_vrTechnicalSpec_XCG.setXCG01421(XCG01421);
	}

	/**
	* Sets the xcg01422 of this vr technical spec_xcg.
	*
	* @param XCG01422 the xcg01422 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01422(java.lang.String XCG01422) {
		_vrTechnicalSpec_XCG.setXCG01422(XCG01422);
	}

	/**
	* Sets the xcg01423 of this vr technical spec_xcg.
	*
	* @param XCG01423 the xcg01423 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01423(java.lang.String XCG01423) {
		_vrTechnicalSpec_XCG.setXCG01423(XCG01423);
	}

	/**
	* Sets the xcg01424 of this vr technical spec_xcg.
	*
	* @param XCG01424 the xcg01424 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01424(java.lang.String XCG01424) {
		_vrTechnicalSpec_XCG.setXCG01424(XCG01424);
	}

	/**
	* Sets the xcg01425 of this vr technical spec_xcg.
	*
	* @param XCG01425 the xcg01425 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01425(java.lang.String XCG01425) {
		_vrTechnicalSpec_XCG.setXCG01425(XCG01425);
	}

	/**
	* Sets the xcg01426 of this vr technical spec_xcg.
	*
	* @param XCG01426 the xcg01426 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01426(java.lang.String XCG01426) {
		_vrTechnicalSpec_XCG.setXCG01426(XCG01426);
	}

	/**
	* Sets the xcg01427 of this vr technical spec_xcg.
	*
	* @param XCG01427 the xcg01427 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01427(java.lang.String XCG01427) {
		_vrTechnicalSpec_XCG.setXCG01427(XCG01427);
	}

	/**
	* Sets the xcg01428 of this vr technical spec_xcg.
	*
	* @param XCG01428 the xcg01428 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01428(java.lang.String XCG01428) {
		_vrTechnicalSpec_XCG.setXCG01428(XCG01428);
	}

	/**
	* Sets the xcg01429 of this vr technical spec_xcg.
	*
	* @param XCG01429 the xcg01429 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01429(java.lang.String XCG01429) {
		_vrTechnicalSpec_XCG.setXCG01429(XCG01429);
	}

	/**
	* Sets the xcg01430 of this vr technical spec_xcg.
	*
	* @param XCG01430 the xcg01430 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01430(java.lang.String XCG01430) {
		_vrTechnicalSpec_XCG.setXCG01430(XCG01430);
	}

	/**
	* Sets the xcg01431 of this vr technical spec_xcg.
	*
	* @param XCG01431 the xcg01431 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01431(java.lang.String XCG01431) {
		_vrTechnicalSpec_XCG.setXCG01431(XCG01431);
	}

	/**
	* Sets the xcg01432 of this vr technical spec_xcg.
	*
	* @param XCG01432 the xcg01432 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01432(java.lang.String XCG01432) {
		_vrTechnicalSpec_XCG.setXCG01432(XCG01432);
	}

	/**
	* Sets the xcg01433 of this vr technical spec_xcg.
	*
	* @param XCG01433 the xcg01433 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01433(java.lang.String XCG01433) {
		_vrTechnicalSpec_XCG.setXCG01433(XCG01433);
	}

	/**
	* Sets the xcg01434 of this vr technical spec_xcg.
	*
	* @param XCG01434 the xcg01434 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01434(java.lang.String XCG01434) {
		_vrTechnicalSpec_XCG.setXCG01434(XCG01434);
	}

	/**
	* Sets the xcg01435 of this vr technical spec_xcg.
	*
	* @param XCG01435 the xcg01435 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01435(java.lang.String XCG01435) {
		_vrTechnicalSpec_XCG.setXCG01435(XCG01435);
	}

	/**
	* Sets the xcg01436 of this vr technical spec_xcg.
	*
	* @param XCG01436 the xcg01436 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01436(java.lang.String XCG01436) {
		_vrTechnicalSpec_XCG.setXCG01436(XCG01436);
	}

	/**
	* Sets the xcg01437 of this vr technical spec_xcg.
	*
	* @param XCG01437 the xcg01437 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01437(java.lang.String XCG01437) {
		_vrTechnicalSpec_XCG.setXCG01437(XCG01437);
	}

	/**
	* Sets the xcg01439 of this vr technical spec_xcg.
	*
	* @param XCG01439 the xcg01439 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01439(java.lang.String XCG01439) {
		_vrTechnicalSpec_XCG.setXCG01439(XCG01439);
	}

	/**
	* Sets the xcg01440 of this vr technical spec_xcg.
	*
	* @param XCG01440 the xcg01440 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01440(java.lang.String XCG01440) {
		_vrTechnicalSpec_XCG.setXCG01440(XCG01440);
	}

	/**
	* Sets the xcg01441 of this vr technical spec_xcg.
	*
	* @param XCG01441 the xcg01441 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01441(java.lang.String XCG01441) {
		_vrTechnicalSpec_XCG.setXCG01441(XCG01441);
	}

	/**
	* Sets the xcg01442 of this vr technical spec_xcg.
	*
	* @param XCG01442 the xcg01442 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01442(java.lang.String XCG01442) {
		_vrTechnicalSpec_XCG.setXCG01442(XCG01442);
	}

	/**
	* Sets the xcg01443 of this vr technical spec_xcg.
	*
	* @param XCG01443 the xcg01443 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01443(java.lang.String XCG01443) {
		_vrTechnicalSpec_XCG.setXCG01443(XCG01443);
	}

	/**
	* Sets the xcg01445 of this vr technical spec_xcg.
	*
	* @param XCG01445 the xcg01445 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01445(java.lang.String XCG01445) {
		_vrTechnicalSpec_XCG.setXCG01445(XCG01445);
	}

	/**
	* Sets the xcg01446 of this vr technical spec_xcg.
	*
	* @param XCG01446 the xcg01446 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01446(java.lang.String XCG01446) {
		_vrTechnicalSpec_XCG.setXCG01446(XCG01446);
	}

	/**
	* Sets the xcg01447 of this vr technical spec_xcg.
	*
	* @param XCG01447 the xcg01447 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01447(java.lang.String XCG01447) {
		_vrTechnicalSpec_XCG.setXCG01447(XCG01447);
	}

	/**
	* Sets the xcg01448 of this vr technical spec_xcg.
	*
	* @param XCG01448 the xcg01448 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01448(java.lang.String XCG01448) {
		_vrTechnicalSpec_XCG.setXCG01448(XCG01448);
	}

	/**
	* Sets the xcg01449 of this vr technical spec_xcg.
	*
	* @param XCG01449 the xcg01449 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01449(java.lang.String XCG01449) {
		_vrTechnicalSpec_XCG.setXCG01449(XCG01449);
	}

	/**
	* Sets the xcg01450 of this vr technical spec_xcg.
	*
	* @param XCG01450 the xcg01450 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01450(java.lang.String XCG01450) {
		_vrTechnicalSpec_XCG.setXCG01450(XCG01450);
	}

	/**
	* Sets the xcg01451 of this vr technical spec_xcg.
	*
	* @param XCG01451 the xcg01451 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01451(java.lang.String XCG01451) {
		_vrTechnicalSpec_XCG.setXCG01451(XCG01451);
	}

	/**
	* Sets the xcg01452 of this vr technical spec_xcg.
	*
	* @param XCG01452 the xcg01452 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01452(java.lang.String XCG01452) {
		_vrTechnicalSpec_XCG.setXCG01452(XCG01452);
	}

	/**
	* Sets the xcg01453 of this vr technical spec_xcg.
	*
	* @param XCG01453 the xcg01453 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01453(java.lang.String XCG01453) {
		_vrTechnicalSpec_XCG.setXCG01453(XCG01453);
	}

	/**
	* Sets the xcg01454 of this vr technical spec_xcg.
	*
	* @param XCG01454 the xcg01454 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01454(java.lang.String XCG01454) {
		_vrTechnicalSpec_XCG.setXCG01454(XCG01454);
	}

	/**
	* Sets the xcg01455 of this vr technical spec_xcg.
	*
	* @param XCG01455 the xcg01455 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01455(java.lang.String XCG01455) {
		_vrTechnicalSpec_XCG.setXCG01455(XCG01455);
	}

	/**
	* Sets the xcg01456 of this vr technical spec_xcg.
	*
	* @param XCG01456 the xcg01456 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01456(java.lang.String XCG01456) {
		_vrTechnicalSpec_XCG.setXCG01456(XCG01456);
	}

	/**
	* Sets the xcg01457 of this vr technical spec_xcg.
	*
	* @param XCG01457 the xcg01457 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01457(java.lang.String XCG01457) {
		_vrTechnicalSpec_XCG.setXCG01457(XCG01457);
	}

	/**
	* Sets the xcg01458 of this vr technical spec_xcg.
	*
	* @param XCG01458 the xcg01458 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01458(java.lang.String XCG01458) {
		_vrTechnicalSpec_XCG.setXCG01458(XCG01458);
	}

	/**
	* Sets the xcg01459 of this vr technical spec_xcg.
	*
	* @param XCG01459 the xcg01459 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01459(java.lang.String XCG01459) {
		_vrTechnicalSpec_XCG.setXCG01459(XCG01459);
	}

	/**
	* Sets the xcg01460 of this vr technical spec_xcg.
	*
	* @param XCG01460 the xcg01460 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01460(java.lang.String XCG01460) {
		_vrTechnicalSpec_XCG.setXCG01460(XCG01460);
	}

	/**
	* Sets the xcg01461 of this vr technical spec_xcg.
	*
	* @param XCG01461 the xcg01461 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01461(java.lang.String XCG01461) {
		_vrTechnicalSpec_XCG.setXCG01461(XCG01461);
	}

	/**
	* Sets the xcg01462 of this vr technical spec_xcg.
	*
	* @param XCG01462 the xcg01462 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01462(java.lang.String XCG01462) {
		_vrTechnicalSpec_XCG.setXCG01462(XCG01462);
	}

	/**
	* Sets the xcg01463 of this vr technical spec_xcg.
	*
	* @param XCG01463 the xcg01463 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01463(java.lang.String XCG01463) {
		_vrTechnicalSpec_XCG.setXCG01463(XCG01463);
	}

	/**
	* Sets the xcg01464 of this vr technical spec_xcg.
	*
	* @param XCG01464 the xcg01464 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01464(java.lang.String XCG01464) {
		_vrTechnicalSpec_XCG.setXCG01464(XCG01464);
	}

	/**
	* Sets the xcg01465 of this vr technical spec_xcg.
	*
	* @param XCG01465 the xcg01465 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01465(java.lang.String XCG01465) {
		_vrTechnicalSpec_XCG.setXCG01465(XCG01465);
	}

	/**
	* Sets the xcg01466 of this vr technical spec_xcg.
	*
	* @param XCG01466 the xcg01466 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01466(java.lang.String XCG01466) {
		_vrTechnicalSpec_XCG.setXCG01466(XCG01466);
	}

	/**
	* Sets the xcg01467 of this vr technical spec_xcg.
	*
	* @param XCG01467 the xcg01467 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01467(java.lang.String XCG01467) {
		_vrTechnicalSpec_XCG.setXCG01467(XCG01467);
	}

	/**
	* Sets the xcg01468 of this vr technical spec_xcg.
	*
	* @param XCG01468 the xcg01468 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01468(java.lang.String XCG01468) {
		_vrTechnicalSpec_XCG.setXCG01468(XCG01468);
	}

	/**
	* Sets the xcg01469 of this vr technical spec_xcg.
	*
	* @param XCG01469 the xcg01469 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01469(java.lang.String XCG01469) {
		_vrTechnicalSpec_XCG.setXCG01469(XCG01469);
	}

	/**
	* Sets the xcg01470 of this vr technical spec_xcg.
	*
	* @param XCG01470 the xcg01470 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01470(java.lang.String XCG01470) {
		_vrTechnicalSpec_XCG.setXCG01470(XCG01470);
	}

	/**
	* Sets the xcg01471 of this vr technical spec_xcg.
	*
	* @param XCG01471 the xcg01471 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01471(java.lang.String XCG01471) {
		_vrTechnicalSpec_XCG.setXCG01471(XCG01471);
	}

	/**
	* Sets the xcg01472 of this vr technical spec_xcg.
	*
	* @param XCG01472 the xcg01472 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01472(java.lang.String XCG01472) {
		_vrTechnicalSpec_XCG.setXCG01472(XCG01472);
	}

	/**
	* Sets the xcg01473 of this vr technical spec_xcg.
	*
	* @param XCG01473 the xcg01473 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01473(java.lang.String XCG01473) {
		_vrTechnicalSpec_XCG.setXCG01473(XCG01473);
	}

	/**
	* Sets the xcg01474 of this vr technical spec_xcg.
	*
	* @param XCG01474 the xcg01474 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01474(java.lang.String XCG01474) {
		_vrTechnicalSpec_XCG.setXCG01474(XCG01474);
	}

	/**
	* Sets the xcg01475 of this vr technical spec_xcg.
	*
	* @param XCG01475 the xcg01475 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01475(java.lang.String XCG01475) {
		_vrTechnicalSpec_XCG.setXCG01475(XCG01475);
	}

	/**
	* Sets the xcg01476 of this vr technical spec_xcg.
	*
	* @param XCG01476 the xcg01476 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01476(java.lang.String XCG01476) {
		_vrTechnicalSpec_XCG.setXCG01476(XCG01476);
	}

	/**
	* Sets the xcg01477 of this vr technical spec_xcg.
	*
	* @param XCG01477 the xcg01477 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01477(java.lang.String XCG01477) {
		_vrTechnicalSpec_XCG.setXCG01477(XCG01477);
	}

	/**
	* Sets the xcg01478 of this vr technical spec_xcg.
	*
	* @param XCG01478 the xcg01478 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01478(java.lang.String XCG01478) {
		_vrTechnicalSpec_XCG.setXCG01478(XCG01478);
	}

	/**
	* Sets the xcg01479 of this vr technical spec_xcg.
	*
	* @param XCG01479 the xcg01479 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01479(java.lang.String XCG01479) {
		_vrTechnicalSpec_XCG.setXCG01479(XCG01479);
	}

	/**
	* Sets the xcg01480 of this vr technical spec_xcg.
	*
	* @param XCG01480 the xcg01480 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01480(java.lang.String XCG01480) {
		_vrTechnicalSpec_XCG.setXCG01480(XCG01480);
	}

	/**
	* Sets the xcg01481 of this vr technical spec_xcg.
	*
	* @param XCG01481 the xcg01481 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01481(java.lang.String XCG01481) {
		_vrTechnicalSpec_XCG.setXCG01481(XCG01481);
	}

	/**
	* Sets the xcg01482 of this vr technical spec_xcg.
	*
	* @param XCG01482 the xcg01482 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01482(java.lang.String XCG01482) {
		_vrTechnicalSpec_XCG.setXCG01482(XCG01482);
	}

	/**
	* Sets the xcg01483 of this vr technical spec_xcg.
	*
	* @param XCG01483 the xcg01483 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01483(java.lang.String XCG01483) {
		_vrTechnicalSpec_XCG.setXCG01483(XCG01483);
	}

	/**
	* Sets the xcg01484 of this vr technical spec_xcg.
	*
	* @param XCG01484 the xcg01484 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01484(java.lang.String XCG01484) {
		_vrTechnicalSpec_XCG.setXCG01484(XCG01484);
	}

	/**
	* Sets the xcg01485 of this vr technical spec_xcg.
	*
	* @param XCG01485 the xcg01485 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01485(java.lang.String XCG01485) {
		_vrTechnicalSpec_XCG.setXCG01485(XCG01485);
	}

	/**
	* Sets the xcg01486 of this vr technical spec_xcg.
	*
	* @param XCG01486 the xcg01486 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01486(java.lang.String XCG01486) {
		_vrTechnicalSpec_XCG.setXCG01486(XCG01486);
	}

	/**
	* Sets the xcg01487 of this vr technical spec_xcg.
	*
	* @param XCG01487 the xcg01487 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01487(java.lang.String XCG01487) {
		_vrTechnicalSpec_XCG.setXCG01487(XCG01487);
	}

	/**
	* Sets the xcg01488 of this vr technical spec_xcg.
	*
	* @param XCG01488 the xcg01488 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01488(java.lang.String XCG01488) {
		_vrTechnicalSpec_XCG.setXCG01488(XCG01488);
	}

	/**
	* Sets the xcg01489 of this vr technical spec_xcg.
	*
	* @param XCG01489 the xcg01489 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01489(java.lang.String XCG01489) {
		_vrTechnicalSpec_XCG.setXCG01489(XCG01489);
	}

	/**
	* Sets the xcg01490 of this vr technical spec_xcg.
	*
	* @param XCG01490 the xcg01490 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01490(java.lang.String XCG01490) {
		_vrTechnicalSpec_XCG.setXCG01490(XCG01490);
	}

	/**
	* Sets the xcg01491 of this vr technical spec_xcg.
	*
	* @param XCG01491 the xcg01491 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01491(java.lang.String XCG01491) {
		_vrTechnicalSpec_XCG.setXCG01491(XCG01491);
	}

	/**
	* Sets the xcg01492 of this vr technical spec_xcg.
	*
	* @param XCG01492 the xcg01492 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01492(java.lang.String XCG01492) {
		_vrTechnicalSpec_XCG.setXCG01492(XCG01492);
	}

	/**
	* Sets the xcg01493 of this vr technical spec_xcg.
	*
	* @param XCG01493 the xcg01493 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01493(java.lang.String XCG01493) {
		_vrTechnicalSpec_XCG.setXCG01493(XCG01493);
	}

	/**
	* Sets the xcg01494 of this vr technical spec_xcg.
	*
	* @param XCG01494 the xcg01494 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01494(java.lang.String XCG01494) {
		_vrTechnicalSpec_XCG.setXCG01494(XCG01494);
	}

	/**
	* Sets the xcg01496 of this vr technical spec_xcg.
	*
	* @param XCG01496 the xcg01496 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01496(java.lang.String XCG01496) {
		_vrTechnicalSpec_XCG.setXCG01496(XCG01496);
	}

	/**
	* Sets the xcg01497 of this vr technical spec_xcg.
	*
	* @param XCG01497 the xcg01497 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01497(java.lang.String XCG01497) {
		_vrTechnicalSpec_XCG.setXCG01497(XCG01497);
	}

	/**
	* Sets the xcg01498 of this vr technical spec_xcg.
	*
	* @param XCG01498 the xcg01498 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01498(java.lang.String XCG01498) {
		_vrTechnicalSpec_XCG.setXCG01498(XCG01498);
	}

	/**
	* Sets the xcg01499 of this vr technical spec_xcg.
	*
	* @param XCG01499 the xcg01499 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01499(java.lang.String XCG01499) {
		_vrTechnicalSpec_XCG.setXCG01499(XCG01499);
	}

	/**
	* Sets the xcg01500 of this vr technical spec_xcg.
	*
	* @param XCG01500 the xcg01500 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01500(java.lang.String XCG01500) {
		_vrTechnicalSpec_XCG.setXCG01500(XCG01500);
	}

	/**
	* Sets the xcg01501 of this vr technical spec_xcg.
	*
	* @param XCG01501 the xcg01501 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01501(java.lang.String XCG01501) {
		_vrTechnicalSpec_XCG.setXCG01501(XCG01501);
	}

	/**
	* Sets the xcg01502 of this vr technical spec_xcg.
	*
	* @param XCG01502 the xcg01502 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01502(java.lang.String XCG01502) {
		_vrTechnicalSpec_XCG.setXCG01502(XCG01502);
	}

	/**
	* Sets the xcg01503 of this vr technical spec_xcg.
	*
	* @param XCG01503 the xcg01503 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01503(java.lang.String XCG01503) {
		_vrTechnicalSpec_XCG.setXCG01503(XCG01503);
	}

	/**
	* Sets the xcg01504 of this vr technical spec_xcg.
	*
	* @param XCG01504 the xcg01504 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01504(java.lang.String XCG01504) {
		_vrTechnicalSpec_XCG.setXCG01504(XCG01504);
	}

	/**
	* Sets the xcg01505 of this vr technical spec_xcg.
	*
	* @param XCG01505 the xcg01505 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01505(java.lang.String XCG01505) {
		_vrTechnicalSpec_XCG.setXCG01505(XCG01505);
	}

	/**
	* Sets the xcg01506 of this vr technical spec_xcg.
	*
	* @param XCG01506 the xcg01506 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01506(java.lang.String XCG01506) {
		_vrTechnicalSpec_XCG.setXCG01506(XCG01506);
	}

	/**
	* Sets the xcg01507 of this vr technical spec_xcg.
	*
	* @param XCG01507 the xcg01507 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01507(java.lang.String XCG01507) {
		_vrTechnicalSpec_XCG.setXCG01507(XCG01507);
	}

	/**
	* Sets the xcg01508 of this vr technical spec_xcg.
	*
	* @param XCG01508 the xcg01508 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01508(java.lang.String XCG01508) {
		_vrTechnicalSpec_XCG.setXCG01508(XCG01508);
	}

	/**
	* Sets the xcg01509 of this vr technical spec_xcg.
	*
	* @param XCG01509 the xcg01509 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01509(java.lang.String XCG01509) {
		_vrTechnicalSpec_XCG.setXCG01509(XCG01509);
	}

	/**
	* Sets the xcg01510 of this vr technical spec_xcg.
	*
	* @param XCG01510 the xcg01510 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01510(java.lang.String XCG01510) {
		_vrTechnicalSpec_XCG.setXCG01510(XCG01510);
	}

	/**
	* Sets the xcg01512 of this vr technical spec_xcg.
	*
	* @param XCG01512 the xcg01512 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01512(java.lang.String XCG01512) {
		_vrTechnicalSpec_XCG.setXCG01512(XCG01512);
	}

	/**
	* Sets the xcg01513 of this vr technical spec_xcg.
	*
	* @param XCG01513 the xcg01513 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01513(java.lang.String XCG01513) {
		_vrTechnicalSpec_XCG.setXCG01513(XCG01513);
	}

	/**
	* Sets the xcg01514 of this vr technical spec_xcg.
	*
	* @param XCG01514 the xcg01514 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01514(java.lang.String XCG01514) {
		_vrTechnicalSpec_XCG.setXCG01514(XCG01514);
	}

	/**
	* Sets the xcg01515 of this vr technical spec_xcg.
	*
	* @param XCG01515 the xcg01515 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01515(java.lang.String XCG01515) {
		_vrTechnicalSpec_XCG.setXCG01515(XCG01515);
	}

	/**
	* Sets the xcg01516 of this vr technical spec_xcg.
	*
	* @param XCG01516 the xcg01516 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01516(java.lang.String XCG01516) {
		_vrTechnicalSpec_XCG.setXCG01516(XCG01516);
	}

	/**
	* Sets the xcg01517 of this vr technical spec_xcg.
	*
	* @param XCG01517 the xcg01517 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01517(java.lang.String XCG01517) {
		_vrTechnicalSpec_XCG.setXCG01517(XCG01517);
	}

	/**
	* Sets the xcg01518 of this vr technical spec_xcg.
	*
	* @param XCG01518 the xcg01518 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01518(java.lang.String XCG01518) {
		_vrTechnicalSpec_XCG.setXCG01518(XCG01518);
	}

	/**
	* Sets the xcg01519 of this vr technical spec_xcg.
	*
	* @param XCG01519 the xcg01519 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01519(java.lang.String XCG01519) {
		_vrTechnicalSpec_XCG.setXCG01519(XCG01519);
	}

	/**
	* Sets the xcg01520 of this vr technical spec_xcg.
	*
	* @param XCG01520 the xcg01520 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01520(java.lang.String XCG01520) {
		_vrTechnicalSpec_XCG.setXCG01520(XCG01520);
	}

	/**
	* Sets the xcg01521 of this vr technical spec_xcg.
	*
	* @param XCG01521 the xcg01521 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01521(java.lang.String XCG01521) {
		_vrTechnicalSpec_XCG.setXCG01521(XCG01521);
	}

	/**
	* Sets the xcg01522 of this vr technical spec_xcg.
	*
	* @param XCG01522 the xcg01522 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01522(java.lang.String XCG01522) {
		_vrTechnicalSpec_XCG.setXCG01522(XCG01522);
	}

	/**
	* Sets the xcg01523 of this vr technical spec_xcg.
	*
	* @param XCG01523 the xcg01523 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01523(java.lang.String XCG01523) {
		_vrTechnicalSpec_XCG.setXCG01523(XCG01523);
	}

	/**
	* Sets the xcg01524 of this vr technical spec_xcg.
	*
	* @param XCG01524 the xcg01524 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01524(java.lang.String XCG01524) {
		_vrTechnicalSpec_XCG.setXCG01524(XCG01524);
	}

	/**
	* Sets the xcg01525 of this vr technical spec_xcg.
	*
	* @param XCG01525 the xcg01525 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01525(java.lang.String XCG01525) {
		_vrTechnicalSpec_XCG.setXCG01525(XCG01525);
	}

	/**
	* Sets the xcg01526 of this vr technical spec_xcg.
	*
	* @param XCG01526 the xcg01526 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01526(java.lang.String XCG01526) {
		_vrTechnicalSpec_XCG.setXCG01526(XCG01526);
	}

	/**
	* Sets the xcg01527 of this vr technical spec_xcg.
	*
	* @param XCG01527 the xcg01527 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01527(java.lang.String XCG01527) {
		_vrTechnicalSpec_XCG.setXCG01527(XCG01527);
	}

	/**
	* Sets the xcg01528 of this vr technical spec_xcg.
	*
	* @param XCG01528 the xcg01528 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01528(java.lang.String XCG01528) {
		_vrTechnicalSpec_XCG.setXCG01528(XCG01528);
	}

	/**
	* Sets the xcg01529 of this vr technical spec_xcg.
	*
	* @param XCG01529 the xcg01529 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01529(java.lang.String XCG01529) {
		_vrTechnicalSpec_XCG.setXCG01529(XCG01529);
	}

	/**
	* Sets the xcg01530 of this vr technical spec_xcg.
	*
	* @param XCG01530 the xcg01530 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01530(java.lang.String XCG01530) {
		_vrTechnicalSpec_XCG.setXCG01530(XCG01530);
	}

	/**
	* Sets the xcg01531 of this vr technical spec_xcg.
	*
	* @param XCG01531 the xcg01531 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01531(java.lang.String XCG01531) {
		_vrTechnicalSpec_XCG.setXCG01531(XCG01531);
	}

	/**
	* Sets the xcg01533 of this vr technical spec_xcg.
	*
	* @param XCG01533 the xcg01533 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01533(java.lang.String XCG01533) {
		_vrTechnicalSpec_XCG.setXCG01533(XCG01533);
	}

	/**
	* Sets the xcg01534 of this vr technical spec_xcg.
	*
	* @param XCG01534 the xcg01534 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01534(java.lang.String XCG01534) {
		_vrTechnicalSpec_XCG.setXCG01534(XCG01534);
	}

	/**
	* Sets the xcg01535 of this vr technical spec_xcg.
	*
	* @param XCG01535 the xcg01535 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01535(java.lang.String XCG01535) {
		_vrTechnicalSpec_XCG.setXCG01535(XCG01535);
	}

	/**
	* Sets the xcg01536 of this vr technical spec_xcg.
	*
	* @param XCG01536 the xcg01536 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01536(java.lang.String XCG01536) {
		_vrTechnicalSpec_XCG.setXCG01536(XCG01536);
	}

	/**
	* Sets the xcg01537 of this vr technical spec_xcg.
	*
	* @param XCG01537 the xcg01537 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01537(java.lang.String XCG01537) {
		_vrTechnicalSpec_XCG.setXCG01537(XCG01537);
	}

	/**
	* Sets the xcg01538 of this vr technical spec_xcg.
	*
	* @param XCG01538 the xcg01538 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01538(java.lang.String XCG01538) {
		_vrTechnicalSpec_XCG.setXCG01538(XCG01538);
	}

	/**
	* Sets the xcg01539 of this vr technical spec_xcg.
	*
	* @param XCG01539 the xcg01539 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01539(java.lang.String XCG01539) {
		_vrTechnicalSpec_XCG.setXCG01539(XCG01539);
	}

	/**
	* Sets the xcg01541 of this vr technical spec_xcg.
	*
	* @param XCG01541 the xcg01541 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01541(java.lang.String XCG01541) {
		_vrTechnicalSpec_XCG.setXCG01541(XCG01541);
	}

	/**
	* Sets the xcg01542 of this vr technical spec_xcg.
	*
	* @param XCG01542 the xcg01542 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01542(java.lang.String XCG01542) {
		_vrTechnicalSpec_XCG.setXCG01542(XCG01542);
	}

	/**
	* Sets the xcg01543 of this vr technical spec_xcg.
	*
	* @param XCG01543 the xcg01543 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01543(java.lang.String XCG01543) {
		_vrTechnicalSpec_XCG.setXCG01543(XCG01543);
	}

	/**
	* Sets the xcg01544 of this vr technical spec_xcg.
	*
	* @param XCG01544 the xcg01544 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01544(java.lang.String XCG01544) {
		_vrTechnicalSpec_XCG.setXCG01544(XCG01544);
	}

	/**
	* Sets the xcg01545 of this vr technical spec_xcg.
	*
	* @param XCG01545 the xcg01545 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01545(java.lang.String XCG01545) {
		_vrTechnicalSpec_XCG.setXCG01545(XCG01545);
	}

	/**
	* Sets the xcg01546 of this vr technical spec_xcg.
	*
	* @param XCG01546 the xcg01546 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01546(java.lang.String XCG01546) {
		_vrTechnicalSpec_XCG.setXCG01546(XCG01546);
	}

	/**
	* Sets the xcg01547 of this vr technical spec_xcg.
	*
	* @param XCG01547 the xcg01547 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01547(java.lang.String XCG01547) {
		_vrTechnicalSpec_XCG.setXCG01547(XCG01547);
	}

	/**
	* Sets the xcg01548 of this vr technical spec_xcg.
	*
	* @param XCG01548 the xcg01548 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01548(java.lang.String XCG01548) {
		_vrTechnicalSpec_XCG.setXCG01548(XCG01548);
	}

	/**
	* Sets the xcg01549 of this vr technical spec_xcg.
	*
	* @param XCG01549 the xcg01549 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01549(java.lang.String XCG01549) {
		_vrTechnicalSpec_XCG.setXCG01549(XCG01549);
	}

	/**
	* Sets the xcg01550 of this vr technical spec_xcg.
	*
	* @param XCG01550 the xcg01550 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01550(java.lang.String XCG01550) {
		_vrTechnicalSpec_XCG.setXCG01550(XCG01550);
	}

	/**
	* Sets the xcg01551 of this vr technical spec_xcg.
	*
	* @param XCG01551 the xcg01551 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01551(java.lang.String XCG01551) {
		_vrTechnicalSpec_XCG.setXCG01551(XCG01551);
	}

	/**
	* Sets the xcg01552 of this vr technical spec_xcg.
	*
	* @param XCG01552 the xcg01552 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01552(java.lang.String XCG01552) {
		_vrTechnicalSpec_XCG.setXCG01552(XCG01552);
	}

	/**
	* Sets the xcg01553 of this vr technical spec_xcg.
	*
	* @param XCG01553 the xcg01553 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01553(java.lang.String XCG01553) {
		_vrTechnicalSpec_XCG.setXCG01553(XCG01553);
	}

	/**
	* Sets the xcg01554 of this vr technical spec_xcg.
	*
	* @param XCG01554 the xcg01554 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01554(java.lang.String XCG01554) {
		_vrTechnicalSpec_XCG.setXCG01554(XCG01554);
	}

	/**
	* Sets the xcg01555 of this vr technical spec_xcg.
	*
	* @param XCG01555 the xcg01555 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01555(java.lang.String XCG01555) {
		_vrTechnicalSpec_XCG.setXCG01555(XCG01555);
	}

	/**
	* Sets the xcg01556 of this vr technical spec_xcg.
	*
	* @param XCG01556 the xcg01556 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01556(java.lang.String XCG01556) {
		_vrTechnicalSpec_XCG.setXCG01556(XCG01556);
	}

	/**
	* Sets the xcg01557 of this vr technical spec_xcg.
	*
	* @param XCG01557 the xcg01557 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01557(java.lang.String XCG01557) {
		_vrTechnicalSpec_XCG.setXCG01557(XCG01557);
	}

	/**
	* Sets the xcg01558 of this vr technical spec_xcg.
	*
	* @param XCG01558 the xcg01558 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01558(java.lang.String XCG01558) {
		_vrTechnicalSpec_XCG.setXCG01558(XCG01558);
	}

	/**
	* Sets the xcg01559 of this vr technical spec_xcg.
	*
	* @param XCG01559 the xcg01559 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01559(java.lang.String XCG01559) {
		_vrTechnicalSpec_XCG.setXCG01559(XCG01559);
	}

	/**
	* Sets the xcg01560 of this vr technical spec_xcg.
	*
	* @param XCG01560 the xcg01560 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01560(java.lang.String XCG01560) {
		_vrTechnicalSpec_XCG.setXCG01560(XCG01560);
	}

	/**
	* Sets the xcg01561 of this vr technical spec_xcg.
	*
	* @param XCG01561 the xcg01561 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01561(java.lang.String XCG01561) {
		_vrTechnicalSpec_XCG.setXCG01561(XCG01561);
	}

	/**
	* Sets the xcg01562 of this vr technical spec_xcg.
	*
	* @param XCG01562 the xcg01562 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01562(java.lang.String XCG01562) {
		_vrTechnicalSpec_XCG.setXCG01562(XCG01562);
	}

	/**
	* Sets the xcg01563 of this vr technical spec_xcg.
	*
	* @param XCG01563 the xcg01563 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01563(java.lang.String XCG01563) {
		_vrTechnicalSpec_XCG.setXCG01563(XCG01563);
	}

	/**
	* Sets the xcg01564 of this vr technical spec_xcg.
	*
	* @param XCG01564 the xcg01564 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01564(java.lang.String XCG01564) {
		_vrTechnicalSpec_XCG.setXCG01564(XCG01564);
	}

	/**
	* Sets the xcg01565 of this vr technical spec_xcg.
	*
	* @param XCG01565 the xcg01565 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01565(java.lang.String XCG01565) {
		_vrTechnicalSpec_XCG.setXCG01565(XCG01565);
	}

	/**
	* Sets the xcg01566 of this vr technical spec_xcg.
	*
	* @param XCG01566 the xcg01566 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01566(java.lang.String XCG01566) {
		_vrTechnicalSpec_XCG.setXCG01566(XCG01566);
	}

	/**
	* Sets the xcg01567 of this vr technical spec_xcg.
	*
	* @param XCG01567 the xcg01567 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01567(java.lang.String XCG01567) {
		_vrTechnicalSpec_XCG.setXCG01567(XCG01567);
	}

	/**
	* Sets the xcg01568 of this vr technical spec_xcg.
	*
	* @param XCG01568 the xcg01568 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01568(java.lang.String XCG01568) {
		_vrTechnicalSpec_XCG.setXCG01568(XCG01568);
	}

	/**
	* Sets the xcg01569 of this vr technical spec_xcg.
	*
	* @param XCG01569 the xcg01569 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01569(java.lang.String XCG01569) {
		_vrTechnicalSpec_XCG.setXCG01569(XCG01569);
	}

	/**
	* Sets the xcg01570 of this vr technical spec_xcg.
	*
	* @param XCG01570 the xcg01570 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01570(java.lang.String XCG01570) {
		_vrTechnicalSpec_XCG.setXCG01570(XCG01570);
	}

	/**
	* Sets the xcg01571 of this vr technical spec_xcg.
	*
	* @param XCG01571 the xcg01571 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01571(java.lang.String XCG01571) {
		_vrTechnicalSpec_XCG.setXCG01571(XCG01571);
	}

	/**
	* Sets the xcg01572 of this vr technical spec_xcg.
	*
	* @param XCG01572 the xcg01572 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01572(java.lang.String XCG01572) {
		_vrTechnicalSpec_XCG.setXCG01572(XCG01572);
	}

	/**
	* Sets the xcg01573 of this vr technical spec_xcg.
	*
	* @param XCG01573 the xcg01573 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01573(java.lang.String XCG01573) {
		_vrTechnicalSpec_XCG.setXCG01573(XCG01573);
	}

	/**
	* Sets the xcg01574 of this vr technical spec_xcg.
	*
	* @param XCG01574 the xcg01574 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01574(java.lang.String XCG01574) {
		_vrTechnicalSpec_XCG.setXCG01574(XCG01574);
	}

	/**
	* Sets the xcg01575 of this vr technical spec_xcg.
	*
	* @param XCG01575 the xcg01575 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01575(java.lang.String XCG01575) {
		_vrTechnicalSpec_XCG.setXCG01575(XCG01575);
	}

	/**
	* Sets the xcg01576 of this vr technical spec_xcg.
	*
	* @param XCG01576 the xcg01576 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01576(java.lang.String XCG01576) {
		_vrTechnicalSpec_XCG.setXCG01576(XCG01576);
	}

	/**
	* Sets the xcg01577 of this vr technical spec_xcg.
	*
	* @param XCG01577 the xcg01577 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01577(java.lang.String XCG01577) {
		_vrTechnicalSpec_XCG.setXCG01577(XCG01577);
	}

	/**
	* Sets the xcg01578 of this vr technical spec_xcg.
	*
	* @param XCG01578 the xcg01578 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01578(java.lang.String XCG01578) {
		_vrTechnicalSpec_XCG.setXCG01578(XCG01578);
	}

	/**
	* Sets the xcg01579 of this vr technical spec_xcg.
	*
	* @param XCG01579 the xcg01579 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01579(java.lang.String XCG01579) {
		_vrTechnicalSpec_XCG.setXCG01579(XCG01579);
	}

	/**
	* Sets the xcg01580 of this vr technical spec_xcg.
	*
	* @param XCG01580 the xcg01580 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01580(java.lang.String XCG01580) {
		_vrTechnicalSpec_XCG.setXCG01580(XCG01580);
	}

	/**
	* Sets the xcg01581 of this vr technical spec_xcg.
	*
	* @param XCG01581 the xcg01581 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01581(java.lang.String XCG01581) {
		_vrTechnicalSpec_XCG.setXCG01581(XCG01581);
	}

	/**
	* Sets the xcg01582 of this vr technical spec_xcg.
	*
	* @param XCG01582 the xcg01582 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01582(java.lang.String XCG01582) {
		_vrTechnicalSpec_XCG.setXCG01582(XCG01582);
	}

	/**
	* Sets the xcg01583 of this vr technical spec_xcg.
	*
	* @param XCG01583 the xcg01583 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01583(java.lang.String XCG01583) {
		_vrTechnicalSpec_XCG.setXCG01583(XCG01583);
	}

	/**
	* Sets the xcg01584 of this vr technical spec_xcg.
	*
	* @param XCG01584 the xcg01584 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01584(java.lang.String XCG01584) {
		_vrTechnicalSpec_XCG.setXCG01584(XCG01584);
	}

	/**
	* Sets the xcg01585 of this vr technical spec_xcg.
	*
	* @param XCG01585 the xcg01585 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01585(java.lang.String XCG01585) {
		_vrTechnicalSpec_XCG.setXCG01585(XCG01585);
	}

	/**
	* Sets the xcg01586 of this vr technical spec_xcg.
	*
	* @param XCG01586 the xcg01586 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01586(java.lang.String XCG01586) {
		_vrTechnicalSpec_XCG.setXCG01586(XCG01586);
	}

	/**
	* Sets the xcg01587 of this vr technical spec_xcg.
	*
	* @param XCG01587 the xcg01587 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01587(java.lang.String XCG01587) {
		_vrTechnicalSpec_XCG.setXCG01587(XCG01587);
	}

	/**
	* Sets the xcg01588 of this vr technical spec_xcg.
	*
	* @param XCG01588 the xcg01588 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01588(java.lang.String XCG01588) {
		_vrTechnicalSpec_XCG.setXCG01588(XCG01588);
	}

	/**
	* Sets the xcg01589 of this vr technical spec_xcg.
	*
	* @param XCG01589 the xcg01589 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01589(java.lang.String XCG01589) {
		_vrTechnicalSpec_XCG.setXCG01589(XCG01589);
	}

	/**
	* Sets the xcg01590 of this vr technical spec_xcg.
	*
	* @param XCG01590 the xcg01590 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01590(java.lang.String XCG01590) {
		_vrTechnicalSpec_XCG.setXCG01590(XCG01590);
	}

	/**
	* Sets the xcg01591 of this vr technical spec_xcg.
	*
	* @param XCG01591 the xcg01591 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01591(java.lang.String XCG01591) {
		_vrTechnicalSpec_XCG.setXCG01591(XCG01591);
	}

	/**
	* Sets the xcg01592 of this vr technical spec_xcg.
	*
	* @param XCG01592 the xcg01592 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01592(java.lang.String XCG01592) {
		_vrTechnicalSpec_XCG.setXCG01592(XCG01592);
	}

	/**
	* Sets the xcg01593 of this vr technical spec_xcg.
	*
	* @param XCG01593 the xcg01593 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01593(java.lang.String XCG01593) {
		_vrTechnicalSpec_XCG.setXCG01593(XCG01593);
	}

	/**
	* Sets the xcg01594 of this vr technical spec_xcg.
	*
	* @param XCG01594 the xcg01594 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01594(java.lang.String XCG01594) {
		_vrTechnicalSpec_XCG.setXCG01594(XCG01594);
	}

	/**
	* Sets the xcg01595 of this vr technical spec_xcg.
	*
	* @param XCG01595 the xcg01595 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01595(java.lang.String XCG01595) {
		_vrTechnicalSpec_XCG.setXCG01595(XCG01595);
	}

	/**
	* Sets the xcg01596 of this vr technical spec_xcg.
	*
	* @param XCG01596 the xcg01596 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01596(java.lang.String XCG01596) {
		_vrTechnicalSpec_XCG.setXCG01596(XCG01596);
	}

	/**
	* Sets the xcg01597 of this vr technical spec_xcg.
	*
	* @param XCG01597 the xcg01597 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01597(java.lang.String XCG01597) {
		_vrTechnicalSpec_XCG.setXCG01597(XCG01597);
	}

	/**
	* Sets the xcg01598 of this vr technical spec_xcg.
	*
	* @param XCG01598 the xcg01598 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01598(java.lang.String XCG01598) {
		_vrTechnicalSpec_XCG.setXCG01598(XCG01598);
	}

	/**
	* Sets the xcg01599 of this vr technical spec_xcg.
	*
	* @param XCG01599 the xcg01599 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01599(java.lang.String XCG01599) {
		_vrTechnicalSpec_XCG.setXCG01599(XCG01599);
	}

	/**
	* Sets the xcg01600 of this vr technical spec_xcg.
	*
	* @param XCG01600 the xcg01600 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01600(java.lang.String XCG01600) {
		_vrTechnicalSpec_XCG.setXCG01600(XCG01600);
	}

	/**
	* Sets the xcg01601 of this vr technical spec_xcg.
	*
	* @param XCG01601 the xcg01601 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01601(java.lang.String XCG01601) {
		_vrTechnicalSpec_XCG.setXCG01601(XCG01601);
	}

	/**
	* Sets the xcg01602 of this vr technical spec_xcg.
	*
	* @param XCG01602 the xcg01602 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01602(java.lang.String XCG01602) {
		_vrTechnicalSpec_XCG.setXCG01602(XCG01602);
	}

	/**
	* Sets the xcg01603 of this vr technical spec_xcg.
	*
	* @param XCG01603 the xcg01603 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01603(java.lang.String XCG01603) {
		_vrTechnicalSpec_XCG.setXCG01603(XCG01603);
	}

	/**
	* Sets the xcg01604 of this vr technical spec_xcg.
	*
	* @param XCG01604 the xcg01604 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01604(java.lang.String XCG01604) {
		_vrTechnicalSpec_XCG.setXCG01604(XCG01604);
	}

	/**
	* Sets the xcg01605 of this vr technical spec_xcg.
	*
	* @param XCG01605 the xcg01605 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01605(java.lang.String XCG01605) {
		_vrTechnicalSpec_XCG.setXCG01605(XCG01605);
	}

	/**
	* Sets the xcg01606 of this vr technical spec_xcg.
	*
	* @param XCG01606 the xcg01606 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01606(java.lang.String XCG01606) {
		_vrTechnicalSpec_XCG.setXCG01606(XCG01606);
	}

	/**
	* Sets the xcg01607 of this vr technical spec_xcg.
	*
	* @param XCG01607 the xcg01607 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01607(java.lang.String XCG01607) {
		_vrTechnicalSpec_XCG.setXCG01607(XCG01607);
	}

	/**
	* Sets the xcg01608 of this vr technical spec_xcg.
	*
	* @param XCG01608 the xcg01608 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01608(java.lang.String XCG01608) {
		_vrTechnicalSpec_XCG.setXCG01608(XCG01608);
	}

	/**
	* Sets the xcg01609 of this vr technical spec_xcg.
	*
	* @param XCG01609 the xcg01609 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01609(java.lang.String XCG01609) {
		_vrTechnicalSpec_XCG.setXCG01609(XCG01609);
	}

	/**
	* Sets the xcg01610 of this vr technical spec_xcg.
	*
	* @param XCG01610 the xcg01610 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01610(java.lang.String XCG01610) {
		_vrTechnicalSpec_XCG.setXCG01610(XCG01610);
	}

	/**
	* Sets the xcg01611 of this vr technical spec_xcg.
	*
	* @param XCG01611 the xcg01611 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01611(java.lang.String XCG01611) {
		_vrTechnicalSpec_XCG.setXCG01611(XCG01611);
	}

	/**
	* Sets the xcg01612 of this vr technical spec_xcg.
	*
	* @param XCG01612 the xcg01612 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01612(java.lang.String XCG01612) {
		_vrTechnicalSpec_XCG.setXCG01612(XCG01612);
	}

	/**
	* Sets the xcg01613 of this vr technical spec_xcg.
	*
	* @param XCG01613 the xcg01613 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01613(java.lang.String XCG01613) {
		_vrTechnicalSpec_XCG.setXCG01613(XCG01613);
	}

	/**
	* Sets the xcg01614 of this vr technical spec_xcg.
	*
	* @param XCG01614 the xcg01614 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01614(java.lang.String XCG01614) {
		_vrTechnicalSpec_XCG.setXCG01614(XCG01614);
	}

	/**
	* Sets the xcg01615 of this vr technical spec_xcg.
	*
	* @param XCG01615 the xcg01615 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01615(java.lang.String XCG01615) {
		_vrTechnicalSpec_XCG.setXCG01615(XCG01615);
	}

	/**
	* Sets the xcg01616 of this vr technical spec_xcg.
	*
	* @param XCG01616 the xcg01616 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01616(java.lang.String XCG01616) {
		_vrTechnicalSpec_XCG.setXCG01616(XCG01616);
	}

	/**
	* Sets the xcg01617 of this vr technical spec_xcg.
	*
	* @param XCG01617 the xcg01617 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01617(java.lang.String XCG01617) {
		_vrTechnicalSpec_XCG.setXCG01617(XCG01617);
	}

	/**
	* Sets the xcg01618 of this vr technical spec_xcg.
	*
	* @param XCG01618 the xcg01618 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01618(java.lang.String XCG01618) {
		_vrTechnicalSpec_XCG.setXCG01618(XCG01618);
	}

	/**
	* Sets the xcg01619 of this vr technical spec_xcg.
	*
	* @param XCG01619 the xcg01619 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01619(java.lang.String XCG01619) {
		_vrTechnicalSpec_XCG.setXCG01619(XCG01619);
	}

	/**
	* Sets the xcg01620 of this vr technical spec_xcg.
	*
	* @param XCG01620 the xcg01620 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01620(java.lang.String XCG01620) {
		_vrTechnicalSpec_XCG.setXCG01620(XCG01620);
	}

	/**
	* Sets the xcg01621 of this vr technical spec_xcg.
	*
	* @param XCG01621 the xcg01621 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01621(java.lang.String XCG01621) {
		_vrTechnicalSpec_XCG.setXCG01621(XCG01621);
	}

	/**
	* Sets the xcg01622 of this vr technical spec_xcg.
	*
	* @param XCG01622 the xcg01622 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01622(java.lang.String XCG01622) {
		_vrTechnicalSpec_XCG.setXCG01622(XCG01622);
	}

	/**
	* Sets the xcg01623 of this vr technical spec_xcg.
	*
	* @param XCG01623 the xcg01623 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01623(java.lang.String XCG01623) {
		_vrTechnicalSpec_XCG.setXCG01623(XCG01623);
	}

	/**
	* Sets the xcg01624 of this vr technical spec_xcg.
	*
	* @param XCG01624 the xcg01624 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01624(java.lang.String XCG01624) {
		_vrTechnicalSpec_XCG.setXCG01624(XCG01624);
	}

	/**
	* Sets the xcg01625 of this vr technical spec_xcg.
	*
	* @param XCG01625 the xcg01625 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01625(java.lang.String XCG01625) {
		_vrTechnicalSpec_XCG.setXCG01625(XCG01625);
	}

	/**
	* Sets the xcg01626 of this vr technical spec_xcg.
	*
	* @param XCG01626 the xcg01626 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01626(java.lang.String XCG01626) {
		_vrTechnicalSpec_XCG.setXCG01626(XCG01626);
	}

	/**
	* Sets the xcg01627 of this vr technical spec_xcg.
	*
	* @param XCG01627 the xcg01627 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01627(java.lang.String XCG01627) {
		_vrTechnicalSpec_XCG.setXCG01627(XCG01627);
	}

	/**
	* Sets the xcg01628 of this vr technical spec_xcg.
	*
	* @param XCG01628 the xcg01628 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01628(java.lang.String XCG01628) {
		_vrTechnicalSpec_XCG.setXCG01628(XCG01628);
	}

	/**
	* Sets the xcg01630 of this vr technical spec_xcg.
	*
	* @param XCG01630 the xcg01630 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01630(java.lang.String XCG01630) {
		_vrTechnicalSpec_XCG.setXCG01630(XCG01630);
	}

	/**
	* Sets the xcg01631 of this vr technical spec_xcg.
	*
	* @param XCG01631 the xcg01631 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01631(java.lang.String XCG01631) {
		_vrTechnicalSpec_XCG.setXCG01631(XCG01631);
	}

	/**
	* Sets the xcg01632 of this vr technical spec_xcg.
	*
	* @param XCG01632 the xcg01632 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01632(java.lang.String XCG01632) {
		_vrTechnicalSpec_XCG.setXCG01632(XCG01632);
	}

	/**
	* Sets the xcg01633 of this vr technical spec_xcg.
	*
	* @param XCG01633 the xcg01633 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01633(java.lang.String XCG01633) {
		_vrTechnicalSpec_XCG.setXCG01633(XCG01633);
	}

	/**
	* Sets the xcg01634 of this vr technical spec_xcg.
	*
	* @param XCG01634 the xcg01634 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01634(java.lang.String XCG01634) {
		_vrTechnicalSpec_XCG.setXCG01634(XCG01634);
	}

	/**
	* Sets the xcg01635 of this vr technical spec_xcg.
	*
	* @param XCG01635 the xcg01635 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01635(java.lang.String XCG01635) {
		_vrTechnicalSpec_XCG.setXCG01635(XCG01635);
	}

	/**
	* Sets the xcg01636 of this vr technical spec_xcg.
	*
	* @param XCG01636 the xcg01636 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01636(java.lang.String XCG01636) {
		_vrTechnicalSpec_XCG.setXCG01636(XCG01636);
	}

	/**
	* Sets the xcg01637 of this vr technical spec_xcg.
	*
	* @param XCG01637 the xcg01637 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01637(java.lang.String XCG01637) {
		_vrTechnicalSpec_XCG.setXCG01637(XCG01637);
	}

	/**
	* Sets the xcg01638 of this vr technical spec_xcg.
	*
	* @param XCG01638 the xcg01638 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01638(java.lang.String XCG01638) {
		_vrTechnicalSpec_XCG.setXCG01638(XCG01638);
	}

	/**
	* Sets the xcg01639 of this vr technical spec_xcg.
	*
	* @param XCG01639 the xcg01639 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01639(java.lang.String XCG01639) {
		_vrTechnicalSpec_XCG.setXCG01639(XCG01639);
	}

	/**
	* Sets the xcg01640 of this vr technical spec_xcg.
	*
	* @param XCG01640 the xcg01640 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01640(java.lang.String XCG01640) {
		_vrTechnicalSpec_XCG.setXCG01640(XCG01640);
	}

	/**
	* Sets the xcg01641 of this vr technical spec_xcg.
	*
	* @param XCG01641 the xcg01641 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01641(java.lang.String XCG01641) {
		_vrTechnicalSpec_XCG.setXCG01641(XCG01641);
	}

	/**
	* Sets the xcg01642 of this vr technical spec_xcg.
	*
	* @param XCG01642 the xcg01642 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01642(java.lang.String XCG01642) {
		_vrTechnicalSpec_XCG.setXCG01642(XCG01642);
	}

	/**
	* Sets the xcg01643 of this vr technical spec_xcg.
	*
	* @param XCG01643 the xcg01643 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01643(java.lang.String XCG01643) {
		_vrTechnicalSpec_XCG.setXCG01643(XCG01643);
	}

	/**
	* Sets the xcg01644 of this vr technical spec_xcg.
	*
	* @param XCG01644 the xcg01644 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01644(java.lang.String XCG01644) {
		_vrTechnicalSpec_XCG.setXCG01644(XCG01644);
	}

	/**
	* Sets the xcg01645 of this vr technical spec_xcg.
	*
	* @param XCG01645 the xcg01645 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01645(java.lang.String XCG01645) {
		_vrTechnicalSpec_XCG.setXCG01645(XCG01645);
	}

	/**
	* Sets the xcg01646 of this vr technical spec_xcg.
	*
	* @param XCG01646 the xcg01646 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01646(java.lang.String XCG01646) {
		_vrTechnicalSpec_XCG.setXCG01646(XCG01646);
	}

	/**
	* Sets the xcg01647 of this vr technical spec_xcg.
	*
	* @param XCG01647 the xcg01647 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01647(java.lang.String XCG01647) {
		_vrTechnicalSpec_XCG.setXCG01647(XCG01647);
	}

	/**
	* Sets the xcg01648 of this vr technical spec_xcg.
	*
	* @param XCG01648 the xcg01648 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01648(java.lang.String XCG01648) {
		_vrTechnicalSpec_XCG.setXCG01648(XCG01648);
	}

	/**
	* Sets the xcg01649 of this vr technical spec_xcg.
	*
	* @param XCG01649 the xcg01649 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01649(java.lang.String XCG01649) {
		_vrTechnicalSpec_XCG.setXCG01649(XCG01649);
	}

	/**
	* Sets the xcg01650 of this vr technical spec_xcg.
	*
	* @param XCG01650 the xcg01650 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01650(java.lang.String XCG01650) {
		_vrTechnicalSpec_XCG.setXCG01650(XCG01650);
	}

	/**
	* Sets the xcg01651 of this vr technical spec_xcg.
	*
	* @param XCG01651 the xcg01651 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01651(java.lang.String XCG01651) {
		_vrTechnicalSpec_XCG.setXCG01651(XCG01651);
	}

	/**
	* Sets the xcg01652 of this vr technical spec_xcg.
	*
	* @param XCG01652 the xcg01652 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01652(java.lang.String XCG01652) {
		_vrTechnicalSpec_XCG.setXCG01652(XCG01652);
	}

	/**
	* Sets the xcg01653 of this vr technical spec_xcg.
	*
	* @param XCG01653 the xcg01653 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01653(java.lang.String XCG01653) {
		_vrTechnicalSpec_XCG.setXCG01653(XCG01653);
	}

	/**
	* Sets the xcg01654 of this vr technical spec_xcg.
	*
	* @param XCG01654 the xcg01654 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01654(java.lang.String XCG01654) {
		_vrTechnicalSpec_XCG.setXCG01654(XCG01654);
	}

	/**
	* Sets the xcg01655 of this vr technical spec_xcg.
	*
	* @param XCG01655 the xcg01655 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01655(java.lang.String XCG01655) {
		_vrTechnicalSpec_XCG.setXCG01655(XCG01655);
	}

	/**
	* Sets the xcg01656 of this vr technical spec_xcg.
	*
	* @param XCG01656 the xcg01656 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01656(java.lang.String XCG01656) {
		_vrTechnicalSpec_XCG.setXCG01656(XCG01656);
	}

	/**
	* Sets the xcg01657 of this vr technical spec_xcg.
	*
	* @param XCG01657 the xcg01657 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01657(java.lang.String XCG01657) {
		_vrTechnicalSpec_XCG.setXCG01657(XCG01657);
	}

	/**
	* Sets the xcg01658 of this vr technical spec_xcg.
	*
	* @param XCG01658 the xcg01658 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01658(java.lang.String XCG01658) {
		_vrTechnicalSpec_XCG.setXCG01658(XCG01658);
	}

	/**
	* Sets the xcg01659 of this vr technical spec_xcg.
	*
	* @param XCG01659 the xcg01659 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01659(java.lang.String XCG01659) {
		_vrTechnicalSpec_XCG.setXCG01659(XCG01659);
	}

	/**
	* Sets the xcg01660 of this vr technical spec_xcg.
	*
	* @param XCG01660 the xcg01660 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01660(java.lang.String XCG01660) {
		_vrTechnicalSpec_XCG.setXCG01660(XCG01660);
	}

	/**
	* Sets the xcg01661 of this vr technical spec_xcg.
	*
	* @param XCG01661 the xcg01661 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01661(java.lang.String XCG01661) {
		_vrTechnicalSpec_XCG.setXCG01661(XCG01661);
	}

	/**
	* Sets the xcg01662 of this vr technical spec_xcg.
	*
	* @param XCG01662 the xcg01662 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01662(java.lang.String XCG01662) {
		_vrTechnicalSpec_XCG.setXCG01662(XCG01662);
	}

	/**
	* Sets the xcg01663 of this vr technical spec_xcg.
	*
	* @param XCG01663 the xcg01663 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01663(java.lang.String XCG01663) {
		_vrTechnicalSpec_XCG.setXCG01663(XCG01663);
	}

	/**
	* Sets the xcg01664 of this vr technical spec_xcg.
	*
	* @param XCG01664 the xcg01664 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01664(java.lang.String XCG01664) {
		_vrTechnicalSpec_XCG.setXCG01664(XCG01664);
	}

	/**
	* Sets the xcg01665 of this vr technical spec_xcg.
	*
	* @param XCG01665 the xcg01665 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01665(java.lang.String XCG01665) {
		_vrTechnicalSpec_XCG.setXCG01665(XCG01665);
	}

	/**
	* Sets the xcg01666 of this vr technical spec_xcg.
	*
	* @param XCG01666 the xcg01666 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01666(java.lang.String XCG01666) {
		_vrTechnicalSpec_XCG.setXCG01666(XCG01666);
	}

	/**
	* Sets the xcg01667 of this vr technical spec_xcg.
	*
	* @param XCG01667 the xcg01667 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01667(java.lang.String XCG01667) {
		_vrTechnicalSpec_XCG.setXCG01667(XCG01667);
	}

	/**
	* Sets the xcg01668 of this vr technical spec_xcg.
	*
	* @param XCG01668 the xcg01668 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01668(java.lang.String XCG01668) {
		_vrTechnicalSpec_XCG.setXCG01668(XCG01668);
	}

	/**
	* Sets the xcg01669 of this vr technical spec_xcg.
	*
	* @param XCG01669 the xcg01669 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01669(java.lang.String XCG01669) {
		_vrTechnicalSpec_XCG.setXCG01669(XCG01669);
	}

	/**
	* Sets the xcg01670 of this vr technical spec_xcg.
	*
	* @param XCG01670 the xcg01670 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01670(java.lang.String XCG01670) {
		_vrTechnicalSpec_XCG.setXCG01670(XCG01670);
	}

	/**
	* Sets the xcg01671 of this vr technical spec_xcg.
	*
	* @param XCG01671 the xcg01671 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01671(java.lang.String XCG01671) {
		_vrTechnicalSpec_XCG.setXCG01671(XCG01671);
	}

	/**
	* Sets the xcg01672 of this vr technical spec_xcg.
	*
	* @param XCG01672 the xcg01672 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01672(java.lang.String XCG01672) {
		_vrTechnicalSpec_XCG.setXCG01672(XCG01672);
	}

	/**
	* Sets the xcg01673 of this vr technical spec_xcg.
	*
	* @param XCG01673 the xcg01673 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01673(java.lang.String XCG01673) {
		_vrTechnicalSpec_XCG.setXCG01673(XCG01673);
	}

	/**
	* Sets the xcg01674 of this vr technical spec_xcg.
	*
	* @param XCG01674 the xcg01674 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01674(java.lang.String XCG01674) {
		_vrTechnicalSpec_XCG.setXCG01674(XCG01674);
	}

	/**
	* Sets the xcg01675 of this vr technical spec_xcg.
	*
	* @param XCG01675 the xcg01675 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01675(java.lang.String XCG01675) {
		_vrTechnicalSpec_XCG.setXCG01675(XCG01675);
	}

	/**
	* Sets the xcg01676 of this vr technical spec_xcg.
	*
	* @param XCG01676 the xcg01676 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01676(java.lang.String XCG01676) {
		_vrTechnicalSpec_XCG.setXCG01676(XCG01676);
	}

	/**
	* Sets the xcg01677 of this vr technical spec_xcg.
	*
	* @param XCG01677 the xcg01677 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01677(java.lang.String XCG01677) {
		_vrTechnicalSpec_XCG.setXCG01677(XCG01677);
	}

	/**
	* Sets the xcg01678 of this vr technical spec_xcg.
	*
	* @param XCG01678 the xcg01678 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01678(java.lang.String XCG01678) {
		_vrTechnicalSpec_XCG.setXCG01678(XCG01678);
	}

	/**
	* Sets the xcg01679 of this vr technical spec_xcg.
	*
	* @param XCG01679 the xcg01679 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01679(java.lang.String XCG01679) {
		_vrTechnicalSpec_XCG.setXCG01679(XCG01679);
	}

	/**
	* Sets the xcg01680 of this vr technical spec_xcg.
	*
	* @param XCG01680 the xcg01680 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01680(java.lang.String XCG01680) {
		_vrTechnicalSpec_XCG.setXCG01680(XCG01680);
	}

	/**
	* Sets the xcg01681 of this vr technical spec_xcg.
	*
	* @param XCG01681 the xcg01681 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01681(java.lang.String XCG01681) {
		_vrTechnicalSpec_XCG.setXCG01681(XCG01681);
	}

	/**
	* Sets the xcg01682 of this vr technical spec_xcg.
	*
	* @param XCG01682 the xcg01682 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01682(java.lang.String XCG01682) {
		_vrTechnicalSpec_XCG.setXCG01682(XCG01682);
	}

	/**
	* Sets the xcg01683 of this vr technical spec_xcg.
	*
	* @param XCG01683 the xcg01683 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01683(java.lang.String XCG01683) {
		_vrTechnicalSpec_XCG.setXCG01683(XCG01683);
	}

	/**
	* Sets the xcg01684 of this vr technical spec_xcg.
	*
	* @param XCG01684 the xcg01684 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01684(java.lang.String XCG01684) {
		_vrTechnicalSpec_XCG.setXCG01684(XCG01684);
	}

	/**
	* Sets the xcg01685 of this vr technical spec_xcg.
	*
	* @param XCG01685 the xcg01685 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01685(java.lang.String XCG01685) {
		_vrTechnicalSpec_XCG.setXCG01685(XCG01685);
	}

	/**
	* Sets the xcg01686 of this vr technical spec_xcg.
	*
	* @param XCG01686 the xcg01686 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01686(java.lang.String XCG01686) {
		_vrTechnicalSpec_XCG.setXCG01686(XCG01686);
	}

	/**
	* Sets the xcg01687 of this vr technical spec_xcg.
	*
	* @param XCG01687 the xcg01687 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01687(java.lang.String XCG01687) {
		_vrTechnicalSpec_XCG.setXCG01687(XCG01687);
	}

	/**
	* Sets the xcg01688 of this vr technical spec_xcg.
	*
	* @param XCG01688 the xcg01688 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01688(java.lang.String XCG01688) {
		_vrTechnicalSpec_XCG.setXCG01688(XCG01688);
	}

	/**
	* Sets the xcg01689 of this vr technical spec_xcg.
	*
	* @param XCG01689 the xcg01689 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01689(java.lang.String XCG01689) {
		_vrTechnicalSpec_XCG.setXCG01689(XCG01689);
	}

	/**
	* Sets the xcg01690 of this vr technical spec_xcg.
	*
	* @param XCG01690 the xcg01690 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01690(java.lang.String XCG01690) {
		_vrTechnicalSpec_XCG.setXCG01690(XCG01690);
	}

	/**
	* Sets the xcg01691 of this vr technical spec_xcg.
	*
	* @param XCG01691 the xcg01691 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01691(java.lang.String XCG01691) {
		_vrTechnicalSpec_XCG.setXCG01691(XCG01691);
	}

	/**
	* Sets the xcg01692 of this vr technical spec_xcg.
	*
	* @param XCG01692 the xcg01692 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01692(java.lang.String XCG01692) {
		_vrTechnicalSpec_XCG.setXCG01692(XCG01692);
	}

	/**
	* Sets the xcg01693 of this vr technical spec_xcg.
	*
	* @param XCG01693 the xcg01693 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01693(java.lang.String XCG01693) {
		_vrTechnicalSpec_XCG.setXCG01693(XCG01693);
	}

	/**
	* Sets the xcg01694 of this vr technical spec_xcg.
	*
	* @param XCG01694 the xcg01694 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01694(java.lang.String XCG01694) {
		_vrTechnicalSpec_XCG.setXCG01694(XCG01694);
	}

	/**
	* Sets the xcg01695 of this vr technical spec_xcg.
	*
	* @param XCG01695 the xcg01695 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01695(java.lang.String XCG01695) {
		_vrTechnicalSpec_XCG.setXCG01695(XCG01695);
	}

	/**
	* Sets the xcg01696 of this vr technical spec_xcg.
	*
	* @param XCG01696 the xcg01696 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01696(java.lang.String XCG01696) {
		_vrTechnicalSpec_XCG.setXCG01696(XCG01696);
	}

	/**
	* Sets the xcg01697 of this vr technical spec_xcg.
	*
	* @param XCG01697 the xcg01697 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01697(java.lang.String XCG01697) {
		_vrTechnicalSpec_XCG.setXCG01697(XCG01697);
	}

	/**
	* Sets the xcg01698 of this vr technical spec_xcg.
	*
	* @param XCG01698 the xcg01698 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01698(java.lang.String XCG01698) {
		_vrTechnicalSpec_XCG.setXCG01698(XCG01698);
	}

	/**
	* Sets the xcg01699 of this vr technical spec_xcg.
	*
	* @param XCG01699 the xcg01699 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01699(java.lang.String XCG01699) {
		_vrTechnicalSpec_XCG.setXCG01699(XCG01699);
	}

	/**
	* Sets the xcg01700 of this vr technical spec_xcg.
	*
	* @param XCG01700 the xcg01700 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01700(java.lang.String XCG01700) {
		_vrTechnicalSpec_XCG.setXCG01700(XCG01700);
	}

	/**
	* Sets the xcg01701 of this vr technical spec_xcg.
	*
	* @param XCG01701 the xcg01701 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01701(java.lang.String XCG01701) {
		_vrTechnicalSpec_XCG.setXCG01701(XCG01701);
	}

	/**
	* Sets the xcg01702 of this vr technical spec_xcg.
	*
	* @param XCG01702 the xcg01702 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01702(java.lang.String XCG01702) {
		_vrTechnicalSpec_XCG.setXCG01702(XCG01702);
	}

	/**
	* Sets the xcg01703 of this vr technical spec_xcg.
	*
	* @param XCG01703 the xcg01703 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01703(java.lang.String XCG01703) {
		_vrTechnicalSpec_XCG.setXCG01703(XCG01703);
	}

	/**
	* Sets the xcg01704 of this vr technical spec_xcg.
	*
	* @param XCG01704 the xcg01704 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01704(java.lang.String XCG01704) {
		_vrTechnicalSpec_XCG.setXCG01704(XCG01704);
	}

	/**
	* Sets the xcg01705 of this vr technical spec_xcg.
	*
	* @param XCG01705 the xcg01705 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01705(java.lang.String XCG01705) {
		_vrTechnicalSpec_XCG.setXCG01705(XCG01705);
	}

	/**
	* Sets the xcg01706 of this vr technical spec_xcg.
	*
	* @param XCG01706 the xcg01706 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01706(java.lang.String XCG01706) {
		_vrTechnicalSpec_XCG.setXCG01706(XCG01706);
	}

	/**
	* Sets the xcg01707 of this vr technical spec_xcg.
	*
	* @param XCG01707 the xcg01707 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01707(java.lang.String XCG01707) {
		_vrTechnicalSpec_XCG.setXCG01707(XCG01707);
	}

	/**
	* Sets the xcg01708 of this vr technical spec_xcg.
	*
	* @param XCG01708 the xcg01708 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01708(java.lang.String XCG01708) {
		_vrTechnicalSpec_XCG.setXCG01708(XCG01708);
	}

	/**
	* Sets the xcg01709 of this vr technical spec_xcg.
	*
	* @param XCG01709 the xcg01709 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01709(java.lang.String XCG01709) {
		_vrTechnicalSpec_XCG.setXCG01709(XCG01709);
	}

	/**
	* Sets the xcg01710 of this vr technical spec_xcg.
	*
	* @param XCG01710 the xcg01710 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01710(java.lang.String XCG01710) {
		_vrTechnicalSpec_XCG.setXCG01710(XCG01710);
	}

	/**
	* Sets the xcg01711 of this vr technical spec_xcg.
	*
	* @param XCG01711 the xcg01711 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01711(java.lang.String XCG01711) {
		_vrTechnicalSpec_XCG.setXCG01711(XCG01711);
	}

	/**
	* Sets the xcg01712 of this vr technical spec_xcg.
	*
	* @param XCG01712 the xcg01712 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01712(java.lang.String XCG01712) {
		_vrTechnicalSpec_XCG.setXCG01712(XCG01712);
	}

	/**
	* Sets the xcg01713 of this vr technical spec_xcg.
	*
	* @param XCG01713 the xcg01713 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01713(java.lang.String XCG01713) {
		_vrTechnicalSpec_XCG.setXCG01713(XCG01713);
	}

	/**
	* Sets the xcg01714 of this vr technical spec_xcg.
	*
	* @param XCG01714 the xcg01714 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01714(java.lang.String XCG01714) {
		_vrTechnicalSpec_XCG.setXCG01714(XCG01714);
	}

	/**
	* Sets the xcg01715 of this vr technical spec_xcg.
	*
	* @param XCG01715 the xcg01715 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01715(java.lang.String XCG01715) {
		_vrTechnicalSpec_XCG.setXCG01715(XCG01715);
	}

	/**
	* Sets the xcg01716 of this vr technical spec_xcg.
	*
	* @param XCG01716 the xcg01716 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01716(java.lang.String XCG01716) {
		_vrTechnicalSpec_XCG.setXCG01716(XCG01716);
	}

	/**
	* Sets the xcg01717 of this vr technical spec_xcg.
	*
	* @param XCG01717 the xcg01717 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01717(java.lang.String XCG01717) {
		_vrTechnicalSpec_XCG.setXCG01717(XCG01717);
	}

	/**
	* Sets the xcg01718 of this vr technical spec_xcg.
	*
	* @param XCG01718 the xcg01718 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01718(java.lang.String XCG01718) {
		_vrTechnicalSpec_XCG.setXCG01718(XCG01718);
	}

	/**
	* Sets the xcg01719 of this vr technical spec_xcg.
	*
	* @param XCG01719 the xcg01719 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01719(java.lang.String XCG01719) {
		_vrTechnicalSpec_XCG.setXCG01719(XCG01719);
	}

	/**
	* Sets the xcg01720 of this vr technical spec_xcg.
	*
	* @param XCG01720 the xcg01720 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01720(java.lang.String XCG01720) {
		_vrTechnicalSpec_XCG.setXCG01720(XCG01720);
	}

	/**
	* Sets the xcg01721 of this vr technical spec_xcg.
	*
	* @param XCG01721 the xcg01721 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01721(java.lang.String XCG01721) {
		_vrTechnicalSpec_XCG.setXCG01721(XCG01721);
	}

	/**
	* Sets the xcg01722 of this vr technical spec_xcg.
	*
	* @param XCG01722 the xcg01722 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01722(java.lang.String XCG01722) {
		_vrTechnicalSpec_XCG.setXCG01722(XCG01722);
	}

	/**
	* Sets the xcg01723 of this vr technical spec_xcg.
	*
	* @param XCG01723 the xcg01723 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01723(java.lang.String XCG01723) {
		_vrTechnicalSpec_XCG.setXCG01723(XCG01723);
	}

	/**
	* Sets the xcg01724 of this vr technical spec_xcg.
	*
	* @param XCG01724 the xcg01724 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01724(java.lang.String XCG01724) {
		_vrTechnicalSpec_XCG.setXCG01724(XCG01724);
	}

	/**
	* Sets the xcg01725 of this vr technical spec_xcg.
	*
	* @param XCG01725 the xcg01725 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01725(java.lang.String XCG01725) {
		_vrTechnicalSpec_XCG.setXCG01725(XCG01725);
	}

	/**
	* Sets the xcg01726 of this vr technical spec_xcg.
	*
	* @param XCG01726 the xcg01726 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01726(java.lang.String XCG01726) {
		_vrTechnicalSpec_XCG.setXCG01726(XCG01726);
	}

	/**
	* Sets the xcg01727 of this vr technical spec_xcg.
	*
	* @param XCG01727 the xcg01727 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01727(java.lang.String XCG01727) {
		_vrTechnicalSpec_XCG.setXCG01727(XCG01727);
	}

	/**
	* Sets the xcg01728 of this vr technical spec_xcg.
	*
	* @param XCG01728 the xcg01728 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01728(java.lang.String XCG01728) {
		_vrTechnicalSpec_XCG.setXCG01728(XCG01728);
	}

	/**
	* Sets the xcg01729 of this vr technical spec_xcg.
	*
	* @param XCG01729 the xcg01729 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01729(java.lang.String XCG01729) {
		_vrTechnicalSpec_XCG.setXCG01729(XCG01729);
	}

	/**
	* Sets the xcg01730 of this vr technical spec_xcg.
	*
	* @param XCG01730 the xcg01730 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01730(java.lang.String XCG01730) {
		_vrTechnicalSpec_XCG.setXCG01730(XCG01730);
	}

	/**
	* Sets the xcg01731 of this vr technical spec_xcg.
	*
	* @param XCG01731 the xcg01731 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01731(java.lang.String XCG01731) {
		_vrTechnicalSpec_XCG.setXCG01731(XCG01731);
	}

	/**
	* Sets the xcg01732 of this vr technical spec_xcg.
	*
	* @param XCG01732 the xcg01732 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01732(java.lang.String XCG01732) {
		_vrTechnicalSpec_XCG.setXCG01732(XCG01732);
	}

	/**
	* Sets the xcg01733 of this vr technical spec_xcg.
	*
	* @param XCG01733 the xcg01733 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01733(java.lang.String XCG01733) {
		_vrTechnicalSpec_XCG.setXCG01733(XCG01733);
	}

	/**
	* Sets the xcg01734 of this vr technical spec_xcg.
	*
	* @param XCG01734 the xcg01734 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01734(java.lang.String XCG01734) {
		_vrTechnicalSpec_XCG.setXCG01734(XCG01734);
	}

	/**
	* Sets the xcg01735 of this vr technical spec_xcg.
	*
	* @param XCG01735 the xcg01735 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01735(java.lang.String XCG01735) {
		_vrTechnicalSpec_XCG.setXCG01735(XCG01735);
	}

	/**
	* Sets the xcg01736 of this vr technical spec_xcg.
	*
	* @param XCG01736 the xcg01736 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01736(java.lang.String XCG01736) {
		_vrTechnicalSpec_XCG.setXCG01736(XCG01736);
	}

	/**
	* Sets the xcg01737 of this vr technical spec_xcg.
	*
	* @param XCG01737 the xcg01737 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01737(java.lang.String XCG01737) {
		_vrTechnicalSpec_XCG.setXCG01737(XCG01737);
	}

	/**
	* Sets the xcg01738 of this vr technical spec_xcg.
	*
	* @param XCG01738 the xcg01738 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01738(java.lang.String XCG01738) {
		_vrTechnicalSpec_XCG.setXCG01738(XCG01738);
	}

	/**
	* Sets the xcg01739 of this vr technical spec_xcg.
	*
	* @param XCG01739 the xcg01739 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01739(java.lang.String XCG01739) {
		_vrTechnicalSpec_XCG.setXCG01739(XCG01739);
	}

	/**
	* Sets the xcg01740 of this vr technical spec_xcg.
	*
	* @param XCG01740 the xcg01740 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01740(java.lang.String XCG01740) {
		_vrTechnicalSpec_XCG.setXCG01740(XCG01740);
	}

	/**
	* Sets the xcg01741 of this vr technical spec_xcg.
	*
	* @param XCG01741 the xcg01741 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01741(java.lang.String XCG01741) {
		_vrTechnicalSpec_XCG.setXCG01741(XCG01741);
	}

	/**
	* Sets the xcg01742 of this vr technical spec_xcg.
	*
	* @param XCG01742 the xcg01742 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01742(java.lang.String XCG01742) {
		_vrTechnicalSpec_XCG.setXCG01742(XCG01742);
	}

	/**
	* Sets the xcg01744 of this vr technical spec_xcg.
	*
	* @param XCG01744 the xcg01744 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01744(java.lang.String XCG01744) {
		_vrTechnicalSpec_XCG.setXCG01744(XCG01744);
	}

	/**
	* Sets the xcg01745 of this vr technical spec_xcg.
	*
	* @param XCG01745 the xcg01745 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01745(java.lang.String XCG01745) {
		_vrTechnicalSpec_XCG.setXCG01745(XCG01745);
	}

	/**
	* Sets the xcg01746 of this vr technical spec_xcg.
	*
	* @param XCG01746 the xcg01746 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01746(java.lang.String XCG01746) {
		_vrTechnicalSpec_XCG.setXCG01746(XCG01746);
	}

	/**
	* Sets the xcg01747 of this vr technical spec_xcg.
	*
	* @param XCG01747 the xcg01747 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01747(java.lang.String XCG01747) {
		_vrTechnicalSpec_XCG.setXCG01747(XCG01747);
	}

	/**
	* Sets the xcg01748 of this vr technical spec_xcg.
	*
	* @param XCG01748 the xcg01748 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01748(java.lang.String XCG01748) {
		_vrTechnicalSpec_XCG.setXCG01748(XCG01748);
	}

	/**
	* Sets the xcg01749 of this vr technical spec_xcg.
	*
	* @param XCG01749 the xcg01749 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01749(java.lang.String XCG01749) {
		_vrTechnicalSpec_XCG.setXCG01749(XCG01749);
	}

	/**
	* Sets the xcg01750 of this vr technical spec_xcg.
	*
	* @param XCG01750 the xcg01750 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01750(java.lang.String XCG01750) {
		_vrTechnicalSpec_XCG.setXCG01750(XCG01750);
	}

	/**
	* Sets the xcg01751 of this vr technical spec_xcg.
	*
	* @param XCG01751 the xcg01751 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01751(java.lang.String XCG01751) {
		_vrTechnicalSpec_XCG.setXCG01751(XCG01751);
	}

	/**
	* Sets the xcg01752 of this vr technical spec_xcg.
	*
	* @param XCG01752 the xcg01752 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01752(java.lang.String XCG01752) {
		_vrTechnicalSpec_XCG.setXCG01752(XCG01752);
	}

	/**
	* Sets the xcg01753 of this vr technical spec_xcg.
	*
	* @param XCG01753 the xcg01753 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01753(java.lang.String XCG01753) {
		_vrTechnicalSpec_XCG.setXCG01753(XCG01753);
	}

	/**
	* Sets the xcg01754 of this vr technical spec_xcg.
	*
	* @param XCG01754 the xcg01754 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01754(java.lang.String XCG01754) {
		_vrTechnicalSpec_XCG.setXCG01754(XCG01754);
	}

	/**
	* Sets the xcg01756 of this vr technical spec_xcg.
	*
	* @param XCG01756 the xcg01756 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01756(java.lang.String XCG01756) {
		_vrTechnicalSpec_XCG.setXCG01756(XCG01756);
	}

	/**
	* Sets the xcg01757 of this vr technical spec_xcg.
	*
	* @param XCG01757 the xcg01757 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01757(java.lang.String XCG01757) {
		_vrTechnicalSpec_XCG.setXCG01757(XCG01757);
	}

	/**
	* Sets the xcg01758 of this vr technical spec_xcg.
	*
	* @param XCG01758 the xcg01758 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01758(java.lang.String XCG01758) {
		_vrTechnicalSpec_XCG.setXCG01758(XCG01758);
	}

	/**
	* Sets the xcg01759 of this vr technical spec_xcg.
	*
	* @param XCG01759 the xcg01759 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01759(java.lang.String XCG01759) {
		_vrTechnicalSpec_XCG.setXCG01759(XCG01759);
	}

	/**
	* Sets the xcg01760 of this vr technical spec_xcg.
	*
	* @param XCG01760 the xcg01760 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01760(java.lang.String XCG01760) {
		_vrTechnicalSpec_XCG.setXCG01760(XCG01760);
	}

	/**
	* Sets the xcg01761 of this vr technical spec_xcg.
	*
	* @param XCG01761 the xcg01761 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01761(java.lang.String XCG01761) {
		_vrTechnicalSpec_XCG.setXCG01761(XCG01761);
	}

	/**
	* Sets the xcg01762 of this vr technical spec_xcg.
	*
	* @param XCG01762 the xcg01762 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01762(java.lang.String XCG01762) {
		_vrTechnicalSpec_XCG.setXCG01762(XCG01762);
	}

	/**
	* Sets the xcg01763 of this vr technical spec_xcg.
	*
	* @param XCG01763 the xcg01763 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01763(java.lang.String XCG01763) {
		_vrTechnicalSpec_XCG.setXCG01763(XCG01763);
	}

	/**
	* Sets the xcg01764 of this vr technical spec_xcg.
	*
	* @param XCG01764 the xcg01764 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01764(java.lang.String XCG01764) {
		_vrTechnicalSpec_XCG.setXCG01764(XCG01764);
	}

	/**
	* Sets the xcg01765 of this vr technical spec_xcg.
	*
	* @param XCG01765 the xcg01765 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01765(java.lang.String XCG01765) {
		_vrTechnicalSpec_XCG.setXCG01765(XCG01765);
	}

	/**
	* Sets the xcg01766 of this vr technical spec_xcg.
	*
	* @param XCG01766 the xcg01766 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01766(java.lang.String XCG01766) {
		_vrTechnicalSpec_XCG.setXCG01766(XCG01766);
	}

	/**
	* Sets the xcg01767 of this vr technical spec_xcg.
	*
	* @param XCG01767 the xcg01767 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01767(java.lang.String XCG01767) {
		_vrTechnicalSpec_XCG.setXCG01767(XCG01767);
	}

	/**
	* Sets the xcg01768 of this vr technical spec_xcg.
	*
	* @param XCG01768 the xcg01768 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01768(java.lang.String XCG01768) {
		_vrTechnicalSpec_XCG.setXCG01768(XCG01768);
	}

	/**
	* Sets the xcg01769 of this vr technical spec_xcg.
	*
	* @param XCG01769 the xcg01769 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01769(java.lang.String XCG01769) {
		_vrTechnicalSpec_XCG.setXCG01769(XCG01769);
	}

	/**
	* Sets the xcg01770 of this vr technical spec_xcg.
	*
	* @param XCG01770 the xcg01770 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01770(java.lang.String XCG01770) {
		_vrTechnicalSpec_XCG.setXCG01770(XCG01770);
	}

	/**
	* Sets the xcg01771 of this vr technical spec_xcg.
	*
	* @param XCG01771 the xcg01771 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01771(java.lang.String XCG01771) {
		_vrTechnicalSpec_XCG.setXCG01771(XCG01771);
	}

	/**
	* Sets the xcg01772 of this vr technical spec_xcg.
	*
	* @param XCG01772 the xcg01772 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01772(java.lang.String XCG01772) {
		_vrTechnicalSpec_XCG.setXCG01772(XCG01772);
	}

	/**
	* Sets the xcg01773 of this vr technical spec_xcg.
	*
	* @param XCG01773 the xcg01773 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01773(java.lang.String XCG01773) {
		_vrTechnicalSpec_XCG.setXCG01773(XCG01773);
	}

	/**
	* Sets the xcg01774 of this vr technical spec_xcg.
	*
	* @param XCG01774 the xcg01774 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01774(java.lang.String XCG01774) {
		_vrTechnicalSpec_XCG.setXCG01774(XCG01774);
	}

	/**
	* Sets the xcg01775 of this vr technical spec_xcg.
	*
	* @param XCG01775 the xcg01775 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01775(java.lang.String XCG01775) {
		_vrTechnicalSpec_XCG.setXCG01775(XCG01775);
	}

	/**
	* Sets the xcg01776 of this vr technical spec_xcg.
	*
	* @param XCG01776 the xcg01776 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01776(java.lang.String XCG01776) {
		_vrTechnicalSpec_XCG.setXCG01776(XCG01776);
	}

	/**
	* Sets the xcg01777 of this vr technical spec_xcg.
	*
	* @param XCG01777 the xcg01777 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01777(java.lang.String XCG01777) {
		_vrTechnicalSpec_XCG.setXCG01777(XCG01777);
	}

	/**
	* Sets the xcg01778 of this vr technical spec_xcg.
	*
	* @param XCG01778 the xcg01778 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01778(java.lang.String XCG01778) {
		_vrTechnicalSpec_XCG.setXCG01778(XCG01778);
	}

	/**
	* Sets the xcg01779 of this vr technical spec_xcg.
	*
	* @param XCG01779 the xcg01779 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01779(java.lang.String XCG01779) {
		_vrTechnicalSpec_XCG.setXCG01779(XCG01779);
	}

	/**
	* Sets the xcg01780 of this vr technical spec_xcg.
	*
	* @param XCG01780 the xcg01780 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01780(java.lang.String XCG01780) {
		_vrTechnicalSpec_XCG.setXCG01780(XCG01780);
	}

	/**
	* Sets the xcg01781 of this vr technical spec_xcg.
	*
	* @param XCG01781 the xcg01781 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01781(java.lang.String XCG01781) {
		_vrTechnicalSpec_XCG.setXCG01781(XCG01781);
	}

	/**
	* Sets the xcg01783 of this vr technical spec_xcg.
	*
	* @param XCG01783 the xcg01783 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01783(java.lang.String XCG01783) {
		_vrTechnicalSpec_XCG.setXCG01783(XCG01783);
	}

	/**
	* Sets the xcg01785 of this vr technical spec_xcg.
	*
	* @param XCG01785 the xcg01785 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01785(java.lang.String XCG01785) {
		_vrTechnicalSpec_XCG.setXCG01785(XCG01785);
	}

	/**
	* Sets the xcg01786 of this vr technical spec_xcg.
	*
	* @param XCG01786 the xcg01786 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01786(java.lang.String XCG01786) {
		_vrTechnicalSpec_XCG.setXCG01786(XCG01786);
	}

	/**
	* Sets the xcg01787 of this vr technical spec_xcg.
	*
	* @param XCG01787 the xcg01787 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01787(java.lang.String XCG01787) {
		_vrTechnicalSpec_XCG.setXCG01787(XCG01787);
	}

	/**
	* Sets the xcg01788 of this vr technical spec_xcg.
	*
	* @param XCG01788 the xcg01788 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01788(java.lang.String XCG01788) {
		_vrTechnicalSpec_XCG.setXCG01788(XCG01788);
	}

	/**
	* Sets the xcg01789 of this vr technical spec_xcg.
	*
	* @param XCG01789 the xcg01789 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01789(java.lang.String XCG01789) {
		_vrTechnicalSpec_XCG.setXCG01789(XCG01789);
	}

	/**
	* Sets the xcg01790 of this vr technical spec_xcg.
	*
	* @param XCG01790 the xcg01790 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01790(java.lang.String XCG01790) {
		_vrTechnicalSpec_XCG.setXCG01790(XCG01790);
	}

	/**
	* Sets the xcg01791 of this vr technical spec_xcg.
	*
	* @param XCG01791 the xcg01791 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01791(java.lang.String XCG01791) {
		_vrTechnicalSpec_XCG.setXCG01791(XCG01791);
	}

	/**
	* Sets the xcg01792 of this vr technical spec_xcg.
	*
	* @param XCG01792 the xcg01792 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01792(java.lang.String XCG01792) {
		_vrTechnicalSpec_XCG.setXCG01792(XCG01792);
	}

	/**
	* Sets the xcg01793 of this vr technical spec_xcg.
	*
	* @param XCG01793 the xcg01793 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01793(java.lang.String XCG01793) {
		_vrTechnicalSpec_XCG.setXCG01793(XCG01793);
	}

	/**
	* Sets the xcg01794 of this vr technical spec_xcg.
	*
	* @param XCG01794 the xcg01794 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01794(java.lang.String XCG01794) {
		_vrTechnicalSpec_XCG.setXCG01794(XCG01794);
	}

	/**
	* Sets the xcg01795 of this vr technical spec_xcg.
	*
	* @param XCG01795 the xcg01795 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01795(java.lang.String XCG01795) {
		_vrTechnicalSpec_XCG.setXCG01795(XCG01795);
	}

	/**
	* Sets the xcg01796 of this vr technical spec_xcg.
	*
	* @param XCG01796 the xcg01796 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01796(java.lang.String XCG01796) {
		_vrTechnicalSpec_XCG.setXCG01796(XCG01796);
	}

	/**
	* Sets the xcg01797 of this vr technical spec_xcg.
	*
	* @param XCG01797 the xcg01797 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01797(java.lang.String XCG01797) {
		_vrTechnicalSpec_XCG.setXCG01797(XCG01797);
	}

	/**
	* Sets the xcg01798 of this vr technical spec_xcg.
	*
	* @param XCG01798 the xcg01798 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01798(java.lang.String XCG01798) {
		_vrTechnicalSpec_XCG.setXCG01798(XCG01798);
	}

	/**
	* Sets the xcg01799 of this vr technical spec_xcg.
	*
	* @param XCG01799 the xcg01799 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01799(java.lang.String XCG01799) {
		_vrTechnicalSpec_XCG.setXCG01799(XCG01799);
	}

	/**
	* Sets the xcg01801 of this vr technical spec_xcg.
	*
	* @param XCG01801 the xcg01801 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01801(java.lang.String XCG01801) {
		_vrTechnicalSpec_XCG.setXCG01801(XCG01801);
	}

	/**
	* Sets the xcg01802 of this vr technical spec_xcg.
	*
	* @param XCG01802 the xcg01802 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01802(java.lang.String XCG01802) {
		_vrTechnicalSpec_XCG.setXCG01802(XCG01802);
	}

	/**
	* Sets the xcg01803 of this vr technical spec_xcg.
	*
	* @param XCG01803 the xcg01803 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01803(java.lang.String XCG01803) {
		_vrTechnicalSpec_XCG.setXCG01803(XCG01803);
	}

	/**
	* Sets the xcg01804 of this vr technical spec_xcg.
	*
	* @param XCG01804 the xcg01804 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01804(java.lang.String XCG01804) {
		_vrTechnicalSpec_XCG.setXCG01804(XCG01804);
	}

	/**
	* Sets the xcg01805 of this vr technical spec_xcg.
	*
	* @param XCG01805 the xcg01805 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01805(java.lang.String XCG01805) {
		_vrTechnicalSpec_XCG.setXCG01805(XCG01805);
	}

	/**
	* Sets the xcg01806 of this vr technical spec_xcg.
	*
	* @param XCG01806 the xcg01806 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01806(java.lang.String XCG01806) {
		_vrTechnicalSpec_XCG.setXCG01806(XCG01806);
	}

	/**
	* Sets the xcg01807 of this vr technical spec_xcg.
	*
	* @param XCG01807 the xcg01807 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01807(java.lang.String XCG01807) {
		_vrTechnicalSpec_XCG.setXCG01807(XCG01807);
	}

	/**
	* Sets the xcg01808 of this vr technical spec_xcg.
	*
	* @param XCG01808 the xcg01808 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01808(java.lang.String XCG01808) {
		_vrTechnicalSpec_XCG.setXCG01808(XCG01808);
	}

	/**
	* Sets the xcg01809 of this vr technical spec_xcg.
	*
	* @param XCG01809 the xcg01809 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01809(java.lang.String XCG01809) {
		_vrTechnicalSpec_XCG.setXCG01809(XCG01809);
	}

	/**
	* Sets the xcg01810 of this vr technical spec_xcg.
	*
	* @param XCG01810 the xcg01810 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01810(java.lang.String XCG01810) {
		_vrTechnicalSpec_XCG.setXCG01810(XCG01810);
	}

	/**
	* Sets the xcg01811 of this vr technical spec_xcg.
	*
	* @param XCG01811 the xcg01811 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01811(java.lang.String XCG01811) {
		_vrTechnicalSpec_XCG.setXCG01811(XCG01811);
	}

	/**
	* Sets the xcg01812 of this vr technical spec_xcg.
	*
	* @param XCG01812 the xcg01812 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01812(java.lang.String XCG01812) {
		_vrTechnicalSpec_XCG.setXCG01812(XCG01812);
	}

	/**
	* Sets the xcg01813 of this vr technical spec_xcg.
	*
	* @param XCG01813 the xcg01813 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01813(java.lang.String XCG01813) {
		_vrTechnicalSpec_XCG.setXCG01813(XCG01813);
	}

	/**
	* Sets the xcg01814 of this vr technical spec_xcg.
	*
	* @param XCG01814 the xcg01814 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01814(java.lang.String XCG01814) {
		_vrTechnicalSpec_XCG.setXCG01814(XCG01814);
	}

	/**
	* Sets the xcg01901 of this vr technical spec_xcg.
	*
	* @param XCG01901 the xcg01901 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01901(java.lang.String XCG01901) {
		_vrTechnicalSpec_XCG.setXCG01901(XCG01901);
	}

	/**
	* Sets the xcg01902 of this vr technical spec_xcg.
	*
	* @param XCG01902 the xcg01902 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01902(java.lang.String XCG01902) {
		_vrTechnicalSpec_XCG.setXCG01902(XCG01902);
	}

	/**
	* Sets the xcg01903 of this vr technical spec_xcg.
	*
	* @param XCG01903 the xcg01903 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01903(java.lang.String XCG01903) {
		_vrTechnicalSpec_XCG.setXCG01903(XCG01903);
	}

	/**
	* Sets the xcg01904 of this vr technical spec_xcg.
	*
	* @param XCG01904 the xcg01904 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01904(java.lang.String XCG01904) {
		_vrTechnicalSpec_XCG.setXCG01904(XCG01904);
	}

	/**
	* Sets the xcg01905 of this vr technical spec_xcg.
	*
	* @param XCG01905 the xcg01905 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01905(java.lang.String XCG01905) {
		_vrTechnicalSpec_XCG.setXCG01905(XCG01905);
	}

	/**
	* Sets the xcg01906 of this vr technical spec_xcg.
	*
	* @param XCG01906 the xcg01906 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01906(java.lang.String XCG01906) {
		_vrTechnicalSpec_XCG.setXCG01906(XCG01906);
	}

	/**
	* Sets the xcg01907 of this vr technical spec_xcg.
	*
	* @param XCG01907 the xcg01907 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01907(java.lang.String XCG01907) {
		_vrTechnicalSpec_XCG.setXCG01907(XCG01907);
	}

	/**
	* Sets the xcg01908 of this vr technical spec_xcg.
	*
	* @param XCG01908 the xcg01908 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01908(java.lang.String XCG01908) {
		_vrTechnicalSpec_XCG.setXCG01908(XCG01908);
	}

	/**
	* Sets the xcg01909 of this vr technical spec_xcg.
	*
	* @param XCG01909 the xcg01909 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01909(java.lang.String XCG01909) {
		_vrTechnicalSpec_XCG.setXCG01909(XCG01909);
	}

	/**
	* Sets the xcg01910 of this vr technical spec_xcg.
	*
	* @param XCG01910 the xcg01910 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01910(java.lang.String XCG01910) {
		_vrTechnicalSpec_XCG.setXCG01910(XCG01910);
	}

	/**
	* Sets the xcg01911 of this vr technical spec_xcg.
	*
	* @param XCG01911 the xcg01911 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01911(java.lang.String XCG01911) {
		_vrTechnicalSpec_XCG.setXCG01911(XCG01911);
	}

	/**
	* Sets the xcg01912 of this vr technical spec_xcg.
	*
	* @param XCG01912 the xcg01912 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01912(java.lang.String XCG01912) {
		_vrTechnicalSpec_XCG.setXCG01912(XCG01912);
	}

	/**
	* Sets the xcg01913 of this vr technical spec_xcg.
	*
	* @param XCG01913 the xcg01913 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01913(java.lang.String XCG01913) {
		_vrTechnicalSpec_XCG.setXCG01913(XCG01913);
	}

	/**
	* Sets the xcg01914 of this vr technical spec_xcg.
	*
	* @param XCG01914 the xcg01914 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01914(java.lang.String XCG01914) {
		_vrTechnicalSpec_XCG.setXCG01914(XCG01914);
	}

	/**
	* Sets the xcg01915 of this vr technical spec_xcg.
	*
	* @param XCG01915 the xcg01915 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01915(java.lang.String XCG01915) {
		_vrTechnicalSpec_XCG.setXCG01915(XCG01915);
	}

	/**
	* Sets the xcg01916 of this vr technical spec_xcg.
	*
	* @param XCG01916 the xcg01916 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01916(java.lang.String XCG01916) {
		_vrTechnicalSpec_XCG.setXCG01916(XCG01916);
	}

	/**
	* Sets the xcg01917 of this vr technical spec_xcg.
	*
	* @param XCG01917 the xcg01917 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01917(java.lang.String XCG01917) {
		_vrTechnicalSpec_XCG.setXCG01917(XCG01917);
	}

	/**
	* Sets the xcg01918 of this vr technical spec_xcg.
	*
	* @param XCG01918 the xcg01918 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01918(java.lang.String XCG01918) {
		_vrTechnicalSpec_XCG.setXCG01918(XCG01918);
	}

	/**
	* Sets the xcg01919 of this vr technical spec_xcg.
	*
	* @param XCG01919 the xcg01919 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01919(java.lang.String XCG01919) {
		_vrTechnicalSpec_XCG.setXCG01919(XCG01919);
	}

	/**
	* Sets the xcg01920 of this vr technical spec_xcg.
	*
	* @param XCG01920 the xcg01920 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01920(java.lang.String XCG01920) {
		_vrTechnicalSpec_XCG.setXCG01920(XCG01920);
	}

	/**
	* Sets the xcg01921 of this vr technical spec_xcg.
	*
	* @param XCG01921 the xcg01921 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01921(java.lang.String XCG01921) {
		_vrTechnicalSpec_XCG.setXCG01921(XCG01921);
	}

	/**
	* Sets the xcg01922 of this vr technical spec_xcg.
	*
	* @param XCG01922 the xcg01922 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01922(java.lang.String XCG01922) {
		_vrTechnicalSpec_XCG.setXCG01922(XCG01922);
	}

	/**
	* Sets the xcg01923 of this vr technical spec_xcg.
	*
	* @param XCG01923 the xcg01923 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01923(java.lang.String XCG01923) {
		_vrTechnicalSpec_XCG.setXCG01923(XCG01923);
	}

	/**
	* Sets the xcg01924 of this vr technical spec_xcg.
	*
	* @param XCG01924 the xcg01924 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01924(java.lang.String XCG01924) {
		_vrTechnicalSpec_XCG.setXCG01924(XCG01924);
	}

	/**
	* Sets the xcg01925 of this vr technical spec_xcg.
	*
	* @param XCG01925 the xcg01925 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01925(java.lang.String XCG01925) {
		_vrTechnicalSpec_XCG.setXCG01925(XCG01925);
	}

	/**
	* Sets the xcg01926 of this vr technical spec_xcg.
	*
	* @param XCG01926 the xcg01926 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01926(java.lang.String XCG01926) {
		_vrTechnicalSpec_XCG.setXCG01926(XCG01926);
	}

	/**
	* Sets the xcg01928 of this vr technical spec_xcg.
	*
	* @param XCG01928 the xcg01928 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01928(java.lang.String XCG01928) {
		_vrTechnicalSpec_XCG.setXCG01928(XCG01928);
	}

	/**
	* Sets the xcg01929 of this vr technical spec_xcg.
	*
	* @param XCG01929 the xcg01929 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01929(java.lang.String XCG01929) {
		_vrTechnicalSpec_XCG.setXCG01929(XCG01929);
	}

	/**
	* Sets the xcg01930 of this vr technical spec_xcg.
	*
	* @param XCG01930 the xcg01930 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01930(java.lang.String XCG01930) {
		_vrTechnicalSpec_XCG.setXCG01930(XCG01930);
	}

	/**
	* Sets the xcg01931 of this vr technical spec_xcg.
	*
	* @param XCG01931 the xcg01931 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01931(java.lang.String XCG01931) {
		_vrTechnicalSpec_XCG.setXCG01931(XCG01931);
	}

	/**
	* Sets the xcg01932 of this vr technical spec_xcg.
	*
	* @param XCG01932 the xcg01932 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01932(java.lang.String XCG01932) {
		_vrTechnicalSpec_XCG.setXCG01932(XCG01932);
	}

	/**
	* Sets the xcg01933 of this vr technical spec_xcg.
	*
	* @param XCG01933 the xcg01933 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01933(java.lang.String XCG01933) {
		_vrTechnicalSpec_XCG.setXCG01933(XCG01933);
	}

	/**
	* Sets the xcg01934 of this vr technical spec_xcg.
	*
	* @param XCG01934 the xcg01934 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01934(java.lang.String XCG01934) {
		_vrTechnicalSpec_XCG.setXCG01934(XCG01934);
	}

	/**
	* Sets the xcg01935 of this vr technical spec_xcg.
	*
	* @param XCG01935 the xcg01935 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01935(java.lang.String XCG01935) {
		_vrTechnicalSpec_XCG.setXCG01935(XCG01935);
	}

	/**
	* Sets the xcg01936 of this vr technical spec_xcg.
	*
	* @param XCG01936 the xcg01936 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01936(java.lang.String XCG01936) {
		_vrTechnicalSpec_XCG.setXCG01936(XCG01936);
	}

	/**
	* Sets the xcg01937 of this vr technical spec_xcg.
	*
	* @param XCG01937 the xcg01937 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01937(java.lang.String XCG01937) {
		_vrTechnicalSpec_XCG.setXCG01937(XCG01937);
	}

	/**
	* Sets the xcg01938 of this vr technical spec_xcg.
	*
	* @param XCG01938 the xcg01938 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01938(java.lang.String XCG01938) {
		_vrTechnicalSpec_XCG.setXCG01938(XCG01938);
	}

	/**
	* Sets the xcg01939 of this vr technical spec_xcg.
	*
	* @param XCG01939 the xcg01939 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01939(java.lang.String XCG01939) {
		_vrTechnicalSpec_XCG.setXCG01939(XCG01939);
	}

	/**
	* Sets the xcg01940 of this vr technical spec_xcg.
	*
	* @param XCG01940 the xcg01940 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01940(java.lang.String XCG01940) {
		_vrTechnicalSpec_XCG.setXCG01940(XCG01940);
	}

	/**
	* Sets the xcg01941 of this vr technical spec_xcg.
	*
	* @param XCG01941 the xcg01941 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01941(java.lang.String XCG01941) {
		_vrTechnicalSpec_XCG.setXCG01941(XCG01941);
	}

	/**
	* Sets the xcg01942 of this vr technical spec_xcg.
	*
	* @param XCG01942 the xcg01942 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01942(java.lang.String XCG01942) {
		_vrTechnicalSpec_XCG.setXCG01942(XCG01942);
	}

	/**
	* Sets the xcg01943 of this vr technical spec_xcg.
	*
	* @param XCG01943 the xcg01943 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01943(java.lang.String XCG01943) {
		_vrTechnicalSpec_XCG.setXCG01943(XCG01943);
	}

	/**
	* Sets the xcg01944 of this vr technical spec_xcg.
	*
	* @param XCG01944 the xcg01944 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01944(java.lang.String XCG01944) {
		_vrTechnicalSpec_XCG.setXCG01944(XCG01944);
	}

	/**
	* Sets the xcg01945 of this vr technical spec_xcg.
	*
	* @param XCG01945 the xcg01945 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01945(java.lang.String XCG01945) {
		_vrTechnicalSpec_XCG.setXCG01945(XCG01945);
	}

	/**
	* Sets the xcg01946 of this vr technical spec_xcg.
	*
	* @param XCG01946 the xcg01946 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01946(java.lang.String XCG01946) {
		_vrTechnicalSpec_XCG.setXCG01946(XCG01946);
	}

	/**
	* Sets the xcg01948 of this vr technical spec_xcg.
	*
	* @param XCG01948 the xcg01948 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01948(java.lang.String XCG01948) {
		_vrTechnicalSpec_XCG.setXCG01948(XCG01948);
	}

	/**
	* Sets the xcg01949 of this vr technical spec_xcg.
	*
	* @param XCG01949 the xcg01949 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01949(java.lang.String XCG01949) {
		_vrTechnicalSpec_XCG.setXCG01949(XCG01949);
	}

	/**
	* Sets the xcg01950 of this vr technical spec_xcg.
	*
	* @param XCG01950 the xcg01950 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01950(java.lang.String XCG01950) {
		_vrTechnicalSpec_XCG.setXCG01950(XCG01950);
	}

	/**
	* Sets the xcg01951 of this vr technical spec_xcg.
	*
	* @param XCG01951 the xcg01951 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01951(java.lang.String XCG01951) {
		_vrTechnicalSpec_XCG.setXCG01951(XCG01951);
	}

	/**
	* Sets the xcg01952 of this vr technical spec_xcg.
	*
	* @param XCG01952 the xcg01952 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01952(java.lang.String XCG01952) {
		_vrTechnicalSpec_XCG.setXCG01952(XCG01952);
	}

	/**
	* Sets the xcg01953 of this vr technical spec_xcg.
	*
	* @param XCG01953 the xcg01953 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01953(java.lang.String XCG01953) {
		_vrTechnicalSpec_XCG.setXCG01953(XCG01953);
	}

	/**
	* Sets the xcg01954 of this vr technical spec_xcg.
	*
	* @param XCG01954 the xcg01954 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01954(java.lang.String XCG01954) {
		_vrTechnicalSpec_XCG.setXCG01954(XCG01954);
	}

	/**
	* Sets the xcg01955 of this vr technical spec_xcg.
	*
	* @param XCG01955 the xcg01955 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01955(java.lang.String XCG01955) {
		_vrTechnicalSpec_XCG.setXCG01955(XCG01955);
	}

	/**
	* Sets the xcg01956 of this vr technical spec_xcg.
	*
	* @param XCG01956 the xcg01956 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01956(java.lang.String XCG01956) {
		_vrTechnicalSpec_XCG.setXCG01956(XCG01956);
	}

	/**
	* Sets the xcg01957 of this vr technical spec_xcg.
	*
	* @param XCG01957 the xcg01957 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01957(java.lang.String XCG01957) {
		_vrTechnicalSpec_XCG.setXCG01957(XCG01957);
	}

	/**
	* Sets the xcg01958 of this vr technical spec_xcg.
	*
	* @param XCG01958 the xcg01958 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01958(java.lang.String XCG01958) {
		_vrTechnicalSpec_XCG.setXCG01958(XCG01958);
	}

	/**
	* Sets the xcg01959 of this vr technical spec_xcg.
	*
	* @param XCG01959 the xcg01959 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG01959(java.lang.String XCG01959) {
		_vrTechnicalSpec_XCG.setXCG01959(XCG01959);
	}

	/**
	* Sets the xcg11248 of this vr technical spec_xcg.
	*
	* @param XCG11248 the xcg11248 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG11248(java.lang.String XCG11248) {
		_vrTechnicalSpec_XCG.setXCG11248(XCG11248);
	}

	/**
	* Sets the xcg11249 of this vr technical spec_xcg.
	*
	* @param XCG11249 the xcg11249 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG11249(java.lang.String XCG11249) {
		_vrTechnicalSpec_XCG.setXCG11249(XCG11249);
	}

	/**
	* Sets the xcg11253 of this vr technical spec_xcg.
	*
	* @param XCG11253 the xcg11253 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG11253(java.lang.String XCG11253) {
		_vrTechnicalSpec_XCG.setXCG11253(XCG11253);
	}

	/**
	* Sets the xcg11535 of this vr technical spec_xcg.
	*
	* @param XCG11535 the xcg11535 of this vr technical spec_xcg
	*/
	@Override
	public void setXCG11535(java.lang.String XCG11535) {
		_vrTechnicalSpec_XCG.setXCG11535(XCG11535);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRTechnicalSpec_XCGWrapper)) {
			return false;
		}

		VRTechnicalSpec_XCGWrapper vrTechnicalSpec_XCGWrapper = (VRTechnicalSpec_XCGWrapper)obj;

		if (Objects.equals(_vrTechnicalSpec_XCG,
					vrTechnicalSpec_XCGWrapper._vrTechnicalSpec_XCG)) {
			return true;
		}

		return false;
	}

	@Override
	public VRTechnicalSpec_XCG getWrappedModel() {
		return _vrTechnicalSpec_XCG;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrTechnicalSpec_XCG.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrTechnicalSpec_XCG.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrTechnicalSpec_XCG.resetOriginalValues();
	}

	private final VRTechnicalSpec_XCG _vrTechnicalSpec_XCG;
}
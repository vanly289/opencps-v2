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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author LamTV
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCGSoap implements Serializable {
	public static VRTechnicalSpec_XCGSoap toSoapModel(VRTechnicalSpec_XCG model) {
		VRTechnicalSpec_XCGSoap soapModel = new VRTechnicalSpec_XCGSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setConvertAssembleId(model.getConvertAssembleId());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setDossierNo(model.getDossierNo());
		soapModel.setReferenceUid(model.getReferenceUid());
		soapModel.setDossierIdCTN(model.getDossierIdCTN());
		soapModel.setDeliverableCode(model.getDeliverableCode());
		soapModel.setLoai_dong_co(model.getLoai_dong_co());
		soapModel.setXCG01001(model.getXCG01001());
		soapModel.setXCG01002(model.getXCG01002());
		soapModel.setXCG01003(model.getXCG01003());
		soapModel.setXCG01004(model.getXCG01004());
		soapModel.setXCG01005(model.getXCG01005());
		soapModel.setXCG01006(model.getXCG01006());
		soapModel.setXCG01007(model.getXCG01007());
		soapModel.setXCG01008(model.getXCG01008());
		soapModel.setXCG01009(model.getXCG01009());
		soapModel.setXCG01010(model.getXCG01010());
		soapModel.setXCG01011(model.getXCG01011());
		soapModel.setXCG01012(model.getXCG01012());
		soapModel.setXCG01013(model.getXCG01013());
		soapModel.setXCG01014(model.getXCG01014());
		soapModel.setXCG01016(model.getXCG01016());
		soapModel.setXCG01017(model.getXCG01017());
		soapModel.setXCG01019(model.getXCG01019());
		soapModel.setXCG01020(model.getXCG01020());
		soapModel.setXCG01021(model.getXCG01021());
		soapModel.setXCG01022(model.getXCG01022());
		soapModel.setXCG01024(model.getXCG01024());
		soapModel.setXCG01025(model.getXCG01025());
		soapModel.setXCG01026(model.getXCG01026());
		soapModel.setXCG01027(model.getXCG01027());
		soapModel.setXCG01028(model.getXCG01028());
		soapModel.setXCG01030(model.getXCG01030());
		soapModel.setXCG01031(model.getXCG01031());
		soapModel.setXCG01032(model.getXCG01032());
		soapModel.setXCG01033(model.getXCG01033());
		soapModel.setXCG01034(model.getXCG01034());
		soapModel.setXCG01035(model.getXCG01035());
		soapModel.setXCG01036(model.getXCG01036());
		soapModel.setXCG01037(model.getXCG01037());
		soapModel.setXCG01038(model.getXCG01038());
		soapModel.setXCG01039(model.getXCG01039());
		soapModel.setXCG01040(model.getXCG01040());
		soapModel.setXCG01041(model.getXCG01041());
		soapModel.setXCG01042(model.getXCG01042());
		soapModel.setXCG01043(model.getXCG01043());
		soapModel.setXCG01044(model.getXCG01044());
		soapModel.setXCG01045(model.getXCG01045());
		soapModel.setXCG01046(model.getXCG01046());
		soapModel.setXCG01047(model.getXCG01047());
		soapModel.setXCG01049(model.getXCG01049());
		soapModel.setXCG01050(model.getXCG01050());
		soapModel.setXCG01051(model.getXCG01051());
		soapModel.setXCG01052(model.getXCG01052());
		soapModel.setXCG01053(model.getXCG01053());
		soapModel.setXCG01054(model.getXCG01054());
		soapModel.setXCG01055(model.getXCG01055());
		soapModel.setXCG01056(model.getXCG01056());
		soapModel.setXCG01057(model.getXCG01057());
		soapModel.setXCG01058(model.getXCG01058());
		soapModel.setXCG01059(model.getXCG01059());
		soapModel.setXCG01060(model.getXCG01060());
		soapModel.setXCG01062(model.getXCG01062());
		soapModel.setXCG01063(model.getXCG01063());
		soapModel.setXCG01064(model.getXCG01064());
		soapModel.setXCG01065(model.getXCG01065());
		soapModel.setXCG01066(model.getXCG01066());
		soapModel.setXCG01067(model.getXCG01067());
		soapModel.setXCG01068(model.getXCG01068());
		soapModel.setXCG01069(model.getXCG01069());
		soapModel.setXCG01070(model.getXCG01070());
		soapModel.setXCG01072(model.getXCG01072());
		soapModel.setXCG01073(model.getXCG01073());
		soapModel.setXCG01074(model.getXCG01074());
		soapModel.setXCG01075(model.getXCG01075());
		soapModel.setXCG01076(model.getXCG01076());
		soapModel.setXCG01077(model.getXCG01077());
		soapModel.setXCG01078(model.getXCG01078());
		soapModel.setXCG01079(model.getXCG01079());
		soapModel.setXCG01080(model.getXCG01080());
		soapModel.setXCG01081(model.getXCG01081());
		soapModel.setXCG01082(model.getXCG01082());
		soapModel.setXCG01083(model.getXCG01083());
		soapModel.setXCG01084(model.getXCG01084());
		soapModel.setXCG01085(model.getXCG01085());
		soapModel.setXCG01086(model.getXCG01086());
		soapModel.setXCG01087(model.getXCG01087());
		soapModel.setXCG01088(model.getXCG01088());
		soapModel.setXCG01089(model.getXCG01089());
		soapModel.setXCG01090(model.getXCG01090());
		soapModel.setXCG01091(model.getXCG01091());
		soapModel.setXCG01092(model.getXCG01092());
		soapModel.setXCG01093(model.getXCG01093());
		soapModel.setXCG01094(model.getXCG01094());
		soapModel.setXCG01095(model.getXCG01095());
		soapModel.setXCG01096(model.getXCG01096());
		soapModel.setXCG01097(model.getXCG01097());
		soapModel.setXCG01098(model.getXCG01098());
		soapModel.setXCG01099(model.getXCG01099());
		soapModel.setXCG01100(model.getXCG01100());
		soapModel.setXCG01101(model.getXCG01101());
		soapModel.setXCG01102(model.getXCG01102());
		soapModel.setXCG01103(model.getXCG01103());
		soapModel.setXCG01104(model.getXCG01104());
		soapModel.setXCG01105(model.getXCG01105());
		soapModel.setXCG01106(model.getXCG01106());
		soapModel.setXCG01107(model.getXCG01107());
		soapModel.setXCG01108(model.getXCG01108());
		soapModel.setXCG01109(model.getXCG01109());
		soapModel.setXCG01110(model.getXCG01110());
		soapModel.setXCG01111(model.getXCG01111());
		soapModel.setXCG01112(model.getXCG01112());
		soapModel.setXCG01113(model.getXCG01113());
		soapModel.setXCG01114(model.getXCG01114());
		soapModel.setXCG01115(model.getXCG01115());
		soapModel.setXCG01116(model.getXCG01116());
		soapModel.setXCG01117(model.getXCG01117());
		soapModel.setXCG01118(model.getXCG01118());
		soapModel.setXCG01119(model.getXCG01119());
		soapModel.setXCG01120(model.getXCG01120());
		soapModel.setXCG01121(model.getXCG01121());
		soapModel.setXCG01122(model.getXCG01122());
		soapModel.setXCG01123(model.getXCG01123());
		soapModel.setXCG01124(model.getXCG01124());
		soapModel.setXCG01125(model.getXCG01125());
		soapModel.setXCG01126(model.getXCG01126());
		soapModel.setXCG01127(model.getXCG01127());
		soapModel.setXCG01128(model.getXCG01128());
		soapModel.setXCG01129(model.getXCG01129());
		soapModel.setXCG01130(model.getXCG01130());
		soapModel.setXCG01131(model.getXCG01131());
		soapModel.setXCG01132(model.getXCG01132());
		soapModel.setXCG01133(model.getXCG01133());
		soapModel.setXCG01134(model.getXCG01134());
		soapModel.setXCG01135(model.getXCG01135());
		soapModel.setXCG01136(model.getXCG01136());
		soapModel.setXCG01137(model.getXCG01137());
		soapModel.setXCG01138(model.getXCG01138());
		soapModel.setXCG01139(model.getXCG01139());
		soapModel.setXCG01140(model.getXCG01140());
		soapModel.setXCG01141(model.getXCG01141());
		soapModel.setXCG01142(model.getXCG01142());
		soapModel.setXCG01143(model.getXCG01143());
		soapModel.setXCG01144(model.getXCG01144());
		soapModel.setXCG01145(model.getXCG01145());
		soapModel.setXCG01146(model.getXCG01146());
		soapModel.setXCG01147(model.getXCG01147());
		soapModel.setXCG01148(model.getXCG01148());
		soapModel.setXCG01149(model.getXCG01149());
		soapModel.setXCG01150(model.getXCG01150());
		soapModel.setXCG01151(model.getXCG01151());
		soapModel.setXCG01152(model.getXCG01152());
		soapModel.setXCG01153(model.getXCG01153());
		soapModel.setXCG01154(model.getXCG01154());
		soapModel.setXCG01155(model.getXCG01155());
		soapModel.setXCG01156(model.getXCG01156());
		soapModel.setXCG01157(model.getXCG01157());
		soapModel.setXCG01158(model.getXCG01158());
		soapModel.setXCG01159(model.getXCG01159());
		soapModel.setXCG01160(model.getXCG01160());
		soapModel.setXCG01161(model.getXCG01161());
		soapModel.setXCG01162(model.getXCG01162());
		soapModel.setXCG01163(model.getXCG01163());
		soapModel.setXCG01164(model.getXCG01164());
		soapModel.setXCG01165(model.getXCG01165());
		soapModel.setXCG01166(model.getXCG01166());
		soapModel.setXCG01167(model.getXCG01167());
		soapModel.setXCG01169(model.getXCG01169());
		soapModel.setXCG01170(model.getXCG01170());
		soapModel.setXCG01171(model.getXCG01171());
		soapModel.setXCG01172(model.getXCG01172());
		soapModel.setXCG01173(model.getXCG01173());
		soapModel.setXCG01174(model.getXCG01174());
		soapModel.setXCG01175(model.getXCG01175());
		soapModel.setXCG01176(model.getXCG01176());
		soapModel.setXCG01177(model.getXCG01177());
		soapModel.setXCG01178(model.getXCG01178());
		soapModel.setXCG01179(model.getXCG01179());
		soapModel.setXCG01180(model.getXCG01180());
		soapModel.setXCG01181(model.getXCG01181());
		soapModel.setXCG01182(model.getXCG01182());
		soapModel.setXCG01183(model.getXCG01183());
		soapModel.setXCG01184(model.getXCG01184());
		soapModel.setXCG01185(model.getXCG01185());
		soapModel.setXCG01186(model.getXCG01186());
		soapModel.setXCG01187(model.getXCG01187());
		soapModel.setXCG01188(model.getXCG01188());
		soapModel.setXCG01189(model.getXCG01189());
		soapModel.setXCG01190(model.getXCG01190());
		soapModel.setXCG01191(model.getXCG01191());
		soapModel.setXCG01192(model.getXCG01192());
		soapModel.setXCG01193(model.getXCG01193());
		soapModel.setXCG01194(model.getXCG01194());
		soapModel.setXCG01195(model.getXCG01195());
		soapModel.setXCG01196(model.getXCG01196());
		soapModel.setXCG01197(model.getXCG01197());
		soapModel.setXCG01198(model.getXCG01198());
		soapModel.setXCG01199(model.getXCG01199());
		soapModel.setXCG01200(model.getXCG01200());
		soapModel.setXCG01202(model.getXCG01202());
		soapModel.setXCG01203(model.getXCG01203());
		soapModel.setXCG01204(model.getXCG01204());
		soapModel.setXCG01205(model.getXCG01205());
		soapModel.setXCG01206(model.getXCG01206());
		soapModel.setXCG01207(model.getXCG01207());
		soapModel.setXCG01208(model.getXCG01208());
		soapModel.setXCG01209(model.getXCG01209());
		soapModel.setXCG01210(model.getXCG01210());
		soapModel.setXCG01212(model.getXCG01212());
		soapModel.setXCG01213(model.getXCG01213());
		soapModel.setXCG01214(model.getXCG01214());
		soapModel.setXCG01215(model.getXCG01215());
		soapModel.setXCG01216(model.getXCG01216());
		soapModel.setXCG01217(model.getXCG01217());
		soapModel.setXCG01218(model.getXCG01218());
		soapModel.setXCG01219(model.getXCG01219());
		soapModel.setXCG01220(model.getXCG01220());
		soapModel.setXCG01221(model.getXCG01221());
		soapModel.setXCG01222(model.getXCG01222());
		soapModel.setXCG01223(model.getXCG01223());
		soapModel.setXCG01224(model.getXCG01224());
		soapModel.setXCG01225(model.getXCG01225());
		soapModel.setXCG01226(model.getXCG01226());
		soapModel.setXCG01228(model.getXCG01228());
		soapModel.setXCG01230(model.getXCG01230());
		soapModel.setXCG01231(model.getXCG01231());
		soapModel.setXCG01232(model.getXCG01232());
		soapModel.setXCG01234(model.getXCG01234());
		soapModel.setXCG01236(model.getXCG01236());
		soapModel.setXCG01237(model.getXCG01237());
		soapModel.setXCG01229(model.getXCG01229());
		soapModel.setXCG01238(model.getXCG01238());
		soapModel.setXCG01239(model.getXCG01239());
		soapModel.setXCG01240(model.getXCG01240());
		soapModel.setXCG01241(model.getXCG01241());
		soapModel.setXCG01242(model.getXCG01242());
		soapModel.setXCG01243(model.getXCG01243());
		soapModel.setXCG01235(model.getXCG01235());
		soapModel.setXCG01244(model.getXCG01244());
		soapModel.setXCG01245(model.getXCG01245());
		soapModel.setXCG01246(model.getXCG01246());
		soapModel.setXCG01247(model.getXCG01247());
		soapModel.setXCG01248(model.getXCG01248());
		soapModel.setXCG01249(model.getXCG01249());
		soapModel.setXCG11248(model.getXCG11248());
		soapModel.setXCG11249(model.getXCG11249());
		soapModel.setXCG01250(model.getXCG01250());
		soapModel.setXCG01251(model.getXCG01251());
		soapModel.setXCG01252(model.getXCG01252());
		soapModel.setXCG01253(model.getXCG01253());
		soapModel.setXCG01255(model.getXCG01255());
		soapModel.setXCG01256(model.getXCG01256());
		soapModel.setXCG01257(model.getXCG01257());
		soapModel.setXCG01258(model.getXCG01258());
		soapModel.setXCG01259(model.getXCG01259());
		soapModel.setXCG01260(model.getXCG01260());
		soapModel.setXCG01261(model.getXCG01261());
		soapModel.setXCG01262(model.getXCG01262());
		soapModel.setXCG11253(model.getXCG11253());
		soapModel.setXCG01263(model.getXCG01263());
		soapModel.setXCG01264(model.getXCG01264());
		soapModel.setXCG01265(model.getXCG01265());
		soapModel.setXCG01266(model.getXCG01266());
		soapModel.setXCG01901(model.getXCG01901());
		soapModel.setXCG01267(model.getXCG01267());
		soapModel.setXCG01902(model.getXCG01902());
		soapModel.setXCG01268(model.getXCG01268());
		soapModel.setXCG01269(model.getXCG01269());
		soapModel.setXCG01903(model.getXCG01903());
		soapModel.setXCG01270(model.getXCG01270());
		soapModel.setXCG01271(model.getXCG01271());
		soapModel.setXCG01273(model.getXCG01273());
		soapModel.setXCG01274(model.getXCG01274());
		soapModel.setXCG01275(model.getXCG01275());
		soapModel.setXCG01276(model.getXCG01276());
		soapModel.setXCG01277(model.getXCG01277());
		soapModel.setXCG01278(model.getXCG01278());
		soapModel.setXCG01279(model.getXCG01279());
		soapModel.setXCG01280(model.getXCG01280());
		soapModel.setXCG01281(model.getXCG01281());
		soapModel.setXCG01282(model.getXCG01282());
		soapModel.setXCG01283(model.getXCG01283());
		soapModel.setXCG01284(model.getXCG01284());
		soapModel.setXCG01285(model.getXCG01285());
		soapModel.setXCG01286(model.getXCG01286());
		soapModel.setXCG01287(model.getXCG01287());
		soapModel.setXCG01288(model.getXCG01288());
		soapModel.setXCG01289(model.getXCG01289());
		soapModel.setXCG01290(model.getXCG01290());
		soapModel.setXCG01291(model.getXCG01291());
		soapModel.setXCG01292(model.getXCG01292());
		soapModel.setXCG01293(model.getXCG01293());
		soapModel.setXCG01294(model.getXCG01294());
		soapModel.setXCG01295(model.getXCG01295());
		soapModel.setXCG01296(model.getXCG01296());
		soapModel.setXCG01297(model.getXCG01297());
		soapModel.setXCG01298(model.getXCG01298());
		soapModel.setXCG01300(model.getXCG01300());
		soapModel.setXCG01301(model.getXCG01301());
		soapModel.setXCG01302(model.getXCG01302());
		soapModel.setXCG01303(model.getXCG01303());
		soapModel.setXCG01304(model.getXCG01304());
		soapModel.setXCG01305(model.getXCG01305());
		soapModel.setXCG01306(model.getXCG01306());
		soapModel.setXCG01307(model.getXCG01307());
		soapModel.setXCG01308(model.getXCG01308());
		soapModel.setXCG01310(model.getXCG01310());
		soapModel.setXCG01311(model.getXCG01311());
		soapModel.setXCG01312(model.getXCG01312());
		soapModel.setXCG01313(model.getXCG01313());
		soapModel.setXCG01314(model.getXCG01314());
		soapModel.setXCG01315(model.getXCG01315());
		soapModel.setXCG01316(model.getXCG01316());
		soapModel.setXCG01317(model.getXCG01317());
		soapModel.setXCG01318(model.getXCG01318());
		soapModel.setXCG01319(model.getXCG01319());
		soapModel.setXCG01320(model.getXCG01320());
		soapModel.setXCG01321(model.getXCG01321());
		soapModel.setXCG01322(model.getXCG01322());
		soapModel.setXCG01323(model.getXCG01323());
		soapModel.setXCG01324(model.getXCG01324());
		soapModel.setXCG01325(model.getXCG01325());
		soapModel.setXCG01326(model.getXCG01326());
		soapModel.setXCG01327(model.getXCG01327());
		soapModel.setXCG01328(model.getXCG01328());
		soapModel.setXCG01330(model.getXCG01330());
		soapModel.setXCG01331(model.getXCG01331());
		soapModel.setXCG01332(model.getXCG01332());
		soapModel.setXCG01333(model.getXCG01333());
		soapModel.setXCG01334(model.getXCG01334());
		soapModel.setXCG01335(model.getXCG01335());
		soapModel.setXCG01336(model.getXCG01336());
		soapModel.setXCG01337(model.getXCG01337());
		soapModel.setXCG01338(model.getXCG01338());
		soapModel.setXCG01339(model.getXCG01339());
		soapModel.setXCG01340(model.getXCG01340());
		soapModel.setXCG01341(model.getXCG01341());
		soapModel.setXCG01342(model.getXCG01342());
		soapModel.setXCG01343(model.getXCG01343());
		soapModel.setXCG01344(model.getXCG01344());
		soapModel.setXCG01345(model.getXCG01345());
		soapModel.setXCG01346(model.getXCG01346());
		soapModel.setXCG01347(model.getXCG01347());
		soapModel.setXCG01348(model.getXCG01348());
		soapModel.setXCG01349(model.getXCG01349());
		soapModel.setXCG01350(model.getXCG01350());
		soapModel.setXCG01351(model.getXCG01351());
		soapModel.setXCG01352(model.getXCG01352());
		soapModel.setXCG01353(model.getXCG01353());
		soapModel.setXCG01354(model.getXCG01354());
		soapModel.setXCG01355(model.getXCG01355());
		soapModel.setXCG01356(model.getXCG01356());
		soapModel.setXCG01357(model.getXCG01357());
		soapModel.setXCG01358(model.getXCG01358());
		soapModel.setXCG01359(model.getXCG01359());
		soapModel.setXCG01360(model.getXCG01360());
		soapModel.setXCG01361(model.getXCG01361());
		soapModel.setXCG01362(model.getXCG01362());
		soapModel.setXCG01363(model.getXCG01363());
		soapModel.setXCG01364(model.getXCG01364());
		soapModel.setXCG01365(model.getXCG01365());
		soapModel.setXCG01366(model.getXCG01366());
		soapModel.setXCG01367(model.getXCG01367());
		soapModel.setXCG01368(model.getXCG01368());
		soapModel.setXCG01369(model.getXCG01369());
		soapModel.setXCG01370(model.getXCG01370());
		soapModel.setXCG01371(model.getXCG01371());
		soapModel.setXCG01372(model.getXCG01372());
		soapModel.setXCG01373(model.getXCG01373());
		soapModel.setXCG01374(model.getXCG01374());
		soapModel.setXCG01375(model.getXCG01375());
		soapModel.setXCG01376(model.getXCG01376());
		soapModel.setXCG01377(model.getXCG01377());
		soapModel.setXCG01378(model.getXCG01378());
		soapModel.setXCG01379(model.getXCG01379());
		soapModel.setXCG01381(model.getXCG01381());
		soapModel.setXCG01382(model.getXCG01382());
		soapModel.setXCG01383(model.getXCG01383());
		soapModel.setXCG01384(model.getXCG01384());
		soapModel.setXCG01385(model.getXCG01385());
		soapModel.setXCG01386(model.getXCG01386());
		soapModel.setXCG01387(model.getXCG01387());
		soapModel.setXCG01388(model.getXCG01388());
		soapModel.setXCG01389(model.getXCG01389());
		soapModel.setXCG01390(model.getXCG01390());
		soapModel.setXCG01391(model.getXCG01391());
		soapModel.setXCG01392(model.getXCG01392());
		soapModel.setXCG01393(model.getXCG01393());
		soapModel.setXCG01394(model.getXCG01394());
		soapModel.setXCG01395(model.getXCG01395());
		soapModel.setXCG01396(model.getXCG01396());
		soapModel.setXCG01397(model.getXCG01397());
		soapModel.setXCG01398(model.getXCG01398());
		soapModel.setXCG01399(model.getXCG01399());
		soapModel.setXCG01400(model.getXCG01400());
		soapModel.setXCG01402(model.getXCG01402());
		soapModel.setXCG01403(model.getXCG01403());
		soapModel.setXCG01404(model.getXCG01404());
		soapModel.setXCG01405(model.getXCG01405());
		soapModel.setXCG01406(model.getXCG01406());
		soapModel.setXCG01407(model.getXCG01407());
		soapModel.setXCG01408(model.getXCG01408());
		soapModel.setXCG01409(model.getXCG01409());
		soapModel.setXCG01410(model.getXCG01410());
		soapModel.setXCG01411(model.getXCG01411());
		soapModel.setXCG01412(model.getXCG01412());
		soapModel.setXCG01413(model.getXCG01413());
		soapModel.setXCG01414(model.getXCG01414());
		soapModel.setXCG01415(model.getXCG01415());
		soapModel.setXCG01416(model.getXCG01416());
		soapModel.setXCG01417(model.getXCG01417());
		soapModel.setXCG01418(model.getXCG01418());
		soapModel.setXCG01419(model.getXCG01419());
		soapModel.setXCG01420(model.getXCG01420());
		soapModel.setXCG01421(model.getXCG01421());
		soapModel.setXCG01422(model.getXCG01422());
		soapModel.setXCG01423(model.getXCG01423());
		soapModel.setXCG01424(model.getXCG01424());
		soapModel.setXCG01425(model.getXCG01425());
		soapModel.setXCG01426(model.getXCG01426());
		soapModel.setXCG01427(model.getXCG01427());
		soapModel.setXCG01428(model.getXCG01428());
		soapModel.setXCG01437(model.getXCG01437());
		soapModel.setXCG01429(model.getXCG01429());
		soapModel.setXCG01430(model.getXCG01430());
		soapModel.setXCG01431(model.getXCG01431());
		soapModel.setXCG01432(model.getXCG01432());
		soapModel.setXCG01433(model.getXCG01433());
		soapModel.setXCG01434(model.getXCG01434());
		soapModel.setXCG01435(model.getXCG01435());
		soapModel.setXCG01436(model.getXCG01436());
		soapModel.setXCG01439(model.getXCG01439());
		soapModel.setXCG01440(model.getXCG01440());
		soapModel.setXCG01441(model.getXCG01441());
		soapModel.setXCG01442(model.getXCG01442());
		soapModel.setXCG01443(model.getXCG01443());
		soapModel.setXCG01445(model.getXCG01445());
		soapModel.setXCG01446(model.getXCG01446());
		soapModel.setXCG01447(model.getXCG01447());
		soapModel.setXCG01448(model.getXCG01448());
		soapModel.setXCG01449(model.getXCG01449());
		soapModel.setXCG01450(model.getXCG01450());
		soapModel.setXCG01451(model.getXCG01451());
		soapModel.setXCG01452(model.getXCG01452());
		soapModel.setXCG01453(model.getXCG01453());
		soapModel.setXCG01454(model.getXCG01454());
		soapModel.setXCG01455(model.getXCG01455());
		soapModel.setXCG01456(model.getXCG01456());
		soapModel.setXCG01457(model.getXCG01457());
		soapModel.setXCG01458(model.getXCG01458());
		soapModel.setXCG01459(model.getXCG01459());
		soapModel.setXCG01460(model.getXCG01460());
		soapModel.setXCG01461(model.getXCG01461());
		soapModel.setXCG01462(model.getXCG01462());
		soapModel.setXCG01463(model.getXCG01463());
		soapModel.setXCG01464(model.getXCG01464());
		soapModel.setXCG01465(model.getXCG01465());
		soapModel.setXCG01466(model.getXCG01466());
		soapModel.setXCG01467(model.getXCG01467());
		soapModel.setXCG01468(model.getXCG01468());
		soapModel.setXCG01469(model.getXCG01469());
		soapModel.setXCG01470(model.getXCG01470());
		soapModel.setXCG01471(model.getXCG01471());
		soapModel.setXCG01472(model.getXCG01472());
		soapModel.setXCG01473(model.getXCG01473());
		soapModel.setXCG01474(model.getXCG01474());
		soapModel.setXCG01475(model.getXCG01475());
		soapModel.setXCG01476(model.getXCG01476());
		soapModel.setXCG01477(model.getXCG01477());
		soapModel.setXCG01478(model.getXCG01478());
		soapModel.setXCG01479(model.getXCG01479());
		soapModel.setXCG01480(model.getXCG01480());
		soapModel.setXCG01481(model.getXCG01481());
		soapModel.setXCG01482(model.getXCG01482());
		soapModel.setXCG01483(model.getXCG01483());
		soapModel.setXCG01484(model.getXCG01484());
		soapModel.setXCG01485(model.getXCG01485());
		soapModel.setXCG01486(model.getXCG01486());
		soapModel.setXCG01487(model.getXCG01487());
		soapModel.setXCG01488(model.getXCG01488());
		soapModel.setXCG01489(model.getXCG01489());
		soapModel.setXCG01490(model.getXCG01490());
		soapModel.setXCG01491(model.getXCG01491());
		soapModel.setXCG01492(model.getXCG01492());
		soapModel.setXCG01493(model.getXCG01493());
		soapModel.setXCG01494(model.getXCG01494());
		soapModel.setXCG01496(model.getXCG01496());
		soapModel.setXCG01497(model.getXCG01497());
		soapModel.setXCG01498(model.getXCG01498());
		soapModel.setXCG01499(model.getXCG01499());
		soapModel.setXCG01500(model.getXCG01500());
		soapModel.setXCG01501(model.getXCG01501());
		soapModel.setXCG01502(model.getXCG01502());
		soapModel.setXCG01503(model.getXCG01503());
		soapModel.setXCG01504(model.getXCG01504());
		soapModel.setXCG01505(model.getXCG01505());
		soapModel.setXCG01506(model.getXCG01506());
		soapModel.setXCG01507(model.getXCG01507());
		soapModel.setXCG01508(model.getXCG01508());
		soapModel.setXCG01509(model.getXCG01509());
		soapModel.setXCG01510(model.getXCG01510());
		soapModel.setXCG01512(model.getXCG01512());
		soapModel.setXCG01513(model.getXCG01513());
		soapModel.setXCG01514(model.getXCG01514());
		soapModel.setXCG01515(model.getXCG01515());
		soapModel.setXCG01516(model.getXCG01516());
		soapModel.setXCG01517(model.getXCG01517());
		soapModel.setXCG01518(model.getXCG01518());
		soapModel.setXCG01519(model.getXCG01519());
		soapModel.setXCG01520(model.getXCG01520());
		soapModel.setXCG01521(model.getXCG01521());
		soapModel.setXCG01522(model.getXCG01522());
		soapModel.setXCG01523(model.getXCG01523());
		soapModel.setXCG01524(model.getXCG01524());
		soapModel.setXCG01525(model.getXCG01525());
		soapModel.setXCG01526(model.getXCG01526());
		soapModel.setXCG01527(model.getXCG01527());
		soapModel.setXCG01528(model.getXCG01528());
		soapModel.setXCG01529(model.getXCG01529());
		soapModel.setXCG01530(model.getXCG01530());
		soapModel.setXCG01531(model.getXCG01531());
		soapModel.setXCG01904(model.getXCG01904());
		soapModel.setXCG01533(model.getXCG01533());
		soapModel.setXCG01905(model.getXCG01905());
		soapModel.setXCG01534(model.getXCG01534());
		soapModel.setXCG01906(model.getXCG01906());
		soapModel.setXCG01535(model.getXCG01535());
		soapModel.setXCG01907(model.getXCG01907());
		soapModel.setXCG01536(model.getXCG01536());
		soapModel.setXCG01908(model.getXCG01908());
		soapModel.setXCG01537(model.getXCG01537());
		soapModel.setXCG01909(model.getXCG01909());
		soapModel.setXCG01538(model.getXCG01538());
		soapModel.setXCG01910(model.getXCG01910());
		soapModel.setXCG01539(model.getXCG01539());
		soapModel.setXCG11535(model.getXCG11535());
		soapModel.setXCG01541(model.getXCG01541());
		soapModel.setXCG01542(model.getXCG01542());
		soapModel.setXCG01911(model.getXCG01911());
		soapModel.setXCG01543(model.getXCG01543());
		soapModel.setXCG01912(model.getXCG01912());
		soapModel.setXCG01544(model.getXCG01544());
		soapModel.setXCG01545(model.getXCG01545());
		soapModel.setXCG01546(model.getXCG01546());
		soapModel.setXCG01547(model.getXCG01547());
		soapModel.setXCG01548(model.getXCG01548());
		soapModel.setXCG01913(model.getXCG01913());
		soapModel.setXCG01549(model.getXCG01549());
		soapModel.setXCG01914(model.getXCG01914());
		soapModel.setXCG01550(model.getXCG01550());
		soapModel.setXCG01551(model.getXCG01551());
		soapModel.setXCG01552(model.getXCG01552());
		soapModel.setXCG01553(model.getXCG01553());
		soapModel.setXCG01554(model.getXCG01554());
		soapModel.setXCG01915(model.getXCG01915());
		soapModel.setXCG01555(model.getXCG01555());
		soapModel.setXCG01556(model.getXCG01556());
		soapModel.setXCG01557(model.getXCG01557());
		soapModel.setXCG01558(model.getXCG01558());
		soapModel.setXCG01559(model.getXCG01559());
		soapModel.setXCG01560(model.getXCG01560());
		soapModel.setXCG01561(model.getXCG01561());
		soapModel.setXCG01916(model.getXCG01916());
		soapModel.setXCG01562(model.getXCG01562());
		soapModel.setXCG01917(model.getXCG01917());
		soapModel.setXCG01563(model.getXCG01563());
		soapModel.setXCG01918(model.getXCG01918());
		soapModel.setXCG01564(model.getXCG01564());
		soapModel.setXCG01565(model.getXCG01565());
		soapModel.setXCG01566(model.getXCG01566());
		soapModel.setXCG01567(model.getXCG01567());
		soapModel.setXCG01568(model.getXCG01568());
		soapModel.setXCG01919(model.getXCG01919());
		soapModel.setXCG01569(model.getXCG01569());
		soapModel.setXCG01570(model.getXCG01570());
		soapModel.setXCG01571(model.getXCG01571());
		soapModel.setXCG01572(model.getXCG01572());
		soapModel.setXCG01920(model.getXCG01920());
		soapModel.setXCG01573(model.getXCG01573());
		soapModel.setXCG01921(model.getXCG01921());
		soapModel.setXCG01574(model.getXCG01574());
		soapModel.setXCG01922(model.getXCG01922());
		soapModel.setXCG01575(model.getXCG01575());
		soapModel.setXCG01576(model.getXCG01576());
		soapModel.setXCG01577(model.getXCG01577());
		soapModel.setXCG01578(model.getXCG01578());
		soapModel.setXCG01579(model.getXCG01579());
		soapModel.setXCG01580(model.getXCG01580());
		soapModel.setXCG01581(model.getXCG01581());
		soapModel.setXCG01582(model.getXCG01582());
		soapModel.setXCG01583(model.getXCG01583());
		soapModel.setXCG01584(model.getXCG01584());
		soapModel.setXCG01585(model.getXCG01585());
		soapModel.setXCG01586(model.getXCG01586());
		soapModel.setXCG01587(model.getXCG01587());
		soapModel.setXCG01588(model.getXCG01588());
		soapModel.setXCG01589(model.getXCG01589());
		soapModel.setXCG01590(model.getXCG01590());
		soapModel.setXCG01591(model.getXCG01591());
		soapModel.setXCG01592(model.getXCG01592());
		soapModel.setXCG01593(model.getXCG01593());
		soapModel.setXCG01594(model.getXCG01594());
		soapModel.setXCG01595(model.getXCG01595());
		soapModel.setXCG01596(model.getXCG01596());
		soapModel.setXCG01597(model.getXCG01597());
		soapModel.setXCG01598(model.getXCG01598());
		soapModel.setXCG01599(model.getXCG01599());
		soapModel.setXCG01600(model.getXCG01600());
		soapModel.setXCG01601(model.getXCG01601());
		soapModel.setXCG01602(model.getXCG01602());
		soapModel.setXCG01603(model.getXCG01603());
		soapModel.setXCG01923(model.getXCG01923());
		soapModel.setXCG01604(model.getXCG01604());
		soapModel.setXCG01924(model.getXCG01924());
		soapModel.setXCG01605(model.getXCG01605());
		soapModel.setXCG01606(model.getXCG01606());
		soapModel.setXCG01607(model.getXCG01607());
		soapModel.setXCG01608(model.getXCG01608());
		soapModel.setXCG01609(model.getXCG01609());
		soapModel.setXCG01925(model.getXCG01925());
		soapModel.setXCG01610(model.getXCG01610());
		soapModel.setXCG01926(model.getXCG01926());
		soapModel.setXCG01611(model.getXCG01611());
		soapModel.setXCG01612(model.getXCG01612());
		soapModel.setXCG01928(model.getXCG01928());
		soapModel.setXCG01613(model.getXCG01613());
		soapModel.setXCG01929(model.getXCG01929());
		soapModel.setXCG01614(model.getXCG01614());
		soapModel.setXCG01930(model.getXCG01930());
		soapModel.setXCG01615(model.getXCG01615());
		soapModel.setXCG01931(model.getXCG01931());
		soapModel.setXCG01616(model.getXCG01616());
		soapModel.setXCG01932(model.getXCG01932());
		soapModel.setXCG01617(model.getXCG01617());
		soapModel.setXCG01933(model.getXCG01933());
		soapModel.setXCG01618(model.getXCG01618());
		soapModel.setXCG01934(model.getXCG01934());
		soapModel.setXCG01619(model.getXCG01619());
		soapModel.setXCG01935(model.getXCG01935());
		soapModel.setXCG01620(model.getXCG01620());
		soapModel.setXCG01936(model.getXCG01936());
		soapModel.setXCG01621(model.getXCG01621());
		soapModel.setXCG01937(model.getXCG01937());
		soapModel.setXCG01622(model.getXCG01622());
		soapModel.setXCG01938(model.getXCG01938());
		soapModel.setXCG01623(model.getXCG01623());
		soapModel.setXCG01939(model.getXCG01939());
		soapModel.setXCG01624(model.getXCG01624());
		soapModel.setXCG01940(model.getXCG01940());
		soapModel.setXCG01625(model.getXCG01625());
		soapModel.setXCG01941(model.getXCG01941());
		soapModel.setXCG01626(model.getXCG01626());
		soapModel.setXCG01942(model.getXCG01942());
		soapModel.setXCG01627(model.getXCG01627());
		soapModel.setXCG01943(model.getXCG01943());
		soapModel.setXCG01628(model.getXCG01628());
		soapModel.setXCG01944(model.getXCG01944());
		soapModel.setXCG01630(model.getXCG01630());
		soapModel.setXCG01631(model.getXCG01631());
		soapModel.setXCG01632(model.getXCG01632());
		soapModel.setXCG01633(model.getXCG01633());
		soapModel.setXCG01634(model.getXCG01634());
		soapModel.setXCG01635(model.getXCG01635());
		soapModel.setXCG01636(model.getXCG01636());
		soapModel.setXCG01637(model.getXCG01637());
		soapModel.setXCG01638(model.getXCG01638());
		soapModel.setXCG01639(model.getXCG01639());
		soapModel.setXCG01640(model.getXCG01640());
		soapModel.setXCG01641(model.getXCG01641());
		soapModel.setXCG01642(model.getXCG01642());
		soapModel.setXCG01643(model.getXCG01643());
		soapModel.setXCG01644(model.getXCG01644());
		soapModel.setXCG01645(model.getXCG01645());
		soapModel.setXCG01646(model.getXCG01646());
		soapModel.setXCG01647(model.getXCG01647());
		soapModel.setXCG01648(model.getXCG01648());
		soapModel.setXCG01649(model.getXCG01649());
		soapModel.setXCG01650(model.getXCG01650());
		soapModel.setXCG01651(model.getXCG01651());
		soapModel.setXCG01652(model.getXCG01652());
		soapModel.setXCG01653(model.getXCG01653());
		soapModel.setXCG01654(model.getXCG01654());
		soapModel.setXCG01655(model.getXCG01655());
		soapModel.setXCG01656(model.getXCG01656());
		soapModel.setXCG01657(model.getXCG01657());
		soapModel.setXCG01658(model.getXCG01658());
		soapModel.setXCG01659(model.getXCG01659());
		soapModel.setXCG01660(model.getXCG01660());
		soapModel.setXCG01661(model.getXCG01661());
		soapModel.setXCG01662(model.getXCG01662());
		soapModel.setXCG01663(model.getXCG01663());
		soapModel.setXCG01664(model.getXCG01664());
		soapModel.setXCG01665(model.getXCG01665());
		soapModel.setXCG01666(model.getXCG01666());
		soapModel.setXCG01667(model.getXCG01667());
		soapModel.setXCG01668(model.getXCG01668());
		soapModel.setXCG01669(model.getXCG01669());
		soapModel.setXCG01670(model.getXCG01670());
		soapModel.setXCG01671(model.getXCG01671());
		soapModel.setXCG01672(model.getXCG01672());
		soapModel.setXCG01673(model.getXCG01673());
		soapModel.setXCG01674(model.getXCG01674());
		soapModel.setXCG01675(model.getXCG01675());
		soapModel.setXCG01676(model.getXCG01676());
		soapModel.setXCG01677(model.getXCG01677());
		soapModel.setXCG01678(model.getXCG01678());
		soapModel.setXCG01679(model.getXCG01679());
		soapModel.setXCG01680(model.getXCG01680());
		soapModel.setXCG01681(model.getXCG01681());
		soapModel.setXCG01682(model.getXCG01682());
		soapModel.setXCG01683(model.getXCG01683());
		soapModel.setXCG01684(model.getXCG01684());
		soapModel.setXCG01685(model.getXCG01685());
		soapModel.setXCG01686(model.getXCG01686());
		soapModel.setXCG01687(model.getXCG01687());
		soapModel.setXCG01688(model.getXCG01688());
		soapModel.setXCG01689(model.getXCG01689());
		soapModel.setXCG01690(model.getXCG01690());
		soapModel.setXCG01691(model.getXCG01691());
		soapModel.setXCG01692(model.getXCG01692());
		soapModel.setXCG01693(model.getXCG01693());
		soapModel.setXCG01694(model.getXCG01694());
		soapModel.setXCG01695(model.getXCG01695());
		soapModel.setXCG01696(model.getXCG01696());
		soapModel.setXCG01697(model.getXCG01697());
		soapModel.setXCG01698(model.getXCG01698());
		soapModel.setXCG01699(model.getXCG01699());
		soapModel.setXCG01700(model.getXCG01700());
		soapModel.setXCG01701(model.getXCG01701());
		soapModel.setXCG01702(model.getXCG01702());
		soapModel.setXCG01703(model.getXCG01703());
		soapModel.setXCG01704(model.getXCG01704());
		soapModel.setXCG01705(model.getXCG01705());
		soapModel.setXCG01706(model.getXCG01706());
		soapModel.setXCG01707(model.getXCG01707());
		soapModel.setXCG01708(model.getXCG01708());
		soapModel.setXCG01709(model.getXCG01709());
		soapModel.setXCG01710(model.getXCG01710());
		soapModel.setXCG01711(model.getXCG01711());
		soapModel.setXCG01712(model.getXCG01712());
		soapModel.setXCG01713(model.getXCG01713());
		soapModel.setXCG01714(model.getXCG01714());
		soapModel.setXCG01715(model.getXCG01715());
		soapModel.setXCG01716(model.getXCG01716());
		soapModel.setXCG01717(model.getXCG01717());
		soapModel.setXCG01718(model.getXCG01718());
		soapModel.setXCG01719(model.getXCG01719());
		soapModel.setXCG01720(model.getXCG01720());
		soapModel.setXCG01721(model.getXCG01721());
		soapModel.setXCG01722(model.getXCG01722());
		soapModel.setXCG01723(model.getXCG01723());
		soapModel.setXCG01724(model.getXCG01724());
		soapModel.setXCG01725(model.getXCG01725());
		soapModel.setXCG01726(model.getXCG01726());
		soapModel.setXCG01727(model.getXCG01727());
		soapModel.setXCG01728(model.getXCG01728());
		soapModel.setXCG01729(model.getXCG01729());
		soapModel.setXCG01730(model.getXCG01730());
		soapModel.setXCG01731(model.getXCG01731());
		soapModel.setXCG01732(model.getXCG01732());
		soapModel.setXCG01733(model.getXCG01733());
		soapModel.setXCG01734(model.getXCG01734());
		soapModel.setXCG01735(model.getXCG01735());
		soapModel.setXCG01736(model.getXCG01736());
		soapModel.setXCG01737(model.getXCG01737());
		soapModel.setXCG01738(model.getXCG01738());
		soapModel.setXCG01739(model.getXCG01739());
		soapModel.setXCG01740(model.getXCG01740());
		soapModel.setXCG01741(model.getXCG01741());
		soapModel.setXCG01742(model.getXCG01742());
		soapModel.setXCG01744(model.getXCG01744());
		soapModel.setXCG01745(model.getXCG01745());
		soapModel.setXCG01746(model.getXCG01746());
		soapModel.setXCG01747(model.getXCG01747());
		soapModel.setXCG01748(model.getXCG01748());
		soapModel.setXCG01749(model.getXCG01749());
		soapModel.setXCG01945(model.getXCG01945());
		soapModel.setXCG01750(model.getXCG01750());
		soapModel.setXCG01946(model.getXCG01946());
		soapModel.setXCG01751(model.getXCG01751());
		soapModel.setXCG01752(model.getXCG01752());
		soapModel.setXCG01753(model.getXCG01753());
		soapModel.setXCG01754(model.getXCG01754());
		soapModel.setXCG01756(model.getXCG01756());
		soapModel.setXCG01757(model.getXCG01757());
		soapModel.setXCG01758(model.getXCG01758());
		soapModel.setXCG01759(model.getXCG01759());
		soapModel.setXCG01948(model.getXCG01948());
		soapModel.setXCG01760(model.getXCG01760());
		soapModel.setXCG01949(model.getXCG01949());
		soapModel.setXCG01761(model.getXCG01761());
		soapModel.setXCG01950(model.getXCG01950());
		soapModel.setXCG01762(model.getXCG01762());
		soapModel.setXCG01951(model.getXCG01951());
		soapModel.setXCG01763(model.getXCG01763());
		soapModel.setXCG01952(model.getXCG01952());
		soapModel.setXCG01764(model.getXCG01764());
		soapModel.setXCG01953(model.getXCG01953());
		soapModel.setXCG01765(model.getXCG01765());
		soapModel.setXCG01954(model.getXCG01954());
		soapModel.setXCG01766(model.getXCG01766());
		soapModel.setXCG01955(model.getXCG01955());
		soapModel.setXCG01767(model.getXCG01767());
		soapModel.setXCG01956(model.getXCG01956());
		soapModel.setXCG01768(model.getXCG01768());
		soapModel.setXCG01957(model.getXCG01957());
		soapModel.setXCG01769(model.getXCG01769());
		soapModel.setXCG01958(model.getXCG01958());
		soapModel.setXCG01770(model.getXCG01770());
		soapModel.setXCG01771(model.getXCG01771());
		soapModel.setXCG01959(model.getXCG01959());
		soapModel.setXCG01772(model.getXCG01772());
		soapModel.setXCG01773(model.getXCG01773());
		soapModel.setXCG01774(model.getXCG01774());
		soapModel.setXCG01775(model.getXCG01775());
		soapModel.setXCG01776(model.getXCG01776());
		soapModel.setXCG01777(model.getXCG01777());
		soapModel.setXCG01778(model.getXCG01778());
		soapModel.setXCG01779(model.getXCG01779());
		soapModel.setXCG01780(model.getXCG01780());
		soapModel.setXCG01781(model.getXCG01781());
		soapModel.setXCG01783(model.getXCG01783());
		soapModel.setXCG01785(model.getXCG01785());
		soapModel.setXCG01786(model.getXCG01786());
		soapModel.setXCG01787(model.getXCG01787());
		soapModel.setXCG01788(model.getXCG01788());
		soapModel.setXCG01789(model.getXCG01789());
		soapModel.setXCG01790(model.getXCG01790());
		soapModel.setXCG01791(model.getXCG01791());
		soapModel.setXCG01792(model.getXCG01792());
		soapModel.setXCG01793(model.getXCG01793());
		soapModel.setXCG01794(model.getXCG01794());
		soapModel.setXCG01795(model.getXCG01795());
		soapModel.setXCG01796(model.getXCG01796());
		soapModel.setXCG01797(model.getXCG01797());
		soapModel.setXCG01798(model.getXCG01798());
		soapModel.setXCG01799(model.getXCG01799());
		soapModel.setXCG01801(model.getXCG01801());
		soapModel.setXCG01802(model.getXCG01802());
		soapModel.setXCG01803(model.getXCG01803());
		soapModel.setXCG01804(model.getXCG01804());
		soapModel.setXCG01805(model.getXCG01805());
		soapModel.setXCG01806(model.getXCG01806());
		soapModel.setXCG01807(model.getXCG01807());
		soapModel.setXCG01808(model.getXCG01808());
		soapModel.setXCG01809(model.getXCG01809());
		soapModel.setXCG01810(model.getXCG01810());
		soapModel.setXCG01811(model.getXCG01811());
		soapModel.setXCG01812(model.getXCG01812());
		soapModel.setXCG01813(model.getXCG01813());
		soapModel.setXCG01814(model.getXCG01814());
		soapModel.setTDTKXCG001(model.getTDTKXCG001());
		soapModel.setTDTKXCG002(model.getTDTKXCG002());
		soapModel.setTDTKXCG003(model.getTDTKXCG003());
		soapModel.setTDTKXCG004(model.getTDTKXCG004());
		soapModel.setTDTKXCG005(model.getTDTKXCG005());
		soapModel.setTDTKXCG006(model.getTDTKXCG006());
		soapModel.setTDTKXCG007(model.getTDTKXCG007());
		soapModel.setTDTKXCG008(model.getTDTKXCG008());
		soapModel.setTDTKXCG009(model.getTDTKXCG009());
		soapModel.setTDTKXCG010(model.getTDTKXCG010());
		soapModel.setTDTKXCG011(model.getTDTKXCG011());
		soapModel.setTDTKXCG012(model.getTDTKXCG012());
		soapModel.setTDTKXCG013(model.getTDTKXCG013());
		soapModel.setTDTKXCG014(model.getTDTKXCG014());
		soapModel.setTDTKXCG015(model.getTDTKXCG015());
		soapModel.setTDTKXCG016(model.getTDTKXCG016());
		soapModel.setTDTKXCG017(model.getTDTKXCG017());
		soapModel.setTDTKXCG018(model.getTDTKXCG018());
		soapModel.setTDTKXCG019(model.getTDTKXCG019());
		soapModel.setTDTKXCG020(model.getTDTKXCG020());
		soapModel.setTDTKXCG021(model.getTDTKXCG021());
		soapModel.setTDTKXCG022(model.getTDTKXCG022());
		soapModel.setTDTKXCG023(model.getTDTKXCG023());
		soapModel.setTDTKXCG024(model.getTDTKXCG024());
		soapModel.setTDTKXCG025(model.getTDTKXCG025());
		soapModel.setTDTKXCG026(model.getTDTKXCG026());
		soapModel.setTDTKXCG027(model.getTDTKXCG027());
		soapModel.setTDTKXCG028(model.getTDTKXCG028());
		soapModel.setTDTKXCG029(model.getTDTKXCG029());
		soapModel.setTDTKXCG030(model.getTDTKXCG030());
		soapModel.setTDTKXCG031(model.getTDTKXCG031());
		soapModel.setTDTKXCG032(model.getTDTKXCG032());
		soapModel.setTDTKXCG033(model.getTDTKXCG033());
		soapModel.setTDTKXCG034(model.getTDTKXCG034());
		soapModel.setTDTKXCG035(model.getTDTKXCG035());
		soapModel.setTDTKXCG036(model.getTDTKXCG036());
		soapModel.setBBCNCLKLXCG01(model.getBBCNCLKLXCG01());
		soapModel.setBBCNCLKLXCG02(model.getBBCNCLKLXCG02());
		soapModel.setBBCNCLKLXCG03(model.getBBCNCLKLXCG03());
		soapModel.setBBCNCLKLXCG04(model.getBBCNCLKLXCG04());
		soapModel.setBBCNCLKLXCG05(model.getBBCNCLKLXCG05());
		soapModel.setBBCNCLKLXCG06(model.getBBCNCLKLXCG06());
		soapModel.setBBCNCLKLXCG07(model.getBBCNCLKLXCG07());
		soapModel.setBBCNCLKLXCG08(model.getBBCNCLKLXCG08());
		soapModel.setBBCNCLKLXCG09(model.getBBCNCLKLXCG09());
		soapModel.setBBCNCLKLXCG10(model.getBBCNCLKLXCG10());
		soapModel.setBBCNCLKLXCG11(model.getBBCNCLKLXCG11());
		soapModel.setBBCNCLKLXCG12(model.getBBCNCLKLXCG12());
		soapModel.setBBCNCLKLXCG13(model.getBBCNCLKLXCG13());
		soapModel.setBBCNCLKLXCG14(model.getBBCNCLKLXCG14());
		soapModel.setBBCNCLKLXCG15(model.getBBCNCLKLXCG15());
		soapModel.setBBCNCLKLXCG16(model.getBBCNCLKLXCG16());
		soapModel.setBBCNCLKLXCG17(model.getBBCNCLKLXCG17());
		soapModel.setBBCNCLKLXCG18(model.getBBCNCLKLXCG18());
		soapModel.setBBCNCLKLXCG19(model.getBBCNCLKLXCG19());
		soapModel.setBBCNCLKLXCG20(model.getBBCNCLKLXCG20());
		soapModel.setBBCNCLKLXCG21(model.getBBCNCLKLXCG21());
		soapModel.setBBCNCLKLXCG22(model.getBBCNCLKLXCG22());
		soapModel.setBBCNCLKLXCG23(model.getBBCNCLKLXCG23());
		soapModel.setBBCNCLKLXCG24(model.getBBCNCLKLXCG24());
		soapModel.setBBCNCLKLXCG26(model.getBBCNCLKLXCG26());
		soapModel.setBBCNCLKLXCG27(model.getBBCNCLKLXCG27());
		soapModel.setBBCNCLKLXCG28(model.getBBCNCLKLXCG28());
		soapModel.setBBCNCLKLXCG29(model.getBBCNCLKLXCG29());
		soapModel.setBBCNCLKLXCG30(model.getBBCNCLKLXCG30());
		soapModel.setBBCNCLKLXCG31(model.getBBCNCLKLXCG31());
		soapModel.setBBCNCLKLXCG33(model.getBBCNCLKLXCG33());
		soapModel.setBBCNCLKLXCG34(model.getBBCNCLKLXCG34());
		soapModel.setBBCNCLKLXCG35(model.getBBCNCLKLXCG35());
		soapModel.setBBCNCLKLXCG36(model.getBBCNCLKLXCG36());
		soapModel.setBBCNCLKLXCG38(model.getBBCNCLKLXCG38());
		soapModel.setBBCNCLKLXCG39(model.getBBCNCLKLXCG39());
		soapModel.setBBCNCLKLXCG40(model.getBBCNCLKLXCG40());
		soapModel.setBBCNCLKLXCG42(model.getBBCNCLKLXCG42());
		soapModel.setBBCNCLKLXCG43(model.getBBCNCLKLXCG43());
		soapModel.setBBCNCLKLXCG44(model.getBBCNCLKLXCG44());
		soapModel.setBBCNCLKLXCG45(model.getBBCNCLKLXCG45());
		soapModel.setBBCNCLKLXCG46(model.getBBCNCLKLXCG46());
		soapModel.setBBCNCLKLXCG47(model.getBBCNCLKLXCG47());
		soapModel.setBBCNCLKLXCG48(model.getBBCNCLKLXCG48());
		soapModel.setBBCNCLKLXCG49(model.getBBCNCLKLXCG49());
		soapModel.setBBCNCLKLXCG50(model.getBBCNCLKLXCG50());
		soapModel.setBBCNCLKLXCG51(model.getBBCNCLKLXCG51());
		soapModel.setBBCNCLKLXCG52(model.getBBCNCLKLXCG52());
		soapModel.setBBCNCLKLXCG53(model.getBBCNCLKLXCG53());
		soapModel.setBBCNCLKLXCG54(model.getBBCNCLKLXCG54());
		soapModel.setBBKTSPMXCG001(model.getBBKTSPMXCG001());
		soapModel.setBBKTSPMXCG002(model.getBBKTSPMXCG002());
		soapModel.setBBKTSPMXCG003(model.getBBKTSPMXCG003());
		soapModel.setBBKTSPMXCG004(model.getBBKTSPMXCG004());
		soapModel.setBBKTSPMXCG005(model.getBBKTSPMXCG005());
		soapModel.setBBKTSPMXCG006(model.getBBKTSPMXCG006());
		soapModel.setBBKTSPMXCG007(model.getBBKTSPMXCG007());
		soapModel.setBBKTSPMXCG008(model.getBBKTSPMXCG008());
		soapModel.setBBKTSPMXCG009(model.getBBKTSPMXCG009());
		soapModel.setBBKTSPMXCG010(model.getBBKTSPMXCG010());
		soapModel.setBBKTSPMXCG011(model.getBBKTSPMXCG011());
		soapModel.setBBKTSPMXCG012(model.getBBKTSPMXCG012());
		soapModel.setBBKTSPMXCG013(model.getBBKTSPMXCG013());
		soapModel.setBBKTSPMXCG014(model.getBBKTSPMXCG014());
		soapModel.setBBKTSPMXCG015(model.getBBKTSPMXCG015());
		soapModel.setBBKTSPMXCG016(model.getBBKTSPMXCG016());
		soapModel.setBBKTSPMXCG017(model.getBBKTSPMXCG017());
		soapModel.setBBKTSPMXCG018(model.getBBKTSPMXCG018());
		soapModel.setBBKTSPMXCG019(model.getBBKTSPMXCG019());
		soapModel.setBBKTSPMXCG020(model.getBBKTSPMXCG020());
		soapModel.setBBKTSPMXCG021(model.getBBKTSPMXCG021());
		soapModel.setBBKTSPMXCG022(model.getBBKTSPMXCG022());
		soapModel.setBBKTSPMXCG023(model.getBBKTSPMXCG023());
		soapModel.setBBKTSPMXCG024(model.getBBKTSPMXCG024());
		soapModel.setBBKTSPMXCG025(model.getBBKTSPMXCG025());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());

		return soapModel;
	}

	public static VRTechnicalSpec_XCGSoap[] toSoapModels(
		VRTechnicalSpec_XCG[] models) {
		VRTechnicalSpec_XCGSoap[] soapModels = new VRTechnicalSpec_XCGSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRTechnicalSpec_XCGSoap[][] toSoapModels(
		VRTechnicalSpec_XCG[][] models) {
		VRTechnicalSpec_XCGSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRTechnicalSpec_XCGSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRTechnicalSpec_XCGSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRTechnicalSpec_XCGSoap[] toSoapModels(
		List<VRTechnicalSpec_XCG> models) {
		List<VRTechnicalSpec_XCGSoap> soapModels = new ArrayList<VRTechnicalSpec_XCGSoap>(models.size());

		for (VRTechnicalSpec_XCG model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRTechnicalSpec_XCGSoap[soapModels.size()]);
	}

	public VRTechnicalSpec_XCGSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getMtCore() {
		return _mtCore;
	}

	public void setMtCore(long mtCore) {
		_mtCore = mtCore;
	}

	public long getConvertAssembleId() {
		return _convertAssembleId;
	}

	public void setConvertAssembleId(long convertAssembleId) {
		_convertAssembleId = convertAssembleId;
	}

	public long getDossierId() {
		return _dossierId;
	}

	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	public String getDossierNo() {
		return _dossierNo;
	}

	public void setDossierNo(String dossierNo) {
		_dossierNo = dossierNo;
	}

	public String getReferenceUid() {
		return _referenceUid;
	}

	public void setReferenceUid(String referenceUid) {
		_referenceUid = referenceUid;
	}

	public String getDossierIdCTN() {
		return _dossierIdCTN;
	}

	public void setDossierIdCTN(String dossierIdCTN) {
		_dossierIdCTN = dossierIdCTN;
	}

	public String getDeliverableCode() {
		return _deliverableCode;
	}

	public void setDeliverableCode(String deliverableCode) {
		_deliverableCode = deliverableCode;
	}

	public String getLoai_dong_co() {
		return _loai_dong_co;
	}

	public void setLoai_dong_co(String loai_dong_co) {
		_loai_dong_co = loai_dong_co;
	}

	public String getXCG01001() {
		return _XCG01001;
	}

	public void setXCG01001(String XCG01001) {
		_XCG01001 = XCG01001;
	}

	public String getXCG01002() {
		return _XCG01002;
	}

	public void setXCG01002(String XCG01002) {
		_XCG01002 = XCG01002;
	}

	public String getXCG01003() {
		return _XCG01003;
	}

	public void setXCG01003(String XCG01003) {
		_XCG01003 = XCG01003;
	}

	public String getXCG01004() {
		return _XCG01004;
	}

	public void setXCG01004(String XCG01004) {
		_XCG01004 = XCG01004;
	}

	public String getXCG01005() {
		return _XCG01005;
	}

	public void setXCG01005(String XCG01005) {
		_XCG01005 = XCG01005;
	}

	public String getXCG01006() {
		return _XCG01006;
	}

	public void setXCG01006(String XCG01006) {
		_XCG01006 = XCG01006;
	}

	public String getXCG01007() {
		return _XCG01007;
	}

	public void setXCG01007(String XCG01007) {
		_XCG01007 = XCG01007;
	}

	public String getXCG01008() {
		return _XCG01008;
	}

	public void setXCG01008(String XCG01008) {
		_XCG01008 = XCG01008;
	}

	public String getXCG01009() {
		return _XCG01009;
	}

	public void setXCG01009(String XCG01009) {
		_XCG01009 = XCG01009;
	}

	public String getXCG01010() {
		return _XCG01010;
	}

	public void setXCG01010(String XCG01010) {
		_XCG01010 = XCG01010;
	}

	public String getXCG01011() {
		return _XCG01011;
	}

	public void setXCG01011(String XCG01011) {
		_XCG01011 = XCG01011;
	}

	public String getXCG01012() {
		return _XCG01012;
	}

	public void setXCG01012(String XCG01012) {
		_XCG01012 = XCG01012;
	}

	public String getXCG01013() {
		return _XCG01013;
	}

	public void setXCG01013(String XCG01013) {
		_XCG01013 = XCG01013;
	}

	public String getXCG01014() {
		return _XCG01014;
	}

	public void setXCG01014(String XCG01014) {
		_XCG01014 = XCG01014;
	}

	public String getXCG01016() {
		return _XCG01016;
	}

	public void setXCG01016(String XCG01016) {
		_XCG01016 = XCG01016;
	}

	public String getXCG01017() {
		return _XCG01017;
	}

	public void setXCG01017(String XCG01017) {
		_XCG01017 = XCG01017;
	}

	public String getXCG01019() {
		return _XCG01019;
	}

	public void setXCG01019(String XCG01019) {
		_XCG01019 = XCG01019;
	}

	public String getXCG01020() {
		return _XCG01020;
	}

	public void setXCG01020(String XCG01020) {
		_XCG01020 = XCG01020;
	}

	public String getXCG01021() {
		return _XCG01021;
	}

	public void setXCG01021(String XCG01021) {
		_XCG01021 = XCG01021;
	}

	public String getXCG01022() {
		return _XCG01022;
	}

	public void setXCG01022(String XCG01022) {
		_XCG01022 = XCG01022;
	}

	public String getXCG01024() {
		return _XCG01024;
	}

	public void setXCG01024(String XCG01024) {
		_XCG01024 = XCG01024;
	}

	public String getXCG01025() {
		return _XCG01025;
	}

	public void setXCG01025(String XCG01025) {
		_XCG01025 = XCG01025;
	}

	public String getXCG01026() {
		return _XCG01026;
	}

	public void setXCG01026(String XCG01026) {
		_XCG01026 = XCG01026;
	}

	public String getXCG01027() {
		return _XCG01027;
	}

	public void setXCG01027(String XCG01027) {
		_XCG01027 = XCG01027;
	}

	public String getXCG01028() {
		return _XCG01028;
	}

	public void setXCG01028(String XCG01028) {
		_XCG01028 = XCG01028;
	}

	public String getXCG01030() {
		return _XCG01030;
	}

	public void setXCG01030(String XCG01030) {
		_XCG01030 = XCG01030;
	}

	public String getXCG01031() {
		return _XCG01031;
	}

	public void setXCG01031(String XCG01031) {
		_XCG01031 = XCG01031;
	}

	public String getXCG01032() {
		return _XCG01032;
	}

	public void setXCG01032(String XCG01032) {
		_XCG01032 = XCG01032;
	}

	public String getXCG01033() {
		return _XCG01033;
	}

	public void setXCG01033(String XCG01033) {
		_XCG01033 = XCG01033;
	}

	public String getXCG01034() {
		return _XCG01034;
	}

	public void setXCG01034(String XCG01034) {
		_XCG01034 = XCG01034;
	}

	public String getXCG01035() {
		return _XCG01035;
	}

	public void setXCG01035(String XCG01035) {
		_XCG01035 = XCG01035;
	}

	public String getXCG01036() {
		return _XCG01036;
	}

	public void setXCG01036(String XCG01036) {
		_XCG01036 = XCG01036;
	}

	public String getXCG01037() {
		return _XCG01037;
	}

	public void setXCG01037(String XCG01037) {
		_XCG01037 = XCG01037;
	}

	public String getXCG01038() {
		return _XCG01038;
	}

	public void setXCG01038(String XCG01038) {
		_XCG01038 = XCG01038;
	}

	public String getXCG01039() {
		return _XCG01039;
	}

	public void setXCG01039(String XCG01039) {
		_XCG01039 = XCG01039;
	}

	public String getXCG01040() {
		return _XCG01040;
	}

	public void setXCG01040(String XCG01040) {
		_XCG01040 = XCG01040;
	}

	public String getXCG01041() {
		return _XCG01041;
	}

	public void setXCG01041(String XCG01041) {
		_XCG01041 = XCG01041;
	}

	public String getXCG01042() {
		return _XCG01042;
	}

	public void setXCG01042(String XCG01042) {
		_XCG01042 = XCG01042;
	}

	public String getXCG01043() {
		return _XCG01043;
	}

	public void setXCG01043(String XCG01043) {
		_XCG01043 = XCG01043;
	}

	public String getXCG01044() {
		return _XCG01044;
	}

	public void setXCG01044(String XCG01044) {
		_XCG01044 = XCG01044;
	}

	public String getXCG01045() {
		return _XCG01045;
	}

	public void setXCG01045(String XCG01045) {
		_XCG01045 = XCG01045;
	}

	public String getXCG01046() {
		return _XCG01046;
	}

	public void setXCG01046(String XCG01046) {
		_XCG01046 = XCG01046;
	}

	public String getXCG01047() {
		return _XCG01047;
	}

	public void setXCG01047(String XCG01047) {
		_XCG01047 = XCG01047;
	}

	public String getXCG01049() {
		return _XCG01049;
	}

	public void setXCG01049(String XCG01049) {
		_XCG01049 = XCG01049;
	}

	public String getXCG01050() {
		return _XCG01050;
	}

	public void setXCG01050(String XCG01050) {
		_XCG01050 = XCG01050;
	}

	public String getXCG01051() {
		return _XCG01051;
	}

	public void setXCG01051(String XCG01051) {
		_XCG01051 = XCG01051;
	}

	public String getXCG01052() {
		return _XCG01052;
	}

	public void setXCG01052(String XCG01052) {
		_XCG01052 = XCG01052;
	}

	public String getXCG01053() {
		return _XCG01053;
	}

	public void setXCG01053(String XCG01053) {
		_XCG01053 = XCG01053;
	}

	public String getXCG01054() {
		return _XCG01054;
	}

	public void setXCG01054(String XCG01054) {
		_XCG01054 = XCG01054;
	}

	public String getXCG01055() {
		return _XCG01055;
	}

	public void setXCG01055(String XCG01055) {
		_XCG01055 = XCG01055;
	}

	public String getXCG01056() {
		return _XCG01056;
	}

	public void setXCG01056(String XCG01056) {
		_XCG01056 = XCG01056;
	}

	public String getXCG01057() {
		return _XCG01057;
	}

	public void setXCG01057(String XCG01057) {
		_XCG01057 = XCG01057;
	}

	public String getXCG01058() {
		return _XCG01058;
	}

	public void setXCG01058(String XCG01058) {
		_XCG01058 = XCG01058;
	}

	public String getXCG01059() {
		return _XCG01059;
	}

	public void setXCG01059(String XCG01059) {
		_XCG01059 = XCG01059;
	}

	public String getXCG01060() {
		return _XCG01060;
	}

	public void setXCG01060(String XCG01060) {
		_XCG01060 = XCG01060;
	}

	public String getXCG01062() {
		return _XCG01062;
	}

	public void setXCG01062(String XCG01062) {
		_XCG01062 = XCG01062;
	}

	public String getXCG01063() {
		return _XCG01063;
	}

	public void setXCG01063(String XCG01063) {
		_XCG01063 = XCG01063;
	}

	public String getXCG01064() {
		return _XCG01064;
	}

	public void setXCG01064(String XCG01064) {
		_XCG01064 = XCG01064;
	}

	public String getXCG01065() {
		return _XCG01065;
	}

	public void setXCG01065(String XCG01065) {
		_XCG01065 = XCG01065;
	}

	public String getXCG01066() {
		return _XCG01066;
	}

	public void setXCG01066(String XCG01066) {
		_XCG01066 = XCG01066;
	}

	public String getXCG01067() {
		return _XCG01067;
	}

	public void setXCG01067(String XCG01067) {
		_XCG01067 = XCG01067;
	}

	public String getXCG01068() {
		return _XCG01068;
	}

	public void setXCG01068(String XCG01068) {
		_XCG01068 = XCG01068;
	}

	public String getXCG01069() {
		return _XCG01069;
	}

	public void setXCG01069(String XCG01069) {
		_XCG01069 = XCG01069;
	}

	public String getXCG01070() {
		return _XCG01070;
	}

	public void setXCG01070(String XCG01070) {
		_XCG01070 = XCG01070;
	}

	public String getXCG01072() {
		return _XCG01072;
	}

	public void setXCG01072(String XCG01072) {
		_XCG01072 = XCG01072;
	}

	public String getXCG01073() {
		return _XCG01073;
	}

	public void setXCG01073(String XCG01073) {
		_XCG01073 = XCG01073;
	}

	public String getXCG01074() {
		return _XCG01074;
	}

	public void setXCG01074(String XCG01074) {
		_XCG01074 = XCG01074;
	}

	public String getXCG01075() {
		return _XCG01075;
	}

	public void setXCG01075(String XCG01075) {
		_XCG01075 = XCG01075;
	}

	public String getXCG01076() {
		return _XCG01076;
	}

	public void setXCG01076(String XCG01076) {
		_XCG01076 = XCG01076;
	}

	public String getXCG01077() {
		return _XCG01077;
	}

	public void setXCG01077(String XCG01077) {
		_XCG01077 = XCG01077;
	}

	public String getXCG01078() {
		return _XCG01078;
	}

	public void setXCG01078(String XCG01078) {
		_XCG01078 = XCG01078;
	}

	public String getXCG01079() {
		return _XCG01079;
	}

	public void setXCG01079(String XCG01079) {
		_XCG01079 = XCG01079;
	}

	public String getXCG01080() {
		return _XCG01080;
	}

	public void setXCG01080(String XCG01080) {
		_XCG01080 = XCG01080;
	}

	public String getXCG01081() {
		return _XCG01081;
	}

	public void setXCG01081(String XCG01081) {
		_XCG01081 = XCG01081;
	}

	public String getXCG01082() {
		return _XCG01082;
	}

	public void setXCG01082(String XCG01082) {
		_XCG01082 = XCG01082;
	}

	public String getXCG01083() {
		return _XCG01083;
	}

	public void setXCG01083(String XCG01083) {
		_XCG01083 = XCG01083;
	}

	public String getXCG01084() {
		return _XCG01084;
	}

	public void setXCG01084(String XCG01084) {
		_XCG01084 = XCG01084;
	}

	public String getXCG01085() {
		return _XCG01085;
	}

	public void setXCG01085(String XCG01085) {
		_XCG01085 = XCG01085;
	}

	public String getXCG01086() {
		return _XCG01086;
	}

	public void setXCG01086(String XCG01086) {
		_XCG01086 = XCG01086;
	}

	public String getXCG01087() {
		return _XCG01087;
	}

	public void setXCG01087(String XCG01087) {
		_XCG01087 = XCG01087;
	}

	public String getXCG01088() {
		return _XCG01088;
	}

	public void setXCG01088(String XCG01088) {
		_XCG01088 = XCG01088;
	}

	public String getXCG01089() {
		return _XCG01089;
	}

	public void setXCG01089(String XCG01089) {
		_XCG01089 = XCG01089;
	}

	public String getXCG01090() {
		return _XCG01090;
	}

	public void setXCG01090(String XCG01090) {
		_XCG01090 = XCG01090;
	}

	public String getXCG01091() {
		return _XCG01091;
	}

	public void setXCG01091(String XCG01091) {
		_XCG01091 = XCG01091;
	}

	public String getXCG01092() {
		return _XCG01092;
	}

	public void setXCG01092(String XCG01092) {
		_XCG01092 = XCG01092;
	}

	public String getXCG01093() {
		return _XCG01093;
	}

	public void setXCG01093(String XCG01093) {
		_XCG01093 = XCG01093;
	}

	public String getXCG01094() {
		return _XCG01094;
	}

	public void setXCG01094(String XCG01094) {
		_XCG01094 = XCG01094;
	}

	public String getXCG01095() {
		return _XCG01095;
	}

	public void setXCG01095(String XCG01095) {
		_XCG01095 = XCG01095;
	}

	public String getXCG01096() {
		return _XCG01096;
	}

	public void setXCG01096(String XCG01096) {
		_XCG01096 = XCG01096;
	}

	public String getXCG01097() {
		return _XCG01097;
	}

	public void setXCG01097(String XCG01097) {
		_XCG01097 = XCG01097;
	}

	public String getXCG01098() {
		return _XCG01098;
	}

	public void setXCG01098(String XCG01098) {
		_XCG01098 = XCG01098;
	}

	public String getXCG01099() {
		return _XCG01099;
	}

	public void setXCG01099(String XCG01099) {
		_XCG01099 = XCG01099;
	}

	public String getXCG01100() {
		return _XCG01100;
	}

	public void setXCG01100(String XCG01100) {
		_XCG01100 = XCG01100;
	}

	public String getXCG01101() {
		return _XCG01101;
	}

	public void setXCG01101(String XCG01101) {
		_XCG01101 = XCG01101;
	}

	public String getXCG01102() {
		return _XCG01102;
	}

	public void setXCG01102(String XCG01102) {
		_XCG01102 = XCG01102;
	}

	public String getXCG01103() {
		return _XCG01103;
	}

	public void setXCG01103(String XCG01103) {
		_XCG01103 = XCG01103;
	}

	public String getXCG01104() {
		return _XCG01104;
	}

	public void setXCG01104(String XCG01104) {
		_XCG01104 = XCG01104;
	}

	public String getXCG01105() {
		return _XCG01105;
	}

	public void setXCG01105(String XCG01105) {
		_XCG01105 = XCG01105;
	}

	public String getXCG01106() {
		return _XCG01106;
	}

	public void setXCG01106(String XCG01106) {
		_XCG01106 = XCG01106;
	}

	public String getXCG01107() {
		return _XCG01107;
	}

	public void setXCG01107(String XCG01107) {
		_XCG01107 = XCG01107;
	}

	public String getXCG01108() {
		return _XCG01108;
	}

	public void setXCG01108(String XCG01108) {
		_XCG01108 = XCG01108;
	}

	public String getXCG01109() {
		return _XCG01109;
	}

	public void setXCG01109(String XCG01109) {
		_XCG01109 = XCG01109;
	}

	public String getXCG01110() {
		return _XCG01110;
	}

	public void setXCG01110(String XCG01110) {
		_XCG01110 = XCG01110;
	}

	public String getXCG01111() {
		return _XCG01111;
	}

	public void setXCG01111(String XCG01111) {
		_XCG01111 = XCG01111;
	}

	public String getXCG01112() {
		return _XCG01112;
	}

	public void setXCG01112(String XCG01112) {
		_XCG01112 = XCG01112;
	}

	public String getXCG01113() {
		return _XCG01113;
	}

	public void setXCG01113(String XCG01113) {
		_XCG01113 = XCG01113;
	}

	public String getXCG01114() {
		return _XCG01114;
	}

	public void setXCG01114(String XCG01114) {
		_XCG01114 = XCG01114;
	}

	public String getXCG01115() {
		return _XCG01115;
	}

	public void setXCG01115(String XCG01115) {
		_XCG01115 = XCG01115;
	}

	public String getXCG01116() {
		return _XCG01116;
	}

	public void setXCG01116(String XCG01116) {
		_XCG01116 = XCG01116;
	}

	public String getXCG01117() {
		return _XCG01117;
	}

	public void setXCG01117(String XCG01117) {
		_XCG01117 = XCG01117;
	}

	public String getXCG01118() {
		return _XCG01118;
	}

	public void setXCG01118(String XCG01118) {
		_XCG01118 = XCG01118;
	}

	public String getXCG01119() {
		return _XCG01119;
	}

	public void setXCG01119(String XCG01119) {
		_XCG01119 = XCG01119;
	}

	public String getXCG01120() {
		return _XCG01120;
	}

	public void setXCG01120(String XCG01120) {
		_XCG01120 = XCG01120;
	}

	public String getXCG01121() {
		return _XCG01121;
	}

	public void setXCG01121(String XCG01121) {
		_XCG01121 = XCG01121;
	}

	public String getXCG01122() {
		return _XCG01122;
	}

	public void setXCG01122(String XCG01122) {
		_XCG01122 = XCG01122;
	}

	public String getXCG01123() {
		return _XCG01123;
	}

	public void setXCG01123(String XCG01123) {
		_XCG01123 = XCG01123;
	}

	public String getXCG01124() {
		return _XCG01124;
	}

	public void setXCG01124(String XCG01124) {
		_XCG01124 = XCG01124;
	}

	public String getXCG01125() {
		return _XCG01125;
	}

	public void setXCG01125(String XCG01125) {
		_XCG01125 = XCG01125;
	}

	public String getXCG01126() {
		return _XCG01126;
	}

	public void setXCG01126(String XCG01126) {
		_XCG01126 = XCG01126;
	}

	public String getXCG01127() {
		return _XCG01127;
	}

	public void setXCG01127(String XCG01127) {
		_XCG01127 = XCG01127;
	}

	public String getXCG01128() {
		return _XCG01128;
	}

	public void setXCG01128(String XCG01128) {
		_XCG01128 = XCG01128;
	}

	public String getXCG01129() {
		return _XCG01129;
	}

	public void setXCG01129(String XCG01129) {
		_XCG01129 = XCG01129;
	}

	public String getXCG01130() {
		return _XCG01130;
	}

	public void setXCG01130(String XCG01130) {
		_XCG01130 = XCG01130;
	}

	public String getXCG01131() {
		return _XCG01131;
	}

	public void setXCG01131(String XCG01131) {
		_XCG01131 = XCG01131;
	}

	public String getXCG01132() {
		return _XCG01132;
	}

	public void setXCG01132(String XCG01132) {
		_XCG01132 = XCG01132;
	}

	public String getXCG01133() {
		return _XCG01133;
	}

	public void setXCG01133(String XCG01133) {
		_XCG01133 = XCG01133;
	}

	public String getXCG01134() {
		return _XCG01134;
	}

	public void setXCG01134(String XCG01134) {
		_XCG01134 = XCG01134;
	}

	public String getXCG01135() {
		return _XCG01135;
	}

	public void setXCG01135(String XCG01135) {
		_XCG01135 = XCG01135;
	}

	public String getXCG01136() {
		return _XCG01136;
	}

	public void setXCG01136(String XCG01136) {
		_XCG01136 = XCG01136;
	}

	public String getXCG01137() {
		return _XCG01137;
	}

	public void setXCG01137(String XCG01137) {
		_XCG01137 = XCG01137;
	}

	public String getXCG01138() {
		return _XCG01138;
	}

	public void setXCG01138(String XCG01138) {
		_XCG01138 = XCG01138;
	}

	public String getXCG01139() {
		return _XCG01139;
	}

	public void setXCG01139(String XCG01139) {
		_XCG01139 = XCG01139;
	}

	public String getXCG01140() {
		return _XCG01140;
	}

	public void setXCG01140(String XCG01140) {
		_XCG01140 = XCG01140;
	}

	public String getXCG01141() {
		return _XCG01141;
	}

	public void setXCG01141(String XCG01141) {
		_XCG01141 = XCG01141;
	}

	public String getXCG01142() {
		return _XCG01142;
	}

	public void setXCG01142(String XCG01142) {
		_XCG01142 = XCG01142;
	}

	public String getXCG01143() {
		return _XCG01143;
	}

	public void setXCG01143(String XCG01143) {
		_XCG01143 = XCG01143;
	}

	public String getXCG01144() {
		return _XCG01144;
	}

	public void setXCG01144(String XCG01144) {
		_XCG01144 = XCG01144;
	}

	public String getXCG01145() {
		return _XCG01145;
	}

	public void setXCG01145(String XCG01145) {
		_XCG01145 = XCG01145;
	}

	public String getXCG01146() {
		return _XCG01146;
	}

	public void setXCG01146(String XCG01146) {
		_XCG01146 = XCG01146;
	}

	public String getXCG01147() {
		return _XCG01147;
	}

	public void setXCG01147(String XCG01147) {
		_XCG01147 = XCG01147;
	}

	public String getXCG01148() {
		return _XCG01148;
	}

	public void setXCG01148(String XCG01148) {
		_XCG01148 = XCG01148;
	}

	public String getXCG01149() {
		return _XCG01149;
	}

	public void setXCG01149(String XCG01149) {
		_XCG01149 = XCG01149;
	}

	public String getXCG01150() {
		return _XCG01150;
	}

	public void setXCG01150(String XCG01150) {
		_XCG01150 = XCG01150;
	}

	public String getXCG01151() {
		return _XCG01151;
	}

	public void setXCG01151(String XCG01151) {
		_XCG01151 = XCG01151;
	}

	public String getXCG01152() {
		return _XCG01152;
	}

	public void setXCG01152(String XCG01152) {
		_XCG01152 = XCG01152;
	}

	public String getXCG01153() {
		return _XCG01153;
	}

	public void setXCG01153(String XCG01153) {
		_XCG01153 = XCG01153;
	}

	public String getXCG01154() {
		return _XCG01154;
	}

	public void setXCG01154(String XCG01154) {
		_XCG01154 = XCG01154;
	}

	public String getXCG01155() {
		return _XCG01155;
	}

	public void setXCG01155(String XCG01155) {
		_XCG01155 = XCG01155;
	}

	public String getXCG01156() {
		return _XCG01156;
	}

	public void setXCG01156(String XCG01156) {
		_XCG01156 = XCG01156;
	}

	public String getXCG01157() {
		return _XCG01157;
	}

	public void setXCG01157(String XCG01157) {
		_XCG01157 = XCG01157;
	}

	public String getXCG01158() {
		return _XCG01158;
	}

	public void setXCG01158(String XCG01158) {
		_XCG01158 = XCG01158;
	}

	public String getXCG01159() {
		return _XCG01159;
	}

	public void setXCG01159(String XCG01159) {
		_XCG01159 = XCG01159;
	}

	public String getXCG01160() {
		return _XCG01160;
	}

	public void setXCG01160(String XCG01160) {
		_XCG01160 = XCG01160;
	}

	public String getXCG01161() {
		return _XCG01161;
	}

	public void setXCG01161(String XCG01161) {
		_XCG01161 = XCG01161;
	}

	public String getXCG01162() {
		return _XCG01162;
	}

	public void setXCG01162(String XCG01162) {
		_XCG01162 = XCG01162;
	}

	public String getXCG01163() {
		return _XCG01163;
	}

	public void setXCG01163(String XCG01163) {
		_XCG01163 = XCG01163;
	}

	public String getXCG01164() {
		return _XCG01164;
	}

	public void setXCG01164(String XCG01164) {
		_XCG01164 = XCG01164;
	}

	public String getXCG01165() {
		return _XCG01165;
	}

	public void setXCG01165(String XCG01165) {
		_XCG01165 = XCG01165;
	}

	public String getXCG01166() {
		return _XCG01166;
	}

	public void setXCG01166(String XCG01166) {
		_XCG01166 = XCG01166;
	}

	public String getXCG01167() {
		return _XCG01167;
	}

	public void setXCG01167(String XCG01167) {
		_XCG01167 = XCG01167;
	}

	public String getXCG01169() {
		return _XCG01169;
	}

	public void setXCG01169(String XCG01169) {
		_XCG01169 = XCG01169;
	}

	public String getXCG01170() {
		return _XCG01170;
	}

	public void setXCG01170(String XCG01170) {
		_XCG01170 = XCG01170;
	}

	public String getXCG01171() {
		return _XCG01171;
	}

	public void setXCG01171(String XCG01171) {
		_XCG01171 = XCG01171;
	}

	public String getXCG01172() {
		return _XCG01172;
	}

	public void setXCG01172(String XCG01172) {
		_XCG01172 = XCG01172;
	}

	public String getXCG01173() {
		return _XCG01173;
	}

	public void setXCG01173(String XCG01173) {
		_XCG01173 = XCG01173;
	}

	public String getXCG01174() {
		return _XCG01174;
	}

	public void setXCG01174(String XCG01174) {
		_XCG01174 = XCG01174;
	}

	public String getXCG01175() {
		return _XCG01175;
	}

	public void setXCG01175(String XCG01175) {
		_XCG01175 = XCG01175;
	}

	public String getXCG01176() {
		return _XCG01176;
	}

	public void setXCG01176(String XCG01176) {
		_XCG01176 = XCG01176;
	}

	public String getXCG01177() {
		return _XCG01177;
	}

	public void setXCG01177(String XCG01177) {
		_XCG01177 = XCG01177;
	}

	public String getXCG01178() {
		return _XCG01178;
	}

	public void setXCG01178(String XCG01178) {
		_XCG01178 = XCG01178;
	}

	public String getXCG01179() {
		return _XCG01179;
	}

	public void setXCG01179(String XCG01179) {
		_XCG01179 = XCG01179;
	}

	public String getXCG01180() {
		return _XCG01180;
	}

	public void setXCG01180(String XCG01180) {
		_XCG01180 = XCG01180;
	}

	public String getXCG01181() {
		return _XCG01181;
	}

	public void setXCG01181(String XCG01181) {
		_XCG01181 = XCG01181;
	}

	public String getXCG01182() {
		return _XCG01182;
	}

	public void setXCG01182(String XCG01182) {
		_XCG01182 = XCG01182;
	}

	public String getXCG01183() {
		return _XCG01183;
	}

	public void setXCG01183(String XCG01183) {
		_XCG01183 = XCG01183;
	}

	public String getXCG01184() {
		return _XCG01184;
	}

	public void setXCG01184(String XCG01184) {
		_XCG01184 = XCG01184;
	}

	public String getXCG01185() {
		return _XCG01185;
	}

	public void setXCG01185(String XCG01185) {
		_XCG01185 = XCG01185;
	}

	public String getXCG01186() {
		return _XCG01186;
	}

	public void setXCG01186(String XCG01186) {
		_XCG01186 = XCG01186;
	}

	public String getXCG01187() {
		return _XCG01187;
	}

	public void setXCG01187(String XCG01187) {
		_XCG01187 = XCG01187;
	}

	public String getXCG01188() {
		return _XCG01188;
	}

	public void setXCG01188(String XCG01188) {
		_XCG01188 = XCG01188;
	}

	public String getXCG01189() {
		return _XCG01189;
	}

	public void setXCG01189(String XCG01189) {
		_XCG01189 = XCG01189;
	}

	public String getXCG01190() {
		return _XCG01190;
	}

	public void setXCG01190(String XCG01190) {
		_XCG01190 = XCG01190;
	}

	public String getXCG01191() {
		return _XCG01191;
	}

	public void setXCG01191(String XCG01191) {
		_XCG01191 = XCG01191;
	}

	public String getXCG01192() {
		return _XCG01192;
	}

	public void setXCG01192(String XCG01192) {
		_XCG01192 = XCG01192;
	}

	public String getXCG01193() {
		return _XCG01193;
	}

	public void setXCG01193(String XCG01193) {
		_XCG01193 = XCG01193;
	}

	public String getXCG01194() {
		return _XCG01194;
	}

	public void setXCG01194(String XCG01194) {
		_XCG01194 = XCG01194;
	}

	public String getXCG01195() {
		return _XCG01195;
	}

	public void setXCG01195(String XCG01195) {
		_XCG01195 = XCG01195;
	}

	public String getXCG01196() {
		return _XCG01196;
	}

	public void setXCG01196(String XCG01196) {
		_XCG01196 = XCG01196;
	}

	public String getXCG01197() {
		return _XCG01197;
	}

	public void setXCG01197(String XCG01197) {
		_XCG01197 = XCG01197;
	}

	public String getXCG01198() {
		return _XCG01198;
	}

	public void setXCG01198(String XCG01198) {
		_XCG01198 = XCG01198;
	}

	public String getXCG01199() {
		return _XCG01199;
	}

	public void setXCG01199(String XCG01199) {
		_XCG01199 = XCG01199;
	}

	public String getXCG01200() {
		return _XCG01200;
	}

	public void setXCG01200(String XCG01200) {
		_XCG01200 = XCG01200;
	}

	public String getXCG01202() {
		return _XCG01202;
	}

	public void setXCG01202(String XCG01202) {
		_XCG01202 = XCG01202;
	}

	public String getXCG01203() {
		return _XCG01203;
	}

	public void setXCG01203(String XCG01203) {
		_XCG01203 = XCG01203;
	}

	public String getXCG01204() {
		return _XCG01204;
	}

	public void setXCG01204(String XCG01204) {
		_XCG01204 = XCG01204;
	}

	public String getXCG01205() {
		return _XCG01205;
	}

	public void setXCG01205(String XCG01205) {
		_XCG01205 = XCG01205;
	}

	public String getXCG01206() {
		return _XCG01206;
	}

	public void setXCG01206(String XCG01206) {
		_XCG01206 = XCG01206;
	}

	public String getXCG01207() {
		return _XCG01207;
	}

	public void setXCG01207(String XCG01207) {
		_XCG01207 = XCG01207;
	}

	public String getXCG01208() {
		return _XCG01208;
	}

	public void setXCG01208(String XCG01208) {
		_XCG01208 = XCG01208;
	}

	public String getXCG01209() {
		return _XCG01209;
	}

	public void setXCG01209(String XCG01209) {
		_XCG01209 = XCG01209;
	}

	public String getXCG01210() {
		return _XCG01210;
	}

	public void setXCG01210(String XCG01210) {
		_XCG01210 = XCG01210;
	}

	public String getXCG01212() {
		return _XCG01212;
	}

	public void setXCG01212(String XCG01212) {
		_XCG01212 = XCG01212;
	}

	public String getXCG01213() {
		return _XCG01213;
	}

	public void setXCG01213(String XCG01213) {
		_XCG01213 = XCG01213;
	}

	public String getXCG01214() {
		return _XCG01214;
	}

	public void setXCG01214(String XCG01214) {
		_XCG01214 = XCG01214;
	}

	public String getXCG01215() {
		return _XCG01215;
	}

	public void setXCG01215(String XCG01215) {
		_XCG01215 = XCG01215;
	}

	public String getXCG01216() {
		return _XCG01216;
	}

	public void setXCG01216(String XCG01216) {
		_XCG01216 = XCG01216;
	}

	public String getXCG01217() {
		return _XCG01217;
	}

	public void setXCG01217(String XCG01217) {
		_XCG01217 = XCG01217;
	}

	public String getXCG01218() {
		return _XCG01218;
	}

	public void setXCG01218(String XCG01218) {
		_XCG01218 = XCG01218;
	}

	public String getXCG01219() {
		return _XCG01219;
	}

	public void setXCG01219(String XCG01219) {
		_XCG01219 = XCG01219;
	}

	public String getXCG01220() {
		return _XCG01220;
	}

	public void setXCG01220(String XCG01220) {
		_XCG01220 = XCG01220;
	}

	public String getXCG01221() {
		return _XCG01221;
	}

	public void setXCG01221(String XCG01221) {
		_XCG01221 = XCG01221;
	}

	public String getXCG01222() {
		return _XCG01222;
	}

	public void setXCG01222(String XCG01222) {
		_XCG01222 = XCG01222;
	}

	public String getXCG01223() {
		return _XCG01223;
	}

	public void setXCG01223(String XCG01223) {
		_XCG01223 = XCG01223;
	}

	public String getXCG01224() {
		return _XCG01224;
	}

	public void setXCG01224(String XCG01224) {
		_XCG01224 = XCG01224;
	}

	public String getXCG01225() {
		return _XCG01225;
	}

	public void setXCG01225(String XCG01225) {
		_XCG01225 = XCG01225;
	}

	public String getXCG01226() {
		return _XCG01226;
	}

	public void setXCG01226(String XCG01226) {
		_XCG01226 = XCG01226;
	}

	public String getXCG01228() {
		return _XCG01228;
	}

	public void setXCG01228(String XCG01228) {
		_XCG01228 = XCG01228;
	}

	public String getXCG01230() {
		return _XCG01230;
	}

	public void setXCG01230(String XCG01230) {
		_XCG01230 = XCG01230;
	}

	public String getXCG01231() {
		return _XCG01231;
	}

	public void setXCG01231(String XCG01231) {
		_XCG01231 = XCG01231;
	}

	public String getXCG01232() {
		return _XCG01232;
	}

	public void setXCG01232(String XCG01232) {
		_XCG01232 = XCG01232;
	}

	public String getXCG01234() {
		return _XCG01234;
	}

	public void setXCG01234(String XCG01234) {
		_XCG01234 = XCG01234;
	}

	public String getXCG01236() {
		return _XCG01236;
	}

	public void setXCG01236(String XCG01236) {
		_XCG01236 = XCG01236;
	}

	public String getXCG01237() {
		return _XCG01237;
	}

	public void setXCG01237(String XCG01237) {
		_XCG01237 = XCG01237;
	}

	public String getXCG01229() {
		return _XCG01229;
	}

	public void setXCG01229(String XCG01229) {
		_XCG01229 = XCG01229;
	}

	public String getXCG01238() {
		return _XCG01238;
	}

	public void setXCG01238(String XCG01238) {
		_XCG01238 = XCG01238;
	}

	public String getXCG01239() {
		return _XCG01239;
	}

	public void setXCG01239(String XCG01239) {
		_XCG01239 = XCG01239;
	}

	public String getXCG01240() {
		return _XCG01240;
	}

	public void setXCG01240(String XCG01240) {
		_XCG01240 = XCG01240;
	}

	public String getXCG01241() {
		return _XCG01241;
	}

	public void setXCG01241(String XCG01241) {
		_XCG01241 = XCG01241;
	}

	public String getXCG01242() {
		return _XCG01242;
	}

	public void setXCG01242(String XCG01242) {
		_XCG01242 = XCG01242;
	}

	public String getXCG01243() {
		return _XCG01243;
	}

	public void setXCG01243(String XCG01243) {
		_XCG01243 = XCG01243;
	}

	public String getXCG01235() {
		return _XCG01235;
	}

	public void setXCG01235(String XCG01235) {
		_XCG01235 = XCG01235;
	}

	public String getXCG01244() {
		return _XCG01244;
	}

	public void setXCG01244(String XCG01244) {
		_XCG01244 = XCG01244;
	}

	public String getXCG01245() {
		return _XCG01245;
	}

	public void setXCG01245(String XCG01245) {
		_XCG01245 = XCG01245;
	}

	public String getXCG01246() {
		return _XCG01246;
	}

	public void setXCG01246(String XCG01246) {
		_XCG01246 = XCG01246;
	}

	public String getXCG01247() {
		return _XCG01247;
	}

	public void setXCG01247(String XCG01247) {
		_XCG01247 = XCG01247;
	}

	public String getXCG01248() {
		return _XCG01248;
	}

	public void setXCG01248(String XCG01248) {
		_XCG01248 = XCG01248;
	}

	public String getXCG01249() {
		return _XCG01249;
	}

	public void setXCG01249(String XCG01249) {
		_XCG01249 = XCG01249;
	}

	public String getXCG11248() {
		return _XCG11248;
	}

	public void setXCG11248(String XCG11248) {
		_XCG11248 = XCG11248;
	}

	public String getXCG11249() {
		return _XCG11249;
	}

	public void setXCG11249(String XCG11249) {
		_XCG11249 = XCG11249;
	}

	public String getXCG01250() {
		return _XCG01250;
	}

	public void setXCG01250(String XCG01250) {
		_XCG01250 = XCG01250;
	}

	public String getXCG01251() {
		return _XCG01251;
	}

	public void setXCG01251(String XCG01251) {
		_XCG01251 = XCG01251;
	}

	public String getXCG01252() {
		return _XCG01252;
	}

	public void setXCG01252(String XCG01252) {
		_XCG01252 = XCG01252;
	}

	public String getXCG01253() {
		return _XCG01253;
	}

	public void setXCG01253(String XCG01253) {
		_XCG01253 = XCG01253;
	}

	public String getXCG01255() {
		return _XCG01255;
	}

	public void setXCG01255(String XCG01255) {
		_XCG01255 = XCG01255;
	}

	public String getXCG01256() {
		return _XCG01256;
	}

	public void setXCG01256(String XCG01256) {
		_XCG01256 = XCG01256;
	}

	public String getXCG01257() {
		return _XCG01257;
	}

	public void setXCG01257(String XCG01257) {
		_XCG01257 = XCG01257;
	}

	public String getXCG01258() {
		return _XCG01258;
	}

	public void setXCG01258(String XCG01258) {
		_XCG01258 = XCG01258;
	}

	public String getXCG01259() {
		return _XCG01259;
	}

	public void setXCG01259(String XCG01259) {
		_XCG01259 = XCG01259;
	}

	public String getXCG01260() {
		return _XCG01260;
	}

	public void setXCG01260(String XCG01260) {
		_XCG01260 = XCG01260;
	}

	public String getXCG01261() {
		return _XCG01261;
	}

	public void setXCG01261(String XCG01261) {
		_XCG01261 = XCG01261;
	}

	public String getXCG01262() {
		return _XCG01262;
	}

	public void setXCG01262(String XCG01262) {
		_XCG01262 = XCG01262;
	}

	public String getXCG11253() {
		return _XCG11253;
	}

	public void setXCG11253(String XCG11253) {
		_XCG11253 = XCG11253;
	}

	public String getXCG01263() {
		return _XCG01263;
	}

	public void setXCG01263(String XCG01263) {
		_XCG01263 = XCG01263;
	}

	public String getXCG01264() {
		return _XCG01264;
	}

	public void setXCG01264(String XCG01264) {
		_XCG01264 = XCG01264;
	}

	public String getXCG01265() {
		return _XCG01265;
	}

	public void setXCG01265(String XCG01265) {
		_XCG01265 = XCG01265;
	}

	public String getXCG01266() {
		return _XCG01266;
	}

	public void setXCG01266(String XCG01266) {
		_XCG01266 = XCG01266;
	}

	public String getXCG01901() {
		return _XCG01901;
	}

	public void setXCG01901(String XCG01901) {
		_XCG01901 = XCG01901;
	}

	public String getXCG01267() {
		return _XCG01267;
	}

	public void setXCG01267(String XCG01267) {
		_XCG01267 = XCG01267;
	}

	public String getXCG01902() {
		return _XCG01902;
	}

	public void setXCG01902(String XCG01902) {
		_XCG01902 = XCG01902;
	}

	public String getXCG01268() {
		return _XCG01268;
	}

	public void setXCG01268(String XCG01268) {
		_XCG01268 = XCG01268;
	}

	public String getXCG01269() {
		return _XCG01269;
	}

	public void setXCG01269(String XCG01269) {
		_XCG01269 = XCG01269;
	}

	public String getXCG01903() {
		return _XCG01903;
	}

	public void setXCG01903(String XCG01903) {
		_XCG01903 = XCG01903;
	}

	public String getXCG01270() {
		return _XCG01270;
	}

	public void setXCG01270(String XCG01270) {
		_XCG01270 = XCG01270;
	}

	public String getXCG01271() {
		return _XCG01271;
	}

	public void setXCG01271(String XCG01271) {
		_XCG01271 = XCG01271;
	}

	public String getXCG01273() {
		return _XCG01273;
	}

	public void setXCG01273(String XCG01273) {
		_XCG01273 = XCG01273;
	}

	public String getXCG01274() {
		return _XCG01274;
	}

	public void setXCG01274(String XCG01274) {
		_XCG01274 = XCG01274;
	}

	public String getXCG01275() {
		return _XCG01275;
	}

	public void setXCG01275(String XCG01275) {
		_XCG01275 = XCG01275;
	}

	public String getXCG01276() {
		return _XCG01276;
	}

	public void setXCG01276(String XCG01276) {
		_XCG01276 = XCG01276;
	}

	public String getXCG01277() {
		return _XCG01277;
	}

	public void setXCG01277(String XCG01277) {
		_XCG01277 = XCG01277;
	}

	public String getXCG01278() {
		return _XCG01278;
	}

	public void setXCG01278(String XCG01278) {
		_XCG01278 = XCG01278;
	}

	public String getXCG01279() {
		return _XCG01279;
	}

	public void setXCG01279(String XCG01279) {
		_XCG01279 = XCG01279;
	}

	public String getXCG01280() {
		return _XCG01280;
	}

	public void setXCG01280(String XCG01280) {
		_XCG01280 = XCG01280;
	}

	public String getXCG01281() {
		return _XCG01281;
	}

	public void setXCG01281(String XCG01281) {
		_XCG01281 = XCG01281;
	}

	public String getXCG01282() {
		return _XCG01282;
	}

	public void setXCG01282(String XCG01282) {
		_XCG01282 = XCG01282;
	}

	public String getXCG01283() {
		return _XCG01283;
	}

	public void setXCG01283(String XCG01283) {
		_XCG01283 = XCG01283;
	}

	public String getXCG01284() {
		return _XCG01284;
	}

	public void setXCG01284(String XCG01284) {
		_XCG01284 = XCG01284;
	}

	public String getXCG01285() {
		return _XCG01285;
	}

	public void setXCG01285(String XCG01285) {
		_XCG01285 = XCG01285;
	}

	public String getXCG01286() {
		return _XCG01286;
	}

	public void setXCG01286(String XCG01286) {
		_XCG01286 = XCG01286;
	}

	public String getXCG01287() {
		return _XCG01287;
	}

	public void setXCG01287(String XCG01287) {
		_XCG01287 = XCG01287;
	}

	public String getXCG01288() {
		return _XCG01288;
	}

	public void setXCG01288(String XCG01288) {
		_XCG01288 = XCG01288;
	}

	public String getXCG01289() {
		return _XCG01289;
	}

	public void setXCG01289(String XCG01289) {
		_XCG01289 = XCG01289;
	}

	public String getXCG01290() {
		return _XCG01290;
	}

	public void setXCG01290(String XCG01290) {
		_XCG01290 = XCG01290;
	}

	public String getXCG01291() {
		return _XCG01291;
	}

	public void setXCG01291(String XCG01291) {
		_XCG01291 = XCG01291;
	}

	public String getXCG01292() {
		return _XCG01292;
	}

	public void setXCG01292(String XCG01292) {
		_XCG01292 = XCG01292;
	}

	public String getXCG01293() {
		return _XCG01293;
	}

	public void setXCG01293(String XCG01293) {
		_XCG01293 = XCG01293;
	}

	public String getXCG01294() {
		return _XCG01294;
	}

	public void setXCG01294(String XCG01294) {
		_XCG01294 = XCG01294;
	}

	public String getXCG01295() {
		return _XCG01295;
	}

	public void setXCG01295(String XCG01295) {
		_XCG01295 = XCG01295;
	}

	public String getXCG01296() {
		return _XCG01296;
	}

	public void setXCG01296(String XCG01296) {
		_XCG01296 = XCG01296;
	}

	public String getXCG01297() {
		return _XCG01297;
	}

	public void setXCG01297(String XCG01297) {
		_XCG01297 = XCG01297;
	}

	public String getXCG01298() {
		return _XCG01298;
	}

	public void setXCG01298(String XCG01298) {
		_XCG01298 = XCG01298;
	}

	public String getXCG01300() {
		return _XCG01300;
	}

	public void setXCG01300(String XCG01300) {
		_XCG01300 = XCG01300;
	}

	public String getXCG01301() {
		return _XCG01301;
	}

	public void setXCG01301(String XCG01301) {
		_XCG01301 = XCG01301;
	}

	public String getXCG01302() {
		return _XCG01302;
	}

	public void setXCG01302(String XCG01302) {
		_XCG01302 = XCG01302;
	}

	public String getXCG01303() {
		return _XCG01303;
	}

	public void setXCG01303(String XCG01303) {
		_XCG01303 = XCG01303;
	}

	public String getXCG01304() {
		return _XCG01304;
	}

	public void setXCG01304(String XCG01304) {
		_XCG01304 = XCG01304;
	}

	public String getXCG01305() {
		return _XCG01305;
	}

	public void setXCG01305(String XCG01305) {
		_XCG01305 = XCG01305;
	}

	public String getXCG01306() {
		return _XCG01306;
	}

	public void setXCG01306(String XCG01306) {
		_XCG01306 = XCG01306;
	}

	public String getXCG01307() {
		return _XCG01307;
	}

	public void setXCG01307(String XCG01307) {
		_XCG01307 = XCG01307;
	}

	public String getXCG01308() {
		return _XCG01308;
	}

	public void setXCG01308(String XCG01308) {
		_XCG01308 = XCG01308;
	}

	public String getXCG01310() {
		return _XCG01310;
	}

	public void setXCG01310(String XCG01310) {
		_XCG01310 = XCG01310;
	}

	public String getXCG01311() {
		return _XCG01311;
	}

	public void setXCG01311(String XCG01311) {
		_XCG01311 = XCG01311;
	}

	public String getXCG01312() {
		return _XCG01312;
	}

	public void setXCG01312(String XCG01312) {
		_XCG01312 = XCG01312;
	}

	public String getXCG01313() {
		return _XCG01313;
	}

	public void setXCG01313(String XCG01313) {
		_XCG01313 = XCG01313;
	}

	public String getXCG01314() {
		return _XCG01314;
	}

	public void setXCG01314(String XCG01314) {
		_XCG01314 = XCG01314;
	}

	public String getXCG01315() {
		return _XCG01315;
	}

	public void setXCG01315(String XCG01315) {
		_XCG01315 = XCG01315;
	}

	public String getXCG01316() {
		return _XCG01316;
	}

	public void setXCG01316(String XCG01316) {
		_XCG01316 = XCG01316;
	}

	public String getXCG01317() {
		return _XCG01317;
	}

	public void setXCG01317(String XCG01317) {
		_XCG01317 = XCG01317;
	}

	public String getXCG01318() {
		return _XCG01318;
	}

	public void setXCG01318(String XCG01318) {
		_XCG01318 = XCG01318;
	}

	public String getXCG01319() {
		return _XCG01319;
	}

	public void setXCG01319(String XCG01319) {
		_XCG01319 = XCG01319;
	}

	public String getXCG01320() {
		return _XCG01320;
	}

	public void setXCG01320(String XCG01320) {
		_XCG01320 = XCG01320;
	}

	public String getXCG01321() {
		return _XCG01321;
	}

	public void setXCG01321(String XCG01321) {
		_XCG01321 = XCG01321;
	}

	public String getXCG01322() {
		return _XCG01322;
	}

	public void setXCG01322(String XCG01322) {
		_XCG01322 = XCG01322;
	}

	public String getXCG01323() {
		return _XCG01323;
	}

	public void setXCG01323(String XCG01323) {
		_XCG01323 = XCG01323;
	}

	public String getXCG01324() {
		return _XCG01324;
	}

	public void setXCG01324(String XCG01324) {
		_XCG01324 = XCG01324;
	}

	public String getXCG01325() {
		return _XCG01325;
	}

	public void setXCG01325(String XCG01325) {
		_XCG01325 = XCG01325;
	}

	public String getXCG01326() {
		return _XCG01326;
	}

	public void setXCG01326(String XCG01326) {
		_XCG01326 = XCG01326;
	}

	public String getXCG01327() {
		return _XCG01327;
	}

	public void setXCG01327(String XCG01327) {
		_XCG01327 = XCG01327;
	}

	public String getXCG01328() {
		return _XCG01328;
	}

	public void setXCG01328(String XCG01328) {
		_XCG01328 = XCG01328;
	}

	public String getXCG01330() {
		return _XCG01330;
	}

	public void setXCG01330(String XCG01330) {
		_XCG01330 = XCG01330;
	}

	public String getXCG01331() {
		return _XCG01331;
	}

	public void setXCG01331(String XCG01331) {
		_XCG01331 = XCG01331;
	}

	public String getXCG01332() {
		return _XCG01332;
	}

	public void setXCG01332(String XCG01332) {
		_XCG01332 = XCG01332;
	}

	public String getXCG01333() {
		return _XCG01333;
	}

	public void setXCG01333(String XCG01333) {
		_XCG01333 = XCG01333;
	}

	public String getXCG01334() {
		return _XCG01334;
	}

	public void setXCG01334(String XCG01334) {
		_XCG01334 = XCG01334;
	}

	public String getXCG01335() {
		return _XCG01335;
	}

	public void setXCG01335(String XCG01335) {
		_XCG01335 = XCG01335;
	}

	public String getXCG01336() {
		return _XCG01336;
	}

	public void setXCG01336(String XCG01336) {
		_XCG01336 = XCG01336;
	}

	public String getXCG01337() {
		return _XCG01337;
	}

	public void setXCG01337(String XCG01337) {
		_XCG01337 = XCG01337;
	}

	public String getXCG01338() {
		return _XCG01338;
	}

	public void setXCG01338(String XCG01338) {
		_XCG01338 = XCG01338;
	}

	public String getXCG01339() {
		return _XCG01339;
	}

	public void setXCG01339(String XCG01339) {
		_XCG01339 = XCG01339;
	}

	public String getXCG01340() {
		return _XCG01340;
	}

	public void setXCG01340(String XCG01340) {
		_XCG01340 = XCG01340;
	}

	public String getXCG01341() {
		return _XCG01341;
	}

	public void setXCG01341(String XCG01341) {
		_XCG01341 = XCG01341;
	}

	public String getXCG01342() {
		return _XCG01342;
	}

	public void setXCG01342(String XCG01342) {
		_XCG01342 = XCG01342;
	}

	public String getXCG01343() {
		return _XCG01343;
	}

	public void setXCG01343(String XCG01343) {
		_XCG01343 = XCG01343;
	}

	public String getXCG01344() {
		return _XCG01344;
	}

	public void setXCG01344(String XCG01344) {
		_XCG01344 = XCG01344;
	}

	public String getXCG01345() {
		return _XCG01345;
	}

	public void setXCG01345(String XCG01345) {
		_XCG01345 = XCG01345;
	}

	public String getXCG01346() {
		return _XCG01346;
	}

	public void setXCG01346(String XCG01346) {
		_XCG01346 = XCG01346;
	}

	public String getXCG01347() {
		return _XCG01347;
	}

	public void setXCG01347(String XCG01347) {
		_XCG01347 = XCG01347;
	}

	public String getXCG01348() {
		return _XCG01348;
	}

	public void setXCG01348(String XCG01348) {
		_XCG01348 = XCG01348;
	}

	public String getXCG01349() {
		return _XCG01349;
	}

	public void setXCG01349(String XCG01349) {
		_XCG01349 = XCG01349;
	}

	public String getXCG01350() {
		return _XCG01350;
	}

	public void setXCG01350(String XCG01350) {
		_XCG01350 = XCG01350;
	}

	public String getXCG01351() {
		return _XCG01351;
	}

	public void setXCG01351(String XCG01351) {
		_XCG01351 = XCG01351;
	}

	public String getXCG01352() {
		return _XCG01352;
	}

	public void setXCG01352(String XCG01352) {
		_XCG01352 = XCG01352;
	}

	public String getXCG01353() {
		return _XCG01353;
	}

	public void setXCG01353(String XCG01353) {
		_XCG01353 = XCG01353;
	}

	public String getXCG01354() {
		return _XCG01354;
	}

	public void setXCG01354(String XCG01354) {
		_XCG01354 = XCG01354;
	}

	public String getXCG01355() {
		return _XCG01355;
	}

	public void setXCG01355(String XCG01355) {
		_XCG01355 = XCG01355;
	}

	public String getXCG01356() {
		return _XCG01356;
	}

	public void setXCG01356(String XCG01356) {
		_XCG01356 = XCG01356;
	}

	public String getXCG01357() {
		return _XCG01357;
	}

	public void setXCG01357(String XCG01357) {
		_XCG01357 = XCG01357;
	}

	public String getXCG01358() {
		return _XCG01358;
	}

	public void setXCG01358(String XCG01358) {
		_XCG01358 = XCG01358;
	}

	public String getXCG01359() {
		return _XCG01359;
	}

	public void setXCG01359(String XCG01359) {
		_XCG01359 = XCG01359;
	}

	public String getXCG01360() {
		return _XCG01360;
	}

	public void setXCG01360(String XCG01360) {
		_XCG01360 = XCG01360;
	}

	public String getXCG01361() {
		return _XCG01361;
	}

	public void setXCG01361(String XCG01361) {
		_XCG01361 = XCG01361;
	}

	public String getXCG01362() {
		return _XCG01362;
	}

	public void setXCG01362(String XCG01362) {
		_XCG01362 = XCG01362;
	}

	public String getXCG01363() {
		return _XCG01363;
	}

	public void setXCG01363(String XCG01363) {
		_XCG01363 = XCG01363;
	}

	public String getXCG01364() {
		return _XCG01364;
	}

	public void setXCG01364(String XCG01364) {
		_XCG01364 = XCG01364;
	}

	public String getXCG01365() {
		return _XCG01365;
	}

	public void setXCG01365(String XCG01365) {
		_XCG01365 = XCG01365;
	}

	public String getXCG01366() {
		return _XCG01366;
	}

	public void setXCG01366(String XCG01366) {
		_XCG01366 = XCG01366;
	}

	public String getXCG01367() {
		return _XCG01367;
	}

	public void setXCG01367(String XCG01367) {
		_XCG01367 = XCG01367;
	}

	public String getXCG01368() {
		return _XCG01368;
	}

	public void setXCG01368(String XCG01368) {
		_XCG01368 = XCG01368;
	}

	public String getXCG01369() {
		return _XCG01369;
	}

	public void setXCG01369(String XCG01369) {
		_XCG01369 = XCG01369;
	}

	public String getXCG01370() {
		return _XCG01370;
	}

	public void setXCG01370(String XCG01370) {
		_XCG01370 = XCG01370;
	}

	public String getXCG01371() {
		return _XCG01371;
	}

	public void setXCG01371(String XCG01371) {
		_XCG01371 = XCG01371;
	}

	public String getXCG01372() {
		return _XCG01372;
	}

	public void setXCG01372(String XCG01372) {
		_XCG01372 = XCG01372;
	}

	public String getXCG01373() {
		return _XCG01373;
	}

	public void setXCG01373(String XCG01373) {
		_XCG01373 = XCG01373;
	}

	public String getXCG01374() {
		return _XCG01374;
	}

	public void setXCG01374(String XCG01374) {
		_XCG01374 = XCG01374;
	}

	public String getXCG01375() {
		return _XCG01375;
	}

	public void setXCG01375(String XCG01375) {
		_XCG01375 = XCG01375;
	}

	public String getXCG01376() {
		return _XCG01376;
	}

	public void setXCG01376(String XCG01376) {
		_XCG01376 = XCG01376;
	}

	public String getXCG01377() {
		return _XCG01377;
	}

	public void setXCG01377(String XCG01377) {
		_XCG01377 = XCG01377;
	}

	public String getXCG01378() {
		return _XCG01378;
	}

	public void setXCG01378(String XCG01378) {
		_XCG01378 = XCG01378;
	}

	public String getXCG01379() {
		return _XCG01379;
	}

	public void setXCG01379(String XCG01379) {
		_XCG01379 = XCG01379;
	}

	public String getXCG01381() {
		return _XCG01381;
	}

	public void setXCG01381(String XCG01381) {
		_XCG01381 = XCG01381;
	}

	public String getXCG01382() {
		return _XCG01382;
	}

	public void setXCG01382(String XCG01382) {
		_XCG01382 = XCG01382;
	}

	public String getXCG01383() {
		return _XCG01383;
	}

	public void setXCG01383(String XCG01383) {
		_XCG01383 = XCG01383;
	}

	public String getXCG01384() {
		return _XCG01384;
	}

	public void setXCG01384(String XCG01384) {
		_XCG01384 = XCG01384;
	}

	public String getXCG01385() {
		return _XCG01385;
	}

	public void setXCG01385(String XCG01385) {
		_XCG01385 = XCG01385;
	}

	public String getXCG01386() {
		return _XCG01386;
	}

	public void setXCG01386(String XCG01386) {
		_XCG01386 = XCG01386;
	}

	public String getXCG01387() {
		return _XCG01387;
	}

	public void setXCG01387(String XCG01387) {
		_XCG01387 = XCG01387;
	}

	public String getXCG01388() {
		return _XCG01388;
	}

	public void setXCG01388(String XCG01388) {
		_XCG01388 = XCG01388;
	}

	public String getXCG01389() {
		return _XCG01389;
	}

	public void setXCG01389(String XCG01389) {
		_XCG01389 = XCG01389;
	}

	public String getXCG01390() {
		return _XCG01390;
	}

	public void setXCG01390(String XCG01390) {
		_XCG01390 = XCG01390;
	}

	public String getXCG01391() {
		return _XCG01391;
	}

	public void setXCG01391(String XCG01391) {
		_XCG01391 = XCG01391;
	}

	public String getXCG01392() {
		return _XCG01392;
	}

	public void setXCG01392(String XCG01392) {
		_XCG01392 = XCG01392;
	}

	public String getXCG01393() {
		return _XCG01393;
	}

	public void setXCG01393(String XCG01393) {
		_XCG01393 = XCG01393;
	}

	public String getXCG01394() {
		return _XCG01394;
	}

	public void setXCG01394(String XCG01394) {
		_XCG01394 = XCG01394;
	}

	public String getXCG01395() {
		return _XCG01395;
	}

	public void setXCG01395(String XCG01395) {
		_XCG01395 = XCG01395;
	}

	public String getXCG01396() {
		return _XCG01396;
	}

	public void setXCG01396(String XCG01396) {
		_XCG01396 = XCG01396;
	}

	public String getXCG01397() {
		return _XCG01397;
	}

	public void setXCG01397(String XCG01397) {
		_XCG01397 = XCG01397;
	}

	public String getXCG01398() {
		return _XCG01398;
	}

	public void setXCG01398(String XCG01398) {
		_XCG01398 = XCG01398;
	}

	public String getXCG01399() {
		return _XCG01399;
	}

	public void setXCG01399(String XCG01399) {
		_XCG01399 = XCG01399;
	}

	public String getXCG01400() {
		return _XCG01400;
	}

	public void setXCG01400(String XCG01400) {
		_XCG01400 = XCG01400;
	}

	public String getXCG01402() {
		return _XCG01402;
	}

	public void setXCG01402(String XCG01402) {
		_XCG01402 = XCG01402;
	}

	public String getXCG01403() {
		return _XCG01403;
	}

	public void setXCG01403(String XCG01403) {
		_XCG01403 = XCG01403;
	}

	public String getXCG01404() {
		return _XCG01404;
	}

	public void setXCG01404(String XCG01404) {
		_XCG01404 = XCG01404;
	}

	public String getXCG01405() {
		return _XCG01405;
	}

	public void setXCG01405(String XCG01405) {
		_XCG01405 = XCG01405;
	}

	public String getXCG01406() {
		return _XCG01406;
	}

	public void setXCG01406(String XCG01406) {
		_XCG01406 = XCG01406;
	}

	public String getXCG01407() {
		return _XCG01407;
	}

	public void setXCG01407(String XCG01407) {
		_XCG01407 = XCG01407;
	}

	public String getXCG01408() {
		return _XCG01408;
	}

	public void setXCG01408(String XCG01408) {
		_XCG01408 = XCG01408;
	}

	public String getXCG01409() {
		return _XCG01409;
	}

	public void setXCG01409(String XCG01409) {
		_XCG01409 = XCG01409;
	}

	public String getXCG01410() {
		return _XCG01410;
	}

	public void setXCG01410(String XCG01410) {
		_XCG01410 = XCG01410;
	}

	public String getXCG01411() {
		return _XCG01411;
	}

	public void setXCG01411(String XCG01411) {
		_XCG01411 = XCG01411;
	}

	public String getXCG01412() {
		return _XCG01412;
	}

	public void setXCG01412(String XCG01412) {
		_XCG01412 = XCG01412;
	}

	public String getXCG01413() {
		return _XCG01413;
	}

	public void setXCG01413(String XCG01413) {
		_XCG01413 = XCG01413;
	}

	public String getXCG01414() {
		return _XCG01414;
	}

	public void setXCG01414(String XCG01414) {
		_XCG01414 = XCG01414;
	}

	public String getXCG01415() {
		return _XCG01415;
	}

	public void setXCG01415(String XCG01415) {
		_XCG01415 = XCG01415;
	}

	public String getXCG01416() {
		return _XCG01416;
	}

	public void setXCG01416(String XCG01416) {
		_XCG01416 = XCG01416;
	}

	public String getXCG01417() {
		return _XCG01417;
	}

	public void setXCG01417(String XCG01417) {
		_XCG01417 = XCG01417;
	}

	public String getXCG01418() {
		return _XCG01418;
	}

	public void setXCG01418(String XCG01418) {
		_XCG01418 = XCG01418;
	}

	public String getXCG01419() {
		return _XCG01419;
	}

	public void setXCG01419(String XCG01419) {
		_XCG01419 = XCG01419;
	}

	public String getXCG01420() {
		return _XCG01420;
	}

	public void setXCG01420(String XCG01420) {
		_XCG01420 = XCG01420;
	}

	public String getXCG01421() {
		return _XCG01421;
	}

	public void setXCG01421(String XCG01421) {
		_XCG01421 = XCG01421;
	}

	public String getXCG01422() {
		return _XCG01422;
	}

	public void setXCG01422(String XCG01422) {
		_XCG01422 = XCG01422;
	}

	public String getXCG01423() {
		return _XCG01423;
	}

	public void setXCG01423(String XCG01423) {
		_XCG01423 = XCG01423;
	}

	public String getXCG01424() {
		return _XCG01424;
	}

	public void setXCG01424(String XCG01424) {
		_XCG01424 = XCG01424;
	}

	public String getXCG01425() {
		return _XCG01425;
	}

	public void setXCG01425(String XCG01425) {
		_XCG01425 = XCG01425;
	}

	public String getXCG01426() {
		return _XCG01426;
	}

	public void setXCG01426(String XCG01426) {
		_XCG01426 = XCG01426;
	}

	public String getXCG01427() {
		return _XCG01427;
	}

	public void setXCG01427(String XCG01427) {
		_XCG01427 = XCG01427;
	}

	public String getXCG01428() {
		return _XCG01428;
	}

	public void setXCG01428(String XCG01428) {
		_XCG01428 = XCG01428;
	}

	public String getXCG01437() {
		return _XCG01437;
	}

	public void setXCG01437(String XCG01437) {
		_XCG01437 = XCG01437;
	}

	public String getXCG01429() {
		return _XCG01429;
	}

	public void setXCG01429(String XCG01429) {
		_XCG01429 = XCG01429;
	}

	public String getXCG01430() {
		return _XCG01430;
	}

	public void setXCG01430(String XCG01430) {
		_XCG01430 = XCG01430;
	}

	public String getXCG01431() {
		return _XCG01431;
	}

	public void setXCG01431(String XCG01431) {
		_XCG01431 = XCG01431;
	}

	public String getXCG01432() {
		return _XCG01432;
	}

	public void setXCG01432(String XCG01432) {
		_XCG01432 = XCG01432;
	}

	public String getXCG01433() {
		return _XCG01433;
	}

	public void setXCG01433(String XCG01433) {
		_XCG01433 = XCG01433;
	}

	public String getXCG01434() {
		return _XCG01434;
	}

	public void setXCG01434(String XCG01434) {
		_XCG01434 = XCG01434;
	}

	public String getXCG01435() {
		return _XCG01435;
	}

	public void setXCG01435(String XCG01435) {
		_XCG01435 = XCG01435;
	}

	public String getXCG01436() {
		return _XCG01436;
	}

	public void setXCG01436(String XCG01436) {
		_XCG01436 = XCG01436;
	}

	public String getXCG01439() {
		return _XCG01439;
	}

	public void setXCG01439(String XCG01439) {
		_XCG01439 = XCG01439;
	}

	public String getXCG01440() {
		return _XCG01440;
	}

	public void setXCG01440(String XCG01440) {
		_XCG01440 = XCG01440;
	}

	public String getXCG01441() {
		return _XCG01441;
	}

	public void setXCG01441(String XCG01441) {
		_XCG01441 = XCG01441;
	}

	public String getXCG01442() {
		return _XCG01442;
	}

	public void setXCG01442(String XCG01442) {
		_XCG01442 = XCG01442;
	}

	public String getXCG01443() {
		return _XCG01443;
	}

	public void setXCG01443(String XCG01443) {
		_XCG01443 = XCG01443;
	}

	public String getXCG01445() {
		return _XCG01445;
	}

	public void setXCG01445(String XCG01445) {
		_XCG01445 = XCG01445;
	}

	public String getXCG01446() {
		return _XCG01446;
	}

	public void setXCG01446(String XCG01446) {
		_XCG01446 = XCG01446;
	}

	public String getXCG01447() {
		return _XCG01447;
	}

	public void setXCG01447(String XCG01447) {
		_XCG01447 = XCG01447;
	}

	public String getXCG01448() {
		return _XCG01448;
	}

	public void setXCG01448(String XCG01448) {
		_XCG01448 = XCG01448;
	}

	public String getXCG01449() {
		return _XCG01449;
	}

	public void setXCG01449(String XCG01449) {
		_XCG01449 = XCG01449;
	}

	public String getXCG01450() {
		return _XCG01450;
	}

	public void setXCG01450(String XCG01450) {
		_XCG01450 = XCG01450;
	}

	public String getXCG01451() {
		return _XCG01451;
	}

	public void setXCG01451(String XCG01451) {
		_XCG01451 = XCG01451;
	}

	public String getXCG01452() {
		return _XCG01452;
	}

	public void setXCG01452(String XCG01452) {
		_XCG01452 = XCG01452;
	}

	public String getXCG01453() {
		return _XCG01453;
	}

	public void setXCG01453(String XCG01453) {
		_XCG01453 = XCG01453;
	}

	public String getXCG01454() {
		return _XCG01454;
	}

	public void setXCG01454(String XCG01454) {
		_XCG01454 = XCG01454;
	}

	public String getXCG01455() {
		return _XCG01455;
	}

	public void setXCG01455(String XCG01455) {
		_XCG01455 = XCG01455;
	}

	public String getXCG01456() {
		return _XCG01456;
	}

	public void setXCG01456(String XCG01456) {
		_XCG01456 = XCG01456;
	}

	public String getXCG01457() {
		return _XCG01457;
	}

	public void setXCG01457(String XCG01457) {
		_XCG01457 = XCG01457;
	}

	public String getXCG01458() {
		return _XCG01458;
	}

	public void setXCG01458(String XCG01458) {
		_XCG01458 = XCG01458;
	}

	public String getXCG01459() {
		return _XCG01459;
	}

	public void setXCG01459(String XCG01459) {
		_XCG01459 = XCG01459;
	}

	public String getXCG01460() {
		return _XCG01460;
	}

	public void setXCG01460(String XCG01460) {
		_XCG01460 = XCG01460;
	}

	public String getXCG01461() {
		return _XCG01461;
	}

	public void setXCG01461(String XCG01461) {
		_XCG01461 = XCG01461;
	}

	public String getXCG01462() {
		return _XCG01462;
	}

	public void setXCG01462(String XCG01462) {
		_XCG01462 = XCG01462;
	}

	public String getXCG01463() {
		return _XCG01463;
	}

	public void setXCG01463(String XCG01463) {
		_XCG01463 = XCG01463;
	}

	public String getXCG01464() {
		return _XCG01464;
	}

	public void setXCG01464(String XCG01464) {
		_XCG01464 = XCG01464;
	}

	public String getXCG01465() {
		return _XCG01465;
	}

	public void setXCG01465(String XCG01465) {
		_XCG01465 = XCG01465;
	}

	public String getXCG01466() {
		return _XCG01466;
	}

	public void setXCG01466(String XCG01466) {
		_XCG01466 = XCG01466;
	}

	public String getXCG01467() {
		return _XCG01467;
	}

	public void setXCG01467(String XCG01467) {
		_XCG01467 = XCG01467;
	}

	public String getXCG01468() {
		return _XCG01468;
	}

	public void setXCG01468(String XCG01468) {
		_XCG01468 = XCG01468;
	}

	public String getXCG01469() {
		return _XCG01469;
	}

	public void setXCG01469(String XCG01469) {
		_XCG01469 = XCG01469;
	}

	public String getXCG01470() {
		return _XCG01470;
	}

	public void setXCG01470(String XCG01470) {
		_XCG01470 = XCG01470;
	}

	public String getXCG01471() {
		return _XCG01471;
	}

	public void setXCG01471(String XCG01471) {
		_XCG01471 = XCG01471;
	}

	public String getXCG01472() {
		return _XCG01472;
	}

	public void setXCG01472(String XCG01472) {
		_XCG01472 = XCG01472;
	}

	public String getXCG01473() {
		return _XCG01473;
	}

	public void setXCG01473(String XCG01473) {
		_XCG01473 = XCG01473;
	}

	public String getXCG01474() {
		return _XCG01474;
	}

	public void setXCG01474(String XCG01474) {
		_XCG01474 = XCG01474;
	}

	public String getXCG01475() {
		return _XCG01475;
	}

	public void setXCG01475(String XCG01475) {
		_XCG01475 = XCG01475;
	}

	public String getXCG01476() {
		return _XCG01476;
	}

	public void setXCG01476(String XCG01476) {
		_XCG01476 = XCG01476;
	}

	public String getXCG01477() {
		return _XCG01477;
	}

	public void setXCG01477(String XCG01477) {
		_XCG01477 = XCG01477;
	}

	public String getXCG01478() {
		return _XCG01478;
	}

	public void setXCG01478(String XCG01478) {
		_XCG01478 = XCG01478;
	}

	public String getXCG01479() {
		return _XCG01479;
	}

	public void setXCG01479(String XCG01479) {
		_XCG01479 = XCG01479;
	}

	public String getXCG01480() {
		return _XCG01480;
	}

	public void setXCG01480(String XCG01480) {
		_XCG01480 = XCG01480;
	}

	public String getXCG01481() {
		return _XCG01481;
	}

	public void setXCG01481(String XCG01481) {
		_XCG01481 = XCG01481;
	}

	public String getXCG01482() {
		return _XCG01482;
	}

	public void setXCG01482(String XCG01482) {
		_XCG01482 = XCG01482;
	}

	public String getXCG01483() {
		return _XCG01483;
	}

	public void setXCG01483(String XCG01483) {
		_XCG01483 = XCG01483;
	}

	public String getXCG01484() {
		return _XCG01484;
	}

	public void setXCG01484(String XCG01484) {
		_XCG01484 = XCG01484;
	}

	public String getXCG01485() {
		return _XCG01485;
	}

	public void setXCG01485(String XCG01485) {
		_XCG01485 = XCG01485;
	}

	public String getXCG01486() {
		return _XCG01486;
	}

	public void setXCG01486(String XCG01486) {
		_XCG01486 = XCG01486;
	}

	public String getXCG01487() {
		return _XCG01487;
	}

	public void setXCG01487(String XCG01487) {
		_XCG01487 = XCG01487;
	}

	public String getXCG01488() {
		return _XCG01488;
	}

	public void setXCG01488(String XCG01488) {
		_XCG01488 = XCG01488;
	}

	public String getXCG01489() {
		return _XCG01489;
	}

	public void setXCG01489(String XCG01489) {
		_XCG01489 = XCG01489;
	}

	public String getXCG01490() {
		return _XCG01490;
	}

	public void setXCG01490(String XCG01490) {
		_XCG01490 = XCG01490;
	}

	public String getXCG01491() {
		return _XCG01491;
	}

	public void setXCG01491(String XCG01491) {
		_XCG01491 = XCG01491;
	}

	public String getXCG01492() {
		return _XCG01492;
	}

	public void setXCG01492(String XCG01492) {
		_XCG01492 = XCG01492;
	}

	public String getXCG01493() {
		return _XCG01493;
	}

	public void setXCG01493(String XCG01493) {
		_XCG01493 = XCG01493;
	}

	public String getXCG01494() {
		return _XCG01494;
	}

	public void setXCG01494(String XCG01494) {
		_XCG01494 = XCG01494;
	}

	public String getXCG01496() {
		return _XCG01496;
	}

	public void setXCG01496(String XCG01496) {
		_XCG01496 = XCG01496;
	}

	public String getXCG01497() {
		return _XCG01497;
	}

	public void setXCG01497(String XCG01497) {
		_XCG01497 = XCG01497;
	}

	public String getXCG01498() {
		return _XCG01498;
	}

	public void setXCG01498(String XCG01498) {
		_XCG01498 = XCG01498;
	}

	public String getXCG01499() {
		return _XCG01499;
	}

	public void setXCG01499(String XCG01499) {
		_XCG01499 = XCG01499;
	}

	public String getXCG01500() {
		return _XCG01500;
	}

	public void setXCG01500(String XCG01500) {
		_XCG01500 = XCG01500;
	}

	public String getXCG01501() {
		return _XCG01501;
	}

	public void setXCG01501(String XCG01501) {
		_XCG01501 = XCG01501;
	}

	public String getXCG01502() {
		return _XCG01502;
	}

	public void setXCG01502(String XCG01502) {
		_XCG01502 = XCG01502;
	}

	public String getXCG01503() {
		return _XCG01503;
	}

	public void setXCG01503(String XCG01503) {
		_XCG01503 = XCG01503;
	}

	public String getXCG01504() {
		return _XCG01504;
	}

	public void setXCG01504(String XCG01504) {
		_XCG01504 = XCG01504;
	}

	public String getXCG01505() {
		return _XCG01505;
	}

	public void setXCG01505(String XCG01505) {
		_XCG01505 = XCG01505;
	}

	public String getXCG01506() {
		return _XCG01506;
	}

	public void setXCG01506(String XCG01506) {
		_XCG01506 = XCG01506;
	}

	public String getXCG01507() {
		return _XCG01507;
	}

	public void setXCG01507(String XCG01507) {
		_XCG01507 = XCG01507;
	}

	public String getXCG01508() {
		return _XCG01508;
	}

	public void setXCG01508(String XCG01508) {
		_XCG01508 = XCG01508;
	}

	public String getXCG01509() {
		return _XCG01509;
	}

	public void setXCG01509(String XCG01509) {
		_XCG01509 = XCG01509;
	}

	public String getXCG01510() {
		return _XCG01510;
	}

	public void setXCG01510(String XCG01510) {
		_XCG01510 = XCG01510;
	}

	public String getXCG01512() {
		return _XCG01512;
	}

	public void setXCG01512(String XCG01512) {
		_XCG01512 = XCG01512;
	}

	public String getXCG01513() {
		return _XCG01513;
	}

	public void setXCG01513(String XCG01513) {
		_XCG01513 = XCG01513;
	}

	public String getXCG01514() {
		return _XCG01514;
	}

	public void setXCG01514(String XCG01514) {
		_XCG01514 = XCG01514;
	}

	public String getXCG01515() {
		return _XCG01515;
	}

	public void setXCG01515(String XCG01515) {
		_XCG01515 = XCG01515;
	}

	public String getXCG01516() {
		return _XCG01516;
	}

	public void setXCG01516(String XCG01516) {
		_XCG01516 = XCG01516;
	}

	public String getXCG01517() {
		return _XCG01517;
	}

	public void setXCG01517(String XCG01517) {
		_XCG01517 = XCG01517;
	}

	public String getXCG01518() {
		return _XCG01518;
	}

	public void setXCG01518(String XCG01518) {
		_XCG01518 = XCG01518;
	}

	public String getXCG01519() {
		return _XCG01519;
	}

	public void setXCG01519(String XCG01519) {
		_XCG01519 = XCG01519;
	}

	public String getXCG01520() {
		return _XCG01520;
	}

	public void setXCG01520(String XCG01520) {
		_XCG01520 = XCG01520;
	}

	public String getXCG01521() {
		return _XCG01521;
	}

	public void setXCG01521(String XCG01521) {
		_XCG01521 = XCG01521;
	}

	public String getXCG01522() {
		return _XCG01522;
	}

	public void setXCG01522(String XCG01522) {
		_XCG01522 = XCG01522;
	}

	public String getXCG01523() {
		return _XCG01523;
	}

	public void setXCG01523(String XCG01523) {
		_XCG01523 = XCG01523;
	}

	public String getXCG01524() {
		return _XCG01524;
	}

	public void setXCG01524(String XCG01524) {
		_XCG01524 = XCG01524;
	}

	public String getXCG01525() {
		return _XCG01525;
	}

	public void setXCG01525(String XCG01525) {
		_XCG01525 = XCG01525;
	}

	public String getXCG01526() {
		return _XCG01526;
	}

	public void setXCG01526(String XCG01526) {
		_XCG01526 = XCG01526;
	}

	public String getXCG01527() {
		return _XCG01527;
	}

	public void setXCG01527(String XCG01527) {
		_XCG01527 = XCG01527;
	}

	public String getXCG01528() {
		return _XCG01528;
	}

	public void setXCG01528(String XCG01528) {
		_XCG01528 = XCG01528;
	}

	public String getXCG01529() {
		return _XCG01529;
	}

	public void setXCG01529(String XCG01529) {
		_XCG01529 = XCG01529;
	}

	public String getXCG01530() {
		return _XCG01530;
	}

	public void setXCG01530(String XCG01530) {
		_XCG01530 = XCG01530;
	}

	public String getXCG01531() {
		return _XCG01531;
	}

	public void setXCG01531(String XCG01531) {
		_XCG01531 = XCG01531;
	}

	public String getXCG01904() {
		return _XCG01904;
	}

	public void setXCG01904(String XCG01904) {
		_XCG01904 = XCG01904;
	}

	public String getXCG01533() {
		return _XCG01533;
	}

	public void setXCG01533(String XCG01533) {
		_XCG01533 = XCG01533;
	}

	public String getXCG01905() {
		return _XCG01905;
	}

	public void setXCG01905(String XCG01905) {
		_XCG01905 = XCG01905;
	}

	public String getXCG01534() {
		return _XCG01534;
	}

	public void setXCG01534(String XCG01534) {
		_XCG01534 = XCG01534;
	}

	public String getXCG01906() {
		return _XCG01906;
	}

	public void setXCG01906(String XCG01906) {
		_XCG01906 = XCG01906;
	}

	public String getXCG01535() {
		return _XCG01535;
	}

	public void setXCG01535(String XCG01535) {
		_XCG01535 = XCG01535;
	}

	public String getXCG01907() {
		return _XCG01907;
	}

	public void setXCG01907(String XCG01907) {
		_XCG01907 = XCG01907;
	}

	public String getXCG01536() {
		return _XCG01536;
	}

	public void setXCG01536(String XCG01536) {
		_XCG01536 = XCG01536;
	}

	public String getXCG01908() {
		return _XCG01908;
	}

	public void setXCG01908(String XCG01908) {
		_XCG01908 = XCG01908;
	}

	public String getXCG01537() {
		return _XCG01537;
	}

	public void setXCG01537(String XCG01537) {
		_XCG01537 = XCG01537;
	}

	public String getXCG01909() {
		return _XCG01909;
	}

	public void setXCG01909(String XCG01909) {
		_XCG01909 = XCG01909;
	}

	public String getXCG01538() {
		return _XCG01538;
	}

	public void setXCG01538(String XCG01538) {
		_XCG01538 = XCG01538;
	}

	public String getXCG01910() {
		return _XCG01910;
	}

	public void setXCG01910(String XCG01910) {
		_XCG01910 = XCG01910;
	}

	public String getXCG01539() {
		return _XCG01539;
	}

	public void setXCG01539(String XCG01539) {
		_XCG01539 = XCG01539;
	}

	public String getXCG11535() {
		return _XCG11535;
	}

	public void setXCG11535(String XCG11535) {
		_XCG11535 = XCG11535;
	}

	public String getXCG01541() {
		return _XCG01541;
	}

	public void setXCG01541(String XCG01541) {
		_XCG01541 = XCG01541;
	}

	public String getXCG01542() {
		return _XCG01542;
	}

	public void setXCG01542(String XCG01542) {
		_XCG01542 = XCG01542;
	}

	public String getXCG01911() {
		return _XCG01911;
	}

	public void setXCG01911(String XCG01911) {
		_XCG01911 = XCG01911;
	}

	public String getXCG01543() {
		return _XCG01543;
	}

	public void setXCG01543(String XCG01543) {
		_XCG01543 = XCG01543;
	}

	public String getXCG01912() {
		return _XCG01912;
	}

	public void setXCG01912(String XCG01912) {
		_XCG01912 = XCG01912;
	}

	public String getXCG01544() {
		return _XCG01544;
	}

	public void setXCG01544(String XCG01544) {
		_XCG01544 = XCG01544;
	}

	public String getXCG01545() {
		return _XCG01545;
	}

	public void setXCG01545(String XCG01545) {
		_XCG01545 = XCG01545;
	}

	public String getXCG01546() {
		return _XCG01546;
	}

	public void setXCG01546(String XCG01546) {
		_XCG01546 = XCG01546;
	}

	public String getXCG01547() {
		return _XCG01547;
	}

	public void setXCG01547(String XCG01547) {
		_XCG01547 = XCG01547;
	}

	public String getXCG01548() {
		return _XCG01548;
	}

	public void setXCG01548(String XCG01548) {
		_XCG01548 = XCG01548;
	}

	public String getXCG01913() {
		return _XCG01913;
	}

	public void setXCG01913(String XCG01913) {
		_XCG01913 = XCG01913;
	}

	public String getXCG01549() {
		return _XCG01549;
	}

	public void setXCG01549(String XCG01549) {
		_XCG01549 = XCG01549;
	}

	public String getXCG01914() {
		return _XCG01914;
	}

	public void setXCG01914(String XCG01914) {
		_XCG01914 = XCG01914;
	}

	public String getXCG01550() {
		return _XCG01550;
	}

	public void setXCG01550(String XCG01550) {
		_XCG01550 = XCG01550;
	}

	public String getXCG01551() {
		return _XCG01551;
	}

	public void setXCG01551(String XCG01551) {
		_XCG01551 = XCG01551;
	}

	public String getXCG01552() {
		return _XCG01552;
	}

	public void setXCG01552(String XCG01552) {
		_XCG01552 = XCG01552;
	}

	public String getXCG01553() {
		return _XCG01553;
	}

	public void setXCG01553(String XCG01553) {
		_XCG01553 = XCG01553;
	}

	public String getXCG01554() {
		return _XCG01554;
	}

	public void setXCG01554(String XCG01554) {
		_XCG01554 = XCG01554;
	}

	public String getXCG01915() {
		return _XCG01915;
	}

	public void setXCG01915(String XCG01915) {
		_XCG01915 = XCG01915;
	}

	public String getXCG01555() {
		return _XCG01555;
	}

	public void setXCG01555(String XCG01555) {
		_XCG01555 = XCG01555;
	}

	public String getXCG01556() {
		return _XCG01556;
	}

	public void setXCG01556(String XCG01556) {
		_XCG01556 = XCG01556;
	}

	public String getXCG01557() {
		return _XCG01557;
	}

	public void setXCG01557(String XCG01557) {
		_XCG01557 = XCG01557;
	}

	public String getXCG01558() {
		return _XCG01558;
	}

	public void setXCG01558(String XCG01558) {
		_XCG01558 = XCG01558;
	}

	public String getXCG01559() {
		return _XCG01559;
	}

	public void setXCG01559(String XCG01559) {
		_XCG01559 = XCG01559;
	}

	public String getXCG01560() {
		return _XCG01560;
	}

	public void setXCG01560(String XCG01560) {
		_XCG01560 = XCG01560;
	}

	public String getXCG01561() {
		return _XCG01561;
	}

	public void setXCG01561(String XCG01561) {
		_XCG01561 = XCG01561;
	}

	public String getXCG01916() {
		return _XCG01916;
	}

	public void setXCG01916(String XCG01916) {
		_XCG01916 = XCG01916;
	}

	public String getXCG01562() {
		return _XCG01562;
	}

	public void setXCG01562(String XCG01562) {
		_XCG01562 = XCG01562;
	}

	public String getXCG01917() {
		return _XCG01917;
	}

	public void setXCG01917(String XCG01917) {
		_XCG01917 = XCG01917;
	}

	public String getXCG01563() {
		return _XCG01563;
	}

	public void setXCG01563(String XCG01563) {
		_XCG01563 = XCG01563;
	}

	public String getXCG01918() {
		return _XCG01918;
	}

	public void setXCG01918(String XCG01918) {
		_XCG01918 = XCG01918;
	}

	public String getXCG01564() {
		return _XCG01564;
	}

	public void setXCG01564(String XCG01564) {
		_XCG01564 = XCG01564;
	}

	public String getXCG01565() {
		return _XCG01565;
	}

	public void setXCG01565(String XCG01565) {
		_XCG01565 = XCG01565;
	}

	public String getXCG01566() {
		return _XCG01566;
	}

	public void setXCG01566(String XCG01566) {
		_XCG01566 = XCG01566;
	}

	public String getXCG01567() {
		return _XCG01567;
	}

	public void setXCG01567(String XCG01567) {
		_XCG01567 = XCG01567;
	}

	public String getXCG01568() {
		return _XCG01568;
	}

	public void setXCG01568(String XCG01568) {
		_XCG01568 = XCG01568;
	}

	public String getXCG01919() {
		return _XCG01919;
	}

	public void setXCG01919(String XCG01919) {
		_XCG01919 = XCG01919;
	}

	public String getXCG01569() {
		return _XCG01569;
	}

	public void setXCG01569(String XCG01569) {
		_XCG01569 = XCG01569;
	}

	public String getXCG01570() {
		return _XCG01570;
	}

	public void setXCG01570(String XCG01570) {
		_XCG01570 = XCG01570;
	}

	public String getXCG01571() {
		return _XCG01571;
	}

	public void setXCG01571(String XCG01571) {
		_XCG01571 = XCG01571;
	}

	public String getXCG01572() {
		return _XCG01572;
	}

	public void setXCG01572(String XCG01572) {
		_XCG01572 = XCG01572;
	}

	public String getXCG01920() {
		return _XCG01920;
	}

	public void setXCG01920(String XCG01920) {
		_XCG01920 = XCG01920;
	}

	public String getXCG01573() {
		return _XCG01573;
	}

	public void setXCG01573(String XCG01573) {
		_XCG01573 = XCG01573;
	}

	public String getXCG01921() {
		return _XCG01921;
	}

	public void setXCG01921(String XCG01921) {
		_XCG01921 = XCG01921;
	}

	public String getXCG01574() {
		return _XCG01574;
	}

	public void setXCG01574(String XCG01574) {
		_XCG01574 = XCG01574;
	}

	public String getXCG01922() {
		return _XCG01922;
	}

	public void setXCG01922(String XCG01922) {
		_XCG01922 = XCG01922;
	}

	public String getXCG01575() {
		return _XCG01575;
	}

	public void setXCG01575(String XCG01575) {
		_XCG01575 = XCG01575;
	}

	public String getXCG01576() {
		return _XCG01576;
	}

	public void setXCG01576(String XCG01576) {
		_XCG01576 = XCG01576;
	}

	public String getXCG01577() {
		return _XCG01577;
	}

	public void setXCG01577(String XCG01577) {
		_XCG01577 = XCG01577;
	}

	public String getXCG01578() {
		return _XCG01578;
	}

	public void setXCG01578(String XCG01578) {
		_XCG01578 = XCG01578;
	}

	public String getXCG01579() {
		return _XCG01579;
	}

	public void setXCG01579(String XCG01579) {
		_XCG01579 = XCG01579;
	}

	public String getXCG01580() {
		return _XCG01580;
	}

	public void setXCG01580(String XCG01580) {
		_XCG01580 = XCG01580;
	}

	public String getXCG01581() {
		return _XCG01581;
	}

	public void setXCG01581(String XCG01581) {
		_XCG01581 = XCG01581;
	}

	public String getXCG01582() {
		return _XCG01582;
	}

	public void setXCG01582(String XCG01582) {
		_XCG01582 = XCG01582;
	}

	public String getXCG01583() {
		return _XCG01583;
	}

	public void setXCG01583(String XCG01583) {
		_XCG01583 = XCG01583;
	}

	public String getXCG01584() {
		return _XCG01584;
	}

	public void setXCG01584(String XCG01584) {
		_XCG01584 = XCG01584;
	}

	public String getXCG01585() {
		return _XCG01585;
	}

	public void setXCG01585(String XCG01585) {
		_XCG01585 = XCG01585;
	}

	public String getXCG01586() {
		return _XCG01586;
	}

	public void setXCG01586(String XCG01586) {
		_XCG01586 = XCG01586;
	}

	public String getXCG01587() {
		return _XCG01587;
	}

	public void setXCG01587(String XCG01587) {
		_XCG01587 = XCG01587;
	}

	public String getXCG01588() {
		return _XCG01588;
	}

	public void setXCG01588(String XCG01588) {
		_XCG01588 = XCG01588;
	}

	public String getXCG01589() {
		return _XCG01589;
	}

	public void setXCG01589(String XCG01589) {
		_XCG01589 = XCG01589;
	}

	public String getXCG01590() {
		return _XCG01590;
	}

	public void setXCG01590(String XCG01590) {
		_XCG01590 = XCG01590;
	}

	public String getXCG01591() {
		return _XCG01591;
	}

	public void setXCG01591(String XCG01591) {
		_XCG01591 = XCG01591;
	}

	public String getXCG01592() {
		return _XCG01592;
	}

	public void setXCG01592(String XCG01592) {
		_XCG01592 = XCG01592;
	}

	public String getXCG01593() {
		return _XCG01593;
	}

	public void setXCG01593(String XCG01593) {
		_XCG01593 = XCG01593;
	}

	public String getXCG01594() {
		return _XCG01594;
	}

	public void setXCG01594(String XCG01594) {
		_XCG01594 = XCG01594;
	}

	public String getXCG01595() {
		return _XCG01595;
	}

	public void setXCG01595(String XCG01595) {
		_XCG01595 = XCG01595;
	}

	public String getXCG01596() {
		return _XCG01596;
	}

	public void setXCG01596(String XCG01596) {
		_XCG01596 = XCG01596;
	}

	public String getXCG01597() {
		return _XCG01597;
	}

	public void setXCG01597(String XCG01597) {
		_XCG01597 = XCG01597;
	}

	public String getXCG01598() {
		return _XCG01598;
	}

	public void setXCG01598(String XCG01598) {
		_XCG01598 = XCG01598;
	}

	public String getXCG01599() {
		return _XCG01599;
	}

	public void setXCG01599(String XCG01599) {
		_XCG01599 = XCG01599;
	}

	public String getXCG01600() {
		return _XCG01600;
	}

	public void setXCG01600(String XCG01600) {
		_XCG01600 = XCG01600;
	}

	public String getXCG01601() {
		return _XCG01601;
	}

	public void setXCG01601(String XCG01601) {
		_XCG01601 = XCG01601;
	}

	public String getXCG01602() {
		return _XCG01602;
	}

	public void setXCG01602(String XCG01602) {
		_XCG01602 = XCG01602;
	}

	public String getXCG01603() {
		return _XCG01603;
	}

	public void setXCG01603(String XCG01603) {
		_XCG01603 = XCG01603;
	}

	public String getXCG01923() {
		return _XCG01923;
	}

	public void setXCG01923(String XCG01923) {
		_XCG01923 = XCG01923;
	}

	public String getXCG01604() {
		return _XCG01604;
	}

	public void setXCG01604(String XCG01604) {
		_XCG01604 = XCG01604;
	}

	public String getXCG01924() {
		return _XCG01924;
	}

	public void setXCG01924(String XCG01924) {
		_XCG01924 = XCG01924;
	}

	public String getXCG01605() {
		return _XCG01605;
	}

	public void setXCG01605(String XCG01605) {
		_XCG01605 = XCG01605;
	}

	public String getXCG01606() {
		return _XCG01606;
	}

	public void setXCG01606(String XCG01606) {
		_XCG01606 = XCG01606;
	}

	public String getXCG01607() {
		return _XCG01607;
	}

	public void setXCG01607(String XCG01607) {
		_XCG01607 = XCG01607;
	}

	public String getXCG01608() {
		return _XCG01608;
	}

	public void setXCG01608(String XCG01608) {
		_XCG01608 = XCG01608;
	}

	public String getXCG01609() {
		return _XCG01609;
	}

	public void setXCG01609(String XCG01609) {
		_XCG01609 = XCG01609;
	}

	public String getXCG01925() {
		return _XCG01925;
	}

	public void setXCG01925(String XCG01925) {
		_XCG01925 = XCG01925;
	}

	public String getXCG01610() {
		return _XCG01610;
	}

	public void setXCG01610(String XCG01610) {
		_XCG01610 = XCG01610;
	}

	public String getXCG01926() {
		return _XCG01926;
	}

	public void setXCG01926(String XCG01926) {
		_XCG01926 = XCG01926;
	}

	public String getXCG01611() {
		return _XCG01611;
	}

	public void setXCG01611(String XCG01611) {
		_XCG01611 = XCG01611;
	}

	public String getXCG01612() {
		return _XCG01612;
	}

	public void setXCG01612(String XCG01612) {
		_XCG01612 = XCG01612;
	}

	public String getXCG01928() {
		return _XCG01928;
	}

	public void setXCG01928(String XCG01928) {
		_XCG01928 = XCG01928;
	}

	public String getXCG01613() {
		return _XCG01613;
	}

	public void setXCG01613(String XCG01613) {
		_XCG01613 = XCG01613;
	}

	public String getXCG01929() {
		return _XCG01929;
	}

	public void setXCG01929(String XCG01929) {
		_XCG01929 = XCG01929;
	}

	public String getXCG01614() {
		return _XCG01614;
	}

	public void setXCG01614(String XCG01614) {
		_XCG01614 = XCG01614;
	}

	public String getXCG01930() {
		return _XCG01930;
	}

	public void setXCG01930(String XCG01930) {
		_XCG01930 = XCG01930;
	}

	public String getXCG01615() {
		return _XCG01615;
	}

	public void setXCG01615(String XCG01615) {
		_XCG01615 = XCG01615;
	}

	public String getXCG01931() {
		return _XCG01931;
	}

	public void setXCG01931(String XCG01931) {
		_XCG01931 = XCG01931;
	}

	public String getXCG01616() {
		return _XCG01616;
	}

	public void setXCG01616(String XCG01616) {
		_XCG01616 = XCG01616;
	}

	public String getXCG01932() {
		return _XCG01932;
	}

	public void setXCG01932(String XCG01932) {
		_XCG01932 = XCG01932;
	}

	public String getXCG01617() {
		return _XCG01617;
	}

	public void setXCG01617(String XCG01617) {
		_XCG01617 = XCG01617;
	}

	public String getXCG01933() {
		return _XCG01933;
	}

	public void setXCG01933(String XCG01933) {
		_XCG01933 = XCG01933;
	}

	public String getXCG01618() {
		return _XCG01618;
	}

	public void setXCG01618(String XCG01618) {
		_XCG01618 = XCG01618;
	}

	public String getXCG01934() {
		return _XCG01934;
	}

	public void setXCG01934(String XCG01934) {
		_XCG01934 = XCG01934;
	}

	public String getXCG01619() {
		return _XCG01619;
	}

	public void setXCG01619(String XCG01619) {
		_XCG01619 = XCG01619;
	}

	public String getXCG01935() {
		return _XCG01935;
	}

	public void setXCG01935(String XCG01935) {
		_XCG01935 = XCG01935;
	}

	public String getXCG01620() {
		return _XCG01620;
	}

	public void setXCG01620(String XCG01620) {
		_XCG01620 = XCG01620;
	}

	public String getXCG01936() {
		return _XCG01936;
	}

	public void setXCG01936(String XCG01936) {
		_XCG01936 = XCG01936;
	}

	public String getXCG01621() {
		return _XCG01621;
	}

	public void setXCG01621(String XCG01621) {
		_XCG01621 = XCG01621;
	}

	public String getXCG01937() {
		return _XCG01937;
	}

	public void setXCG01937(String XCG01937) {
		_XCG01937 = XCG01937;
	}

	public String getXCG01622() {
		return _XCG01622;
	}

	public void setXCG01622(String XCG01622) {
		_XCG01622 = XCG01622;
	}

	public String getXCG01938() {
		return _XCG01938;
	}

	public void setXCG01938(String XCG01938) {
		_XCG01938 = XCG01938;
	}

	public String getXCG01623() {
		return _XCG01623;
	}

	public void setXCG01623(String XCG01623) {
		_XCG01623 = XCG01623;
	}

	public String getXCG01939() {
		return _XCG01939;
	}

	public void setXCG01939(String XCG01939) {
		_XCG01939 = XCG01939;
	}

	public String getXCG01624() {
		return _XCG01624;
	}

	public void setXCG01624(String XCG01624) {
		_XCG01624 = XCG01624;
	}

	public String getXCG01940() {
		return _XCG01940;
	}

	public void setXCG01940(String XCG01940) {
		_XCG01940 = XCG01940;
	}

	public String getXCG01625() {
		return _XCG01625;
	}

	public void setXCG01625(String XCG01625) {
		_XCG01625 = XCG01625;
	}

	public String getXCG01941() {
		return _XCG01941;
	}

	public void setXCG01941(String XCG01941) {
		_XCG01941 = XCG01941;
	}

	public String getXCG01626() {
		return _XCG01626;
	}

	public void setXCG01626(String XCG01626) {
		_XCG01626 = XCG01626;
	}

	public String getXCG01942() {
		return _XCG01942;
	}

	public void setXCG01942(String XCG01942) {
		_XCG01942 = XCG01942;
	}

	public String getXCG01627() {
		return _XCG01627;
	}

	public void setXCG01627(String XCG01627) {
		_XCG01627 = XCG01627;
	}

	public String getXCG01943() {
		return _XCG01943;
	}

	public void setXCG01943(String XCG01943) {
		_XCG01943 = XCG01943;
	}

	public String getXCG01628() {
		return _XCG01628;
	}

	public void setXCG01628(String XCG01628) {
		_XCG01628 = XCG01628;
	}

	public String getXCG01944() {
		return _XCG01944;
	}

	public void setXCG01944(String XCG01944) {
		_XCG01944 = XCG01944;
	}

	public String getXCG01630() {
		return _XCG01630;
	}

	public void setXCG01630(String XCG01630) {
		_XCG01630 = XCG01630;
	}

	public String getXCG01631() {
		return _XCG01631;
	}

	public void setXCG01631(String XCG01631) {
		_XCG01631 = XCG01631;
	}

	public String getXCG01632() {
		return _XCG01632;
	}

	public void setXCG01632(String XCG01632) {
		_XCG01632 = XCG01632;
	}

	public String getXCG01633() {
		return _XCG01633;
	}

	public void setXCG01633(String XCG01633) {
		_XCG01633 = XCG01633;
	}

	public String getXCG01634() {
		return _XCG01634;
	}

	public void setXCG01634(String XCG01634) {
		_XCG01634 = XCG01634;
	}

	public String getXCG01635() {
		return _XCG01635;
	}

	public void setXCG01635(String XCG01635) {
		_XCG01635 = XCG01635;
	}

	public String getXCG01636() {
		return _XCG01636;
	}

	public void setXCG01636(String XCG01636) {
		_XCG01636 = XCG01636;
	}

	public String getXCG01637() {
		return _XCG01637;
	}

	public void setXCG01637(String XCG01637) {
		_XCG01637 = XCG01637;
	}

	public String getXCG01638() {
		return _XCG01638;
	}

	public void setXCG01638(String XCG01638) {
		_XCG01638 = XCG01638;
	}

	public String getXCG01639() {
		return _XCG01639;
	}

	public void setXCG01639(String XCG01639) {
		_XCG01639 = XCG01639;
	}

	public String getXCG01640() {
		return _XCG01640;
	}

	public void setXCG01640(String XCG01640) {
		_XCG01640 = XCG01640;
	}

	public String getXCG01641() {
		return _XCG01641;
	}

	public void setXCG01641(String XCG01641) {
		_XCG01641 = XCG01641;
	}

	public String getXCG01642() {
		return _XCG01642;
	}

	public void setXCG01642(String XCG01642) {
		_XCG01642 = XCG01642;
	}

	public String getXCG01643() {
		return _XCG01643;
	}

	public void setXCG01643(String XCG01643) {
		_XCG01643 = XCG01643;
	}

	public String getXCG01644() {
		return _XCG01644;
	}

	public void setXCG01644(String XCG01644) {
		_XCG01644 = XCG01644;
	}

	public String getXCG01645() {
		return _XCG01645;
	}

	public void setXCG01645(String XCG01645) {
		_XCG01645 = XCG01645;
	}

	public String getXCG01646() {
		return _XCG01646;
	}

	public void setXCG01646(String XCG01646) {
		_XCG01646 = XCG01646;
	}

	public String getXCG01647() {
		return _XCG01647;
	}

	public void setXCG01647(String XCG01647) {
		_XCG01647 = XCG01647;
	}

	public String getXCG01648() {
		return _XCG01648;
	}

	public void setXCG01648(String XCG01648) {
		_XCG01648 = XCG01648;
	}

	public String getXCG01649() {
		return _XCG01649;
	}

	public void setXCG01649(String XCG01649) {
		_XCG01649 = XCG01649;
	}

	public String getXCG01650() {
		return _XCG01650;
	}

	public void setXCG01650(String XCG01650) {
		_XCG01650 = XCG01650;
	}

	public String getXCG01651() {
		return _XCG01651;
	}

	public void setXCG01651(String XCG01651) {
		_XCG01651 = XCG01651;
	}

	public String getXCG01652() {
		return _XCG01652;
	}

	public void setXCG01652(String XCG01652) {
		_XCG01652 = XCG01652;
	}

	public String getXCG01653() {
		return _XCG01653;
	}

	public void setXCG01653(String XCG01653) {
		_XCG01653 = XCG01653;
	}

	public String getXCG01654() {
		return _XCG01654;
	}

	public void setXCG01654(String XCG01654) {
		_XCG01654 = XCG01654;
	}

	public String getXCG01655() {
		return _XCG01655;
	}

	public void setXCG01655(String XCG01655) {
		_XCG01655 = XCG01655;
	}

	public String getXCG01656() {
		return _XCG01656;
	}

	public void setXCG01656(String XCG01656) {
		_XCG01656 = XCG01656;
	}

	public String getXCG01657() {
		return _XCG01657;
	}

	public void setXCG01657(String XCG01657) {
		_XCG01657 = XCG01657;
	}

	public String getXCG01658() {
		return _XCG01658;
	}

	public void setXCG01658(String XCG01658) {
		_XCG01658 = XCG01658;
	}

	public String getXCG01659() {
		return _XCG01659;
	}

	public void setXCG01659(String XCG01659) {
		_XCG01659 = XCG01659;
	}

	public String getXCG01660() {
		return _XCG01660;
	}

	public void setXCG01660(String XCG01660) {
		_XCG01660 = XCG01660;
	}

	public String getXCG01661() {
		return _XCG01661;
	}

	public void setXCG01661(String XCG01661) {
		_XCG01661 = XCG01661;
	}

	public String getXCG01662() {
		return _XCG01662;
	}

	public void setXCG01662(String XCG01662) {
		_XCG01662 = XCG01662;
	}

	public String getXCG01663() {
		return _XCG01663;
	}

	public void setXCG01663(String XCG01663) {
		_XCG01663 = XCG01663;
	}

	public String getXCG01664() {
		return _XCG01664;
	}

	public void setXCG01664(String XCG01664) {
		_XCG01664 = XCG01664;
	}

	public String getXCG01665() {
		return _XCG01665;
	}

	public void setXCG01665(String XCG01665) {
		_XCG01665 = XCG01665;
	}

	public String getXCG01666() {
		return _XCG01666;
	}

	public void setXCG01666(String XCG01666) {
		_XCG01666 = XCG01666;
	}

	public String getXCG01667() {
		return _XCG01667;
	}

	public void setXCG01667(String XCG01667) {
		_XCG01667 = XCG01667;
	}

	public String getXCG01668() {
		return _XCG01668;
	}

	public void setXCG01668(String XCG01668) {
		_XCG01668 = XCG01668;
	}

	public String getXCG01669() {
		return _XCG01669;
	}

	public void setXCG01669(String XCG01669) {
		_XCG01669 = XCG01669;
	}

	public String getXCG01670() {
		return _XCG01670;
	}

	public void setXCG01670(String XCG01670) {
		_XCG01670 = XCG01670;
	}

	public String getXCG01671() {
		return _XCG01671;
	}

	public void setXCG01671(String XCG01671) {
		_XCG01671 = XCG01671;
	}

	public String getXCG01672() {
		return _XCG01672;
	}

	public void setXCG01672(String XCG01672) {
		_XCG01672 = XCG01672;
	}

	public String getXCG01673() {
		return _XCG01673;
	}

	public void setXCG01673(String XCG01673) {
		_XCG01673 = XCG01673;
	}

	public String getXCG01674() {
		return _XCG01674;
	}

	public void setXCG01674(String XCG01674) {
		_XCG01674 = XCG01674;
	}

	public String getXCG01675() {
		return _XCG01675;
	}

	public void setXCG01675(String XCG01675) {
		_XCG01675 = XCG01675;
	}

	public String getXCG01676() {
		return _XCG01676;
	}

	public void setXCG01676(String XCG01676) {
		_XCG01676 = XCG01676;
	}

	public String getXCG01677() {
		return _XCG01677;
	}

	public void setXCG01677(String XCG01677) {
		_XCG01677 = XCG01677;
	}

	public String getXCG01678() {
		return _XCG01678;
	}

	public void setXCG01678(String XCG01678) {
		_XCG01678 = XCG01678;
	}

	public String getXCG01679() {
		return _XCG01679;
	}

	public void setXCG01679(String XCG01679) {
		_XCG01679 = XCG01679;
	}

	public String getXCG01680() {
		return _XCG01680;
	}

	public void setXCG01680(String XCG01680) {
		_XCG01680 = XCG01680;
	}

	public String getXCG01681() {
		return _XCG01681;
	}

	public void setXCG01681(String XCG01681) {
		_XCG01681 = XCG01681;
	}

	public String getXCG01682() {
		return _XCG01682;
	}

	public void setXCG01682(String XCG01682) {
		_XCG01682 = XCG01682;
	}

	public String getXCG01683() {
		return _XCG01683;
	}

	public void setXCG01683(String XCG01683) {
		_XCG01683 = XCG01683;
	}

	public String getXCG01684() {
		return _XCG01684;
	}

	public void setXCG01684(String XCG01684) {
		_XCG01684 = XCG01684;
	}

	public String getXCG01685() {
		return _XCG01685;
	}

	public void setXCG01685(String XCG01685) {
		_XCG01685 = XCG01685;
	}

	public String getXCG01686() {
		return _XCG01686;
	}

	public void setXCG01686(String XCG01686) {
		_XCG01686 = XCG01686;
	}

	public String getXCG01687() {
		return _XCG01687;
	}

	public void setXCG01687(String XCG01687) {
		_XCG01687 = XCG01687;
	}

	public String getXCG01688() {
		return _XCG01688;
	}

	public void setXCG01688(String XCG01688) {
		_XCG01688 = XCG01688;
	}

	public String getXCG01689() {
		return _XCG01689;
	}

	public void setXCG01689(String XCG01689) {
		_XCG01689 = XCG01689;
	}

	public String getXCG01690() {
		return _XCG01690;
	}

	public void setXCG01690(String XCG01690) {
		_XCG01690 = XCG01690;
	}

	public String getXCG01691() {
		return _XCG01691;
	}

	public void setXCG01691(String XCG01691) {
		_XCG01691 = XCG01691;
	}

	public String getXCG01692() {
		return _XCG01692;
	}

	public void setXCG01692(String XCG01692) {
		_XCG01692 = XCG01692;
	}

	public String getXCG01693() {
		return _XCG01693;
	}

	public void setXCG01693(String XCG01693) {
		_XCG01693 = XCG01693;
	}

	public String getXCG01694() {
		return _XCG01694;
	}

	public void setXCG01694(String XCG01694) {
		_XCG01694 = XCG01694;
	}

	public String getXCG01695() {
		return _XCG01695;
	}

	public void setXCG01695(String XCG01695) {
		_XCG01695 = XCG01695;
	}

	public String getXCG01696() {
		return _XCG01696;
	}

	public void setXCG01696(String XCG01696) {
		_XCG01696 = XCG01696;
	}

	public String getXCG01697() {
		return _XCG01697;
	}

	public void setXCG01697(String XCG01697) {
		_XCG01697 = XCG01697;
	}

	public String getXCG01698() {
		return _XCG01698;
	}

	public void setXCG01698(String XCG01698) {
		_XCG01698 = XCG01698;
	}

	public String getXCG01699() {
		return _XCG01699;
	}

	public void setXCG01699(String XCG01699) {
		_XCG01699 = XCG01699;
	}

	public String getXCG01700() {
		return _XCG01700;
	}

	public void setXCG01700(String XCG01700) {
		_XCG01700 = XCG01700;
	}

	public String getXCG01701() {
		return _XCG01701;
	}

	public void setXCG01701(String XCG01701) {
		_XCG01701 = XCG01701;
	}

	public String getXCG01702() {
		return _XCG01702;
	}

	public void setXCG01702(String XCG01702) {
		_XCG01702 = XCG01702;
	}

	public String getXCG01703() {
		return _XCG01703;
	}

	public void setXCG01703(String XCG01703) {
		_XCG01703 = XCG01703;
	}

	public String getXCG01704() {
		return _XCG01704;
	}

	public void setXCG01704(String XCG01704) {
		_XCG01704 = XCG01704;
	}

	public String getXCG01705() {
		return _XCG01705;
	}

	public void setXCG01705(String XCG01705) {
		_XCG01705 = XCG01705;
	}

	public String getXCG01706() {
		return _XCG01706;
	}

	public void setXCG01706(String XCG01706) {
		_XCG01706 = XCG01706;
	}

	public String getXCG01707() {
		return _XCG01707;
	}

	public void setXCG01707(String XCG01707) {
		_XCG01707 = XCG01707;
	}

	public String getXCG01708() {
		return _XCG01708;
	}

	public void setXCG01708(String XCG01708) {
		_XCG01708 = XCG01708;
	}

	public String getXCG01709() {
		return _XCG01709;
	}

	public void setXCG01709(String XCG01709) {
		_XCG01709 = XCG01709;
	}

	public String getXCG01710() {
		return _XCG01710;
	}

	public void setXCG01710(String XCG01710) {
		_XCG01710 = XCG01710;
	}

	public String getXCG01711() {
		return _XCG01711;
	}

	public void setXCG01711(String XCG01711) {
		_XCG01711 = XCG01711;
	}

	public String getXCG01712() {
		return _XCG01712;
	}

	public void setXCG01712(String XCG01712) {
		_XCG01712 = XCG01712;
	}

	public String getXCG01713() {
		return _XCG01713;
	}

	public void setXCG01713(String XCG01713) {
		_XCG01713 = XCG01713;
	}

	public String getXCG01714() {
		return _XCG01714;
	}

	public void setXCG01714(String XCG01714) {
		_XCG01714 = XCG01714;
	}

	public String getXCG01715() {
		return _XCG01715;
	}

	public void setXCG01715(String XCG01715) {
		_XCG01715 = XCG01715;
	}

	public String getXCG01716() {
		return _XCG01716;
	}

	public void setXCG01716(String XCG01716) {
		_XCG01716 = XCG01716;
	}

	public String getXCG01717() {
		return _XCG01717;
	}

	public void setXCG01717(String XCG01717) {
		_XCG01717 = XCG01717;
	}

	public String getXCG01718() {
		return _XCG01718;
	}

	public void setXCG01718(String XCG01718) {
		_XCG01718 = XCG01718;
	}

	public String getXCG01719() {
		return _XCG01719;
	}

	public void setXCG01719(String XCG01719) {
		_XCG01719 = XCG01719;
	}

	public String getXCG01720() {
		return _XCG01720;
	}

	public void setXCG01720(String XCG01720) {
		_XCG01720 = XCG01720;
	}

	public String getXCG01721() {
		return _XCG01721;
	}

	public void setXCG01721(String XCG01721) {
		_XCG01721 = XCG01721;
	}

	public String getXCG01722() {
		return _XCG01722;
	}

	public void setXCG01722(String XCG01722) {
		_XCG01722 = XCG01722;
	}

	public String getXCG01723() {
		return _XCG01723;
	}

	public void setXCG01723(String XCG01723) {
		_XCG01723 = XCG01723;
	}

	public String getXCG01724() {
		return _XCG01724;
	}

	public void setXCG01724(String XCG01724) {
		_XCG01724 = XCG01724;
	}

	public String getXCG01725() {
		return _XCG01725;
	}

	public void setXCG01725(String XCG01725) {
		_XCG01725 = XCG01725;
	}

	public String getXCG01726() {
		return _XCG01726;
	}

	public void setXCG01726(String XCG01726) {
		_XCG01726 = XCG01726;
	}

	public String getXCG01727() {
		return _XCG01727;
	}

	public void setXCG01727(String XCG01727) {
		_XCG01727 = XCG01727;
	}

	public String getXCG01728() {
		return _XCG01728;
	}

	public void setXCG01728(String XCG01728) {
		_XCG01728 = XCG01728;
	}

	public String getXCG01729() {
		return _XCG01729;
	}

	public void setXCG01729(String XCG01729) {
		_XCG01729 = XCG01729;
	}

	public String getXCG01730() {
		return _XCG01730;
	}

	public void setXCG01730(String XCG01730) {
		_XCG01730 = XCG01730;
	}

	public String getXCG01731() {
		return _XCG01731;
	}

	public void setXCG01731(String XCG01731) {
		_XCG01731 = XCG01731;
	}

	public String getXCG01732() {
		return _XCG01732;
	}

	public void setXCG01732(String XCG01732) {
		_XCG01732 = XCG01732;
	}

	public String getXCG01733() {
		return _XCG01733;
	}

	public void setXCG01733(String XCG01733) {
		_XCG01733 = XCG01733;
	}

	public String getXCG01734() {
		return _XCG01734;
	}

	public void setXCG01734(String XCG01734) {
		_XCG01734 = XCG01734;
	}

	public String getXCG01735() {
		return _XCG01735;
	}

	public void setXCG01735(String XCG01735) {
		_XCG01735 = XCG01735;
	}

	public String getXCG01736() {
		return _XCG01736;
	}

	public void setXCG01736(String XCG01736) {
		_XCG01736 = XCG01736;
	}

	public String getXCG01737() {
		return _XCG01737;
	}

	public void setXCG01737(String XCG01737) {
		_XCG01737 = XCG01737;
	}

	public String getXCG01738() {
		return _XCG01738;
	}

	public void setXCG01738(String XCG01738) {
		_XCG01738 = XCG01738;
	}

	public String getXCG01739() {
		return _XCG01739;
	}

	public void setXCG01739(String XCG01739) {
		_XCG01739 = XCG01739;
	}

	public String getXCG01740() {
		return _XCG01740;
	}

	public void setXCG01740(String XCG01740) {
		_XCG01740 = XCG01740;
	}

	public String getXCG01741() {
		return _XCG01741;
	}

	public void setXCG01741(String XCG01741) {
		_XCG01741 = XCG01741;
	}

	public String getXCG01742() {
		return _XCG01742;
	}

	public void setXCG01742(String XCG01742) {
		_XCG01742 = XCG01742;
	}

	public String getXCG01744() {
		return _XCG01744;
	}

	public void setXCG01744(String XCG01744) {
		_XCG01744 = XCG01744;
	}

	public String getXCG01745() {
		return _XCG01745;
	}

	public void setXCG01745(String XCG01745) {
		_XCG01745 = XCG01745;
	}

	public String getXCG01746() {
		return _XCG01746;
	}

	public void setXCG01746(String XCG01746) {
		_XCG01746 = XCG01746;
	}

	public String getXCG01747() {
		return _XCG01747;
	}

	public void setXCG01747(String XCG01747) {
		_XCG01747 = XCG01747;
	}

	public String getXCG01748() {
		return _XCG01748;
	}

	public void setXCG01748(String XCG01748) {
		_XCG01748 = XCG01748;
	}

	public String getXCG01749() {
		return _XCG01749;
	}

	public void setXCG01749(String XCG01749) {
		_XCG01749 = XCG01749;
	}

	public String getXCG01945() {
		return _XCG01945;
	}

	public void setXCG01945(String XCG01945) {
		_XCG01945 = XCG01945;
	}

	public String getXCG01750() {
		return _XCG01750;
	}

	public void setXCG01750(String XCG01750) {
		_XCG01750 = XCG01750;
	}

	public String getXCG01946() {
		return _XCG01946;
	}

	public void setXCG01946(String XCG01946) {
		_XCG01946 = XCG01946;
	}

	public String getXCG01751() {
		return _XCG01751;
	}

	public void setXCG01751(String XCG01751) {
		_XCG01751 = XCG01751;
	}

	public String getXCG01752() {
		return _XCG01752;
	}

	public void setXCG01752(String XCG01752) {
		_XCG01752 = XCG01752;
	}

	public String getXCG01753() {
		return _XCG01753;
	}

	public void setXCG01753(String XCG01753) {
		_XCG01753 = XCG01753;
	}

	public String getXCG01754() {
		return _XCG01754;
	}

	public void setXCG01754(String XCG01754) {
		_XCG01754 = XCG01754;
	}

	public String getXCG01756() {
		return _XCG01756;
	}

	public void setXCG01756(String XCG01756) {
		_XCG01756 = XCG01756;
	}

	public String getXCG01757() {
		return _XCG01757;
	}

	public void setXCG01757(String XCG01757) {
		_XCG01757 = XCG01757;
	}

	public String getXCG01758() {
		return _XCG01758;
	}

	public void setXCG01758(String XCG01758) {
		_XCG01758 = XCG01758;
	}

	public String getXCG01759() {
		return _XCG01759;
	}

	public void setXCG01759(String XCG01759) {
		_XCG01759 = XCG01759;
	}

	public String getXCG01948() {
		return _XCG01948;
	}

	public void setXCG01948(String XCG01948) {
		_XCG01948 = XCG01948;
	}

	public String getXCG01760() {
		return _XCG01760;
	}

	public void setXCG01760(String XCG01760) {
		_XCG01760 = XCG01760;
	}

	public String getXCG01949() {
		return _XCG01949;
	}

	public void setXCG01949(String XCG01949) {
		_XCG01949 = XCG01949;
	}

	public String getXCG01761() {
		return _XCG01761;
	}

	public void setXCG01761(String XCG01761) {
		_XCG01761 = XCG01761;
	}

	public String getXCG01950() {
		return _XCG01950;
	}

	public void setXCG01950(String XCG01950) {
		_XCG01950 = XCG01950;
	}

	public String getXCG01762() {
		return _XCG01762;
	}

	public void setXCG01762(String XCG01762) {
		_XCG01762 = XCG01762;
	}

	public String getXCG01951() {
		return _XCG01951;
	}

	public void setXCG01951(String XCG01951) {
		_XCG01951 = XCG01951;
	}

	public String getXCG01763() {
		return _XCG01763;
	}

	public void setXCG01763(String XCG01763) {
		_XCG01763 = XCG01763;
	}

	public String getXCG01952() {
		return _XCG01952;
	}

	public void setXCG01952(String XCG01952) {
		_XCG01952 = XCG01952;
	}

	public String getXCG01764() {
		return _XCG01764;
	}

	public void setXCG01764(String XCG01764) {
		_XCG01764 = XCG01764;
	}

	public String getXCG01953() {
		return _XCG01953;
	}

	public void setXCG01953(String XCG01953) {
		_XCG01953 = XCG01953;
	}

	public String getXCG01765() {
		return _XCG01765;
	}

	public void setXCG01765(String XCG01765) {
		_XCG01765 = XCG01765;
	}

	public String getXCG01954() {
		return _XCG01954;
	}

	public void setXCG01954(String XCG01954) {
		_XCG01954 = XCG01954;
	}

	public String getXCG01766() {
		return _XCG01766;
	}

	public void setXCG01766(String XCG01766) {
		_XCG01766 = XCG01766;
	}

	public String getXCG01955() {
		return _XCG01955;
	}

	public void setXCG01955(String XCG01955) {
		_XCG01955 = XCG01955;
	}

	public String getXCG01767() {
		return _XCG01767;
	}

	public void setXCG01767(String XCG01767) {
		_XCG01767 = XCG01767;
	}

	public String getXCG01956() {
		return _XCG01956;
	}

	public void setXCG01956(String XCG01956) {
		_XCG01956 = XCG01956;
	}

	public String getXCG01768() {
		return _XCG01768;
	}

	public void setXCG01768(String XCG01768) {
		_XCG01768 = XCG01768;
	}

	public String getXCG01957() {
		return _XCG01957;
	}

	public void setXCG01957(String XCG01957) {
		_XCG01957 = XCG01957;
	}

	public String getXCG01769() {
		return _XCG01769;
	}

	public void setXCG01769(String XCG01769) {
		_XCG01769 = XCG01769;
	}

	public String getXCG01958() {
		return _XCG01958;
	}

	public void setXCG01958(String XCG01958) {
		_XCG01958 = XCG01958;
	}

	public String getXCG01770() {
		return _XCG01770;
	}

	public void setXCG01770(String XCG01770) {
		_XCG01770 = XCG01770;
	}

	public String getXCG01771() {
		return _XCG01771;
	}

	public void setXCG01771(String XCG01771) {
		_XCG01771 = XCG01771;
	}

	public String getXCG01959() {
		return _XCG01959;
	}

	public void setXCG01959(String XCG01959) {
		_XCG01959 = XCG01959;
	}

	public String getXCG01772() {
		return _XCG01772;
	}

	public void setXCG01772(String XCG01772) {
		_XCG01772 = XCG01772;
	}

	public String getXCG01773() {
		return _XCG01773;
	}

	public void setXCG01773(String XCG01773) {
		_XCG01773 = XCG01773;
	}

	public String getXCG01774() {
		return _XCG01774;
	}

	public void setXCG01774(String XCG01774) {
		_XCG01774 = XCG01774;
	}

	public String getXCG01775() {
		return _XCG01775;
	}

	public void setXCG01775(String XCG01775) {
		_XCG01775 = XCG01775;
	}

	public String getXCG01776() {
		return _XCG01776;
	}

	public void setXCG01776(String XCG01776) {
		_XCG01776 = XCG01776;
	}

	public String getXCG01777() {
		return _XCG01777;
	}

	public void setXCG01777(String XCG01777) {
		_XCG01777 = XCG01777;
	}

	public String getXCG01778() {
		return _XCG01778;
	}

	public void setXCG01778(String XCG01778) {
		_XCG01778 = XCG01778;
	}

	public String getXCG01779() {
		return _XCG01779;
	}

	public void setXCG01779(String XCG01779) {
		_XCG01779 = XCG01779;
	}

	public String getXCG01780() {
		return _XCG01780;
	}

	public void setXCG01780(String XCG01780) {
		_XCG01780 = XCG01780;
	}

	public String getXCG01781() {
		return _XCG01781;
	}

	public void setXCG01781(String XCG01781) {
		_XCG01781 = XCG01781;
	}

	public String getXCG01783() {
		return _XCG01783;
	}

	public void setXCG01783(String XCG01783) {
		_XCG01783 = XCG01783;
	}

	public String getXCG01785() {
		return _XCG01785;
	}

	public void setXCG01785(String XCG01785) {
		_XCG01785 = XCG01785;
	}

	public String getXCG01786() {
		return _XCG01786;
	}

	public void setXCG01786(String XCG01786) {
		_XCG01786 = XCG01786;
	}

	public String getXCG01787() {
		return _XCG01787;
	}

	public void setXCG01787(String XCG01787) {
		_XCG01787 = XCG01787;
	}

	public String getXCG01788() {
		return _XCG01788;
	}

	public void setXCG01788(String XCG01788) {
		_XCG01788 = XCG01788;
	}

	public String getXCG01789() {
		return _XCG01789;
	}

	public void setXCG01789(String XCG01789) {
		_XCG01789 = XCG01789;
	}

	public String getXCG01790() {
		return _XCG01790;
	}

	public void setXCG01790(String XCG01790) {
		_XCG01790 = XCG01790;
	}

	public String getXCG01791() {
		return _XCG01791;
	}

	public void setXCG01791(String XCG01791) {
		_XCG01791 = XCG01791;
	}

	public String getXCG01792() {
		return _XCG01792;
	}

	public void setXCG01792(String XCG01792) {
		_XCG01792 = XCG01792;
	}

	public String getXCG01793() {
		return _XCG01793;
	}

	public void setXCG01793(String XCG01793) {
		_XCG01793 = XCG01793;
	}

	public String getXCG01794() {
		return _XCG01794;
	}

	public void setXCG01794(String XCG01794) {
		_XCG01794 = XCG01794;
	}

	public String getXCG01795() {
		return _XCG01795;
	}

	public void setXCG01795(String XCG01795) {
		_XCG01795 = XCG01795;
	}

	public String getXCG01796() {
		return _XCG01796;
	}

	public void setXCG01796(String XCG01796) {
		_XCG01796 = XCG01796;
	}

	public String getXCG01797() {
		return _XCG01797;
	}

	public void setXCG01797(String XCG01797) {
		_XCG01797 = XCG01797;
	}

	public String getXCG01798() {
		return _XCG01798;
	}

	public void setXCG01798(String XCG01798) {
		_XCG01798 = XCG01798;
	}

	public String getXCG01799() {
		return _XCG01799;
	}

	public void setXCG01799(String XCG01799) {
		_XCG01799 = XCG01799;
	}

	public String getXCG01801() {
		return _XCG01801;
	}

	public void setXCG01801(String XCG01801) {
		_XCG01801 = XCG01801;
	}

	public String getXCG01802() {
		return _XCG01802;
	}

	public void setXCG01802(String XCG01802) {
		_XCG01802 = XCG01802;
	}

	public String getXCG01803() {
		return _XCG01803;
	}

	public void setXCG01803(String XCG01803) {
		_XCG01803 = XCG01803;
	}

	public String getXCG01804() {
		return _XCG01804;
	}

	public void setXCG01804(String XCG01804) {
		_XCG01804 = XCG01804;
	}

	public String getXCG01805() {
		return _XCG01805;
	}

	public void setXCG01805(String XCG01805) {
		_XCG01805 = XCG01805;
	}

	public String getXCG01806() {
		return _XCG01806;
	}

	public void setXCG01806(String XCG01806) {
		_XCG01806 = XCG01806;
	}

	public String getXCG01807() {
		return _XCG01807;
	}

	public void setXCG01807(String XCG01807) {
		_XCG01807 = XCG01807;
	}

	public String getXCG01808() {
		return _XCG01808;
	}

	public void setXCG01808(String XCG01808) {
		_XCG01808 = XCG01808;
	}

	public String getXCG01809() {
		return _XCG01809;
	}

	public void setXCG01809(String XCG01809) {
		_XCG01809 = XCG01809;
	}

	public String getXCG01810() {
		return _XCG01810;
	}

	public void setXCG01810(String XCG01810) {
		_XCG01810 = XCG01810;
	}

	public String getXCG01811() {
		return _XCG01811;
	}

	public void setXCG01811(String XCG01811) {
		_XCG01811 = XCG01811;
	}

	public String getXCG01812() {
		return _XCG01812;
	}

	public void setXCG01812(String XCG01812) {
		_XCG01812 = XCG01812;
	}

	public String getXCG01813() {
		return _XCG01813;
	}

	public void setXCG01813(String XCG01813) {
		_XCG01813 = XCG01813;
	}

	public String getXCG01814() {
		return _XCG01814;
	}

	public void setXCG01814(String XCG01814) {
		_XCG01814 = XCG01814;
	}

	public String getTDTKXCG001() {
		return _TDTKXCG001;
	}

	public void setTDTKXCG001(String TDTKXCG001) {
		_TDTKXCG001 = TDTKXCG001;
	}

	public String getTDTKXCG002() {
		return _TDTKXCG002;
	}

	public void setTDTKXCG002(String TDTKXCG002) {
		_TDTKXCG002 = TDTKXCG002;
	}

	public String getTDTKXCG003() {
		return _TDTKXCG003;
	}

	public void setTDTKXCG003(String TDTKXCG003) {
		_TDTKXCG003 = TDTKXCG003;
	}

	public String getTDTKXCG004() {
		return _TDTKXCG004;
	}

	public void setTDTKXCG004(String TDTKXCG004) {
		_TDTKXCG004 = TDTKXCG004;
	}

	public String getTDTKXCG005() {
		return _TDTKXCG005;
	}

	public void setTDTKXCG005(String TDTKXCG005) {
		_TDTKXCG005 = TDTKXCG005;
	}

	public String getTDTKXCG006() {
		return _TDTKXCG006;
	}

	public void setTDTKXCG006(String TDTKXCG006) {
		_TDTKXCG006 = TDTKXCG006;
	}

	public String getTDTKXCG007() {
		return _TDTKXCG007;
	}

	public void setTDTKXCG007(String TDTKXCG007) {
		_TDTKXCG007 = TDTKXCG007;
	}

	public String getTDTKXCG008() {
		return _TDTKXCG008;
	}

	public void setTDTKXCG008(String TDTKXCG008) {
		_TDTKXCG008 = TDTKXCG008;
	}

	public String getTDTKXCG009() {
		return _TDTKXCG009;
	}

	public void setTDTKXCG009(String TDTKXCG009) {
		_TDTKXCG009 = TDTKXCG009;
	}

	public String getTDTKXCG010() {
		return _TDTKXCG010;
	}

	public void setTDTKXCG010(String TDTKXCG010) {
		_TDTKXCG010 = TDTKXCG010;
	}

	public String getTDTKXCG011() {
		return _TDTKXCG011;
	}

	public void setTDTKXCG011(String TDTKXCG011) {
		_TDTKXCG011 = TDTKXCG011;
	}

	public String getTDTKXCG012() {
		return _TDTKXCG012;
	}

	public void setTDTKXCG012(String TDTKXCG012) {
		_TDTKXCG012 = TDTKXCG012;
	}

	public String getTDTKXCG013() {
		return _TDTKXCG013;
	}

	public void setTDTKXCG013(String TDTKXCG013) {
		_TDTKXCG013 = TDTKXCG013;
	}

	public String getTDTKXCG014() {
		return _TDTKXCG014;
	}

	public void setTDTKXCG014(String TDTKXCG014) {
		_TDTKXCG014 = TDTKXCG014;
	}

	public String getTDTKXCG015() {
		return _TDTKXCG015;
	}

	public void setTDTKXCG015(String TDTKXCG015) {
		_TDTKXCG015 = TDTKXCG015;
	}

	public String getTDTKXCG016() {
		return _TDTKXCG016;
	}

	public void setTDTKXCG016(String TDTKXCG016) {
		_TDTKXCG016 = TDTKXCG016;
	}

	public String getTDTKXCG017() {
		return _TDTKXCG017;
	}

	public void setTDTKXCG017(String TDTKXCG017) {
		_TDTKXCG017 = TDTKXCG017;
	}

	public String getTDTKXCG018() {
		return _TDTKXCG018;
	}

	public void setTDTKXCG018(String TDTKXCG018) {
		_TDTKXCG018 = TDTKXCG018;
	}

	public String getTDTKXCG019() {
		return _TDTKXCG019;
	}

	public void setTDTKXCG019(String TDTKXCG019) {
		_TDTKXCG019 = TDTKXCG019;
	}

	public String getTDTKXCG020() {
		return _TDTKXCG020;
	}

	public void setTDTKXCG020(String TDTKXCG020) {
		_TDTKXCG020 = TDTKXCG020;
	}

	public String getTDTKXCG021() {
		return _TDTKXCG021;
	}

	public void setTDTKXCG021(String TDTKXCG021) {
		_TDTKXCG021 = TDTKXCG021;
	}

	public String getTDTKXCG022() {
		return _TDTKXCG022;
	}

	public void setTDTKXCG022(String TDTKXCG022) {
		_TDTKXCG022 = TDTKXCG022;
	}

	public String getTDTKXCG023() {
		return _TDTKXCG023;
	}

	public void setTDTKXCG023(String TDTKXCG023) {
		_TDTKXCG023 = TDTKXCG023;
	}

	public String getTDTKXCG024() {
		return _TDTKXCG024;
	}

	public void setTDTKXCG024(String TDTKXCG024) {
		_TDTKXCG024 = TDTKXCG024;
	}

	public String getTDTKXCG025() {
		return _TDTKXCG025;
	}

	public void setTDTKXCG025(String TDTKXCG025) {
		_TDTKXCG025 = TDTKXCG025;
	}

	public String getTDTKXCG026() {
		return _TDTKXCG026;
	}

	public void setTDTKXCG026(String TDTKXCG026) {
		_TDTKXCG026 = TDTKXCG026;
	}

	public String getTDTKXCG027() {
		return _TDTKXCG027;
	}

	public void setTDTKXCG027(String TDTKXCG027) {
		_TDTKXCG027 = TDTKXCG027;
	}

	public String getTDTKXCG028() {
		return _TDTKXCG028;
	}

	public void setTDTKXCG028(String TDTKXCG028) {
		_TDTKXCG028 = TDTKXCG028;
	}

	public String getTDTKXCG029() {
		return _TDTKXCG029;
	}

	public void setTDTKXCG029(String TDTKXCG029) {
		_TDTKXCG029 = TDTKXCG029;
	}

	public String getTDTKXCG030() {
		return _TDTKXCG030;
	}

	public void setTDTKXCG030(String TDTKXCG030) {
		_TDTKXCG030 = TDTKXCG030;
	}

	public String getTDTKXCG031() {
		return _TDTKXCG031;
	}

	public void setTDTKXCG031(String TDTKXCG031) {
		_TDTKXCG031 = TDTKXCG031;
	}

	public String getTDTKXCG032() {
		return _TDTKXCG032;
	}

	public void setTDTKXCG032(String TDTKXCG032) {
		_TDTKXCG032 = TDTKXCG032;
	}

	public String getTDTKXCG033() {
		return _TDTKXCG033;
	}

	public void setTDTKXCG033(String TDTKXCG033) {
		_TDTKXCG033 = TDTKXCG033;
	}

	public String getTDTKXCG034() {
		return _TDTKXCG034;
	}

	public void setTDTKXCG034(String TDTKXCG034) {
		_TDTKXCG034 = TDTKXCG034;
	}

	public String getTDTKXCG035() {
		return _TDTKXCG035;
	}

	public void setTDTKXCG035(String TDTKXCG035) {
		_TDTKXCG035 = TDTKXCG035;
	}

	public String getTDTKXCG036() {
		return _TDTKXCG036;
	}

	public void setTDTKXCG036(String TDTKXCG036) {
		_TDTKXCG036 = TDTKXCG036;
	}

	public String getBBCNCLKLXCG01() {
		return _BBCNCLKLXCG01;
	}

	public void setBBCNCLKLXCG01(String BBCNCLKLXCG01) {
		_BBCNCLKLXCG01 = BBCNCLKLXCG01;
	}

	public String getBBCNCLKLXCG02() {
		return _BBCNCLKLXCG02;
	}

	public void setBBCNCLKLXCG02(String BBCNCLKLXCG02) {
		_BBCNCLKLXCG02 = BBCNCLKLXCG02;
	}

	public String getBBCNCLKLXCG03() {
		return _BBCNCLKLXCG03;
	}

	public void setBBCNCLKLXCG03(String BBCNCLKLXCG03) {
		_BBCNCLKLXCG03 = BBCNCLKLXCG03;
	}

	public String getBBCNCLKLXCG04() {
		return _BBCNCLKLXCG04;
	}

	public void setBBCNCLKLXCG04(String BBCNCLKLXCG04) {
		_BBCNCLKLXCG04 = BBCNCLKLXCG04;
	}

	public String getBBCNCLKLXCG05() {
		return _BBCNCLKLXCG05;
	}

	public void setBBCNCLKLXCG05(String BBCNCLKLXCG05) {
		_BBCNCLKLXCG05 = BBCNCLKLXCG05;
	}

	public String getBBCNCLKLXCG06() {
		return _BBCNCLKLXCG06;
	}

	public void setBBCNCLKLXCG06(String BBCNCLKLXCG06) {
		_BBCNCLKLXCG06 = BBCNCLKLXCG06;
	}

	public String getBBCNCLKLXCG07() {
		return _BBCNCLKLXCG07;
	}

	public void setBBCNCLKLXCG07(String BBCNCLKLXCG07) {
		_BBCNCLKLXCG07 = BBCNCLKLXCG07;
	}

	public String getBBCNCLKLXCG08() {
		return _BBCNCLKLXCG08;
	}

	public void setBBCNCLKLXCG08(String BBCNCLKLXCG08) {
		_BBCNCLKLXCG08 = BBCNCLKLXCG08;
	}

	public String getBBCNCLKLXCG09() {
		return _BBCNCLKLXCG09;
	}

	public void setBBCNCLKLXCG09(String BBCNCLKLXCG09) {
		_BBCNCLKLXCG09 = BBCNCLKLXCG09;
	}

	public String getBBCNCLKLXCG10() {
		return _BBCNCLKLXCG10;
	}

	public void setBBCNCLKLXCG10(String BBCNCLKLXCG10) {
		_BBCNCLKLXCG10 = BBCNCLKLXCG10;
	}

	public String getBBCNCLKLXCG11() {
		return _BBCNCLKLXCG11;
	}

	public void setBBCNCLKLXCG11(String BBCNCLKLXCG11) {
		_BBCNCLKLXCG11 = BBCNCLKLXCG11;
	}

	public String getBBCNCLKLXCG12() {
		return _BBCNCLKLXCG12;
	}

	public void setBBCNCLKLXCG12(String BBCNCLKLXCG12) {
		_BBCNCLKLXCG12 = BBCNCLKLXCG12;
	}

	public String getBBCNCLKLXCG13() {
		return _BBCNCLKLXCG13;
	}

	public void setBBCNCLKLXCG13(String BBCNCLKLXCG13) {
		_BBCNCLKLXCG13 = BBCNCLKLXCG13;
	}

	public String getBBCNCLKLXCG14() {
		return _BBCNCLKLXCG14;
	}

	public void setBBCNCLKLXCG14(String BBCNCLKLXCG14) {
		_BBCNCLKLXCG14 = BBCNCLKLXCG14;
	}

	public String getBBCNCLKLXCG15() {
		return _BBCNCLKLXCG15;
	}

	public void setBBCNCLKLXCG15(String BBCNCLKLXCG15) {
		_BBCNCLKLXCG15 = BBCNCLKLXCG15;
	}

	public String getBBCNCLKLXCG16() {
		return _BBCNCLKLXCG16;
	}

	public void setBBCNCLKLXCG16(String BBCNCLKLXCG16) {
		_BBCNCLKLXCG16 = BBCNCLKLXCG16;
	}

	public String getBBCNCLKLXCG17() {
		return _BBCNCLKLXCG17;
	}

	public void setBBCNCLKLXCG17(String BBCNCLKLXCG17) {
		_BBCNCLKLXCG17 = BBCNCLKLXCG17;
	}

	public String getBBCNCLKLXCG18() {
		return _BBCNCLKLXCG18;
	}

	public void setBBCNCLKLXCG18(String BBCNCLKLXCG18) {
		_BBCNCLKLXCG18 = BBCNCLKLXCG18;
	}

	public String getBBCNCLKLXCG19() {
		return _BBCNCLKLXCG19;
	}

	public void setBBCNCLKLXCG19(String BBCNCLKLXCG19) {
		_BBCNCLKLXCG19 = BBCNCLKLXCG19;
	}

	public String getBBCNCLKLXCG20() {
		return _BBCNCLKLXCG20;
	}

	public void setBBCNCLKLXCG20(String BBCNCLKLXCG20) {
		_BBCNCLKLXCG20 = BBCNCLKLXCG20;
	}

	public String getBBCNCLKLXCG21() {
		return _BBCNCLKLXCG21;
	}

	public void setBBCNCLKLXCG21(String BBCNCLKLXCG21) {
		_BBCNCLKLXCG21 = BBCNCLKLXCG21;
	}

	public String getBBCNCLKLXCG22() {
		return _BBCNCLKLXCG22;
	}

	public void setBBCNCLKLXCG22(String BBCNCLKLXCG22) {
		_BBCNCLKLXCG22 = BBCNCLKLXCG22;
	}

	public String getBBCNCLKLXCG23() {
		return _BBCNCLKLXCG23;
	}

	public void setBBCNCLKLXCG23(String BBCNCLKLXCG23) {
		_BBCNCLKLXCG23 = BBCNCLKLXCG23;
	}

	public String getBBCNCLKLXCG24() {
		return _BBCNCLKLXCG24;
	}

	public void setBBCNCLKLXCG24(String BBCNCLKLXCG24) {
		_BBCNCLKLXCG24 = BBCNCLKLXCG24;
	}

	public String getBBCNCLKLXCG26() {
		return _BBCNCLKLXCG26;
	}

	public void setBBCNCLKLXCG26(String BBCNCLKLXCG26) {
		_BBCNCLKLXCG26 = BBCNCLKLXCG26;
	}

	public String getBBCNCLKLXCG27() {
		return _BBCNCLKLXCG27;
	}

	public void setBBCNCLKLXCG27(String BBCNCLKLXCG27) {
		_BBCNCLKLXCG27 = BBCNCLKLXCG27;
	}

	public String getBBCNCLKLXCG28() {
		return _BBCNCLKLXCG28;
	}

	public void setBBCNCLKLXCG28(String BBCNCLKLXCG28) {
		_BBCNCLKLXCG28 = BBCNCLKLXCG28;
	}

	public String getBBCNCLKLXCG29() {
		return _BBCNCLKLXCG29;
	}

	public void setBBCNCLKLXCG29(String BBCNCLKLXCG29) {
		_BBCNCLKLXCG29 = BBCNCLKLXCG29;
	}

	public String getBBCNCLKLXCG30() {
		return _BBCNCLKLXCG30;
	}

	public void setBBCNCLKLXCG30(String BBCNCLKLXCG30) {
		_BBCNCLKLXCG30 = BBCNCLKLXCG30;
	}

	public String getBBCNCLKLXCG31() {
		return _BBCNCLKLXCG31;
	}

	public void setBBCNCLKLXCG31(String BBCNCLKLXCG31) {
		_BBCNCLKLXCG31 = BBCNCLKLXCG31;
	}

	public String getBBCNCLKLXCG33() {
		return _BBCNCLKLXCG33;
	}

	public void setBBCNCLKLXCG33(String BBCNCLKLXCG33) {
		_BBCNCLKLXCG33 = BBCNCLKLXCG33;
	}

	public String getBBCNCLKLXCG34() {
		return _BBCNCLKLXCG34;
	}

	public void setBBCNCLKLXCG34(String BBCNCLKLXCG34) {
		_BBCNCLKLXCG34 = BBCNCLKLXCG34;
	}

	public String getBBCNCLKLXCG35() {
		return _BBCNCLKLXCG35;
	}

	public void setBBCNCLKLXCG35(String BBCNCLKLXCG35) {
		_BBCNCLKLXCG35 = BBCNCLKLXCG35;
	}

	public String getBBCNCLKLXCG36() {
		return _BBCNCLKLXCG36;
	}

	public void setBBCNCLKLXCG36(String BBCNCLKLXCG36) {
		_BBCNCLKLXCG36 = BBCNCLKLXCG36;
	}

	public String getBBCNCLKLXCG38() {
		return _BBCNCLKLXCG38;
	}

	public void setBBCNCLKLXCG38(String BBCNCLKLXCG38) {
		_BBCNCLKLXCG38 = BBCNCLKLXCG38;
	}

	public String getBBCNCLKLXCG39() {
		return _BBCNCLKLXCG39;
	}

	public void setBBCNCLKLXCG39(String BBCNCLKLXCG39) {
		_BBCNCLKLXCG39 = BBCNCLKLXCG39;
	}

	public String getBBCNCLKLXCG40() {
		return _BBCNCLKLXCG40;
	}

	public void setBBCNCLKLXCG40(String BBCNCLKLXCG40) {
		_BBCNCLKLXCG40 = BBCNCLKLXCG40;
	}

	public String getBBCNCLKLXCG42() {
		return _BBCNCLKLXCG42;
	}

	public void setBBCNCLKLXCG42(String BBCNCLKLXCG42) {
		_BBCNCLKLXCG42 = BBCNCLKLXCG42;
	}

	public String getBBCNCLKLXCG43() {
		return _BBCNCLKLXCG43;
	}

	public void setBBCNCLKLXCG43(String BBCNCLKLXCG43) {
		_BBCNCLKLXCG43 = BBCNCLKLXCG43;
	}

	public String getBBCNCLKLXCG44() {
		return _BBCNCLKLXCG44;
	}

	public void setBBCNCLKLXCG44(String BBCNCLKLXCG44) {
		_BBCNCLKLXCG44 = BBCNCLKLXCG44;
	}

	public String getBBCNCLKLXCG45() {
		return _BBCNCLKLXCG45;
	}

	public void setBBCNCLKLXCG45(String BBCNCLKLXCG45) {
		_BBCNCLKLXCG45 = BBCNCLKLXCG45;
	}

	public String getBBCNCLKLXCG46() {
		return _BBCNCLKLXCG46;
	}

	public void setBBCNCLKLXCG46(String BBCNCLKLXCG46) {
		_BBCNCLKLXCG46 = BBCNCLKLXCG46;
	}

	public String getBBCNCLKLXCG47() {
		return _BBCNCLKLXCG47;
	}

	public void setBBCNCLKLXCG47(String BBCNCLKLXCG47) {
		_BBCNCLKLXCG47 = BBCNCLKLXCG47;
	}

	public String getBBCNCLKLXCG48() {
		return _BBCNCLKLXCG48;
	}

	public void setBBCNCLKLXCG48(String BBCNCLKLXCG48) {
		_BBCNCLKLXCG48 = BBCNCLKLXCG48;
	}

	public String getBBCNCLKLXCG49() {
		return _BBCNCLKLXCG49;
	}

	public void setBBCNCLKLXCG49(String BBCNCLKLXCG49) {
		_BBCNCLKLXCG49 = BBCNCLKLXCG49;
	}

	public String getBBCNCLKLXCG50() {
		return _BBCNCLKLXCG50;
	}

	public void setBBCNCLKLXCG50(String BBCNCLKLXCG50) {
		_BBCNCLKLXCG50 = BBCNCLKLXCG50;
	}

	public String getBBCNCLKLXCG51() {
		return _BBCNCLKLXCG51;
	}

	public void setBBCNCLKLXCG51(String BBCNCLKLXCG51) {
		_BBCNCLKLXCG51 = BBCNCLKLXCG51;
	}

	public String getBBCNCLKLXCG52() {
		return _BBCNCLKLXCG52;
	}

	public void setBBCNCLKLXCG52(String BBCNCLKLXCG52) {
		_BBCNCLKLXCG52 = BBCNCLKLXCG52;
	}

	public String getBBCNCLKLXCG53() {
		return _BBCNCLKLXCG53;
	}

	public void setBBCNCLKLXCG53(String BBCNCLKLXCG53) {
		_BBCNCLKLXCG53 = BBCNCLKLXCG53;
	}

	public String getBBCNCLKLXCG54() {
		return _BBCNCLKLXCG54;
	}

	public void setBBCNCLKLXCG54(String BBCNCLKLXCG54) {
		_BBCNCLKLXCG54 = BBCNCLKLXCG54;
	}

	public String getBBKTSPMXCG001() {
		return _BBKTSPMXCG001;
	}

	public void setBBKTSPMXCG001(String BBKTSPMXCG001) {
		_BBKTSPMXCG001 = BBKTSPMXCG001;
	}

	public String getBBKTSPMXCG002() {
		return _BBKTSPMXCG002;
	}

	public void setBBKTSPMXCG002(String BBKTSPMXCG002) {
		_BBKTSPMXCG002 = BBKTSPMXCG002;
	}

	public String getBBKTSPMXCG003() {
		return _BBKTSPMXCG003;
	}

	public void setBBKTSPMXCG003(String BBKTSPMXCG003) {
		_BBKTSPMXCG003 = BBKTSPMXCG003;
	}

	public String getBBKTSPMXCG004() {
		return _BBKTSPMXCG004;
	}

	public void setBBKTSPMXCG004(String BBKTSPMXCG004) {
		_BBKTSPMXCG004 = BBKTSPMXCG004;
	}

	public String getBBKTSPMXCG005() {
		return _BBKTSPMXCG005;
	}

	public void setBBKTSPMXCG005(String BBKTSPMXCG005) {
		_BBKTSPMXCG005 = BBKTSPMXCG005;
	}

	public String getBBKTSPMXCG006() {
		return _BBKTSPMXCG006;
	}

	public void setBBKTSPMXCG006(String BBKTSPMXCG006) {
		_BBKTSPMXCG006 = BBKTSPMXCG006;
	}

	public String getBBKTSPMXCG007() {
		return _BBKTSPMXCG007;
	}

	public void setBBKTSPMXCG007(String BBKTSPMXCG007) {
		_BBKTSPMXCG007 = BBKTSPMXCG007;
	}

	public String getBBKTSPMXCG008() {
		return _BBKTSPMXCG008;
	}

	public void setBBKTSPMXCG008(String BBKTSPMXCG008) {
		_BBKTSPMXCG008 = BBKTSPMXCG008;
	}

	public String getBBKTSPMXCG009() {
		return _BBKTSPMXCG009;
	}

	public void setBBKTSPMXCG009(String BBKTSPMXCG009) {
		_BBKTSPMXCG009 = BBKTSPMXCG009;
	}

	public String getBBKTSPMXCG010() {
		return _BBKTSPMXCG010;
	}

	public void setBBKTSPMXCG010(String BBKTSPMXCG010) {
		_BBKTSPMXCG010 = BBKTSPMXCG010;
	}

	public String getBBKTSPMXCG011() {
		return _BBKTSPMXCG011;
	}

	public void setBBKTSPMXCG011(String BBKTSPMXCG011) {
		_BBKTSPMXCG011 = BBKTSPMXCG011;
	}

	public String getBBKTSPMXCG012() {
		return _BBKTSPMXCG012;
	}

	public void setBBKTSPMXCG012(String BBKTSPMXCG012) {
		_BBKTSPMXCG012 = BBKTSPMXCG012;
	}

	public String getBBKTSPMXCG013() {
		return _BBKTSPMXCG013;
	}

	public void setBBKTSPMXCG013(String BBKTSPMXCG013) {
		_BBKTSPMXCG013 = BBKTSPMXCG013;
	}

	public String getBBKTSPMXCG014() {
		return _BBKTSPMXCG014;
	}

	public void setBBKTSPMXCG014(String BBKTSPMXCG014) {
		_BBKTSPMXCG014 = BBKTSPMXCG014;
	}

	public String getBBKTSPMXCG015() {
		return _BBKTSPMXCG015;
	}

	public void setBBKTSPMXCG015(String BBKTSPMXCG015) {
		_BBKTSPMXCG015 = BBKTSPMXCG015;
	}

	public String getBBKTSPMXCG016() {
		return _BBKTSPMXCG016;
	}

	public void setBBKTSPMXCG016(String BBKTSPMXCG016) {
		_BBKTSPMXCG016 = BBKTSPMXCG016;
	}

	public String getBBKTSPMXCG017() {
		return _BBKTSPMXCG017;
	}

	public void setBBKTSPMXCG017(String BBKTSPMXCG017) {
		_BBKTSPMXCG017 = BBKTSPMXCG017;
	}

	public String getBBKTSPMXCG018() {
		return _BBKTSPMXCG018;
	}

	public void setBBKTSPMXCG018(String BBKTSPMXCG018) {
		_BBKTSPMXCG018 = BBKTSPMXCG018;
	}

	public String getBBKTSPMXCG019() {
		return _BBKTSPMXCG019;
	}

	public void setBBKTSPMXCG019(String BBKTSPMXCG019) {
		_BBKTSPMXCG019 = BBKTSPMXCG019;
	}

	public String getBBKTSPMXCG020() {
		return _BBKTSPMXCG020;
	}

	public void setBBKTSPMXCG020(String BBKTSPMXCG020) {
		_BBKTSPMXCG020 = BBKTSPMXCG020;
	}

	public String getBBKTSPMXCG021() {
		return _BBKTSPMXCG021;
	}

	public void setBBKTSPMXCG021(String BBKTSPMXCG021) {
		_BBKTSPMXCG021 = BBKTSPMXCG021;
	}

	public String getBBKTSPMXCG022() {
		return _BBKTSPMXCG022;
	}

	public void setBBKTSPMXCG022(String BBKTSPMXCG022) {
		_BBKTSPMXCG022 = BBKTSPMXCG022;
	}

	public String getBBKTSPMXCG023() {
		return _BBKTSPMXCG023;
	}

	public void setBBKTSPMXCG023(String BBKTSPMXCG023) {
		_BBKTSPMXCG023 = BBKTSPMXCG023;
	}

	public String getBBKTSPMXCG024() {
		return _BBKTSPMXCG024;
	}

	public void setBBKTSPMXCG024(String BBKTSPMXCG024) {
		_BBKTSPMXCG024 = BBKTSPMXCG024;
	}

	public String getBBKTSPMXCG025() {
		return _BBKTSPMXCG025;
	}

	public void setBBKTSPMXCG025(String BBKTSPMXCG025) {
		_BBKTSPMXCG025 = BBKTSPMXCG025;
	}

	public Date getModifyDate() {
		return _modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;
	}

	public Date getSyncDate() {
		return _syncDate;
	}

	public void setSyncDate(Date syncDate) {
		_syncDate = syncDate;
	}

	private long _id;
	private long _mtCore;
	private long _convertAssembleId;
	private long _dossierId;
	private String _dossierNo;
	private String _referenceUid;
	private String _dossierIdCTN;
	private String _deliverableCode;
	private String _loai_dong_co;
	private String _XCG01001;
	private String _XCG01002;
	private String _XCG01003;
	private String _XCG01004;
	private String _XCG01005;
	private String _XCG01006;
	private String _XCG01007;
	private String _XCG01008;
	private String _XCG01009;
	private String _XCG01010;
	private String _XCG01011;
	private String _XCG01012;
	private String _XCG01013;
	private String _XCG01014;
	private String _XCG01016;
	private String _XCG01017;
	private String _XCG01019;
	private String _XCG01020;
	private String _XCG01021;
	private String _XCG01022;
	private String _XCG01024;
	private String _XCG01025;
	private String _XCG01026;
	private String _XCG01027;
	private String _XCG01028;
	private String _XCG01030;
	private String _XCG01031;
	private String _XCG01032;
	private String _XCG01033;
	private String _XCG01034;
	private String _XCG01035;
	private String _XCG01036;
	private String _XCG01037;
	private String _XCG01038;
	private String _XCG01039;
	private String _XCG01040;
	private String _XCG01041;
	private String _XCG01042;
	private String _XCG01043;
	private String _XCG01044;
	private String _XCG01045;
	private String _XCG01046;
	private String _XCG01047;
	private String _XCG01049;
	private String _XCG01050;
	private String _XCG01051;
	private String _XCG01052;
	private String _XCG01053;
	private String _XCG01054;
	private String _XCG01055;
	private String _XCG01056;
	private String _XCG01057;
	private String _XCG01058;
	private String _XCG01059;
	private String _XCG01060;
	private String _XCG01062;
	private String _XCG01063;
	private String _XCG01064;
	private String _XCG01065;
	private String _XCG01066;
	private String _XCG01067;
	private String _XCG01068;
	private String _XCG01069;
	private String _XCG01070;
	private String _XCG01072;
	private String _XCG01073;
	private String _XCG01074;
	private String _XCG01075;
	private String _XCG01076;
	private String _XCG01077;
	private String _XCG01078;
	private String _XCG01079;
	private String _XCG01080;
	private String _XCG01081;
	private String _XCG01082;
	private String _XCG01083;
	private String _XCG01084;
	private String _XCG01085;
	private String _XCG01086;
	private String _XCG01087;
	private String _XCG01088;
	private String _XCG01089;
	private String _XCG01090;
	private String _XCG01091;
	private String _XCG01092;
	private String _XCG01093;
	private String _XCG01094;
	private String _XCG01095;
	private String _XCG01096;
	private String _XCG01097;
	private String _XCG01098;
	private String _XCG01099;
	private String _XCG01100;
	private String _XCG01101;
	private String _XCG01102;
	private String _XCG01103;
	private String _XCG01104;
	private String _XCG01105;
	private String _XCG01106;
	private String _XCG01107;
	private String _XCG01108;
	private String _XCG01109;
	private String _XCG01110;
	private String _XCG01111;
	private String _XCG01112;
	private String _XCG01113;
	private String _XCG01114;
	private String _XCG01115;
	private String _XCG01116;
	private String _XCG01117;
	private String _XCG01118;
	private String _XCG01119;
	private String _XCG01120;
	private String _XCG01121;
	private String _XCG01122;
	private String _XCG01123;
	private String _XCG01124;
	private String _XCG01125;
	private String _XCG01126;
	private String _XCG01127;
	private String _XCG01128;
	private String _XCG01129;
	private String _XCG01130;
	private String _XCG01131;
	private String _XCG01132;
	private String _XCG01133;
	private String _XCG01134;
	private String _XCG01135;
	private String _XCG01136;
	private String _XCG01137;
	private String _XCG01138;
	private String _XCG01139;
	private String _XCG01140;
	private String _XCG01141;
	private String _XCG01142;
	private String _XCG01143;
	private String _XCG01144;
	private String _XCG01145;
	private String _XCG01146;
	private String _XCG01147;
	private String _XCG01148;
	private String _XCG01149;
	private String _XCG01150;
	private String _XCG01151;
	private String _XCG01152;
	private String _XCG01153;
	private String _XCG01154;
	private String _XCG01155;
	private String _XCG01156;
	private String _XCG01157;
	private String _XCG01158;
	private String _XCG01159;
	private String _XCG01160;
	private String _XCG01161;
	private String _XCG01162;
	private String _XCG01163;
	private String _XCG01164;
	private String _XCG01165;
	private String _XCG01166;
	private String _XCG01167;
	private String _XCG01169;
	private String _XCG01170;
	private String _XCG01171;
	private String _XCG01172;
	private String _XCG01173;
	private String _XCG01174;
	private String _XCG01175;
	private String _XCG01176;
	private String _XCG01177;
	private String _XCG01178;
	private String _XCG01179;
	private String _XCG01180;
	private String _XCG01181;
	private String _XCG01182;
	private String _XCG01183;
	private String _XCG01184;
	private String _XCG01185;
	private String _XCG01186;
	private String _XCG01187;
	private String _XCG01188;
	private String _XCG01189;
	private String _XCG01190;
	private String _XCG01191;
	private String _XCG01192;
	private String _XCG01193;
	private String _XCG01194;
	private String _XCG01195;
	private String _XCG01196;
	private String _XCG01197;
	private String _XCG01198;
	private String _XCG01199;
	private String _XCG01200;
	private String _XCG01202;
	private String _XCG01203;
	private String _XCG01204;
	private String _XCG01205;
	private String _XCG01206;
	private String _XCG01207;
	private String _XCG01208;
	private String _XCG01209;
	private String _XCG01210;
	private String _XCG01212;
	private String _XCG01213;
	private String _XCG01214;
	private String _XCG01215;
	private String _XCG01216;
	private String _XCG01217;
	private String _XCG01218;
	private String _XCG01219;
	private String _XCG01220;
	private String _XCG01221;
	private String _XCG01222;
	private String _XCG01223;
	private String _XCG01224;
	private String _XCG01225;
	private String _XCG01226;
	private String _XCG01228;
	private String _XCG01230;
	private String _XCG01231;
	private String _XCG01232;
	private String _XCG01234;
	private String _XCG01236;
	private String _XCG01237;
	private String _XCG01229;
	private String _XCG01238;
	private String _XCG01239;
	private String _XCG01240;
	private String _XCG01241;
	private String _XCG01242;
	private String _XCG01243;
	private String _XCG01235;
	private String _XCG01244;
	private String _XCG01245;
	private String _XCG01246;
	private String _XCG01247;
	private String _XCG01248;
	private String _XCG01249;
	private String _XCG11248;
	private String _XCG11249;
	private String _XCG01250;
	private String _XCG01251;
	private String _XCG01252;
	private String _XCG01253;
	private String _XCG01255;
	private String _XCG01256;
	private String _XCG01257;
	private String _XCG01258;
	private String _XCG01259;
	private String _XCG01260;
	private String _XCG01261;
	private String _XCG01262;
	private String _XCG11253;
	private String _XCG01263;
	private String _XCG01264;
	private String _XCG01265;
	private String _XCG01266;
	private String _XCG01901;
	private String _XCG01267;
	private String _XCG01902;
	private String _XCG01268;
	private String _XCG01269;
	private String _XCG01903;
	private String _XCG01270;
	private String _XCG01271;
	private String _XCG01273;
	private String _XCG01274;
	private String _XCG01275;
	private String _XCG01276;
	private String _XCG01277;
	private String _XCG01278;
	private String _XCG01279;
	private String _XCG01280;
	private String _XCG01281;
	private String _XCG01282;
	private String _XCG01283;
	private String _XCG01284;
	private String _XCG01285;
	private String _XCG01286;
	private String _XCG01287;
	private String _XCG01288;
	private String _XCG01289;
	private String _XCG01290;
	private String _XCG01291;
	private String _XCG01292;
	private String _XCG01293;
	private String _XCG01294;
	private String _XCG01295;
	private String _XCG01296;
	private String _XCG01297;
	private String _XCG01298;
	private String _XCG01300;
	private String _XCG01301;
	private String _XCG01302;
	private String _XCG01303;
	private String _XCG01304;
	private String _XCG01305;
	private String _XCG01306;
	private String _XCG01307;
	private String _XCG01308;
	private String _XCG01310;
	private String _XCG01311;
	private String _XCG01312;
	private String _XCG01313;
	private String _XCG01314;
	private String _XCG01315;
	private String _XCG01316;
	private String _XCG01317;
	private String _XCG01318;
	private String _XCG01319;
	private String _XCG01320;
	private String _XCG01321;
	private String _XCG01322;
	private String _XCG01323;
	private String _XCG01324;
	private String _XCG01325;
	private String _XCG01326;
	private String _XCG01327;
	private String _XCG01328;
	private String _XCG01330;
	private String _XCG01331;
	private String _XCG01332;
	private String _XCG01333;
	private String _XCG01334;
	private String _XCG01335;
	private String _XCG01336;
	private String _XCG01337;
	private String _XCG01338;
	private String _XCG01339;
	private String _XCG01340;
	private String _XCG01341;
	private String _XCG01342;
	private String _XCG01343;
	private String _XCG01344;
	private String _XCG01345;
	private String _XCG01346;
	private String _XCG01347;
	private String _XCG01348;
	private String _XCG01349;
	private String _XCG01350;
	private String _XCG01351;
	private String _XCG01352;
	private String _XCG01353;
	private String _XCG01354;
	private String _XCG01355;
	private String _XCG01356;
	private String _XCG01357;
	private String _XCG01358;
	private String _XCG01359;
	private String _XCG01360;
	private String _XCG01361;
	private String _XCG01362;
	private String _XCG01363;
	private String _XCG01364;
	private String _XCG01365;
	private String _XCG01366;
	private String _XCG01367;
	private String _XCG01368;
	private String _XCG01369;
	private String _XCG01370;
	private String _XCG01371;
	private String _XCG01372;
	private String _XCG01373;
	private String _XCG01374;
	private String _XCG01375;
	private String _XCG01376;
	private String _XCG01377;
	private String _XCG01378;
	private String _XCG01379;
	private String _XCG01381;
	private String _XCG01382;
	private String _XCG01383;
	private String _XCG01384;
	private String _XCG01385;
	private String _XCG01386;
	private String _XCG01387;
	private String _XCG01388;
	private String _XCG01389;
	private String _XCG01390;
	private String _XCG01391;
	private String _XCG01392;
	private String _XCG01393;
	private String _XCG01394;
	private String _XCG01395;
	private String _XCG01396;
	private String _XCG01397;
	private String _XCG01398;
	private String _XCG01399;
	private String _XCG01400;
	private String _XCG01402;
	private String _XCG01403;
	private String _XCG01404;
	private String _XCG01405;
	private String _XCG01406;
	private String _XCG01407;
	private String _XCG01408;
	private String _XCG01409;
	private String _XCG01410;
	private String _XCG01411;
	private String _XCG01412;
	private String _XCG01413;
	private String _XCG01414;
	private String _XCG01415;
	private String _XCG01416;
	private String _XCG01417;
	private String _XCG01418;
	private String _XCG01419;
	private String _XCG01420;
	private String _XCG01421;
	private String _XCG01422;
	private String _XCG01423;
	private String _XCG01424;
	private String _XCG01425;
	private String _XCG01426;
	private String _XCG01427;
	private String _XCG01428;
	private String _XCG01437;
	private String _XCG01429;
	private String _XCG01430;
	private String _XCG01431;
	private String _XCG01432;
	private String _XCG01433;
	private String _XCG01434;
	private String _XCG01435;
	private String _XCG01436;
	private String _XCG01439;
	private String _XCG01440;
	private String _XCG01441;
	private String _XCG01442;
	private String _XCG01443;
	private String _XCG01445;
	private String _XCG01446;
	private String _XCG01447;
	private String _XCG01448;
	private String _XCG01449;
	private String _XCG01450;
	private String _XCG01451;
	private String _XCG01452;
	private String _XCG01453;
	private String _XCG01454;
	private String _XCG01455;
	private String _XCG01456;
	private String _XCG01457;
	private String _XCG01458;
	private String _XCG01459;
	private String _XCG01460;
	private String _XCG01461;
	private String _XCG01462;
	private String _XCG01463;
	private String _XCG01464;
	private String _XCG01465;
	private String _XCG01466;
	private String _XCG01467;
	private String _XCG01468;
	private String _XCG01469;
	private String _XCG01470;
	private String _XCG01471;
	private String _XCG01472;
	private String _XCG01473;
	private String _XCG01474;
	private String _XCG01475;
	private String _XCG01476;
	private String _XCG01477;
	private String _XCG01478;
	private String _XCG01479;
	private String _XCG01480;
	private String _XCG01481;
	private String _XCG01482;
	private String _XCG01483;
	private String _XCG01484;
	private String _XCG01485;
	private String _XCG01486;
	private String _XCG01487;
	private String _XCG01488;
	private String _XCG01489;
	private String _XCG01490;
	private String _XCG01491;
	private String _XCG01492;
	private String _XCG01493;
	private String _XCG01494;
	private String _XCG01496;
	private String _XCG01497;
	private String _XCG01498;
	private String _XCG01499;
	private String _XCG01500;
	private String _XCG01501;
	private String _XCG01502;
	private String _XCG01503;
	private String _XCG01504;
	private String _XCG01505;
	private String _XCG01506;
	private String _XCG01507;
	private String _XCG01508;
	private String _XCG01509;
	private String _XCG01510;
	private String _XCG01512;
	private String _XCG01513;
	private String _XCG01514;
	private String _XCG01515;
	private String _XCG01516;
	private String _XCG01517;
	private String _XCG01518;
	private String _XCG01519;
	private String _XCG01520;
	private String _XCG01521;
	private String _XCG01522;
	private String _XCG01523;
	private String _XCG01524;
	private String _XCG01525;
	private String _XCG01526;
	private String _XCG01527;
	private String _XCG01528;
	private String _XCG01529;
	private String _XCG01530;
	private String _XCG01531;
	private String _XCG01904;
	private String _XCG01533;
	private String _XCG01905;
	private String _XCG01534;
	private String _XCG01906;
	private String _XCG01535;
	private String _XCG01907;
	private String _XCG01536;
	private String _XCG01908;
	private String _XCG01537;
	private String _XCG01909;
	private String _XCG01538;
	private String _XCG01910;
	private String _XCG01539;
	private String _XCG11535;
	private String _XCG01541;
	private String _XCG01542;
	private String _XCG01911;
	private String _XCG01543;
	private String _XCG01912;
	private String _XCG01544;
	private String _XCG01545;
	private String _XCG01546;
	private String _XCG01547;
	private String _XCG01548;
	private String _XCG01913;
	private String _XCG01549;
	private String _XCG01914;
	private String _XCG01550;
	private String _XCG01551;
	private String _XCG01552;
	private String _XCG01553;
	private String _XCG01554;
	private String _XCG01915;
	private String _XCG01555;
	private String _XCG01556;
	private String _XCG01557;
	private String _XCG01558;
	private String _XCG01559;
	private String _XCG01560;
	private String _XCG01561;
	private String _XCG01916;
	private String _XCG01562;
	private String _XCG01917;
	private String _XCG01563;
	private String _XCG01918;
	private String _XCG01564;
	private String _XCG01565;
	private String _XCG01566;
	private String _XCG01567;
	private String _XCG01568;
	private String _XCG01919;
	private String _XCG01569;
	private String _XCG01570;
	private String _XCG01571;
	private String _XCG01572;
	private String _XCG01920;
	private String _XCG01573;
	private String _XCG01921;
	private String _XCG01574;
	private String _XCG01922;
	private String _XCG01575;
	private String _XCG01576;
	private String _XCG01577;
	private String _XCG01578;
	private String _XCG01579;
	private String _XCG01580;
	private String _XCG01581;
	private String _XCG01582;
	private String _XCG01583;
	private String _XCG01584;
	private String _XCG01585;
	private String _XCG01586;
	private String _XCG01587;
	private String _XCG01588;
	private String _XCG01589;
	private String _XCG01590;
	private String _XCG01591;
	private String _XCG01592;
	private String _XCG01593;
	private String _XCG01594;
	private String _XCG01595;
	private String _XCG01596;
	private String _XCG01597;
	private String _XCG01598;
	private String _XCG01599;
	private String _XCG01600;
	private String _XCG01601;
	private String _XCG01602;
	private String _XCG01603;
	private String _XCG01923;
	private String _XCG01604;
	private String _XCG01924;
	private String _XCG01605;
	private String _XCG01606;
	private String _XCG01607;
	private String _XCG01608;
	private String _XCG01609;
	private String _XCG01925;
	private String _XCG01610;
	private String _XCG01926;
	private String _XCG01611;
	private String _XCG01612;
	private String _XCG01928;
	private String _XCG01613;
	private String _XCG01929;
	private String _XCG01614;
	private String _XCG01930;
	private String _XCG01615;
	private String _XCG01931;
	private String _XCG01616;
	private String _XCG01932;
	private String _XCG01617;
	private String _XCG01933;
	private String _XCG01618;
	private String _XCG01934;
	private String _XCG01619;
	private String _XCG01935;
	private String _XCG01620;
	private String _XCG01936;
	private String _XCG01621;
	private String _XCG01937;
	private String _XCG01622;
	private String _XCG01938;
	private String _XCG01623;
	private String _XCG01939;
	private String _XCG01624;
	private String _XCG01940;
	private String _XCG01625;
	private String _XCG01941;
	private String _XCG01626;
	private String _XCG01942;
	private String _XCG01627;
	private String _XCG01943;
	private String _XCG01628;
	private String _XCG01944;
	private String _XCG01630;
	private String _XCG01631;
	private String _XCG01632;
	private String _XCG01633;
	private String _XCG01634;
	private String _XCG01635;
	private String _XCG01636;
	private String _XCG01637;
	private String _XCG01638;
	private String _XCG01639;
	private String _XCG01640;
	private String _XCG01641;
	private String _XCG01642;
	private String _XCG01643;
	private String _XCG01644;
	private String _XCG01645;
	private String _XCG01646;
	private String _XCG01647;
	private String _XCG01648;
	private String _XCG01649;
	private String _XCG01650;
	private String _XCG01651;
	private String _XCG01652;
	private String _XCG01653;
	private String _XCG01654;
	private String _XCG01655;
	private String _XCG01656;
	private String _XCG01657;
	private String _XCG01658;
	private String _XCG01659;
	private String _XCG01660;
	private String _XCG01661;
	private String _XCG01662;
	private String _XCG01663;
	private String _XCG01664;
	private String _XCG01665;
	private String _XCG01666;
	private String _XCG01667;
	private String _XCG01668;
	private String _XCG01669;
	private String _XCG01670;
	private String _XCG01671;
	private String _XCG01672;
	private String _XCG01673;
	private String _XCG01674;
	private String _XCG01675;
	private String _XCG01676;
	private String _XCG01677;
	private String _XCG01678;
	private String _XCG01679;
	private String _XCG01680;
	private String _XCG01681;
	private String _XCG01682;
	private String _XCG01683;
	private String _XCG01684;
	private String _XCG01685;
	private String _XCG01686;
	private String _XCG01687;
	private String _XCG01688;
	private String _XCG01689;
	private String _XCG01690;
	private String _XCG01691;
	private String _XCG01692;
	private String _XCG01693;
	private String _XCG01694;
	private String _XCG01695;
	private String _XCG01696;
	private String _XCG01697;
	private String _XCG01698;
	private String _XCG01699;
	private String _XCG01700;
	private String _XCG01701;
	private String _XCG01702;
	private String _XCG01703;
	private String _XCG01704;
	private String _XCG01705;
	private String _XCG01706;
	private String _XCG01707;
	private String _XCG01708;
	private String _XCG01709;
	private String _XCG01710;
	private String _XCG01711;
	private String _XCG01712;
	private String _XCG01713;
	private String _XCG01714;
	private String _XCG01715;
	private String _XCG01716;
	private String _XCG01717;
	private String _XCG01718;
	private String _XCG01719;
	private String _XCG01720;
	private String _XCG01721;
	private String _XCG01722;
	private String _XCG01723;
	private String _XCG01724;
	private String _XCG01725;
	private String _XCG01726;
	private String _XCG01727;
	private String _XCG01728;
	private String _XCG01729;
	private String _XCG01730;
	private String _XCG01731;
	private String _XCG01732;
	private String _XCG01733;
	private String _XCG01734;
	private String _XCG01735;
	private String _XCG01736;
	private String _XCG01737;
	private String _XCG01738;
	private String _XCG01739;
	private String _XCG01740;
	private String _XCG01741;
	private String _XCG01742;
	private String _XCG01744;
	private String _XCG01745;
	private String _XCG01746;
	private String _XCG01747;
	private String _XCG01748;
	private String _XCG01749;
	private String _XCG01945;
	private String _XCG01750;
	private String _XCG01946;
	private String _XCG01751;
	private String _XCG01752;
	private String _XCG01753;
	private String _XCG01754;
	private String _XCG01756;
	private String _XCG01757;
	private String _XCG01758;
	private String _XCG01759;
	private String _XCG01948;
	private String _XCG01760;
	private String _XCG01949;
	private String _XCG01761;
	private String _XCG01950;
	private String _XCG01762;
	private String _XCG01951;
	private String _XCG01763;
	private String _XCG01952;
	private String _XCG01764;
	private String _XCG01953;
	private String _XCG01765;
	private String _XCG01954;
	private String _XCG01766;
	private String _XCG01955;
	private String _XCG01767;
	private String _XCG01956;
	private String _XCG01768;
	private String _XCG01957;
	private String _XCG01769;
	private String _XCG01958;
	private String _XCG01770;
	private String _XCG01771;
	private String _XCG01959;
	private String _XCG01772;
	private String _XCG01773;
	private String _XCG01774;
	private String _XCG01775;
	private String _XCG01776;
	private String _XCG01777;
	private String _XCG01778;
	private String _XCG01779;
	private String _XCG01780;
	private String _XCG01781;
	private String _XCG01783;
	private String _XCG01785;
	private String _XCG01786;
	private String _XCG01787;
	private String _XCG01788;
	private String _XCG01789;
	private String _XCG01790;
	private String _XCG01791;
	private String _XCG01792;
	private String _XCG01793;
	private String _XCG01794;
	private String _XCG01795;
	private String _XCG01796;
	private String _XCG01797;
	private String _XCG01798;
	private String _XCG01799;
	private String _XCG01801;
	private String _XCG01802;
	private String _XCG01803;
	private String _XCG01804;
	private String _XCG01805;
	private String _XCG01806;
	private String _XCG01807;
	private String _XCG01808;
	private String _XCG01809;
	private String _XCG01810;
	private String _XCG01811;
	private String _XCG01812;
	private String _XCG01813;
	private String _XCG01814;
	private String _TDTKXCG001;
	private String _TDTKXCG002;
	private String _TDTKXCG003;
	private String _TDTKXCG004;
	private String _TDTKXCG005;
	private String _TDTKXCG006;
	private String _TDTKXCG007;
	private String _TDTKXCG008;
	private String _TDTKXCG009;
	private String _TDTKXCG010;
	private String _TDTKXCG011;
	private String _TDTKXCG012;
	private String _TDTKXCG013;
	private String _TDTKXCG014;
	private String _TDTKXCG015;
	private String _TDTKXCG016;
	private String _TDTKXCG017;
	private String _TDTKXCG018;
	private String _TDTKXCG019;
	private String _TDTKXCG020;
	private String _TDTKXCG021;
	private String _TDTKXCG022;
	private String _TDTKXCG023;
	private String _TDTKXCG024;
	private String _TDTKXCG025;
	private String _TDTKXCG026;
	private String _TDTKXCG027;
	private String _TDTKXCG028;
	private String _TDTKXCG029;
	private String _TDTKXCG030;
	private String _TDTKXCG031;
	private String _TDTKXCG032;
	private String _TDTKXCG033;
	private String _TDTKXCG034;
	private String _TDTKXCG035;
	private String _TDTKXCG036;
	private String _BBCNCLKLXCG01;
	private String _BBCNCLKLXCG02;
	private String _BBCNCLKLXCG03;
	private String _BBCNCLKLXCG04;
	private String _BBCNCLKLXCG05;
	private String _BBCNCLKLXCG06;
	private String _BBCNCLKLXCG07;
	private String _BBCNCLKLXCG08;
	private String _BBCNCLKLXCG09;
	private String _BBCNCLKLXCG10;
	private String _BBCNCLKLXCG11;
	private String _BBCNCLKLXCG12;
	private String _BBCNCLKLXCG13;
	private String _BBCNCLKLXCG14;
	private String _BBCNCLKLXCG15;
	private String _BBCNCLKLXCG16;
	private String _BBCNCLKLXCG17;
	private String _BBCNCLKLXCG18;
	private String _BBCNCLKLXCG19;
	private String _BBCNCLKLXCG20;
	private String _BBCNCLKLXCG21;
	private String _BBCNCLKLXCG22;
	private String _BBCNCLKLXCG23;
	private String _BBCNCLKLXCG24;
	private String _BBCNCLKLXCG26;
	private String _BBCNCLKLXCG27;
	private String _BBCNCLKLXCG28;
	private String _BBCNCLKLXCG29;
	private String _BBCNCLKLXCG30;
	private String _BBCNCLKLXCG31;
	private String _BBCNCLKLXCG33;
	private String _BBCNCLKLXCG34;
	private String _BBCNCLKLXCG35;
	private String _BBCNCLKLXCG36;
	private String _BBCNCLKLXCG38;
	private String _BBCNCLKLXCG39;
	private String _BBCNCLKLXCG40;
	private String _BBCNCLKLXCG42;
	private String _BBCNCLKLXCG43;
	private String _BBCNCLKLXCG44;
	private String _BBCNCLKLXCG45;
	private String _BBCNCLKLXCG46;
	private String _BBCNCLKLXCG47;
	private String _BBCNCLKLXCG48;
	private String _BBCNCLKLXCG49;
	private String _BBCNCLKLXCG50;
	private String _BBCNCLKLXCG51;
	private String _BBCNCLKLXCG52;
	private String _BBCNCLKLXCG53;
	private String _BBCNCLKLXCG54;
	private String _BBKTSPMXCG001;
	private String _BBKTSPMXCG002;
	private String _BBKTSPMXCG003;
	private String _BBKTSPMXCG004;
	private String _BBKTSPMXCG005;
	private String _BBKTSPMXCG006;
	private String _BBKTSPMXCG007;
	private String _BBKTSPMXCG008;
	private String _BBKTSPMXCG009;
	private String _BBKTSPMXCG010;
	private String _BBKTSPMXCG011;
	private String _BBKTSPMXCG012;
	private String _BBKTSPMXCG013;
	private String _BBKTSPMXCG014;
	private String _BBKTSPMXCG015;
	private String _BBKTSPMXCG016;
	private String _BBKTSPMXCG017;
	private String _BBKTSPMXCG018;
	private String _BBKTSPMXCG019;
	private String _BBKTSPMXCG020;
	private String _BBKTSPMXCG021;
	private String _BBKTSPMXCG022;
	private String _BBKTSPMXCG023;
	private String _BBKTSPMXCG024;
	private String _BBKTSPMXCG025;
	private Date _modifyDate;
	private Date _syncDate;
}
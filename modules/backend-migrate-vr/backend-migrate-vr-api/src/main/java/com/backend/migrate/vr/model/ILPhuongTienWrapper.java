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

package com.backend.migrate.vr.model;

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
 * This class is a wrapper for {@link ILPhuongTien}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ILPhuongTien
 * @generated
 */
@ProviderType
public class ILPhuongTienWrapper implements ILPhuongTien,
	ModelWrapper<ILPhuongTien> {
	public ILPhuongTienWrapper(ILPhuongTien ilPhuongTien) {
		_ilPhuongTien = ilPhuongTien;
	}

	@Override
	public Class<?> getModelClass() {
		return ILPhuongTien.class;
	}

	@Override
	public String getModelClassName() {
		return ILPhuongTien.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("id", getId());
		attributes.put("bienkiemsoat", getBienkiemsoat());
		attributes.put("succhua", getSucchua());
		attributes.put("loaighe_id", getLoaighe_id());
		attributes.put("namsanxuat", getNamsanxuat());
		attributes.put("nuocsanxuat_id", getNuocsanxuat_id());
		attributes.put("tenhieuxe_id", getTenhieuxe_id());
		attributes.put("mauson_id", getMauson_id());
		attributes.put("sokhung", getSokhung());
		attributes.put("somay", getSomay());
		attributes.put("namhetnienhansudung", getNamhetnienhansudung());
		attributes.put("namcaitao", getNamcaitao());
		attributes.put("trongtai", getTrongtai());
		attributes.put("loaihinhvantai_id", getLoaihinhvantai_id());
		attributes.put("la_xegiuongnam", getLa_xegiuongnam());
		attributes.put("sogiuongnam", getSogiuongnam());
		attributes.put("tennguoisohuu", getTennguoisohuu());
		attributes.put("doanhnghiep_id", getDoanhnghiep_id());
		attributes.put("tuyenkhaithac_id", getTuyenkhaithac_id());
		attributes.put("web_giamsathanhtrinh", getWeb_giamsathanhtrinh());
		attributes.put("tendangnhap_gsht", getTendangnhap_gsht());
		attributes.put("matkhau_gsht", getMatkhau_gsht());
		attributes.put("ghichu", getGhichu());
		attributes.put("trangthai", getTrangthai());
		attributes.put("coquanquanly_id", getCoquanquanly_id());
		attributes.put("congdan_id", getCongdan_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String bienkiemsoat = (String)attributes.get("bienkiemsoat");

		if (bienkiemsoat != null) {
			setBienkiemsoat(bienkiemsoat);
		}

		Integer succhua = (Integer)attributes.get("succhua");

		if (succhua != null) {
			setSucchua(succhua);
		}

		Long loaighe_id = (Long)attributes.get("loaighe_id");

		if (loaighe_id != null) {
			setLoaighe_id(loaighe_id);
		}

		Integer namsanxuat = (Integer)attributes.get("namsanxuat");

		if (namsanxuat != null) {
			setNamsanxuat(namsanxuat);
		}

		Long nuocsanxuat_id = (Long)attributes.get("nuocsanxuat_id");

		if (nuocsanxuat_id != null) {
			setNuocsanxuat_id(nuocsanxuat_id);
		}

		Long tenhieuxe_id = (Long)attributes.get("tenhieuxe_id");

		if (tenhieuxe_id != null) {
			setTenhieuxe_id(tenhieuxe_id);
		}

		Long mauson_id = (Long)attributes.get("mauson_id");

		if (mauson_id != null) {
			setMauson_id(mauson_id);
		}

		String sokhung = (String)attributes.get("sokhung");

		if (sokhung != null) {
			setSokhung(sokhung);
		}

		String somay = (String)attributes.get("somay");

		if (somay != null) {
			setSomay(somay);
		}

		Integer namhetnienhansudung = (Integer)attributes.get(
				"namhetnienhansudung");

		if (namhetnienhansudung != null) {
			setNamhetnienhansudung(namhetnienhansudung);
		}

		Date namcaitao = (Date)attributes.get("namcaitao");

		if (namcaitao != null) {
			setNamcaitao(namcaitao);
		}

		Integer trongtai = (Integer)attributes.get("trongtai");

		if (trongtai != null) {
			setTrongtai(trongtai);
		}

		Integer loaihinhvantai_id = (Integer)attributes.get("loaihinhvantai_id");

		if (loaihinhvantai_id != null) {
			setLoaihinhvantai_id(loaihinhvantai_id);
		}

		Integer la_xegiuongnam = (Integer)attributes.get("la_xegiuongnam");

		if (la_xegiuongnam != null) {
			setLa_xegiuongnam(la_xegiuongnam);
		}

		Integer sogiuongnam = (Integer)attributes.get("sogiuongnam");

		if (sogiuongnam != null) {
			setSogiuongnam(sogiuongnam);
		}

		String tennguoisohuu = (String)attributes.get("tennguoisohuu");

		if (tennguoisohuu != null) {
			setTennguoisohuu(tennguoisohuu);
		}

		Integer doanhnghiep_id = (Integer)attributes.get("doanhnghiep_id");

		if (doanhnghiep_id != null) {
			setDoanhnghiep_id(doanhnghiep_id);
		}

		Integer tuyenkhaithac_id = (Integer)attributes.get("tuyenkhaithac_id");

		if (tuyenkhaithac_id != null) {
			setTuyenkhaithac_id(tuyenkhaithac_id);
		}

		String web_giamsathanhtrinh = (String)attributes.get(
				"web_giamsathanhtrinh");

		if (web_giamsathanhtrinh != null) {
			setWeb_giamsathanhtrinh(web_giamsathanhtrinh);
		}

		String tendangnhap_gsht = (String)attributes.get("tendangnhap_gsht");

		if (tendangnhap_gsht != null) {
			setTendangnhap_gsht(tendangnhap_gsht);
		}

		String matkhau_gsht = (String)attributes.get("matkhau_gsht");

		if (matkhau_gsht != null) {
			setMatkhau_gsht(matkhau_gsht);
		}

		String ghichu = (String)attributes.get("ghichu");

		if (ghichu != null) {
			setGhichu(ghichu);
		}

		Integer trangthai = (Integer)attributes.get("trangthai");

		if (trangthai != null) {
			setTrangthai(trangthai);
		}

		Integer coquanquanly_id = (Integer)attributes.get("coquanquanly_id");

		if (coquanquanly_id != null) {
			setCoquanquanly_id(coquanquanly_id);
		}

		Long congdan_id = (Long)attributes.get("congdan_id");

		if (congdan_id != null) {
			setCongdan_id(congdan_id);
		}
	}

	@Override
	public ILPhuongTien toEscapedModel() {
		return new ILPhuongTienWrapper(_ilPhuongTien.toEscapedModel());
	}

	@Override
	public ILPhuongTien toUnescapedModel() {
		return new ILPhuongTienWrapper(_ilPhuongTien.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _ilPhuongTien.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _ilPhuongTien.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _ilPhuongTien.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _ilPhuongTien.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ILPhuongTien> toCacheModel() {
		return _ilPhuongTien.toCacheModel();
	}

	@Override
	public int compareTo(ILPhuongTien ilPhuongTien) {
		return _ilPhuongTien.compareTo(ilPhuongTien);
	}

	/**
	* Returns the coquanquanly_id of this il phuong tien.
	*
	* @return the coquanquanly_id of this il phuong tien
	*/
	@Override
	public int getCoquanquanly_id() {
		return _ilPhuongTien.getCoquanquanly_id();
	}

	/**
	* Returns the doanhnghiep_id of this il phuong tien.
	*
	* @return the doanhnghiep_id of this il phuong tien
	*/
	@Override
	public int getDoanhnghiep_id() {
		return _ilPhuongTien.getDoanhnghiep_id();
	}

	/**
	* Returns the la_xegiuongnam of this il phuong tien.
	*
	* @return the la_xegiuongnam of this il phuong tien
	*/
	@Override
	public int getLa_xegiuongnam() {
		return _ilPhuongTien.getLa_xegiuongnam();
	}

	/**
	* Returns the loaihinhvantai_id of this il phuong tien.
	*
	* @return the loaihinhvantai_id of this il phuong tien
	*/
	@Override
	public int getLoaihinhvantai_id() {
		return _ilPhuongTien.getLoaihinhvantai_id();
	}

	/**
	* Returns the namhetnienhansudung of this il phuong tien.
	*
	* @return the namhetnienhansudung of this il phuong tien
	*/
	@Override
	public int getNamhetnienhansudung() {
		return _ilPhuongTien.getNamhetnienhansudung();
	}

	/**
	* Returns the namsanxuat of this il phuong tien.
	*
	* @return the namsanxuat of this il phuong tien
	*/
	@Override
	public int getNamsanxuat() {
		return _ilPhuongTien.getNamsanxuat();
	}

	/**
	* Returns the sogiuongnam of this il phuong tien.
	*
	* @return the sogiuongnam of this il phuong tien
	*/
	@Override
	public int getSogiuongnam() {
		return _ilPhuongTien.getSogiuongnam();
	}

	/**
	* Returns the succhua of this il phuong tien.
	*
	* @return the succhua of this il phuong tien
	*/
	@Override
	public int getSucchua() {
		return _ilPhuongTien.getSucchua();
	}

	/**
	* Returns the trangthai of this il phuong tien.
	*
	* @return the trangthai of this il phuong tien
	*/
	@Override
	public int getTrangthai() {
		return _ilPhuongTien.getTrangthai();
	}

	/**
	* Returns the trongtai of this il phuong tien.
	*
	* @return the trongtai of this il phuong tien
	*/
	@Override
	public int getTrongtai() {
		return _ilPhuongTien.getTrongtai();
	}

	/**
	* Returns the tuyenkhaithac_id of this il phuong tien.
	*
	* @return the tuyenkhaithac_id of this il phuong tien
	*/
	@Override
	public int getTuyenkhaithac_id() {
		return _ilPhuongTien.getTuyenkhaithac_id();
	}

	@Override
	public int hashCode() {
		return _ilPhuongTien.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ilPhuongTien.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ILPhuongTienWrapper((ILPhuongTien)_ilPhuongTien.clone());
	}

	/**
	* Returns the bienkiemsoat of this il phuong tien.
	*
	* @return the bienkiemsoat of this il phuong tien
	*/
	@Override
	public java.lang.String getBienkiemsoat() {
		return _ilPhuongTien.getBienkiemsoat();
	}

	/**
	* Returns the ghichu of this il phuong tien.
	*
	* @return the ghichu of this il phuong tien
	*/
	@Override
	public java.lang.String getGhichu() {
		return _ilPhuongTien.getGhichu();
	}

	/**
	* Returns the matkhau_gsht of this il phuong tien.
	*
	* @return the matkhau_gsht of this il phuong tien
	*/
	@Override
	public java.lang.String getMatkhau_gsht() {
		return _ilPhuongTien.getMatkhau_gsht();
	}

	/**
	* Returns the sokhung of this il phuong tien.
	*
	* @return the sokhung of this il phuong tien
	*/
	@Override
	public java.lang.String getSokhung() {
		return _ilPhuongTien.getSokhung();
	}

	/**
	* Returns the somay of this il phuong tien.
	*
	* @return the somay of this il phuong tien
	*/
	@Override
	public java.lang.String getSomay() {
		return _ilPhuongTien.getSomay();
	}

	/**
	* Returns the tendangnhap_gsht of this il phuong tien.
	*
	* @return the tendangnhap_gsht of this il phuong tien
	*/
	@Override
	public java.lang.String getTendangnhap_gsht() {
		return _ilPhuongTien.getTendangnhap_gsht();
	}

	/**
	* Returns the tennguoisohuu of this il phuong tien.
	*
	* @return the tennguoisohuu of this il phuong tien
	*/
	@Override
	public java.lang.String getTennguoisohuu() {
		return _ilPhuongTien.getTennguoisohuu();
	}

	/**
	* Returns the uuid of this il phuong tien.
	*
	* @return the uuid of this il phuong tien
	*/
	@Override
	public java.lang.String getUuid() {
		return _ilPhuongTien.getUuid();
	}

	/**
	* Returns the web_giamsathanhtrinh of this il phuong tien.
	*
	* @return the web_giamsathanhtrinh of this il phuong tien
	*/
	@Override
	public java.lang.String getWeb_giamsathanhtrinh() {
		return _ilPhuongTien.getWeb_giamsathanhtrinh();
	}

	@Override
	public java.lang.String toString() {
		return _ilPhuongTien.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _ilPhuongTien.toXmlString();
	}

	/**
	* Returns the namcaitao of this il phuong tien.
	*
	* @return the namcaitao of this il phuong tien
	*/
	@Override
	public Date getNamcaitao() {
		return _ilPhuongTien.getNamcaitao();
	}

	/**
	* Returns the congdan_id of this il phuong tien.
	*
	* @return the congdan_id of this il phuong tien
	*/
	@Override
	public long getCongdan_id() {
		return _ilPhuongTien.getCongdan_id();
	}

	/**
	* Returns the ID of this il phuong tien.
	*
	* @return the ID of this il phuong tien
	*/
	@Override
	public long getId() {
		return _ilPhuongTien.getId();
	}

	/**
	* Returns the loaighe_id of this il phuong tien.
	*
	* @return the loaighe_id of this il phuong tien
	*/
	@Override
	public long getLoaighe_id() {
		return _ilPhuongTien.getLoaighe_id();
	}

	/**
	* Returns the mauson_id of this il phuong tien.
	*
	* @return the mauson_id of this il phuong tien
	*/
	@Override
	public long getMauson_id() {
		return _ilPhuongTien.getMauson_id();
	}

	/**
	* Returns the nuocsanxuat_id of this il phuong tien.
	*
	* @return the nuocsanxuat_id of this il phuong tien
	*/
	@Override
	public long getNuocsanxuat_id() {
		return _ilPhuongTien.getNuocsanxuat_id();
	}

	/**
	* Returns the primary key of this il phuong tien.
	*
	* @return the primary key of this il phuong tien
	*/
	@Override
	public long getPrimaryKey() {
		return _ilPhuongTien.getPrimaryKey();
	}

	/**
	* Returns the tenhieuxe_id of this il phuong tien.
	*
	* @return the tenhieuxe_id of this il phuong tien
	*/
	@Override
	public long getTenhieuxe_id() {
		return _ilPhuongTien.getTenhieuxe_id();
	}

	@Override
	public void persist() {
		_ilPhuongTien.persist();
	}

	/**
	* Sets the bienkiemsoat of this il phuong tien.
	*
	* @param bienkiemsoat the bienkiemsoat of this il phuong tien
	*/
	@Override
	public void setBienkiemsoat(java.lang.String bienkiemsoat) {
		_ilPhuongTien.setBienkiemsoat(bienkiemsoat);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_ilPhuongTien.setCachedModel(cachedModel);
	}

	/**
	* Sets the congdan_id of this il phuong tien.
	*
	* @param congdan_id the congdan_id of this il phuong tien
	*/
	@Override
	public void setCongdan_id(long congdan_id) {
		_ilPhuongTien.setCongdan_id(congdan_id);
	}

	/**
	* Sets the coquanquanly_id of this il phuong tien.
	*
	* @param coquanquanly_id the coquanquanly_id of this il phuong tien
	*/
	@Override
	public void setCoquanquanly_id(int coquanquanly_id) {
		_ilPhuongTien.setCoquanquanly_id(coquanquanly_id);
	}

	/**
	* Sets the doanhnghiep_id of this il phuong tien.
	*
	* @param doanhnghiep_id the doanhnghiep_id of this il phuong tien
	*/
	@Override
	public void setDoanhnghiep_id(int doanhnghiep_id) {
		_ilPhuongTien.setDoanhnghiep_id(doanhnghiep_id);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_ilPhuongTien.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_ilPhuongTien.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_ilPhuongTien.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ghichu of this il phuong tien.
	*
	* @param ghichu the ghichu of this il phuong tien
	*/
	@Override
	public void setGhichu(java.lang.String ghichu) {
		_ilPhuongTien.setGhichu(ghichu);
	}

	/**
	* Sets the ID of this il phuong tien.
	*
	* @param id the ID of this il phuong tien
	*/
	@Override
	public void setId(long id) {
		_ilPhuongTien.setId(id);
	}

	/**
	* Sets the la_xegiuongnam of this il phuong tien.
	*
	* @param la_xegiuongnam the la_xegiuongnam of this il phuong tien
	*/
	@Override
	public void setLa_xegiuongnam(int la_xegiuongnam) {
		_ilPhuongTien.setLa_xegiuongnam(la_xegiuongnam);
	}

	/**
	* Sets the loaighe_id of this il phuong tien.
	*
	* @param loaighe_id the loaighe_id of this il phuong tien
	*/
	@Override
	public void setLoaighe_id(long loaighe_id) {
		_ilPhuongTien.setLoaighe_id(loaighe_id);
	}

	/**
	* Sets the loaihinhvantai_id of this il phuong tien.
	*
	* @param loaihinhvantai_id the loaihinhvantai_id of this il phuong tien
	*/
	@Override
	public void setLoaihinhvantai_id(int loaihinhvantai_id) {
		_ilPhuongTien.setLoaihinhvantai_id(loaihinhvantai_id);
	}

	/**
	* Sets the matkhau_gsht of this il phuong tien.
	*
	* @param matkhau_gsht the matkhau_gsht of this il phuong tien
	*/
	@Override
	public void setMatkhau_gsht(java.lang.String matkhau_gsht) {
		_ilPhuongTien.setMatkhau_gsht(matkhau_gsht);
	}

	/**
	* Sets the mauson_id of this il phuong tien.
	*
	* @param mauson_id the mauson_id of this il phuong tien
	*/
	@Override
	public void setMauson_id(long mauson_id) {
		_ilPhuongTien.setMauson_id(mauson_id);
	}

	/**
	* Sets the namcaitao of this il phuong tien.
	*
	* @param namcaitao the namcaitao of this il phuong tien
	*/
	@Override
	public void setNamcaitao(Date namcaitao) {
		_ilPhuongTien.setNamcaitao(namcaitao);
	}

	/**
	* Sets the namhetnienhansudung of this il phuong tien.
	*
	* @param namhetnienhansudung the namhetnienhansudung of this il phuong tien
	*/
	@Override
	public void setNamhetnienhansudung(int namhetnienhansudung) {
		_ilPhuongTien.setNamhetnienhansudung(namhetnienhansudung);
	}

	/**
	* Sets the namsanxuat of this il phuong tien.
	*
	* @param namsanxuat the namsanxuat of this il phuong tien
	*/
	@Override
	public void setNamsanxuat(int namsanxuat) {
		_ilPhuongTien.setNamsanxuat(namsanxuat);
	}

	@Override
	public void setNew(boolean n) {
		_ilPhuongTien.setNew(n);
	}

	/**
	* Sets the nuocsanxuat_id of this il phuong tien.
	*
	* @param nuocsanxuat_id the nuocsanxuat_id of this il phuong tien
	*/
	@Override
	public void setNuocsanxuat_id(long nuocsanxuat_id) {
		_ilPhuongTien.setNuocsanxuat_id(nuocsanxuat_id);
	}

	/**
	* Sets the primary key of this il phuong tien.
	*
	* @param primaryKey the primary key of this il phuong tien
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_ilPhuongTien.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_ilPhuongTien.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sogiuongnam of this il phuong tien.
	*
	* @param sogiuongnam the sogiuongnam of this il phuong tien
	*/
	@Override
	public void setSogiuongnam(int sogiuongnam) {
		_ilPhuongTien.setSogiuongnam(sogiuongnam);
	}

	/**
	* Sets the sokhung of this il phuong tien.
	*
	* @param sokhung the sokhung of this il phuong tien
	*/
	@Override
	public void setSokhung(java.lang.String sokhung) {
		_ilPhuongTien.setSokhung(sokhung);
	}

	/**
	* Sets the somay of this il phuong tien.
	*
	* @param somay the somay of this il phuong tien
	*/
	@Override
	public void setSomay(java.lang.String somay) {
		_ilPhuongTien.setSomay(somay);
	}

	/**
	* Sets the succhua of this il phuong tien.
	*
	* @param succhua the succhua of this il phuong tien
	*/
	@Override
	public void setSucchua(int succhua) {
		_ilPhuongTien.setSucchua(succhua);
	}

	/**
	* Sets the tendangnhap_gsht of this il phuong tien.
	*
	* @param tendangnhap_gsht the tendangnhap_gsht of this il phuong tien
	*/
	@Override
	public void setTendangnhap_gsht(java.lang.String tendangnhap_gsht) {
		_ilPhuongTien.setTendangnhap_gsht(tendangnhap_gsht);
	}

	/**
	* Sets the tenhieuxe_id of this il phuong tien.
	*
	* @param tenhieuxe_id the tenhieuxe_id of this il phuong tien
	*/
	@Override
	public void setTenhieuxe_id(long tenhieuxe_id) {
		_ilPhuongTien.setTenhieuxe_id(tenhieuxe_id);
	}

	/**
	* Sets the tennguoisohuu of this il phuong tien.
	*
	* @param tennguoisohuu the tennguoisohuu of this il phuong tien
	*/
	@Override
	public void setTennguoisohuu(java.lang.String tennguoisohuu) {
		_ilPhuongTien.setTennguoisohuu(tennguoisohuu);
	}

	/**
	* Sets the trangthai of this il phuong tien.
	*
	* @param trangthai the trangthai of this il phuong tien
	*/
	@Override
	public void setTrangthai(int trangthai) {
		_ilPhuongTien.setTrangthai(trangthai);
	}

	/**
	* Sets the trongtai of this il phuong tien.
	*
	* @param trongtai the trongtai of this il phuong tien
	*/
	@Override
	public void setTrongtai(int trongtai) {
		_ilPhuongTien.setTrongtai(trongtai);
	}

	/**
	* Sets the tuyenkhaithac_id of this il phuong tien.
	*
	* @param tuyenkhaithac_id the tuyenkhaithac_id of this il phuong tien
	*/
	@Override
	public void setTuyenkhaithac_id(int tuyenkhaithac_id) {
		_ilPhuongTien.setTuyenkhaithac_id(tuyenkhaithac_id);
	}

	/**
	* Sets the uuid of this il phuong tien.
	*
	* @param uuid the uuid of this il phuong tien
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_ilPhuongTien.setUuid(uuid);
	}

	/**
	* Sets the web_giamsathanhtrinh of this il phuong tien.
	*
	* @param web_giamsathanhtrinh the web_giamsathanhtrinh of this il phuong tien
	*/
	@Override
	public void setWeb_giamsathanhtrinh(java.lang.String web_giamsathanhtrinh) {
		_ilPhuongTien.setWeb_giamsathanhtrinh(web_giamsathanhtrinh);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ILPhuongTienWrapper)) {
			return false;
		}

		ILPhuongTienWrapper ilPhuongTienWrapper = (ILPhuongTienWrapper)obj;

		if (Objects.equals(_ilPhuongTien, ilPhuongTienWrapper._ilPhuongTien)) {
			return true;
		}

		return false;
	}

	@Override
	public ILPhuongTien getWrappedModel() {
		return _ilPhuongTien;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _ilPhuongTien.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _ilPhuongTien.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_ilPhuongTien.resetOriginalValues();
	}

	private final ILPhuongTien _ilPhuongTien;
}
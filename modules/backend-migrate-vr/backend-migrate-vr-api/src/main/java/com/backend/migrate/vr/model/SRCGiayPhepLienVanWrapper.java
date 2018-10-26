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
 * This class is a wrapper for {@link SRCGiayPhepLienVan}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SRCGiayPhepLienVan
 * @generated
 */
@ProviderType
public class SRCGiayPhepLienVanWrapper implements SRCGiayPhepLienVan,
	ModelWrapper<SRCGiayPhepLienVan> {
	public SRCGiayPhepLienVanWrapper(SRCGiayPhepLienVan srcGiayPhepLienVan) {
		_srcGiayPhepLienVan = srcGiayPhepLienVan;
	}

	@Override
	public Class<?> getModelClass() {
		return SRCGiayPhepLienVan.class;
	}

	@Override
	public String getModelClassName() {
		return SRCGiayPhepLienVan.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("so_phuhieu_lienvan", getSo_phuhieu_lienvan());
		attributes.put("lancapphep", getLancapphep());
		attributes.put("phuongtien_id", getPhuongtien_id());
		attributes.put("bienkiemsoat", getBienkiemsoat());
		attributes.put("succhua", getSucchua());
		attributes.put("namsanxuat", getNamsanxuat());
		attributes.put("nhanhieu_id", getNhanhieu_id());
		attributes.put("sokhung", getSokhung());
		attributes.put("somay", getSomay());
		attributes.put("mauson_id", getMauson_id());
		attributes.put("loaihinh_id", getLoaihinh_id());
		attributes.put("cuakhau_id", getCuakhau_id());
		attributes.put("denghi_captu", getDenghi_captu());
		attributes.put("denghi_capden", getDenghi_capden());
		attributes.put("ngaycap", getNgaycap());
		attributes.put("nguoicap", getNguoicap());
		attributes.put("ngayhethan", getNgayhethan());
		attributes.put("ngaythuhoi", getNgaythuhoi());
		attributes.put("lydo_thuhoi", getLydo_thuhoi());
		attributes.put("ngayky", getNgayky());
		attributes.put("nguoiky", getNguoiky());
		attributes.put("nguoi_ky_id", getNguoi_ky_id());
		attributes.put("ghichu", getGhichu());
		attributes.put("url_file_gplv", getUrl_file_gplv());
		attributes.put("trangthai", getTrangthai());
		attributes.put("quocgia_id", getQuocgia_id());
		attributes.put("tuyen_id", getTuyen_id());
		attributes.put("coquanquanly_id", getCoquanquanly_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String so_phuhieu_lienvan = (String)attributes.get("so_phuhieu_lienvan");

		if (so_phuhieu_lienvan != null) {
			setSo_phuhieu_lienvan(so_phuhieu_lienvan);
		}

		Integer lancapphep = (Integer)attributes.get("lancapphep");

		if (lancapphep != null) {
			setLancapphep(lancapphep);
		}

		Long phuongtien_id = (Long)attributes.get("phuongtien_id");

		if (phuongtien_id != null) {
			setPhuongtien_id(phuongtien_id);
		}

		String bienkiemsoat = (String)attributes.get("bienkiemsoat");

		if (bienkiemsoat != null) {
			setBienkiemsoat(bienkiemsoat);
		}

		Integer succhua = (Integer)attributes.get("succhua");

		if (succhua != null) {
			setSucchua(succhua);
		}

		Integer namsanxuat = (Integer)attributes.get("namsanxuat");

		if (namsanxuat != null) {
			setNamsanxuat(namsanxuat);
		}

		Long nhanhieu_id = (Long)attributes.get("nhanhieu_id");

		if (nhanhieu_id != null) {
			setNhanhieu_id(nhanhieu_id);
		}

		String sokhung = (String)attributes.get("sokhung");

		if (sokhung != null) {
			setSokhung(sokhung);
		}

		String somay = (String)attributes.get("somay");

		if (somay != null) {
			setSomay(somay);
		}

		Long mauson_id = (Long)attributes.get("mauson_id");

		if (mauson_id != null) {
			setMauson_id(mauson_id);
		}

		Long loaihinh_id = (Long)attributes.get("loaihinh_id");

		if (loaihinh_id != null) {
			setLoaihinh_id(loaihinh_id);
		}

		Long cuakhau_id = (Long)attributes.get("cuakhau_id");

		if (cuakhau_id != null) {
			setCuakhau_id(cuakhau_id);
		}

		Date denghi_captu = (Date)attributes.get("denghi_captu");

		if (denghi_captu != null) {
			setDenghi_captu(denghi_captu);
		}

		Date denghi_capden = (Date)attributes.get("denghi_capden");

		if (denghi_capden != null) {
			setDenghi_capden(denghi_capden);
		}

		Date ngaycap = (Date)attributes.get("ngaycap");

		if (ngaycap != null) {
			setNgaycap(ngaycap);
		}

		String nguoicap = (String)attributes.get("nguoicap");

		if (nguoicap != null) {
			setNguoicap(nguoicap);
		}

		Date ngayhethan = (Date)attributes.get("ngayhethan");

		if (ngayhethan != null) {
			setNgayhethan(ngayhethan);
		}

		Date ngaythuhoi = (Date)attributes.get("ngaythuhoi");

		if (ngaythuhoi != null) {
			setNgaythuhoi(ngaythuhoi);
		}

		String lydo_thuhoi = (String)attributes.get("lydo_thuhoi");

		if (lydo_thuhoi != null) {
			setLydo_thuhoi(lydo_thuhoi);
		}

		Date ngayky = (Date)attributes.get("ngayky");

		if (ngayky != null) {
			setNgayky(ngayky);
		}

		String nguoiky = (String)attributes.get("nguoiky");

		if (nguoiky != null) {
			setNguoiky(nguoiky);
		}

		Long nguoi_ky_id = (Long)attributes.get("nguoi_ky_id");

		if (nguoi_ky_id != null) {
			setNguoi_ky_id(nguoi_ky_id);
		}

		String ghichu = (String)attributes.get("ghichu");

		if (ghichu != null) {
			setGhichu(ghichu);
		}

		String url_file_gplv = (String)attributes.get("url_file_gplv");

		if (url_file_gplv != null) {
			setUrl_file_gplv(url_file_gplv);
		}

		String trangthai = (String)attributes.get("trangthai");

		if (trangthai != null) {
			setTrangthai(trangthai);
		}

		Long quocgia_id = (Long)attributes.get("quocgia_id");

		if (quocgia_id != null) {
			setQuocgia_id(quocgia_id);
		}

		Long tuyen_id = (Long)attributes.get("tuyen_id");

		if (tuyen_id != null) {
			setTuyen_id(tuyen_id);
		}

		Long coquanquanly_id = (Long)attributes.get("coquanquanly_id");

		if (coquanquanly_id != null) {
			setCoquanquanly_id(coquanquanly_id);
		}
	}

	@Override
	public SRCGiayPhepLienVan toEscapedModel() {
		return new SRCGiayPhepLienVanWrapper(_srcGiayPhepLienVan.toEscapedModel());
	}

	@Override
	public SRCGiayPhepLienVan toUnescapedModel() {
		return new SRCGiayPhepLienVanWrapper(_srcGiayPhepLienVan.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _srcGiayPhepLienVan.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _srcGiayPhepLienVan.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _srcGiayPhepLienVan.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _srcGiayPhepLienVan.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<SRCGiayPhepLienVan> toCacheModel() {
		return _srcGiayPhepLienVan.toCacheModel();
	}

	@Override
	public int compareTo(SRCGiayPhepLienVan srcGiayPhepLienVan) {
		return _srcGiayPhepLienVan.compareTo(srcGiayPhepLienVan);
	}

	/**
	* Returns the lancapphep of this src giay phep lien van.
	*
	* @return the lancapphep of this src giay phep lien van
	*/
	@Override
	public int getLancapphep() {
		return _srcGiayPhepLienVan.getLancapphep();
	}

	/**
	* Returns the namsanxuat of this src giay phep lien van.
	*
	* @return the namsanxuat of this src giay phep lien van
	*/
	@Override
	public int getNamsanxuat() {
		return _srcGiayPhepLienVan.getNamsanxuat();
	}

	/**
	* Returns the succhua of this src giay phep lien van.
	*
	* @return the succhua of this src giay phep lien van
	*/
	@Override
	public int getSucchua() {
		return _srcGiayPhepLienVan.getSucchua();
	}

	@Override
	public int hashCode() {
		return _srcGiayPhepLienVan.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _srcGiayPhepLienVan.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new SRCGiayPhepLienVanWrapper((SRCGiayPhepLienVan)_srcGiayPhepLienVan.clone());
	}

	/**
	* Returns the bienkiemsoat of this src giay phep lien van.
	*
	* @return the bienkiemsoat of this src giay phep lien van
	*/
	@Override
	public java.lang.String getBienkiemsoat() {
		return _srcGiayPhepLienVan.getBienkiemsoat();
	}

	/**
	* Returns the ghichu of this src giay phep lien van.
	*
	* @return the ghichu of this src giay phep lien van
	*/
	@Override
	public java.lang.String getGhichu() {
		return _srcGiayPhepLienVan.getGhichu();
	}

	/**
	* Returns the lydo_thuhoi of this src giay phep lien van.
	*
	* @return the lydo_thuhoi of this src giay phep lien van
	*/
	@Override
	public java.lang.String getLydo_thuhoi() {
		return _srcGiayPhepLienVan.getLydo_thuhoi();
	}

	/**
	* Returns the nguoicap of this src giay phep lien van.
	*
	* @return the nguoicap of this src giay phep lien van
	*/
	@Override
	public java.lang.String getNguoicap() {
		return _srcGiayPhepLienVan.getNguoicap();
	}

	/**
	* Returns the nguoiky of this src giay phep lien van.
	*
	* @return the nguoiky of this src giay phep lien van
	*/
	@Override
	public java.lang.String getNguoiky() {
		return _srcGiayPhepLienVan.getNguoiky();
	}

	/**
	* Returns the so_phuhieu_lienvan of this src giay phep lien van.
	*
	* @return the so_phuhieu_lienvan of this src giay phep lien van
	*/
	@Override
	public java.lang.String getSo_phuhieu_lienvan() {
		return _srcGiayPhepLienVan.getSo_phuhieu_lienvan();
	}

	/**
	* Returns the sokhung of this src giay phep lien van.
	*
	* @return the sokhung of this src giay phep lien van
	*/
	@Override
	public java.lang.String getSokhung() {
		return _srcGiayPhepLienVan.getSokhung();
	}

	/**
	* Returns the somay of this src giay phep lien van.
	*
	* @return the somay of this src giay phep lien van
	*/
	@Override
	public java.lang.String getSomay() {
		return _srcGiayPhepLienVan.getSomay();
	}

	/**
	* Returns the trangthai of this src giay phep lien van.
	*
	* @return the trangthai of this src giay phep lien van
	*/
	@Override
	public java.lang.String getTrangthai() {
		return _srcGiayPhepLienVan.getTrangthai();
	}

	/**
	* Returns the url_file_gplv of this src giay phep lien van.
	*
	* @return the url_file_gplv of this src giay phep lien van
	*/
	@Override
	public java.lang.String getUrl_file_gplv() {
		return _srcGiayPhepLienVan.getUrl_file_gplv();
	}

	@Override
	public java.lang.String toString() {
		return _srcGiayPhepLienVan.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _srcGiayPhepLienVan.toXmlString();
	}

	/**
	* Returns the denghi_capden of this src giay phep lien van.
	*
	* @return the denghi_capden of this src giay phep lien van
	*/
	@Override
	public Date getDenghi_capden() {
		return _srcGiayPhepLienVan.getDenghi_capden();
	}

	/**
	* Returns the denghi_captu of this src giay phep lien van.
	*
	* @return the denghi_captu of this src giay phep lien van
	*/
	@Override
	public Date getDenghi_captu() {
		return _srcGiayPhepLienVan.getDenghi_captu();
	}

	/**
	* Returns the ngaycap of this src giay phep lien van.
	*
	* @return the ngaycap of this src giay phep lien van
	*/
	@Override
	public Date getNgaycap() {
		return _srcGiayPhepLienVan.getNgaycap();
	}

	/**
	* Returns the ngayhethan of this src giay phep lien van.
	*
	* @return the ngayhethan of this src giay phep lien van
	*/
	@Override
	public Date getNgayhethan() {
		return _srcGiayPhepLienVan.getNgayhethan();
	}

	/**
	* Returns the ngayky of this src giay phep lien van.
	*
	* @return the ngayky of this src giay phep lien van
	*/
	@Override
	public Date getNgayky() {
		return _srcGiayPhepLienVan.getNgayky();
	}

	/**
	* Returns the ngaythuhoi of this src giay phep lien van.
	*
	* @return the ngaythuhoi of this src giay phep lien van
	*/
	@Override
	public Date getNgaythuhoi() {
		return _srcGiayPhepLienVan.getNgaythuhoi();
	}

	/**
	* Returns the coquanquanly_id of this src giay phep lien van.
	*
	* @return the coquanquanly_id of this src giay phep lien van
	*/
	@Override
	public long getCoquanquanly_id() {
		return _srcGiayPhepLienVan.getCoquanquanly_id();
	}

	/**
	* Returns the cuakhau_id of this src giay phep lien van.
	*
	* @return the cuakhau_id of this src giay phep lien van
	*/
	@Override
	public long getCuakhau_id() {
		return _srcGiayPhepLienVan.getCuakhau_id();
	}

	/**
	* Returns the ID of this src giay phep lien van.
	*
	* @return the ID of this src giay phep lien van
	*/
	@Override
	public long getId() {
		return _srcGiayPhepLienVan.getId();
	}

	/**
	* Returns the loaihinh_id of this src giay phep lien van.
	*
	* @return the loaihinh_id of this src giay phep lien van
	*/
	@Override
	public long getLoaihinh_id() {
		return _srcGiayPhepLienVan.getLoaihinh_id();
	}

	/**
	* Returns the mauson_id of this src giay phep lien van.
	*
	* @return the mauson_id of this src giay phep lien van
	*/
	@Override
	public long getMauson_id() {
		return _srcGiayPhepLienVan.getMauson_id();
	}

	/**
	* Returns the nguoi_ky_id of this src giay phep lien van.
	*
	* @return the nguoi_ky_id of this src giay phep lien van
	*/
	@Override
	public long getNguoi_ky_id() {
		return _srcGiayPhepLienVan.getNguoi_ky_id();
	}

	/**
	* Returns the nhanhieu_id of this src giay phep lien van.
	*
	* @return the nhanhieu_id of this src giay phep lien van
	*/
	@Override
	public long getNhanhieu_id() {
		return _srcGiayPhepLienVan.getNhanhieu_id();
	}

	/**
	* Returns the phuongtien_id of this src giay phep lien van.
	*
	* @return the phuongtien_id of this src giay phep lien van
	*/
	@Override
	public long getPhuongtien_id() {
		return _srcGiayPhepLienVan.getPhuongtien_id();
	}

	/**
	* Returns the primary key of this src giay phep lien van.
	*
	* @return the primary key of this src giay phep lien van
	*/
	@Override
	public long getPrimaryKey() {
		return _srcGiayPhepLienVan.getPrimaryKey();
	}

	/**
	* Returns the quocgia_id of this src giay phep lien van.
	*
	* @return the quocgia_id of this src giay phep lien van
	*/
	@Override
	public long getQuocgia_id() {
		return _srcGiayPhepLienVan.getQuocgia_id();
	}

	/**
	* Returns the tuyen_id of this src giay phep lien van.
	*
	* @return the tuyen_id of this src giay phep lien van
	*/
	@Override
	public long getTuyen_id() {
		return _srcGiayPhepLienVan.getTuyen_id();
	}

	@Override
	public void persist() {
		_srcGiayPhepLienVan.persist();
	}

	/**
	* Sets the bienkiemsoat of this src giay phep lien van.
	*
	* @param bienkiemsoat the bienkiemsoat of this src giay phep lien van
	*/
	@Override
	public void setBienkiemsoat(java.lang.String bienkiemsoat) {
		_srcGiayPhepLienVan.setBienkiemsoat(bienkiemsoat);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_srcGiayPhepLienVan.setCachedModel(cachedModel);
	}

	/**
	* Sets the coquanquanly_id of this src giay phep lien van.
	*
	* @param coquanquanly_id the coquanquanly_id of this src giay phep lien van
	*/
	@Override
	public void setCoquanquanly_id(long coquanquanly_id) {
		_srcGiayPhepLienVan.setCoquanquanly_id(coquanquanly_id);
	}

	/**
	* Sets the cuakhau_id of this src giay phep lien van.
	*
	* @param cuakhau_id the cuakhau_id of this src giay phep lien van
	*/
	@Override
	public void setCuakhau_id(long cuakhau_id) {
		_srcGiayPhepLienVan.setCuakhau_id(cuakhau_id);
	}

	/**
	* Sets the denghi_capden of this src giay phep lien van.
	*
	* @param denghi_capden the denghi_capden of this src giay phep lien van
	*/
	@Override
	public void setDenghi_capden(Date denghi_capden) {
		_srcGiayPhepLienVan.setDenghi_capden(denghi_capden);
	}

	/**
	* Sets the denghi_captu of this src giay phep lien van.
	*
	* @param denghi_captu the denghi_captu of this src giay phep lien van
	*/
	@Override
	public void setDenghi_captu(Date denghi_captu) {
		_srcGiayPhepLienVan.setDenghi_captu(denghi_captu);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_srcGiayPhepLienVan.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_srcGiayPhepLienVan.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_srcGiayPhepLienVan.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ghichu of this src giay phep lien van.
	*
	* @param ghichu the ghichu of this src giay phep lien van
	*/
	@Override
	public void setGhichu(java.lang.String ghichu) {
		_srcGiayPhepLienVan.setGhichu(ghichu);
	}

	/**
	* Sets the ID of this src giay phep lien van.
	*
	* @param id the ID of this src giay phep lien van
	*/
	@Override
	public void setId(long id) {
		_srcGiayPhepLienVan.setId(id);
	}

	/**
	* Sets the lancapphep of this src giay phep lien van.
	*
	* @param lancapphep the lancapphep of this src giay phep lien van
	*/
	@Override
	public void setLancapphep(int lancapphep) {
		_srcGiayPhepLienVan.setLancapphep(lancapphep);
	}

	/**
	* Sets the loaihinh_id of this src giay phep lien van.
	*
	* @param loaihinh_id the loaihinh_id of this src giay phep lien van
	*/
	@Override
	public void setLoaihinh_id(long loaihinh_id) {
		_srcGiayPhepLienVan.setLoaihinh_id(loaihinh_id);
	}

	/**
	* Sets the lydo_thuhoi of this src giay phep lien van.
	*
	* @param lydo_thuhoi the lydo_thuhoi of this src giay phep lien van
	*/
	@Override
	public void setLydo_thuhoi(java.lang.String lydo_thuhoi) {
		_srcGiayPhepLienVan.setLydo_thuhoi(lydo_thuhoi);
	}

	/**
	* Sets the mauson_id of this src giay phep lien van.
	*
	* @param mauson_id the mauson_id of this src giay phep lien van
	*/
	@Override
	public void setMauson_id(long mauson_id) {
		_srcGiayPhepLienVan.setMauson_id(mauson_id);
	}

	/**
	* Sets the namsanxuat of this src giay phep lien van.
	*
	* @param namsanxuat the namsanxuat of this src giay phep lien van
	*/
	@Override
	public void setNamsanxuat(int namsanxuat) {
		_srcGiayPhepLienVan.setNamsanxuat(namsanxuat);
	}

	@Override
	public void setNew(boolean n) {
		_srcGiayPhepLienVan.setNew(n);
	}

	/**
	* Sets the ngaycap of this src giay phep lien van.
	*
	* @param ngaycap the ngaycap of this src giay phep lien van
	*/
	@Override
	public void setNgaycap(Date ngaycap) {
		_srcGiayPhepLienVan.setNgaycap(ngaycap);
	}

	/**
	* Sets the ngayhethan of this src giay phep lien van.
	*
	* @param ngayhethan the ngayhethan of this src giay phep lien van
	*/
	@Override
	public void setNgayhethan(Date ngayhethan) {
		_srcGiayPhepLienVan.setNgayhethan(ngayhethan);
	}

	/**
	* Sets the ngayky of this src giay phep lien van.
	*
	* @param ngayky the ngayky of this src giay phep lien van
	*/
	@Override
	public void setNgayky(Date ngayky) {
		_srcGiayPhepLienVan.setNgayky(ngayky);
	}

	/**
	* Sets the ngaythuhoi of this src giay phep lien van.
	*
	* @param ngaythuhoi the ngaythuhoi of this src giay phep lien van
	*/
	@Override
	public void setNgaythuhoi(Date ngaythuhoi) {
		_srcGiayPhepLienVan.setNgaythuhoi(ngaythuhoi);
	}

	/**
	* Sets the nguoi_ky_id of this src giay phep lien van.
	*
	* @param nguoi_ky_id the nguoi_ky_id of this src giay phep lien van
	*/
	@Override
	public void setNguoi_ky_id(long nguoi_ky_id) {
		_srcGiayPhepLienVan.setNguoi_ky_id(nguoi_ky_id);
	}

	/**
	* Sets the nguoicap of this src giay phep lien van.
	*
	* @param nguoicap the nguoicap of this src giay phep lien van
	*/
	@Override
	public void setNguoicap(java.lang.String nguoicap) {
		_srcGiayPhepLienVan.setNguoicap(nguoicap);
	}

	/**
	* Sets the nguoiky of this src giay phep lien van.
	*
	* @param nguoiky the nguoiky of this src giay phep lien van
	*/
	@Override
	public void setNguoiky(java.lang.String nguoiky) {
		_srcGiayPhepLienVan.setNguoiky(nguoiky);
	}

	/**
	* Sets the nhanhieu_id of this src giay phep lien van.
	*
	* @param nhanhieu_id the nhanhieu_id of this src giay phep lien van
	*/
	@Override
	public void setNhanhieu_id(long nhanhieu_id) {
		_srcGiayPhepLienVan.setNhanhieu_id(nhanhieu_id);
	}

	/**
	* Sets the phuongtien_id of this src giay phep lien van.
	*
	* @param phuongtien_id the phuongtien_id of this src giay phep lien van
	*/
	@Override
	public void setPhuongtien_id(long phuongtien_id) {
		_srcGiayPhepLienVan.setPhuongtien_id(phuongtien_id);
	}

	/**
	* Sets the primary key of this src giay phep lien van.
	*
	* @param primaryKey the primary key of this src giay phep lien van
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_srcGiayPhepLienVan.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_srcGiayPhepLienVan.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the quocgia_id of this src giay phep lien van.
	*
	* @param quocgia_id the quocgia_id of this src giay phep lien van
	*/
	@Override
	public void setQuocgia_id(long quocgia_id) {
		_srcGiayPhepLienVan.setQuocgia_id(quocgia_id);
	}

	/**
	* Sets the so_phuhieu_lienvan of this src giay phep lien van.
	*
	* @param so_phuhieu_lienvan the so_phuhieu_lienvan of this src giay phep lien van
	*/
	@Override
	public void setSo_phuhieu_lienvan(java.lang.String so_phuhieu_lienvan) {
		_srcGiayPhepLienVan.setSo_phuhieu_lienvan(so_phuhieu_lienvan);
	}

	/**
	* Sets the sokhung of this src giay phep lien van.
	*
	* @param sokhung the sokhung of this src giay phep lien van
	*/
	@Override
	public void setSokhung(java.lang.String sokhung) {
		_srcGiayPhepLienVan.setSokhung(sokhung);
	}

	/**
	* Sets the somay of this src giay phep lien van.
	*
	* @param somay the somay of this src giay phep lien van
	*/
	@Override
	public void setSomay(java.lang.String somay) {
		_srcGiayPhepLienVan.setSomay(somay);
	}

	/**
	* Sets the succhua of this src giay phep lien van.
	*
	* @param succhua the succhua of this src giay phep lien van
	*/
	@Override
	public void setSucchua(int succhua) {
		_srcGiayPhepLienVan.setSucchua(succhua);
	}

	/**
	* Sets the trangthai of this src giay phep lien van.
	*
	* @param trangthai the trangthai of this src giay phep lien van
	*/
	@Override
	public void setTrangthai(java.lang.String trangthai) {
		_srcGiayPhepLienVan.setTrangthai(trangthai);
	}

	/**
	* Sets the tuyen_id of this src giay phep lien van.
	*
	* @param tuyen_id the tuyen_id of this src giay phep lien van
	*/
	@Override
	public void setTuyen_id(long tuyen_id) {
		_srcGiayPhepLienVan.setTuyen_id(tuyen_id);
	}

	/**
	* Sets the url_file_gplv of this src giay phep lien van.
	*
	* @param url_file_gplv the url_file_gplv of this src giay phep lien van
	*/
	@Override
	public void setUrl_file_gplv(java.lang.String url_file_gplv) {
		_srcGiayPhepLienVan.setUrl_file_gplv(url_file_gplv);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SRCGiayPhepLienVanWrapper)) {
			return false;
		}

		SRCGiayPhepLienVanWrapper srcGiayPhepLienVanWrapper = (SRCGiayPhepLienVanWrapper)obj;

		if (Objects.equals(_srcGiayPhepLienVan,
					srcGiayPhepLienVanWrapper._srcGiayPhepLienVan)) {
			return true;
		}

		return false;
	}

	@Override
	public SRCGiayPhepLienVan getWrappedModel() {
		return _srcGiayPhepLienVan;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _srcGiayPhepLienVan.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _srcGiayPhepLienVan.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_srcGiayPhepLienVan.resetOriginalValues();
	}

	private final SRCGiayPhepLienVan _srcGiayPhepLienVan;
}
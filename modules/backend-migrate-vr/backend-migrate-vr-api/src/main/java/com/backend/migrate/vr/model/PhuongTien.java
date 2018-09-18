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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the PhuongTien service. Represents a row in the &quot;phbh_phuongtien&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see PhuongTienModel
 * @see com.backend.migrate.vr.model.impl.PhuongTienImpl
 * @see com.backend.migrate.vr.model.impl.PhuongTienModelImpl
 * @generated
 */
@ImplementationClassName("com.backend.migrate.vr.model.impl.PhuongTienImpl")
@ProviderType
public interface PhuongTien extends PhuongTienModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.backend.migrate.vr.model.impl.PhuongTienImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<PhuongTien, Long> ID_ACCESSOR = new Accessor<PhuongTien, Long>() {
			@Override
			public Long get(PhuongTien phuongTien) {
				return phuongTien.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<PhuongTien> getTypeClass() {
				return PhuongTien.class;
			}
		};
}
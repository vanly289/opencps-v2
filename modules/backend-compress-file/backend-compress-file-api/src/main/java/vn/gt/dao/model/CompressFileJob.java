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

package vn.gt.dao.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the CompressFileJob service. Represents a row in the &quot;compressfile_CompressFileJob&quot; database table, with each column mapped to a property of this class.
 *
 * @author huymq
 * @see CompressFileJobModel
 * @see vn.gt.dao.model.impl.CompressFileJobImpl
 * @see vn.gt.dao.model.impl.CompressFileJobModelImpl
 * @generated
 */
@ImplementationClassName("vn.gt.dao.model.impl.CompressFileJobImpl")
@ProviderType
public interface CompressFileJob extends CompressFileJobModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link vn.gt.dao.model.impl.CompressFileJobImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CompressFileJob, Long> ID_ACCESSOR = new Accessor<CompressFileJob, Long>() {
			@Override
			public Long get(CompressFileJob compressFileJob) {
				return compressFileJob.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<CompressFileJob> getTypeClass() {
				return CompressFileJob.class;
			}
		};
}
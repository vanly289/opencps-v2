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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Deliverable service. Represents a row in the &quot;opencps_deliverable&quot; database table, with each column mapped to a property of this class.
 *
 * @author LamTV
 * @see DeliverableModel
 * @see com.fds.vr.business.model.impl.DeliverableImpl
 * @see com.fds.vr.business.model.impl.DeliverableModelImpl
 * @generated
 */
@ImplementationClassName("com.fds.vr.business.model.impl.DeliverableImpl")
@ProviderType
public interface Deliverable extends DeliverableModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.fds.vr.business.model.impl.DeliverableImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Deliverable, Long> DELIVERABLE_ID_ACCESSOR = new Accessor<Deliverable, Long>() {
			@Override
			public Long get(Deliverable deliverable) {
				return deliverable.getDeliverableId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Deliverable> getTypeClass() {
				return Deliverable.class;
			}
		};
}
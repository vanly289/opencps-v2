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

package com.fds.vr.business.service.persistence.impl;

import com.fds.vr.business.model.Deliverable;
import com.fds.vr.business.service.persistence.DeliverablePersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import java.util.Set;

/**
 * @author LamTV
 * @generated
 */
public class DeliverableFinderBaseImpl extends BasePersistenceImpl<Deliverable> {
	@Override
	public Set<String> getBadColumnNames() {
		return getDeliverablePersistence().getBadColumnNames();
	}

	/**
	 * Returns the deliverable persistence.
	 *
	 * @return the deliverable persistence
	 */
	public DeliverablePersistence getDeliverablePersistence() {
		return deliverablePersistence;
	}

	/**
	 * Sets the deliverable persistence.
	 *
	 * @param deliverablePersistence the deliverable persistence
	 */
	public void setDeliverablePersistence(
		DeliverablePersistence deliverablePersistence) {
		this.deliverablePersistence = deliverablePersistence;
	}

	@BeanReference(type = DeliverablePersistence.class)
	protected DeliverablePersistence deliverablePersistence;
}
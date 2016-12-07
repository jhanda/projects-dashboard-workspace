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

package com.liferay.projects.dashboard.business.unit.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the BusinessUnit service. Represents a row in the &quot;PD_BusinessUnit&quot; database table, with each column mapped to a property of this class.
 *
 * @author Yury Butrymovich
 * @see BusinessUnitModel
 * @see com.liferay.projects.dashboard.business.unit.model.impl.BusinessUnitImpl
 * @see com.liferay.projects.dashboard.business.unit.model.impl.BusinessUnitModelImpl
 * @generated
 */
@ImplementationClassName("com.liferay.projects.dashboard.business.unit.model.impl.BusinessUnitImpl")
@ProviderType
public interface BusinessUnit extends BusinessUnitModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.liferay.projects.dashboard.business.unit.model.impl.BusinessUnitImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<BusinessUnit, Long> BUSINESS_UNIT_ID_ACCESSOR = new Accessor<BusinessUnit, Long>() {
			@Override
			public Long get(BusinessUnit businessUnit) {
				return businessUnit.getBusinessUnitId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<BusinessUnit> getTypeClass() {
				return BusinessUnit.class;
			}
		};
}
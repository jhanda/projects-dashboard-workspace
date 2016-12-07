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
 * The extended model interface for the ProjectBU service. Represents a row in the &quot;PD_ProjectBU&quot; database table, with each column mapped to a property of this class.
 *
 * @author Yury Butrymovich
 * @see ProjectBUModel
 * @see com.liferay.projects.dashboard.business.unit.model.impl.ProjectBUImpl
 * @see com.liferay.projects.dashboard.business.unit.model.impl.ProjectBUModelImpl
 * @generated
 */
@ImplementationClassName("com.liferay.projects.dashboard.business.unit.model.impl.ProjectBUImpl")
@ProviderType
public interface ProjectBU extends ProjectBUModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.liferay.projects.dashboard.business.unit.model.impl.ProjectBUImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ProjectBU, Long> PROJECT_B_U_ID_ACCESSOR = new Accessor<ProjectBU, Long>() {
			@Override
			public Long get(ProjectBU projectBU) {
				return projectBU.getProjectBUId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<ProjectBU> getTypeClass() {
				return ProjectBU.class;
			}
		};
}
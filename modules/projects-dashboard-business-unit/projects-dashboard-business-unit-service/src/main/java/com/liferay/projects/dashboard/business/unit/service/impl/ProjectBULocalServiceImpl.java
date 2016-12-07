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

package com.liferay.projects.dashboard.business.unit.service.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.projects.dashboard.business.unit.service.ProjectBULocalService;
import com.liferay.projects.dashboard.business.unit.service.ProjectBULocalServiceUtil;
import com.liferay.projects.dashboard.business.unit.exception.NoSuchProjectBUException;
import com.liferay.projects.dashboard.business.unit.model.ProjectBU;
import com.liferay.projects.dashboard.business.unit.service.base.ProjectBULocalServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the project b u local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link ProjectBULocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Yury Butrymovich
 * @see ProjectBULocalServiceBaseImpl
 * @see ProjectBULocalServiceUtil
 */
@ProviderType
public class ProjectBULocalServiceImpl extends ProjectBULocalServiceBaseImpl {

	public ProjectBU addProjectBU(
		long projectId, long businessUnitId, String type) {

		long projectBUId = counterLocalService.increment();

		ProjectBU projectBU = projectBUPersistence.create(projectBUId);

		projectBU.setBusinessUnitId(businessUnitId);
		projectBU.setProjectId(projectId);
		projectBU.setType(type);

		return projectBUPersistence.update(projectBU);
	}

	public List<ProjectBU> getProjectBUs(String type) {

		List<ProjectBU> projectBUs = projectBUPersistence.findByType(type);

		return projectBUs;
	}

	public ProjectBU updateProjectBU(
			long projectBUId, long projectId, long businessUnitId, String type)
		throws NoSuchProjectBUException {

		ProjectBU projectBU = projectBUPersistence.findByPrimaryKey(
			projectBUId);

		projectBU.setProjectId(projectId);
		projectBU.setBusinessUnitId(businessUnitId);
		projectBU.setType(type);

		return projectBUPersistence.update(projectBU);
	};

}
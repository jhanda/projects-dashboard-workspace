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

package com.liferay.projects.dashboard.project.service.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.projects.dashboard.project.model.Project;
import com.liferay.projects.dashboard.project.service.base.ProjectLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

/**
 * @author Joan H. Kim
 */
@ProviderType
public class ProjectLocalServiceImpl extends ProjectLocalServiceBaseImpl {

	public Project addProject(
			long userId, long businessUnitId, String name, String description,
			int priority, int health, Date expectedStartDate,
			Date expectedEndDate, Date actualStartDate, Date actualEndDate,
			int status)
		throws PortalException {

		Date now = new Date();
		User user = userLocalService.getUser(userId);

		long projectId = counterLocalService.increment();

		Project project = projectPersistence.create(projectId);

		project.setCompanyId(user.getCompanyId());
		project.setUserId(userId);
		project.setUserName(user.getFullName());
		project.setCreateDate(now);
		project.setModifiedDate(now);
		project.setBusinessUnitId(businessUnitId);
		project.setName(name);
		project.setDescription(description);
		project.setPriority(priority);
		project.setHealth(health);
		project.setExpectedStartDate(expectedStartDate);
		project.setExpectedEndDate(expectedEndDate);
		project.setActualStartDate(actualStartDate);
		project.setActualEndDate(actualEndDate);
		project.setStatus(status);

		return projectPersistence.update(project);
	}

	public List<Project> getProjects(int status) throws PortalException {
		return projectPersistence.findByStatus(status);
	}

	public Project updateProject(
			long projectId, String name, String description, int priority,
			int health, Date expectedStartDate, Date expectedEndDate,
			Date actualStartDate, Date actualEndDate, int status)
		throws PortalException {

		Date now = new Date();

		Project project = projectPersistence.findByPrimaryKey(projectId);

		project.setModifiedDate(now);
		project.setName(name);
		project.setDescription(description);
		project.setPriority(priority);
		project.setHealth(health);
		project.setExpectedStartDate(expectedStartDate);
		project.setExpectedEndDate(expectedEndDate);
		project.setActualStartDate(actualStartDate);
		project.setActualEndDate(actualEndDate);
		project.setStatus(status);

		return projectPersistence.update(project);
	}

}
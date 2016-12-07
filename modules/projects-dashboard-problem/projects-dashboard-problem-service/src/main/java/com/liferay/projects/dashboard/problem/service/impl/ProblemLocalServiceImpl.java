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

package com.liferay.projects.dashboard.problem.service.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.projects.dashboard.problem.model.Problem;
import com.liferay.projects.dashboard.problem.service.base.ProblemLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

/**
 * @author Howie Chou
 */
@ProviderType
public class ProblemLocalServiceImpl extends ProblemLocalServiceBaseImpl {

	public Problem addProblem(
			long userId, long projectId, int type, String description,
			int status, Date statusDate)
		throws PortalException {

		User user = userLocalService.getUser(userId);

		long problemId = counterLocalService.increment();

		Problem problem = problemPersistence.create(problemId);

		Date now = new Date();

		problem.setCompanyId(user.getCompanyId());
		problem.setUserId(userId);
		problem.setUserName(user.getFullName());
		problem.setCreateDate(now);
		problem.setModifiedDate(now);
		problem.setProjectId(projectId);
		problem.setType(type);
		problem.setDescription(description);
		problem.setStatus(status);
		problem.setStatusDate(statusDate);

		return problemPersistence.update(problem);
	}

	public List<Problem> getProblems(long projectId) throws PortalException {
		return problemPersistence.findByprojectId(projectId);
	}

	public Problem updateProblem(
			long problemId, long projectId, int type, String description,
			int status, Date statusDate)
		throws PortalException {

		Problem problem = problemPersistence.findByPrimaryKey(problemId);

		Date now = new Date();

		problem.setModifiedDate(now);

		problem.setProjectId(projectId);
		problem.setType(type);
		problem.setDescription(description);
		problem.setStatus(status);
		problem.setStatusDate(statusDate);

		return problemPersistence.update(problem);
	}

}
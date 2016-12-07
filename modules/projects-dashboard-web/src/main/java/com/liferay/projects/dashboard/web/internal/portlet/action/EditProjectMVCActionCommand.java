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

package com.liferay.projects.dashboard.web.internal.portlet.action;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.projects.dashboard.project.model.Project;
import com.liferay.projects.dashboard.project.service.ProjectLocalService;
import com.liferay.projects.dashboard.web.internal.constants.ProjectsDashboardPortletKeys;

import java.util.Date;

import java.text.DateFormat;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Joan H. Kim
 */
@Component(
	property = {
		"javax.portlet.name=" + ProjectsDashboardPortletKeys.PROJECTS_DASHBOARD,
		"mvc.command.name=/edit_project"
	},
	service = MVCActionCommand.class
)
public class EditProjectMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		long projectId = ParamUtil.getLong(actionRequest, "projectId");

		String name = ParamUtil.getString(actionRequest, "name");
		String description = ParamUtil.getString(actionRequest, "description");
		int priority = ParamUtil.getInteger(actionRequest, "priority");
		Date expectedStartDate = ParamUtil.getDate(
			actionRequest, "expectedStartDate",
			DateFormat.getDateTimeInstance());
		Date expectedEndDate = ParamUtil.getDate(
			actionRequest, "expectedEndDate", DateFormat.getDateTimeInstance());
		Date actualStartDate = ParamUtil.getDate(
			actionRequest, "actualStartDate",
			DateFormat.getDateTimeInstance());
		Date actualEndDate = ParamUtil.getDate(actionRequest, "actualEndDate",
			DateFormat.getDateTimeInstance());
		int health = ParamUtil.getInteger(actionRequest, "health");
		int status = ParamUtil.getInteger(actionRequest, "status");
		long businessUnitId = ParamUtil.getLong(actionRequest, "businessUnitId");

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
			actionRequest);

		if (projectId > 0) {
			_projectLocalService.updateProject(
				projectId, name, description, priority, health,
				expectedStartDate, expectedEndDate, actualStartDate,
				actualEndDate, status);
		}
		else {
			_projectLocalService.addProject(
				serviceContext.getUserId(), businessUnitId, name, description,
				priority, health, expectedStartDate, expectedEndDate,
				actualStartDate, actualEndDate, status);
		}
	}

	@Reference
	private ProjectLocalService _projectLocalService;

}
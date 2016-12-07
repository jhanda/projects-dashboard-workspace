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
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.projects.dashboard.problem.service.ProblemLocalService;
import com.liferay.projects.dashboard.web.internal.constants.ProjectsDashboardPortletKeys;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Howie Chou
 */
@Component(
	property = {
		"javax.portlet.name=" + ProjectsDashboardPortletKeys.PROJECTS_DASHBOARD,
		"mvc.command.name=/edit_problem"
	},
	service = MVCActionCommand.class
)
public class EditProblemMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		long problemId = ParamUtil.getLong(actionRequest, "problemId");

		long projectId = ParamUtil.getLong(actionRequest, "projectId");

		int type = ParamUtil.getInteger(actionRequest, "type");
		String description = ParamUtil.getString(actionRequest, "description");
		int status = ParamUtil.getInteger(actionRequest, "status");
		Date statusDate = ParamUtil.getDate(actionRequest, "statusDate", null);

		if (problemId > 0) {
			_problemLocalService.updateProblem(
				problemId, projectId, type, description, status, statusDate);
		}
		else {
			_problemLocalService.addProblem(
				themeDisplay.getUserId(), projectId, type, description, status,
				statusDate);
		}
	}

	@Reference
	private ProblemLocalService _problemLocalService;

}
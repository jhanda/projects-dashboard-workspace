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
import com.liferay.projects.dashboard.business.unit.service.BusinessUnitLocalService;
import com.liferay.projects.dashboard.web.internal.constants.ProjectsDashboardPortletKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

/**
 * @author Yury Butrymovich
 */
@Component(
	property = {
		"javax.portlet.name=" + ProjectsDashboardPortletKeys.PROJECTS_DASHBOARD,
		"mvc.command.name=/edit_business_unit"
	},
	service = MVCActionCommand.class
)
public class EditBusinessUnitMVCActionCommand
	extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		long businessUnitId = ParamUtil.getLong(
			actionRequest, "businessUnitId");

		String name = ParamUtil.getString(actionRequest, "name");

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
			actionRequest);

		if (businessUnitId > 0) {
			_buBusinessUnitLocalService.updateBusinessUnit(businessUnitId, name);
		}
		else {
			_buBusinessUnitLocalService.addBusinessUnit(name);
		}
	}

	@Reference
	private BusinessUnitLocalService _buBusinessUnitLocalService;

}
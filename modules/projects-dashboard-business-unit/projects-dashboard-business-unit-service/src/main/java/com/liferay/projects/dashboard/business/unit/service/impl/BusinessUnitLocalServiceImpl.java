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

import com.liferay.projects.dashboard.business.unit.exception.NoSuchBusinessUnitException;
import com.liferay.projects.dashboard.business.unit.service.BusinessUnitLocalService;
import com.liferay.projects.dashboard.business.unit.service.BusinessUnitLocalServiceUtil;
import com.liferay.projects.dashboard.business.unit.model.BusinessUnit;
import com.liferay.projects.dashboard.business.unit.service.base.BusinessUnitLocalServiceBaseImpl;

/**
 * The implementation of the business unit local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link BusinessUnitLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Yury Butrymovich
 * @see BusinessUnitLocalServiceBaseImpl
 * @see BusinessUnitLocalServiceUtil
 */
@ProviderType
public class BusinessUnitLocalServiceImpl
	extends BusinessUnitLocalServiceBaseImpl {

	public BusinessUnit addBusinessUnit(String name) {

		long businessUnitId = counterLocalService.increment();

		BusinessUnit businessUnit = businessUnitPersistence.create(
			businessUnitId);

		businessUnit.setName(name);

		return businessUnitPersistence.update(businessUnit);
	}

	public BusinessUnit getDocumentationProject(String name)
		throws NoSuchBusinessUnitException {

		return businessUnitPersistence.findByName(name);
	}

	public BusinessUnit updateBusinessUnit(long businessUnitId, String name)
		throws NoSuchBusinessUnitException {

		BusinessUnit businessUnit = businessUnitPersistence.findByPrimaryKey(
			businessUnitId);

		businessUnit.setName(name);

		return businessUnitPersistence.update(businessUnit);
	}

}
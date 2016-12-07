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

package com.liferay.projects.dashboard.business.unit.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BusinessUnitLocalService}.
 *
 * @author Yury Butrymovich
 * @see BusinessUnitLocalService
 * @generated
 */
@ProviderType
public class BusinessUnitLocalServiceWrapper implements BusinessUnitLocalService,
	ServiceWrapper<BusinessUnitLocalService> {
	public BusinessUnitLocalServiceWrapper(
		BusinessUnitLocalService businessUnitLocalService) {
		_businessUnitLocalService = businessUnitLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _businessUnitLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _businessUnitLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _businessUnitLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _businessUnitLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _businessUnitLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _businessUnitLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the business unit to the database. Also notifies the appropriate model listeners.
	*
	* @param businessUnit the business unit
	* @return the business unit that was added
	*/
	@Override
	public com.liferay.projects.dashboard.business.unit.model.BusinessUnit addBusinessUnit(
		com.liferay.projects.dashboard.business.unit.model.BusinessUnit businessUnit) {
		return _businessUnitLocalService.addBusinessUnit(businessUnit);
	}

	@Override
	public com.liferay.projects.dashboard.business.unit.model.BusinessUnit addBusinessUnit(
		java.lang.String name) {
		return _businessUnitLocalService.addBusinessUnit(name);
	}

	/**
	* Creates a new business unit with the primary key. Does not add the business unit to the database.
	*
	* @param businessUnitId the primary key for the new business unit
	* @return the new business unit
	*/
	@Override
	public com.liferay.projects.dashboard.business.unit.model.BusinessUnit createBusinessUnit(
		long businessUnitId) {
		return _businessUnitLocalService.createBusinessUnit(businessUnitId);
	}

	/**
	* Deletes the business unit from the database. Also notifies the appropriate model listeners.
	*
	* @param businessUnit the business unit
	* @return the business unit that was removed
	*/
	@Override
	public com.liferay.projects.dashboard.business.unit.model.BusinessUnit deleteBusinessUnit(
		com.liferay.projects.dashboard.business.unit.model.BusinessUnit businessUnit) {
		return _businessUnitLocalService.deleteBusinessUnit(businessUnit);
	}

	/**
	* Deletes the business unit with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param businessUnitId the primary key of the business unit
	* @return the business unit that was removed
	* @throws PortalException if a business unit with the primary key could not be found
	*/
	@Override
	public com.liferay.projects.dashboard.business.unit.model.BusinessUnit deleteBusinessUnit(
		long businessUnitId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _businessUnitLocalService.deleteBusinessUnit(businessUnitId);
	}

	@Override
	public com.liferay.projects.dashboard.business.unit.model.BusinessUnit fetchBusinessUnit(
		long businessUnitId) {
		return _businessUnitLocalService.fetchBusinessUnit(businessUnitId);
	}

	/**
	* Returns the business unit with the matching UUID and company.
	*
	* @param uuid the business unit's UUID
	* @param companyId the primary key of the company
	* @return the matching business unit, or <code>null</code> if a matching business unit could not be found
	*/
	@Override
	public com.liferay.projects.dashboard.business.unit.model.BusinessUnit fetchBusinessUnitByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _businessUnitLocalService.fetchBusinessUnitByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the business unit with the primary key.
	*
	* @param businessUnitId the primary key of the business unit
	* @return the business unit
	* @throws PortalException if a business unit with the primary key could not be found
	*/
	@Override
	public com.liferay.projects.dashboard.business.unit.model.BusinessUnit getBusinessUnit(
		long businessUnitId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _businessUnitLocalService.getBusinessUnit(businessUnitId);
	}

	/**
	* Returns the business unit with the matching UUID and company.
	*
	* @param uuid the business unit's UUID
	* @param companyId the primary key of the company
	* @return the matching business unit
	* @throws PortalException if a matching business unit could not be found
	*/
	@Override
	public com.liferay.projects.dashboard.business.unit.model.BusinessUnit getBusinessUnitByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _businessUnitLocalService.getBusinessUnitByUuidAndCompanyId(uuid,
			companyId);
	}

	@Override
	public com.liferay.projects.dashboard.business.unit.model.BusinessUnit getDocumentationProject(
		java.lang.String name)
		throws com.liferay.projects.dashboard.business.unit.exception.NoSuchBusinessUnitException {
		return _businessUnitLocalService.getDocumentationProject(name);
	}

	/**
	* Updates the business unit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param businessUnit the business unit
	* @return the business unit that was updated
	*/
	@Override
	public com.liferay.projects.dashboard.business.unit.model.BusinessUnit updateBusinessUnit(
		com.liferay.projects.dashboard.business.unit.model.BusinessUnit businessUnit) {
		return _businessUnitLocalService.updateBusinessUnit(businessUnit);
	}

	@Override
	public com.liferay.projects.dashboard.business.unit.model.BusinessUnit updateBusinessUnit(
		long businessUnitId, java.lang.String name)
		throws com.liferay.projects.dashboard.business.unit.exception.NoSuchBusinessUnitException {
		return _businessUnitLocalService.updateBusinessUnit(businessUnitId, name);
	}

	/**
	* Returns the number of business units.
	*
	* @return the number of business units
	*/
	@Override
	public int getBusinessUnitsCount() {
		return _businessUnitLocalService.getBusinessUnitsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _businessUnitLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _businessUnitLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.projects.dashboard.business.unit.model.impl.BusinessUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _businessUnitLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.projects.dashboard.business.unit.model.impl.BusinessUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _businessUnitLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the business units.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.projects.dashboard.business.unit.model.impl.BusinessUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of business units
	* @param end the upper bound of the range of business units (not inclusive)
	* @return the range of business units
	*/
	@Override
	public java.util.List<com.liferay.projects.dashboard.business.unit.model.BusinessUnit> getBusinessUnits(
		int start, int end) {
		return _businessUnitLocalService.getBusinessUnits(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _businessUnitLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _businessUnitLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public BusinessUnitLocalService getWrappedService() {
		return _businessUnitLocalService;
	}

	@Override
	public void setWrappedService(
		BusinessUnitLocalService businessUnitLocalService) {
		_businessUnitLocalService = businessUnitLocalService;
	}

	private BusinessUnitLocalService _businessUnitLocalService;
}
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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for BusinessUnit. This utility wraps
 * {@link com.liferay.projects.dashboard.business.unit.service.impl.BusinessUnitLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Yury Butrymovich
 * @see BusinessUnitLocalService
 * @see com.liferay.projects.dashboard.business.unit.service.base.BusinessUnitLocalServiceBaseImpl
 * @see com.liferay.projects.dashboard.business.unit.service.impl.BusinessUnitLocalServiceImpl
 * @generated
 */
@ProviderType
public class BusinessUnitLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.projects.dashboard.business.unit.service.impl.BusinessUnitLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the business unit to the database. Also notifies the appropriate model listeners.
	*
	* @param businessUnit the business unit
	* @return the business unit that was added
	*/
	public static com.liferay.projects.dashboard.business.unit.model.BusinessUnit addBusinessUnit(
		com.liferay.projects.dashboard.business.unit.model.BusinessUnit businessUnit) {
		return getService().addBusinessUnit(businessUnit);
	}

	public static com.liferay.projects.dashboard.business.unit.model.BusinessUnit addBusinessUnit(
		java.lang.String name) {
		return getService().addBusinessUnit(name);
	}

	/**
	* Creates a new business unit with the primary key. Does not add the business unit to the database.
	*
	* @param businessUnitId the primary key for the new business unit
	* @return the new business unit
	*/
	public static com.liferay.projects.dashboard.business.unit.model.BusinessUnit createBusinessUnit(
		long businessUnitId) {
		return getService().createBusinessUnit(businessUnitId);
	}

	/**
	* Deletes the business unit from the database. Also notifies the appropriate model listeners.
	*
	* @param businessUnit the business unit
	* @return the business unit that was removed
	*/
	public static com.liferay.projects.dashboard.business.unit.model.BusinessUnit deleteBusinessUnit(
		com.liferay.projects.dashboard.business.unit.model.BusinessUnit businessUnit) {
		return getService().deleteBusinessUnit(businessUnit);
	}

	/**
	* Deletes the business unit with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param businessUnitId the primary key of the business unit
	* @return the business unit that was removed
	* @throws PortalException if a business unit with the primary key could not be found
	*/
	public static com.liferay.projects.dashboard.business.unit.model.BusinessUnit deleteBusinessUnit(
		long businessUnitId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteBusinessUnit(businessUnitId);
	}

	public static com.liferay.projects.dashboard.business.unit.model.BusinessUnit fetchBusinessUnit(
		long businessUnitId) {
		return getService().fetchBusinessUnit(businessUnitId);
	}

	/**
	* Returns the business unit with the matching UUID and company.
	*
	* @param uuid the business unit's UUID
	* @param companyId the primary key of the company
	* @return the matching business unit, or <code>null</code> if a matching business unit could not be found
	*/
	public static com.liferay.projects.dashboard.business.unit.model.BusinessUnit fetchBusinessUnitByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().fetchBusinessUnitByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the business unit with the primary key.
	*
	* @param businessUnitId the primary key of the business unit
	* @return the business unit
	* @throws PortalException if a business unit with the primary key could not be found
	*/
	public static com.liferay.projects.dashboard.business.unit.model.BusinessUnit getBusinessUnit(
		long businessUnitId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getBusinessUnit(businessUnitId);
	}

	/**
	* Returns the business unit with the matching UUID and company.
	*
	* @param uuid the business unit's UUID
	* @param companyId the primary key of the company
	* @return the matching business unit
	* @throws PortalException if a matching business unit could not be found
	*/
	public static com.liferay.projects.dashboard.business.unit.model.BusinessUnit getBusinessUnitByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getBusinessUnitByUuidAndCompanyId(uuid, companyId);
	}

	public static com.liferay.projects.dashboard.business.unit.model.BusinessUnit getDocumentationProject(
		java.lang.String name)
		throws com.liferay.projects.dashboard.business.unit.exception.NoSuchBusinessUnitException {
		return getService().getDocumentationProject(name);
	}

	/**
	* Updates the business unit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param businessUnit the business unit
	* @return the business unit that was updated
	*/
	public static com.liferay.projects.dashboard.business.unit.model.BusinessUnit updateBusinessUnit(
		com.liferay.projects.dashboard.business.unit.model.BusinessUnit businessUnit) {
		return getService().updateBusinessUnit(businessUnit);
	}

	public static com.liferay.projects.dashboard.business.unit.model.BusinessUnit updateBusinessUnit(
		long businessUnitId, java.lang.String name)
		throws com.liferay.projects.dashboard.business.unit.exception.NoSuchBusinessUnitException {
		return getService().updateBusinessUnit(businessUnitId, name);
	}

	/**
	* Returns the number of business units.
	*
	* @return the number of business units
	*/
	public static int getBusinessUnitsCount() {
		return getService().getBusinessUnitsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
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
	public static java.util.List<com.liferay.projects.dashboard.business.unit.model.BusinessUnit> getBusinessUnits(
		int start, int end) {
		return getService().getBusinessUnits(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static BusinessUnitLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<BusinessUnitLocalService, BusinessUnitLocalService> _serviceTracker =
		ServiceTrackerFactory.open(BusinessUnitLocalService.class);
}
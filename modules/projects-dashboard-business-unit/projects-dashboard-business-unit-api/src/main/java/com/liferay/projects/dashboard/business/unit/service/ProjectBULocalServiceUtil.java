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
 * Provides the local service utility for ProjectBU. This utility wraps
 * {@link com.liferay.projects.dashboard.business.unit.service.impl.ProjectBULocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Yury Butrymovich
 * @see ProjectBULocalService
 * @see com.liferay.projects.dashboard.business.unit.service.base.ProjectBULocalServiceBaseImpl
 * @see com.liferay.projects.dashboard.business.unit.service.impl.ProjectBULocalServiceImpl
 * @generated
 */
@ProviderType
public class ProjectBULocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.projects.dashboard.business.unit.service.impl.ProjectBULocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Adds the project b u to the database. Also notifies the appropriate model listeners.
	*
	* @param projectBU the project b u
	* @return the project b u that was added
	*/
	public static com.liferay.projects.dashboard.business.unit.model.ProjectBU addProjectBU(
		com.liferay.projects.dashboard.business.unit.model.ProjectBU projectBU) {
		return getService().addProjectBU(projectBU);
	}

	public static com.liferay.projects.dashboard.business.unit.model.ProjectBU addProjectBU(
		long projectId, long businessUnitId, java.lang.String type) {
		return getService().addProjectBU(projectId, businessUnitId, type);
	}

	/**
	* Creates a new project b u with the primary key. Does not add the project b u to the database.
	*
	* @param projectBUId the primary key for the new project b u
	* @return the new project b u
	*/
	public static com.liferay.projects.dashboard.business.unit.model.ProjectBU createProjectBU(
		long projectBUId) {
		return getService().createProjectBU(projectBUId);
	}

	/**
	* Deletes the project b u from the database. Also notifies the appropriate model listeners.
	*
	* @param projectBU the project b u
	* @return the project b u that was removed
	*/
	public static com.liferay.projects.dashboard.business.unit.model.ProjectBU deleteProjectBU(
		com.liferay.projects.dashboard.business.unit.model.ProjectBU projectBU) {
		return getService().deleteProjectBU(projectBU);
	}

	/**
	* Deletes the project b u with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param projectBUId the primary key of the project b u
	* @return the project b u that was removed
	* @throws PortalException if a project b u with the primary key could not be found
	*/
	public static com.liferay.projects.dashboard.business.unit.model.ProjectBU deleteProjectBU(
		long projectBUId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteProjectBU(projectBUId);
	}

	public static com.liferay.projects.dashboard.business.unit.model.ProjectBU fetchProjectBU(
		long projectBUId) {
		return getService().fetchProjectBU(projectBUId);
	}

	/**
	* Returns the project b u with the matching UUID and company.
	*
	* @param uuid the project b u's UUID
	* @param companyId the primary key of the company
	* @return the matching project b u, or <code>null</code> if a matching project b u could not be found
	*/
	public static com.liferay.projects.dashboard.business.unit.model.ProjectBU fetchProjectBUByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().fetchProjectBUByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the project b u with the primary key.
	*
	* @param projectBUId the primary key of the project b u
	* @return the project b u
	* @throws PortalException if a project b u with the primary key could not be found
	*/
	public static com.liferay.projects.dashboard.business.unit.model.ProjectBU getProjectBU(
		long projectBUId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getProjectBU(projectBUId);
	}

	/**
	* Returns the project b u with the matching UUID and company.
	*
	* @param uuid the project b u's UUID
	* @param companyId the primary key of the company
	* @return the matching project b u
	* @throws PortalException if a matching project b u could not be found
	*/
	public static com.liferay.projects.dashboard.business.unit.model.ProjectBU getProjectBUByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getProjectBUByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Updates the project b u in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param projectBU the project b u
	* @return the project b u that was updated
	*/
	public static com.liferay.projects.dashboard.business.unit.model.ProjectBU updateProjectBU(
		com.liferay.projects.dashboard.business.unit.model.ProjectBU projectBU) {
		return getService().updateProjectBU(projectBU);
	}

	public static com.liferay.projects.dashboard.business.unit.model.ProjectBU updateProjectBU(
		long projectBUId, long projectId, long businessUnitId,
		java.lang.String type)
		throws com.liferay.projects.dashboard.business.unit.exception.NoSuchProjectBUException {
		return getService()
				   .updateProjectBU(projectBUId, projectId, businessUnitId, type);
	}

	/**
	* Returns the number of project b us.
	*
	* @return the number of project b us
	*/
	public static int getProjectBUsCount() {
		return getService().getProjectBUsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.projects.dashboard.business.unit.model.impl.ProjectBUModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.projects.dashboard.business.unit.model.impl.ProjectBUModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the project b us.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.projects.dashboard.business.unit.model.impl.ProjectBUModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of project b us
	* @param end the upper bound of the range of project b us (not inclusive)
	* @return the range of project b us
	*/
	public static java.util.List<com.liferay.projects.dashboard.business.unit.model.ProjectBU> getProjectBUs(
		int start, int end) {
		return getService().getProjectBUs(start, end);
	}

	public static java.util.List<com.liferay.projects.dashboard.business.unit.model.ProjectBU> getProjectBUs(
		java.lang.String type) {
		return getService().getProjectBUs(type);
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

	public static ProjectBULocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ProjectBULocalService, ProjectBULocalService> _serviceTracker =
		ServiceTrackerFactory.open(ProjectBULocalService.class);
}
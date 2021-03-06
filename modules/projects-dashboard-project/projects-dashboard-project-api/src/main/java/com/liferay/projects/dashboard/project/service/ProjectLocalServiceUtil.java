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

package com.liferay.projects.dashboard.project.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Project. This utility wraps
 * {@link com.liferay.projects.dashboard.project.service.impl.ProjectLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Ryan Park
 * @see ProjectLocalService
 * @see com.liferay.projects.dashboard.project.service.base.ProjectLocalServiceBaseImpl
 * @see com.liferay.projects.dashboard.project.service.impl.ProjectLocalServiceImpl
 * @generated
 */
@ProviderType
public class ProjectLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.projects.dashboard.project.service.impl.ProjectLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Adds the project to the database. Also notifies the appropriate model listeners.
	*
	* @param project the project
	* @return the project that was added
	*/
	public static com.liferay.projects.dashboard.project.model.Project addProject(
		com.liferay.projects.dashboard.project.model.Project project) {
		return getService().addProject(project);
	}

	public static com.liferay.projects.dashboard.project.model.Project addProject(
		long userId, long businessUnitId, java.lang.String name,
		java.lang.String description, int priority, int health,
		java.util.Date expectedStartDate, java.util.Date expectedEndDate,
		java.util.Date actualStartDate, java.util.Date actualEndDate, int status)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .addProject(userId, businessUnitId, name, description,
			priority, health, expectedStartDate, expectedEndDate,
			actualStartDate, actualEndDate, status);
	}

	/**
	* Creates a new project with the primary key. Does not add the project to the database.
	*
	* @param projectId the primary key for the new project
	* @return the new project
	*/
	public static com.liferay.projects.dashboard.project.model.Project createProject(
		long projectId) {
		return getService().createProject(projectId);
	}

	/**
	* Deletes the project from the database. Also notifies the appropriate model listeners.
	*
	* @param project the project
	* @return the project that was removed
	*/
	public static com.liferay.projects.dashboard.project.model.Project deleteProject(
		com.liferay.projects.dashboard.project.model.Project project) {
		return getService().deleteProject(project);
	}

	/**
	* Deletes the project with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param projectId the primary key of the project
	* @return the project that was removed
	* @throws PortalException if a project with the primary key could not be found
	*/
	public static com.liferay.projects.dashboard.project.model.Project deleteProject(
		long projectId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteProject(projectId);
	}

	public static com.liferay.projects.dashboard.project.model.Project fetchProject(
		long projectId) {
		return getService().fetchProject(projectId);
	}

	/**
	* Returns the project with the matching UUID and company.
	*
	* @param uuid the project's UUID
	* @param companyId the primary key of the company
	* @return the matching project, or <code>null</code> if a matching project could not be found
	*/
	public static com.liferay.projects.dashboard.project.model.Project fetchProjectByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().fetchProjectByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the project with the primary key.
	*
	* @param projectId the primary key of the project
	* @return the project
	* @throws PortalException if a project with the primary key could not be found
	*/
	public static com.liferay.projects.dashboard.project.model.Project getProject(
		long projectId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getProject(projectId);
	}

	/**
	* Returns the project with the matching UUID and company.
	*
	* @param uuid the project's UUID
	* @param companyId the primary key of the company
	* @return the matching project
	* @throws PortalException if a matching project could not be found
	*/
	public static com.liferay.projects.dashboard.project.model.Project getProjectByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getProjectByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Updates the project in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param project the project
	* @return the project that was updated
	*/
	public static com.liferay.projects.dashboard.project.model.Project updateProject(
		com.liferay.projects.dashboard.project.model.Project project) {
		return getService().updateProject(project);
	}

	public static com.liferay.projects.dashboard.project.model.Project updateProject(
		long projectId, java.lang.String name, java.lang.String description,
		int priority, int health, java.util.Date expectedStartDate,
		java.util.Date expectedEndDate, java.util.Date actualStartDate,
		java.util.Date actualEndDate, int status)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .updateProject(projectId, name, description, priority,
			health, expectedStartDate, expectedEndDate, actualStartDate,
			actualEndDate, status);
	}

	/**
	* Returns the number of projects.
	*
	* @return the number of projects
	*/
	public static int getProjectsCount() {
		return getService().getProjectsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.projects.dashboard.project.model.impl.ProjectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.projects.dashboard.project.model.impl.ProjectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the projects.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.projects.dashboard.project.model.impl.ProjectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @return the range of projects
	*/
	public static java.util.List<com.liferay.projects.dashboard.project.model.Project> getProjects(
		int start, int end) {
		return getService().getProjects(start, end);
	}

	public static java.util.List<com.liferay.projects.dashboard.project.model.Project> getProjects(
		int status) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getProjects(status);
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

	public static ProjectLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ProjectLocalService, ProjectLocalService> _serviceTracker =
		ServiceTrackerFactory.open(ProjectLocalService.class);
}
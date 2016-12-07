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
 * Provides a wrapper for {@link ProjectBULocalService}.
 *
 * @author Yury Butrymovich
 * @see ProjectBULocalService
 * @generated
 */
@ProviderType
public class ProjectBULocalServiceWrapper implements ProjectBULocalService,
	ServiceWrapper<ProjectBULocalService> {
	public ProjectBULocalServiceWrapper(
		ProjectBULocalService projectBULocalService) {
		_projectBULocalService = projectBULocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _projectBULocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _projectBULocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _projectBULocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _projectBULocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _projectBULocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _projectBULocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the project b u to the database. Also notifies the appropriate model listeners.
	*
	* @param projectBU the project b u
	* @return the project b u that was added
	*/
	@Override
	public com.liferay.projects.dashboard.business.unit.model.ProjectBU addProjectBU(
		com.liferay.projects.dashboard.business.unit.model.ProjectBU projectBU) {
		return _projectBULocalService.addProjectBU(projectBU);
	}

	@Override
	public com.liferay.projects.dashboard.business.unit.model.ProjectBU addProjectBU(
		long projectId, long businessUnitId, java.lang.String type) {
		return _projectBULocalService.addProjectBU(projectId, businessUnitId,
			type);
	}

	/**
	* Creates a new project b u with the primary key. Does not add the project b u to the database.
	*
	* @param projectBUId the primary key for the new project b u
	* @return the new project b u
	*/
	@Override
	public com.liferay.projects.dashboard.business.unit.model.ProjectBU createProjectBU(
		long projectBUId) {
		return _projectBULocalService.createProjectBU(projectBUId);
	}

	/**
	* Deletes the project b u from the database. Also notifies the appropriate model listeners.
	*
	* @param projectBU the project b u
	* @return the project b u that was removed
	*/
	@Override
	public com.liferay.projects.dashboard.business.unit.model.ProjectBU deleteProjectBU(
		com.liferay.projects.dashboard.business.unit.model.ProjectBU projectBU) {
		return _projectBULocalService.deleteProjectBU(projectBU);
	}

	/**
	* Deletes the project b u with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param projectBUId the primary key of the project b u
	* @return the project b u that was removed
	* @throws PortalException if a project b u with the primary key could not be found
	*/
	@Override
	public com.liferay.projects.dashboard.business.unit.model.ProjectBU deleteProjectBU(
		long projectBUId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _projectBULocalService.deleteProjectBU(projectBUId);
	}

	@Override
	public com.liferay.projects.dashboard.business.unit.model.ProjectBU fetchProjectBU(
		long projectBUId) {
		return _projectBULocalService.fetchProjectBU(projectBUId);
	}

	/**
	* Returns the project b u with the matching UUID and company.
	*
	* @param uuid the project b u's UUID
	* @param companyId the primary key of the company
	* @return the matching project b u, or <code>null</code> if a matching project b u could not be found
	*/
	@Override
	public com.liferay.projects.dashboard.business.unit.model.ProjectBU fetchProjectBUByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _projectBULocalService.fetchProjectBUByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the project b u with the primary key.
	*
	* @param projectBUId the primary key of the project b u
	* @return the project b u
	* @throws PortalException if a project b u with the primary key could not be found
	*/
	@Override
	public com.liferay.projects.dashboard.business.unit.model.ProjectBU getProjectBU(
		long projectBUId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _projectBULocalService.getProjectBU(projectBUId);
	}

	/**
	* Returns the project b u with the matching UUID and company.
	*
	* @param uuid the project b u's UUID
	* @param companyId the primary key of the company
	* @return the matching project b u
	* @throws PortalException if a matching project b u could not be found
	*/
	@Override
	public com.liferay.projects.dashboard.business.unit.model.ProjectBU getProjectBUByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _projectBULocalService.getProjectBUByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Updates the project b u in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param projectBU the project b u
	* @return the project b u that was updated
	*/
	@Override
	public com.liferay.projects.dashboard.business.unit.model.ProjectBU updateProjectBU(
		com.liferay.projects.dashboard.business.unit.model.ProjectBU projectBU) {
		return _projectBULocalService.updateProjectBU(projectBU);
	}

	@Override
	public com.liferay.projects.dashboard.business.unit.model.ProjectBU updateProjectBU(
		long projectBUId, long projectId, long businessUnitId,
		java.lang.String type)
		throws com.liferay.projects.dashboard.business.unit.exception.NoSuchProjectBUException {
		return _projectBULocalService.updateProjectBU(projectBUId, projectId,
			businessUnitId, type);
	}

	/**
	* Returns the number of project b us.
	*
	* @return the number of project b us
	*/
	@Override
	public int getProjectBUsCount() {
		return _projectBULocalService.getProjectBUsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _projectBULocalService.getOSGiServiceIdentifier();
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
		return _projectBULocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _projectBULocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _projectBULocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
	@Override
	public java.util.List<com.liferay.projects.dashboard.business.unit.model.ProjectBU> getProjectBUs(
		int start, int end) {
		return _projectBULocalService.getProjectBUs(start, end);
	}

	@Override
	public java.util.List<com.liferay.projects.dashboard.business.unit.model.ProjectBU> getProjectBUs(
		java.lang.String type) {
		return _projectBULocalService.getProjectBUs(type);
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
		return _projectBULocalService.dynamicQueryCount(dynamicQuery);
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
		return _projectBULocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public ProjectBULocalService getWrappedService() {
		return _projectBULocalService;
	}

	@Override
	public void setWrappedService(ProjectBULocalService projectBULocalService) {
		_projectBULocalService = projectBULocalService;
	}

	private ProjectBULocalService _projectBULocalService;
}
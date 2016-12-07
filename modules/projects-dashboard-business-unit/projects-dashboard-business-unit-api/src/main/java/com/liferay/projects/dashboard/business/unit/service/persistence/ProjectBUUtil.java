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

package com.liferay.projects.dashboard.business.unit.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.liferay.projects.dashboard.business.unit.model.ProjectBU;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the project b u service. This utility wraps {@link com.liferay.projects.dashboard.business.unit.service.persistence.impl.ProjectBUPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Yury Butrymovich
 * @see ProjectBUPersistence
 * @see com.liferay.projects.dashboard.business.unit.service.persistence.impl.ProjectBUPersistenceImpl
 * @generated
 */
@ProviderType
public class ProjectBUUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(ProjectBU projectBU) {
		getPersistence().clearCache(projectBU);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ProjectBU> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ProjectBU> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ProjectBU> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ProjectBU> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ProjectBU update(ProjectBU projectBU) {
		return getPersistence().update(projectBU);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ProjectBU update(ProjectBU projectBU,
		ServiceContext serviceContext) {
		return getPersistence().update(projectBU, serviceContext);
	}

	/**
	* Returns all the project b us where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching project b us
	*/
	public static List<ProjectBU> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the project b us where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProjectBUModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of project b us
	* @param end the upper bound of the range of project b us (not inclusive)
	* @return the range of matching project b us
	*/
	public static List<ProjectBU> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the project b us where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProjectBUModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of project b us
	* @param end the upper bound of the range of project b us (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching project b us
	*/
	public static List<ProjectBU> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<ProjectBU> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the project b us where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProjectBUModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of project b us
	* @param end the upper bound of the range of project b us (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching project b us
	*/
	public static List<ProjectBU> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<ProjectBU> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first project b u in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project b u
	* @throws NoSuchProjectBUException if a matching project b u could not be found
	*/
	public static ProjectBU findByUuid_First(java.lang.String uuid,
		OrderByComparator<ProjectBU> orderByComparator)
		throws com.liferay.projects.dashboard.business.unit.exception.NoSuchProjectBUException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first project b u in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project b u, or <code>null</code> if a matching project b u could not be found
	*/
	public static ProjectBU fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<ProjectBU> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last project b u in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project b u
	* @throws NoSuchProjectBUException if a matching project b u could not be found
	*/
	public static ProjectBU findByUuid_Last(java.lang.String uuid,
		OrderByComparator<ProjectBU> orderByComparator)
		throws com.liferay.projects.dashboard.business.unit.exception.NoSuchProjectBUException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last project b u in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project b u, or <code>null</code> if a matching project b u could not be found
	*/
	public static ProjectBU fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<ProjectBU> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the project b us before and after the current project b u in the ordered set where uuid = &#63;.
	*
	* @param projectBUId the primary key of the current project b u
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next project b u
	* @throws NoSuchProjectBUException if a project b u with the primary key could not be found
	*/
	public static ProjectBU[] findByUuid_PrevAndNext(long projectBUId,
		java.lang.String uuid, OrderByComparator<ProjectBU> orderByComparator)
		throws com.liferay.projects.dashboard.business.unit.exception.NoSuchProjectBUException {
		return getPersistence()
				   .findByUuid_PrevAndNext(projectBUId, uuid, orderByComparator);
	}

	/**
	* Removes all the project b us where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of project b us where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching project b us
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns all the project b us where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching project b us
	*/
	public static List<ProjectBU> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the project b us where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProjectBUModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of project b us
	* @param end the upper bound of the range of project b us (not inclusive)
	* @return the range of matching project b us
	*/
	public static List<ProjectBU> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the project b us where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProjectBUModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of project b us
	* @param end the upper bound of the range of project b us (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching project b us
	*/
	public static List<ProjectBU> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<ProjectBU> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the project b us where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProjectBUModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of project b us
	* @param end the upper bound of the range of project b us (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching project b us
	*/
	public static List<ProjectBU> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<ProjectBU> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first project b u in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project b u
	* @throws NoSuchProjectBUException if a matching project b u could not be found
	*/
	public static ProjectBU findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<ProjectBU> orderByComparator)
		throws com.liferay.projects.dashboard.business.unit.exception.NoSuchProjectBUException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first project b u in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project b u, or <code>null</code> if a matching project b u could not be found
	*/
	public static ProjectBU fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<ProjectBU> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last project b u in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project b u
	* @throws NoSuchProjectBUException if a matching project b u could not be found
	*/
	public static ProjectBU findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<ProjectBU> orderByComparator)
		throws com.liferay.projects.dashboard.business.unit.exception.NoSuchProjectBUException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last project b u in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project b u, or <code>null</code> if a matching project b u could not be found
	*/
	public static ProjectBU fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<ProjectBU> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the project b us before and after the current project b u in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param projectBUId the primary key of the current project b u
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next project b u
	* @throws NoSuchProjectBUException if a project b u with the primary key could not be found
	*/
	public static ProjectBU[] findByUuid_C_PrevAndNext(long projectBUId,
		java.lang.String uuid, long companyId,
		OrderByComparator<ProjectBU> orderByComparator)
		throws com.liferay.projects.dashboard.business.unit.exception.NoSuchProjectBUException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(projectBUId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the project b us where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of project b us where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching project b us
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the project b us where type = &#63;.
	*
	* @param type the type
	* @return the matching project b us
	*/
	public static List<ProjectBU> findByType(java.lang.String type) {
		return getPersistence().findByType(type);
	}

	/**
	* Returns a range of all the project b us where type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProjectBUModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param type the type
	* @param start the lower bound of the range of project b us
	* @param end the upper bound of the range of project b us (not inclusive)
	* @return the range of matching project b us
	*/
	public static List<ProjectBU> findByType(java.lang.String type, int start,
		int end) {
		return getPersistence().findByType(type, start, end);
	}

	/**
	* Returns an ordered range of all the project b us where type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProjectBUModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param type the type
	* @param start the lower bound of the range of project b us
	* @param end the upper bound of the range of project b us (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching project b us
	*/
	public static List<ProjectBU> findByType(java.lang.String type, int start,
		int end, OrderByComparator<ProjectBU> orderByComparator) {
		return getPersistence().findByType(type, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the project b us where type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProjectBUModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param type the type
	* @param start the lower bound of the range of project b us
	* @param end the upper bound of the range of project b us (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching project b us
	*/
	public static List<ProjectBU> findByType(java.lang.String type, int start,
		int end, OrderByComparator<ProjectBU> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByType(type, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first project b u in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project b u
	* @throws NoSuchProjectBUException if a matching project b u could not be found
	*/
	public static ProjectBU findByType_First(java.lang.String type,
		OrderByComparator<ProjectBU> orderByComparator)
		throws com.liferay.projects.dashboard.business.unit.exception.NoSuchProjectBUException {
		return getPersistence().findByType_First(type, orderByComparator);
	}

	/**
	* Returns the first project b u in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project b u, or <code>null</code> if a matching project b u could not be found
	*/
	public static ProjectBU fetchByType_First(java.lang.String type,
		OrderByComparator<ProjectBU> orderByComparator) {
		return getPersistence().fetchByType_First(type, orderByComparator);
	}

	/**
	* Returns the last project b u in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project b u
	* @throws NoSuchProjectBUException if a matching project b u could not be found
	*/
	public static ProjectBU findByType_Last(java.lang.String type,
		OrderByComparator<ProjectBU> orderByComparator)
		throws com.liferay.projects.dashboard.business.unit.exception.NoSuchProjectBUException {
		return getPersistence().findByType_Last(type, orderByComparator);
	}

	/**
	* Returns the last project b u in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project b u, or <code>null</code> if a matching project b u could not be found
	*/
	public static ProjectBU fetchByType_Last(java.lang.String type,
		OrderByComparator<ProjectBU> orderByComparator) {
		return getPersistence().fetchByType_Last(type, orderByComparator);
	}

	/**
	* Returns the project b us before and after the current project b u in the ordered set where type = &#63;.
	*
	* @param projectBUId the primary key of the current project b u
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next project b u
	* @throws NoSuchProjectBUException if a project b u with the primary key could not be found
	*/
	public static ProjectBU[] findByType_PrevAndNext(long projectBUId,
		java.lang.String type, OrderByComparator<ProjectBU> orderByComparator)
		throws com.liferay.projects.dashboard.business.unit.exception.NoSuchProjectBUException {
		return getPersistence()
				   .findByType_PrevAndNext(projectBUId, type, orderByComparator);
	}

	/**
	* Removes all the project b us where type = &#63; from the database.
	*
	* @param type the type
	*/
	public static void removeByType(java.lang.String type) {
		getPersistence().removeByType(type);
	}

	/**
	* Returns the number of project b us where type = &#63;.
	*
	* @param type the type
	* @return the number of matching project b us
	*/
	public static int countByType(java.lang.String type) {
		return getPersistence().countByType(type);
	}

	/**
	* Caches the project b u in the entity cache if it is enabled.
	*
	* @param projectBU the project b u
	*/
	public static void cacheResult(ProjectBU projectBU) {
		getPersistence().cacheResult(projectBU);
	}

	/**
	* Caches the project b us in the entity cache if it is enabled.
	*
	* @param projectBUs the project b us
	*/
	public static void cacheResult(List<ProjectBU> projectBUs) {
		getPersistence().cacheResult(projectBUs);
	}

	/**
	* Creates a new project b u with the primary key. Does not add the project b u to the database.
	*
	* @param projectBUId the primary key for the new project b u
	* @return the new project b u
	*/
	public static ProjectBU create(long projectBUId) {
		return getPersistence().create(projectBUId);
	}

	/**
	* Removes the project b u with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param projectBUId the primary key of the project b u
	* @return the project b u that was removed
	* @throws NoSuchProjectBUException if a project b u with the primary key could not be found
	*/
	public static ProjectBU remove(long projectBUId)
		throws com.liferay.projects.dashboard.business.unit.exception.NoSuchProjectBUException {
		return getPersistence().remove(projectBUId);
	}

	public static ProjectBU updateImpl(ProjectBU projectBU) {
		return getPersistence().updateImpl(projectBU);
	}

	/**
	* Returns the project b u with the primary key or throws a {@link NoSuchProjectBUException} if it could not be found.
	*
	* @param projectBUId the primary key of the project b u
	* @return the project b u
	* @throws NoSuchProjectBUException if a project b u with the primary key could not be found
	*/
	public static ProjectBU findByPrimaryKey(long projectBUId)
		throws com.liferay.projects.dashboard.business.unit.exception.NoSuchProjectBUException {
		return getPersistence().findByPrimaryKey(projectBUId);
	}

	/**
	* Returns the project b u with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param projectBUId the primary key of the project b u
	* @return the project b u, or <code>null</code> if a project b u with the primary key could not be found
	*/
	public static ProjectBU fetchByPrimaryKey(long projectBUId) {
		return getPersistence().fetchByPrimaryKey(projectBUId);
	}

	public static java.util.Map<java.io.Serializable, ProjectBU> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the project b us.
	*
	* @return the project b us
	*/
	public static List<ProjectBU> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the project b us.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProjectBUModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of project b us
	* @param end the upper bound of the range of project b us (not inclusive)
	* @return the range of project b us
	*/
	public static List<ProjectBU> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the project b us.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProjectBUModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of project b us
	* @param end the upper bound of the range of project b us (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of project b us
	*/
	public static List<ProjectBU> findAll(int start, int end,
		OrderByComparator<ProjectBU> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the project b us.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProjectBUModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of project b us
	* @param end the upper bound of the range of project b us (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of project b us
	*/
	public static List<ProjectBU> findAll(int start, int end,
		OrderByComparator<ProjectBU> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the project b us from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of project b us.
	*
	* @return the number of project b us
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ProjectBUPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ProjectBUPersistence, ProjectBUPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ProjectBUPersistence.class);
}
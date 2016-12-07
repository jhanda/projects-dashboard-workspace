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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.liferay.projects.dashboard.business.unit.exception.NoSuchProjectBUException;
import com.liferay.projects.dashboard.business.unit.model.ProjectBU;

/**
 * The persistence interface for the project b u service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Yury Butrymovich
 * @see com.liferay.projects.dashboard.business.unit.service.persistence.impl.ProjectBUPersistenceImpl
 * @see ProjectBUUtil
 * @generated
 */
@ProviderType
public interface ProjectBUPersistence extends BasePersistence<ProjectBU> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProjectBUUtil} to access the project b u persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the project b us where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching project b us
	*/
	public java.util.List<ProjectBU> findByUuid(java.lang.String uuid);

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
	public java.util.List<ProjectBU> findByUuid(java.lang.String uuid,
		int start, int end);

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
	public java.util.List<ProjectBU> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProjectBU> orderByComparator);

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
	public java.util.List<ProjectBU> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProjectBU> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first project b u in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project b u
	* @throws NoSuchProjectBUException if a matching project b u could not be found
	*/
	public ProjectBU findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ProjectBU> orderByComparator)
		throws NoSuchProjectBUException;

	/**
	* Returns the first project b u in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project b u, or <code>null</code> if a matching project b u could not be found
	*/
	public ProjectBU fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ProjectBU> orderByComparator);

	/**
	* Returns the last project b u in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project b u
	* @throws NoSuchProjectBUException if a matching project b u could not be found
	*/
	public ProjectBU findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ProjectBU> orderByComparator)
		throws NoSuchProjectBUException;

	/**
	* Returns the last project b u in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project b u, or <code>null</code> if a matching project b u could not be found
	*/
	public ProjectBU fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ProjectBU> orderByComparator);

	/**
	* Returns the project b us before and after the current project b u in the ordered set where uuid = &#63;.
	*
	* @param projectBUId the primary key of the current project b u
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next project b u
	* @throws NoSuchProjectBUException if a project b u with the primary key could not be found
	*/
	public ProjectBU[] findByUuid_PrevAndNext(long projectBUId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ProjectBU> orderByComparator)
		throws NoSuchProjectBUException;

	/**
	* Removes all the project b us where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of project b us where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching project b us
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns all the project b us where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching project b us
	*/
	public java.util.List<ProjectBU> findByUuid_C(java.lang.String uuid,
		long companyId);

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
	public java.util.List<ProjectBU> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

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
	public java.util.List<ProjectBU> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProjectBU> orderByComparator);

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
	public java.util.List<ProjectBU> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProjectBU> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first project b u in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project b u
	* @throws NoSuchProjectBUException if a matching project b u could not be found
	*/
	public ProjectBU findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<ProjectBU> orderByComparator)
		throws NoSuchProjectBUException;

	/**
	* Returns the first project b u in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project b u, or <code>null</code> if a matching project b u could not be found
	*/
	public ProjectBU fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<ProjectBU> orderByComparator);

	/**
	* Returns the last project b u in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project b u
	* @throws NoSuchProjectBUException if a matching project b u could not be found
	*/
	public ProjectBU findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<ProjectBU> orderByComparator)
		throws NoSuchProjectBUException;

	/**
	* Returns the last project b u in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project b u, or <code>null</code> if a matching project b u could not be found
	*/
	public ProjectBU fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<ProjectBU> orderByComparator);

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
	public ProjectBU[] findByUuid_C_PrevAndNext(long projectBUId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<ProjectBU> orderByComparator)
		throws NoSuchProjectBUException;

	/**
	* Removes all the project b us where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of project b us where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching project b us
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the project b us where type = &#63;.
	*
	* @param type the type
	* @return the matching project b us
	*/
	public java.util.List<ProjectBU> findByType(java.lang.String type);

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
	public java.util.List<ProjectBU> findByType(java.lang.String type,
		int start, int end);

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
	public java.util.List<ProjectBU> findByType(java.lang.String type,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProjectBU> orderByComparator);

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
	public java.util.List<ProjectBU> findByType(java.lang.String type,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProjectBU> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first project b u in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project b u
	* @throws NoSuchProjectBUException if a matching project b u could not be found
	*/
	public ProjectBU findByType_First(java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator<ProjectBU> orderByComparator)
		throws NoSuchProjectBUException;

	/**
	* Returns the first project b u in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project b u, or <code>null</code> if a matching project b u could not be found
	*/
	public ProjectBU fetchByType_First(java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator<ProjectBU> orderByComparator);

	/**
	* Returns the last project b u in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project b u
	* @throws NoSuchProjectBUException if a matching project b u could not be found
	*/
	public ProjectBU findByType_Last(java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator<ProjectBU> orderByComparator)
		throws NoSuchProjectBUException;

	/**
	* Returns the last project b u in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project b u, or <code>null</code> if a matching project b u could not be found
	*/
	public ProjectBU fetchByType_Last(java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator<ProjectBU> orderByComparator);

	/**
	* Returns the project b us before and after the current project b u in the ordered set where type = &#63;.
	*
	* @param projectBUId the primary key of the current project b u
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next project b u
	* @throws NoSuchProjectBUException if a project b u with the primary key could not be found
	*/
	public ProjectBU[] findByType_PrevAndNext(long projectBUId,
		java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator<ProjectBU> orderByComparator)
		throws NoSuchProjectBUException;

	/**
	* Removes all the project b us where type = &#63; from the database.
	*
	* @param type the type
	*/
	public void removeByType(java.lang.String type);

	/**
	* Returns the number of project b us where type = &#63;.
	*
	* @param type the type
	* @return the number of matching project b us
	*/
	public int countByType(java.lang.String type);

	/**
	* Caches the project b u in the entity cache if it is enabled.
	*
	* @param projectBU the project b u
	*/
	public void cacheResult(ProjectBU projectBU);

	/**
	* Caches the project b us in the entity cache if it is enabled.
	*
	* @param projectBUs the project b us
	*/
	public void cacheResult(java.util.List<ProjectBU> projectBUs);

	/**
	* Creates a new project b u with the primary key. Does not add the project b u to the database.
	*
	* @param projectBUId the primary key for the new project b u
	* @return the new project b u
	*/
	public ProjectBU create(long projectBUId);

	/**
	* Removes the project b u with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param projectBUId the primary key of the project b u
	* @return the project b u that was removed
	* @throws NoSuchProjectBUException if a project b u with the primary key could not be found
	*/
	public ProjectBU remove(long projectBUId) throws NoSuchProjectBUException;

	public ProjectBU updateImpl(ProjectBU projectBU);

	/**
	* Returns the project b u with the primary key or throws a {@link NoSuchProjectBUException} if it could not be found.
	*
	* @param projectBUId the primary key of the project b u
	* @return the project b u
	* @throws NoSuchProjectBUException if a project b u with the primary key could not be found
	*/
	public ProjectBU findByPrimaryKey(long projectBUId)
		throws NoSuchProjectBUException;

	/**
	* Returns the project b u with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param projectBUId the primary key of the project b u
	* @return the project b u, or <code>null</code> if a project b u with the primary key could not be found
	*/
	public ProjectBU fetchByPrimaryKey(long projectBUId);

	@Override
	public java.util.Map<java.io.Serializable, ProjectBU> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the project b us.
	*
	* @return the project b us
	*/
	public java.util.List<ProjectBU> findAll();

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
	public java.util.List<ProjectBU> findAll(int start, int end);

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
	public java.util.List<ProjectBU> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProjectBU> orderByComparator);

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
	public java.util.List<ProjectBU> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProjectBU> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the project b us from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of project b us.
	*
	* @return the number of project b us
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}
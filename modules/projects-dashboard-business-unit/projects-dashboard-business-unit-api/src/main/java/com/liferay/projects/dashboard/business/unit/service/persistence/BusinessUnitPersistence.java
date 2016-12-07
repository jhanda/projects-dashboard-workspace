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

import com.liferay.projects.dashboard.business.unit.exception.NoSuchBusinessUnitException;
import com.liferay.projects.dashboard.business.unit.model.BusinessUnit;

/**
 * The persistence interface for the business unit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Yury Butrymovich
 * @see com.liferay.projects.dashboard.business.unit.service.persistence.impl.BusinessUnitPersistenceImpl
 * @see BusinessUnitUtil
 * @generated
 */
@ProviderType
public interface BusinessUnitPersistence extends BasePersistence<BusinessUnit> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BusinessUnitUtil} to access the business unit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the business units where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching business units
	*/
	public java.util.List<BusinessUnit> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the business units where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BusinessUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of business units
	* @param end the upper bound of the range of business units (not inclusive)
	* @return the range of matching business units
	*/
	public java.util.List<BusinessUnit> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the business units where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BusinessUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of business units
	* @param end the upper bound of the range of business units (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching business units
	*/
	public java.util.List<BusinessUnit> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessUnit> orderByComparator);

	/**
	* Returns an ordered range of all the business units where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BusinessUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of business units
	* @param end the upper bound of the range of business units (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching business units
	*/
	public java.util.List<BusinessUnit> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessUnit> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first business unit in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching business unit
	* @throws NoSuchBusinessUnitException if a matching business unit could not be found
	*/
	public BusinessUnit findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessUnit> orderByComparator)
		throws NoSuchBusinessUnitException;

	/**
	* Returns the first business unit in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching business unit, or <code>null</code> if a matching business unit could not be found
	*/
	public BusinessUnit fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessUnit> orderByComparator);

	/**
	* Returns the last business unit in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching business unit
	* @throws NoSuchBusinessUnitException if a matching business unit could not be found
	*/
	public BusinessUnit findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessUnit> orderByComparator)
		throws NoSuchBusinessUnitException;

	/**
	* Returns the last business unit in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching business unit, or <code>null</code> if a matching business unit could not be found
	*/
	public BusinessUnit fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessUnit> orderByComparator);

	/**
	* Returns the business units before and after the current business unit in the ordered set where uuid = &#63;.
	*
	* @param businessUnitId the primary key of the current business unit
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next business unit
	* @throws NoSuchBusinessUnitException if a business unit with the primary key could not be found
	*/
	public BusinessUnit[] findByUuid_PrevAndNext(long businessUnitId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessUnit> orderByComparator)
		throws NoSuchBusinessUnitException;

	/**
	* Removes all the business units where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of business units where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching business units
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns all the business units where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching business units
	*/
	public java.util.List<BusinessUnit> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the business units where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BusinessUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of business units
	* @param end the upper bound of the range of business units (not inclusive)
	* @return the range of matching business units
	*/
	public java.util.List<BusinessUnit> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the business units where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BusinessUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of business units
	* @param end the upper bound of the range of business units (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching business units
	*/
	public java.util.List<BusinessUnit> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessUnit> orderByComparator);

	/**
	* Returns an ordered range of all the business units where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BusinessUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of business units
	* @param end the upper bound of the range of business units (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching business units
	*/
	public java.util.List<BusinessUnit> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessUnit> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first business unit in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching business unit
	* @throws NoSuchBusinessUnitException if a matching business unit could not be found
	*/
	public BusinessUnit findByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessUnit> orderByComparator)
		throws NoSuchBusinessUnitException;

	/**
	* Returns the first business unit in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching business unit, or <code>null</code> if a matching business unit could not be found
	*/
	public BusinessUnit fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessUnit> orderByComparator);

	/**
	* Returns the last business unit in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching business unit
	* @throws NoSuchBusinessUnitException if a matching business unit could not be found
	*/
	public BusinessUnit findByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessUnit> orderByComparator)
		throws NoSuchBusinessUnitException;

	/**
	* Returns the last business unit in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching business unit, or <code>null</code> if a matching business unit could not be found
	*/
	public BusinessUnit fetchByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessUnit> orderByComparator);

	/**
	* Returns the business units before and after the current business unit in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param businessUnitId the primary key of the current business unit
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next business unit
	* @throws NoSuchBusinessUnitException if a business unit with the primary key could not be found
	*/
	public BusinessUnit[] findByUuid_C_PrevAndNext(long businessUnitId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessUnit> orderByComparator)
		throws NoSuchBusinessUnitException;

	/**
	* Removes all the business units where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of business units where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching business units
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the business unit where name = &#63; or throws a {@link NoSuchBusinessUnitException} if it could not be found.
	*
	* @param name the name
	* @return the matching business unit
	* @throws NoSuchBusinessUnitException if a matching business unit could not be found
	*/
	public BusinessUnit findByName(java.lang.String name)
		throws NoSuchBusinessUnitException;

	/**
	* Returns the business unit where name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param name the name
	* @return the matching business unit, or <code>null</code> if a matching business unit could not be found
	*/
	public BusinessUnit fetchByName(java.lang.String name);

	/**
	* Returns the business unit where name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param name the name
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching business unit, or <code>null</code> if a matching business unit could not be found
	*/
	public BusinessUnit fetchByName(java.lang.String name,
		boolean retrieveFromCache);

	/**
	* Removes the business unit where name = &#63; from the database.
	*
	* @param name the name
	* @return the business unit that was removed
	*/
	public BusinessUnit removeByName(java.lang.String name)
		throws NoSuchBusinessUnitException;

	/**
	* Returns the number of business units where name = &#63;.
	*
	* @param name the name
	* @return the number of matching business units
	*/
	public int countByName(java.lang.String name);

	/**
	* Caches the business unit in the entity cache if it is enabled.
	*
	* @param businessUnit the business unit
	*/
	public void cacheResult(BusinessUnit businessUnit);

	/**
	* Caches the business units in the entity cache if it is enabled.
	*
	* @param businessUnits the business units
	*/
	public void cacheResult(java.util.List<BusinessUnit> businessUnits);

	/**
	* Creates a new business unit with the primary key. Does not add the business unit to the database.
	*
	* @param businessUnitId the primary key for the new business unit
	* @return the new business unit
	*/
	public BusinessUnit create(long businessUnitId);

	/**
	* Removes the business unit with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param businessUnitId the primary key of the business unit
	* @return the business unit that was removed
	* @throws NoSuchBusinessUnitException if a business unit with the primary key could not be found
	*/
	public BusinessUnit remove(long businessUnitId)
		throws NoSuchBusinessUnitException;

	public BusinessUnit updateImpl(BusinessUnit businessUnit);

	/**
	* Returns the business unit with the primary key or throws a {@link NoSuchBusinessUnitException} if it could not be found.
	*
	* @param businessUnitId the primary key of the business unit
	* @return the business unit
	* @throws NoSuchBusinessUnitException if a business unit with the primary key could not be found
	*/
	public BusinessUnit findByPrimaryKey(long businessUnitId)
		throws NoSuchBusinessUnitException;

	/**
	* Returns the business unit with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param businessUnitId the primary key of the business unit
	* @return the business unit, or <code>null</code> if a business unit with the primary key could not be found
	*/
	public BusinessUnit fetchByPrimaryKey(long businessUnitId);

	@Override
	public java.util.Map<java.io.Serializable, BusinessUnit> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the business units.
	*
	* @return the business units
	*/
	public java.util.List<BusinessUnit> findAll();

	/**
	* Returns a range of all the business units.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BusinessUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of business units
	* @param end the upper bound of the range of business units (not inclusive)
	* @return the range of business units
	*/
	public java.util.List<BusinessUnit> findAll(int start, int end);

	/**
	* Returns an ordered range of all the business units.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BusinessUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of business units
	* @param end the upper bound of the range of business units (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of business units
	*/
	public java.util.List<BusinessUnit> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessUnit> orderByComparator);

	/**
	* Returns an ordered range of all the business units.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BusinessUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of business units
	* @param end the upper bound of the range of business units (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of business units
	*/
	public java.util.List<BusinessUnit> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BusinessUnit> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the business units from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of business units.
	*
	* @return the number of business units
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}
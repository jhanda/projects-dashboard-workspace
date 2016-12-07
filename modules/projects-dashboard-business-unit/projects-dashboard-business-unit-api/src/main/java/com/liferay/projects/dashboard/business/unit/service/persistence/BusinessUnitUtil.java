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

import com.liferay.projects.dashboard.business.unit.model.BusinessUnit;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the business unit service. This utility wraps {@link com.liferay.projects.dashboard.business.unit.service.persistence.impl.BusinessUnitPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Yury Butrymovich
 * @see BusinessUnitPersistence
 * @see com.liferay.projects.dashboard.business.unit.service.persistence.impl.BusinessUnitPersistenceImpl
 * @generated
 */
@ProviderType
public class BusinessUnitUtil {
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
	public static void clearCache(BusinessUnit businessUnit) {
		getPersistence().clearCache(businessUnit);
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
	public static List<BusinessUnit> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BusinessUnit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BusinessUnit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<BusinessUnit> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static BusinessUnit update(BusinessUnit businessUnit) {
		return getPersistence().update(businessUnit);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static BusinessUnit update(BusinessUnit businessUnit,
		ServiceContext serviceContext) {
		return getPersistence().update(businessUnit, serviceContext);
	}

	/**
	* Returns all the business units where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching business units
	*/
	public static List<BusinessUnit> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<BusinessUnit> findByUuid(java.lang.String uuid,
		int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<BusinessUnit> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<BusinessUnit> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<BusinessUnit> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<BusinessUnit> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first business unit in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching business unit
	* @throws NoSuchBusinessUnitException if a matching business unit could not be found
	*/
	public static BusinessUnit findByUuid_First(java.lang.String uuid,
		OrderByComparator<BusinessUnit> orderByComparator)
		throws com.liferay.projects.dashboard.business.unit.exception.NoSuchBusinessUnitException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first business unit in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching business unit, or <code>null</code> if a matching business unit could not be found
	*/
	public static BusinessUnit fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<BusinessUnit> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last business unit in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching business unit
	* @throws NoSuchBusinessUnitException if a matching business unit could not be found
	*/
	public static BusinessUnit findByUuid_Last(java.lang.String uuid,
		OrderByComparator<BusinessUnit> orderByComparator)
		throws com.liferay.projects.dashboard.business.unit.exception.NoSuchBusinessUnitException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last business unit in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching business unit, or <code>null</code> if a matching business unit could not be found
	*/
	public static BusinessUnit fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<BusinessUnit> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the business units before and after the current business unit in the ordered set where uuid = &#63;.
	*
	* @param businessUnitId the primary key of the current business unit
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next business unit
	* @throws NoSuchBusinessUnitException if a business unit with the primary key could not be found
	*/
	public static BusinessUnit[] findByUuid_PrevAndNext(long businessUnitId,
		java.lang.String uuid, OrderByComparator<BusinessUnit> orderByComparator)
		throws com.liferay.projects.dashboard.business.unit.exception.NoSuchBusinessUnitException {
		return getPersistence()
				   .findByUuid_PrevAndNext(businessUnitId, uuid,
			orderByComparator);
	}

	/**
	* Removes all the business units where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of business units where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching business units
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns all the business units where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching business units
	*/
	public static List<BusinessUnit> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<BusinessUnit> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<BusinessUnit> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<BusinessUnit> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<BusinessUnit> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<BusinessUnit> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first business unit in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching business unit
	* @throws NoSuchBusinessUnitException if a matching business unit could not be found
	*/
	public static BusinessUnit findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<BusinessUnit> orderByComparator)
		throws com.liferay.projects.dashboard.business.unit.exception.NoSuchBusinessUnitException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first business unit in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching business unit, or <code>null</code> if a matching business unit could not be found
	*/
	public static BusinessUnit fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<BusinessUnit> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last business unit in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching business unit
	* @throws NoSuchBusinessUnitException if a matching business unit could not be found
	*/
	public static BusinessUnit findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<BusinessUnit> orderByComparator)
		throws com.liferay.projects.dashboard.business.unit.exception.NoSuchBusinessUnitException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last business unit in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching business unit, or <code>null</code> if a matching business unit could not be found
	*/
	public static BusinessUnit fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<BusinessUnit> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

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
	public static BusinessUnit[] findByUuid_C_PrevAndNext(long businessUnitId,
		java.lang.String uuid, long companyId,
		OrderByComparator<BusinessUnit> orderByComparator)
		throws com.liferay.projects.dashboard.business.unit.exception.NoSuchBusinessUnitException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(businessUnitId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the business units where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of business units where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching business units
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns the business unit where name = &#63; or throws a {@link NoSuchBusinessUnitException} if it could not be found.
	*
	* @param name the name
	* @return the matching business unit
	* @throws NoSuchBusinessUnitException if a matching business unit could not be found
	*/
	public static BusinessUnit findByName(java.lang.String name)
		throws com.liferay.projects.dashboard.business.unit.exception.NoSuchBusinessUnitException {
		return getPersistence().findByName(name);
	}

	/**
	* Returns the business unit where name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param name the name
	* @return the matching business unit, or <code>null</code> if a matching business unit could not be found
	*/
	public static BusinessUnit fetchByName(java.lang.String name) {
		return getPersistence().fetchByName(name);
	}

	/**
	* Returns the business unit where name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param name the name
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching business unit, or <code>null</code> if a matching business unit could not be found
	*/
	public static BusinessUnit fetchByName(java.lang.String name,
		boolean retrieveFromCache) {
		return getPersistence().fetchByName(name, retrieveFromCache);
	}

	/**
	* Removes the business unit where name = &#63; from the database.
	*
	* @param name the name
	* @return the business unit that was removed
	*/
	public static BusinessUnit removeByName(java.lang.String name)
		throws com.liferay.projects.dashboard.business.unit.exception.NoSuchBusinessUnitException {
		return getPersistence().removeByName(name);
	}

	/**
	* Returns the number of business units where name = &#63;.
	*
	* @param name the name
	* @return the number of matching business units
	*/
	public static int countByName(java.lang.String name) {
		return getPersistence().countByName(name);
	}

	/**
	* Caches the business unit in the entity cache if it is enabled.
	*
	* @param businessUnit the business unit
	*/
	public static void cacheResult(BusinessUnit businessUnit) {
		getPersistence().cacheResult(businessUnit);
	}

	/**
	* Caches the business units in the entity cache if it is enabled.
	*
	* @param businessUnits the business units
	*/
	public static void cacheResult(List<BusinessUnit> businessUnits) {
		getPersistence().cacheResult(businessUnits);
	}

	/**
	* Creates a new business unit with the primary key. Does not add the business unit to the database.
	*
	* @param businessUnitId the primary key for the new business unit
	* @return the new business unit
	*/
	public static BusinessUnit create(long businessUnitId) {
		return getPersistence().create(businessUnitId);
	}

	/**
	* Removes the business unit with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param businessUnitId the primary key of the business unit
	* @return the business unit that was removed
	* @throws NoSuchBusinessUnitException if a business unit with the primary key could not be found
	*/
	public static BusinessUnit remove(long businessUnitId)
		throws com.liferay.projects.dashboard.business.unit.exception.NoSuchBusinessUnitException {
		return getPersistence().remove(businessUnitId);
	}

	public static BusinessUnit updateImpl(BusinessUnit businessUnit) {
		return getPersistence().updateImpl(businessUnit);
	}

	/**
	* Returns the business unit with the primary key or throws a {@link NoSuchBusinessUnitException} if it could not be found.
	*
	* @param businessUnitId the primary key of the business unit
	* @return the business unit
	* @throws NoSuchBusinessUnitException if a business unit with the primary key could not be found
	*/
	public static BusinessUnit findByPrimaryKey(long businessUnitId)
		throws com.liferay.projects.dashboard.business.unit.exception.NoSuchBusinessUnitException {
		return getPersistence().findByPrimaryKey(businessUnitId);
	}

	/**
	* Returns the business unit with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param businessUnitId the primary key of the business unit
	* @return the business unit, or <code>null</code> if a business unit with the primary key could not be found
	*/
	public static BusinessUnit fetchByPrimaryKey(long businessUnitId) {
		return getPersistence().fetchByPrimaryKey(businessUnitId);
	}

	public static java.util.Map<java.io.Serializable, BusinessUnit> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the business units.
	*
	* @return the business units
	*/
	public static List<BusinessUnit> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<BusinessUnit> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<BusinessUnit> findAll(int start, int end,
		OrderByComparator<BusinessUnit> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<BusinessUnit> findAll(int start, int end,
		OrderByComparator<BusinessUnit> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the business units from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of business units.
	*
	* @return the number of business units
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static BusinessUnitPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<BusinessUnitPersistence, BusinessUnitPersistence> _serviceTracker =
		ServiceTrackerFactory.open(BusinessUnitPersistence.class);
}
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

package com.liferay.projects.dashboard.business.unit.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import com.liferay.projects.dashboard.business.unit.exception.NoSuchBusinessUnitException;
import com.liferay.projects.dashboard.business.unit.model.BusinessUnit;
import com.liferay.projects.dashboard.business.unit.model.impl.BusinessUnitImpl;
import com.liferay.projects.dashboard.business.unit.model.impl.BusinessUnitModelImpl;
import com.liferay.projects.dashboard.business.unit.service.persistence.BusinessUnitPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the business unit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Yury Butrymovich
 * @see BusinessUnitPersistence
 * @see com.liferay.projects.dashboard.business.unit.service.persistence.BusinessUnitUtil
 * @generated
 */
@ProviderType
public class BusinessUnitPersistenceImpl extends BasePersistenceImpl<BusinessUnit>
	implements BusinessUnitPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BusinessUnitUtil} to access the business unit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BusinessUnitImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BusinessUnitModelImpl.ENTITY_CACHE_ENABLED,
			BusinessUnitModelImpl.FINDER_CACHE_ENABLED, BusinessUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BusinessUnitModelImpl.ENTITY_CACHE_ENABLED,
			BusinessUnitModelImpl.FINDER_CACHE_ENABLED, BusinessUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BusinessUnitModelImpl.ENTITY_CACHE_ENABLED,
			BusinessUnitModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(BusinessUnitModelImpl.ENTITY_CACHE_ENABLED,
			BusinessUnitModelImpl.FINDER_CACHE_ENABLED, BusinessUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(BusinessUnitModelImpl.ENTITY_CACHE_ENABLED,
			BusinessUnitModelImpl.FINDER_CACHE_ENABLED, BusinessUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			BusinessUnitModelImpl.UUID_COLUMN_BITMASK |
			BusinessUnitModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(BusinessUnitModelImpl.ENTITY_CACHE_ENABLED,
			BusinessUnitModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the business units where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching business units
	 */
	@Override
	public List<BusinessUnit> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<BusinessUnit> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<BusinessUnit> findByUuid(String uuid, int start, int end,
		OrderByComparator<BusinessUnit> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<BusinessUnit> findByUuid(String uuid, int start, int end,
		OrderByComparator<BusinessUnit> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<BusinessUnit> list = null;

		if (retrieveFromCache) {
			list = (List<BusinessUnit>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (BusinessUnit businessUnit : list) {
					if (!Objects.equals(uuid, businessUnit.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_BUSINESSUNIT_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(BusinessUnitModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<BusinessUnit>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<BusinessUnit>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first business unit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business unit
	 * @throws NoSuchBusinessUnitException if a matching business unit could not be found
	 */
	@Override
	public BusinessUnit findByUuid_First(String uuid,
		OrderByComparator<BusinessUnit> orderByComparator)
		throws NoSuchBusinessUnitException {
		BusinessUnit businessUnit = fetchByUuid_First(uuid, orderByComparator);

		if (businessUnit != null) {
			return businessUnit;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBusinessUnitException(msg.toString());
	}

	/**
	 * Returns the first business unit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business unit, or <code>null</code> if a matching business unit could not be found
	 */
	@Override
	public BusinessUnit fetchByUuid_First(String uuid,
		OrderByComparator<BusinessUnit> orderByComparator) {
		List<BusinessUnit> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last business unit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business unit
	 * @throws NoSuchBusinessUnitException if a matching business unit could not be found
	 */
	@Override
	public BusinessUnit findByUuid_Last(String uuid,
		OrderByComparator<BusinessUnit> orderByComparator)
		throws NoSuchBusinessUnitException {
		BusinessUnit businessUnit = fetchByUuid_Last(uuid, orderByComparator);

		if (businessUnit != null) {
			return businessUnit;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBusinessUnitException(msg.toString());
	}

	/**
	 * Returns the last business unit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business unit, or <code>null</code> if a matching business unit could not be found
	 */
	@Override
	public BusinessUnit fetchByUuid_Last(String uuid,
		OrderByComparator<BusinessUnit> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<BusinessUnit> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public BusinessUnit[] findByUuid_PrevAndNext(long businessUnitId,
		String uuid, OrderByComparator<BusinessUnit> orderByComparator)
		throws NoSuchBusinessUnitException {
		BusinessUnit businessUnit = findByPrimaryKey(businessUnitId);

		Session session = null;

		try {
			session = openSession();

			BusinessUnit[] array = new BusinessUnitImpl[3];

			array[0] = getByUuid_PrevAndNext(session, businessUnit, uuid,
					orderByComparator, true);

			array[1] = businessUnit;

			array[2] = getByUuid_PrevAndNext(session, businessUnit, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected BusinessUnit getByUuid_PrevAndNext(Session session,
		BusinessUnit businessUnit, String uuid,
		OrderByComparator<BusinessUnit> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BUSINESSUNIT_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(BusinessUnitModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(businessUnit);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<BusinessUnit> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the business units where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (BusinessUnit businessUnit : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(businessUnit);
		}
	}

	/**
	 * Returns the number of business units where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching business units
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BUSINESSUNIT_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "businessUnit.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "businessUnit.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(businessUnit.uuid IS NULL OR businessUnit.uuid = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(BusinessUnitModelImpl.ENTITY_CACHE_ENABLED,
			BusinessUnitModelImpl.FINDER_CACHE_ENABLED, BusinessUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(BusinessUnitModelImpl.ENTITY_CACHE_ENABLED,
			BusinessUnitModelImpl.FINDER_CACHE_ENABLED, BusinessUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			BusinessUnitModelImpl.UUID_COLUMN_BITMASK |
			BusinessUnitModelImpl.COMPANYID_COLUMN_BITMASK |
			BusinessUnitModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(BusinessUnitModelImpl.ENTITY_CACHE_ENABLED,
			BusinessUnitModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the business units where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching business units
	 */
	@Override
	public List<BusinessUnit> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<BusinessUnit> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<BusinessUnit> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<BusinessUnit> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<BusinessUnit> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<BusinessUnit> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<BusinessUnit> list = null;

		if (retrieveFromCache) {
			list = (List<BusinessUnit>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (BusinessUnit businessUnit : list) {
					if (!Objects.equals(uuid, businessUnit.getUuid()) ||
							(companyId != businessUnit.getCompanyId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_BUSINESSUNIT_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(BusinessUnitModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<BusinessUnit>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<BusinessUnit>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public BusinessUnit findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<BusinessUnit> orderByComparator)
		throws NoSuchBusinessUnitException {
		BusinessUnit businessUnit = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (businessUnit != null) {
			return businessUnit;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBusinessUnitException(msg.toString());
	}

	/**
	 * Returns the first business unit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching business unit, or <code>null</code> if a matching business unit could not be found
	 */
	@Override
	public BusinessUnit fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<BusinessUnit> orderByComparator) {
		List<BusinessUnit> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public BusinessUnit findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<BusinessUnit> orderByComparator)
		throws NoSuchBusinessUnitException {
		BusinessUnit businessUnit = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (businessUnit != null) {
			return businessUnit;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBusinessUnitException(msg.toString());
	}

	/**
	 * Returns the last business unit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching business unit, or <code>null</code> if a matching business unit could not be found
	 */
	@Override
	public BusinessUnit fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<BusinessUnit> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<BusinessUnit> list = findByUuid_C(uuid, companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public BusinessUnit[] findByUuid_C_PrevAndNext(long businessUnitId,
		String uuid, long companyId,
		OrderByComparator<BusinessUnit> orderByComparator)
		throws NoSuchBusinessUnitException {
		BusinessUnit businessUnit = findByPrimaryKey(businessUnitId);

		Session session = null;

		try {
			session = openSession();

			BusinessUnit[] array = new BusinessUnitImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, businessUnit, uuid,
					companyId, orderByComparator, true);

			array[1] = businessUnit;

			array[2] = getByUuid_C_PrevAndNext(session, businessUnit, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected BusinessUnit getByUuid_C_PrevAndNext(Session session,
		BusinessUnit businessUnit, String uuid, long companyId,
		OrderByComparator<BusinessUnit> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_BUSINESSUNIT_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(BusinessUnitModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(businessUnit);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<BusinessUnit> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the business units where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (BusinessUnit businessUnit : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(businessUnit);
		}
	}

	/**
	 * Returns the number of business units where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching business units
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_BUSINESSUNIT_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "businessUnit.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "businessUnit.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(businessUnit.uuid IS NULL OR businessUnit.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "businessUnit.companyId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_NAME = new FinderPath(BusinessUnitModelImpl.ENTITY_CACHE_ENABLED,
			BusinessUnitModelImpl.FINDER_CACHE_ENABLED, BusinessUnitImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByName",
			new String[] { String.class.getName() },
			BusinessUnitModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NAME = new FinderPath(BusinessUnitModelImpl.ENTITY_CACHE_ENABLED,
			BusinessUnitModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByName",
			new String[] { String.class.getName() });

	/**
	 * Returns the business unit where name = &#63; or throws a {@link NoSuchBusinessUnitException} if it could not be found.
	 *
	 * @param name the name
	 * @return the matching business unit
	 * @throws NoSuchBusinessUnitException if a matching business unit could not be found
	 */
	@Override
	public BusinessUnit findByName(String name)
		throws NoSuchBusinessUnitException {
		BusinessUnit businessUnit = fetchByName(name);

		if (businessUnit == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("name=");
			msg.append(name);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchBusinessUnitException(msg.toString());
		}

		return businessUnit;
	}

	/**
	 * Returns the business unit where name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param name the name
	 * @return the matching business unit, or <code>null</code> if a matching business unit could not be found
	 */
	@Override
	public BusinessUnit fetchByName(String name) {
		return fetchByName(name, true);
	}

	/**
	 * Returns the business unit where name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param name the name
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching business unit, or <code>null</code> if a matching business unit could not be found
	 */
	@Override
	public BusinessUnit fetchByName(String name, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { name };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_NAME,
					finderArgs, this);
		}

		if (result instanceof BusinessUnit) {
			BusinessUnit businessUnit = (BusinessUnit)result;

			if (!Objects.equals(name, businessUnit.getName())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_BUSINESSUNIT_WHERE);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_NAME_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NAME_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_NAME_NAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindName) {
					qPos.add(name);
				}

				List<BusinessUnit> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_NAME,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"BusinessUnitPersistenceImpl.fetchByName(String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					BusinessUnit businessUnit = list.get(0);

					result = businessUnit;

					cacheResult(businessUnit);

					if ((businessUnit.getName() == null) ||
							!businessUnit.getName().equals(name)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_NAME,
							finderArgs, businessUnit);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_NAME, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (BusinessUnit)result;
		}
	}

	/**
	 * Removes the business unit where name = &#63; from the database.
	 *
	 * @param name the name
	 * @return the business unit that was removed
	 */
	@Override
	public BusinessUnit removeByName(String name)
		throws NoSuchBusinessUnitException {
		BusinessUnit businessUnit = findByName(name);

		return remove(businessUnit);
	}

	/**
	 * Returns the number of business units where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching business units
	 */
	@Override
	public int countByName(String name) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NAME;

		Object[] finderArgs = new Object[] { name };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BUSINESSUNIT_WHERE);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_NAME_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NAME_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_NAME_NAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindName) {
					qPos.add(name);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_NAME_NAME_1 = "businessUnit.name IS NULL";
	private static final String _FINDER_COLUMN_NAME_NAME_2 = "businessUnit.name = ?";
	private static final String _FINDER_COLUMN_NAME_NAME_3 = "(businessUnit.name IS NULL OR businessUnit.name = '')";

	public BusinessUnitPersistenceImpl() {
		setModelClass(BusinessUnit.class);
	}

	/**
	 * Caches the business unit in the entity cache if it is enabled.
	 *
	 * @param businessUnit the business unit
	 */
	@Override
	public void cacheResult(BusinessUnit businessUnit) {
		entityCache.putResult(BusinessUnitModelImpl.ENTITY_CACHE_ENABLED,
			BusinessUnitImpl.class, businessUnit.getPrimaryKey(), businessUnit);

		finderCache.putResult(FINDER_PATH_FETCH_BY_NAME,
			new Object[] { businessUnit.getName() }, businessUnit);

		businessUnit.resetOriginalValues();
	}

	/**
	 * Caches the business units in the entity cache if it is enabled.
	 *
	 * @param businessUnits the business units
	 */
	@Override
	public void cacheResult(List<BusinessUnit> businessUnits) {
		for (BusinessUnit businessUnit : businessUnits) {
			if (entityCache.getResult(
						BusinessUnitModelImpl.ENTITY_CACHE_ENABLED,
						BusinessUnitImpl.class, businessUnit.getPrimaryKey()) == null) {
				cacheResult(businessUnit);
			}
			else {
				businessUnit.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all business units.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(BusinessUnitImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the business unit.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(BusinessUnit businessUnit) {
		entityCache.removeResult(BusinessUnitModelImpl.ENTITY_CACHE_ENABLED,
			BusinessUnitImpl.class, businessUnit.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((BusinessUnitModelImpl)businessUnit);
	}

	@Override
	public void clearCache(List<BusinessUnit> businessUnits) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (BusinessUnit businessUnit : businessUnits) {
			entityCache.removeResult(BusinessUnitModelImpl.ENTITY_CACHE_ENABLED,
				BusinessUnitImpl.class, businessUnit.getPrimaryKey());

			clearUniqueFindersCache((BusinessUnitModelImpl)businessUnit);
		}
	}

	protected void cacheUniqueFindersCache(
		BusinessUnitModelImpl businessUnitModelImpl, boolean isNew) {
		if (isNew) {
			Object[] args = new Object[] { businessUnitModelImpl.getName() };

			finderCache.putResult(FINDER_PATH_COUNT_BY_NAME, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_NAME, args,
				businessUnitModelImpl);
		}
		else {
			if ((businessUnitModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_NAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { businessUnitModelImpl.getName() };

				finderCache.putResult(FINDER_PATH_COUNT_BY_NAME, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_NAME, args,
					businessUnitModelImpl);
			}
		}
	}

	protected void clearUniqueFindersCache(
		BusinessUnitModelImpl businessUnitModelImpl) {
		Object[] args = new Object[] { businessUnitModelImpl.getName() };

		finderCache.removeResult(FINDER_PATH_COUNT_BY_NAME, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_NAME, args);

		if ((businessUnitModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_NAME.getColumnBitmask()) != 0) {
			args = new Object[] { businessUnitModelImpl.getOriginalName() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_NAME, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_NAME, args);
		}
	}

	/**
	 * Creates a new business unit with the primary key. Does not add the business unit to the database.
	 *
	 * @param businessUnitId the primary key for the new business unit
	 * @return the new business unit
	 */
	@Override
	public BusinessUnit create(long businessUnitId) {
		BusinessUnit businessUnit = new BusinessUnitImpl();

		businessUnit.setNew(true);
		businessUnit.setPrimaryKey(businessUnitId);

		String uuid = PortalUUIDUtil.generate();

		businessUnit.setUuid(uuid);

		businessUnit.setCompanyId(companyProvider.getCompanyId());

		return businessUnit;
	}

	/**
	 * Removes the business unit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param businessUnitId the primary key of the business unit
	 * @return the business unit that was removed
	 * @throws NoSuchBusinessUnitException if a business unit with the primary key could not be found
	 */
	@Override
	public BusinessUnit remove(long businessUnitId)
		throws NoSuchBusinessUnitException {
		return remove((Serializable)businessUnitId);
	}

	/**
	 * Removes the business unit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the business unit
	 * @return the business unit that was removed
	 * @throws NoSuchBusinessUnitException if a business unit with the primary key could not be found
	 */
	@Override
	public BusinessUnit remove(Serializable primaryKey)
		throws NoSuchBusinessUnitException {
		Session session = null;

		try {
			session = openSession();

			BusinessUnit businessUnit = (BusinessUnit)session.get(BusinessUnitImpl.class,
					primaryKey);

			if (businessUnit == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBusinessUnitException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(businessUnit);
		}
		catch (NoSuchBusinessUnitException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected BusinessUnit removeImpl(BusinessUnit businessUnit) {
		businessUnit = toUnwrappedModel(businessUnit);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(businessUnit)) {
				businessUnit = (BusinessUnit)session.get(BusinessUnitImpl.class,
						businessUnit.getPrimaryKeyObj());
			}

			if (businessUnit != null) {
				session.delete(businessUnit);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (businessUnit != null) {
			clearCache(businessUnit);
		}

		return businessUnit;
	}

	@Override
	public BusinessUnit updateImpl(BusinessUnit businessUnit) {
		businessUnit = toUnwrappedModel(businessUnit);

		boolean isNew = businessUnit.isNew();

		BusinessUnitModelImpl businessUnitModelImpl = (BusinessUnitModelImpl)businessUnit;

		if (Validator.isNull(businessUnit.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			businessUnit.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (businessUnit.getCreateDate() == null)) {
			if (serviceContext == null) {
				businessUnit.setCreateDate(now);
			}
			else {
				businessUnit.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!businessUnitModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				businessUnit.setModifiedDate(now);
			}
			else {
				businessUnit.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (businessUnit.isNew()) {
				session.save(businessUnit);

				businessUnit.setNew(false);
			}
			else {
				businessUnit = (BusinessUnit)session.merge(businessUnit);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !BusinessUnitModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((businessUnitModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						businessUnitModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { businessUnitModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((businessUnitModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						businessUnitModelImpl.getOriginalUuid(),
						businessUnitModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						businessUnitModelImpl.getUuid(),
						businessUnitModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}
		}

		entityCache.putResult(BusinessUnitModelImpl.ENTITY_CACHE_ENABLED,
			BusinessUnitImpl.class, businessUnit.getPrimaryKey(), businessUnit,
			false);

		clearUniqueFindersCache(businessUnitModelImpl);
		cacheUniqueFindersCache(businessUnitModelImpl, isNew);

		businessUnit.resetOriginalValues();

		return businessUnit;
	}

	protected BusinessUnit toUnwrappedModel(BusinessUnit businessUnit) {
		if (businessUnit instanceof BusinessUnitImpl) {
			return businessUnit;
		}

		BusinessUnitImpl businessUnitImpl = new BusinessUnitImpl();

		businessUnitImpl.setNew(businessUnit.isNew());
		businessUnitImpl.setPrimaryKey(businessUnit.getPrimaryKey());

		businessUnitImpl.setUuid(businessUnit.getUuid());
		businessUnitImpl.setBusinessUnitId(businessUnit.getBusinessUnitId());
		businessUnitImpl.setCompanyId(businessUnit.getCompanyId());
		businessUnitImpl.setUserId(businessUnit.getUserId());
		businessUnitImpl.setUserName(businessUnit.getUserName());
		businessUnitImpl.setCreateDate(businessUnit.getCreateDate());
		businessUnitImpl.setModifiedDate(businessUnit.getModifiedDate());
		businessUnitImpl.setName(businessUnit.getName());

		return businessUnitImpl;
	}

	/**
	 * Returns the business unit with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the business unit
	 * @return the business unit
	 * @throws NoSuchBusinessUnitException if a business unit with the primary key could not be found
	 */
	@Override
	public BusinessUnit findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBusinessUnitException {
		BusinessUnit businessUnit = fetchByPrimaryKey(primaryKey);

		if (businessUnit == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBusinessUnitException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return businessUnit;
	}

	/**
	 * Returns the business unit with the primary key or throws a {@link NoSuchBusinessUnitException} if it could not be found.
	 *
	 * @param businessUnitId the primary key of the business unit
	 * @return the business unit
	 * @throws NoSuchBusinessUnitException if a business unit with the primary key could not be found
	 */
	@Override
	public BusinessUnit findByPrimaryKey(long businessUnitId)
		throws NoSuchBusinessUnitException {
		return findByPrimaryKey((Serializable)businessUnitId);
	}

	/**
	 * Returns the business unit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the business unit
	 * @return the business unit, or <code>null</code> if a business unit with the primary key could not be found
	 */
	@Override
	public BusinessUnit fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(BusinessUnitModelImpl.ENTITY_CACHE_ENABLED,
				BusinessUnitImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		BusinessUnit businessUnit = (BusinessUnit)serializable;

		if (businessUnit == null) {
			Session session = null;

			try {
				session = openSession();

				businessUnit = (BusinessUnit)session.get(BusinessUnitImpl.class,
						primaryKey);

				if (businessUnit != null) {
					cacheResult(businessUnit);
				}
				else {
					entityCache.putResult(BusinessUnitModelImpl.ENTITY_CACHE_ENABLED,
						BusinessUnitImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(BusinessUnitModelImpl.ENTITY_CACHE_ENABLED,
					BusinessUnitImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return businessUnit;
	}

	/**
	 * Returns the business unit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param businessUnitId the primary key of the business unit
	 * @return the business unit, or <code>null</code> if a business unit with the primary key could not be found
	 */
	@Override
	public BusinessUnit fetchByPrimaryKey(long businessUnitId) {
		return fetchByPrimaryKey((Serializable)businessUnitId);
	}

	@Override
	public Map<Serializable, BusinessUnit> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, BusinessUnit> map = new HashMap<Serializable, BusinessUnit>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			BusinessUnit businessUnit = fetchByPrimaryKey(primaryKey);

			if (businessUnit != null) {
				map.put(primaryKey, businessUnit);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(BusinessUnitModelImpl.ENTITY_CACHE_ENABLED,
					BusinessUnitImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (BusinessUnit)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_BUSINESSUNIT_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (BusinessUnit businessUnit : (List<BusinessUnit>)q.list()) {
				map.put(businessUnit.getPrimaryKeyObj(), businessUnit);

				cacheResult(businessUnit);

				uncachedPrimaryKeys.remove(businessUnit.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(BusinessUnitModelImpl.ENTITY_CACHE_ENABLED,
					BusinessUnitImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the business units.
	 *
	 * @return the business units
	 */
	@Override
	public List<BusinessUnit> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<BusinessUnit> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<BusinessUnit> findAll(int start, int end,
		OrderByComparator<BusinessUnit> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<BusinessUnit> findAll(int start, int end,
		OrderByComparator<BusinessUnit> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<BusinessUnit> list = null;

		if (retrieveFromCache) {
			list = (List<BusinessUnit>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_BUSINESSUNIT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BUSINESSUNIT;

				if (pagination) {
					sql = sql.concat(BusinessUnitModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<BusinessUnit>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<BusinessUnit>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the business units from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (BusinessUnit businessUnit : findAll()) {
			remove(businessUnit);
		}
	}

	/**
	 * Returns the number of business units.
	 *
	 * @return the number of business units
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BUSINESSUNIT);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return BusinessUnitModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the business unit persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(BusinessUnitImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_BUSINESSUNIT = "SELECT businessUnit FROM BusinessUnit businessUnit";
	private static final String _SQL_SELECT_BUSINESSUNIT_WHERE_PKS_IN = "SELECT businessUnit FROM BusinessUnit businessUnit WHERE businessUnitId IN (";
	private static final String _SQL_SELECT_BUSINESSUNIT_WHERE = "SELECT businessUnit FROM BusinessUnit businessUnit WHERE ";
	private static final String _SQL_COUNT_BUSINESSUNIT = "SELECT COUNT(businessUnit) FROM BusinessUnit businessUnit";
	private static final String _SQL_COUNT_BUSINESSUNIT_WHERE = "SELECT COUNT(businessUnit) FROM BusinessUnit businessUnit WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "businessUnit.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No BusinessUnit exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No BusinessUnit exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(BusinessUnitPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}
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

package com.liferay.projects.dashboard.business.unit.service.persistence.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.test.ReflectionTestUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.util.IntegerWrapper;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Time;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.test.rule.PersistenceTestRule;
import com.liferay.portal.test.rule.TransactionalTestRule;

import com.liferay.projects.dashboard.business.unit.exception.NoSuchBusinessUnitException;
import com.liferay.projects.dashboard.business.unit.model.BusinessUnit;
import com.liferay.projects.dashboard.business.unit.service.BusinessUnitLocalServiceUtil;
import com.liferay.projects.dashboard.business.unit.service.persistence.BusinessUnitPersistence;
import com.liferay.projects.dashboard.business.unit.service.persistence.BusinessUnitUtil;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

import org.junit.runner.RunWith;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * @generated
 */
@RunWith(Arquillian.class)
public class BusinessUnitPersistenceTest {
	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule = new AggregateTestRule(new LiferayIntegrationTestRule(),
			PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(Propagation.REQUIRED));

	@Before
	public void setUp() {
		_persistence = BusinessUnitUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<BusinessUnit> iterator = _businessUnits.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		BusinessUnit businessUnit = _persistence.create(pk);

		Assert.assertNotNull(businessUnit);

		Assert.assertEquals(businessUnit.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		BusinessUnit newBusinessUnit = addBusinessUnit();

		_persistence.remove(newBusinessUnit);

		BusinessUnit existingBusinessUnit = _persistence.fetchByPrimaryKey(newBusinessUnit.getPrimaryKey());

		Assert.assertNull(existingBusinessUnit);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addBusinessUnit();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		BusinessUnit newBusinessUnit = _persistence.create(pk);

		newBusinessUnit.setUuid(RandomTestUtil.randomString());

		newBusinessUnit.setCompanyId(RandomTestUtil.nextLong());

		newBusinessUnit.setUserId(RandomTestUtil.nextLong());

		newBusinessUnit.setUserName(RandomTestUtil.randomString());

		newBusinessUnit.setCreateDate(RandomTestUtil.nextDate());

		newBusinessUnit.setModifiedDate(RandomTestUtil.nextDate());

		newBusinessUnit.setName(RandomTestUtil.randomString());

		_businessUnits.add(_persistence.update(newBusinessUnit));

		BusinessUnit existingBusinessUnit = _persistence.findByPrimaryKey(newBusinessUnit.getPrimaryKey());

		Assert.assertEquals(existingBusinessUnit.getUuid(),
			newBusinessUnit.getUuid());
		Assert.assertEquals(existingBusinessUnit.getBusinessUnitId(),
			newBusinessUnit.getBusinessUnitId());
		Assert.assertEquals(existingBusinessUnit.getCompanyId(),
			newBusinessUnit.getCompanyId());
		Assert.assertEquals(existingBusinessUnit.getUserId(),
			newBusinessUnit.getUserId());
		Assert.assertEquals(existingBusinessUnit.getUserName(),
			newBusinessUnit.getUserName());
		Assert.assertEquals(Time.getShortTimestamp(
				existingBusinessUnit.getCreateDate()),
			Time.getShortTimestamp(newBusinessUnit.getCreateDate()));
		Assert.assertEquals(Time.getShortTimestamp(
				existingBusinessUnit.getModifiedDate()),
			Time.getShortTimestamp(newBusinessUnit.getModifiedDate()));
		Assert.assertEquals(existingBusinessUnit.getName(),
			newBusinessUnit.getName());
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid(StringPool.BLANK);

		_persistence.countByUuid(StringPool.NULL);

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testCountByUuid_C() throws Exception {
		_persistence.countByUuid_C(StringPool.BLANK, RandomTestUtil.nextLong());

		_persistence.countByUuid_C(StringPool.NULL, 0L);

		_persistence.countByUuid_C((String)null, 0L);
	}

	@Test
	public void testCountByName() throws Exception {
		_persistence.countByName(StringPool.BLANK);

		_persistence.countByName(StringPool.NULL);

		_persistence.countByName((String)null);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		BusinessUnit newBusinessUnit = addBusinessUnit();

		BusinessUnit existingBusinessUnit = _persistence.findByPrimaryKey(newBusinessUnit.getPrimaryKey());

		Assert.assertEquals(existingBusinessUnit, newBusinessUnit);
	}

	@Test(expected = NoSuchBusinessUnitException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			getOrderByComparator());
	}

	protected OrderByComparator<BusinessUnit> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create("PD_BusinessUnit", "uuid",
			true, "businessUnitId", true, "companyId", true, "userId", true,
			"userName", true, "createDate", true, "modifiedDate", true, "name",
			true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		BusinessUnit newBusinessUnit = addBusinessUnit();

		BusinessUnit existingBusinessUnit = _persistence.fetchByPrimaryKey(newBusinessUnit.getPrimaryKey());

		Assert.assertEquals(existingBusinessUnit, newBusinessUnit);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		BusinessUnit missingBusinessUnit = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingBusinessUnit);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {
		BusinessUnit newBusinessUnit1 = addBusinessUnit();
		BusinessUnit newBusinessUnit2 = addBusinessUnit();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newBusinessUnit1.getPrimaryKey());
		primaryKeys.add(newBusinessUnit2.getPrimaryKey());

		Map<Serializable, BusinessUnit> businessUnits = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, businessUnits.size());
		Assert.assertEquals(newBusinessUnit1,
			businessUnits.get(newBusinessUnit1.getPrimaryKey()));
		Assert.assertEquals(newBusinessUnit2,
			businessUnits.get(newBusinessUnit2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {
		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, BusinessUnit> businessUnits = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(businessUnits.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {
		BusinessUnit newBusinessUnit = addBusinessUnit();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newBusinessUnit.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, BusinessUnit> businessUnits = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, businessUnits.size());
		Assert.assertEquals(newBusinessUnit,
			businessUnits.get(newBusinessUnit.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys()
		throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, BusinessUnit> businessUnits = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(businessUnits.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey()
		throws Exception {
		BusinessUnit newBusinessUnit = addBusinessUnit();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newBusinessUnit.getPrimaryKey());

		Map<Serializable, BusinessUnit> businessUnits = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, businessUnits.size());
		Assert.assertEquals(newBusinessUnit,
			businessUnits.get(newBusinessUnit.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery = BusinessUnitLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(new ActionableDynamicQuery.PerformActionMethod<BusinessUnit>() {
				@Override
				public void performAction(BusinessUnit businessUnit) {
					Assert.assertNotNull(businessUnit);

					count.increment();
				}
			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting()
		throws Exception {
		BusinessUnit newBusinessUnit = addBusinessUnit();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(BusinessUnit.class,
				_dynamicQueryClassLoader);

		dynamicQuery.add(RestrictionsFactoryUtil.eq("businessUnitId",
				newBusinessUnit.getBusinessUnitId()));

		List<BusinessUnit> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		BusinessUnit existingBusinessUnit = result.get(0);

		Assert.assertEquals(existingBusinessUnit, newBusinessUnit);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(BusinessUnit.class,
				_dynamicQueryClassLoader);

		dynamicQuery.add(RestrictionsFactoryUtil.eq("businessUnitId",
				RandomTestUtil.nextLong()));

		List<BusinessUnit> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting()
		throws Exception {
		BusinessUnit newBusinessUnit = addBusinessUnit();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(BusinessUnit.class,
				_dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property(
				"businessUnitId"));

		Object newBusinessUnitId = newBusinessUnit.getBusinessUnitId();

		dynamicQuery.add(RestrictionsFactoryUtil.in("businessUnitId",
				new Object[] { newBusinessUnitId }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingBusinessUnitId = result.get(0);

		Assert.assertEquals(existingBusinessUnitId, newBusinessUnitId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(BusinessUnit.class,
				_dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property(
				"businessUnitId"));

		dynamicQuery.add(RestrictionsFactoryUtil.in("businessUnitId",
				new Object[] { RandomTestUtil.nextLong() }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testResetOriginalValues() throws Exception {
		BusinessUnit newBusinessUnit = addBusinessUnit();

		_persistence.clearCache();

		BusinessUnit existingBusinessUnit = _persistence.findByPrimaryKey(newBusinessUnit.getPrimaryKey());

		Assert.assertTrue(Objects.equals(existingBusinessUnit.getName(),
				ReflectionTestUtil.invoke(existingBusinessUnit,
					"getOriginalName", new Class<?>[0])));
	}

	protected BusinessUnit addBusinessUnit() throws Exception {
		long pk = RandomTestUtil.nextLong();

		BusinessUnit businessUnit = _persistence.create(pk);

		businessUnit.setUuid(RandomTestUtil.randomString());

		businessUnit.setCompanyId(RandomTestUtil.nextLong());

		businessUnit.setUserId(RandomTestUtil.nextLong());

		businessUnit.setUserName(RandomTestUtil.randomString());

		businessUnit.setCreateDate(RandomTestUtil.nextDate());

		businessUnit.setModifiedDate(RandomTestUtil.nextDate());

		businessUnit.setName(RandomTestUtil.randomString());

		_businessUnits.add(_persistence.update(businessUnit));

		return businessUnit;
	}

	private List<BusinessUnit> _businessUnits = new ArrayList<BusinessUnit>();
	private BusinessUnitPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;
}
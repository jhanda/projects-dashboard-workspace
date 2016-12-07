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

import com.liferay.projects.dashboard.business.unit.exception.NoSuchProjectBUException;
import com.liferay.projects.dashboard.business.unit.model.ProjectBU;
import com.liferay.projects.dashboard.business.unit.service.ProjectBULocalServiceUtil;
import com.liferay.projects.dashboard.business.unit.service.persistence.ProjectBUPersistence;
import com.liferay.projects.dashboard.business.unit.service.persistence.ProjectBUUtil;

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
import java.util.Set;

/**
 * @generated
 */
@RunWith(Arquillian.class)
public class ProjectBUPersistenceTest {
	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule = new AggregateTestRule(new LiferayIntegrationTestRule(),
			PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(Propagation.REQUIRED));

	@Before
	public void setUp() {
		_persistence = ProjectBUUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<ProjectBU> iterator = _projectBUs.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		ProjectBU projectBU = _persistence.create(pk);

		Assert.assertNotNull(projectBU);

		Assert.assertEquals(projectBU.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		ProjectBU newProjectBU = addProjectBU();

		_persistence.remove(newProjectBU);

		ProjectBU existingProjectBU = _persistence.fetchByPrimaryKey(newProjectBU.getPrimaryKey());

		Assert.assertNull(existingProjectBU);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addProjectBU();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		ProjectBU newProjectBU = _persistence.create(pk);

		newProjectBU.setUuid(RandomTestUtil.randomString());

		newProjectBU.setCompanyId(RandomTestUtil.nextLong());

		newProjectBU.setUserId(RandomTestUtil.nextLong());

		newProjectBU.setUserName(RandomTestUtil.randomString());

		newProjectBU.setCreateDate(RandomTestUtil.nextDate());

		newProjectBU.setModifiedDate(RandomTestUtil.nextDate());

		newProjectBU.setBusinessUnitId(RandomTestUtil.nextLong());

		newProjectBU.setProjectId(RandomTestUtil.nextLong());

		newProjectBU.setType(RandomTestUtil.randomString());

		_projectBUs.add(_persistence.update(newProjectBU));

		ProjectBU existingProjectBU = _persistence.findByPrimaryKey(newProjectBU.getPrimaryKey());

		Assert.assertEquals(existingProjectBU.getUuid(), newProjectBU.getUuid());
		Assert.assertEquals(existingProjectBU.getProjectBUId(),
			newProjectBU.getProjectBUId());
		Assert.assertEquals(existingProjectBU.getCompanyId(),
			newProjectBU.getCompanyId());
		Assert.assertEquals(existingProjectBU.getUserId(),
			newProjectBU.getUserId());
		Assert.assertEquals(existingProjectBU.getUserName(),
			newProjectBU.getUserName());
		Assert.assertEquals(Time.getShortTimestamp(
				existingProjectBU.getCreateDate()),
			Time.getShortTimestamp(newProjectBU.getCreateDate()));
		Assert.assertEquals(Time.getShortTimestamp(
				existingProjectBU.getModifiedDate()),
			Time.getShortTimestamp(newProjectBU.getModifiedDate()));
		Assert.assertEquals(existingProjectBU.getBusinessUnitId(),
			newProjectBU.getBusinessUnitId());
		Assert.assertEquals(existingProjectBU.getProjectId(),
			newProjectBU.getProjectId());
		Assert.assertEquals(existingProjectBU.getType(), newProjectBU.getType());
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
	public void testCountByType() throws Exception {
		_persistence.countByType(StringPool.BLANK);

		_persistence.countByType(StringPool.NULL);

		_persistence.countByType((String)null);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		ProjectBU newProjectBU = addProjectBU();

		ProjectBU existingProjectBU = _persistence.findByPrimaryKey(newProjectBU.getPrimaryKey());

		Assert.assertEquals(existingProjectBU, newProjectBU);
	}

	@Test(expected = NoSuchProjectBUException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			getOrderByComparator());
	}

	protected OrderByComparator<ProjectBU> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create("PD_ProjectBU", "uuid",
			true, "projectBUId", true, "companyId", true, "userId", true,
			"userName", true, "createDate", true, "modifiedDate", true,
			"businessUnitId", true, "projectId", true, "type", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		ProjectBU newProjectBU = addProjectBU();

		ProjectBU existingProjectBU = _persistence.fetchByPrimaryKey(newProjectBU.getPrimaryKey());

		Assert.assertEquals(existingProjectBU, newProjectBU);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		ProjectBU missingProjectBU = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingProjectBU);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {
		ProjectBU newProjectBU1 = addProjectBU();
		ProjectBU newProjectBU2 = addProjectBU();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newProjectBU1.getPrimaryKey());
		primaryKeys.add(newProjectBU2.getPrimaryKey());

		Map<Serializable, ProjectBU> projectBUs = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, projectBUs.size());
		Assert.assertEquals(newProjectBU1,
			projectBUs.get(newProjectBU1.getPrimaryKey()));
		Assert.assertEquals(newProjectBU2,
			projectBUs.get(newProjectBU2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {
		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, ProjectBU> projectBUs = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(projectBUs.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {
		ProjectBU newProjectBU = addProjectBU();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newProjectBU.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, ProjectBU> projectBUs = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, projectBUs.size());
		Assert.assertEquals(newProjectBU,
			projectBUs.get(newProjectBU.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys()
		throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, ProjectBU> projectBUs = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(projectBUs.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey()
		throws Exception {
		ProjectBU newProjectBU = addProjectBU();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newProjectBU.getPrimaryKey());

		Map<Serializable, ProjectBU> projectBUs = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, projectBUs.size());
		Assert.assertEquals(newProjectBU,
			projectBUs.get(newProjectBU.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery = ProjectBULocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(new ActionableDynamicQuery.PerformActionMethod<ProjectBU>() {
				@Override
				public void performAction(ProjectBU projectBU) {
					Assert.assertNotNull(projectBU);

					count.increment();
				}
			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting()
		throws Exception {
		ProjectBU newProjectBU = addProjectBU();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(ProjectBU.class,
				_dynamicQueryClassLoader);

		dynamicQuery.add(RestrictionsFactoryUtil.eq("projectBUId",
				newProjectBU.getProjectBUId()));

		List<ProjectBU> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		ProjectBU existingProjectBU = result.get(0);

		Assert.assertEquals(existingProjectBU, newProjectBU);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(ProjectBU.class,
				_dynamicQueryClassLoader);

		dynamicQuery.add(RestrictionsFactoryUtil.eq("projectBUId",
				RandomTestUtil.nextLong()));

		List<ProjectBU> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting()
		throws Exception {
		ProjectBU newProjectBU = addProjectBU();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(ProjectBU.class,
				_dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("projectBUId"));

		Object newProjectBUId = newProjectBU.getProjectBUId();

		dynamicQuery.add(RestrictionsFactoryUtil.in("projectBUId",
				new Object[] { newProjectBUId }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingProjectBUId = result.get(0);

		Assert.assertEquals(existingProjectBUId, newProjectBUId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(ProjectBU.class,
				_dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("projectBUId"));

		dynamicQuery.add(RestrictionsFactoryUtil.in("projectBUId",
				new Object[] { RandomTestUtil.nextLong() }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected ProjectBU addProjectBU() throws Exception {
		long pk = RandomTestUtil.nextLong();

		ProjectBU projectBU = _persistence.create(pk);

		projectBU.setUuid(RandomTestUtil.randomString());

		projectBU.setCompanyId(RandomTestUtil.nextLong());

		projectBU.setUserId(RandomTestUtil.nextLong());

		projectBU.setUserName(RandomTestUtil.randomString());

		projectBU.setCreateDate(RandomTestUtil.nextDate());

		projectBU.setModifiedDate(RandomTestUtil.nextDate());

		projectBU.setBusinessUnitId(RandomTestUtil.nextLong());

		projectBU.setProjectId(RandomTestUtil.nextLong());

		projectBU.setType(RandomTestUtil.randomString());

		_projectBUs.add(_persistence.update(projectBU));

		return projectBU;
	}

	private List<ProjectBU> _projectBUs = new ArrayList<ProjectBU>();
	private ProjectBUPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;
}
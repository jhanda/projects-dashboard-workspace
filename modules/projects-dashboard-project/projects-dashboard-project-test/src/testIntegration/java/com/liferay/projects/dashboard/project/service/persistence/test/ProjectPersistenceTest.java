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

package com.liferay.projects.dashboard.project.service.persistence.test;

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

import com.liferay.projects.dashboard.project.exception.NoSuchProjectException;
import com.liferay.projects.dashboard.project.model.Project;
import com.liferay.projects.dashboard.project.service.ProjectLocalServiceUtil;
import com.liferay.projects.dashboard.project.service.persistence.ProjectPersistence;
import com.liferay.projects.dashboard.project.service.persistence.ProjectUtil;

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
public class ProjectPersistenceTest {
	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule = new AggregateTestRule(new LiferayIntegrationTestRule(),
			PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(Propagation.REQUIRED));

	@Before
	public void setUp() {
		_persistence = ProjectUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Project> iterator = _projects.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Project project = _persistence.create(pk);

		Assert.assertNotNull(project);

		Assert.assertEquals(project.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Project newProject = addProject();

		_persistence.remove(newProject);

		Project existingProject = _persistence.fetchByPrimaryKey(newProject.getPrimaryKey());

		Assert.assertNull(existingProject);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addProject();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Project newProject = _persistence.create(pk);

		newProject.setUuid(RandomTestUtil.randomString());

		newProject.setCompanyId(RandomTestUtil.nextLong());

		newProject.setUserId(RandomTestUtil.nextLong());

		newProject.setUserName(RandomTestUtil.randomString());

		newProject.setCreateDate(RandomTestUtil.nextDate());

		newProject.setModifiedDate(RandomTestUtil.nextDate());

		newProject.setBusinessUnitId(RandomTestUtil.nextLong());

		newProject.setName(RandomTestUtil.randomString());

		newProject.setDescription(RandomTestUtil.randomString());

		newProject.setPriority(RandomTestUtil.nextInt());

		newProject.setHealth(RandomTestUtil.nextInt());

		newProject.setExpectedStartDate(RandomTestUtil.nextDate());

		newProject.setExpectedEndDate(RandomTestUtil.nextDate());

		newProject.setActualStartDate(RandomTestUtil.nextDate());

		newProject.setActualEndDate(RandomTestUtil.nextDate());

		newProject.setStatus(RandomTestUtil.nextInt());

		_projects.add(_persistence.update(newProject));

		Project existingProject = _persistence.findByPrimaryKey(newProject.getPrimaryKey());

		Assert.assertEquals(existingProject.getUuid(), newProject.getUuid());
		Assert.assertEquals(existingProject.getProjectId(),
			newProject.getProjectId());
		Assert.assertEquals(existingProject.getCompanyId(),
			newProject.getCompanyId());
		Assert.assertEquals(existingProject.getUserId(), newProject.getUserId());
		Assert.assertEquals(existingProject.getUserName(),
			newProject.getUserName());
		Assert.assertEquals(Time.getShortTimestamp(
				existingProject.getCreateDate()),
			Time.getShortTimestamp(newProject.getCreateDate()));
		Assert.assertEquals(Time.getShortTimestamp(
				existingProject.getModifiedDate()),
			Time.getShortTimestamp(newProject.getModifiedDate()));
		Assert.assertEquals(existingProject.getBusinessUnitId(),
			newProject.getBusinessUnitId());
		Assert.assertEquals(existingProject.getName(), newProject.getName());
		Assert.assertEquals(existingProject.getDescription(),
			newProject.getDescription());
		Assert.assertEquals(existingProject.getPriority(),
			newProject.getPriority());
		Assert.assertEquals(existingProject.getHealth(), newProject.getHealth());
		Assert.assertEquals(Time.getShortTimestamp(
				existingProject.getExpectedStartDate()),
			Time.getShortTimestamp(newProject.getExpectedStartDate()));
		Assert.assertEquals(Time.getShortTimestamp(
				existingProject.getExpectedEndDate()),
			Time.getShortTimestamp(newProject.getExpectedEndDate()));
		Assert.assertEquals(Time.getShortTimestamp(
				existingProject.getActualStartDate()),
			Time.getShortTimestamp(newProject.getActualStartDate()));
		Assert.assertEquals(Time.getShortTimestamp(
				existingProject.getActualEndDate()),
			Time.getShortTimestamp(newProject.getActualEndDate()));
		Assert.assertEquals(existingProject.getStatus(), newProject.getStatus());
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
	public void testCountByStatus() throws Exception {
		_persistence.countByStatus(RandomTestUtil.nextInt());

		_persistence.countByStatus(0);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Project newProject = addProject();

		Project existingProject = _persistence.findByPrimaryKey(newProject.getPrimaryKey());

		Assert.assertEquals(existingProject, newProject);
	}

	@Test(expected = NoSuchProjectException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			getOrderByComparator());
	}

	protected OrderByComparator<Project> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create("PD_Project", "uuid", true,
			"projectId", true, "companyId", true, "userId", true, "userName",
			true, "createDate", true, "modifiedDate", true, "businessUnitId",
			true, "name", true, "description", true, "priority", true,
			"health", true, "expectedStartDate", true, "expectedEndDate", true,
			"actualStartDate", true, "actualEndDate", true, "status", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Project newProject = addProject();

		Project existingProject = _persistence.fetchByPrimaryKey(newProject.getPrimaryKey());

		Assert.assertEquals(existingProject, newProject);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Project missingProject = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingProject);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {
		Project newProject1 = addProject();
		Project newProject2 = addProject();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newProject1.getPrimaryKey());
		primaryKeys.add(newProject2.getPrimaryKey());

		Map<Serializable, Project> projects = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, projects.size());
		Assert.assertEquals(newProject1,
			projects.get(newProject1.getPrimaryKey()));
		Assert.assertEquals(newProject2,
			projects.get(newProject2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {
		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Project> projects = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(projects.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {
		Project newProject = addProject();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newProject.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Project> projects = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, projects.size());
		Assert.assertEquals(newProject, projects.get(newProject.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys()
		throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Project> projects = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(projects.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey()
		throws Exception {
		Project newProject = addProject();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newProject.getPrimaryKey());

		Map<Serializable, Project> projects = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, projects.size());
		Assert.assertEquals(newProject, projects.get(newProject.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery = ProjectLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(new ActionableDynamicQuery.PerformActionMethod<Project>() {
				@Override
				public void performAction(Project project) {
					Assert.assertNotNull(project);

					count.increment();
				}
			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting()
		throws Exception {
		Project newProject = addProject();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Project.class,
				_dynamicQueryClassLoader);

		dynamicQuery.add(RestrictionsFactoryUtil.eq("projectId",
				newProject.getProjectId()));

		List<Project> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Project existingProject = result.get(0);

		Assert.assertEquals(existingProject, newProject);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Project.class,
				_dynamicQueryClassLoader);

		dynamicQuery.add(RestrictionsFactoryUtil.eq("projectId",
				RandomTestUtil.nextLong()));

		List<Project> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting()
		throws Exception {
		Project newProject = addProject();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Project.class,
				_dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("projectId"));

		Object newProjectId = newProject.getProjectId();

		dynamicQuery.add(RestrictionsFactoryUtil.in("projectId",
				new Object[] { newProjectId }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingProjectId = result.get(0);

		Assert.assertEquals(existingProjectId, newProjectId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Project.class,
				_dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("projectId"));

		dynamicQuery.add(RestrictionsFactoryUtil.in("projectId",
				new Object[] { RandomTestUtil.nextLong() }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected Project addProject() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Project project = _persistence.create(pk);

		project.setUuid(RandomTestUtil.randomString());

		project.setCompanyId(RandomTestUtil.nextLong());

		project.setUserId(RandomTestUtil.nextLong());

		project.setUserName(RandomTestUtil.randomString());

		project.setCreateDate(RandomTestUtil.nextDate());

		project.setModifiedDate(RandomTestUtil.nextDate());

		project.setBusinessUnitId(RandomTestUtil.nextLong());

		project.setName(RandomTestUtil.randomString());

		project.setDescription(RandomTestUtil.randomString());

		project.setPriority(RandomTestUtil.nextInt());

		project.setHealth(RandomTestUtil.nextInt());

		project.setExpectedStartDate(RandomTestUtil.nextDate());

		project.setExpectedEndDate(RandomTestUtil.nextDate());

		project.setActualStartDate(RandomTestUtil.nextDate());

		project.setActualEndDate(RandomTestUtil.nextDate());

		project.setStatus(RandomTestUtil.nextInt());

		_projects.add(_persistence.update(project));

		return project;
	}

	private List<Project> _projects = new ArrayList<Project>();
	private ProjectPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;
}
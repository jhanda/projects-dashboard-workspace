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

package com.liferay.projects.dashboard.problem.service.persistence.test;

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
import com.liferay.portal.kernel.util.Time;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.test.rule.PersistenceTestRule;
import com.liferay.portal.test.rule.TransactionalTestRule;

import com.liferay.projects.dashboard.problem.exception.NoSuchProblemException;
import com.liferay.projects.dashboard.problem.model.Problem;
import com.liferay.projects.dashboard.problem.service.ProblemLocalServiceUtil;
import com.liferay.projects.dashboard.problem.service.persistence.ProblemPersistence;
import com.liferay.projects.dashboard.problem.service.persistence.ProblemUtil;

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
public class ProblemPersistenceTest {
	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule = new AggregateTestRule(new LiferayIntegrationTestRule(),
			PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(Propagation.REQUIRED));

	@Before
	public void setUp() {
		_persistence = ProblemUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Problem> iterator = _problems.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Problem problem = _persistence.create(pk);

		Assert.assertNotNull(problem);

		Assert.assertEquals(problem.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Problem newProblem = addProblem();

		_persistence.remove(newProblem);

		Problem existingProblem = _persistence.fetchByPrimaryKey(newProblem.getPrimaryKey());

		Assert.assertNull(existingProblem);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addProblem();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Problem newProblem = _persistence.create(pk);

		newProblem.setCompanyId(RandomTestUtil.nextLong());

		newProblem.setUserId(RandomTestUtil.nextLong());

		newProblem.setUserName(RandomTestUtil.randomString());

		newProblem.setCreateDate(RandomTestUtil.nextDate());

		newProblem.setModifiedDate(RandomTestUtil.nextDate());

		newProblem.setProjectId(RandomTestUtil.nextLong());

		newProblem.setType(RandomTestUtil.nextInt());

		newProblem.setDescription(RandomTestUtil.randomString());

		newProblem.setStatus(RandomTestUtil.nextInt());

		newProblem.setStatusDate(RandomTestUtil.nextDate());

		_problems.add(_persistence.update(newProblem));

		Problem existingProblem = _persistence.findByPrimaryKey(newProblem.getPrimaryKey());

		Assert.assertEquals(existingProblem.getProblemId(),
			newProblem.getProblemId());
		Assert.assertEquals(existingProblem.getCompanyId(),
			newProblem.getCompanyId());
		Assert.assertEquals(existingProblem.getUserId(), newProblem.getUserId());
		Assert.assertEquals(existingProblem.getUserName(),
			newProblem.getUserName());
		Assert.assertEquals(Time.getShortTimestamp(
				existingProblem.getCreateDate()),
			Time.getShortTimestamp(newProblem.getCreateDate()));
		Assert.assertEquals(Time.getShortTimestamp(
				existingProblem.getModifiedDate()),
			Time.getShortTimestamp(newProblem.getModifiedDate()));
		Assert.assertEquals(existingProblem.getProjectId(),
			newProblem.getProjectId());
		Assert.assertEquals(existingProblem.getType(), newProblem.getType());
		Assert.assertEquals(existingProblem.getDescription(),
			newProblem.getDescription());
		Assert.assertEquals(existingProblem.getStatus(), newProblem.getStatus());
		Assert.assertEquals(Time.getShortTimestamp(
				existingProblem.getStatusDate()),
			Time.getShortTimestamp(newProblem.getStatusDate()));
	}

	@Test
	public void testCountByprojectId() throws Exception {
		_persistence.countByprojectId(RandomTestUtil.nextLong());

		_persistence.countByprojectId(0L);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Problem newProblem = addProblem();

		Problem existingProblem = _persistence.findByPrimaryKey(newProblem.getPrimaryKey());

		Assert.assertEquals(existingProblem, newProblem);
	}

	@Test(expected = NoSuchProblemException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			getOrderByComparator());
	}

	protected OrderByComparator<Problem> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create("PD_Problem", "problemId",
			true, "companyId", true, "userId", true, "userName", true,
			"createDate", true, "modifiedDate", true, "projectId", true,
			"type", true, "description", true, "status", true, "statusDate",
			true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Problem newProblem = addProblem();

		Problem existingProblem = _persistence.fetchByPrimaryKey(newProblem.getPrimaryKey());

		Assert.assertEquals(existingProblem, newProblem);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Problem missingProblem = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingProblem);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {
		Problem newProblem1 = addProblem();
		Problem newProblem2 = addProblem();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newProblem1.getPrimaryKey());
		primaryKeys.add(newProblem2.getPrimaryKey());

		Map<Serializable, Problem> problems = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, problems.size());
		Assert.assertEquals(newProblem1,
			problems.get(newProblem1.getPrimaryKey()));
		Assert.assertEquals(newProblem2,
			problems.get(newProblem2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {
		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Problem> problems = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(problems.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {
		Problem newProblem = addProblem();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newProblem.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Problem> problems = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, problems.size());
		Assert.assertEquals(newProblem, problems.get(newProblem.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys()
		throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Problem> problems = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(problems.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey()
		throws Exception {
		Problem newProblem = addProblem();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newProblem.getPrimaryKey());

		Map<Serializable, Problem> problems = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, problems.size());
		Assert.assertEquals(newProblem, problems.get(newProblem.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery = ProblemLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(new ActionableDynamicQuery.PerformActionMethod<Problem>() {
				@Override
				public void performAction(Problem problem) {
					Assert.assertNotNull(problem);

					count.increment();
				}
			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting()
		throws Exception {
		Problem newProblem = addProblem();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Problem.class,
				_dynamicQueryClassLoader);

		dynamicQuery.add(RestrictionsFactoryUtil.eq("problemId",
				newProblem.getProblemId()));

		List<Problem> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Problem existingProblem = result.get(0);

		Assert.assertEquals(existingProblem, newProblem);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Problem.class,
				_dynamicQueryClassLoader);

		dynamicQuery.add(RestrictionsFactoryUtil.eq("problemId",
				RandomTestUtil.nextLong()));

		List<Problem> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting()
		throws Exception {
		Problem newProblem = addProblem();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Problem.class,
				_dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("problemId"));

		Object newProblemId = newProblem.getProblemId();

		dynamicQuery.add(RestrictionsFactoryUtil.in("problemId",
				new Object[] { newProblemId }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingProblemId = result.get(0);

		Assert.assertEquals(existingProblemId, newProblemId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Problem.class,
				_dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("problemId"));

		dynamicQuery.add(RestrictionsFactoryUtil.in("problemId",
				new Object[] { RandomTestUtil.nextLong() }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected Problem addProblem() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Problem problem = _persistence.create(pk);

		problem.setCompanyId(RandomTestUtil.nextLong());

		problem.setUserId(RandomTestUtil.nextLong());

		problem.setUserName(RandomTestUtil.randomString());

		problem.setCreateDate(RandomTestUtil.nextDate());

		problem.setModifiedDate(RandomTestUtil.nextDate());

		problem.setProjectId(RandomTestUtil.nextLong());

		problem.setType(RandomTestUtil.nextInt());

		problem.setDescription(RandomTestUtil.randomString());

		problem.setStatus(RandomTestUtil.nextInt());

		problem.setStatusDate(RandomTestUtil.nextDate());

		_problems.add(_persistence.update(problem));

		return problem;
	}

	private List<Problem> _problems = new ArrayList<Problem>();
	private ProblemPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;
}
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

package com.liferay.projects.dashboard.problem.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.liferay.projects.dashboard.problem.exception.NoSuchProblemException;
import com.liferay.projects.dashboard.problem.model.Problem;

/**
 * The persistence interface for the problem service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Howie Chou
 * @see com.liferay.projects.dashboard.problem.service.persistence.impl.ProblemPersistenceImpl
 * @see ProblemUtil
 * @generated
 */
@ProviderType
public interface ProblemPersistence extends BasePersistence<Problem> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProblemUtil} to access the problem persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the problems where projectId = &#63;.
	*
	* @param projectId the project ID
	* @return the matching problems
	*/
	public java.util.List<Problem> findByprojectId(long projectId);

	/**
	* Returns a range of all the problems where projectId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProblemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param projectId the project ID
	* @param start the lower bound of the range of problems
	* @param end the upper bound of the range of problems (not inclusive)
	* @return the range of matching problems
	*/
	public java.util.List<Problem> findByprojectId(long projectId, int start,
		int end);

	/**
	* Returns an ordered range of all the problems where projectId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProblemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param projectId the project ID
	* @param start the lower bound of the range of problems
	* @param end the upper bound of the range of problems (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching problems
	*/
	public java.util.List<Problem> findByprojectId(long projectId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Problem> orderByComparator);

	/**
	* Returns an ordered range of all the problems where projectId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProblemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param projectId the project ID
	* @param start the lower bound of the range of problems
	* @param end the upper bound of the range of problems (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching problems
	*/
	public java.util.List<Problem> findByprojectId(long projectId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Problem> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first problem in the ordered set where projectId = &#63;.
	*
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching problem
	* @throws NoSuchProblemException if a matching problem could not be found
	*/
	public Problem findByprojectId_First(long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<Problem> orderByComparator)
		throws NoSuchProblemException;

	/**
	* Returns the first problem in the ordered set where projectId = &#63;.
	*
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching problem, or <code>null</code> if a matching problem could not be found
	*/
	public Problem fetchByprojectId_First(long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<Problem> orderByComparator);

	/**
	* Returns the last problem in the ordered set where projectId = &#63;.
	*
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching problem
	* @throws NoSuchProblemException if a matching problem could not be found
	*/
	public Problem findByprojectId_Last(long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<Problem> orderByComparator)
		throws NoSuchProblemException;

	/**
	* Returns the last problem in the ordered set where projectId = &#63;.
	*
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching problem, or <code>null</code> if a matching problem could not be found
	*/
	public Problem fetchByprojectId_Last(long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<Problem> orderByComparator);

	/**
	* Returns the problems before and after the current problem in the ordered set where projectId = &#63;.
	*
	* @param problemId the primary key of the current problem
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next problem
	* @throws NoSuchProblemException if a problem with the primary key could not be found
	*/
	public Problem[] findByprojectId_PrevAndNext(long problemId,
		long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<Problem> orderByComparator)
		throws NoSuchProblemException;

	/**
	* Removes all the problems where projectId = &#63; from the database.
	*
	* @param projectId the project ID
	*/
	public void removeByprojectId(long projectId);

	/**
	* Returns the number of problems where projectId = &#63;.
	*
	* @param projectId the project ID
	* @return the number of matching problems
	*/
	public int countByprojectId(long projectId);

	/**
	* Caches the problem in the entity cache if it is enabled.
	*
	* @param problem the problem
	*/
	public void cacheResult(Problem problem);

	/**
	* Caches the problems in the entity cache if it is enabled.
	*
	* @param problems the problems
	*/
	public void cacheResult(java.util.List<Problem> problems);

	/**
	* Creates a new problem with the primary key. Does not add the problem to the database.
	*
	* @param problemId the primary key for the new problem
	* @return the new problem
	*/
	public Problem create(long problemId);

	/**
	* Removes the problem with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param problemId the primary key of the problem
	* @return the problem that was removed
	* @throws NoSuchProblemException if a problem with the primary key could not be found
	*/
	public Problem remove(long problemId) throws NoSuchProblemException;

	public Problem updateImpl(Problem problem);

	/**
	* Returns the problem with the primary key or throws a {@link NoSuchProblemException} if it could not be found.
	*
	* @param problemId the primary key of the problem
	* @return the problem
	* @throws NoSuchProblemException if a problem with the primary key could not be found
	*/
	public Problem findByPrimaryKey(long problemId)
		throws NoSuchProblemException;

	/**
	* Returns the problem with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param problemId the primary key of the problem
	* @return the problem, or <code>null</code> if a problem with the primary key could not be found
	*/
	public Problem fetchByPrimaryKey(long problemId);

	@Override
	public java.util.Map<java.io.Serializable, Problem> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the problems.
	*
	* @return the problems
	*/
	public java.util.List<Problem> findAll();

	/**
	* Returns a range of all the problems.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProblemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of problems
	* @param end the upper bound of the range of problems (not inclusive)
	* @return the range of problems
	*/
	public java.util.List<Problem> findAll(int start, int end);

	/**
	* Returns an ordered range of all the problems.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProblemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of problems
	* @param end the upper bound of the range of problems (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of problems
	*/
	public java.util.List<Problem> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Problem> orderByComparator);

	/**
	* Returns an ordered range of all the problems.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProblemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of problems
	* @param end the upper bound of the range of problems (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of problems
	*/
	public java.util.List<Problem> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Problem> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the problems from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of problems.
	*
	* @return the number of problems
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}
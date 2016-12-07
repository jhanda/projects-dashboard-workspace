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

package com.liferay.projects.dashboard.problem.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Problem}.
 * </p>
 *
 * @author Howie Chou
 * @see Problem
 * @generated
 */
@ProviderType
public class ProblemWrapper implements Problem, ModelWrapper<Problem> {
	public ProblemWrapper(Problem problem) {
		_problem = problem;
	}

	@Override
	public Class<?> getModelClass() {
		return Problem.class;
	}

	@Override
	public String getModelClassName() {
		return Problem.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("problemId", getProblemId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("projectId", getProjectId());
		attributes.put("type", getType());
		attributes.put("description", getDescription());
		attributes.put("status", getStatus());
		attributes.put("statusDate", getStatusDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long problemId = (Long)attributes.get("problemId");

		if (problemId != null) {
			setProblemId(problemId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long projectId = (Long)attributes.get("projectId");

		if (projectId != null) {
			setProjectId(projectId);
		}

		Integer type = (Integer)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}
	}

	@Override
	public Problem toEscapedModel() {
		return new ProblemWrapper(_problem.toEscapedModel());
	}

	@Override
	public Problem toUnescapedModel() {
		return new ProblemWrapper(_problem.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _problem.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _problem.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _problem.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _problem.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Problem> toCacheModel() {
		return _problem.toCacheModel();
	}

	@Override
	public int compareTo(Problem problem) {
		return _problem.compareTo(problem);
	}

	/**
	* Returns the status of this problem.
	*
	* @return the status of this problem
	*/
	@Override
	public int getStatus() {
		return _problem.getStatus();
	}

	/**
	* Returns the type of this problem.
	*
	* @return the type of this problem
	*/
	@Override
	public int getType() {
		return _problem.getType();
	}

	@Override
	public int hashCode() {
		return _problem.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _problem.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ProblemWrapper((Problem)_problem.clone());
	}

	/**
	* Returns the description of this problem.
	*
	* @return the description of this problem
	*/
	@Override
	public java.lang.String getDescription() {
		return _problem.getDescription();
	}

	/**
	* Returns the user name of this problem.
	*
	* @return the user name of this problem
	*/
	@Override
	public java.lang.String getUserName() {
		return _problem.getUserName();
	}

	/**
	* Returns the user uuid of this problem.
	*
	* @return the user uuid of this problem
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _problem.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _problem.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _problem.toXmlString();
	}

	/**
	* Returns the create date of this problem.
	*
	* @return the create date of this problem
	*/
	@Override
	public Date getCreateDate() {
		return _problem.getCreateDate();
	}

	/**
	* Returns the modified date of this problem.
	*
	* @return the modified date of this problem
	*/
	@Override
	public Date getModifiedDate() {
		return _problem.getModifiedDate();
	}

	/**
	* Returns the status date of this problem.
	*
	* @return the status date of this problem
	*/
	@Override
	public Date getStatusDate() {
		return _problem.getStatusDate();
	}

	/**
	* Returns the company ID of this problem.
	*
	* @return the company ID of this problem
	*/
	@Override
	public long getCompanyId() {
		return _problem.getCompanyId();
	}

	/**
	* Returns the primary key of this problem.
	*
	* @return the primary key of this problem
	*/
	@Override
	public long getPrimaryKey() {
		return _problem.getPrimaryKey();
	}

	/**
	* Returns the problem ID of this problem.
	*
	* @return the problem ID of this problem
	*/
	@Override
	public long getProblemId() {
		return _problem.getProblemId();
	}

	/**
	* Returns the project ID of this problem.
	*
	* @return the project ID of this problem
	*/
	@Override
	public long getProjectId() {
		return _problem.getProjectId();
	}

	/**
	* Returns the user ID of this problem.
	*
	* @return the user ID of this problem
	*/
	@Override
	public long getUserId() {
		return _problem.getUserId();
	}

	@Override
	public void persist() {
		_problem.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_problem.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this problem.
	*
	* @param companyId the company ID of this problem
	*/
	@Override
	public void setCompanyId(long companyId) {
		_problem.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this problem.
	*
	* @param createDate the create date of this problem
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_problem.setCreateDate(createDate);
	}

	/**
	* Sets the description of this problem.
	*
	* @param description the description of this problem
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_problem.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_problem.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_problem.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_problem.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the modified date of this problem.
	*
	* @param modifiedDate the modified date of this problem
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_problem.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_problem.setNew(n);
	}

	/**
	* Sets the primary key of this problem.
	*
	* @param primaryKey the primary key of this problem
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_problem.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_problem.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the problem ID of this problem.
	*
	* @param problemId the problem ID of this problem
	*/
	@Override
	public void setProblemId(long problemId) {
		_problem.setProblemId(problemId);
	}

	/**
	* Sets the project ID of this problem.
	*
	* @param projectId the project ID of this problem
	*/
	@Override
	public void setProjectId(long projectId) {
		_problem.setProjectId(projectId);
	}

	/**
	* Sets the status of this problem.
	*
	* @param status the status of this problem
	*/
	@Override
	public void setStatus(int status) {
		_problem.setStatus(status);
	}

	/**
	* Sets the status date of this problem.
	*
	* @param statusDate the status date of this problem
	*/
	@Override
	public void setStatusDate(Date statusDate) {
		_problem.setStatusDate(statusDate);
	}

	/**
	* Sets the type of this problem.
	*
	* @param type the type of this problem
	*/
	@Override
	public void setType(int type) {
		_problem.setType(type);
	}

	/**
	* Sets the user ID of this problem.
	*
	* @param userId the user ID of this problem
	*/
	@Override
	public void setUserId(long userId) {
		_problem.setUserId(userId);
	}

	/**
	* Sets the user name of this problem.
	*
	* @param userName the user name of this problem
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_problem.setUserName(userName);
	}

	/**
	* Sets the user uuid of this problem.
	*
	* @param userUuid the user uuid of this problem
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_problem.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProblemWrapper)) {
			return false;
		}

		ProblemWrapper problemWrapper = (ProblemWrapper)obj;

		if (Objects.equals(_problem, problemWrapper._problem)) {
			return true;
		}

		return false;
	}

	@Override
	public Problem getWrappedModel() {
		return _problem;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _problem.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _problem.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_problem.resetOriginalValues();
	}

	private final Problem _problem;
}
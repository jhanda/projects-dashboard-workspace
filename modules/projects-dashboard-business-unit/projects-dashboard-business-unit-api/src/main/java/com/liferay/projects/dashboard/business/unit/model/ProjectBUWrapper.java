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

package com.liferay.projects.dashboard.business.unit.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link ProjectBU}.
 * </p>
 *
 * @author Yury Butrymovich
 * @see ProjectBU
 * @generated
 */
@ProviderType
public class ProjectBUWrapper implements ProjectBU, ModelWrapper<ProjectBU> {
	public ProjectBUWrapper(ProjectBU projectBU) {
		_projectBU = projectBU;
	}

	@Override
	public Class<?> getModelClass() {
		return ProjectBU.class;
	}

	@Override
	public String getModelClassName() {
		return ProjectBU.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("projectBUId", getProjectBUId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("businessUnitId", getBusinessUnitId());
		attributes.put("projectId", getProjectId());
		attributes.put("type", getType());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long projectBUId = (Long)attributes.get("projectBUId");

		if (projectBUId != null) {
			setProjectBUId(projectBUId);
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

		Long businessUnitId = (Long)attributes.get("businessUnitId");

		if (businessUnitId != null) {
			setBusinessUnitId(businessUnitId);
		}

		Long projectId = (Long)attributes.get("projectId");

		if (projectId != null) {
			setProjectId(projectId);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}
	}

	@Override
	public ProjectBU toEscapedModel() {
		return new ProjectBUWrapper(_projectBU.toEscapedModel());
	}

	@Override
	public ProjectBU toUnescapedModel() {
		return new ProjectBUWrapper(_projectBU.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _projectBU.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _projectBU.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _projectBU.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _projectBU.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ProjectBU> toCacheModel() {
		return _projectBU.toCacheModel();
	}

	@Override
	public int compareTo(ProjectBU projectBU) {
		return _projectBU.compareTo(projectBU);
	}

	@Override
	public int hashCode() {
		return _projectBU.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _projectBU.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ProjectBUWrapper((ProjectBU)_projectBU.clone());
	}

	/**
	* Returns the type of this project b u.
	*
	* @return the type of this project b u
	*/
	@Override
	public java.lang.String getType() {
		return _projectBU.getType();
	}

	/**
	* Returns the user name of this project b u.
	*
	* @return the user name of this project b u
	*/
	@Override
	public java.lang.String getUserName() {
		return _projectBU.getUserName();
	}

	/**
	* Returns the user uuid of this project b u.
	*
	* @return the user uuid of this project b u
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _projectBU.getUserUuid();
	}

	/**
	* Returns the uuid of this project b u.
	*
	* @return the uuid of this project b u
	*/
	@Override
	public java.lang.String getUuid() {
		return _projectBU.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _projectBU.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _projectBU.toXmlString();
	}

	/**
	* Returns the create date of this project b u.
	*
	* @return the create date of this project b u
	*/
	@Override
	public Date getCreateDate() {
		return _projectBU.getCreateDate();
	}

	/**
	* Returns the modified date of this project b u.
	*
	* @return the modified date of this project b u
	*/
	@Override
	public Date getModifiedDate() {
		return _projectBU.getModifiedDate();
	}

	/**
	* Returns the business unit ID of this project b u.
	*
	* @return the business unit ID of this project b u
	*/
	@Override
	public long getBusinessUnitId() {
		return _projectBU.getBusinessUnitId();
	}

	/**
	* Returns the company ID of this project b u.
	*
	* @return the company ID of this project b u
	*/
	@Override
	public long getCompanyId() {
		return _projectBU.getCompanyId();
	}

	/**
	* Returns the primary key of this project b u.
	*
	* @return the primary key of this project b u
	*/
	@Override
	public long getPrimaryKey() {
		return _projectBU.getPrimaryKey();
	}

	/**
	* Returns the project b u ID of this project b u.
	*
	* @return the project b u ID of this project b u
	*/
	@Override
	public long getProjectBUId() {
		return _projectBU.getProjectBUId();
	}

	/**
	* Returns the project ID of this project b u.
	*
	* @return the project ID of this project b u
	*/
	@Override
	public long getProjectId() {
		return _projectBU.getProjectId();
	}

	/**
	* Returns the user ID of this project b u.
	*
	* @return the user ID of this project b u
	*/
	@Override
	public long getUserId() {
		return _projectBU.getUserId();
	}

	@Override
	public void persist() {
		_projectBU.persist();
	}

	/**
	* Sets the business unit ID of this project b u.
	*
	* @param businessUnitId the business unit ID of this project b u
	*/
	@Override
	public void setBusinessUnitId(long businessUnitId) {
		_projectBU.setBusinessUnitId(businessUnitId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_projectBU.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this project b u.
	*
	* @param companyId the company ID of this project b u
	*/
	@Override
	public void setCompanyId(long companyId) {
		_projectBU.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this project b u.
	*
	* @param createDate the create date of this project b u
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_projectBU.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_projectBU.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_projectBU.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_projectBU.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the modified date of this project b u.
	*
	* @param modifiedDate the modified date of this project b u
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_projectBU.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_projectBU.setNew(n);
	}

	/**
	* Sets the primary key of this project b u.
	*
	* @param primaryKey the primary key of this project b u
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_projectBU.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_projectBU.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the project b u ID of this project b u.
	*
	* @param projectBUId the project b u ID of this project b u
	*/
	@Override
	public void setProjectBUId(long projectBUId) {
		_projectBU.setProjectBUId(projectBUId);
	}

	/**
	* Sets the project ID of this project b u.
	*
	* @param projectId the project ID of this project b u
	*/
	@Override
	public void setProjectId(long projectId) {
		_projectBU.setProjectId(projectId);
	}

	/**
	* Sets the type of this project b u.
	*
	* @param type the type of this project b u
	*/
	@Override
	public void setType(java.lang.String type) {
		_projectBU.setType(type);
	}

	/**
	* Sets the user ID of this project b u.
	*
	* @param userId the user ID of this project b u
	*/
	@Override
	public void setUserId(long userId) {
		_projectBU.setUserId(userId);
	}

	/**
	* Sets the user name of this project b u.
	*
	* @param userName the user name of this project b u
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_projectBU.setUserName(userName);
	}

	/**
	* Sets the user uuid of this project b u.
	*
	* @param userUuid the user uuid of this project b u
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_projectBU.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this project b u.
	*
	* @param uuid the uuid of this project b u
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_projectBU.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProjectBUWrapper)) {
			return false;
		}

		ProjectBUWrapper projectBUWrapper = (ProjectBUWrapper)obj;

		if (Objects.equals(_projectBU, projectBUWrapper._projectBU)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _projectBU.getStagedModelType();
	}

	@Override
	public ProjectBU getWrappedModel() {
		return _projectBU;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _projectBU.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _projectBU.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_projectBU.resetOriginalValues();
	}

	private final ProjectBU _projectBU;
}
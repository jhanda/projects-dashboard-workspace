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

package com.liferay.projects.dashboard.project.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Project service. Represents a row in the &quot;PD_Project&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.projects.dashboard.project.model.impl.ProjectModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.projects.dashboard.project.model.impl.ProjectImpl}.
 * </p>
 *
 * @author Ryan Park
 * @see Project
 * @see com.liferay.projects.dashboard.project.model.impl.ProjectImpl
 * @see com.liferay.projects.dashboard.project.model.impl.ProjectModelImpl
 * @generated
 */
@ProviderType
public interface ProjectModel extends BaseModel<Project>, ShardedModel,
	StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a project model instance should use the {@link Project} interface instead.
	 */

	/**
	 * Returns the primary key of this project.
	 *
	 * @return the primary key of this project
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this project.
	 *
	 * @param primaryKey the primary key of this project
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this project.
	 *
	 * @return the uuid of this project
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this project.
	 *
	 * @param uuid the uuid of this project
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the project ID of this project.
	 *
	 * @return the project ID of this project
	 */
	public long getProjectId();

	/**
	 * Sets the project ID of this project.
	 *
	 * @param projectId the project ID of this project
	 */
	public void setProjectId(long projectId);

	/**
	 * Returns the company ID of this project.
	 *
	 * @return the company ID of this project
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this project.
	 *
	 * @param companyId the company ID of this project
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this project.
	 *
	 * @return the user ID of this project
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this project.
	 *
	 * @param userId the user ID of this project
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this project.
	 *
	 * @return the user uuid of this project
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this project.
	 *
	 * @param userUuid the user uuid of this project
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this project.
	 *
	 * @return the user name of this project
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this project.
	 *
	 * @param userName the user name of this project
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this project.
	 *
	 * @return the create date of this project
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this project.
	 *
	 * @param createDate the create date of this project
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this project.
	 *
	 * @return the modified date of this project
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this project.
	 *
	 * @param modifiedDate the modified date of this project
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the business unit ID of this project.
	 *
	 * @return the business unit ID of this project
	 */
	public long getBusinessUnitId();

	/**
	 * Sets the business unit ID of this project.
	 *
	 * @param businessUnitId the business unit ID of this project
	 */
	public void setBusinessUnitId(long businessUnitId);

	/**
	 * Returns the name of this project.
	 *
	 * @return the name of this project
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this project.
	 *
	 * @param name the name of this project
	 */
	public void setName(String name);

	/**
	 * Returns the description of this project.
	 *
	 * @return the description of this project
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this project.
	 *
	 * @param description the description of this project
	 */
	public void setDescription(String description);

	/**
	 * Returns the priority of this project.
	 *
	 * @return the priority of this project
	 */
	public int getPriority();

	/**
	 * Sets the priority of this project.
	 *
	 * @param priority the priority of this project
	 */
	public void setPriority(int priority);

	/**
	 * Returns the health of this project.
	 *
	 * @return the health of this project
	 */
	public int getHealth();

	/**
	 * Sets the health of this project.
	 *
	 * @param health the health of this project
	 */
	public void setHealth(int health);

	/**
	 * Returns the expected start date of this project.
	 *
	 * @return the expected start date of this project
	 */
	public Date getExpectedStartDate();

	/**
	 * Sets the expected start date of this project.
	 *
	 * @param expectedStartDate the expected start date of this project
	 */
	public void setExpectedStartDate(Date expectedStartDate);

	/**
	 * Returns the expected end date of this project.
	 *
	 * @return the expected end date of this project
	 */
	public Date getExpectedEndDate();

	/**
	 * Sets the expected end date of this project.
	 *
	 * @param expectedEndDate the expected end date of this project
	 */
	public void setExpectedEndDate(Date expectedEndDate);

	/**
	 * Returns the actual start date of this project.
	 *
	 * @return the actual start date of this project
	 */
	public Date getActualStartDate();

	/**
	 * Sets the actual start date of this project.
	 *
	 * @param actualStartDate the actual start date of this project
	 */
	public void setActualStartDate(Date actualStartDate);

	/**
	 * Returns the actual end date of this project.
	 *
	 * @return the actual end date of this project
	 */
	public Date getActualEndDate();

	/**
	 * Sets the actual end date of this project.
	 *
	 * @param actualEndDate the actual end date of this project
	 */
	public void setActualEndDate(Date actualEndDate);

	/**
	 * Returns the status of this project.
	 *
	 * @return the status of this project
	 */
	public int getStatus();

	/**
	 * Sets the status of this project.
	 *
	 * @param status the status of this project
	 */
	public void setStatus(int status);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Project project);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Project> toCacheModel();

	@Override
	public Project toEscapedModel();

	@Override
	public Project toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
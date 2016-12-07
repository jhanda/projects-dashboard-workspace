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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Yury Butrymovich
 * @generated
 */
@ProviderType
public class ProjectBUSoap implements Serializable {
	public static ProjectBUSoap toSoapModel(ProjectBU model) {
		ProjectBUSoap soapModel = new ProjectBUSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setProjectBUId(model.getProjectBUId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setBusinessUnitId(model.getBusinessUnitId());
		soapModel.setProjectId(model.getProjectId());
		soapModel.setType(model.getType());

		return soapModel;
	}

	public static ProjectBUSoap[] toSoapModels(ProjectBU[] models) {
		ProjectBUSoap[] soapModels = new ProjectBUSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ProjectBUSoap[][] toSoapModels(ProjectBU[][] models) {
		ProjectBUSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ProjectBUSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ProjectBUSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ProjectBUSoap[] toSoapModels(List<ProjectBU> models) {
		List<ProjectBUSoap> soapModels = new ArrayList<ProjectBUSoap>(models.size());

		for (ProjectBU model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ProjectBUSoap[soapModels.size()]);
	}

	public ProjectBUSoap() {
	}

	public long getPrimaryKey() {
		return _projectBUId;
	}

	public void setPrimaryKey(long pk) {
		setProjectBUId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getProjectBUId() {
		return _projectBUId;
	}

	public void setProjectBUId(long projectBUId) {
		_projectBUId = projectBUId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getBusinessUnitId() {
		return _businessUnitId;
	}

	public void setBusinessUnitId(long businessUnitId) {
		_businessUnitId = businessUnitId;
	}

	public long getProjectId() {
		return _projectId;
	}

	public void setProjectId(long projectId) {
		_projectId = projectId;
	}

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;
	}

	private String _uuid;
	private long _projectBUId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _businessUnitId;
	private long _projectId;
	private String _type;
}
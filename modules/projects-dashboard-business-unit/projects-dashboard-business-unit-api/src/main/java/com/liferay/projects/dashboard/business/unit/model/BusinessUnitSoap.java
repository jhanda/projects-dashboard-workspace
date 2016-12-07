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
public class BusinessUnitSoap implements Serializable {
	public static BusinessUnitSoap toSoapModel(BusinessUnit model) {
		BusinessUnitSoap soapModel = new BusinessUnitSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setBusinessUnitId(model.getBusinessUnitId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());

		return soapModel;
	}

	public static BusinessUnitSoap[] toSoapModels(BusinessUnit[] models) {
		BusinessUnitSoap[] soapModels = new BusinessUnitSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BusinessUnitSoap[][] toSoapModels(BusinessUnit[][] models) {
		BusinessUnitSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BusinessUnitSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BusinessUnitSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BusinessUnitSoap[] toSoapModels(List<BusinessUnit> models) {
		List<BusinessUnitSoap> soapModels = new ArrayList<BusinessUnitSoap>(models.size());

		for (BusinessUnit model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BusinessUnitSoap[soapModels.size()]);
	}

	public BusinessUnitSoap() {
	}

	public long getPrimaryKey() {
		return _businessUnitId;
	}

	public void setPrimaryKey(long pk) {
		setBusinessUnitId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getBusinessUnitId() {
		return _businessUnitId;
	}

	public void setBusinessUnitId(long businessUnitId) {
		_businessUnitId = businessUnitId;
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

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	private String _uuid;
	private long _businessUnitId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
}
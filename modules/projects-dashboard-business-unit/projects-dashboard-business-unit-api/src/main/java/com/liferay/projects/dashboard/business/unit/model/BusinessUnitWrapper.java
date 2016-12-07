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
 * This class is a wrapper for {@link BusinessUnit}.
 * </p>
 *
 * @author Yury Butrymovich
 * @see BusinessUnit
 * @generated
 */
@ProviderType
public class BusinessUnitWrapper implements BusinessUnit,
	ModelWrapper<BusinessUnit> {
	public BusinessUnitWrapper(BusinessUnit businessUnit) {
		_businessUnit = businessUnit;
	}

	@Override
	public Class<?> getModelClass() {
		return BusinessUnit.class;
	}

	@Override
	public String getModelClassName() {
		return BusinessUnit.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("businessUnitId", getBusinessUnitId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long businessUnitId = (Long)attributes.get("businessUnitId");

		if (businessUnitId != null) {
			setBusinessUnitId(businessUnitId);
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}
	}

	@Override
	public BusinessUnit toEscapedModel() {
		return new BusinessUnitWrapper(_businessUnit.toEscapedModel());
	}

	@Override
	public BusinessUnit toUnescapedModel() {
		return new BusinessUnitWrapper(_businessUnit.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _businessUnit.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _businessUnit.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _businessUnit.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _businessUnit.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<BusinessUnit> toCacheModel() {
		return _businessUnit.toCacheModel();
	}

	@Override
	public int compareTo(BusinessUnit businessUnit) {
		return _businessUnit.compareTo(businessUnit);
	}

	@Override
	public int hashCode() {
		return _businessUnit.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _businessUnit.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new BusinessUnitWrapper((BusinessUnit)_businessUnit.clone());
	}

	/**
	* Returns the name of this business unit.
	*
	* @return the name of this business unit
	*/
	@Override
	public java.lang.String getName() {
		return _businessUnit.getName();
	}

	/**
	* Returns the user name of this business unit.
	*
	* @return the user name of this business unit
	*/
	@Override
	public java.lang.String getUserName() {
		return _businessUnit.getUserName();
	}

	/**
	* Returns the user uuid of this business unit.
	*
	* @return the user uuid of this business unit
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _businessUnit.getUserUuid();
	}

	/**
	* Returns the uuid of this business unit.
	*
	* @return the uuid of this business unit
	*/
	@Override
	public java.lang.String getUuid() {
		return _businessUnit.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _businessUnit.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _businessUnit.toXmlString();
	}

	/**
	* Returns the create date of this business unit.
	*
	* @return the create date of this business unit
	*/
	@Override
	public Date getCreateDate() {
		return _businessUnit.getCreateDate();
	}

	/**
	* Returns the modified date of this business unit.
	*
	* @return the modified date of this business unit
	*/
	@Override
	public Date getModifiedDate() {
		return _businessUnit.getModifiedDate();
	}

	/**
	* Returns the business unit ID of this business unit.
	*
	* @return the business unit ID of this business unit
	*/
	@Override
	public long getBusinessUnitId() {
		return _businessUnit.getBusinessUnitId();
	}

	/**
	* Returns the company ID of this business unit.
	*
	* @return the company ID of this business unit
	*/
	@Override
	public long getCompanyId() {
		return _businessUnit.getCompanyId();
	}

	/**
	* Returns the primary key of this business unit.
	*
	* @return the primary key of this business unit
	*/
	@Override
	public long getPrimaryKey() {
		return _businessUnit.getPrimaryKey();
	}

	/**
	* Returns the user ID of this business unit.
	*
	* @return the user ID of this business unit
	*/
	@Override
	public long getUserId() {
		return _businessUnit.getUserId();
	}

	@Override
	public void persist() {
		_businessUnit.persist();
	}

	/**
	* Sets the business unit ID of this business unit.
	*
	* @param businessUnitId the business unit ID of this business unit
	*/
	@Override
	public void setBusinessUnitId(long businessUnitId) {
		_businessUnit.setBusinessUnitId(businessUnitId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_businessUnit.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this business unit.
	*
	* @param companyId the company ID of this business unit
	*/
	@Override
	public void setCompanyId(long companyId) {
		_businessUnit.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this business unit.
	*
	* @param createDate the create date of this business unit
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_businessUnit.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_businessUnit.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_businessUnit.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_businessUnit.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the modified date of this business unit.
	*
	* @param modifiedDate the modified date of this business unit
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_businessUnit.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this business unit.
	*
	* @param name the name of this business unit
	*/
	@Override
	public void setName(java.lang.String name) {
		_businessUnit.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_businessUnit.setNew(n);
	}

	/**
	* Sets the primary key of this business unit.
	*
	* @param primaryKey the primary key of this business unit
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_businessUnit.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_businessUnit.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this business unit.
	*
	* @param userId the user ID of this business unit
	*/
	@Override
	public void setUserId(long userId) {
		_businessUnit.setUserId(userId);
	}

	/**
	* Sets the user name of this business unit.
	*
	* @param userName the user name of this business unit
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_businessUnit.setUserName(userName);
	}

	/**
	* Sets the user uuid of this business unit.
	*
	* @param userUuid the user uuid of this business unit
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_businessUnit.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this business unit.
	*
	* @param uuid the uuid of this business unit
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_businessUnit.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BusinessUnitWrapper)) {
			return false;
		}

		BusinessUnitWrapper businessUnitWrapper = (BusinessUnitWrapper)obj;

		if (Objects.equals(_businessUnit, businessUnitWrapper._businessUnit)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _businessUnit.getStagedModelType();
	}

	@Override
	public BusinessUnit getWrappedModel() {
		return _businessUnit;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _businessUnit.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _businessUnit.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_businessUnit.resetOriginalValues();
	}

	private final BusinessUnit _businessUnit;
}
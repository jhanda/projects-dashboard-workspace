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

package com.liferay.projects.dashboard.business.unit.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.liferay.projects.dashboard.business.unit.model.BusinessUnit;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing BusinessUnit in entity cache.
 *
 * @author Yury Butrymovich
 * @see BusinessUnit
 * @generated
 */
@ProviderType
public class BusinessUnitCacheModel implements CacheModel<BusinessUnit>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BusinessUnitCacheModel)) {
			return false;
		}

		BusinessUnitCacheModel businessUnitCacheModel = (BusinessUnitCacheModel)obj;

		if (businessUnitId == businessUnitCacheModel.businessUnitId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, businessUnitId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", businessUnitId=");
		sb.append(businessUnitId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public BusinessUnit toEntityModel() {
		BusinessUnitImpl businessUnitImpl = new BusinessUnitImpl();

		if (uuid == null) {
			businessUnitImpl.setUuid(StringPool.BLANK);
		}
		else {
			businessUnitImpl.setUuid(uuid);
		}

		businessUnitImpl.setBusinessUnitId(businessUnitId);
		businessUnitImpl.setCompanyId(companyId);
		businessUnitImpl.setUserId(userId);

		if (userName == null) {
			businessUnitImpl.setUserName(StringPool.BLANK);
		}
		else {
			businessUnitImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			businessUnitImpl.setCreateDate(null);
		}
		else {
			businessUnitImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			businessUnitImpl.setModifiedDate(null);
		}
		else {
			businessUnitImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			businessUnitImpl.setName(StringPool.BLANK);
		}
		else {
			businessUnitImpl.setName(name);
		}

		businessUnitImpl.resetOriginalValues();

		return businessUnitImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		businessUnitId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(businessUnitId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}
	}

	public String uuid;
	public long businessUnitId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
}
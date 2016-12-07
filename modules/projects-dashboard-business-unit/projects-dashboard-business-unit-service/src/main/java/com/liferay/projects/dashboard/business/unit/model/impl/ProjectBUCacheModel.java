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

import com.liferay.projects.dashboard.business.unit.model.ProjectBU;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ProjectBU in entity cache.
 *
 * @author Yury Butrymovich
 * @see ProjectBU
 * @generated
 */
@ProviderType
public class ProjectBUCacheModel implements CacheModel<ProjectBU>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProjectBUCacheModel)) {
			return false;
		}

		ProjectBUCacheModel projectBUCacheModel = (ProjectBUCacheModel)obj;

		if (projectBUId == projectBUCacheModel.projectBUId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, projectBUId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", projectBUId=");
		sb.append(projectBUId);
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
		sb.append(", businessUnitId=");
		sb.append(businessUnitId);
		sb.append(", projectId=");
		sb.append(projectId);
		sb.append(", type=");
		sb.append(type);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ProjectBU toEntityModel() {
		ProjectBUImpl projectBUImpl = new ProjectBUImpl();

		if (uuid == null) {
			projectBUImpl.setUuid(StringPool.BLANK);
		}
		else {
			projectBUImpl.setUuid(uuid);
		}

		projectBUImpl.setProjectBUId(projectBUId);
		projectBUImpl.setCompanyId(companyId);
		projectBUImpl.setUserId(userId);

		if (userName == null) {
			projectBUImpl.setUserName(StringPool.BLANK);
		}
		else {
			projectBUImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			projectBUImpl.setCreateDate(null);
		}
		else {
			projectBUImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			projectBUImpl.setModifiedDate(null);
		}
		else {
			projectBUImpl.setModifiedDate(new Date(modifiedDate));
		}

		projectBUImpl.setBusinessUnitId(businessUnitId);
		projectBUImpl.setProjectId(projectId);

		if (type == null) {
			projectBUImpl.setType(StringPool.BLANK);
		}
		else {
			projectBUImpl.setType(type);
		}

		projectBUImpl.resetOriginalValues();

		return projectBUImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		projectBUId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		businessUnitId = objectInput.readLong();

		projectId = objectInput.readLong();
		type = objectInput.readUTF();
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

		objectOutput.writeLong(projectBUId);

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

		objectOutput.writeLong(businessUnitId);

		objectOutput.writeLong(projectId);

		if (type == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(type);
		}
	}

	public String uuid;
	public long projectBUId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long businessUnitId;
	public long projectId;
	public String type;
}
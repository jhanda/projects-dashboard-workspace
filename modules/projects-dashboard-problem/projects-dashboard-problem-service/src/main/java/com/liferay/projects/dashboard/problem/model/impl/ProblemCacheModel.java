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

package com.liferay.projects.dashboard.problem.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.liferay.projects.dashboard.problem.model.Problem;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Problem in entity cache.
 *
 * @author Howie Chou
 * @see Problem
 * @generated
 */
@ProviderType
public class ProblemCacheModel implements CacheModel<Problem>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProblemCacheModel)) {
			return false;
		}

		ProblemCacheModel problemCacheModel = (ProblemCacheModel)obj;

		if (problemId == problemCacheModel.problemId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, problemId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{problemId=");
		sb.append(problemId);
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
		sb.append(", projectId=");
		sb.append(projectId);
		sb.append(", type=");
		sb.append(type);
		sb.append(", description=");
		sb.append(description);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Problem toEntityModel() {
		ProblemImpl problemImpl = new ProblemImpl();

		problemImpl.setProblemId(problemId);
		problemImpl.setCompanyId(companyId);
		problemImpl.setUserId(userId);

		if (userName == null) {
			problemImpl.setUserName(StringPool.BLANK);
		}
		else {
			problemImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			problemImpl.setCreateDate(null);
		}
		else {
			problemImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			problemImpl.setModifiedDate(null);
		}
		else {
			problemImpl.setModifiedDate(new Date(modifiedDate));
		}

		problemImpl.setProjectId(projectId);
		problemImpl.setType(type);

		if (description == null) {
			problemImpl.setDescription(StringPool.BLANK);
		}
		else {
			problemImpl.setDescription(description);
		}

		problemImpl.setStatus(status);

		if (statusDate == Long.MIN_VALUE) {
			problemImpl.setStatusDate(null);
		}
		else {
			problemImpl.setStatusDate(new Date(statusDate));
		}

		problemImpl.resetOriginalValues();

		return problemImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		problemId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		projectId = objectInput.readLong();

		type = objectInput.readInt();
		description = objectInput.readUTF();

		status = objectInput.readInt();
		statusDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(problemId);

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

		objectOutput.writeLong(projectId);

		objectOutput.writeInt(type);

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeInt(status);
		objectOutput.writeLong(statusDate);
	}

	public long problemId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long projectId;
	public int type;
	public String description;
	public int status;
	public long statusDate;
}
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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Problem service. Represents a row in the &quot;PD_Problem&quot; database table, with each column mapped to a property of this class.
 *
 * @author Howie Chou
 * @see ProblemModel
 * @see com.liferay.projects.dashboard.problem.model.impl.ProblemImpl
 * @see com.liferay.projects.dashboard.problem.model.impl.ProblemModelImpl
 * @generated
 */
@ImplementationClassName("com.liferay.projects.dashboard.problem.model.impl.ProblemImpl")
@ProviderType
public interface Problem extends ProblemModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.liferay.projects.dashboard.problem.model.impl.ProblemImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Problem, Long> PROBLEM_ID_ACCESSOR = new Accessor<Problem, Long>() {
			@Override
			public Long get(Problem problem) {
				return problem.getProblemId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Problem> getTypeClass() {
				return Problem.class;
			}
		};
}
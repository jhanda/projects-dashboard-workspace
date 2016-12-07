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
package com.liferay.projects.dashboard.project.constants;

/**
 * @author Ryan Park
 */
public class ProjectPriorityConstants {

	public static final int CRITICAL = 3;

	public static final int MAJOR = 2;

	public static final int MINOR = 1;

	public static final String CRITICAL_LABEL = "Critical";

	public static final String MAJOR_LABEL = "Major";

	public static final String MINOR_LABEL = "Minor";

	public static String toLabel(int priority) {
		if (priority == CRITICAL) {
			return CRITICAL_LABEL;
		}
		else if (priority == MAJOR) {
			return MAJOR_LABEL;
		}
		else if (priority == MINOR) {
			return MINOR_LABEL;
		}
		else {
			return "";
		}
	}

}
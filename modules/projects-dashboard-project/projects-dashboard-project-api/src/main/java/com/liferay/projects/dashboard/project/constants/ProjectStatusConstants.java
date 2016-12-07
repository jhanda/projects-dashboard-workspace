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
public class ProjectStatusConstants {

	public static final int OPEN = 1;

	public static final int IN_PROGRESS = 2;

	public static final int RELEASED = 3;

	public static final int DISCARDED = 4;

	public static final int ON_HOLD = 5;

	public static final String OPEN_LABEL = "Open";

	public static final String IN_PROGRESS_LABEL = "In Progress";

	public static final String RELEASED_LABEL = "Released";

	public static final String DISCARDED_LABEL = "Discarded";

	public static final String ON_HOLD_LABEL = "On Hold";

	public static String toLabel(int status) {
		if (status == OPEN) {
			return OPEN_LABEL;
		}
		else if (status == IN_PROGRESS) {
			return IN_PROGRESS_LABEL;
		}
		else if (status == RELEASED) {
			return RELEASED_LABEL;
		}
		else if (status == DISCARDED) {
			return DISCARDED_LABEL;
		}
		else if (status == ON_HOLD) {
			return ON_HOLD_LABEL;
		}
		else {
			return "";
		}
	}
}
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
public class ProjectHealthConstants {

	public static final int RED = 3;

	public static final int YELLOW = 2;

	public static final int GREEN = 1;

	public static final String RED_LABEL = "Red";

	public static final String YELLOW_LABEL = "Yellow";

	public static final String GREEN_LABEL = "Green";

	public static String toLabel(int health) {
		if (health == RED) {
			return RED_LABEL;
		}
		else if (health == YELLOW) {
			return YELLOW_LABEL;
		}
		else if (health == GREEN) {
			return GREEN_LABEL;
		}
		else {
			return "";
		}
	}

}
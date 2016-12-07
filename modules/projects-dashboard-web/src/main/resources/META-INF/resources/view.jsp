<%--
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
--%>

<%@ include file="/init.jsp" %>

<%
long businessUnitId = ParamUtil.getLong(request, "businessUnitId", getDefaultBusinessUnitId());

PortletURL portletURL = renderResponse.createRenderURL();

portletURL.setParameter("mvcRenderCommandName", "/view");
%>

<div class="view">
	<div class="container">
		<div class="col-md-3">
			<h3>
				Business Units

				<liferay-portlet:renderURL var="editBusinessUnitURL">
					<portlet:param name="mvcRenderCommandName" value="/edit_business_unit" />
					<portlet:param name="redirect" value="<%= currentURL %>" />
				</liferay-portlet:renderURL>

				<liferay-ui:icon
					cssClass="pull-right"
					iconCssClass="icon-plus-sign"
					message="Add Business Unit"
					url="<%= editBusinessUnitURL %>"
				/>
			</h3>

			<ul class="nav nav-pills nav-stacked">

				<%
				List<BusinessUnit> businessUnits = BusinessUnitLocalServiceUtil.getBusinessUnits(-1, -1);

				for (BusinessUnit businessUnit : businessUnits) {

				%>

					<li<%= (businessUnit.getBusinessUnitId() == businessUnitId) ? " class=\"active\"" : StringPool.BLANK%>>
						<liferay-portlet:renderURL var="viewURL">
							<portlet:param name="mvcRenderCommandName" value="/view" />
							<portlet:param name="businessUnitId" value="<%= String.valueOf(businessUnit.getBusinessUnitId()) %>" />
						</liferay-portlet:renderURL>

						<a href="<%= viewURL %>"><%= businessUnit.getName() %></a>
					</li>

				<%
				}
				%>

			</ul>
		</div>
		<div class="col-md-9">
			<h3>
				Projects

				<liferay-portlet:renderURL var="editProjectURL">
					<portlet:param name="mvcRenderCommandName" value="/edit_project" />
					<portlet:param name="businessUnitId" value="<%= String.valueOf(businessUnitId) %>" />
				</liferay-portlet:renderURL>

				<liferay-ui:icon
					cssClass="pull-right"
					iconCssClass="icon-plus-sign"
					message="Add Project"
					url="<%= editProjectURL %>"
				/>
			</h3>


			<div class="main-content-body">
				<liferay-ui:search-container
					emptyResultsMessage="No Projects"
					id="projects"
					iteratorURL="<%= portletURL %>"
				>
					<liferay-ui:search-container-results>

						<%
						total = ProjectLocalServiceUtil.getProjectsCount();

						searchContainer.setTotal(total);

						results = ProjectLocalServiceUtil.getProjects(searchContainer.getStart(), searchContainer.getEnd());

						searchContainer.setResults(results);
						%>

					</liferay-ui:search-container-results>

					<liferay-ui:search-container-row
						className="com.liferay.projects.dashboard.project.model.Project"
						keyProperty="projectId"
						modelVar="project"
					>
						<liferay-portlet:renderURL varImpl="rowURL">
							<portlet:param name="mvcRenderCommandName" value="/edit_project" />
							<portlet:param name="projectId" value="<%= String.valueOf(project.getProjectId()) %>" />
							<portlet:param name="businessUnitId" value="<%= String.valueOf(project.getBusinessUnitId()) %>" />
						</liferay-portlet:renderURL>

						<liferay-ui:search-container-column-text
							name="!"
						>
							<%= project.getPriority() %>
						</liferay-ui:search-container-column-text>

						<liferay-ui:search-container-column-text
							href="<%= rowURL %>"
							name="Name"
							property="name"
						/>

						<liferay-ui:search-container-column-date
							name="Due Date"
							property="userName"
						/>

						<liferay-ui:search-container-column-text
							name="Status"
						>
							<%= project.getStatus() %>
						</liferay-ui:search-container-column-text>

						<liferay-ui:search-container-column-text
							name="Health"
						>
							<%= project.getHealth() %>
						</liferay-ui:search-container-column-text>
					</liferay-ui:search-container-row>

					<liferay-ui:search-iterator displayStyle="list" markupView="lexicon" />
				</liferay-ui:search-container>
			</div>
		</div>
	</div>
</div>

<%!
protected long getDefaultBusinessUnitId() {
	List<BusinessUnit> businessUnits = BusinessUnitLocalServiceUtil.getBusinessUnits(0, 1);

	if (!businessUnits.isEmpty()) {
		return businessUnits.get(0).getBusinessUnitId();
	}

	return 0;
}
%>
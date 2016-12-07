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
String redirect = ParamUtil.getString(request, "redirect");

long businessUnitId = ParamUtil.getLong(request, "businessUnitId");
long projectId = ParamUtil.getLong(request, "projectId");

Project project = ProjectLocalServiceUtil.fetchProject(projectId);
%>

<div class="edit-project">
	<portlet:actionURL name="/edit_business_unit" var="editProjectURL">
		<portlet:param name="mvcRenderCommandName" value="/edit_business_unit" />
	</portlet:actionURL>


	<aui:form action="<%= editProjectURL %>" method="post" name="fm">
		<aui:input name="redirect" type="hidden" value="<%= redirect %>" />
		<aui:input name="projectId" type="hidden" value="<%= String.valueOf(projectId) %>" />
		<aui:input name="businessUnitId" type="hidden" value="<%= String.valueOf(businessUnitId) %>" />

		<div class="lfr-form-content">
			<aui:model-context bean="<%= project %>" model="<%= Project.class %>" />

			<aui:fieldset-group markupView="lexicon">
				<aui:fieldset label="details">
					<aui:input name="name">
						<aui:validator name="required" />
					</aui:input>

					<aui:input name="description" />

					<aui:input name="priority" />

					<aui:input name="expectedStartDate" />
					<aui:input name="expectedEndDate" />

					<aui:input name="actualStartDate" />
					<aui:input name="actualEndDate" />

					<aui:input name="health" />

					<aui:input name="status" />

				</aui:fieldset>
			</aui:fieldset-group>
		</div>

		<aui:button-row>
			<aui:button cssClass="btn-lg" type="submit" />

			<aui:button cssClass="btn-lg" href="<%= redirect %>" type="cancel" />
		</aui:button-row>
	</aui:form>
</div>
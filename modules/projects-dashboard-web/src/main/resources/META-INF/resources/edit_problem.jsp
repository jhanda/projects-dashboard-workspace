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

long projectId = ParamUtil.getLong(request, "projectId");
long problemId = ParamUtil.getLong(request, "problemId");

Problem problem = ProblemLocalServiceUtil.fetchProblem(problemId);
%>
<div class="edit-problem">
	<portlet:actionURL name="/edit_problem" var="editProblemURL">
		<portlet:param name="mvcRenderCommandName" value="/edit_problem" />
	</portlet:actionURL>

	<aui:form action="<%= editProblemURL %>" method="post" name="fm">
		<aui:input name="redirect" type="hidden" value="<%= redirect %>" />
		<aui:input name="problemId" type="hidden" value="<%= String.valueOf(problemId) %>" />
		<aui:input name="projectId" type="hidden" value="<%= String.valueOf(projectId) %>" />

		<div class="lfr-form-content">
			<aui:model-context bean="<%= problem %>" model="<%= Problem.class %>" />

			<aui:fieldset-group markupView="lexicon">
				<aui:fieldset label="details">
					<aui:input name="type" />

					<aui:input name="description" />

					<aui:input name="status" />
					
					<aui:input name="statusDate" />
				</aui:fieldset>
			</aui:fieldset-group>
		</div>

		<aui:button-row>
			<aui:button cssClass="btn-lg" type="submit" />

			<aui:button cssClass="btn-lg" href="<%= redirect %>" type="cancel" />
		</aui:button-row>
	</aui:form>
</div>
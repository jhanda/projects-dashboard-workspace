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

BusinessUnit businessUnit = BusinessUnitLocalServiceUtil.fetchBusinessUnit(businessUnitId);

%>

<div class="edit-business-unit">
	<portlet:actionURL name="/edit_business_unit" var="editBusinessUnitURL">
		<portlet:param name="mvcRenderCommandName" value="/edit_business_unit" />
	</portlet:actionURL>


	<aui:form action="<%= editBusinessUnitURL %>" method="post" name="fm">
		<aui:input name="redirect" type="hidden" value="<%= redirect %>" />
		<aui:input name="businessUnitId" type="hidden" value="<%= businessUnitId %>" />

		<div class="lfr-form-content">
			<aui:model-context bean="<%= businessUnit %>" model="<%= BusinessUnit.class %>" />

			<aui:fieldset-group markupView="lexicon">
				<aui:fieldset label="details">
					<aui:input name="name">
						<aui:validator name="required" />
					</aui:input>
				</aui:fieldset>
			</aui:fieldset-group>
		</div>

		<aui:button-row>
			<aui:button cssClass="btn-lg" type="submit" />

			<aui:button cssClass="btn-lg" href="<%= redirect %>" type="cancel" />
		</aui:button-row>
	</aui:form>
</div>
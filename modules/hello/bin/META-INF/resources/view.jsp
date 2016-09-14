<%@ include file="init.jsp" %>

<p>
	<b><liferay-ui:message key="hello_Hellomvcportlet.caption"/></b>
	<br>
	<br>
	<portlet:renderURL var="myUrl">
		<portlet:param name="jspPage" value="/toView.jsp" /> 	
		<portlet:param name="myName" value="Mr Robot" /> 		
	</portlet:renderURL>
	<portlet:renderURL var="studentForm">
		<portlet:param name="jspPage" value="/studentForm.jsp" /> 	
	</portlet:renderURL>
	
	<portlet:actionURL name="saveURL" var="test"></portlet:actionURL>
	<portlet:actionURL name="showTable" var="formTable"></portlet:actionURL>
	
	
	<aui:a href="<%=myUrl%>"><liferay-ui:message key="clickme.caption"></liferay-ui:message></aui:a>
	<br/>
	<aui:a href="<%=studentForm%>"><liferay-ui:message key="addstudent.caption"></liferay-ui:message></aui:a>
	
	<br/>
	<aui:form method="post" action="<%=test%>">
			<aui:input name="name" type="text" />
			<aui:input name="password" type="password" />
			<aui:button type="submit" value="save" />
	</aui:form>
	<br>
	<aui:button onClick="<%=formTable%>" value="showmytable.caption"/>
	
</p>
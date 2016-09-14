<%@ include file="init.jsp" %>
<portlet:renderURL var="goBack">
	<portlet:param name="goBack" value="/view.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="addStudent" var="addStudent"></portlet:actionURL>
<aui:form method="post" action="<%=addStudent%>">
			<aui:input name="firstName" type="text" />
			<aui:input name="lastName" type="text" />
			<aui:button type="submit" value="save" />
</aui:form>



<aui:a href="<%=goBack%>">GoBack</aui:a>
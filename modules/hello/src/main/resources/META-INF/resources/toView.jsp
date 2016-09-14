<%@ include file="init.jsp" %>
<portlet:renderURL var="goBack">
	<portlet:param name="goBack" value="/view.jsp"/>
</portlet:renderURL>

<p>Yow Friend ,Your param is: <span>${param.myName}!</span></p>


<aui:a href="<%=goBack%>">GoBack</aui:a>
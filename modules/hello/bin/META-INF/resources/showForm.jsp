<%@ include file="init.jsp" %>
<portlet:renderURL var="goBack">
	<portlet:param name="goBack" value="/view.jsp"/>
</portlet:renderURL>

<p>Greetings Message :	${greetings}</p>
<br/>
<p>Your username is : <span>${param.name}</span>.</p>
<p>Your pass is : <span>${param.password}</span>. </p>

<aui:a href="<%=goBack%>">GoBack</aui:a>
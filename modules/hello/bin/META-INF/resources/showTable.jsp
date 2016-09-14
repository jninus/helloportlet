<%@ include file="init.jsp" %>
<portlet:renderURL var="goBack">
	<portlet:param name="goBack" value="/view.jsp"/>
</portlet:renderURL>

<aui:col width="<%= 20 %>" >YoooBroo |</aui:col>
<aui:col width="<%= 80 %>" >
<table>
    <tr>
        <th>ID</th>
        <th>Theme</th>
    </tr>
    <c:forEach items="${themeList}" var="theme" varStatus="status">
        <tr>
            <td>${theme.id}</td>
            <td>${theme.theme}</td>
        </tr>
    </c:forEach>
</table>

</aui:col>



<aui:a href="<%=goBack%>">GoBack</aui:a>
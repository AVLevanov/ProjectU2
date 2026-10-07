<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="head.jsp"%>
<body>
<c:forEach var="quest" items="${requestScope.quests}">
    <h1> ${quest.name}</h1>
    <p> ${quest.description}</p>
</c:forEach>

</body>

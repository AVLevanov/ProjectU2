
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="head.jsp" %>

<a>СТАТИСТИКА</a>

<table class="table">
    <tr>
        <th>Пользователь</th>
        <th>В процессе</th>
        <th>Победа</th>
        <th>Поражение</th>
        <th>Всего</th>
    </tr>
    <c:forEach var="User" items="${requestScope.stat.keySet()}">
        <tr>
            <td>${User.login}</td>
            <td>${requestScope.stat.get(User).get(0)}</td>
            <td>${requestScope.stat.get(User).get(1)}</td>
            <td>${requestScope.stat.get(User).get(2)}</td>
            <td>${requestScope.stat.get(User).get(3)}</td>
        </tr>
    </c:forEach>
</table>

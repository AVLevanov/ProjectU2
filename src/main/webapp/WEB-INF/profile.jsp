<%--
  Created by IntelliJ IDEA.
  User: alevanov
  Date: 03.10.2026
  Time: 19:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="head.jsp" %>
<html>
<body>

<h1>PROFILE</h1>
<h2>Login: ${sessionScope.user.login}</h2>
<h2>Password: ${sessionScope.user.password}</h2>


<form class="form-horizontal">
    <fieldset>
        <!-- Button -->
        <div class="form-group">
            <label class="col-md-4 control-label" for="edit"></label>
            <div class="col-md-4">
                <button type="button" id="edit" class="btn btn-warning"
                        onclick="window.location.href='edit-user?id=${sessionScope.user.id}'">Edit
                </button>
            </div>
        </div>
    </fieldset>
</form>

<form class="form-horizontal">
    <fieldset>
        <!-- Button -->
        <div class="form-group">
            <label class="col-md-4 control-label" for="exit"></label>
            <div class="col-md-4">
                <button id="exit" name="exit" class="btn btn-default">Exit</button>
            </div>
        </div>
    </fieldset>
</form>

</body>
</html>

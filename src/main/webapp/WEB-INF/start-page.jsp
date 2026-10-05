<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="head.jsp" %>
<body>


    <c:if test="${sessionScope.user == null}">
        <p>Вы не вошли в систему</p>
    </c:if>
    <c:if test="${sessionScope.user != null}">
        <p>Вы вошли как ${sessionScope.user.login}</p>
    </c:if>

<br/>
<a href="list-user">Users</a>
<a href="quests">Quests</a>

<form class="form-horizontal">
    <fieldset>
        <!-- Button -->
        <div class="form-group">
            <label class="col-md-4 control-label" for="login"></label>
            <div class="col-md-4">
                <button type="button" id="login" class="btn btn-primary"
                        onclick="window.location.href='login'">Login
                </button>
            </div>
        </div>
    </fieldset>
</form>

<form class="form-horizontal">
    <fieldset>
        <!-- Button -->
        <div class="form-group">
            <label class="col-md-4 control-label" for="signup"></label>
            <div class="col-md-4">
                <button type="button" id="signup" class="btn btn-success"
                        onclick="window.location.href='signup'">Sign-Up
                </button>
            </div>
        </div>
    </fieldset>
</form>

</body>

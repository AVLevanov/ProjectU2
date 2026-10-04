<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="head.jsp"%>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="list-user">Users</a>
<a href="list-user">Quests</a>

<form class="form-horizontal">
    <fieldset>
        <!-- Button -->
        <div class="form-group">
            <label class="col-md-4 control-label" for="login"></label>
            <div class="col-md-4">
                <button id="login" name="login" class="btn btn-primary">Login</button>
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
<%--                <button id="signup" name="" class="btn btn-success">Sign-Up</button>--%>
            </div>
        </div>
    </fieldset>
</form>

</body>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="head.jsp"%>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="list-user">Users</a>
<a href="list-user">Quests</a>
<!-- Button (Double) -->
<div class="form-group">
    <label class="col-md-4 control-label" for="button1id"></label>
    <div class="col-md-8">
        <button id="button1id" name="button1id" class="btn btn-success">Login</button>
        <button id="button2id" name="button2id" class="btn btn-primary">Sign-Up</button>
    </div>
</div>
</body>

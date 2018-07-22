<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>
<h2>登录界面</h2>

<form action="${pageContext.request.contextPath}/user/login" method="post">
    userName:<input type="text" name="userName"><br>
    password:<input type="text" name="password">
    <br>
    <input type="submit" value="login"/>
</form>
</body>
</html>

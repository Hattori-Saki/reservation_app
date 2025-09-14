<!-- ログイン画面 -->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<div class="container">
		<div>ログイン画面</div>
		<form action="login" method="post">
		    <p>
		    	<input type="text" name="username" placeholder="ユーザー名" required>
		    </p>
		    <p>
		    	<input type="password" name="password" placeholder="パスワード" required>
		    </p>
		    <div class="button-group">
		    	<input type="submit" value="ログイン">
		    </div>
		    <p style="color:red;"><c:out value="${errorMessage}" /></p>
		</form>
	</div>
</body>
</html>
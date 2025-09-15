<!-- 新規登録画面 -->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>新規登録画面</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<div class="container">
		<div>新規登録画面</div>
		<form action="account" method="post">
			<p>
	    	<input type="text" name="patient_no" placeholder="診察番号" required>
	    </p>
	    <p>
	    	<input type="text" name="name" placeholder="名前" required>
	    </p>
	    <p>
	    	<input type="text" name="phone" placeholder="電話番号">
	    </p>
	    <p>
	    	<input type="text" name="email" placeholder="メールアドレス">
	    </p>
	    <!-- 余裕があったらpasswordを表示するボタンも書く -->
	    <p>
	    	<input type="password" name="password_hash" placeholder="パスワード" required>
	    </p>
	    <div class="button-group">
	    	<input type="submit" value="登録">
	    </div>
		</form>
	</div>
</body>
</html>
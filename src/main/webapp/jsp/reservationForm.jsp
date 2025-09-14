<!-- 一般ユーザーの予約入力画面 -->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<div class="container">
		<form action="reservation" method="post">
			<input type="hidden" name="action" value="add">
			<p>
				<label for="name">名前:</label>
				<input type="text" id="name"　name="name" value="<c:out value="${param.name}"/>" required>
				<span class="error-message"><c:out value="${errorMessage}" /></span>
			</p>
			<p>
				<label for="reservation_time">希望日時:</label>
				<input type="datetime-local" id="reservation_time" name="reservation_time"
					value="<c:out value="${param.reservation_time}"/>" required>
				<span class="error-message"><c:out value="${errorMessage}" /></span>
				<!-- <div id='calendar'></div> -->
			</p>
			<div class="button-group">
				<input type="submit" value="予約する">
			</div>
		</form>
	</div>
</body>
</html>
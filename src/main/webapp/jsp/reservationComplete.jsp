<!-- 予約完了画面 -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="refresh" content="5;url=<%=request.getContextPath()%>/index.jsp">
<title>予約完了画面</title>
</head>
<body>
	<p>予約が完了しました。</p>
	<p>5秒後にトップページに戻ります。</p>
	<p><a href="<%=request.getContextPath()%>/index.jsp">すぐに戻る</a></p>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/settlementComplete.css">
<meta http-equiv="refresh" content="3;URL='HomeAction'" />

<title>決済完了</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="contents">
		<h1>決済完了画面</h1>
		<div id="info">
			<h2>決済が完了しました。</h2>
			<br>
			<h3>3秒後にホーム画面に戻ります。</h3>
		</div>
	</div>
	<s:include value="footer.jsp" />
</body>
</html>
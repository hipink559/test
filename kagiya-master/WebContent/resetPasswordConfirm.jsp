<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/password.css">
<title>パスワード再設定確認画面</title>
</head>

<body>

	<jsp:include page="header.jsp" />

	 	<div class="top">

		</div>

		<div class="contents">

		<h1>パスワード再設定画面</h1>



		<!-- IDと新PWを表示。PWの＊＊表示はUserInfoDAOみてね -->
		<s:form action="ResetPasswordCompleteAction">
		<div class="kakunin">
		<!-- <h3>以下の内容で登録しますか</h3> -->
		</div>

		<div class="confirm">
		ログインID:
			<s:property value="#session.ResetLoginId" />
			<br>
		新しいパスワード:
			<s:property value="#session.concealPassword" />
			<br>
			</div>
			</s:form>

		<div class="image_confirm">

		<div class="left">
			<a href=<s:url action="ResetPasswordCompleteAction"/>>
 						<img src="./images/btn_entry.jpg">
 								</a>

 		</div>

 		<div class="right">
 			<a href=<s:url action="ResetPasswordAction">
						<s:param name="loginId" value="loginId" /></s:url>>
 						<img src="./images/btn_reset.jpg" id="reset">
 								</a>
 			</div>
 			</div>
 			</div>






	<s:include value="footer.jsp" />

</body>
</html>
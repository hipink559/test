<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="./css/login.css">

	<title>ログイン</title>

	<script>
		function goLoginAction() {
			document.getElementById("form").action = "LoginAction";
		}
		function goCreateUserAction() {
			document.getElementById("form").action = "CreateUserAction";
		}
		function goResetPasswordAction() {
			document.getElementById("form").action = "ResetPasswordAction";
		}
	</script>
</head>

<body>
	<jsp:include page="header.jsp" />


	<div id="main">

		<div  id="title">
			<h1>ログイン画面</h1>
		</div>

		<div class="background">
		<p>ログインIDとパスワードを入力してください</p>
		</div>

		<s:form class="background" action="LoginAction">
			<table id="table">
			<tr>
				<td>
				<s:if test="!#session.passwordCheckMessage.isEmpty()">
					<div class="error">
						<s:iterator value="#session.passwordCheckMessage"><s:property /><br></s:iterator>
					</div>
				</s:if>
				<s:if test="!#session.loginIdErrorMessageList.isEmpty()">
					<div class="error">
						<s:iterator value="#session.loginIdErrorMessageList"><s:property /><br></s:iterator>
					</div>
				</s:if>
				<s:label value="ログインID:" />
				<s:if test="#session.savedLoginId == true">
					<s:textfield id="box" name="user_id" placeholder="ログインID" value='%{#session.userId}' />
				</s:if>
				<s:else>
					<s:textfield name="user_id" placeholder="ログインID" value="%{user_id}" />
				</s:else>
				</td>
			</tr>
			<tr>
				<td>
				<s:if test="!#session.passwordErrorMessageList.isEmpty()">
					<div class="error">
						<s:iterator value="#session.passwordErrorMessageList"><s:property /><br></s:iterator>
					</div>
				</s:if>
				<s:label value="パスワード :"/>
				<s:password name="password" placeholder="パスワード" />
				</td>
			</tr>
			<tr>
				<td>
				<s:label class = "idcheck" value="ログインIDを保存" />
				<s:if test="#session.savedLoginId == true">
					<s:checkbox name="savedLoginId" checked="checked" />
				</s:if>
				<s:else>
					<s:checkbox name="savedLoginId" />
				</s:else>
				</td>
			</tr>
			<tr>
				<th><input type="image" class="submit" src="images/btn_login.jpg"/></th>
			</tr>

			</table>
		</s:form>

		<br>

		<s:form class="background" action="CreateUserAction">
			<label>新規登録はこちら</label><br>
			<input type="image" class="submit" src="images/btn_create.jpg"/>

		</s:form>

		<br>

		<s:form class="background" action="ResetPasswordAction">
			<label>パスワードを変更する場合はこちら</label><br>
			<input type="image" class="resetpass" src="images/btn_resetpassword.jpg"/>

		</s:form>

		<br>

		<s:form action="HomeAction">
		<label>ホーム画面へ</label><br>
		<input type="image" class="back" src="images/btn_back.jpg"/>

		</s:form>

	</div>

	<s:include value="footer.jsp" />

</body>
</html>

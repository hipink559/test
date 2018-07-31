<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" href="./css/password.css">

<title>パスワード再設定画面</title>

</head>
<body>

	<jsp:include page="header.jsp" />

		<div class="top">

		</div>

		<div class="contents">
		<h1>パスワード再設定画面</h1>

		<!-- 入力テキストフォーム -->
		<s:form action="ResetPasswordConfirmAction">
			<table class="vertical-list-table">

				<!-- LoginIDが空欄の場合にエラーをだす -->
				<s:if test="!loginIdErrorMessageList.isEmpty()">
				<tr>
					<td colspan="2">
						<div class="error-message">
						<s:iterator value="%{loginIdErrorMessageList}">
							<s:property />
							<br>
						</s:iterator>
						</div>
					</td>
				</tr>
				</s:if>

				<tr>
					<th scope="row"><s:label value="ログインID:" /></th>
					<td>
						<div class="form">
							<s:textfield name="loginId" placeholder="ログインID"
								class="txt" value="%{loginId}" />
						</div>
					</td>
				</tr>


				<!-- PWが空欄の場合にエラーをだす -->
				<s:if test="!passwordErrorMessageList.isEmpty()">
				<tr>
					<td colspan="2">
						<div class="error-message">
						<s:iterator value="%{passwordErrorMessageList}">
							<s:property />
							<br>
						</s:iterator>
						</div>
					</td>
				</tr>
				</s:if>

				<!-- ログインIDとPWが相違の場合にエラーをだす -->
				<s:if test="passwordCheck != null">
				<tr>
					<td colspan="2">
						<div class="error-message">
						<s:iterator value="%{passwordCheck}">
							<s:property />
							<br>
						</s:iterator>
						</div>
					</td>
				</tr>
				</s:if>

				<tr>
					<th scope="row"><s:label value="現在のパスワード:" /></th>
					<td>
					<div class="form">
						<s:password name="password" placeholder="現在のパスワード"
							class="txt" />
					</div>
					</td>
				</tr>

				<!-- 新PWが空欄の場合にエラーをだす -->
				<s:if test="!newPasswordErrorMessageList.isEmpty()">
				<tr>
					<td colspan="2">
						<div class="error-message">
						<s:iterator value="%{newPasswordErrorMessageList}">
							<s:property />
							<br>
						</s:iterator>
						</div>
					</td>
				</tr>
				</s:if>

				<tr>
					<th scope="row"><s:label value="新しいパスワード:" /></th>
					<td>
						<div class="form">
							<s:password name="newPassword" placeholder="新しいパスワード"
								class="txt" />
						</div>
					</td>
				</tr>

				<!-- 確認用PWが空欄の場合にエラーをだす -->
				<s:if test="!reConfirmationNewPasswordErrorMessageList.isEmpty()">
				<tr>
					<td colspan="2">
						<div class="error-message">
						<s:iterator value="%{reConfirmationNewPasswordErrorMessageList}">
							<s:property />
							<br>
						</s:iterator>
						</div>
					</td>
				</tr>
				</s:if>

				<!-- 新PWと確認PWが相違の場合にエラーをだす -->
				<s:if test="!passwordCheckList.isEmpty()">
				<tr>
					<td colspan="2">
						<div class="error-message">
						<s:iterator value="%{passwordCheckList}">
							<s:property />
							<br>
						</s:iterator>
						</div>
					</td>
				</tr>
				</s:if>

				<tr>
					<th scope="row"><s:label value="(確認用):" /></th>
					<td>
						<div class="form">
							<s:password name="reConfirmationPassword"
								placeholder="新しいパスワード(確認用)" class="txt" />
						</div>
					</td>
				</tr>
			</table>

			<div class="center">
				<div class="image">
				<input type="image" class="resetpassword" src="./images/btn_resetpassword.jpg"/>
	 			</div>

				<div class="image">
					<a href="GoLoginAction">
						<img src="./images/btn_back.jpg" class="back">
					</a>
	 			</div>
 			</div>

		</s:form>
	</div>

	<s:include value="footer.jsp" />

</body>
</html>
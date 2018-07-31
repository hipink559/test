<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/createUser.css">
<title>登録内容確認</title><script>
function goCreateUserCompleteAction(){
	document.getElementById("form").action="CreateUserCompleteAction";
}
function goCreateUserAction(){
	document.getElementById("form").action="CreateUserAction";
}
</script>
</head>
<body>

	<s:include value="header.jsp" />



	<!-- createUserで入力された値を表示。登録ボタンを押下すると
		CreateUserCompleteActionの結果に応じてcreateUserComplete.jspまたはにcreateUser.jsp遷移する -->
	<div class="createUser">

		<h1>登録内容確認画面</h1>

		<s:form id="form">
			<table class="createUser-table">
				<tr>
					<th scope="row" class = "cuc"><s:label value="姓：" /></th>
					<td><s:property value="family_name" /></td>
					<th scope="row" class = "cuc"><s:label value="名：" /></th>
					<td><s:property value="first_name" /></td>
				</tr>

				<tr>
					<th scope="row" class = "cuc"><s:label value="せい：" /></th>
					<td><s:property value="family_name_kana" /></td>
					<th scope="row" class = "cuc"><s:label value="めい：" /></th>
					<td><s:property value="first_name_kana" /></td>
				</tr>

				<tr>
					<th scope="row" class = "cuc"><s:label value="性別：" /></th>
					<td><s:property value="sex" /></td>
				</tr>

				<tr>
					<th scope="row" class = "cuc"><s:label value="メールアドレス：" /></th>
					<td colspan="3"><s:property value="email" /></td>
				</tr>

				<tr>
					<th scope="row" class = "cuc"><s:label value="ログインID：" /></th>
					<td><s:property value="user_id" /></td>
				</tr>

				<tr>
					<th scope="row" class = "cuc"><s:label value="パスワード：" /></th>
					<td><s:property value="password" /></td>
				</tr>
			</table>

		<div class="submit_box">
			<div class="submit_btn_box1">
				<div id=".contents-btn-set">
					<input type="image" class="submit" src="images/btn_entry.jpg" onclick="goCreateUserCompleteAction();"/>
				</div>
			</div>
			<div class="submit_btn_box1">
				<div id=".contents-btn-set">
					<input type="image" class="back" src="images/btn_reset.jpg" onclick="goCreateUserAction();"/>
				</div>
			</div>
		</div>


		<!-- //入力された値をそれぞれのデータに渡す -->
		<s:hidden name="family_name" value="%{family_name}" />
		<s:hidden name="first_name" value="%{first_name}" />
		<s:hidden name="family_name_kana" value="%{family_name_kana}" />
		<s:hidden name="first_name_kana" value="%{first_name_kana}" />
		<s:if test='sex.equals("男性")'>
			<s:hidden name="sex" value="0" />
		</s:if>
		<s:if test='sex.equals("女性")'>
		<s:hidden name="sex" value="1" />
		</s:if>
		<s:hidden name="email" value="%{email}" />
		<s:hidden name="user_id" value="%{user_id}" />
		<s:hidden name="password" value="%{password}" />
    </s:form>


	</div>

	<s:include value="footer.jsp" />

</body>


</html>
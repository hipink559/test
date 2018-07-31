<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="./css/mypage.css">
		<title>マイページ</title>
	</head>
<body class="hanabiB">
	<!-- ヘッダー -->
	<jsp:include page="header.jsp"/>

	<div class="mypage_container">
		<span>&nbsp;</span>
		<h1>マイページ</h1>
		<s:iterator value="userInfoList">
			<table class="mypage_table">
				<tr>
					<th>姓：</th>
					<td><s:property value="family_name"/></td>
				</tr>
				<tr>
					<th>名：</th>
					<td><s:property value="first_name"/></td>
				</tr>
				<tr><!-- 姓と名のふりがな -->
					<th>ふりがな：</th>
					<td><s:property value="family_name_kana"/>
					<s:property value="first_name_kana"/></td>
				</tr>
				<tr>
					<th>性別：</th>
					<td>
						<s:if test="sex == 0">男性</s:if>
						<s:elseif test="sex == 1">女性</s:elseif>
					</td>
				</tr>
				<tr>
					<th>メールアドレス：</th>
					<td><s:property value="email"/></td>
				</tr>
			</table>
		</s:iterator>

		<div class="mypage_button">
			<s:form action="PurchaseHistoryAction">
				<input type="image" class="submit" src="images/btn_purchasehistory.jpg"/>
			</s:form>
		</div>

		<div class="mypage_button">
			<s:form action="HomeAction">
				<input type="image" class="back" src="images/btn_back.jpg"/>
			</s:form>
		</div>
	</div>

	<!-- フッター -->
	<jsp:include page="footer.jsp"/>

</body>
</html>
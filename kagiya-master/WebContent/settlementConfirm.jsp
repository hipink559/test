<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/settlementConfirm.css">
<title>決済確認</title>

</head>
<body>
	<jsp:include page="header.jsp" />

	<div id="contents">

		<div class="top">
			<h1>決済確認画面</h1>
		</div>

		<s:if test="!(errorMessage == null)">
			<s:property value="errorMessage" />
		</s:if>
		<s:else>
			<div class="info">送り先情報を選択してください</div>
		</s:else>

		<s:form id="form" action="SettlementCompleteAction">
			<!-- <h3>お届け先住所</h3> -->
			<table class="horizontal-list-table">
				<s:iterator value="#session.destinationInfoDtoList" status="st">

					<tr>
						<td><s:if test="#st.index == 0">
								<input type="radio" name="id" checked="checked"
									value="<s:property value='id'/>" class="radio" />
							</s:if>
							<s:else>
								<input type="radio" name="id" value="<s:property value='id'/>" class="radio"/>
							</s:else>
						</td>
						<td>
							<table class="table-border">
								<tr>
									<th>姓：</th>
									<td><s:property value="familyName" /></td>
									<th>名：</th>
									<td><s:property value="firstName" /></td>
								</tr>
								<tr>
									<th>せい：</th>
									<td><s:property value="familyNameKana" /></td>
									<th>めい：</th>
									<td><s:property value="firstNameKana" /></td>
								</tr>
								<tr>
									<th>住所：</th>
									<td colspan="3"><s:property value="userAddress" /></td>
								</tr>
								<tr>
									<th>メールアドレス：</th>
									<td colspan="3"><s:property value="email" /></td>
								</tr>
								<tr>
									<th>電話番号：</th>
									<td colspan="3"><s:property value="telNumber" /></td>
								</tr>
							</table>
						</td>
					</tr>
				</s:iterator>
			</table>

			<div class="submit_btn_box">
				<div id=".contents-btn-set">
					<input type="image" class="submit" src="images/btn_settlement.jpg" />
				</div>
			</div>
		</s:form>

		<div class="submit_btn_box">
			<div id=".contents-btn-set">
				<s:form action="CreateDestinationAction">
					<input type="image" class="submit" src="images/btn_create.jpg" />
				</s:form>
			</div>
		</div>

	</div>
	<s:include value="footer.jsp" />

</body>
</html>
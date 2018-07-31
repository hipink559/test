<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/cart.css">
<title>Cart</title>

</head>
<body>

	<!-- ヘッダー -->
	<jsp:include page="header.jsp" />



	<s:if test="#session.cartInfoDtoList.size()>0">
		<s:form id="form" action="SettlementConfirmAction">

			<div class="all">
				<div class="main-frame">
					<br>
					<h1>カート画面</h1>

					<s:if test="checkListErrorMessageList!=null">
							<div class="error-message">
								<s:iterator value="checkListErrorMessageList">
									<s:property />
								</s:iterator>
							</div>
					</s:if>

					<table class="horizontal-list-table">
						<s:iterator value="#session.cartInfoDtoList">

							<tr>
								<td><s:checkbox name="checkList" value="checked"
										fieldValue="%{productId}" class="checkbox" /></td>
								<s:hidden name="productId" value="%{productId}" />
								<td><img
									src='<s:property value="imageFilePath"/><s:property value="imageFileName"/>'
									 /></td>
								<td>
									<table class="limitWord">
										<tr>
											<th>商品名</th>
											<td><s:property value="productName" /></td>
										</tr>
										<tr>
											<th>ふりがな</th>
											<td><s:property value="productNameKana" /></td>
										</tr>
										<tr>
											<th>発売会社名</th>
											<td><s:property value="releaseCompany" /></td>
										</tr>
										<tr>
											<s:if test="categoryId == 4">
												<th>入社年月日</th>
											</s:if>
											<s:else>
												<th>発売年月日</th>
											</s:else>
											<td><s:property value="releaseDate" /></td>
										</tr>
									</table>
								</td>
								<td>
									<table>
										<tr>
											<th>値段</th>
											<td><s:property value="price" />円</td>
										</tr>
										<tr>
											<s:if test="categoryId == 4">
												<th>利用時間</th>
											</s:if>
											<s:else>
												<th>個数</th>
											</s:else>
											<td><s:property value="productCount" /> <s:if
													test="categoryId == 4">時間</s:if></td>
										</tr>
										<tr>
											<th><br></th>
										</tr>
										<tr>
											<th>小計</th>
											<td><s:property value="subtotal" />円</td>
										</tr>
									</table>
								</td>
							</tr>
							<s:hidden name="productName" value="%{productName}" />
							<s:hidden name="productNameKana" value="%{productNameKana}" />
							<s:hidden name="imageFilePath" value="%{imageFilePath}" />
							<s:hidden name="imageFileName" value="%{imageFileName}" />
							<s:hidden name="price" value="%{price}" />
							<s:hidden name="releaseCompany" value="%{releaseCompany}" />
							<s:hidden name="releaseDate" value="%{releaseDate}" />
							<s:hidden name="productCount" value="%{productCount}" />
							<s:hidden name="subtotal" value="%{subtotal}" />
						</s:iterator>

					</table>

					<s:if test="session.containsKey('loginId')">
						<s:hidden name="userId" value="%{session.loginId}" />
					</s:if>
					<s:else>
						<s:hidden name="userId" value="%{session.tempUserId}" />
					</s:else>

				</div>


				<div class="center">
				<table class="aaa">
					<tr>
						<td><s:label value="カート合計金額 :" /></td>
					</tr>

					<tr>
						<td> <s:property value="#session.totalPrice" /> 円</td>
					</tr>

					<tr>
						<td><input type="image" class="submit"
							src="images/btn_register.jpg" /></td>
					</tr>

					<tr>
						<td><input type="image" class="submit"
							src="images/btn_delete.jpg"
							onclick="this.form.action='DeleteCartAction';" /></td>
					</tr>
				</table>
				</div>



			</div>
		</s:form>
	</s:if>
	<s:else>
		<div class="info">カートに何も入っていません</div>
	</s:else>

	<s:include value="footer.jsp" />
</body>
</html>
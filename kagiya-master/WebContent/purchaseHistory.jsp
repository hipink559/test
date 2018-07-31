<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/purchaseHistory.css">
<title>商品購入履歴画面</title>
</head>


<body class="hanabiB">


	<div>
		<!-- ヘッダー -->
		<jsp:include page="header.jsp" />
	</div>


	<div class="purchaseHistory-main">

		<h1>商品購入履歴</h1>
		<s:if test="#session.purchaseHistoryInfoDTOList.size()>0">

			<div class="tablearea" >
                <s:iterator value="#session.purchaseHistoryInfoDTOList">
                    <div class="purchaseHistory-left">
                        <img src='<s:property value="imageFilePath"/><s:property value="imageFileName"/>' />
                    </div>
                    <div class="purchaseHistory-right">
                        <table class="purchase-history-table">
                            <tr>
                                <th>商品名：</th>
                                <td><s:property value="productName" /></td>
                            </tr>
                            <tr>
                                <th>ふりがな：</th>
                                <td><s:property value="productNameKana" />
                            </tr>
                            <tr>
                                <th>値段：</th>
                                <td><s:property value="Price" />円</td>
                            </tr>
                            <tr>
                                <th>発売会社名：</th>
                                <td><s:property value="ReleaseCompany" /></td>
                            </tr>
                            <tr>
                            	<s:if test="categoryId == 4">
                            		<th>入社年月日：</th>
                            	</s:if>
                            	<s:else>
                                	<th>発売年月日：</th>
                                </s:else>
                                <td><s:property value="ReleaseDate" /></td>
                            </tr>
                        </table>
                    </div>
                	<div class="clearfix"></div>
                </s:iterator>
			</div>

			<div class="purchaseHistory-btn">
				<s:form action="DeletePurchaseHistoryAction">
					<input type="image" class="submit" src="images/btn_delete.jpg"/>
				</s:form>
			</div>
		</s:if>


		<s:else>
			<div>商品購入履歴はありません。</div>
		</s:else>
		<div class="purchaseHistory-btn">
			<s:form action="MyPageAction">
					<input type="image" class="back" src="images/btn_back.jpg" />
			</s:form>
		</div>
	</div>

	<!-- フッター -->
	<jsp:include page="footer.jsp" />
</body>
</html>


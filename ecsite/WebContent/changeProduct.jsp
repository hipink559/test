<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE htm>
<html>
<head>
<meta charset="UTF-8">
<title>ChangeProduct</title>
<style type="text/css">
	body {
		margin:0;
		padding:0;
		line-height:1.6;
		letter-spacing:1px;
		font-family:Verdana, Helvetica, sans-serif;
		font-size:12px;
		color:#333;
		background:#fff;
	}
	table {
		text-align:center;
		margin:0 auto;
	}
	#top {
		width:780px;
		margin:30px auto;
		border:1px solid #333;
	}
	#header {
		width: 100%;
		height: 80px;
		background-color: black;
	}
	#main {
		width: 100%;
		height: 500px;
		text-align: center;
	}
	#footer {
		width: 100%;
		height: 80px;
		background-color: black;
		clear:both;
	}
	#text-right {
		display: inline-block;
		text-align: right;

	}
</style>
</head>
<body>
	<div id="header"></div>
	<div id="main">
		<div id="top">
			<p>Change Product</p>
		</div>

		<s:if test="productList==null">
			<h3>商品情報はありません</h3>
		</s:if>
		<s:elseif test="message==null">
			<h3>商品情報は以下になります</h3>
			<table border="1">
			<tr>
				<th>商品番号</th>
				<th>商品名</th>
				<th>価格</th>
				<th>在庫数</th>

			</tr>

			<s:iterator value="productList">
				<tr>
					<td><s:property value="id" /></td>
					<td><s:property value="itemname" /><span></span></td>
					<td><s:property value="itemprice" /><span>円</span></td>
					<td><s:property value="itemstock" />個</td>

				</tr>
				</s:iterator>
			</table>
				<s:form action="ChangeProductConfirmAction">
					<input type="hidden" name="deleteFlg" value="1">
					<s:submit value="削除" method="delete" />
				</s:form>
		</s:elseif>
		<s:if test="message != null">
			<h3><s:property value="message"/></h3>
		</s:if>

		<div id="text-right">
		   <h3>新規で商品情報を登録する場合は<a href='<s:url action="AddProductAction" />'>こちら</a></h3>
			<p>ログアウトする場合は<a href='<s:url action="LogoutAction" />'>こちら</a></p>
		</div>
	</div>
		<div id="footer"></div>

</body>
</html>
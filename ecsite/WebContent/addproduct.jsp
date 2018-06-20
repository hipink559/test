<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8"/>
<title>Additem</title>
<Style type="text/css">
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
	#text-link {
		display: inline-block;
		text-align: right;
	}
	}
</Style>
</head>

<body>
	<div id="header"></div>

	<div id="main">
		<div id="top">
			<p>Add Product</p>
		</div>
		<s:if test="errorMessage =''">
			<s:property value="errorMessage" escape="false" />
		</s:if>
		<h2>追加する商品情報を入力してください</h2>
		<table>
			<s:form action="AddProductConfirmAction">
			<tr>
				<td><label>商品名:</label></td>
				<td><input type="text"name="additemName" value=""/></td>
			</tr>
			<tr>
				<td>値段:</td>
				<td><input type="text" name="additemPrice"value=""/>円</td>
			</tr>
			<tr>
				<td>在庫:</td>
				<td><input type="text" name="additemStock"value=""/>個</td>
			</tr>

			<s:submit value="登録"/>
			</s:form>
		</table>
		<div>
		<span>前画面に戻るには</span>
		<a href='<s:url action="ChangeProductAction"/>'>こちら</a>
		</div>
	</div>
	<div id="footer"></div>
</body>
</html>
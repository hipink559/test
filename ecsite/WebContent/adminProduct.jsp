<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8" />
<title>商品情報編集画面</title>
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

	#before{
	    float:left;
	    width:350px;
		margin:30px auto;
		border:1px solid #333;
		position:relative;
		left:100px;
	}
	#after{
	    float:left;
	    width:350px;
		margin:30px auto;
		border:1px solid #333;
		position:relative;
		left:170px;
	}
	#footer {
		width: 100%;
		height: 80px;
		background-color: black;
		clear:both;
	}
	#submain{
		width: 100%;
		text-align: center;
	}
</style>

</head>
<body>
<div id="header">
	<div id="pr">
	</div>
</div>

<div id="main">
	<div id="top">
	<p>Change Product</p>
	</div>

<div id="before">
	<s:form action="BuyItemAction">
	<h3>変更前</h3>
	<table>
	<tr>
		<td><span>商品名</span></td>
		<td><s:property value="session.buyItem_name" /></td>
	</tr>

	<tr>
		<td><span>値段</span></td>
		<td><s:property value="session.buyItem_price"/>
		<span>円</span></td>
	</tr>

	<tr>
		<td><span>在庫</span></td>
		<td>

		</td>
	</tr>
		</table>
	</s:form>

</div>

<div id="after">
	<s:form action="BuyItemAction">
	<h3>変更後</h3>
	<table>
	<tr>
		<td><span>商品名</span></td>
		<td><s:property value="session.buyItem_name" /></td>
	</tr>

	<tr>
		<td><span>値段</span></td>
		<td><s:property value="session.buyItem_price"/>
		<span>円</span></td>
	</tr>

	<tr>
		<td><span>在庫</span></td>
		<td>

		</td>
	</tr>
		</table>
	</s:form>

</div>
</div>
	<div id="submain" >
	<p>前画面に戻る場合は<a href='<s:url action="GoHomeAction" />'>こちら</a></p>
	<p>マイぺージは<a href='<s:url action="MyPageAction" />'>こちら</a></p>
	</div>


<div id="footer">
	<div id="pr">
	</div>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8" />
<title>商品一覧画面</title>
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
	#text-link {
		display: inline-block;
		text-align: right;
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
	<p>Item List</p>
	</div>
<div>
	<s:form action="BuyItemAction">
	<table>
	<s:iterator value="#session.productInfoDtoList">
<div class="product-list-box">
<ul>
	<li>
	<s:url action="ProductDetailsAction">
	</s:url>'><br>
	<s:property value="itemName"/><br>
	<s:property value="itemPrice"/>円<br>
  </li>
</ul>
</div>
</s:iterator>


		</table>
	</s:form>
	<div>
	<p>前画面に戻る場合は<a href='<s:url action="GoHomeAction" />'>こちら</a></p>
	<p>マイぺージは<a href='<s:url action="MyPageAction" />'>こちら</a></p>
	</div>
</div>
</div>
<div id="footer">
	<div id="pr">
	</div>
</div>
</body>
</html>
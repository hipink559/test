<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8"/>
<title>ChangeProduct</title>
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
	#text-right {
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
			<p>Change Product</p>
		</div>



	<h3>商品情報を変更する</h3>


<s:form action="ChangeProductConfirmAction">

		<tr>
		<th scope="row"><s:label value="商品番号"/></th>
			<td><s:property value="id" /></td>
		</tr>
		<tr>
			<th scope="row"><s:label value="商品名"/></th>
			<td><s:textfield name="itemName" placeholder="商品名" class="txt" /></td>
		</tr>
		<tr>
			<th scope="row"><s:label value="価格"/></th>
			<td><s:textfield name="itemPrice" placeholder="価格" class="txt" /></td>
		</tr>

		<tr>
			<th scope="row"><s:label value="在庫"/></th>
			<td><s:textfield name="itemStock" placeholder="在庫" class="txt" /></td>
		</tr>

			<s:submit value="商品情報を編集する"/>


		</s:form>


		</div>

			<br>
			<br>

        <div id="text-right">
		<span>前画面に戻るには</span>
		<a href='<s:url action="ChangeProductAction"/>'>こちら</a>
		<br>
		<span>ホームに戻るには</span>
		<a href='<s:url action="GoHomeAction"/>'>こちら</a>
		</div>


	<div id="footer"></div>
</body>
</html>
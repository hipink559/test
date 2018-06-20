<%@ page language="java" contentType="text/html; charset=UTF-8"

pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>UserCreateConfirm画面</title>
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
</style>

</head>
<body>
	<div id="header">
	</div>

	<div id="main">
		<div id="top">
			<p>user create confirm</p>
		</div>
			<h3>登録は以下の内容になります</h3>
			<table>
			<s:form action="UserCreateCompleteAction">

		<tr id="box">
			<td><label>login id:</label></td>
			<td><s:property value="loginUserId" escape="false"/></td>
		</tr>
		<tr id="box">
			<td><label>login pass:</label></td>
			<td><s:property value="loginPassword" escape="false"/></td>
		</tr>
		<tr id="box">
			<td><label>user name:</label></td>
			<td><s:property value="userName" escape="false"/></td>
		</tr>

		<tr>
		<td><s:submit value="登録"/></td>
		</tr>

	</s:form>
</table>
	</div>
	<div id="footer">>
	</div>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE htm>
<html>
<head>
<meta charset="UTF-8">
<title>ChangeCostomer</title>
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
			<p>Change Costomer</p>
		</div>

		<s:if test="customerList==null">
			<h3>顧客情報はありません</h3>
		</s:if>
		<s:elseif test="message==null">
			<h3>顧客情報は以下になります</h3>
			<table border="1">
			<tr>
				<th>No</th>
				<th>LoginID</th>
				<th>Password</th>
				<th>UserName</th>
				<th>編集</th>


			</tr>

			<s:iterator value="customerList">

				<tr>
					<td><s:property value="id" /></td>
					<td><s:property value="loginId" /><span></span></td>
					<td><s:property value="loginPass" /><span></span></td>
					<td><s:property value="userName" /></td>
					<td><s:form action="ChangeCustomerInfoAction">
					<input type="hidden" name=" update" value="1">
					<s:submit value="編集" method=" update" /></s:form></td>



				</tr>

				</s:iterator>
			</table>

		</s:elseif>
		<s:if test="message != null">
			<h3><s:property value="message"/></h3>
		</s:if>

		<div id="text-right">

			<p>ログアウトする場合は<a href='<s:url action="LogoutAction" />'>こちら</a></p>
		</div>
	</div>
		<div id="footer"></div>

</body>
</html>
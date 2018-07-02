<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<title>changeconfirm</title>
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
<script type="text/javascript">
function submitAction(url) {
$('form').attr('action', url);
$('form').submit();
}
</script>

</head>
	<body>
	<div id="header">
	</div>
	<div id="main">
		<div id="top">
		<p>Change Confirm</p>
		</div>

	<s:form>
	<tr>
	    <td>商品番号</td>
	    <td><s:property value="id" /></td>
	</tr>
	<tr>
		<td>商品名</td>
		<td><s:property value="itemName" /></td>
	</tr>
	<tr>
		<td>値段</td>
		<td><s:property value="itemPrice" /><span>円</span></td>
	</tr>
	<tr>
		<td>在庫</td>
		<td><s:property value="itemStock" /><span>個</span></td>
	</tr>

	<br>
	<tr>
		<td><input type="button" value="戻る"onclick="submitAction('ChangeProductInfoAction')" /></td>
		<td><input type="button" value="完了"onclick="submitAction('ChangeProductCompleteAction')" /></td>
	</tr>
	</s:form>

	</div>
	<div id="footer">
	</div>

</body>
</html>
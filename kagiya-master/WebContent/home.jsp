<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/home.css">
<meta http-equiv="Content-Script-Type" content="text/javascript"/>


<title>ホーム画面</title>
</head>
<body>

	<!-- ヘッダー -->
	<jsp:include page="home_header.jsp" />
	<jsp:include page="home.html" />






<div class="link_icon">

<h2>検索したい商品をクリックしてください</h2>


<a href='<s:url action="SearchItemAction"> <s:param name="categoryId" value="2"/></s:url>'>
				<img src=./images/icon_temochi.jpg></a>


<a href='<s:url action="SearchItemAction"> <s:param name="categoryId" value="3"/></s:url>'>
				<img src="./images/icon_uchiage.jpg"></a>


<a href='<s:url action="SearchItemAction"> <s:param name="categoryId" value="4"/></s:url>'>
				<img src="./images/icon_staff.jpg"></a>
</div>








	<!-- フッター -->
	<jsp:include page="footer.jsp" />

</body>
</html>
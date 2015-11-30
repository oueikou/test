<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<c:set var="basePath" value="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}" />
<c:set var="amazeui" value="${ctx}/ui/AmazeUI-2.4.2/" />
<!doctype html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Amaze UI Admin table Examples</title>
	<meta name="description" content="">
	<meta name="keywords" content="table">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
	<meta name="renderer" content="webkit">
	<meta http-equiv="Cache-Control" content="no-siteapp" />
<%-- 	<link rel="icon" type="image/png" href="${amazeui }assets/i/favicon.png"> --%>
	<link rel="icon" type="image/png" href="${ctx}/images/common/cloud.ico">
	<link rel="apple-touch-icon-precomposed" href="${amazeui }assets/i/app-icon72x72@2x.png">
	<meta name="apple-mobile-web-app-title" content="Amaze UI" />
	<link rel="stylesheet" href="${amazeui }assets/css/amazeui.min.css" />
	<link rel="stylesheet" href="${amazeui }assets/css/admin.css">
	
	<script src="${amazeui }assets/js/jquery.min.js"></script>
	<script src="${amazeui }assets/js/amazeui.min.js"></script>
	<script src="${amazeui }assets/js/app.js"></script>
	
	<script type="text/javascript">
		$(function(){
			var ctx = ${ctx};
			var basePath = ${basePath};
		});
	</script>
	
	<title></title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<jsp:include page="sidebar.jsp"></jsp:include>
<%-- 	<jsp:include page="footer.jsp"></jsp:include> --%>
</body>
</html>

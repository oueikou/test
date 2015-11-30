<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort() + path + "/";
 %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<c:set var="amazeui" value="${ctx}/ui/AmazeUI-2.4.2/" />
<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta name="format-detection" content="telephone=no">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<%-- <link rel="alternate icon" type="image/png" href="${amazeui }assets/i/favicon.png"> --%>
<!-- <link rel="stylesheet" href="assets/css/amazeui.min.css"/> -->
<link rel="icon" type="image/png" href="${ctx}/images/common/cloud.ico">
<link rel="stylesheet" href="${amazeui }assets/css/amazeui.min.css" />
<style>
.header {
  text-align: center;
}
.header h1 {
  font-size: 200%;
  color: #333;
  margin-top: 30px;
}
.header p {
  font-size: 14px;
}
</style>
<title>登录</title>
</head>
<body>

<div class="header">
  <div class="am-g">
    <p><br/></p>
  </div>
  <hr />
</div>
	
<div class="am-g">
  <div class="am-u-lg-6 am-u-md-8 am-u-sm-centered">
    <h3>登录</h3>
    <hr>

    <form method="post" class="am-form" action="login.do">
      <label for="text">用户名:</label>
      <input type="text" name="loginName" id="loginName" value="">
      <br>
      <label for="password">密码:</label>
      <input type="password" name="password" id="password" value="">
      <br>
      <label>
		<c:if test="${message !=null }">
			<font color="red">${message}</font>
		</c:if>
      </label>
      <br>
      <label for="remember-me">
        <input id="remember-me" type="checkbox">
        记住密码
      </label>
      <br />
      <div class="am-cf">
        <input type="submit" name="" value="登 录" class="am-btn am-btn-primary am-btn-sm am-fl">
        <input type="button" name="" value="忘记密码 ^_^? " class="am-btn am-btn-default am-btn-sm am-fr">
      </div>
    </form>
    <hr>
    <p>© 2015 ALL RIGHTS RESERVED</p>
  </div>
</div>
	
	<%-- <form method="post" action="login.do">
		用户名：<input type="text" name="loginName" id="loginNane" >
		密码：<input type="password" name="password" id="password" >
		<input type="submit" value="登录" >
		<c:if test="${message !=null }">
			${message}
		</c:if>
	</form> --%>
	
</body>
</html>
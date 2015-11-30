<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="basePath" value="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}" />
<!doctype html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	
	<title></title>
<title></title>
</head>
<body>
	<!-- sidebar start -->
	<div class="admin-sidebar am-offcanvas" id="admin-offcanvas">
		<div class="am-offcanvas-bar admin-offcanvas-bar">
			<ul class="am-list admin-sidebar-list">
				<li><a href="admin-index.html"><span class="am-icon-home"></span> 所有文件</a></li>
				<%-- <li class="admin-parent"><a class="am-cf" data-am-collapse="{target: '#collapse-nav'}"><span class="am-icon-file"></span> 页面模块 <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
					<ul class="am-list am-collapse admin-sidebar-sub am-in" id="collapse-nav">
						<li><a href="admin-user.html" class="am-cf"><span class="am-icon-check"></span> 个人资料<span class="am-icon-star am-fr am-margin-right admin-icon-yellow"></span></a></li>
						<li><a href="admin-help.html"><span class="am-icon-puzzle-piece"></span> 帮助页</a></li>
						<li><a href="admin-gallery.html"><span class="am-icon-th"></span> 相册页面<span class="am-badge am-badge-secondary am-margin-right am-fr">24</span></a></li>
						<li><a href="${basePath}/logs/file_manager_log.html" target="_balnk"><span class="am-icon-calendar"></span> 系统日志</a></li>
						<li><a href="admin-404.html"><span class="am-icon-bug"></span> 404</a></li>
					</ul>
				</li> --%>
				<li><a href="admin-table.html"><span class="am-icon-table"></span> 表格</a></li>
				<li><a href="admin-form.html"><span class="am-icon-pencil-square-o"></span> 表单</a></li>
				<li><a href="#"><span class="am-icon-sign-out"></span> 注销</a></li>
				<li><a href="${basePath}/logs/file_manager_log.html" target="_balnk"><span class="am-icon-calendar"></span> 系统日志</a></li>
				<li><a href="${basePath}/druid/index.html" target="_balnk"><span class="am-icon-calendar"></span> 系统监控</a></li>
			</ul>

			<div class="am-panel am-panel-default admin-sidebar-panel">
				<div class="am-panel-bd">
					<p>
						<span class="am-icon-bookmark"></span> 公告
					</p>
					<p>时光静好，与君语；细水流年，与君同。—— Amaze UI</p>
				</div>
			</div>

			<div class="am-panel am-panel-default admin-sidebar-panel">
				<div class="am-panel-bd">
					<p>
						<span class="am-icon-tag"></span> wiki
					</p>
					<p>Welcome to the Amaze UI wiki!</p>
				</div>
			</div>
		</div>
	</div>
	<!-- sidebar end -->
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	<jsp:include page="../common/default.jsp"></jsp:include>
<div class="am-cf admin-main" style="height:600px">
	<!-- content start -->
	<div class="admin-content">
		<div class="am-cf am-padding">
			<div class="am-fl am-cf">
				<strong class="am-text-primary am-text-lg">需求接受单</strong>  <small></small>
			</div>
		</div>
		<div class="am-g">
			<div class="am-u-sm-12 am-u-md-6">
				<div class="am-btn-toolbar">
					<div class="am-btn-group am-btn-group-xs">
						<button type="button" class="am-btn am-btn-default">
							<span class="am-icon-plus"></span> 新增
						</button>
						<button type="button" class="am-btn am-btn-default">
							<span class="am-icon-archive"></span> 审核
						</button>
						<button type="button" class="am-btn am-btn-default">
							<span class="am-icon-trash-o"></span> 批量删除
						</button>
					</div>
				</div>
			</div>
			<div class="am-u-sm-12 am-u-md-3">
				<div class="am-form-group">
					<select data-am-selected="{btnSize: 'sm'}">
						<option value="option1">所有类别</option>
						<option value="option2">IT业界</option>
						<option value="option3">数码产品</option>
						<option value="option3">笔记本电脑</option>
						<option value="option3">平板电脑</option>
						<option value="option3">只能手机</option>
						<option value="option3">超极本</option>
					</select>
				</div>
			</div>
			<div class="am-u-sm-12 am-u-md-3">
				<div class="am-input-group am-input-group-sm">
					<input type="text" class="am-form-field"> <span class="am-input-group-btn">
						<button class="am-btn am-btn-default" type="button">搜索</button>
					</span>
				</div>
			</div>
		</div>

	<div class="am-g">
      <div class="am-u-sm-12">
        <form class="am-form">
          <table class="am-table am-table-striped am-table-hover table-main">
            <thead>
              <tr>
                <th class="table-check"><input type="checkbox" /></th>
                <th class="table-title">服务人数</th>
                <th class="table-title">服务区域</th>
                <th class="table-type">需求发送机构</th>
                <th class="table-author am-hide-sm-only">需求发送人</th>
                <th class="table-date am-hide-sm-only">接受日期</th>
                <th class="table-set">操作</th>
              </tr>
			</thead>
			<tbody>
<%--           	<c:forEach var="receive" items="${productList}" > --%>
	          	<tr>
	              <td><input type="checkbox" /></td>
	              <td>${receive.demandSendId }</td>
	              <td><a href="#">${receive.receiveStoreId }</a></td>
	              <td>${receive.receiveOrgId }</td>
	              <td class="am-hide-sm-only">测试1号</td>
	              <td class="am-hide-sm-only">2014年9月4日 7:28:47</td>
	              <td>
	                <div class="am-btn-toolbar">
	                  <div class="am-btn-group am-btn-group-xs">
	                    <button class="am-btn am-btn-default am-btn-xs am-text-secondary"><span class="am-icon-pencil-square-o"></span> 编辑</button>
	                    <button class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only"><span class="am-icon-trash-o"></span> 删除</button>
	                  </div>
	                </div>
	              </td>
	            </tr>
<%--           	</c:forEach> --%>
          
			</tbody>
		  </table>
		 </form>
		</div>
	</div>

	</div>
	<!-- content end -->
</div>

</body>
</html>
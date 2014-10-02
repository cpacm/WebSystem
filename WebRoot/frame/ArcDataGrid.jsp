<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<title>文书档案列表</title>

<base href="<%=basePath%>" />
<meta http-equiv="pragma" content="no-cache" />
<meta http-equiv="cache-control" content="no-cache" />
<meta http-equiv="expires" content="0" />
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
<meta http-equiv="description" content="This is my page" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css"
	href="easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css" />
<link rel="stylesheet" type="text/css" href="easyui/demo.css" />
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<table width="500px" class="easyui-datagrid"
	data-options="url:'datagrid_data1.json',method:'get',border:false,singleSelect:true,fit:true,fitColumns:true">
	<thead>
		<tr>
			<th data-options="field:'itemid'" width="70px">行号</th>
			<th data-options="field:'kkkid'" width="200px">题名（标题）</th>
			<th data-options="field:'productid'" width="120px">所在地</th>
			<th data-options="field:'listprice'" width="70px">文号</th>
			<th data-options="field:'unitcost'" width="70px">年度</th>
			<th data-options="field:'attr1'" width="70px">件号</th>
			<th data-options="field:'status',align:'center'" width="70px">期限</th>
			<th data-options="field:'control',align:'center'" width="150px">操作</th>
		</tr>
		<tbody>
			<c:forEach var="acv" items="${Archives}" varStatus="status">
				<tr>
					<td>${acv.aid}</td>
					<td>${acv.title}</td>
					<td>${acv.location}</td>
					<td>${acv.dcNumber}</td>
					<td>${acv.year }</td>
					<td>${acv.partNum }</td>
					<td>${acv.outDate}</td>
					<td><div style="text-align:center;padding:1px;">
							<a href="tag?acv.aid=${acv.aid}" class="easyui-linkbutton"
								style="height:20px;"
								>Update</a> <a
								href="delete?acv.aid=${acv.aid}" class="easyui-linkbutton"
								style="height:20px;">Delete</a>
						</div></td>
				</tr>
			</c:forEach>
		</tbody>
	</thead>

</table>
</html>

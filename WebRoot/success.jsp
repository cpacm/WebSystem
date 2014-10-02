<%@ page language="java" import="java.util.*"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'success.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<table align="center" border="1" cellpadding="0" cellspacing="0"
		bordercolor="#3366cc">
		<tr align="center" bgcolor="#3399cc" height="26px">
			<td width="100">NO.</td>
			<td width="160">UNAME</td>
			<td width="70">SEX</td>
			<td width="150">TELPHONE</td>
			<td width="300">ADDRESS</td>
		</tr>
		<c:forEach var="acv" items="${Archives}">
			<tr align="center" height="24px">
				<td width="100">${acv.title}</td>
				<td width="160">${acv.year}</td>
				<td width="70">${acv.dcNumber }</td>
				<td width="150">${acv.fileNum }</td>
				<td width="300">${acv.location}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<title>ArcAddData</title>
<base href="<%=basePath%>" />
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" type="text/css"
	href="easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css" />
<link rel="stylesheet" type="text/css" href="easyui/demo.css" />
<link rel="stylesheet" type="text/css" href="frame/frame.css" />
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
</head>

<form id="ff" method="post" action="ArcAdd">
	<table cellpadding="6">
		<tr>
			<td>题名:</td>
			<td><input class="easyui-textbox" type="text" name="acv.title"
				data-options="required:false" style="width:605px;"> </input></td>
		</tr>
		<tr>
			<td>年度:</td>
			<td><select class="easyui-combobox" name="acv.year"
				style="width:100px">
					<option value="" selected="selected">不限年份</option>
					<option value="2011">2011</option>
					<option value="2012">2012</option>
					<option value="2013">2013</option>
					<option value="2014">2014</option>
			</select></td>
			<td>所在地:</td>
			<td><select class="easyui-combobox" name="acv.location"
				style="width:100px">
					<option value="" selected="selected">不限地区</option>
					<option value="浙江省">浙江省</option>
					<option value="上海市">上海市</option>
					<option value="海南省">海南省</option>
					<option value="北京市">北京市</option>
			</select></td>
		</tr>
		<tr>
			<td>文号:</td>
			<td><input class="easyui-textbox" type="text"
				name="acv.dcNumber" style="width:270px;"> </input></td>
			<td>密级:</td>
			<td><input class="easyui-textbox" type="text" name="acv.level"
				style="width:270px;"> </input></td>
		</tr>
		<tr>
			<td>分类号:</td>
			<td><select class="easyui-combobox" name="acv.classid"
				style="width:230px">
					<option value="0" selected="selected">不限分类</option>
					<option value="10">综合类（A）</option>
					<option value="20">计划财务类（B）</option>
					<option value="30">地籍管理类（C）</option>
					<option value="40">国土资源利用规划类（D）</option>
					<option value="50">建设用地类（E）</option>
					<option value="60">国土资源监察类（F）</option>
					<option value="70">国土资源宣教、科技、信息类（G）</option>
					<option value="80">电子、声像材料类（H）</option>
					<option value="90">地质、矿产管理类（I） </option>
			</select></td>
			<td>保管期限:</td>
			<td><select class="easyui-combobox" name="acv.outDate"
				style="width:100px">
					<option value="" selected="selected">不限</option>
					<option value="一星期">一星期</option>
					<option value="一个月">一个月</option>
					<option value="半年">半年</option>
					<option value="一年">一年</option>
			</select></td>
		</tr>
		<tr>
			<td>案卷号:</td>
			<td><input class="easyui-textbox" type="text" name="acv.fileNum"
				style="width:253px;"> </input></td>
			<td>件号:</td>
			<td><input class="easyui-textbox" type="text" name="acv.partNum"
				style="width:270px;"> </input></td>
		</tr>
		<tr>
			<td>录入日期:</td>
			<td><input class="easyui-textbox" type="text" name="acv.date1"
				style="width:262px;"> </input></td>
			<td>至</td>
			<td><input class="easyui-textbox" type="text" name="acv.date2"
				style="width:270px;"> </input></td>
		</tr>
	</table>
	<input class="easyui-linkbutton" type="submit" value="Add" />
	<input class="easyui-linkbutton" type="button" value="Clear" onclick="clearForm()"/>
</form>
<script>
	function clearForm() {
		$('#ff').form('clear');
	}
</script>
</html>

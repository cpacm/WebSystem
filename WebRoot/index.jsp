<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>查询系统</title>
<base href="<%=basePath%>" />
<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css" />
<link rel="stylesheet" type="text/css" href="easyui/demo.css" />
<link rel="stylesheet" type="text/css" href="css/main.css" />
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
</head>

<body>
<div style="margin:20px 0;"></div>
<div class="easyui-layout" style="width:100%;height:100%;"> 
  <!-- 顶端区域 -->
  <div data-options="region:'north'" style="height:12%"></div>
  <!-- 底部区域 -->
  <!-- <div data-options="region:'south',split:true" style="height:12%;"></div> -->
  
  <!-- 右边区域 -->
  <div data-options="region:'east',split:true" title="East" style="width:12%;"> </div>
  
  <!-- 左边区域 -->
  <div data-options="region:'west',split:true" title="West" style="width:18%;">
    <div class="easyui-tabs" style="width:100%;height:570px">
      <div title="档案分类" style="padding:10px">
        <ul class="easyui-tree">
          <li data-options="state:'opened'"> <span><a href="frame/ArcQuery.jsp " target= "myiframe">文书档案类</a></span>
            <ul>
              <li> <span><a href="queryByclassId?acv.classid=10" target= "myiframe">综合类（A）</a></span> </li>
              <li> <span><a href="queryByclassId?acv.classid=20" target= "myiframe">计划财务类（B）</a></span> </li>
              <li> <span><a href="queryByclassId?acv.classid=30" target= "myiframe">地籍管理类（C）</a></span> </li>
              <li> <span><a href="queryByclassId?acv.classid=40" target= "myiframe">国土资源利用规划类（D）</a></span> </li>
              <li> <span><a href="queryByclassId?acv.classid=50" target= "myiframe">建设用地类（E）</a></span> </li>
              <li> <span><a href="queryByclassId?acv.classid=60" target= "myiframe">国土资源监察类（F）</a></span> </li>
              <li> <span><a href="queryByclassId?acv.classid=70" target= "myiframe">国土资源宣教、科技、信息类（G）</a></span> </li>
              <li> <span><a href="queryByclassId?acv.classid=80" target= "myiframe">电子、声像材料类（H）</a></span> </li>
              <li> <span><a href="queryByclassId?acv.classid=90" target= "myiframe">地质、矿产管理类（I）</a></span> </li>
              <li> <span><a href="frame/ArcAddData.jsp" target= "myiframe">添加数据</a></span> </li>
            </ul>
          </li>
          <li data-options="state:'closed'"> <span>业务档案类</span>
            <ul>
              <li> <span>地籍管理类（C）</span> </li>
              <li> <span>土地利用总体规划类（D）</span> </li>
              <li> <span>建设用地类（E）</span> </li>
              <li> <span>土地监察类（H）</span> </li>
              <li> <span>建设用地类目录（G）</span> </li>
              <li> <span>土地矿产类（I）</span> </li>
              <li> <span>土地整理类（Y）</span> </li>
              <li> <span>土地他项权利（抵押）登记类（Z）</span> </li>
            </ul>
          </li>
          <li data-options="state:'closed'"> <span>多媒体类</span>
            <ul>
              <li> <span>照片类（A）</span> </li>
              <li> <span>视频类（B）</span> </li>
              <li> <span>文档类（C）</span> </li>
            </ul>
          </li>
        </ul>
      </div>
    </div>
  </div>
  
  <!-- 中间区域 -->
  <div data-options="region:'center',title:'Main Title',iconCls:'icon-ok'">
  <iframe frameborder="0" name="myiframe" style="height:100%; width:100%;" src="frame/ArcQuery.jsp" />
  </div>
</div>

</body>

</html>

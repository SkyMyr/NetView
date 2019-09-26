<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="text/javascript" src="js/echarts.min.js"></script>
<title>Visible World Routing</title>
</head>
<body style="background: url('img/cbb9256.jpg') no-repeat;height:100%;width:100%;overflow: hidden;background-size:cover;">
<div style="width:90%;height:980px;" id="main"></div>
    <script type="text/javascript">
		var myChart = echarts.init(document.getElementById('main'));
		var	option = ${json };
		myChart.setOption(option);
	</script>
</body>
</html>


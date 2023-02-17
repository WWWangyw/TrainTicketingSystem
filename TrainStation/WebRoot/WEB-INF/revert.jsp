<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>回复</title>
</head>
<%
	request.setAttribute("APP_PATH", request.getContextPath());
%>
<link rel="stylesheet" type="text/css" href="LiuYanBan/css/index2.css"/>
<body>
<div class="wrap">
	<%@include file="/WEB-INF/inc_login.jsp"%>
	<%@include file="/WEB-INF/inc_revert.jsp"%>
	<%@include file="/WEB-INF/inc_comment_list.jsp"%>
</div>
</body>
</html>
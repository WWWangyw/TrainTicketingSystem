<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>留言板</title>
<link rel="stylesheet" type="text/css" href="LiuYanBan/css/index2.css"/>
</head>
<%
	request.setAttribute("APP_PATH", request.getContextPath());
%>
<body>
<div class="wrap">
	<%@include file="/WEB-INF/inc_login.jsp"%>
	<%@include file="/WEB-INF/inc_comment.jsp"%>
	<%@include file="/WEB-INF/inc_comment_list.jsp"%>
</div>
</body>
</html>


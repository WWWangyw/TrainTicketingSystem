<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="tou">
	<table>
		<tr>
			<c:if test="${user == null }">
				<td ><a href="${APP_PATH }/register.jsp">注册</a></td>
				<td ><a href="${APP_PATH }/login.jsp">登录</a></td>
			</c:if>
		</tr>
	</table>
	<c:if test="${user != null }">
		欢迎您，${user.realname }
		<a href="${APP_PATH }/login.jsp">注销</a>
	</c:if>
</div>
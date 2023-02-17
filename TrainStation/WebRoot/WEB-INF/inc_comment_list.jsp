<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="liuYanRen">
<c:forEach items="${pager.msgList }" var="msg">
	<ul>
		<li>${msg.pl_realname }</li>
		<li>${msg.pl_content }</li>
		<li>${msg.str_time } 
			<c:if test="${user != null }">
				<a href="${APP_PATH }/revert?pl_id=${msg.id}">回复</a>
				<c:if test="${user.id == msg.user_id }">
					<a href="${APP_PATH }/delComment?pl_id=${msg.id}">删除</a>
				</c:if>
			</c:if>
			<c:if test="${user == null }"><a href="${APP_PATH }/login.jsp" onclick="huifu()">回复</a></c:if>
		</li>
		<c:if test="${msg.revertList != null}">
			<c:forEach items="${msg.revertList }" var="revert">
				<c:if test="${revert.pl_id == msg.id }">
					<ul>
						<li>${revert.hf_realname }<b>回复</b>${msg.pl_realname }</li>
						<li>${revert.hf_content }</li>
						<li>${revert.str_hf_time }
							<c:if test="${user != null && revert.user_id == user.id }">
								<a href="${APP_PATH }/delRevert?hf_id=${revert.id}">删除</a>
							</c:if>
						</li>
					</ul>
				</c:if>
			</c:forEach>
		</c:if>
	</ul>
	<hr/>
</c:forEach>
</div>
<div class="page">
	<c:if test="${pager.pageNumb > 1 }">
		<a href="${APP_PATH }/index?pageNumb=${pager.prevPageNumb}">上一页</a>
	</c:if>
	<c:forEach begin="1" end="${pager.pageCount }" var="i">
		<a href="${APP_PATH }/index?pageNumb=${i }">${i }</a>
	</c:forEach>
	<c:if test="${pager.pageNumb < pager.pageCount }">
		<a href="${APP_PATH }/index?pageNumb=${pager.nextPageNumb}">下一页</a>
	</c:if>
</div>

<script type="text/javascript">
	function huifu() {
		this.alert("您未登录，点击确认前往登录~");
	}
</script>
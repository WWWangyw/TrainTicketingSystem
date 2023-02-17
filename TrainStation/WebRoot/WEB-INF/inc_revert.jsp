<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<form action="${APP_PATH }/revert" method="post">
<input type="hidden" value="${comment.id }" name="pl_id">
	<table class="zhu">
		<tr>
			<td width="70">
				留言板：
			</td>
			<td>
				<label>我要回复<span class="wu">${comment.pl_realname }</span>在 ${comment.str_time }的评论： ${comment.pl_content }
				</label>
				<span>
					<textarea name="liuYan" rows="3" cols="100" id="myArea" onKeyUp="keypress2()" onblur="keypress2()"></textarea>
				</span>
			</td>
			
		</tr>
		
		<tr class="er">
			<td></td>
			<td>
				<label class="yi" id="pinglun">300</label><span class="yi">/</span><label class="yi">300</label>
				
				<span><input type="submit" value="发表回复" class="san"/></span>
				
				<span><a href="${APP_PATH }/index">返回评论状态</a></span>
			</td>
			
		</tr>
	</table>
</form>
<script type="text/javascript">
function keypress2(){
    var text1=document.getElementById("myArea").value;
    var maxLen=document.getElementById("myArea").cols*document.getElementById("myArea").rows;
    var len;//记录剩余字符串的长度
    if(text1.length>=maxLen)
    {
        document.getElementById("myArea").value=text1.substr(0,maxLen);//只显示起始位-末尾；substr（起始位，末尾)
        len=0;
    }else{
        len=maxLen-text1.length;
    }
    document.getElementById("pinglun").innerText=len;
}
</script>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册用户</title>
<link rel="stylesheet" type="text/css" href="LiuYanBan/css/register.css"/>
</head>
<%
	request.setAttribute("APP_PATH", request.getContextPath());
%>
<body>
	<header>
		<form>
			<ul>
				<li style="margin-left: 200px;">
				</li>
				<li>
					<h1>账号注册</h1>
				</li>
				<li>
					<a href="">English</a>
				</li>
			</ul>
		</form>
		</header>
			
		<div class="daKuang">
			<form action="${APP_PATH }/registerUser" method="post">
				<p class="input1">
					<span class="input2">
						<img src="LiuYanBan/img/未标题-1.jpg" >
					</span>
					<input type="text" name="account" id="a" value="" placeholder="请输入注册账号"/><br>
				</p>
				<p class="input1">
					<span class="input2">
						<img src="LiuYanBan/img/未标题-3.jpg" >
					</span>
					<input type="text" name="password" id="a" value="" placeholder="请输入注册密码" style="width: 290px;"><br>
				</p>
				<p class="input1">
					<span class="input2">
						<img src="LiuYanBan/img/未标题-3.jpg" >
					</span>
					<input type="text" name="password2" id="a" value="" placeholder="确认密码" style="width: 290px;"><br>
				</p>
				<div id="weiInput">
					<p class="input1" style="width: 200px;overflow: hidden;">
						<span class="input2">
							<img src="LiuYanBan/img/未标题-1.jpg" >
						</span>
						<input type="text" name="realname" id="a" value="" placeholder="请输入真实姓名" style="width: 140px;">
					</p>
				</div>
				<div id="zhuCe">
					<input type="submit" value="立即注册" />
				</div>
				<div id="" style="margin-left: 45px;margin-top: 15px;border: 1px solid orangered;width: 350px;text-align: center;line-height: 30px;background-color: orangered;">
					<a href="${APP_PATH }/Lylogin.jsp" style="text-decoration: none;color: white;font-size: 14px;">已有账号</a>
				</div>
			</form>
		</div>
</body>
</html>
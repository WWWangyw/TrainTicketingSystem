<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
<link rel="stylesheet" type="text/css" href="LiuYanBan/css/login.css"/>
</head>
<%
	request.setAttribute("APP_PATH", request.getContextPath());
	HttpSession s1 = request.getSession();
	s1.invalidate();
%>
<body>
	<header>
		<form>
			<ul>
				<li>
				</li>
				<li>
					<h1>欢迎登陆</h1>
				</li>
				<li>
					<a href="">English</a>
				</li>
			</ul>
		</form>
	</header>
	<div class="daKuang">
		<div id="" style="background-color: #88ACE3;">
			<img src="LiuYanBan/img/u=3266498599,389731699&fm=26&fmt=auto&gp=0.webp"width="550" height="400"/>
		</div>
		<div id="">
			<ul>
				<li>
					<span><img src="LiuYanBan/img/未标题-1.jpg"><a href="" style="color: red;">账户登录</a></span>
				</li>
			</ul>
			<section>
				<form action="${APP_PATH }/loginUser" method="post">
					<p>
						<input type="text" name="account" id="zhangHao" value=""placeholder="请输入登录账户" />
					</p>
					<p>
						<input type="password" name="password" id="miMa" value=""placeholder="请输入登录密码" />
					</p>
					<p>
						<a href="#" id="wangMing"><input type="submit"  value="立即登录" style="color:black"/></a>
					</p>
				</form>
			</section>
			<div id="weiBu">
				<p>
					<a href="${APP_PATH }/Lyregister.jsp" style="color: red;">忘记密码？ 立即注册</a>
				</p>
				<p>
					<a href="${APP_PATH }/index" style="color: red;">我要去留言！</a>
				</p>
			</div>
		</div>
	</div>
</body>
</html>
package com.mb.web.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;

import com.mb.bean.User;
import com.mb.service.UserService;
import com.mb.service.impl.UserServiceImpl;

@WebServlet("/registerUser")
public class RegisterUserServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取数据
		String account = req.getParameter("account");
		String password = req.getParameter("password");
		String password2 = req.getParameter("password2");
		String realname = req.getParameter("realname");
		UserService userService = new UserServiceImpl();
		if (userService.exam(account, password, password2, realname)) {
			try {
				if (userService.save(new User(account, password, realname))) {
					resp.sendRedirect(req.getContextPath()+"/Lylogin.jsp");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

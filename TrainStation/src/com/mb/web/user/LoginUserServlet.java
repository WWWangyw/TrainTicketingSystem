package com.mb.web.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mb.bean.User;
import com.mb.service.UserService;
import com.mb.service.impl.UserServiceImpl;

@WebServlet("/loginUser")
public class LoginUserServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//接收数据
		String account = req.getParameter("account");
		String password = req.getParameter("password");
		UserService userService = new UserServiceImpl();
		try {
			User user = userService.queryByOneUser(account, password);
			if (user != null) {
				HttpSession s1 = req.getSession();
				s1.setAttribute("user", user);
				resp.sendRedirect(req.getContextPath()+"/index");
			} else {
				resp.sendRedirect(req.getContextPath()+"/Lylogin.jsp");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

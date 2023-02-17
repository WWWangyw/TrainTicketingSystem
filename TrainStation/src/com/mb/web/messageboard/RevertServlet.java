package com.mb.web.messageboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mb.bean.Comment;
import com.mb.bean.User;
import com.mb.service.CommentService;
import com.mb.service.RevertService;
import com.mb.service.impl.CommentServiceImpl;
import com.mb.service.impl.RevertServiceImpl;

@WebServlet("/revert")
public class RevertServlet extends HttpServlet{

	RevertService RevertService = new RevertServiceImpl();
	CommentService CommentService = new CommentServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取回复的记录id
		String pl_id = req.getParameter("pl_id");
		try {
			Comment comment = CommentService.queryById(Integer.valueOf(pl_id));
			System.out.println("123");
			req.setAttribute("comment", comment);
			req.getRequestDispatcher("/WEB-INF/revert.jsp")
			.forward(req, resp);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取回复的具体信息
		String plId = req.getParameter("pl_id");
		String liuYan = req.getParameter("liuYan");
		System.out.println(plId);
		User user = (User) req.getSession().getAttribute("user");
		Integer userId = user.getId();
		try {
			if (RevertService.saveRevert(plId, liuYan, userId)) {
				resp.sendRedirect(req.getContextPath()+"/index");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

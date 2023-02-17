package com.mb.web.messageboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mb.bean.User;
import com.mb.service.CommentService;
import com.mb.service.impl.CommentServiceImpl;

@WebServlet("/comment")
public class CommentServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取数据，当前评论人的id，评论的内容
		String content = req.getParameter("content");
		User user = (User)req.getSession().getAttribute("user");
		Integer userId = user.getId();
		CommentService commentService = new CommentServiceImpl();
		try {
			if (commentService.saveComment(userId, content)) {
				resp.sendRedirect(req.getContextPath()+"/index");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

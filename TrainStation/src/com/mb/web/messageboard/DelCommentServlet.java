package com.mb.web.messageboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mb.service.CommentService;
import com.mb.service.impl.CommentServiceImpl;

@WebServlet("/delComment")
public class DelCommentServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取要删除的评论id
		String pl_id = req.getParameter("pl_id");
		CommentService commentService = new CommentServiceImpl();
		try {
			if (commentService.delete(pl_id)) {
				resp.sendRedirect(req.getContextPath()+"/index");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

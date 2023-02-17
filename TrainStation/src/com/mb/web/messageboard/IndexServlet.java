package com.mb.web.messageboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.druid.util.StringUtils;
import com.mb.bean.PageInfo;
import com.mb.service.CommentService;
import com.mb.service.impl.CommentServiceImpl;

@WebServlet("/index")
public class IndexServlet extends HttpServlet{

	public static final Integer pageSize = 5;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取当前页数
		String strPageNumb = req.getParameter("pageNumb");
		Integer pageNumb = 1;
		if (!StringUtils.isEmpty(strPageNumb)) {
			pageNumb = Integer.valueOf(strPageNumb);
		}
		CommentService commentService = new CommentServiceImpl();
		try {
			PageInfo pager = commentService.page(pageNumb, pageSize);
			req.setAttribute("pager", pager);
			req.getRequestDispatcher("/WEB-INF/comment.jsp")
			.forward(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

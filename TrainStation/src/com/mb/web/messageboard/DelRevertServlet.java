package com.mb.web.messageboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mb.service.RevertService;
import com.mb.service.impl.RevertServiceImpl;

@WebServlet("/delRevert")
public class DelRevertServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取要删除的评论id
		String hfId = req.getParameter("hf_id");
		RevertService revertService = new RevertServiceImpl();
		try {
			if (revertService.delete(hfId)) {
				resp.sendRedirect(req.getContextPath()+"/index");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

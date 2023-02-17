package com.mb.service.impl;

import java.text.SimpleDateFormat;
import java.util.List;

import com.mb.bean.Comment;
import com.mb.bean.PageInfo;
import com.mb.bean.Revert;
import com.mb.bean.User;
import com.mb.dao.CommentDao;
import com.mb.dao.RevertDao;
import com.mb.dao.impl.CommentDaoImpl;
import com.mb.dao.impl.RevertDaoImpl;
import com.mb.service.CommentService;
import com.mb.service.RevertService;
import com.mb.service.UserService;

public class CommentServiceImpl implements CommentService{

	CommentDao commentDao = new CommentDaoImpl();
	UserService userService = new UserServiceImpl();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	RevertService revertService = new RevertServiceImpl();
	
	@Override
	public boolean saveComment(Integer userId, String content) throws Exception {
		// TODO Auto-generated method stub
		Integer i = commentDao.saveComment(userId, content);
		return i > 0;
	}

	@Override
	public PageInfo page(Integer pageNumb, Integer pageSize) throws Exception {
		// TODO Auto-generated method stub
		List<Comment> commentList = commentDao.page(pageNumb, pageSize);
		Integer rowCount = commentDao.getCount();
		for (Comment comment : commentList) {
			User user = userService.queryById(comment.getUser_id());
			if (user != null) {
				comment.setPl_realname(user.getRealname());
				comment.setStr_time(sdf.format(comment.getPl_time()));
			}
			List<Revert> revertList = revertService.getListByCommentId(comment.getId());
			comment.setRevertList(revertList);
		}
		PageInfo pager = new PageInfo(commentList, rowCount, pageNumb, pageSize);
		return pager;
	}

	@Override
	public Comment queryById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		Comment comment = commentDao.queryById(id);
		User user = userService.queryById(comment.getUser_id());
		if (user != null) {
			comment.setPl_realname(user.getRealname());
			comment.setStr_time(sdf.format(comment.getPl_time()));
		}
		return comment;
	}

	@Override
	public boolean delete(String pl_id) throws Exception {
		// TODO Auto-generated method stub
		List<Revert> lst = revertService.getListByCommentId(Integer.valueOf(pl_id));
		if (lst != null) {
			revertService.deleteByPlId(pl_id);
		}
		Integer i = commentDao.delete(pl_id);
		return i > 0;
	}

	
}

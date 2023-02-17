package com.mb.service.impl;

import java.text.SimpleDateFormat;
import java.util.List;

import com.mb.bean.Revert;
import com.mb.bean.User;
import com.mb.dao.RevertDao;
import com.mb.dao.impl.RevertDaoImpl;
import com.mb.service.RevertService;
import com.mb.service.UserService;

public class RevertServiceImpl implements RevertService{

	RevertDao revertDao = new RevertDaoImpl();
	UserService userService = new UserServiceImpl();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	@Override
	public boolean saveRevert(String plId, String liuYan, Integer userId) throws Exception {
		// TODO Auto-generated method stub
		Integer i = revertDao.saveRevert(plId, liuYan, userId);
		return i > 0;
	}

	@Override
	public List<Revert> getListByCommentId(Integer pl_id) throws Exception {
		// TODO Auto-generated method stub
		List<Revert> revertList = revertDao.getListByCommentId(pl_id);
		
		for (Revert revert : revertList) {
			User user = userService.queryById(revert.getUser_id());
			System.out.println(user);
			if (user != null) {
				revert.setStr_hf_time(sdf.format(revert.getHf_time()));
				revert.setHf_realname(user.getRealname());
			}
		}
		return revertList;
	}

	@Override
	public boolean delete(String hfId) throws Exception {
		// TODO Auto-generated method stub
		Integer i = revertDao.delete(hfId);
		return i > 0;
	}

	@Override
	public boolean deleteByPlId(String plId) throws Exception {
		// TODO Auto-generated method stub
		Integer i = revertDao.deleteByPlId(plId);
		return i > 0;
	}

}

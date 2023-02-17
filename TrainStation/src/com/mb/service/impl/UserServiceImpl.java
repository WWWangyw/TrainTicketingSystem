package com.mb.service.impl;

import org.apache.commons.lang.StringUtils;

import com.mb.bean.User;
import com.mb.dao.UserDao;
import com.mb.dao.impl.UserDaoImpl;
import com.mb.service.UserService;

public class UserServiceImpl implements UserService{
	
	UserDao userDao = new UserDaoImpl();
	
	@Override
	public boolean save(User user) throws Exception {
		// TODO Auto-generated method stub
		Integer i = userDao.save(user);
		return i > 0;
	}

	/**
	 * 验证注册的信息是否包含空，并验证二次密码是否相同
	 */
	@Override
	public boolean exam(String account, String password, String password2, String realname) {
		// TODO Auto-generated method stub
		if (StringUtils.isEmpty(account) || StringUtils.isEmpty(password)
			|| StringUtils.isEmpty(password2) || StringUtils.isEmpty(realname)
			|| !password.equals(password2)) {
			return false;
		}
		return true;
	}

	@Override
	public User queryByOneUser(String account, String password) throws Exception {
		// TODO Auto-generated method stub
		return userDao.queryByOneUser(account, password);
	}

	@Override
	public User queryById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return userDao.queryById(id);
	}

}

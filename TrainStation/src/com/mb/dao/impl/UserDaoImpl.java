package com.mb.dao.impl;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.mb.bean.User;
import com.mb.dao.UserDao;

public class UserDaoImpl extends BaseDao implements UserDao{

	@Override
	public Integer save(User user) throws Exception {
		// TODO Auto-generated method stub
		QueryRunner qur = initQueryRunner();
		String sql = "insert into t_user (account, password, realname) values(?, ?, ?)";
		return qur.update(sql, user.getAccount(), user.getPassword(), user.getRealname());
	}

	@Override
	public User queryByOneUser(String account, String password) throws Exception {
		// TODO Auto-generated method stub
		QueryRunner qur = initQueryRunner();
		String sql = "select * from t_user where account = ? and password = ?";
		return qur.query(sql, new BeanHandler<User>(User.class), account, password);
	}

	@Override
	public User queryById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		QueryRunner qur = initQueryRunner();
		String sql = "select * from t_user where id = ?";
		return qur.query(sql, new BeanHandler<User>(User.class), id);
	}

}

package com.mb.dao;

import com.mb.bean.User;

public interface UserDao {

	Integer save(User user) throws Exception;

	User queryByOneUser(String account, String password) throws Exception;

	User queryById(Integer id) throws Exception;
}

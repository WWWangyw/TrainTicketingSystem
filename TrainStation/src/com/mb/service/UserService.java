package com.mb.service;

import com.mb.bean.User;

public interface UserService {

	/**
	 * 保存用户信息
	 * @param user
	 * @return
	 * @throws Exception
	 */
	boolean save(User user) throws Exception;
	
	/**
	 * 检查用户注册信息是否符合注册规则（不为null）
	 * @param account
	 * @param password
	 * @param password2
	 * @param realname
	 * @return
	 */
	boolean exam(String account, String password, String password2, String realname);

	/**
	 * 根据用户账号和密码精确查询到用户对象
	 * @param account
	 * @param password
	 * @return
	 * @throws Exception
	 */
	User queryByOneUser(String account, String password) throws Exception;
	
	/**
	 * 根据用户id插叙某个用户
	 * @param id
	 * @return
	 * @throws Exception
	 */
	User queryById(Integer id) throws Exception;
}

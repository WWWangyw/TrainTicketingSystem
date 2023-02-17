package com.mb.service;

import com.mb.bean.User;

public interface UserService {

	/**
	 * �����û���Ϣ
	 * @param user
	 * @return
	 * @throws Exception
	 */
	boolean save(User user) throws Exception;
	
	/**
	 * ����û�ע����Ϣ�Ƿ����ע����򣨲�Ϊnull��
	 * @param account
	 * @param password
	 * @param password2
	 * @param realname
	 * @return
	 */
	boolean exam(String account, String password, String password2, String realname);

	/**
	 * �����û��˺ź����뾫ȷ��ѯ���û�����
	 * @param account
	 * @param password
	 * @return
	 * @throws Exception
	 */
	User queryByOneUser(String account, String password) throws Exception;
	
	/**
	 * �����û�id����ĳ���û�
	 * @param id
	 * @return
	 * @throws Exception
	 */
	User queryById(Integer id) throws Exception;
}

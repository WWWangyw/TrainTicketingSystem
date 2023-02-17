package com.mb.dao;

import java.sql.SQLException;
import java.util.List;

import com.mb.bean.Comment;
import com.mb.bean.PageInfo;

public interface CommentDao {

	/**
	 * ��ȡ���ۼ�¼�����з�ҳ����
	 * @param pageNumb
	 * @param pagesize
	 * @return
	 * @throws Exception
	 */
	List<Comment> page(Integer pageNumb, Integer pagesize) throws Exception;

	/**
	 * ��������id��ѯĳ������
	 * @param id
	 * @return
	 * @throws Exception
	 */
	Comment queryById(Integer id) throws Exception;

	/**
	 * ����idɾ��ĳ������
	 * @param pl_id
	 * @return
	 * @throws Exception
	 */
	Integer delete(String pl_id) throws Exception;

	/**
	 * ��������
	 * @param userId
	 * @param content
	 * @return
	 * @throws Exception
	 */
	Integer saveComment(Integer userId, String content) throws SQLException, Exception;

	/**
	 * ��ȡ���۱������еļ�¼��
	 * @return
	 * @throws Exception
	 */
	Integer getCount() throws Exception;
	
}

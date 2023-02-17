package com.mb.service;

import com.mb.bean.Comment;
import com.mb.bean.PageInfo;

public interface CommentService {
	
	/**
	 * ��������
	 * @param userId
	 * @param content
	 * @return
	 * @throws Exception
	 */
	boolean saveComment(Integer userId, String content) throws Exception;

	/**
	 * ��ȡ���ۼ�¼�����з�ҳ����
	 * @param pageNumb
	 * @param pagesize
	 * @return
	 * @throws Exception
	 */
	PageInfo page(Integer pageNumb, Integer pagesize) throws Exception;

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
	boolean delete(String pl_id) throws Exception;
}

package com.mb.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.mb.bean.Comment;
import com.mb.dao.CommentDao;

public class CommentDaoImpl extends BaseDao implements CommentDao{

	@Override
	public List<Comment> page(Integer pageNumb, Integer pageSize) throws Exception {
		// TODO Auto-generated method stub
		QueryRunner qur = initQueryRunner();
		String sql = "select * from t_comment order by pl_time desc limit ?, ? ";
		return qur.query(sql, new BeanListHandler<Comment>(Comment.class), (pageNumb - 1) * pageSize, pageSize);
	}

	@Override
	public Comment queryById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		QueryRunner qur = initQueryRunner();
		String sql = "select * from t_comment where id = ?";
		return qur.query(sql, new BeanHandler<Comment>(Comment.class), id);
	}

	@Override
	public Integer delete(String pl_id) throws Exception {
		// TODO Auto-generated method stub
		QueryRunner qur = initQueryRunner();
		String sql = "delete from t_comment where id = ?";
		return qur.update(sql, pl_id);
	}

	@Override
	public Integer saveComment(Integer userId, String content) throws Exception {
		// TODO Auto-generated method stub
		QueryRunner qur = initQueryRunner();
		String sql = "insert into t_comment (user_id, pl_content) values(?, ?)";
		//如果update方法返回的大于0，代表增加成功，返回的小于0代表失败
		return qur.update(sql, userId, content);
	}

	@Override
	public Integer getCount() throws Exception {
		// TODO Auto-generated method stub
		QueryRunner qur = initQueryRunner();
		String sql = "select count(1) from t_comment";
		Long rowCount = qur.query(sql, new ScalarHandler<Long>());
		return rowCount.intValue();
	}

	
}

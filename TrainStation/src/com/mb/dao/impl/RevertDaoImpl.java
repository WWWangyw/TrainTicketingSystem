package com.mb.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.mb.bean.Revert;
import com.mb.dao.RevertDao;

public class RevertDaoImpl extends BaseDao implements RevertDao{

	@Override
	public Integer saveRevert(String plId, String liuYan, Integer userId) throws Exception {
		// TODO Auto-generated method stub
		QueryRunner qur = initQueryRunner();
		String sql = "insert into t_revert (pl_id, user_id, hf_content) values(?, ?, ?)";
		System.out.println(plId);
		return qur.update(sql, plId, userId, liuYan);
	}

	@Override
	public List<Revert> getListByCommentId(Integer pl_id) throws Exception {
		// TODO Auto-generated method stub
		QueryRunner qur = initQueryRunner();
		String sql = "select * from t_revert where pl_id = ?";
		return qur.query(sql, new BeanListHandler<Revert>(Revert.class), pl_id);
	}

	@Override
	public Integer delete(String hfId) throws Exception {
		// TODO Auto-generated method stub
		QueryRunner qur = initQueryRunner();
		String sql = "delete from t_revert where id = ?";
		return qur.update(sql, hfId);
	}

	@Override
	public Integer deleteByPlId(String plId) throws Exception {
		// TODO Auto-generated method stub
		QueryRunner qur = initQueryRunner();
		String sql = "delete from t_revert where pl_id = ?";
		return qur.update(sql, plId);
	}

}

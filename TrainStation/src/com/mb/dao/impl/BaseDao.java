package com.mb.dao.impl;

import java.io.FileReader;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class BaseDao {

	private static DataSource ds = null;

	public QueryRunner initQueryRunner() throws Exception {
		if (ds == null) {
			String dbFile = this.getClass().getClassLoader().getResource("/").getFile();
			dbFile = dbFile.substring(1) + "db.properties";
			
			FileReader fr = new FileReader(dbFile);
			
			Properties pro = new Properties();
			pro.load(fr);
			ds = DruidDataSourceFactory.createDataSource(pro);
		}
		QueryRunner qur = new QueryRunner(ds);
		System.out.println(ds);
		return qur;
	}
}

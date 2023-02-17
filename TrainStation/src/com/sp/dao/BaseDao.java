package com.sp.dao;


import java.sql.*;



public class BaseDao {
	private static final String DRIVER="com.mysql.jdbc.Driver";
	private static final String URL="jdbc:mysql://localhost:3306/trainstation?characterEncoding=utf-8";
	private static final String USERNAME="root";
	private static final String PASSWORD="82283484wang";
	private Statement stmt;
	ResultSet rs;
	/**
	 * ������ݿ�����
	 */
	public Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	/**
	 * �ر���Դ
	 */
	public void closeResourse(ResultSet rs,PreparedStatement ps,Connection conn){
			try {
				if(rs!=null){
					rs.close();
				}
				if(ps!=null){
					ps.close();
				}
				if(conn!=null){
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	

	
	/**
	 * ����sql������ɾ��
	 */
	public int updateBySql(String sql,Object...objects){
		int result = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			if(objects!=null && objects.length>0){
				for(int i=0;i<objects.length;i++){
					ps.setObject(i+1, objects[i]);
				}
			}
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			closeResourse(null, ps, conn);
		}
		return result;
	}
	
	
	public ResultSet executeQuery(String sql){
        try {
        	Class.forName(DRIVER);
        	;
        	Connection conn = getConnection();
            //5.��ȡִ��sql����Statement
            stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            //6.ִ��sql
            rs=stmt.executeQuery(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }catch(Exception e) {
        	e.printStackTrace();
        }
        return rs;
    }


    public void closeStmt(){
        try {
            //8.�ͷ���Դ
            stmt.close();
        } catch (SQLException e) {
            System.err.println("Data.executeQuery: " + e.getMessage());
        }
    }


}

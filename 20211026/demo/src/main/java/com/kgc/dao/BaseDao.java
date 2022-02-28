package com.kgc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.kgc.util.ConfigManager;

//���ࣺ���ݿ����ͨ����
public class BaseDao {
	protected Connection conn;
	protected PreparedStatement ps;
	protected Statement stmt;
	protected ResultSet rs;

	// ��ȡ���ݿ�����
	public boolean getConnection() {
		// ����������Ϣ
		String driver = ConfigManager.getInstance().getString("jdbc.driver_class");
		String url = ConfigManager.getInstance().getString("jdbc.connection.url");
		String username = ConfigManager.getInstance().getString("jdbc.connection.username");
		String password = ConfigManager.getInstance().getString("jdbc.connection.password");
		// ����JDBC����
		try {
			Class.forName(driver);
			// �����ݿ⽨������
			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	// ��ȡ���ݿ�����
	public boolean getConnection2() {
		try {
			//��ʼ��������
			Context cxt=new InitialContext();
			//��ȡ���߼��������������Դ����
			DataSource ds=(DataSource)cxt.lookup("java:comp/env/jdbc/news");
			conn=ds.getConnection();
		} catch (NamingException e) {
			e.printStackTrace();
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	// ��ɾ�� delete from news_detail where id=? and title=?
	public int executeUpdate(String sql, Object[] params) {
		int updateRows = 0;
		if(getConnection()){
			try {
				ps=conn.prepareStatement(sql);
				//���ռλ��
				for(int i=0;i<params.length;i++){
					ps.setObject(i+1, params[i]);
				}
				updateRows=ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return updateRows;
	}

	// ��ѯ
	public ResultSet executeSQL(String sql,Object[] params) {
		if(getConnection()){
			try {
				ps=conn.prepareStatement(sql);
				//���ռλ��
				for(int i=0;i<params.length;i++){
					ps.setObject(i+1, params[i]);
				}
				rs=ps.executeQuery();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rs;
	}
	
	public ResultSet executeSQL2(String sql,Object[] params) {
		if(getConnection2()){
			try {
				ps=conn.prepareStatement(sql);
				//���ռλ��
				for(int i=0;i<params.length;i++){
					ps.setObject(i+1, params[i]);
				}
				rs=ps.executeQuery();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rs;
	}

	// �ر���Դ
	public boolean closeResource() {
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
		}
		if(ps!=null){
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
		}
		if(stmt!=null){
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}

}

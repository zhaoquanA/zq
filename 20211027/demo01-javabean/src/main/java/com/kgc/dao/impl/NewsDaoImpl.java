package com.kgc.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;

import com.kgc.dao.BaseDao;
import com.kgc.dao.NewsDao;
import com.kgc.entity.News;

public class NewsDaoImpl extends BaseDao implements NewsDao {
	//��������Դ��ȡ������Ϣ
	public void getNewsListByDS() {
		try {
			// 3 ��ȡStatement����ִ��sql���
			String sql = "select * from news_detail";
			Object[] params = {};
			rs = this.executeSQL2(sql, params);
			// 4 ����ִ�н����ResultSet
			while (rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String summary = rs.getString("summary");
				String content = rs.getString("content");
				String author = rs.getString("author");
				Timestamp createDate = rs.getTimestamp("createDate");
				System.out.println(id + "\t" + title + "\t" + summary + "\t"
						+ content + "\t" + author + "\t" + createDate);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeResource();
		}
	}
	
	// ��ѯ������Ϣ
	public void getNewsList() {
		try {
			// 3 ��ȡStatement����ִ��sql���
			String sql = "select * from news_detail";
			Object[] params = {};
			rs = this.executeSQL(sql, params);
			// 4 ����ִ�н����ResultSet
			while (rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String summary = rs.getString("summary");
				String content = rs.getString("content");
				String author = rs.getString("author");
				Timestamp createDate = rs.getTimestamp("createDate");
				System.out.println(id + "\t" + title + "\t" + summary + "\t"
						+ content + "\t" + author + "\t" + createDate);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeResource();
		}
	}

	public void add(int id, int categoryId, String title, String summary,
					String content, Date createdate) {
		String sql = "insert into news_detail (id, categoryId, title, summary, content, createdate) values (?,?,?,?,?,?)";
		Object[] paras = new Object[]{id, categoryId,title,summary, content, createdate};
		if (  executeUpdate(sql , paras ) != -1 ) {
			System.out.println("����ɹ�");
		}
	}


	public void add2(News news ) {
		String sql = "insert into news_detail values (?,?,?,?,?,?,?,?,?)";
		Object[] paras = new Object[9];
		paras[0] = null;
		paras[1] = news.getCategoryId();
		paras[2] = news.getTitle();
		paras[3] = news.getSummary();
		paras[4] = news.getContent();
		paras[5] = news.getPicPath();
		paras[6] = news.getAuthor();
		paras[7] = news.getCreateDate();
		paras[8] = news.getModifyDate();
		executeUpdate(sql , paras );
	}







}

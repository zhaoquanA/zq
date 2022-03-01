package com.kgc.dao;

import com.kgc.entity.News;

import java.util.Date;

public interface NewsDao {
	//根据数据源获取新闻信息
	public void getNewsListByDS() ;

	// 查询新闻信息
	public void getNewsList();

	public void add(int id, int categoryId, String title, String summary,
					String content, Date createdate);

	public void add2(News news );


}

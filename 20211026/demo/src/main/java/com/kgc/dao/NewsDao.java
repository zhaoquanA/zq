package com.kgc.dao;

import java.util.Date;

public interface NewsDao {
	//��������Դ��ȡ������Ϣ
	public void getNewsListByDS() ;

	// ��ѯ������Ϣ
	public void getNewsList();

	// ����������Ϣ
	public void add(int id, int categoryId, String title, String summary,
                    String content, Date createDate) ;
	// �޸����ű���
	public void update(int id, String title);
	// ɾ��������Ϣ
	public void delete(int id);

	// �����ض������������Ϣ
	public void getNewsByTitle(String title);
}

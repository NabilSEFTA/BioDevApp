package com.sdzee.dao;

import java.sql.ResultSet;

import com.sdzee.bean.Article;
import com.sdzee.bean.events;
import com.sdzee.bean.news;

public interface newsInt {
	ResultSet recupererNews();
	ResultSet recupererListNews();
	ResultSet recupererListEvents();
	ResultSet recupererListArticle();
	ResultSet recupererEvents();
	ResultSet recupererArticle();
	void AjouterArticle (Article article);
	void AjouterNews(news news);
	void AjouterEvents(events event);
	
}

package com.github.shanks.hbase.example.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.github.shanks.hbase.example.model.ArticleModel;

@Repository
public interface ArticleRepository {
	
	void insert(ArticleModel model);
	
	ArticleModel find(String articleId);
	
	List<ArticleModel> select(ArticleModel model);
	
}

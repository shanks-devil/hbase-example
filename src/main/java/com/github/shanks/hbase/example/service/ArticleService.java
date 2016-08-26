package com.github.shanks.hbase.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.shanks.hbase.example.model.ArticleModel;
import com.github.shanks.hbase.example.repository.ArticleRepository;

@Service
public class ArticleService {
	
	@Autowired
	private ArticleRepository articleRepository;
	
	public void insert(ArticleModel model) {
		articleRepository.insert(model);
	}
	
	public ArticleModel find(String articleId) {
		return articleRepository.find(articleId);
	}
	
	public List<ArticleModel> select(ArticleModel model) {
		return articleRepository.select(model);
	}
	
}

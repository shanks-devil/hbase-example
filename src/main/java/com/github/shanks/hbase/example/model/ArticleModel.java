package com.github.shanks.hbase.example.model;

import lombok.Data;

@Data
public class ArticleModel {
	
	private String articleId;
	
	private String owner;
	
	private String vote;
	
}

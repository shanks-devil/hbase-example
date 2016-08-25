package com.github.shanks.hbase.example.model;

import org.joda.time.DateTime;

import lombok.Data;

// rowkey is userId & ip
@Data
public class UserAccessModel {
	private String userId;
	
	private String url;
	
	private String ip;
	
	private String prot;
	
	private DateTime onLineTime;
	
	private DateTime offLineTime;
	
}

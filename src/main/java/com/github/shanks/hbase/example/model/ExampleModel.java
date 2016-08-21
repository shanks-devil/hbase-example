package com.github.shanks.hbase.example.model;

import java.io.Serializable;

import org.joda.time.DateTime;

import lombok.Data;

@Data
public class ExampleModel implements Serializable {

	private static final long serialVersionUID = -987207283364479887L;

	private String uuid;
	
	private String name;
	
	private DateTime createTime;
	
	private String note;
	
	private Integer number;
	
	private Boolean administrator;
	
}

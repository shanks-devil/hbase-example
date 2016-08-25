package com.github.shanks.hbase.example.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.github.shanks.hbase.example.model.ExampleModel;

@Repository
public interface ExampleRepository {

	void insert(ExampleModel model);
	
	ExampleModel find(String uuid);
	
	List<ExampleModel> select(ExampleModel model);
}

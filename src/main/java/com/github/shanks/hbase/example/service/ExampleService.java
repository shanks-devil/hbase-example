package com.github.shanks.hbase.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.shanks.hbase.example.model.ExampleModel;
import com.github.shanks.hbase.example.repository.ExampleRepository;

@Service
public class ExampleService {

	@Autowired
	private ExampleRepository exampleRepository;
	
	public void insert(ExampleModel model) {
		exampleRepository.insert(model);
	}
	
	public ExampleModel find(String uuid) {
		return exampleRepository.find(uuid);
	}
	
}

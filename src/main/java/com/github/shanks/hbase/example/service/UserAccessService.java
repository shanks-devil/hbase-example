package com.github.shanks.hbase.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.shanks.hbase.example.model.UserAccessModel;
import com.github.shanks.hbase.example.repository.UserAccessRepository;

@Service
public class UserAccessService {
	
	@Autowired
	private UserAccessRepository userAccessRepository;
	
	public void insert(UserAccessModel model) {
		userAccessRepository.insert(model);
	}
	
	public UserAccessModel find(String userId, String url) {
		return userAccessRepository.find(userId, url);
	}
	
	public List<UserAccessModel> selectByUser(String userId) {
		return userAccessRepository.selectByUser(userId);
	}
	
	public List<UserAccessModel> selectByUrl(String url) {
		return userAccessRepository.selectByUrl(url);
	}
	
}

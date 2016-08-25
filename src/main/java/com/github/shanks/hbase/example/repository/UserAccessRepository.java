package com.github.shanks.hbase.example.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.github.shanks.hbase.example.model.UserAccessModel;

@Repository
public interface UserAccessRepository {

	void insert(UserAccessModel model);
	
	UserAccessModel find(@Param("userId") String userId, @Param("url") String url);
	
	List<UserAccessModel> selectByUser(String userId);
	
	List<UserAccessModel> selectByUrl(String url);
	
}

package com.oaec.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.oaec.pojo.User;


public interface UserMapper {
	
	User login(@Param("username")String username,@Param("userpwd")String userpwd);
	
	User findUserById(int id);
	
	
	List<User> queryAllUsers();
	
	int insertUser(User user);
}

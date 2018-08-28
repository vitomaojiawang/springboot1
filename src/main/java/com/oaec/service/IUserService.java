package com.oaec.service;

import java.util.List;

import com.oaec.pojo.User;

public interface IUserService {
	User login(String name,String pwd);
	
	User findUser(int id);
	
	List<User> queryAllUsers();
	
	int insertUser(User user);
}

package com.oaec.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oaec.mapper.UserMapper;
import com.oaec.pojo.User;
import com.oaec.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {
	@Resource
	private UserMapper userMapper;
	@Override
	public User login(String name, String pwd) {
		// TODO Auto-generated method stub
		return userMapper.login(name, pwd);
	}

	@Override
	public User findUser(int id) {
		// TODO Auto-generated method stub
		return userMapper.findUserById(id);
	}

	@Override
	public List<User> queryAllUsers() {
		// TODO Auto-generated method stub
		return userMapper.queryAllUsers();
	}
	
	@Transactional
	@Override
	public int insertUser(User user) {
		int i = userMapper.insertUser(user);
		int num=1/0;
		return i;
	}

}

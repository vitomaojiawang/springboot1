package com.oaec.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oaec.pojo.User;
import com.oaec.service.IUserService;
@RequestMapping("/users")
@Controller
public class UserController {
	@Resource
	private IUserService userService;
	
	@RequestMapping("/logins.action")
	public String logins(){
		return "login";
	}
	
	@RequestMapping("/login.action")
	public String login(String userName,String userPwd,HttpSession session){
		User user = userService.login(userName, userPwd);
		session.setAttribute("user", user);	
		System.out.println(user);
		return "forward:index.action";
	}
	
	@RequestMapping("/index.action")
	public String index(Model model){
		List<User> users = userService.queryAllUsers();
		model.addAttribute("users", users);
		return "index";
	}
	
	@RequestMapping("/insertUser.action")
	public String insertUser(User user){
		
		int i = userService.insertUser(user);
		
		return "forward:index.action";
	}
	
}

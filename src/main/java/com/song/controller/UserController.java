package com.song.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.song.po.User;
import com.song.service.UserService;

/** 
* @author 作者 E-mail: Sugare
* @version 创建时间：2017年12月25日 下午2:24:50 
* @description 说明：UserController.java
*/
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("findUserById")
	public User findUserById() throws Exception {
		return userService.findUserById(1); 
	}
	
	@RequestMapping("findUsers")
	public List<User> findUsers() throws Exception {
		return userService.findUsers();
	}
	
	@RequestMapping("hello")
	public String hello() {
		return "hello world";
	}
	
	@RequestMapping("pojo")
	public User pojo() {
		User u = new User();
		u.setId(1);
		u.setUsername("song");
		u.setBirthday(new Date());
		u.setAddress("New York");
		u.setSex("boy");
		
		return u;
	}
	
	@RequestMapping("list")
	public List<User> list() {
		List<User> uList = new ArrayList<>();
		User u1 = new User();
		u1.setId(1);
		u1.setUsername("song");
		u1.setBirthday(new Date());
		u1.setAddress("New York");
		u1.setSex("boy");
		
		User u = new User();
		u.setId(1);
		u.setUsername("song");
		u.setBirthday(new Date());
		u.setAddress("New York");
		u.setSex("boy");
		
		uList.add(u);
		uList.add(u1);
		return uList;
	}
	
	@RequestMapping("maps")
	public Map<String, Object> maps(){
		Map<String, Object> maps = new HashMap<String, Object>();
		maps.put("1", "song");
		maps.put("2", "lin");
		
		return maps;
		
	}
	
}

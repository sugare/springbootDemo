package com.song.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.song.mapper.UserMapper;
import com.song.po.User;
import com.song.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User findUserById(Integer id) throws Exception {
		
		return userMapper.findUserById(id);
	}

	@Override
	public List<User> findUsers() throws Exception {
		
		return userMapper.findUsers();
	}
	
}

package com.song.service;

import java.util.List;

import com.song.po.User;

public interface UserService {
	public User findUserById(Integer id) throws Exception;
	
	public List<User> findUsers() throws Exception;
}

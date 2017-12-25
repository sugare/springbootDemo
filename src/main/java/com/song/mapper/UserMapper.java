package com.song.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.song.po.User;

@Mapper
public interface UserMapper {
		
	public User findUserById(Integer id) throws Exception;

	public List<User> findUsers() throws Exception;
	
	
}

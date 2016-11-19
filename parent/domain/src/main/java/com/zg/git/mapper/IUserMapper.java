package com.zg.git.mapper;

import org.springframework.stereotype.Repository;

import com.zg.git.beans.User;

@Repository
public interface IUserMapper {

	public Number insert(User user);
	
	public void update(User user);
	
	public User findById(Integer id); 
	
}

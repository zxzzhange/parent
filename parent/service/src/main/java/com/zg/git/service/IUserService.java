package com.zg.git.service;

import com.zg.git.beans.User;

public interface IUserService {

	public Number insert(User user);
	
	public void update(User user);
	
	public User findById(Integer id);
	
}

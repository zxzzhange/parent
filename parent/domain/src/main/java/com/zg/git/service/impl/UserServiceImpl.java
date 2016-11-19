package com.zg.git.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.zg.git.beans.User;
import com.zg.git.mapper.IUserMapper;
import com.zg.git.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	
	@Value("${redis.server}")
	private String redisServer;
	
	@Value("${redis.port}")
	private String redisPort;
	
	public String getRedisPort() {
		return redisPort;
	}

	public void setRedisPort(String redisPort) {
		this.redisPort = redisPort;
	}

	public String getRedisServer() {
		return redisServer;
	}

	public void setRedisServer(String redisServer) {
		this.redisServer = redisServer;
	}

	public IUserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(IUserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Autowired
	private IUserMapper userMapper;
	
	public Number insert(User user) {
		return userMapper.insert(user);
	}

	public void update(User user) {
		userMapper.update(user);
	}

	public User findById(Integer id) {
		return userMapper.findById(id);
	}

}

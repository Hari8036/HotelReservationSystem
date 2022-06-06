package com.kcsitglobal.service;

import com.kcsitglobal.entity.User;

public interface IUserService {

	public Integer saveUser(User user);
	public User findByUsername(String username);
}

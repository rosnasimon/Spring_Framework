package com.rosna.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.rosna.dao.userDao;
import com.rosna.model.Login;
import com.rosna.model.User;

public class UserServiceImpl implements userService{
	
	@Autowired
	public userDao userdao;
	
	public void register(User user)
	{
		userdao.register(user);
	}

	public User validateUser(Login login) {
		return userdao.validateUser(login);
	}
}

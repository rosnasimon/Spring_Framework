package com.rosna.dao;

import com.rosna.model.Login;
import com.rosna.model.User;

public interface userDao {

	void register(User user);
	User validateUser(Login login);
	
}

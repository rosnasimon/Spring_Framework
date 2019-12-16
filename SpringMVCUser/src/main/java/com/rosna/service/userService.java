package com.rosna.service;

import com.rosna.model.Login;
import com.rosna.model.User;

public interface userService {

	void register(User user);
	User validateUser(Login login);
}

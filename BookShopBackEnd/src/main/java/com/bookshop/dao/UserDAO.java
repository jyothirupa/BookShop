package com.bookshop.dao;

import com.bookshop.model.User;

public interface UserDAO {
	
	public boolean register(User user);

	public boolean login(String username, String password);
	
}

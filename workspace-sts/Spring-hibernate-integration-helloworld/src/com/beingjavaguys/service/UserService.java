package com.beingjavaguys.service;

import java.util.List;

import com.beingjavaguys.domain.User;

public interface UserService {
	public void addUser(User user);

	public List<User> getUser();

	public void display();
}

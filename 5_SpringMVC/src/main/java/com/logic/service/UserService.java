package com.logic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logic.dao.UserDAO;
import com.logic.model.User;


@Service
public class UserService {

	@Autowired
	private UserDAO userDAO;

	public int createUser(User user) {
		return this.userDAO.saveUser(user);
	}

}

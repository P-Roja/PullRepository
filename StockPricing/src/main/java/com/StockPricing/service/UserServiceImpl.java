package com.StockPricing.service;

import java.sql.SQLException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StockPricing.Dao.UserDao;

import com.StockPricing.model.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public void registerUser(User user) throws SQLException {

		userDao.save(user);	}
/*
	@Override
	public boolean loginUser(User user) throws SQLException {
		return userDao.loginUser(user);
	}
*/

}

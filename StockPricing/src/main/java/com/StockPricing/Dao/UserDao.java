package com.StockPricing.Dao;



import org.springframework.data.jpa.repository.JpaRepository;


import com.StockPricing.model.User;

public interface UserDao extends JpaRepository<User, Integer>{
	
	/*public int registerUser(User user) throws SQLException;

	public boolean loginUser(User user) throws SQLException;*/
}

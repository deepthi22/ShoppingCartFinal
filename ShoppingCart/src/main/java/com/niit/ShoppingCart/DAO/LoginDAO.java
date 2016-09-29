package com.niit.ShoppingCart.DAO;



import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.ShoppingCart.model.Login;
@Repository
public interface LoginDAO {

	
	public List<Login> list();
	
	public Login get(int id);
	
	public Login getSingleLogin(int id);
	
	public void save(Login login);
	
	public void update(Login login);
	
	public List getAllLogins();
	
	public void delete(int id);
}

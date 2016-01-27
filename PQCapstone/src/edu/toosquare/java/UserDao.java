package edu.toosquare.java;

import java.util.List;

public interface UserDao {
	boolean create(User obj);
	User findById(long id);
	List<User> getAll();
	boolean update(User obj);
	boolean delete(User obj);
	
}
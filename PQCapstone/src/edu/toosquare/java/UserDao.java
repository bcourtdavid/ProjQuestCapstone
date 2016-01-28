package edu.toosquare.java;

import java.util.List;

public interface UserDao {
	void create(User obj);
	User findById(long id);
	List<User> getAll();
	void update(User obj);
	void delete(User obj);
	
}
package edu.toosquare.java;

import java.util.List;

public interface VolunteersDao {
	void create(Volunteers obj);
	Volunteers findById(long id);
	List<Volunteers> getAll();
	void update(Volunteers obj);
	void delete(Volunteers obj);
}

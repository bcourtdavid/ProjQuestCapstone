package edu.toosquare.java;

import java.util.List;

public interface VolunteersDao {
	boolean create(Volunteers obj);
	Volunteers findById(long id);
	List<Volunteers> getAll();
	boolean update(Volunteers obj);
	boolean delete(Volunteers obj);
}

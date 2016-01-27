package edu.toosquare.java;

import java.util.List;

public interface PerformerDao {
	boolean create(Performer obj);
	Performer findById(long id);
	List<Performer> getAll();
	boolean update(Performer obj);
	boolean delete(Performer obj);
}

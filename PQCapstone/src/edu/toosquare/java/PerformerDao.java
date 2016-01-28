package edu.toosquare.java;

import java.util.List;

public interface PerformerDao {
	void create(Performer obj);
	Performer findById(long id);
	List<Performer> getAll();
	void update(Performer obj);
	void delete(Performer obj);
}

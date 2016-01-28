package edu.toosquare.java;

import java.util.List;

public interface ArtistDao {
	void create(Artist obj);
	Artist findById(long id);
	List<Artist> getAll();
	void update(Artist obj);
	void delete(Artist obj);
}

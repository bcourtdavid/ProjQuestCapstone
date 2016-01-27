package edu.toosquare.java;

import java.util.List;

public interface ArtistDao {
	boolean create(Artist obj);
	Artist findById(long id);
	List<Artist> getAll();
	boolean update(Artist obj);
	boolean delete(Artist obj);
}

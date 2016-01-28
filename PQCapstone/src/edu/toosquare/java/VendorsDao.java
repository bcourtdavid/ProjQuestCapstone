package edu.toosquare.java;

import java.util.List;

public interface VendorsDao {
	void create(Vendors obj);
	Vendors findById(long id);
	List<Vendors> getAll();
	void update(Vendors obj);
	void delete(Vendors obj);
}

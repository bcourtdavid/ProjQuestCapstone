package edu.toosquare.java;

import java.util.List;

public interface VendorsDao {
	boolean create(Vendors obj);
	Vendors findById(long id);
	List<Vendors> getAll();
	boolean update(Vendors obj);
	boolean delete(Vendors obj);
}

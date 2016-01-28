package edu.toosquare.java;

import java.util.List;

public interface ProductDao {
	boolean create(Product obj);
	Product findById(long id);
	List<Product> getAll();
	boolean update(Product obj);
	boolean delete(Product obj);
}

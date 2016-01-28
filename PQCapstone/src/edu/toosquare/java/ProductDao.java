package edu.toosquare.java;

import java.util.List;

public interface ProductDao {
	void create(Product obj);
	Product findById(long id);
	List<Product> getAll();
	void update(Product obj);
	void delete(Product obj);
}

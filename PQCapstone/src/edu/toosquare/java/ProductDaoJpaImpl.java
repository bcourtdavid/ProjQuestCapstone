package edu.toosquare.java;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductDaoJpaImpl implements ProductDao {

	@Autowired
	EntityManagerFactory emf;
	
	@Override
	public void create(Product obj){
		System.out.println("In ProductDaoJpaImpl.create()");
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
	
		try {
			System.out.println("In ProductDaoJpaImpl.create()" + trans);
			trans.begin();
			em.persist(obj);
			trans.commit();
		}
		catch (Exception ex) {
			trans.rollback();
			System.out.println("Rollback due to [" + ex + "]");
		}
		finally {
			em.close();
		}
	}
	
	@Override
	public Product findById(long id) {
		EntityManager em = emf.createEntityManager();
		Product obj = null;
		
		try {
			obj = em.find(Product.class, 1L);
		}
		catch (Exception ex) {
			System.out.println("SQL Error [" + ex + "]");
		}
		finally {
			em.close();
		}
		return obj;
	}
	
	@Override
	public List<Product> getAll() {
		EntityManager em = emf.createEntityManager();
		List<Product> result = new ArrayList<>();
		TypedQuery<Product> query = em.createQuery("Select e FROM Product e", Product.class);
		List<Product> results = (List<Product>)query.getResultList( );
		if (results != null && !results.isEmpty()) {
			return results;
		}
		else
			return null;
	}
	@Override
	public void update(Product obj) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		
		try {
			trans.begin();
			em.merge(obj);
			trans.commit();
		}
		catch (Exception ex) {
			trans.rollback();
			System.out.println("Rollback due to [" + ex + "]");
		}
		finally {
			em.close();
			System.out.println("Product prints out successfully");
		}
	}
	
	@Override
	public void delete(Product obj) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		
		try {
			trans.begin();
			em.remove(obj);
			trans.commit();
		}
		catch (Exception ex) {
			trans.rollback();
			System.out.println("Rollback dur to [" + ex + "]");
		}
		finally {
			em.close();
		}
	}
}

package edu.toosquare.java;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;

public class VendorsDaoJpaImpl implements VendorsDao {
	
	@Autowired
	EntityManagerFactory emf;
	
	@Override
	public boolean create(Vendors obj){
		System.out.println("In VendorsDaoJpaImpl.create()");
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		boolean result = true;
		
		try {
			System.out.println("In VendorsDaoJpaImpl.create()" + trans);
			trans.begin();
			em.persist(obj);
			trans.commit();
		}
		catch (Exception ex) {
			trans.rollback();
			System.out.println("Rollback due to [" + ex + "]");
			result = false;
		}
		finally {
			em.close();
		}
		return result;
	}
	
	@Override
	public Vendors findById(long id) {
		EntityManager em = emf.createEntityManager();
		Vendors obj = null;
		
		try {
			obj = em.find(Vendors.class, 1L);
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
	public List<Vendors> getAll() {
		EntityManager em = emf.createEntityManager();
		List<Vendors> result = new ArrayList<>();
		TypedQuery<Vendors> query = em.createQuery("Select e FROM Vendors e", Vendors.class);
		List<Vendors> results = (List<Vendors>)query.getResultList( );
		if (results != null && !results.isEmpty()) {
			return results;
		}
		else
			return null;
	}
	@Override
	public boolean update(Vendors obj) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		boolean result = true;
		
		try {
			trans.begin();
			em.merge(obj);
			trans.commit();
		}
		catch (Exception ex) {
			trans.rollback();
			System.out.println("Rollback due to [" + ex + "]");
			result = false;
		}
		finally {
			em.close();
		}
		return result;
	}
	
	@Override
	public boolean delete(Vendors obj) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		boolean result = true;
		
		try {
			trans.begin();
			em.remove(obj);
			trans.commit();
		}
		catch (Exception ex) {
			trans.rollback();
			System.out.println("Rollback dur to [" + ex + "]");
			result = false;
		}
		finally {
			em.close();
		}
		return result;
	}
}

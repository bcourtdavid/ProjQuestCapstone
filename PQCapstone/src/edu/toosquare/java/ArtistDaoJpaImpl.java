package edu.toosquare.java;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;

public class ArtistDaoJpaImpl implements ArtistDao{
	
	@Autowired
	EntityManagerFactory emf;
	
	@Override
	public boolean create(Artist obj){
		System.out.println("In ArtistDaoJpaImpl.create()");
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		boolean result = true;
		
		try {
			System.out.println("In ArtistDaoJpaImpl.create()" + trans);
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
	public Artist findById(long id) {
		EntityManager em = emf.createEntityManager();
		Artist obj = null;
		
		try {
			obj = em.find(Artist.class, 1L);
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
	public List<Artist> getAll() {
		EntityManager em = emf.createEntityManager();
		List<Artist> result = new ArrayList<>();
		TypedQuery<Artist> query = em.createQuery("Select e FROM Artist e", Artist.class);
		List<Artist> results = (List<Artist>)query.getResultList( );
		if (results != null && !results.isEmpty()) {
			return results;
		}
		else
			return null;
	}
	@Override
	public boolean update(Artist obj) {
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
	public boolean delete(Artist obj) {
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

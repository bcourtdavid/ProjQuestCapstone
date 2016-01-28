package edu.toosquare.java;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;

public class PerformerDaoJpaImpl implements PerformerDao {
	
	@Autowired
	EntityManagerFactory emf;
	
	@Override
	public void create(Performer obj){
		System.out.println("In PerformerDaoJpaImpl.create()");
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		
		
		try {
			System.out.println("In PerformerDaoJpaImpl.create()" + trans);
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
	public Performer findById(long id) {
		EntityManager em = emf.createEntityManager();
		Performer obj = null;
		
		try {
			obj = em.find(Performer.class, 1L);
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
	public List<Performer> getAll() {
		EntityManager em = emf.createEntityManager();
		List<Performer> result = new ArrayList<>();
		TypedQuery<Performer> query = em.createQuery("Select e FROM Performer e", Performer.class);
		List<Performer> results = (List<Performer>)query.getResultList( );
		if (results != null && !results.isEmpty()) {
			return results;
		}
		else
			return null;
	}
	@Override
	public void update(Performer obj) {
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
			System.out.println("Performer prints out successfully");
		}
	}
	
	@Override
	public void delete(Performer obj) {
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

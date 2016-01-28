package edu.toosquare.java;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;

public class VolunteersDaoJpaImpl implements VolunteersDao {
	
	@Autowired
	EntityManagerFactory emf;
	
	@Override
	public void create(Volunteers obj){
		System.out.println("In VolunteersDaoJpaImpl.create()");
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		
		try {
			System.out.println("In VolunteersDaoJpaImpl.create()" + trans);
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
	public Volunteers findById(long id) {
		EntityManager em = emf.createEntityManager();
		Volunteers obj = null;
		
		try {
			obj = em.find(Volunteers.class, 1L);
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
	public List<Volunteers> getAll() {
		EntityManager em = emf.createEntityManager();
		List<Volunteers> result = new ArrayList<>();
		TypedQuery<Volunteers> query = em.createQuery("Select e FROM Volunteers e", Volunteers.class);
		List<Volunteers> results = (List<Volunteers>)query.getResultList( );
		if (results != null && !results.isEmpty()) {
			return results;
		}
		else
			return null;
	}
	@Override
	public void update(Volunteers obj) {
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
			System.out.println("Volunteers prints out successfully");
		}
	}
	
	@Override
	public void delete(Volunteers obj) {
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

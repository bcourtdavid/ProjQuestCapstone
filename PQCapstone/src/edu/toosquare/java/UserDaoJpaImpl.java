package edu.toosquare.java;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoJpaImpl implements UserDao {
	
	@Autowired
	EntityManagerFactory emf;
	
	@Override
	public void create(User obj){
		System.out.println("In UserDaoJpaImpl.create()");
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		
		try {
			System.out.println("In EntityUserDaoJpaImpl.create()" + trans);
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
	public User findById(long id) {
		EntityManager em = emf.createEntityManager();
		User obj = null;
		
		try {
			obj = em.find(User.class, 1L);
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
	public List<User> getAll() {
		EntityManager em = emf.createEntityManager();
		List<User> result = new ArrayList<>();
		TypedQuery<User> query = em.createQuery("Select e FROM User e", User.class);
		List<User> results = (List<User>)query.getResultList( );
		if (results != null && !results.isEmpty()) {
			return results;
		}
		else
			return null;
	}
	@Override
	public void update(User obj) {
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
			System.out.println("User prints out successfully");
		}
	}
	
	@Override
	public void delete(User obj) {
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
	
//	@PersistenceUnit
//	private EntityManagerFactory entityManagerFactory;
//	
//	/*
//	 * creates a entityManagerFactory instance and starts new Entity transaction
//	 */
//	public void save (User user) {
//		EntityManager entityManager = entityManagerFactory
//				.createEntityManager();
//		EntityTransaction transaction = entityManager.getTransaction();
//		transaction.begin();
//		
//		/*
//		 * persists transient user
//		 */
//		entityManager.persist(user);
//		/*
//		 * commits transaction and closes entityManager instance
//		 */
//		transaction.commit();
//		entityManager.close();
//	}
//	/*
//	 * defines bean for DAO class
//	 */
//	@Bean
//	public UserDaoJpaImpl userDao() {
//		UserDaoJpaImpl dao = new UserDaoJpaImpl();
//		return dao;
//	}
//	/*
//	 * performs bean lookup in main and uses it to persist user entity
//	 */
//	public static void main(String[] args) {
//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext();
//		
//		UserDaoJpaImpl dao = applicationContext.getBean(UserDaoJpaImpl.class);
//		User user = new User();
//		user.setFirst_name(" ");
//		user.setLast_name(" ");
//		user.setEmail_address(" ");
//		user.setPhone_number(" ");
//		user.setEmail_address(" ");
//		user.setCity(" ");
//		user.setState(" ");;
//		user.setZip_code(" ");
//		
//		dao.save(user);
//	}


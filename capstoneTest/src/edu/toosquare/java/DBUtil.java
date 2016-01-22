package edu.toosquare.java;

/**
 * Utility class from Murach p.437
 */
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
	private static final EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("jdbc");
	
	public static EntityManagerFactory getEmFactory() {
		return emf;
	}

}
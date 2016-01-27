package edu.toosquare.java;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;

public class DBUtil {
	/*
	 * creates EntityManagerFactory
	 */
	private static final EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("jdbc");
	
	private static EntityManagerFactory getEmFactory() {
		return emf;
	
	}
@Bean
public UserDaoJpaImpl getUserDoa() {
	return new UserDaoJpaImpl();
}
@Bean
public ArtistDaoJpaImpl getArtistDoa() {
	return new ArtistDaoJpaImpl();
}
@Bean
public PerformerDaoJpaImpl getPerformerDoa() {
	return new PerformerDaoJpaImpl();
}
@Bean
public VendorsDaoJpaImpl getVendorsDao() {
	return new VendorsDaoJpaImpl();
}
@Bean
public VolunteersDaoJpaImpl getVolunteersDao() {
	return new VolunteersDaoJpaImpl();
}

}


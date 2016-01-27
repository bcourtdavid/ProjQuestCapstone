package edu.toosquare.java.config;

import java.util.Random;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import edu.toosquare.java.ArtistDaoJpaImpl;
import edu.toosquare.java.PerformerDaoJpaImpl;
import edu.toosquare.java.ProductDaoJpaImpl;
import edu.toosquare.java.UserDaoJpaImpl;
import edu.toosquare.java.VendorsDaoJpaImpl;
import edu.toosquare.java.VolunteersDaoJpaImpl;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"edu.toosquare.java"})
public class SpringMVCCapstone {
	
	@Bean
	public InternalResourceViewResolver getInternalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	@Bean
	public EntityManagerFactory getEmFactory() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jdbc");
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
	@Bean
	public ProductDaoJpaImpl getProductDao() {
		return new ProductDaoJpaImpl();
	}
}
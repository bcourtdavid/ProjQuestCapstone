package edu.toosquare.java;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	/**
	 * Test inputs into the Capstone_db
	 * 
	 * @return @ResponseBody HTML document with "success" or error message
	 */
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public @ResponseBody String test() {
	
		

		
		User user1, user2, user3;
        Artist artist1, artist2, artist3, artist4;
		Vendors vender1, vender2, vendor3, vendor4;
		Performers performers1, performers2, performers3;
		Volunteer volunteer1, volunteer2, volunteer3, volunteer4;
		Product product1, product2, product3, product4;
		Talent talent1, talent2, talent3, talent4;
		

		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction xaction = em.getTransaction();
		System.out.println("transaction start");
		xaction.begin();

		try {
		// create people 
		user1 = new User("Doneen","Chandler","drfchandler@gmail.com", "210-213-3377", "4474-5578-15985", "5822 Pine Country", "San Antonio", "TX", "78247"); 
		//user2 = new User("Bobby", "Fischer", "brf@gmail.com", "210-213-3377", "4474-5578-15985", "5822 Pine Country", "San Antonio", "TX", "78247");  
		//user3 = new User("Ghingis", "Vlad", "gv@gmail.com", "210-213-3377", "4474-5578-15985", "5822 Pine Country", "San Antonio", "TX", "78247"); 
		
		// create some vendors
		//vender1 = new Vendors("Guess", "Who");
		//vender2 = new Vendors("Magic", "John");
		//vendor3 = new Vendors("Really", "Smity");
		//vendor4 = new Vendors("Oh", "Yes");
		
		// create some artist
		//artist1 = new Artist("Carol", "Smith")
		//artist2 = new Artist("John", "Brown");
		//artist3 = new Artist("Doneen", "Chandler");
		//artist4 = new Artist("Joe","Black");
		
		// create some performers
		//performer1 = new Performer("Carol", "Smith")
		//performer2 = new Performer("John", "Brown");
		//performer3 = new Performer("Doneen", "Chandler");
		//performer4 = new Performer("Joe","Black");
		
		// create some volunteer
		//artist1 = new Artist("Carol", "Smith")
		//artist2 = new Artist("John", "Brown");
		//artist3 = new Artist("Doneen", "Chandler");
		//artist4 = new Artist("Joe","Black");
		
		
		// create some products
		//ArrayList<Vendors> list_of_Xinjector_suppliers = new ArrayList<Vendors>();
		//list_of_Xinjector_suppliers.add(supplier4);
		//list_of_Xinjector_suppliers.add(supplier3);
		//part1 = new Part("Xinjector",list_of_Xinjector_suppliers );
		//supplier4.setPart_name(part1);
		//supplier3.setPart_name(part1);

		//ArrayList<Vendors> list_of_Scompressor_suppliers = new ArrayList<Vendors>();
		//list_of_Scompressor_suppliers.add(supplier2);
		//list_of_Scompressor_suppliers.add(supplier1);
		//part2 = new Part("Scompressor", list_of_Scompressor_suppliers);
		//supplier2.setPart_name(part2);
		//supplier1.setPart_name(part2);

		// create some cars
		//car1 = new Car(Color.BLUE, person1, "FZ47782");
		//car1.add_part(part1);
		//car1.add_part(part2);
		//part2.add_car(car1);
		//person1.getCars_owned().add(car1);

		//car2 = new Car(Color.RED, person2, "MK12345KJ");
		//car2.add_part(part2);
		//part2.add_car(car2);
		//person2.getCars_owned().add(car2);

		//car3 = new Car(Color.GREEN, person1, "CKJ234738");
		//car3.add_part(part1);
		//part1.add_car(car3);
		//person1.getCars_owned().add(car3);

		//car4 = new Car(Color.RED, person2, "FZ3WUIJ02");
		//car4.add_part(part2);
		//part2.add_car(car4);
		//person2.getCars_owned().add(car4);

		//persist just the User objects to test CascadeType.PERSIST
		em.persist(user1);
		//em.persist(user2);
		//em.persist(user3);
		System.out.println("transaction 1 end");
		xaction.commit();
		
		// make a change on existing object
		//System.out.println("transaction 2 start");
		//em.getTransaction().begin();
		//user1.setLast("Jones");
		//System.out.println("transaction 2 end");
		//xaction.commit();
		
		}

		catch (Exception ex) {
			System.out.println("Exception: rolling back " + ex);
			xaction.rollback();
		}

		finally {
			em.close();
		}
		return "<html><body>done.</body></html>";

	}

}
package edu.toosquare.java;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.lang.Object;

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
	 * Test inputs into the capstone_db
	 * 
	 * @return @ResponseBody HTML document with "success" or error message
	 */
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public @ResponseBody String test() {

		User user1, user2, user3, user4;
		Artist artist1, artist2, artist3, artist4, artist5, artist6, artist7, artist8, artist9, artist10;
		Vendors vender1, vender2, vendor3, vendor4, vendor5, vendor6, vendor7, vendor8;
		Performer performer1, performer2, performer3, performer4, performer5, performer6, performer7, performer8, performer9, performer10, performer11;
		Volunteers volunteer1, volunteer2, volunteer3, volunteer4;
		Product product1, product2, product3, product4;
		//Talent talent1, talent2, talent3, talent4;

		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction xaction = em.getTransaction();
		System.out.println("transaction start");
		xaction.begin();

		try {
			//create people 
			//user1 = new User("Doneen","Chandler","drfchandler@gmail.com", "210-213-3377", "4474-5578-15985", "5822 Scorpian Street", "San Antonio", "TX", "78247"); 
			//user2 = new User("Yuliana", "Ramirez", "yram727@yahoo.com", "210-577-9378", "4464-5778-14995", "123 Virgo Street", "San Antonio", "TX", "78247");  
			//user3 = new User("David", "Betancourt", "d.a.betancourt@gmail.com", "210-430-7166","4544-56745-19985", "789 Scorpio Avenue", "San Antonio", "TX", "78247"); 
		    //user4 = new User("Terry", "Wolf", "xdragonspiritx@gmail.com", "210-988-3932","4555-56955-19885", "695 Leo Street", "San Antonio", "TX", "78247"); 

			long id;
			// create some vendors
			vender1 = new Vendors(id,"Gus", "Campos", "Gcampos@gmail.com", "210-239-4892", "Gus' Empanadas", new Product("Mexican"));
			vender2 = new Vendors(id,"Tikos", "Chamoyadas", "Trodriguez@yahoo.com", "210-832-3847", "Tikos Chamoyadas", new Product("Mexican"));
			vendor3 = new Vendors(id,"Robert", "Garcia", "Rgarcia@garcia.net", "210-545-3264", "Mr. Fish", new Product("Seafood"));
			vendor4 = new Vendors(id,"James", "McClelan", "Jmcclelan@gmail.com", "210-739-3827", "Smoke BBQ", new Product("BBQ"));
			vendor5 = new Vendors(id,"Lia", "Johnson", "Ljohnson@gmail.com", "210-583-4842", "Khoury's Mediterranean Grill",new Product("Mediterranean"));
			vendor6 = new Vendors(id,"Phil", "Harris", "Pharris@gmail.com", "210-232-5934", "Philly's Phamous Cheesesteaks", new Product("American"));
			vendor7 = new Vendors(id,"Jane", "Clark", "Jclark@yahoo", "210-458-2843", "CheesyJane's",new Product("American"));
			vendor8 = new Vendors(id,"Mattew", "Pezez", "Mperez@gmail.com", "210-387-3737", "Smoke Shack BBQ", new Product("BBQ"));

			// create some artist
			artist1 = new Artist(id,"Martha", "Rodriguez", "Mrodriguez@SADC.com", "210-555-0987", "San Antonio Dance Company");
			artist2 = new Artist(id, "Stephanie", "Miller", "Smiller@GCA.com", "210-366-3844", "Guadalupe Cultural Arts");
			artist3 = new Artist(id,"Susan", "Budge", "Sbudge@budge.net", "210-349-3943","Sbudge, Inc.");
			artist4 = new Artist(id,"Diana","Kersey", "Dkersey@kersey.net", "210-474-3345", "Kersey Ceramics");
			artist5 = new Artist(id,"Susan", "Budge", "Sbudge@budge.net", "210-349-3943", "Sbudge, Inc.");
			artist6 = new Artist(id,"Nancy","Hines", "Nhines@Sastudios.com", "210-884-4598", "Hines Studios");
			artist7 = new Artist(id,"Bill", "FitzGibbons", "Bgibbons@Fitz.com", "210-888-2389", "FitzGibbons Scultures, Inc.");
			artist8 = new Artist(id,"Nic", "Boblique", "Nboblique@att.net", "210-934-7123", "Bobliqque, Inc.");
			artist9 = new Artist(id,"Bill", "FitzGibbons", "Bgibbons@Fitz.com", "210-888-2387", "FitzGibbons Scultures, Inc.");
			artist10 = new Artist(id,"Xavier", "DeRichemont", "Xrichemont@att.net", "210-487-6294", "DeRichemont Lights");

			// create some performers
			performer1 = new Performer(id, "Cactus County Band", "Eddie", "Lewis", "Elewis@gmail.com", "210-987-8765");
			performer2 = new Performer(id, "La Sombra", "August", "Stewart", "Astewart@att.net", "210-324-2356");
			performer3 = new Performer(id, "SA Light", "John", "Esparza", "jesparza@att.net", "210-675-0987");
			performer4 = new Performer(id, "Clint Taft & the Buck Wild Band", "Marcus","Aubriel", "Maubriel@yahoo.com", "210-456-7890");
			performer5 = new Performer(id, "Texas Tornados", "Steven","Martinez", "Smartinez@gmail.com", "210-345-2312");
			performer6 = new Performer(id, "Lonely Horse", "Tanner","Payne", "tpaine@yahoo.com", "512-673-2567");
			performer7 = new Performer(id, "Texas Unlimited Band", "Jashua","Brown", "jbrown@yahoo.com", "210-768-0567");
			performer8 = new Performer(id, "Los Palominos", "Jim","Garcia", "Jgarcia@att.net", "210-546-2984");
			performer9 = new Performer(id, "Nothng More", "Robert","Fernandez", "Rfernandez@gmail.com", "512-232-2342");
			performer10 = new Performer(id, "Zak Perry Band", "Zak","Perry", "zperry@gmail.com", "512-672-48565");
			performer11 = new Performer(id, "Los Musicales", "Sam","Rodriguez", "Srodriguez@yahoo.com", "856-983-4134");

			// create some volunteer
			volunteer1 = new Volunteers(id,"Jonathan", "Sakian", "Jsakian@yahoo.com", "comments");
			volunteer2 = new Volunteers(id,"Hector", "Hernandez", "Hhernandez@yahoo.com", "comments");
			volunteer3 = new Volunteers(id,"Jonathan", "Graff", "Jgraff@gmail.com", "comments");
			volunteer4 = new Volunteers(id,"Peter","Isburgh", "Pisburgh@yahoo.com", "comments");

			//persist just the User objects to test CascadeType.PERSIST
			//em.persist(user1);
			//em.persist(user2);
			//em.persist(user3);
			//em.persist(user4);
			System.out.println("transaction 1 end");
			xaction.commit();

			//persist just the Vendor objects to test CascadeType.PERSIST
			em.persist(vender1);
			em.persist(vender2);
			em.persist(vendor3);
			em.persist(vendor4);
			em.persist(vendor5);
			em.persist(vendor6);
			em.persist(vendor7);
			em.persist(vendor8);
			System.out.println("transaction 1 end");
			xaction.commit();
			
			//persist just the Artist objects to test CascadeType.PERSIST
			em.persist(artist1);
			em.persist(artist2);
			em.persist(artist3);
			em.persist(artist4);
			em.persist(artist5);
			em.persist(artist6);
			em.persist(artist7);
			em.persist(artist8);
			em.persist(artist9);
			em.persist(artist10);
			System.out.println("transaction 1 end");
			xaction.commit();

			//persist just the Performers objects to test CascadeType.PERSIST
			em.persist(performer1);
			em.persist(performer2);
			em.persist(performer3);
			em.persist(performer4);
			em.persist(performer5);
			em.persist(performer6);
			em.persist(performer7);
			em.persist(performer8);
			em.persist(performer9);
			em.persist(performer10);
			em.persist(performer11);
			System.out.println("transaction 1 end");
			xaction.commit();
			
			//persist just the Volunteers objects to test CascadeType.PERSIST
			em.persist(volunteer1);
			em.persist(volunteer2);
			em.persist(volunteer3);
			em.persist(volunteer4);
			System.out.println("transaction 1 end");
			xaction.commit();
			
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
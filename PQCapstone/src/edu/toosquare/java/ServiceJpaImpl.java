package edu.toosquare.java;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceJpaImpl implements ServiceJpaIntf{

	@Autowired
	UserDaoJpaImpl UserDao;
	
//	@Autowired
//	ArtistDaoJpaImpl ArtistDao;
//	
//	@Autowired
//	PerformerDaoJpaImpl PerformerDao;
//	
//	@Autowired
//	ProductDaoJpaImpl ProductDao;
//	
//	@Autowired
//	VendorsDaoJpaImpl VendorsDao;
	
	@Autowired
	VolunteersDaoJpaImpl VolunteersDao;

@Override
public User createAnewUser(User obj) {
	UserDao.create(obj);
	return obj;
}

@Override
public Volunteers createAnewVolunteers(Volunteers obj) {
	VolunteersDao.create(obj);
	return obj;
}

}

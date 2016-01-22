package edu.toosquare.java;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Performer implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
<<<<<<< HEAD
	private long idperformer;
	
=======
	private long idperformers;
>>>>>>> 8e72cae3d2048efe29a82e1732da7b4cd2ecbfd6
	private String group_name;
	private String contact_firstName;
	private String contact_lastName;
	private String contact_emailAddress;
	private String contact_phoneNumber;

	Performer() {

	}

	public Performer(String group_name, String contact_firtName,
			String contact_lastName, String contact_emailAddress,
<<<<<<< HEAD
			String contact_phoneNumber) {
		this.idperformer = idperformer;
=======
			String contact_phoneNumber, String talent) {
>>>>>>> 8e72cae3d2048efe29a82e1732da7b4cd2ecbfd6
		this.group_name = group_name;
		this.contact_firstName = contact_firstName;
		this.contact_lastName = contact_lastName;
		this.contact_emailAddress = contact_emailAddress;
	}

<<<<<<< HEAD
	public String getIdperformer() {
		return idperformer;
	}

	public void setIdperformer(String idperformer) {
		this.idperformer = idperformer;
=======
	public long getIdperformers() {
		return idperformers;
	}

	public void setIdperformers(long idperformers) {
		this.idperformers = idperformers;
>>>>>>> 8e72cae3d2048efe29a82e1732da7b4cd2ecbfd6
	}

	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}

	public String getContact_firstName() {
		return contact_firstName;
	}

	public void setContact_firstName(String contact_firstName) {
		this.contact_firstName = contact_firstName;
	}

	public String getContact_lastName() {
		return contact_lastName;
	}

	public void setContact_lastName(String contact_lastName) {
		this.contact_lastName = contact_lastName;
	}

	public String getContact_emailAddress() {
		return contact_emailAddress;
	}

	public void setContact_emailAddress(String contact_emailAddress) {
		this.contact_emailAddress = contact_emailAddress;
	}

	public String getContact_phoneNumber() {
		return contact_phoneNumber;
	}

	public void setContact_phoneNumber(String contact_phoneNumber) {
		this.contact_phoneNumber = contact_phoneNumber;
	}

	
}

package edu.toosquare.java;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Volunteers implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String iduser;
	private String first_name;
	private String last_name;
	private String email_address;
	private String phone_number;
	private String comments;

	Volunteers() {

	}

	public Volunteers(String iduser, String first_name, String last_name,
			String email_address, String phone_number, String comments) {
		this.iduser = iduser;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email_address = email_address;
		this.phone_number = phone_number;
		this.comments = comments;

	}

	public String getIduser() {
		return iduser;
	}

	public void setIduser(String iduser) {
		this.iduser = iduser;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
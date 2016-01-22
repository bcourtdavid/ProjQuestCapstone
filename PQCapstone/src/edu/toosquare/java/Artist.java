package edu.toosquare.java;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Artist implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idartist;
	private String first_name;
	private String last_name;
	private String email_address;
	private String phone_number;
	private String company_name;
	@OneToOne
	private String talent;

	Artist() {

	}

	public Artist(String first_name, String last_name, String email_address,
			String phone_number, String company_name, String talent) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.email_address = email_address;
		this.company_name = company_name;
		this.talent = talent;
	}

	public long getIdartist() {
		return idartist;
	}

	public void setIduser(long idartist) {
		this.idartist = idartist;
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

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getTalent() {
		return talent;
	}

	public void setTalent(String talent) {
		this.talent = talent;
	}

}



package edu.toosquare.java;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Talent {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@OneToOne
	private String iduser;
	private String talent;

	Talent() {

	}

	public Talent(String iduser, String talent) {
		this.talent = talent;
	}

	public String getIduser() {
		return iduser;
	}

	public void setIduser(String iduser) {
		this.iduser = iduser;
	}

	public String getTalent() {
		return talent;
	}

	public void setTalent(String talent) {
		this.talent = talent;
	}

}


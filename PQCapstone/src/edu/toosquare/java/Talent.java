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
	private long idtalent;
	private String talent;

	Talent() {

	}

	public Talent(String talent) {
		this.talent = talent;
	}

	public long getIdtalent() {
		return idtalent;
	}

	public void setIdtalent(long idtalent) {
		this.idtalent = idtalent;
	}

	public String getTalent() {
		return talent;
	}

	public void setTalent(String talent) {
		this.talent = talent;
	}

}


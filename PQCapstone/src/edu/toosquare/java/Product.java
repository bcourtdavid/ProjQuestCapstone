package edu.toosquare.java;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Product implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@OneToOne
	private long idproduct;
	private String product;

	Product() {

	}

	private Product(String product) {
		this.product = product;
	}

	public long getIdproduct() {
		return idproduct;
	}

	public void setIduser(long idproduct) {
		this.idproduct = idproduct;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

}

package edu.toosquare.java;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String product;
	
	Product() {
		
	}
		public Product(String product) {
			this.product = product;
		}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}
	
}

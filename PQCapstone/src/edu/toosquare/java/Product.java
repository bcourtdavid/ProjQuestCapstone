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
	private Product product;
	
	Product() {
		
	}
		public Product(Product product) {
			this.product = product;
		}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	public Product(String Product) {
		this.product = product;
	}
	
}

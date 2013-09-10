package com.ticketmonster.sales.service;

import java.io.Serializable;
import java.util.List;

import com.ticketmonster.sales.domain.Product;

public interface ProductManager extends Serializable {

	 public void increasePrice(int percentage);
	    
	 public List<Product> getProducts();
}

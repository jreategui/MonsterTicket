package com.ticketmoster.sales.repository;

import java.util.List;

import com.ticketmonster.sales.domain.Product;



public interface ProductDao {

	  public List<Product> getProductList();

	    public void saveProduct(Product prod);

	
}

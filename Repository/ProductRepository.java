package com.Product.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Product.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	public List<Product> findByPrice(double price);

	@Query("select p from Product p where p.price between ?1 and ?2")
	public List<Product> fetchByPriceBetween(double startPrice, double endPrice);
}

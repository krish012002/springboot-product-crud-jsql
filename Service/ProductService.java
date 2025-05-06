package com.Product.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Product.Entity.Product;
import com.Product.Repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository repo;

	public Product saveProduct(Product p) {
		return repo.save(p);
	}

	public Product getById(int id) {
		return repo.findById(id).orElse(null);
	}

	public List<Product> getAllProducts() {
		return repo.findAll();
	}

	public String deleteById(int id) {
		Optional<Product> product = repo.findById(id);

		if (product.isPresent()) {
			repo.deleteById(id);
			return "Product Deleted";
		}
		return "Product not found";
	}

	public Product updateProductByPrice(int id, double price) {
		Product p = getById(id);

		if (p != null) {
			p.setPrice(price);
			return repo.save(p);
		}
		return null;
	}

	public Product updateProductAll(int id, Product p) {

		Product newProduct = getById(id);

		if (newProduct != null) {
			p.setId(id);
			return repo.save(p);
		}
		return null;
	}

	public List<Product> fetchByPrice(double price) {
		return repo.findByPrice(price);
	}

	public List<Product> fetchByPriceBetween(double s, double e) {
		return repo.fetchByPriceBetween(s, e);
	}
}

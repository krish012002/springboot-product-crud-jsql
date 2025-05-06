package com.Product.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Product.Entity.Product;
import com.Product.Service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService service;

	@PostMapping("/SaveProduct")
	public Product saveProducts(@RequestBody Product p) {
		return service.saveProduct(p);
	}

	@GetMapping("/FetchById")
	public Product fetchById(@RequestParam int id) {
		return service.getById(id);
	}

	@GetMapping("/FetchAllProduct")
	public List<Product> fetchAllProduct() {
		return service.getAllProducts();
	}

	@DeleteMapping("/DeleteById")
	public String deleteById(@RequestParam int id) {
		return service.deleteById(id);
	}

	@PutMapping("UpdateProductByPrice")
	public Product updateProductByPrice(@RequestParam int id, @RequestParam double price) {
		return service.updateProductByPrice(id, price);
	}

	@PutMapping("/UpdateProductAll")
	public Product updateAll(@RequestParam int id, @RequestBody Product p) {
		return service.updateProductAll(id, p);
	}

	@GetMapping("/FetchByPrice")
	public List<Product> fetchByPrice(@RequestParam double price) {
		return service.fetchByPrice(price);
	}

	@GetMapping("/FetchByPriceBetween")
	public List<Product> fetchByPriceBetween(@RequestParam double s, @RequestParam double e) {
		return service.fetchByPriceBetween(s, e);
	}

}

/**
 * 
 */
package com.mm.ecom.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dorak
 *
 */

@RestController
@RequestMapping("/cart")
public class CartController {
	
	private List<String> cart;

	public CartController() {
		cart = new ArrayList<>();
	}
	// localhost:8080/cart
	@GetMapping
	public List<String> listAllProductsInCart(){
		System.out.println("listAllProductsInCart");
		return cart;
	}
	
	@GetMapping("/{index}")
	public String getProductsInCart(@PathVariable int index){
		return cart.get(index);
	}
	
	@PostMapping("/{product}")
	public String addProductToCart(@PathVariable(name="product") String item) {
		cart.add(item);
		return item;
	}
	
	@PutMapping("/{index}/{product}")
	public String updateProductInCart(@PathVariable int index, @PathVariable String product) {
		String oldProduct = cart.get(index);
		cart.set(index, product);
		return oldProduct;
	}
	
	@DeleteMapping("/{index}")
	public String deleteProductFromCart(@PathVariable int index) {
		//String deletingProduct = cart.get(index);
		return cart.remove(index);
	//	return deletingProduct;
	}
	
}

package com.abc.cpservice.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.abc.cpservice.model.CustomerProduct;
import com.abc.cpservice.service.CustomerProductService;


@RestController
@RequestMapping("/customerproduct")
public class CustomerProductController {
	
	@Autowired
	private CustomerProductService customerProductService;
	
	
	@PostMapping("/savee") //save purpose we this
	public ResponseEntity<CustomerProduct> addProduct(@RequestBody CustomerProduct customerProduct) {  //ResponseEntity represents an HTTP response, including headers, body, and status. While @ResponseBody puts the return value into the body of the response, ResponseEntity also allows us to add headers and status code.
		
		
		CustomerProduct newProduct = customerProductService.saveCustomerProduct(customerProduct);
		
		ResponseEntity<CustomerProduct> responseEntity = new ResponseEntity<>(newProduct,HttpStatus.CREATED);
		
		return responseEntity;	
		
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<CustomerProduct> fetchOrder(@PathVariable("id")int customerProductId){
		
		CustomerProduct orderDetails= customerProductService.getCustomerProductDetails(customerProductId);
		
		return new ResponseEntity<>(orderDetails,HttpStatus.CREATED);
	}

}

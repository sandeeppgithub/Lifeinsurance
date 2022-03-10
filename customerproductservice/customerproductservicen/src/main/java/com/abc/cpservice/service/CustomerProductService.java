package com.abc.cpservice.service;



import com.abc.cpservice.model.CustomerProduct;



public interface CustomerProductService {
	
	public CustomerProduct saveCustomerProduct(CustomerProduct customerProduct);
	
	

	public CustomerProduct getCustomerProductDetails(int customerProductId);


}

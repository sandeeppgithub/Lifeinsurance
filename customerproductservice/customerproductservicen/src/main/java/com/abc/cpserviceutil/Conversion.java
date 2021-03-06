package com.abc.cpserviceutil;

import org.springframework.stereotype.Component;

import com.abc.cpservice.entity.CustomerProductEntity;
import com.abc.cpservice.model.CustomerProduct;


public class Conversion {
	
	public static  CustomerProductEntity modelToEntity(CustomerProduct customerProduct) {

		CustomerProductEntity customerProductEntity = new CustomerProductEntity();
		customerProductEntity.setCustomerProductId(customerProduct.getCustomerProductId());
		customerProductEntity.setCustomerId(customerProduct.getCustomerId());
		customerProductEntity.setDateOfMaturity(customerProduct.getDateOfMaturity());
		customerProductEntity.setNomineeId(customerProduct.getNomineeId());
		customerProductEntity.setPremiumAmount(customerProduct.getPremiumAmount());
		customerProductEntity.setPremiumType(customerProduct.getPremiumType());
		customerProductEntity.setProductId(customerProduct.getProductId());
		return customerProductEntity;
		

		
	}
	
	public static  CustomerProduct entityToModel(CustomerProductEntity customerProductEntity) {

		CustomerProduct customerProduct = new CustomerProduct();
		customerProduct.setCustomerProductId(customerProductEntity.getCustomerProductId());
		customerProduct.setCustomerId(customerProductEntity.getCustomerId());
		customerProduct.setDateOfMaturity(customerProductEntity.getDateOfMaturity());
		customerProduct.setNomineeId(customerProductEntity.getNomineeId());
		customerProduct.setPremiumAmount(customerProductEntity.getPremiumAmount());
		customerProduct.setPremiumType(customerProductEntity.getPremiumType());
		customerProduct.setProductId(customerProductEntity.getProductId());
		return customerProduct;
		

		
	}
	
	

}

package com.abc.cpservice.service;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.cpservice.entity.CustomerProductEntity;
import com.abc.cpservice.exceptionhandling.OrderNotFoundException;
import com.abc.cpservice.model.CustomerProduct;
import com.abc.cpservice.repository.CustomerProductRepository;
import com.abc.cpserviceutil.Conversion;


@Service
public class CustomerProductServiceImpl implements CustomerProductService {

	@Autowired
	private CustomerProductRepository customerProductRepository;
	
   
	
	/******************************************
	 - Method Name      : saveCustomerProduct
	 - Input Parameters : CustomerProduct customerProduct
	 - Return type      : CustomerProduct
	 - Author           : Sandeep Kumar Narsepalle
	 - Creation Date    : 06-03-2022
	 - Description      : Inserting the CustomerProduct  information entered by customer   into  the database.
	  ******************************************/
	

	@Override
	public CustomerProduct saveCustomerProduct(CustomerProduct customerProduct) {
		
         CustomerProductEntity savedProduct=customerProductRepository.save(Conversion.modelToEntity(customerProduct));
  		return Conversion.entityToModel(savedProduct);
  		
		
        
	}
	/******************************************
	 - Method Name      : getCustomerProductDetails
	 - Input Parameters : int customerProductId
	 - Return type      : CustomerProduct
	 - Author           : Sandeep Kumar Narsepalle
	 - Creation Date    : 06-03-2022
	 - Description      : Get the CustomerProductDetailsById    from  the database.
	  ******************************************/

	@Override
	public CustomerProduct getCustomerProductDetails(int customerProductId)throws OrderNotFoundException  {
		Optional<CustomerProductEntity> optionalOrder = customerProductRepository.findById(customerProductId);
		if(!optionalOrder.isPresent()) {
			throw new OrderNotFoundException("CustomerProductDetails not found with CustomerProduct id :"+customerProductId);
		}
		return Conversion.entityToModel(optionalOrder.get());
	}

	


}

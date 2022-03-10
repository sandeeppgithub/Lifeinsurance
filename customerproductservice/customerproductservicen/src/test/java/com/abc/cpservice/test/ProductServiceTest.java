package com.abc.cpservice.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.abc.cpservice.entity.CustomerProductEntity;
import com.abc.cpservice.model.CustomerProduct;
import com.abc.cpservice.repository.CustomerProductRepository;
import com.abc.cpservice.service.CustomerProductService;
import com.abc.cpservice.service.CustomerProductServiceImpl;
import com.abc.cpserviceutil.Conversion;

@SpringBootTest
public class ProductServiceTest {
	@InjectMocks
	private CustomerProductService customerProductService = new CustomerProductServiceImpl();

	@Mock
	private CustomerProductRepository customerProductRepository;

	@Mock
	private Conversion conversion;


	@Test
	public void testgetCustomerProductDetails() {
		CustomerProductEntity customerProduct = new CustomerProductEntity();
		customerProduct.setCustomerProductId(1);
		customerProduct.setCustomerId(2);
		customerProduct.setDateOfMaturity(LocalDate.of(2000, 10, 10));
		customerProduct.setPremiumType(6);
		customerProduct.setPremiumAmount(12334);
		customerProduct.setProductId(23);
		customerProduct.setNomineeId(324);

		Optional<CustomerProductEntity> option=Optional.of(customerProduct);
		int customerProductId = 1;
		int customerId=1;

		when(customerProductRepository.findById(1)).thenReturn(option);

		CustomerProduct existing = customerProductService.getCustomerProductDetails(customerProductId);

		// assertEquals(customerProduct.getCustomerProductId(),existing.getCustomerProductId());
		assertEquals(customerProduct.getCustomerProductId(), existing.getCustomerProductId());
		
		assertEquals(customerProduct.getCustomerId(), existing.getCustomerId());
		
		
	}

	

}

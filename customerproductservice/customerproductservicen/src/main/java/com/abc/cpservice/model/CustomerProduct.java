package com.abc.cpservice.model;



import java.time.LocalDate;


public class CustomerProduct {

	
	private int customerProductId;

	private int customerId;

	private int productId;

	private LocalDate dateOfMaturity;
	
	private int premiumType;

	private double premiumAmount;

	private int nomineeId;
	
	public int getCustomerProductId() {
		return customerProductId;
	}

	public void setCustomerProductId(int customerProductId) {
		this.customerProductId = customerProductId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public LocalDate getDateOfMaturity() {
		return dateOfMaturity;
	}

	public void setDateOfMaturity(LocalDate dateOfMaturity) {
		this.dateOfMaturity = dateOfMaturity;
	}

	
	public int getNomineeId() {
		return nomineeId;
	}

	public void setNomineeId(int nomineeId) {
		this.nomineeId = nomineeId;
	}

	public int getPremiumType() {
		return premiumType;
	}

	public void setPremiumType(int premiumType) {
		this.premiumType = premiumType;
	}

	public double getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

}

/**
 * 
 */
package com.scb.banking.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;


/**
 * @author test
 *
 */
public class Bank {
	
	private String bankCode;
	private String bankName;
	
	@Autowired
	@Qualifier("customer1")
	private Customer customer;
	/**
	 * @return the bankCode
	 */
	public String getBankCode() {
		return bankCode;
	}
	/**
	 * @param bankCode the bankCode to set
	 */
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}
	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	
	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}
	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bank [bankCode=" + bankCode + ", bankName=" + bankName
				+ ", customer=" + customer + "]";
	}
	
	@Bean
	public DataSource getInstance(){
		
		return new DataSource();
	}

}

/**
 * 
 */
package com.scb.banking.entities;

import java.util.List;

/**
 * @author test
 *
 */
public class Bank {
	
	private String bankCode;
	private String bankName;
	private List<Customer> customers;
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
	 * @return the customers
	 */
	public List<Customer> getCustomers() {
		return customers;
	}
	/**
	 * @param customers the customers to set
	 */
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bank [bankCode=" + bankCode + "\n bankName=" + bankName
				+ "\n customers=" + customers + "]";
	}
	
	

}

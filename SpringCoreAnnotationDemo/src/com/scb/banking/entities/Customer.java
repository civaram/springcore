/**
 * 
 */
package com.scb.banking.entities;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author test
 *
 */
public class Customer {
	
	
	private int customerId;
	private String name;
	private Date dob;
	private Address permAddress;
	private Address commAddress;
	private ContentInfo contentInfo;
	@Autowired
	private Account account;
	/**
	 * @param customerId
	 * @param name
	 * @param dob
	 * @param permAddress
	 * @param commAddress
	 * @param contentInfo
	 * @param account
	 */
	@Autowired
	public Customer(int customerId, String name, Date dob, Address permAddress,
			Address commAddress, ContentInfo contentInfo, Account account) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.dob = dob;
		this.permAddress = permAddress;
		this.commAddress = commAddress;
		this.contentInfo = contentInfo;
		this.account = account;
	}
	/**
	 * @return the customerId
	 */
	public int getCustomerId() {
		return customerId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}
	/**
	 * @return the permAddress
	 */
	public Address getPermAddress() {
		return permAddress;
	}
	/**
	 * @return the commAddress
	 */
	public Address getCommAddress() {
		return commAddress;
	}
	/**
	 * @return the contentInfo
	 */
	public ContentInfo getContentInfo() {
		return contentInfo;
	}
	/**
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name
				+ ", dob=" + dob + ", permAddress=" + permAddress
				+ ", commAddress=" + commAddress + ", contentInfo="
				+ contentInfo + ", account=" + account + "]";
	}
	
	

	
	


	

}

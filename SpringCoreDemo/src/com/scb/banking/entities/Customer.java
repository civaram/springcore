/**
 * 
 */
package com.scb.banking.entities;

import java.util.Date;

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
	

	/**
	 * @param customerId
	 * @param name
	 * @param dob
	 * @param permAddress
	 * @param commAddress
	 * @param contentInfo
	 */
	public Customer(int customerId, String name, Date dob, Address permAddress,
			Address commAddress, ContentInfo contentInfo) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.dob = dob;
		this.permAddress = permAddress;
		this.commAddress = commAddress;
		this.contentInfo = contentInfo;
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


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + "\n name=" + name
				+ "\n dob=" + dob + "\n permAddress=" + permAddress
				+ "\n commAddress=" + commAddress + "\n contentInfo="
				+ contentInfo + "]";
	}


	





	
	


	

}

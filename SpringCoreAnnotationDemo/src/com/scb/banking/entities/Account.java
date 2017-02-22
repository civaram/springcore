/**
 * 
 */
package com.scb.banking.entities;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author test
 *
 */
@Component
@Lazy
public class Account {

	private String accountNumber;
	
	private String accountType;
	
	private long balance;

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * @return the balance
	 */
	public long getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AccountInfo [accountNumber=" + accountNumber + ", accountType="
				+ accountType + ", balance=" + balance + "]";
	}
	
	
	
	
}

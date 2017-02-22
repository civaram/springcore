/**
 * 
 */
package com.scb.banking.impl;

import com.scb.banking.ITransaction;

/**
 * @author test
 *
 */
public class CCTransaction implements ITransaction {

	/* (non-Javadoc)
	 * @see com.scb.banking.ITransaction#payment(java.lang.Integer)
	 */
	@Override
	public String payment(Integer Amount) {
		// TODO Auto-generated method stub
		String response = null;
		
		if(Amount>=100){
			
			response = "your Credit card  Transaction is success";
		}else{
			
			response = "your have to made min. 100 txn";
		}
			
		return response;
	}

}

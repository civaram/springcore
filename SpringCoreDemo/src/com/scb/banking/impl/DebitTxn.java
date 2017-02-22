package com.scb.banking.impl;

import com.scb.banking.ITransaction;

public class DebitTxn implements ITransaction {

	@Override
	public String payment(Integer Amount) {// TODO Auto-generated method stub
		String response = null;
		
		if(Amount>=100){
			
			response = "insufficient balance";
		}else{
			
			response = "your txn is success";
		}
			
		return response;
	}

}

/**
 * 
 */
package com.scb.banking.utility;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.scb.banking.entities.Account;
import com.scb.banking.entities.Bank;
import com.scb.banking.entities.Customer;
import com.scb.banking.entities.DataSource;

/**
 * @author test
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Resource resource = new ClassPathResource("SpringBean.xml");
		ApplicationContext  applnContext = new ClassPathXmlApplicationContext("spring-context.xml");
		/*Customer customer = (Customer) applnContext.getBean("customer");
		System.out.println(customer);*/
		Bank bank = (Bank) applnContext.getBean("bank");
		
		
		
		Account account = bank.getCustomer().getAccount();
		account.setAccountNumber("1000");
		account.setAccountType("SA");
		account.setBalance(1850349058);
		
		DataSource ds = bank.getInstance();
		
		
		
		System.out.println(bank);
		System.out.println(ds);

		
		//Account account = (Account) applnContext.getBean("acountInfo");
	}

}

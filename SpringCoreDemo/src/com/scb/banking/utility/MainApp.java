package com.scb.banking.utility;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.scb.banking.ITransaction;
import com.scb.banking.entities.Bank;
import com.scb.banking.entities.Customer;

public class MainApp {

	public static void main(String str[]){
		
		Resource resource = new ClassPathResource("SpringBean.xml");
		
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		ITransaction  dctranstaction= (ITransaction) beanFactory.getBean("debitcard");
		
		System.out.println("debit card response "+ dctranstaction.payment(100));
		
		ITransaction  cctranstaction= (ITransaction) beanFactory.getBean("cccard");
		
		System.out.println("credit card response "+ cctranstaction.payment(100));
		
		//System.out.println(beanFactory.isSingleton("customer1"));
	
		//Customer customer = (Customer) beanFactory.getBean("customer1");
		
		//System.out.println(customer);
		
		Bank bank = (Bank) beanFactory.getBean("bank");
		System.out.println(bank);
	}
}

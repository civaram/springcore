package com.scb.banking.entities;

/**
 * @author test
 *
 */
public class Address {
	
	private String street;

	private String city;
	
	private String state;
	
	private int postalCode;

	/**
	 * @param street
	 * @param city
	 * @param state
	 * @param postalCode
	 */
	public Address(String street, String city, String state, int postalCode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @return the postalCode
	 */
	public int getPostalCode() {
		return postalCode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [street=" + street + "\n city=" + city + "\n state="
				+ state + "\n postalCode=" + postalCode + "]";
	}

	


	


}
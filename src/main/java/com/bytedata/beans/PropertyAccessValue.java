package com.bytedata.beans;

import org.springframework.beans.factory.annotation.Value;

public class PropertyAccessValue {
	@Value("${address}")
	private String address;
	@Value("${email }")
	private String email;
	
	public PropertyAccessValue(String address, String email) {
		this.address = address;
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "PropertyAccessValue [address=" + address + ", email=" + email + "]";
	}

}

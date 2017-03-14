package com.unittesting.chp03;

import java.util.ArrayList;
import java.util.List;

public class Client {

	private List<Address> addresses;

	public Client() {
		addresses = new ArrayList<>();
	}

	public List getAddresses() {
		return addresses;
	}

	public void addAddress(Address addressA) {
		if (this.addresses != null) {
			addresses.add(addressA);
		} else {
			addresses = new ArrayList<>();
			addresses.add(addressA);
		}
	}

	public Object getEmail() {
		return null;
	}
}

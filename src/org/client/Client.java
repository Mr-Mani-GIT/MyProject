package org.client;

import org.company.Company;

public class Client extends Company {
	public void clientName() {
		System.out.println("Client name : Mani");
	}
	
	public static void main(String[] args) {
		Client c = new Client();
		c.clientName();
		c.companyName();
		c.companyId();
	}

}

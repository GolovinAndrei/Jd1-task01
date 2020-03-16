package by.stech.les9.bank;

import java.util.List;

public class CustomerInfo {

	public void print(Customer customer) {

		System.out.println("customer ID: "+customer.getiD());
		print(customer.getAccaunts());
		return;

	}

	public void print(List<Accaunt> ac) {

		for (Accaunt c : ac) {
			System.out.print("Accaunt number: " + c.getNumber() +"  " + "Credit: " + c.getCredit()+ "\n");

		}
		return;
	}
	
	public void print(Accaunt ac) {

		
			System.out.print("Accaunt number: " + ac.getNumber() +"  " + "Credit: " + ac.getCredit()+ "\n");

		return;
	}
}

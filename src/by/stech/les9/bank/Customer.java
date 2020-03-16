package by.stech.les9.bank;

import java.util.List;

public class Customer {

	private int iD;
	private List <Accaunt> accaunts;
	
	public Customer() {
	}
	
	public Customer(int iD, List<Accaunt> accaunts) {
		this.iD = iD;
		this.accaunts = accaunts;
	}
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public List<Accaunt> getAccaunts() {
		return accaunts;
	}
	public void setAccaunts(List<Accaunt> accaunts) {
		this.accaunts = accaunts;
	} 
	
	
}

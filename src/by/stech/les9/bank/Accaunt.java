package by.stech.les9.bank;

public class Accaunt {

	private int number;
	private double credit;
	private boolean isOpen= true;
	
	public Accaunt() {
	}

	public Accaunt(int number, double credit) {
		this.number = number;
		this.credit = credit;
		
	}

	public void blockingAccaunt () {
		this.isOpen=false;
		
	}
	
	public void unlockAccaunt () {
		this.isOpen=true;
		
	}
	
	
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

	public boolean isOpen() {
		return isOpen;
	}

	
	
	
	
}

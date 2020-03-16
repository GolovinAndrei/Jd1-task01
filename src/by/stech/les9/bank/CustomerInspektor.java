package by.stech.les9.bank;

public class CustomerInspektor {

	public static void main(String[] args) {
		CustomerInfo info=new CustomerInfo ();
		Customer cust = new Customer (101, AccauntConsoleInput.createAccaunts(4));
		info.print(cust);
		System.out.println("_____________________");
		AccauntBL bl=new AccauntBL();
		bl.sortByCredit(cust);
		info.print(cust);
		System.out.println("_____________________");
		System.out.println("Credit amount: "+bl.sumCredit(cust));
		System.out.println("Positive balans: "+bl.sumPositivCredit(cust));
		System.out.println("Negotive balans: "+bl.sumNegotivCredit(cust));
		info.print(bl.findtByNumber(cust));
	}

}

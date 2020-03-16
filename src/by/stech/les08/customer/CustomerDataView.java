package by.stech.les08.customer;

public class CustomerDataView {

	
	public static void printCustomerArray (Customer []ar ) {
		
		for (Customer C:ar) {
			System.out.println("Name "+C.getName() + "\n"+"Last name "+C.getLastName()+"\n"+"Adres "+C.getAdres()+"\n"+"Cedit card number "+C.getCreditCard()+"\n"+"Bank account number "+C.getBankAccount());
			System.out.println();
		}
	return;	
	}
	
	
}

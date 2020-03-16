package by.stech.les08.customer;

public class CustomerInspector {

	public static void main(String[] args) {
		Customer [] customer= CustomerData.customerArrayInit();
		CustomerDataView.printCustomerArray(customer);
		System.out.println("--------------------------------------------------------------------------");
		customer = FindCustomer.sortByNameAndLastName(customer);
		CustomerDataView.printCustomerArray(customer);
		System.out.println("--------------------------------------------------------------------------");
		Customer[]findByCard=FindCustomer.sortByCard(customer);
		CustomerDataView.printCustomerArray(findByCard);
	}

}

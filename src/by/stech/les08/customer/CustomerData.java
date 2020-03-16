package by.stech.les08.customer;

public class CustomerData {

	public static Customer[] customerArrayInit() {
		
		String[] nameAr = { "Николай", "Александр", "Алексей", "Владимир", "Леонид" };
		String[] lastNameAr = { "Антонов", "Веселов", "Летов", "Андронов", "Зотов" };
		String[] adresAr = { "Минск, ул. Ленина, 5", "Брест, ул. пролетарска, 12", "Гродно, пр.Космонавтов, 22/1",
				"Минск, ул. Новаторская, 15", "Гомель, ул. Интернациональная, 55" };
		int[] creditCardAr = { 5528, 8871, 3352, 1158, 1187 };
		int[] bankAccountAr = { 128, 225, 968, 777, 360 };

		Customer[] customerArray = new Customer[5];

		for (int i = 0; i < customerArray.length; i++) {

			customerArray[i] = new Customer(i, nameAr[i], lastNameAr[i], adresAr[i], creditCardAr[i],
					bankAccountAr[i]);

		}
		return customerArray;

	}

}

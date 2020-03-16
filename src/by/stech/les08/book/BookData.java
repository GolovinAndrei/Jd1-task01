package by.stech.les08.book;

public class BookData {

public static Book[] bookArrayInit() {
		
		int n=5;
		String[] nameAr = { "Основы программирования", "Технический словарь", "Детские истории", "Приучить кота не орать", "Справочник нужных дел" };
		String[] authorAr = { "Антонов Николай", "Веселов Александр", "Летов Алексей", "Андронов Владимир", "Зотов Леонид" };
		String[] publishingAr= { "A-pub", "New books", "A-pub", "Modern Story", "New books" };
		int[] yearOfPubAr = {2020, 2019, 1988, 2007, 2015  };
		int[] numbOfPagesAr = {188, 345, 568, 221, 380 };
		int[] priceAr = { 130, 180, 45, 68, 200 };
		char []typeOfBindAr = {'A','A','C','B','A'};

		Book[] bookArray = new Book[n];

		for (int i = 0; i < bookArray.length; i++) {

			bookArray[i] = new Book(i, nameAr[i], authorAr[i], publishingAr[i], yearOfPubAr[i],
					numbOfPagesAr[i], priceAr[i], typeOfBindAr [i]);

		}
		return bookArray;

	}
	
	
	
	
	
	
	
	
	
}

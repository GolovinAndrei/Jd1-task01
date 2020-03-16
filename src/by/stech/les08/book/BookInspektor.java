package by.stech.les08.book;

public class BookInspektor {

	public static void main(String[] args) {
		Book[] book = BookData.bookArrayInit();
		BookDataView.printBookArray(book);
		System.out.println("---------------------------------------------");
		Book[] bookbyAuthor = BookBL.findByAuthor(book);
		BookDataView.printBookArray(bookbyAuthor);
		System.out.println("---------------------------------------------");
		Book[] bookbyPlish = BookBL.findByPublish(book);
		BookDataView.printBookArray(bookbyPlish);
		System.out.println("---------------------------------------------");
		Book[] bookbyYear = BookBL.findByYear(book, BookBL.enterIntToFind());
		BookDataView.printBookArray(bookbyYear);

	}

}

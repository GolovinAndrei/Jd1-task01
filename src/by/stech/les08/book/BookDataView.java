package by.stech.les08.book;

public class BookDataView {

public static void printBookArray (Book []ar ) {
		
		for (Book b:ar) {
			System.out.println("Name of book: "+b.getName() + "\n"+"Aythor: "+b.getAuthor()+"\n"+"Publishing: "+b.getPublishing()+"\n"+"Year of publishing: "+
	b.getYearOfPub()+"\n"+"Number of pages: "+b.getNumbOfPages()+"\n"+"Price, RUB: "+b.getPrice()+"\n"+"Type of binding: "+b.getTypeOfBind());
			System.out.println();
		}
	return;	
	}
	
}

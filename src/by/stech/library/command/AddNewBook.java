package by.stech.library.command;

import by.stech.library.bean.Book;
import by.stech.library.service.BookService;
import by.stech.library.service.ServiceException;
import by.stech.library.service.ServiceProvider;

public class AddNewBook implements Command {

	@Override
	public String execute(String request) {
		
		String[] stParts = request.split(" ", 3);
		String author = stParts[0].substring(stParts[0].indexOf('=') + 1);
		String title = stParts[1].substring(stParts[0].indexOf('=') + 1);
		int iD = Integer.parseInt(stParts[2].substring(stParts[0].indexOf('=') + 1));
		Book b = new Book(author, title, iD);
   	
    	String response = null;
    	
    	ServiceProvider provider = ServiceProvider.getInstance();
		BookService bookService = provider.getBookService();
		
		try {
			bookService.add(b);
			response = "The book added";
		} catch (ServiceException e) {
			response = "Incorrect data";
		}
		
		return response;
	}
		

}

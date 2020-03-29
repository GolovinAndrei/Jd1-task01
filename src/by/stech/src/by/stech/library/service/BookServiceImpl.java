package by.stech.library.service;

import java.util.List;

import by.stech.library.bean.Book;

public class BookServiceImpl implements BookService {

	@Override
	public Book findBook(String arg, List<Book> books) throws ServiceException {
		Book result=null;
		for (int i=0; i<books.size(); i++) {
			if (books.get(i).getTitle().equals(arg)) {
				result = books.get(i);
			}
		}
		return result;
	
	}

	@Override
	public Book findBook (int id, List<Book> books) throws ServiceException {
		Book result=null;
		for (int i=0; i<books.size(); i++) {
			if (books.get(i).getiD()==id) {
				result = books.get(i);
			}
		}
		return result;
	
	}
	
	
	
}

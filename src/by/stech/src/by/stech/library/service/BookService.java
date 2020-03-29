package by.stech.library.service;

import java.util.List;

import by.stech.library.bean.Book;

public interface BookService {

	Book findBook (String arg, List<Book> books) throws ServiceException;
	Book findBook (int id, List<Book> books) throws ServiceException;
}

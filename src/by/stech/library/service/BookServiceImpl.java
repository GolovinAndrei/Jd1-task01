package by.stech.library.service;

import java.util.List;

import by.stech.library.bean.Book;
import by.stech.library.dao.AdminDao;
import by.stech.library.dao.DaoException;
import by.stech.library.dao.DaoProvider;

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

	@Override
	public boolean add(Book book) throws ServiceException {
		if (book == null) {
			throw new ServiceException("Incorrect book");
		}
		
		if ((book.getAuthor() == null) || (book.getAuthor().isEmpty())) {
			throw new ServiceException("Incorrect author");
		}
		
		if ((book.getTitle() == null) || (book.getTitle().isEmpty())) {
			throw new ServiceException("Incorrect title");
		}
		
		if (book.getiD() < 1) {
			throw new ServiceException("Invalid ID");
		}

		boolean result = false;
		DaoProvider provider = DaoProvider.getInstance();
		AdminDao adminDao = provider.getAdminDao();
		
		try {
			result = adminDao.add(book);
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
		
		return result;
	}

	@Override
	public boolean edit(int iD, Book book) throws ServiceException {
		if (book == null) {
			throw new ServiceException("Incorrect book");
		}

		boolean result = false;
		DaoProvider provider = DaoProvider.getInstance();
		AdminDao adminDao = provider.getAdminDao();
		
		try {
			result = adminDao.editBook(book, iD);
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
		
		return result;
	}

	}
	
	
	


package by.stech.library.dao;

import by.stech.library.bean.Book;

public interface AdminDao {
	public boolean add(Book newBook) throws DaoException ;
	public boolean editBook(Book book, int idBook) throws  DaoException ;
	
}

package by.stech.library.dao;

import by.stech.library.bean.Book;

public interface AdminDao {
	boolean add(Book newBook) throws DaoException ;
	boolean edit(int idBook)  throws  DaoException ;
}

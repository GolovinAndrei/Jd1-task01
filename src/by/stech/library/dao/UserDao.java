package by.stech.library.dao;

import by.stech.library.bean.User;

public interface UserDao {

	boolean authorization(String login, String password) throws DaoException;
	boolean registration(User newUser) throws  DaoException ;
	
}

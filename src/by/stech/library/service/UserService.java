package by.stech.library.service;

import by.stech.library.bean.User;

public interface UserService {


	boolean signIn(String login, String password)  throws ServiceException;
	
	boolean registration(User user)  throws ServiceException;
}

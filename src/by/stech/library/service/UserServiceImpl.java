package by.stech.library.service;

import by.stech.library.bean.User;
import by.stech.library.dao.DaoException;
import by.stech.library.dao.DaoProvider;
import by.stech.library.dao.UserDao;

public class UserServiceImpl implements UserService {

	@Override
	public boolean signIn(String login, String password) throws ServiceException {
		
		if (login==null || login.isEmpty()) {
			throw new ServiceException ("Error");
		}
		
		DaoProvider prov = DaoProvider.getInstance();
		UserDao userDao = prov.getUserDao();
		try {
			userDao.authorization(login, password);
		} catch (DaoException e) {
			
			throw new ServiceException(e);
		}
		
		return true;
	}

	@Override
	public boolean signOut(String password) throws ServiceException {
		return false;
	
		
	}

	@Override
	public boolean registration(User user) throws ServiceException {
		return false;
		
		
	}

	
}

package by.stech.library.service;

import by.stech.library.bean.User;
import by.stech.library.dao.DaoException;
import by.stech.library.dao.DaoProvider;
import by.stech.library.dao.UserDao;

public class UserServiceImpl implements UserService {

	@Override
	public boolean signIn(String login, String password) throws ServiceException {

		if (login == null || login.isEmpty()) {
			throw new ServiceException("Error");
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
	public boolean registration(User user) throws ServiceException {
		if (user == null) {
			throw new ServiceException("Incorrect user");
		}

		if ((user.getLogin() == null) || (user.getLogin().isEmpty())) {
			throw new ServiceException("Incorrect users login");
		}

		if ((user.getPassword() == null) || (user.getPassword().isEmpty())) {
			throw new ServiceException("Incorrect users password");
		}

		boolean result = false;
		DaoProvider provider = DaoProvider.getInstance();
		UserDao userDao = provider.getUserDao();

		try {
			result = userDao.registration(user);
		} catch (DaoException e) {
			throw new ServiceException(e);
		}

		return result;

	}

}

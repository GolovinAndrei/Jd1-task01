package by.stech.library.service;

public class ServiceProvider {

private static final ServiceProvider instance = new ServiceProvider();
	
	private UserService userService = new UserServiceImpl();
	
	public static ServiceProvider getInstance() {
		return instance;
	}

	public UserService getUserService() {
		return userService;
	}
}

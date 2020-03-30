package by.stech.library.service;

public class ServiceProvider {

private static final ServiceProvider instance = new ServiceProvider();
	
private UserService userService = new UserServiceImpl();
private BookService adminService = new BookServiceImpl();

public static ServiceProvider getInstance() {
	return instance;
}

public UserService getUserService() {
	return userService;
}

public BookService getBookService() {
	return adminService;
}
}

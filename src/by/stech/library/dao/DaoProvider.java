package by.stech.library.dao;


public class DaoProvider {
	
		private static final DaoProvider instance = new DaoProvider();
		
		private DaoProvider() {}
		
		
		private UserDao userDao = new FileUserDao();
		private AdminDao adminDao = new FileAdminDao();
		
		public static DaoProvider getInstance() {
			return instance;
		}

		public UserDao getUserDao() {
			return userDao;
		}

		public AdminDao getAdminDao() {
			return adminDao;
		}
		
		
}

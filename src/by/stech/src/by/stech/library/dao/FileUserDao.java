package by.stech.library.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.stech.library.bean.User;

public class FileUserDao implements UserDao {

	
	
	@Override
	public boolean authorization (String login, String password) throws DaoException {
		
		List <User> user = userInfo();
				for (User i:user) {
					if (i.getLogin().equals(login) && i.getPassword().equals(password)) { 
						return true;
				}
				}
				return false;
	
	}			
	
	@Override
	public boolean registration(User newUser) throws DaoException {
		FileWriter fw = null;
		try {
		fw = new FileWriter ("D:\\Java Learning\\jd-aut&reg\\src\\resources\\users.txt", true);
		String login = newUser.getLogin();
		String password = newUser.getPassword();
		int iD = newUser.getiD();
		String result = "\n"+"login="+login+" password="+password+" ID="+iD;
			
			fw.write(result);
		} catch (IOException e) {
			throw new DaoException();
			
		}
		finally {
			try {
				fw.close();
			} catch (IOException e) {
				throw new DaoException();
				
			}
		}
		return true;
	}
	
	
	public List<User> userInfo() throws DaoException {
		List<User> users = new ArrayList<User>();

		BufferedReader input = null;
		String filePath = "D:\\Java Learning\\jd-aut&reg\\src\\resources\\users.txt";

		try {
			input = new BufferedReader(new FileReader(filePath));
			String tmp;
			try {

				while ((tmp = input.readLine()) != null) {
					String[] stParts = tmp.split(" ", 3);
					String login = stParts[0].substring(stParts[0].indexOf('=') + 1);
					String password = stParts[1].substring(stParts[0].indexOf('=') + 1);
					int iD = Integer.parseInt(stParts[2].substring(stParts[0].indexOf('=') + 1));
					User u = new User(login, password, iD);
					users.add(u);
				}
			} catch (FileNotFoundException e) {
				System.out.println("File not found");
				return null;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {
				if (input != null) {
					input.close();
				}
			} catch (IOException e) {
				System.out.println("Error");
			}
		}
		return users;

	}

}

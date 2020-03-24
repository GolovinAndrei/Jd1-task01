package by.stech.library.bean;

public class User {

	private String login;
	private String password;
	private int iD;
	
	
	public User() {
	}


	public User(String login, String password, int iD) {
		this.login = login;
		this.password = password;
		this.iD = iD;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getiD() {
		return iD;
	}


	public void setiD(int iD) {
		this.iD = iD;
	}
	
	
}

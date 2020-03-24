package by.stech.library.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		FileWriter fw=null;
		try {
			fw = new FileWriter ("D:\\Java Learning\\jd-aut&reg\\src\\resources\\users.txt", true);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		String login = "Petr";
		String password = "52588";
		int iD = 04;
		
		String result = "\n"+"login="+login+" password="+password+" ID="+iD;
		
		try {
			fw.write(result);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
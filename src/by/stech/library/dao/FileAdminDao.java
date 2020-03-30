package by.stech.library.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.stech.library.bean.Book;
import by.stech.library.bean.User;

public class FileAdminDao implements AdminDao {

	@Override
	public boolean add(Book newBook) throws DaoException {
		FileWriter fw = null;
		try {
			fw = new FileWriter("D:\\Java Learning\\jd-aut&reg\\src\\resources\\books.txt", true);
			String author = newBook.getAuthor();
			String title = newBook.getTitle();
			int iD = newBook.getiD();
			String result = "\n" + "author=" + author + " title=" + title + " ID=" + iD;

			fw.write(result);
		} catch (IOException e) {
			throw new DaoException();

		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				throw new DaoException();

			}
		}
		return true;

	}

	@Override
	public boolean editBook(Book book, int idBook) throws DaoException {

		FileWriter fw = null;

		try {

			List<Book> books = bookInfo();
			fw = new FileWriter("D:\\Java Learning\\jd-aut&reg\\src\\resources\\books.txt", true);
			for (Book b : books) {
				if (idBook == b.getiD()) {
					b = book;
					b.setiD(idBook);

				}
				fw.write(b.toString());
				fw.append('\n');
			}
			return true;

		} catch (IOException e) {
			throw new DaoException(e);
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				throw new DaoException(e);
			}

		}

	}

	public List<Book> bookInfo() throws DaoException {
		List<Book> books = new ArrayList<Book>();

		BufferedReader input = null;
		String filePath = "D:\\Java Learning\\jd-aut&reg\\src\\resources\\books.txt";

		try {
			input = new BufferedReader(new FileReader(filePath));
			String tmp;
			try {

				while ((tmp = input.readLine()) != null) {
					String[] stParts = tmp.split(" ", 3);
					String author = stParts[0].substring(stParts[0].indexOf('=') + 1);
					String title = stParts[1].substring(stParts[0].indexOf('=') + 1);
					int iD = Integer.parseInt(stParts[2].substring(stParts[0].indexOf('=') + 1));
					Book b = new Book(author, title, iD);
					books.add(b);
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
		return books;

	}

}

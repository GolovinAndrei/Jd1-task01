package by.stech.les08.book;

import java.util.Scanner;

public class BookBL {

			
	public static int enterIntToFind () {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the data for search >> ");
		int data = sc.nextInt();
		return data;
	}	
		
	
		
	public static Book [] findByAuthor (Book[]ar) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter name and Last name of Author  for search >> ");
		String author = sc.nextLine();
		
		int n=0;
		for (Book i:ar) {
			if (i.getAuthor().compareToIgnoreCase(author)==0) {
				n++;
			}
		}
		int j=0;
		Book []res=new Book[n];		
		for (Book b:ar) {
			if (b.getAuthor().compareToIgnoreCase(author)==0) {		
				res[j]=b;
				j++;
			}
		}
		return res;
	}
			
	
	public static Book [] findByPublish (Book[]ar) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter pablishing haus name  for search >> ");
		String publ = sc.next();
		
		int n=0;
		for (Book b:ar) {
			if (b.getPublishing().compareToIgnoreCase(publ)==0) {
				n++;
			}
		}
		int j=0;
		Book []res=new Book[n];		
		for (Book b:ar) {
			if (b.getPublishing().compareToIgnoreCase(publ)==0) {		
				res[j]=b;
				j++;
			}
		}
		return res;
	}
	
	public static Book [] findByYear (Book[]ar, int year) {
		
		int n=0;
		for (Book b:ar) {
			if (b.getYearOfPub()>=year) {
				n++;
			}
		}
		int j=0;
		Book []res=new Book[n];		
		for (Book b:ar) {
			if (b.getYearOfPub()>=year) {		
				res[j]=b;
				j++;
			}
		}
		return res;
	}


	
}



package by.stech.les9.bank;

import java.util.List;
import java.util.Scanner;



public class AccauntBL {

	public double sumCredit (Customer customer) {
		double sum = 0;
		for (Accaunt c:customer.getAccaunts()) {
			sum+=c.getCredit();
				}
		return sum;
			}
	
	
	public double sumPositivCredit (Customer customer) {
		double sum = 0;
		for (Accaunt c:customer.getAccaunts()) {
			if (c.getCredit()>0) {
			sum+=c.getCredit();
				}
		}
		return sum;
	}
	
	public double sumNegotivCredit (Customer customer) {
		double sum = 0;
		for (Accaunt c:customer.getAccaunts()) {
			if (c.getCredit()<0) {
			sum+=c.getCredit();
				}
		}
		return sum;
	}
	
	public void sortByCredit(Customer customer) {

		for (int i = 0; i < customer.getAccaunts().size() - 1; i++) {
			double minCredit = customer.getAccaunts().get(i).getCredit();
			int minCreditIndex = i;

			for (int j = i + 1; j < customer.getAccaunts().size(); j++) {
				double currentCredit = customer.getAccaunts().get(j).getCredit();

				if (minCredit > currentCredit) {
					minCredit = currentCredit;
					minCreditIndex = j;
				}

			}

			Accaunt temp1 = customer.getAccaunts().get(i);
			Accaunt temp2 =customer.getAccaunts().get(minCreditIndex);

			customer.getAccaunts().set(i, temp2);
			customer.getAccaunts().set(minCreditIndex, temp1);

		}
	}
		
		public Accaunt findtByNumber(Customer customer) {
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter accaunt number for sirching > ");
			int numb = sc.nextInt();
			for (Accaunt c:customer.getAccaunts()) {
				if(c.getNumber()==numb) {
					return c;
				}
					
			}
			return null;
		}
			
	
}

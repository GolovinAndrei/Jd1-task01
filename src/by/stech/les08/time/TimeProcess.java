package by.stech.les08.time;

import java.util.Scanner;

public class TimeProcess {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		TimeSet ts = new TimeSet();
		Time tm=ts.createSetStartValue();
		TimeView tv=new TimeView();
		
		tv.printTime(tm);
		int plus=0;
		do {
		System.out.println();
		
		ts.inputAndChangValue(tm);
		tv.printTime(tm);
		System.out.print("If you want to repeat enter 1 >> ");
		plus = sc.nextInt();
		}while (plus==1);
		
	}

}

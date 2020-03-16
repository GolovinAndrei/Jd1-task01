package by.stech.les08.time;

import java.util.Scanner;

public class TimeSet {

	public Time createSetStartValue() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start time value - hours, minutes, seconds >> ");
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int sec = sc.nextInt();

		hour =isValueCorrect(hour);
		min =isValueCorrect(min);
		sec =isValueCorrect(sec);
		
		Time tm = new Time(hour, min, sec);
		return tm;
	}

	
	public int isValueCorrect(int value) {

		if (value < 0 && value > 60) {
			value = 0;
		}
		return value;
	}

	public Time inputAndChangValue(Time tm) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the changing parametr and value>> ");
		
		String param =sc.next();
		int changValue = sc.nextInt();
		
		switch (param){
		case "hours":
			int hour=tm.getHour()+changValue;
			tm.setHour(hour%24);
			break;
		case "minutes":
			int min=tm.getMinute()+changValue;
			if (min >=60) {
				tm.setHour(tm.getHour()+1);
				min = min%60;
			}
			tm.setMinute(min);
			break;
		case "seconds":
			int sec=tm.getSecond()+changValue;
			if (sec >=60) {
				tm.setMinute(tm.getMinute()+1);
				sec = sec%60;
			}
			tm.setSecond(sec);
			break;		
			}
		
		
		return tm;
		
	}

}

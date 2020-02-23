package by.stech.les06.mass2x;

import java.util.Scanner;

public class TrainInspect {

	public static void main(String[] args) {

		String[] distNameArr = { "Minsk", "Moscow", "Kaliningrad", "Brest", "St.Pet" };
		int[] trainNumbArr = { 110, 200, 135, 500, 100 };
		DepartTime[] timeArr = { new DepartTime("March", 5, 12, 0), new DepartTime("April", 3, 10, 30),
				new DepartTime("April", 1, 15, 0), new DepartTime("March", 5, 12, 0),
				new DepartTime("March", 5, 12, 0) };
		Train[] trainArr = new Train[5];
		for (int i = 0; i < trainArr.length; i++) {
			trainArr[i] = new Train(distNameArr[i], trainNumbArr[i], timeArr[i]);
		}

		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter the train numer > ");
		int trNumber = sc.nextInt();

		TrainSchedule.printNesseryTrain(trainArr, timeArr, trNumber);

	}

}

package by.stech.train.main;

import java.util.List;

import by.stech.train.bean.Train;
import by.stech.train.service.TrainLogic;
import by.stech.train.view.TrainConsoleInput;
import by.stech.train.view.TrainView;


public class Main {

	public static void main(String[] args) {
		TrainView view = new TrainView();
		TrainConsoleInput input = new TrainConsoleInput();

		TrainLogic logic = new TrainLogic();

		List<Train> trains;
		trains = input.create();

		view.print(trains);

		System.out.println("--------------");

		//logic.sortByNumber(trains);
		logic.sortByStation(trains);

		view.print(trains);

	}

	
}
package by.stech.train.view;

import java.util.List;

import by.stech.train.bean.Train;



public class TrainView {

	public void print(Train train) {
		System.out.print("TRAIN: number" + train.getNumber() + " " + train.getDestinationStation() + "\n");
	}

	public void print(List<Train> trains) {
		for (Train train : trains) {
			print(train);
		}

	}

}
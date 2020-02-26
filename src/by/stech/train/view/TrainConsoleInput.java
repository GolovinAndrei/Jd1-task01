package by.stech.train.view;

import java.util.ArrayList;
import java.util.List;

import by.stech.train.bean.Date;
import by.stech.train.bean.Train;



public class TrainConsoleInput {

	public List<Train> create() {
		List<Train> trains = new ArrayList<Train>();
		
		Train tr = new Train(123, "Minsk", new Date (2020,2,12,12,55));
		trains.add(tr);
		
		tr = new Train(455, "Moskva", new Date(2020,3,5,10,30));
		trains.add(tr);
		
		tr = new Train(12, "Brest", new Date(2020,10,3,12,0));
		trains.add(tr);
		
		tr = new Train(346, "Simpheropol", new Date(2020,4,4,9,59));
		trains.add(tr);
		
		tr = new Train(498, "St.Petesburg", new Date(2021,8,7,20,40));
		trains.add(tr);
		
		tr = new Train(128, "Minsk", new Date(2020,2,2,15,40));
		trains.add(tr);
		
		tr = new Train(188, "Grodno", new Date(2020,5,7,20,45));
		trains.add(tr);
		
		tr = new Train(456, "Moskva", new Date(2020,5,5,10,00));
		trains.add(tr);
		
		return trains;
		
	}

}
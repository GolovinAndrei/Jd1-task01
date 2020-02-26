package by.stech.train.service;

import java.util.List;

import by.stech.train.bean.Train;

public class TrainLogic {

	public Train findTrainByNumber(List<Train> trains, int trainNumber) {

		for (Train train : trains) {
			if (train.getNumber() == trainNumber) {
				return train;
			}
		}
		return null;
	}

	public void sortByNumber(List<Train> trains) {

		for (int i = 0; i < trains.size() - 1; i++) {
			int minTrainNumber = trains.get(i).getNumber();
			int minTrainNumberIndex = i;

			for (int j = i + 1; j < trains.size(); j++) {
				Train currentTrain = trains.get(j);

				if (minTrainNumber > currentTrain.getNumber()) {
					minTrainNumber = currentTrain.getNumber();
					minTrainNumberIndex = j;
				}

			}

			Train temp1 = trains.get(i);
			Train temp2 = trains.get(minTrainNumberIndex);

			trains.set(i, temp2);
			trains.set(minTrainNumberIndex, temp1);

		}

	}

	public void sortByStation(List<Train> trains) {

		for (int i = 0; i < trains.size() - 1; i++) {

			String youngerNameOfStation = trains.get(i).getDestinationStation();
			int youngerNameOfStationIn = i;
			int minHourOfDepart = trains.get(i).getDate().getHour();
			int minMinuteOfDepart = trains.get(i).getDate().getMinute();

			for (int j = i + 1; j < trains.size(); j++) {
				int curHour = trains.get(j).getDate().getHour();
				int curMin = trains.get(j).getDate().getHour();
				String curStation = trains.get(j).getDestinationStation();

				if (youngerNameOfStation.compareToIgnoreCase(curStation) == 0) {
					if (minHourOfDepart == curHour) {
						if (minMinuteOfDepart > curMin) {
							youngerNameOfStationIn = j;
							minMinuteOfDepart = curMin;

						}

					} else if (minHourOfDepart > curHour) {
						youngerNameOfStationIn = j;
						minHourOfDepart = curHour;
					}

				} else if (youngerNameOfStation.compareToIgnoreCase(curStation) > 0) {
					youngerNameOfStationIn = j;
					youngerNameOfStation = curStation;

				}

			}
			Train temp1 = trains.get(i);
			Train temp2 = trains.get(youngerNameOfStationIn);

			trains.set(i, temp2);
			trains.set(youngerNameOfStationIn, temp1);

		}

	}

}

package myclasses;

import java.time.LocalDate;

import myenums.TrainClass;

public class TrainTicket extends Seat {

	private TrainClass trainClass;
	private int distance;
	private LocalDate date;
	
	public TrainTicket(TrainClass trainClass, int distance, LocalDate date) {
		super();
		this.trainClass = trainClass;
		this.distance = distance;
		this.date = date;
		setPlace(makeReservation());
		if (trainClass == TrainClass.FIRST) 
			setPrice(distance*25);
			else 
				setPrice(distance*25*80/100);
		
	}
	
	public TrainTicket(TrainClass trainClass, int distance) {
		this(trainClass, distance, LocalDate.now());
	}

	@Override
	public String toString() {
		return "TrainTicket [trainClass=" + trainClass + ", distance=" + distance + ", date=" + date + ", toString()="
				+ super.toString() + "]";
	}

	public TrainClass getTrainClass() {
		return trainClass;
	}

	public void setTrainClass(TrainClass trainClass) {
		this.trainClass = trainClass;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	
}

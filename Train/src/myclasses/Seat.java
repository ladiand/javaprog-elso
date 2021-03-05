package myclasses;

import myinterfaces.Reservable;

public class Seat implements Reservable{

	private int price;
	private int place;
	private static int next = 0;
	
	public Seat() {}

	@Override
	public String toString() {
		return "Seat [price=" + price + ", place=" + place + "]";
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPlace() {
		return place;
	}

	public void setPlace(int place) {
		this.place = place;
	}
	
	@Override
	public int makeReservation() {
		return next++;
	}
	
	@Override
	public void deleteReservation(int place) {
		this.place = 0;
	}
	
}

package mytest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import myclasses.*;
import myenums.TrainClass;

public class SeatTest {

	public static void main(String[] args) {

		List<TrainTicket> tickets = new ArrayList(3);
		tickets.add(new TrainTicket(TrainClass.FIRST, 100, LocalDate.of(2021, 4, 10)));
		tickets.add(new TrainTicket(TrainClass.SECOND, 100));
		tickets.add(new TrainTicket(TrainClass.SECOND, 200));
		
		//Lista alakytása tömbbé
		TrainTicket[] ticketArray = new TrainTicket[tickets.size()];
		tickets.toArray(ticketArray);
		Comparator<TrainTicket> compByPrice = Comparator.comparing(TrainTicket::getPrice);
		Arrays.sort(ticketArray, Comparator.comparing(TrainTicket::getPrice));
		Arrays.sort(ticketArray, compByPrice.reversed());
		
		//Tömb átalakítása listává
		tickets = new ArrayList<>(Arrays.asList(ticketArray));
		printList(tickets);
		
	}
	
	private static void printList(List<TrainTicket> list) {
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}

package rappmahaboob.com23Java.lang.packagesCodeAlphaIntermship;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TravelPlanner {
	List<Destination> destinations;

	public TravelPlanner() {
		destinations = new ArrayList<>();
	}

	public void addDestination(String name, java.util.Date startDate1, java.util.Date endDate1) {
		Destination destination = new Destination(name, startDate1, endDate1);
		destinations.add(destination);
	}

	public void displayItinerary() {
		System.out.println("Travel Itinerary:");
		for (int i = 0; i < destinations.size(); i++) {
			Destination destination = destinations.get(i);
			System.out.println("Destination: " + destination.name);
			System.out.println("Start Date: " + destination.startDate);
			System.out.println("End Date: " + destination.endDate);
			System.out.println("--------------------------------------");
		}
	}

	public static void main(String[] args) {
		TravelPlanner planner = new TravelPlanner();

		// Example destinations
		Calendar cal = Calendar.getInstance();
		cal.set(2024, Calendar.APRIL, 10);
		java.util.Date startDate1 = cal.getTime();
		cal.set(2024, Calendar.APRIL, 15);
		java.util.Date endDate1 = cal.getTime();
		planner.addDestination("Paris", startDate1, endDate1);

		cal.set(2024, Calendar.APRIL, 16);
		java.util.Date startDate2 = cal.getTime();
		cal.set(2024, Calendar.APRIL, 20);
		java.util.Date endDate2 = cal.getTime();
		planner.addDestination("Rome", startDate2, endDate2);

		// Display itinerary
		planner.displayItinerary();
	}
}

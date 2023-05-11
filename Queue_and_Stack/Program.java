package assignment2_2;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Airline airline = new Airline();

        //Adding Flights to the list

        Flight flightOne = new Flight("F001", "Glasgow", 270, "A", Flight.FType.national, "5", "May", "2023");
        Flight flightTwo = new Flight("F002", "Berlin", 5, "E", Flight.FType.cargo, "5", "May", "2023");
        Flight flightThree = new Flight("F003", "Rome", 220, "C", Flight.FType.international, "5", "May", "2023");
        Flight flightFour = new Flight("F004", "Hong Kong", 350, "B", Flight.FType.international, "6", "May", "2023");
        Flight flightFive = new Flight("F005", "Moscow", 10, "D", Flight.FType.cargo, "6", "May", "2023");

        //Queue

        //Adding flights to the Queue(enqueue)
        System.out.println("\nQueue");
        System.out.println("\nList of flights:");
        airline.joinFlight(flightOne);
        airline.joinFlight(flightTwo);
        airline.joinFlight(flightThree);
        airline.joinFlight(flightFour);
        airline.joinFlight(flightFive);

        //Displaying the Queue
        airline.display();

        //Removing first element of the Queue(dequeue with FIFO method)
        System.out.println("\nFlight " + airline.getLandFlight().getFlightID() + " has landed");

        //Showing the new list size
        System.out.println("\nNumber of flights is now: " + airline.size());

        //Showing that first Flight is not there anymore
        System.out.println("\nFirst Flight is now: " + airline.getFirstFlight().toString());

        //Showing the next flight on the new list
        System.out.println("Next Flight is: " + airline.getNextFlight().toString());

        //Removing all flights of the list
        airline.clear();
        System.out.println("\nAll the flights have landed");

        //Showing that all flights have landed
        System.out.println("There are no more flights in the list: " + airline.getIsEmpty());

        //Stack

        //Adding flights to the stack
        System.out.println("\nStack");
        System.out.println("\nList of flights: \n");
        airline.pushFlight(flightOne);
        airline.pushFlight(flightTwo);
        airline.pushFlight(flightThree);
        airline.pushFlight(flightFour);
        airline.pushFlight(flightFive);

        airline.display();
        //Removing a Flight with LIFO method
        System.out.println("\nFlight " + airline.removeFlight().getFlightID() + " has landed");

        //New Stack size
        System.out.println("\nNow there are only " + airline.size() + " flights left");

    }
}

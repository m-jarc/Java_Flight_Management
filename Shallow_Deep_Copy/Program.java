package assignment2_1;
import java.util.*;
public class Program {
    public static void main(String[] args) {
        //Creating an airline
        Airline airline = new Airline();
        //Creating several flights
        Flight flightOne = new Flight("F001", "Los Angeles", 270, "B", Flight.FType.international, "10", "05", "2023");
        Flight flightTwo = new Flight("F002", "Manchester", 320, "A", Flight.FType.national, "10", "05", "2023");
        Flight flightThree = new Flight("F003", "Paris", 3, "C", Flight.FType.cargo, "10", "05", "2023");

        //Creating an Airline object
        airline.joinFlight(flightOne);

        //Creating a shallow copy of flightOne
        Flight shallowCopy = flightOne;

        //Creating a deep copy of flightOne
        Flight deepCopy = new Flight(flightOne.getFlightID(), flightOne.getDestination(), flightOne.getCapacity(), flightOne.getPriorityCode(), flightOne.getFlightType(), flightOne.getDay(), flightOne.getMonth(), flightOne.getYear());

        //Changing priority code and day of take off for flightOne
        flightOne.setPriorityCode("D");
        flightOne.setDay("11");

        System.out.println("Flight One details are: " + flightOne.toString());
        System.out.println("Shallow copy of Flight One is: " + shallowCopy);
        System.out.println("Deep Copy of Flight One is: " + deepCopy);
    }
}

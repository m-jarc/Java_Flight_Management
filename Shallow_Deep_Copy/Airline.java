package assignment2_1;
import java.util.*;
public class Airline {
    private ArrayList<Flight> flightList;

    public Airline() {
        flightList = new ArrayList<Flight>();
    }
    public void joinFlight(Flight f) {
        flightList.add(f);
    }

    public void landFlight(Flight f) {
        flightList.remove(f);
    }
    public int size() {
        return flightList.size();
    }
    public void clear() {
        flightList.clear();
    }
    public void display() {
        for(Flight f : flightList) {
            System.out.println(f);
        }
    }
}

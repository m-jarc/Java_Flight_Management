package assignment2_2;
import java.util.*;
public class Airline {
    private ArrayDeque<Flight> FlightList;

    public Airline() {
        FlightList = new ArrayDeque<>();
    }
    //Queue methods
    public void joinFlight(Flight f) { FlightList.add(f); } //Adds flights to the bottom of the queue
    public Flight getLandFlight() {
        return FlightList.remove();
    } //Removes flights from the top the queue
    public Flight getFirstFlight() {
        return FlightList.poll();
    } //Gets flights from the bottom of the queue

    //Stack methods
    public void pushFlight(Flight f) { FlightList.push(f); } //Adds flights to the top of the stack
    public Flight removeFlight() { return FlightList.pop(); } //Removes flights from the top of the list


    //methods that can be used for both Queue and Stack
    public Flight getNextFlight() { return FlightList.peek();} //Shows the next item in the queue or stack
    public int size() { return FlightList.size(); } //Shows the number of elements in the queue or stack
    public void clear() { FlightList.clear(); } //Removes all the elements from the queue or stack
    public boolean getIsEmpty() { return FlightList.isEmpty(); } //shows or checks if queue or stack is empty

    //shows all the items in the queue or stack
    public void display() {
        for(Flight f : FlightList) {
            System.out.println(f);
        }
    }
}

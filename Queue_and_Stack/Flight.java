package assignment2_2;

public class Flight {
        enum FType { international, national, cargo };
        private String flightID, destination, priorityCode;

        private FType flightType;
        private int capacity;
        private String day, month, year;

        //Constructors
        public Flight(String flightID, String destination, int capacity, String priorityCode, FType flightType, String day, String month, String year) {
            this.flightID = flightID;
            this.destination = destination;
            this.capacity = capacity;
            this.priorityCode = priorityCode;
            this.flightType = flightType;
            this.day = day;
            this.month = month;
            this.year = year;
        }
        //Setters
        public void setFlightID(String flightID) { this.flightID = flightID; }
        public void setDestination(String destination) { this.destination = destination; }
        public void setCapacity(int capacity) {this.capacity = capacity; }
        public void setPriorityCode(String priorityCode) { this.priorityCode = priorityCode; }
        public void setFlightType(FType flightType) { this.flightType = flightType; }
        public void setDay(String day) { this.day = day; };
        public void setMonth(String month) { this.month = month; }
        public void setYear(String year) { this.year = year; }


        //Getters
        public String getFlightID() { return flightID; }
        public String getDestination() { return destination; }
        public int getCapacity() { return capacity;}
        public String getPriorityCode() { return priorityCode; }
        public FType getFlightType() { return flightType; }
        public String getDay() { return day; }
        public String getMonth() { return month; }
        public String getYear() { return year; }


        public String toString() {
            return flightID + " to " + destination + ", with the capacity of " + capacity + " passengers, has priority code " + priorityCode + ", is a " + flightType + " flight and is taking off on " + day + "/" + month + "/" + year;
        }

    }

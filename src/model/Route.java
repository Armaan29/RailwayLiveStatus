package model;
public class Route
{
 private int number;
 private String arrival;
 private String departure;
 private int distance;
 private int halt;
 private int day;
 private Station station;
 private String actual_Arrival;
 private String actual_Departure;
 private int late;
 
    public String getActual_Arrival() {
        
        return actual_Arrival;
    }
        

    

    public Route(int number, String arrival, String departure, int distance,  String actual_Arrival, String actual_Departure, int late,Station station) {
        this.number = number;
        this.arrival = arrival;
        this.departure = departure;
        this.distance = distance;
        this.halt = halt;
        this.day = day;
        this.station = station;
        this.actual_Arrival = actual_Arrival;
        this.actual_Departure = actual_Departure;
        this.late = late;
    }

    public void setActual_Arrival(String actual_Arrival) {
        this.actual_Arrival = actual_Arrival;
    }

    public String getActual_Departure() {
        return actual_Departure;
    }

    public void setActual_Departure(String actual_Departure) {
        this.actual_Departure = actual_Departure;
    }

    public int getLate() {
        return late;
    }

    public void setLate(int late) {
        this.late = late;
    }

    public Route(int number, String arrival, String departure, int distance, int halt, int day, Station station) {
        this.number = number;
        this.arrival = arrival;
        this.departure = departure;
        this.distance = distance;
        this.halt = halt;
        this.day = day;
        this.station = station;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getHalt() {
        return halt;
    }

    public void setHalt(int halt) {
        this.halt = halt;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    
  }

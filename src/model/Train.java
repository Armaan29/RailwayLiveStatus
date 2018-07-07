package model;
import java.util.ArrayList;

public class Train 
{
private String name;
private String trainNo;
private String travelTime;
private String toStation;
private String fromStation;
        
private String sourceStation;
private String destinationStation;
private String sourceDepartureTime;
private String destinationArriavlTime;
private Days days[] =new Days[7];
private Fare fare[]=new Fare[8];
private Classes classes[] = new Classes[8];
private ArrayList<Route> routeList = new ArrayList<>(); 

    public Train(String sourceStation, String destinationStation,String travelTime, String sourceDepartureTime, String destinationArriavlTime) {
        this.travelTime = travelTime;
        this.sourceDepartureTime = sourceDepartureTime;
        this.destinationArriavlTime = destinationArriavlTime;
        this.sourceStation = sourceStation;
        this.destinationStation = destinationStation;
    }
    public String getSourceStation() {
        return sourceStation;
    }

    public String getToStation() {
        return toStation;
    }

    public void setToStation(String toStation) {
        this.toStation = toStation;
    }

    public String getFromStation() {
        return fromStation;
    }

    public void setFromStation(String fromStation) {
        this.fromStation = fromStation;
    }
    

    public void setSourceStation(String sourceStation) {
        this.sourceStation = sourceStation;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }
    

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

    public String getSourceDepartureTime() {
        return sourceDepartureTime;
    }

    public void setSourceDepartureTime(String sourceDepartureTime) {
        this.sourceDepartureTime = sourceDepartureTime;
    }

    public String getDestinationArriavlTime() {
        return destinationArriavlTime;
    }

    public void setDestinationArriavlTime(String destinationArriavlTime) {
        this.destinationArriavlTime = destinationArriavlTime;
    }


    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }
    public Fare[] getFare()
    {
        return fare;
    }
    public void setFare()
    {
        this.fare =fare;
    }
    public Days[] getDays() {
        return days;
    }

    public void setDays(Days[] days) {
        this.days = days;
    }

    public Classes[] getClasses() {
        return classes;
    }

    public void setClasses(Classes[] classes) {
        this.classes = classes;
    }
    
    public ArrayList<Route> getRouteList() {
        return routeList;
    }

    public void setRouteList(ArrayList<Route> routeList) {
        this.routeList = routeList;
    }

    public Train(String name, String trainNo) {
        this.name = name;
        this.trainNo = trainNo;
        
    }

   
}

package model;

import java.util.ArrayList;

public class Fare extends Station
{
private String fare;

    public Fare(String stationName, String code,String fare)
    {
        super(stationName, code);
        this.fare = fare;
    }
    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }
    

}

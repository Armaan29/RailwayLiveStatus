/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class FareRequest {
    private Train train;
    private Station fromStation;
    private Station toStation;
    private Station quota;
    private ArrayList<Fare> fareList;

    public FareRequest(Train train, Station fromStation, Station toStation, Station quota, ArrayList<Fare> fareList) {
        this.train = train;
        this.fromStation = fromStation;
        this.toStation = toStation;
        this.quota = quota;
        this.fareList = fareList;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Station getFromStation() {
        return fromStation;
    }

    public void setFromStation(Station fromStation) {
        this.fromStation = fromStation;
    }

    public Station getToStation() {
        return toStation;
    }

    public void setToStation(Station toStation) {
        this.toStation = toStation;
    }

    public Station getQuota() {
        return quota;
    }

    public void setQuota(Station quota) {
        this.quota = quota;
    }

    public ArrayList<Fare> getFareList() {
        return fareList;
    }

    public void setFareList(ArrayList<Fare> fareList) {
        this.fareList = fareList;
    }
    
}

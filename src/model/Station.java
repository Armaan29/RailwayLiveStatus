
package model;

public class Station {

private String stationName;
private String code;
    public Station(String stationName, String code)
    {
        this.stationName = stationName;
        this.code = code;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getCode() 
    {
        return code;
    }

    public void setCode(String code) 
    {
        this.code = code;
    }

}



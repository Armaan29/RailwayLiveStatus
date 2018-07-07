package model;

import org.json.JSONObject;

public class Days
{
  private String runs;
  private String code;

    public Days(String runs, String code) {
        this.runs = runs;
        this.code = code;
    }

    public Days(JSONObject runs, String code1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getRuns() {
        return runs;
    }

    public void setRuns(String runs) {
        this.runs = runs;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
  
}

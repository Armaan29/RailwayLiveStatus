
package UserPackage;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Route;
import model.Station;

public class MyModelLive extends AbstractTableModel

{
    ArrayList<Route>data;
    public MyModelLive(ArrayList<Route>data)
    {
        this.data =data;
    }
    @Override
    public int getRowCount()
    {
       return data.size();
    }

    @Override
    public int getColumnCount()
    {
        return 9;
        }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        Route route =data.get(rowIndex);
    if(columnIndex == 0)
    {
        return route.getNumber();
        
   }
    else if(columnIndex ==1)
    
    {
        Station station = route.getStation();
        return station.getCode();
    }
    else if( columnIndex ==2)
    {   
        Station station =route.getStation();
        return station.getStationName();
    }
        else if(columnIndex ==3)
    {
        return route.getArrival();
      }
    else if(columnIndex == 4)
    {
        return route.getDeparture();
    }    
    else if(columnIndex == 5)
    {
        return route.getDistance();
    }
    else if(columnIndex ==6)
    {
        return route.getActual_Arrival();
    }
    else if(columnIndex == 7)
    {
        return route.getActual_Departure();
    }
    else
    {
        return route.getLate();
        
    }
    }
   
    public String getColumnName(int column)
    {
            
        if(column ==0 )
        {
            return "Number";
        }
        else if(column == 1)
        {
            return "Station Code";
        }
        else if(column == 2)
        {
            return "Station Name";
        }
        else if(column==3)
        {
            return "Arrival";
        }
        else if(column==4)
        {
            return "Departure";
       }
        else if(column==5)
        {
            return "Distance";
        }
        else if(column==6)
        {
            return "Actual Arrival";
        }
        else if(column ==7)
        {
            return "Actual Departure";
        }
        else 
        {
            return "Late";
        }
}}

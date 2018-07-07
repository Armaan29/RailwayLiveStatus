package UserPackage;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import UserPackage.TrainRouteStatus;
import model.Route;
import model.Station;
public class MyModelUser extends AbstractTableModel
{
    ArrayList<Route> data;
    public MyModelUser(ArrayList<Route> data)
    {
        this.data = data;
    }
    
    @Override
    public int getRowCount() {
        return data.size();
    }

    
    @Override
    
    public int getColumnCount() 
    {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        Route route=data.get(rowIndex);
      if(columnIndex==0)
      {
          return route.getNumber();
      }
      else if(columnIndex == 1)
      {
          return route.getArrival();
     }
      else if(columnIndex == 2)
      {
          return route.getDeparture();
     }
      else if(columnIndex == 3)
      {
          return route.getDistance();
     }
      else if(columnIndex == 4)
      {
          return route.getHalt();
     }
      else if(columnIndex == 5)
      {
          return route.getDay();
     }
      else if(columnIndex == 6)
      {
          Station station = route.getStation();
          return station.getStationName();
     }
      else 
      {
          Station station = route.getStation();
          return station.getCode();
   }
    }
    @Override
    public String getColumnName(int column)
    { 
        
        if(column ==0 )
        {
            return "NUMBER";
        }
        else if(column == 1)
        {
            return "ARRIVAL TIME";
        }
        else if(column == 2)
        {
            return "DEPARTURE TIME";
        }
        else if(column==3)
        {
            return "DISTANCE";
        }
        else if(column==4)
        {
            return "HALT";
        }
        else if(column==5)
        {
            return "DAY";
        }
        else if(column==6)
        {
            return "STATION NAME";
        }
        else
        {
            return "STATION CODE";
           }}    
}

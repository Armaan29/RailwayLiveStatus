package UserPackage;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Classes;
import model.Days;
import model.Train;

public class MyModelBetweenStation extends AbstractTableModel
{
    ArrayList<Train>data;
    public MyModelBetweenStation(ArrayList<Train>data)
    {
        this.data=data;
    }
    @Override
            
    public int getRowCount()
    {
     return data.size();
    }

    @Override
    public int getColumnCount() {
    return 13;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
    Train train=data.get(rowIndex);
    Days days[] = train.getDays();
       
    if(columnIndex ==0)
    {
        return train.getTrainNo();
    }
    else if(columnIndex  ==1)
    {
        return train.getFromStation();
                }
    else if(columnIndex == 2)
    {
        return train.getToStation();
    
    }
    else if(columnIndex==3)
    
    {
        return train.getSourceDepartureTime();
        
    }
    else if(columnIndex ==4)
    {
        return train.getDestinationArriavlTime();
    }
    
    else if(columnIndex==5)
    {
        return train.getTravelTime();
        
    }
    else if(columnIndex ==6)
    
    {
       
        return days[0].getRuns();
    }
    else if(columnIndex ==7)
    {
        return days[1].getRuns();
    }
      
    else if(columnIndex ==8)
    {
        return days[2].getRuns();
    }
            
    else if(columnIndex ==9)
    {
        return days[3].getRuns();
    }
           
    else if(columnIndex ==10)
    {
        return days[4].getRuns();
    }
           
    else if(columnIndex ==11)
    {
        return days[5].getRuns();
    }
            
    else if(columnIndex ==12)
    {
        return days[6].getRuns();
    }
    else        
    {
        return train.getClasses();
    }}
    public String getColumnName(int column)
    {
    if(column ==0)
    {
        return "TRAIN NUMBER";
    }
    else if(column  ==1)
    {
        return "SOURCE";
                }
    else if(column== 2)
    {
        return "DESTINATION";
    
    }
    else if(column==3)
    
    {
        return "SOURCE DEPARTURE";
        
    }
    else if(column ==4)
    {
        return "DESTINATION ARRIVAL";
    }
    
    else if(column==5)
    {
        return "TRAVEL TIME";
        
    }
    else if(column==6)
    
    {
        return "MONDAY";
                }
    else if(column==7)
    
    {
        return "TUESDAY";
                }
    else if(column==8)
    
    {
        return "WEDNESDAY";
                }
    else if(column==9)
    
    {
        return "THURSDAY";
                }
    else if(column==10)
    
    {
        return "FRIDAY";
                }
    else if(column==11)
    
    {
        return "SATURDAY";
     }
    else if(column==12)
    
    {
        return "SUNDAY";
     }
    else        
    {
        return "CLASSES";
    }     
    }
}

package AdminPackage;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Notification;

    
public class MyModel extends AbstractTableModel
{
    ArrayList<Notification> data;
    public MyModel(ArrayList<Notification> data)
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
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) 
    {
           Notification notificationshow = data.get(rowIndex);
            if(columnIndex == 0)
           {
               return notificationshow.getTitle();
           }
           else if(columnIndex == 1)
           {
               return notificationshow.getDescription();
     }
           else
           {
               return notificationshow.getTime();
           }
    }

    @Override
    public String getColumnName(int column)
    { 
        
        if(column ==0 )
        {
            return "title";
        }
        else if(column == 1)
        {
            return "description";
        }
        else
        {
            return "time";
        }
    }
   
    }
    
   
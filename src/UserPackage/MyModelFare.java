
package UserPackage;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Fare;
import model.FareRequest;

public class MyModelFare extends AbstractTableModel
{
     ArrayList<Fare>data;
    public MyModelFare(ArrayList<Fare>data)
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
     return 2;      
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
    Fare fare =data.get(rowIndex);
    if(columnIndex == 0)
    {
        return fare.getCode();
        
   }
    else
    {   
       return "Rs."+fare.getFare();
    }}
    public String getColumnName(int Column)

    {
     if(Column==0)   
     {
         return "CLASS  NAME";
     }
    
     else
     {
         return "FARE";
         }
    }}

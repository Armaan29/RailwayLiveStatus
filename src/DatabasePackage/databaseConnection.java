package DatabasePackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.Notification;

public class databaseConnection {
    Connection con;
    Statement stmt;
    public void openConnection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/railway1","root","");
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        }
        catch (Exception ex)
        {
            System.out.println("Connection not created");
            ex.printStackTrace();
        }
        
    }   
       public void closeConnection()
    {
        try 
        {
            stmt.close();
            con.close();
            
        } catch (Exception e) 
        {
            System.out.println("Connection not closed");
            e.printStackTrace();
        }
    }
       public boolean loginCheck(String userid,String password)
       {
           try 
           {
          openConnection();
          ResultSet rs= stmt.executeQuery("Select * from login where userid='"+userid+"' and password='"+password+"'");
          if(rs.next())
           {
           return true;
               
           } 
           else
           {
            return false;
          }}
           catch (Exception e) 
           {
          System.out.println("ERROR");   
          
}
           finally
           {
                   closeConnection();
           }
       return false;
           }
               
     public void addNotifications(String Title,String discription )
     {
              try 
        {
            
            openConnection();
           
            ResultSet rs = stmt.executeQuery("select * from notification");
            rs.moveToInsertRow();
            rs.updateString("title", Title);
            rs.updateString("discription", discription);
            rs.insertRow();
            closeConnection();
        } 
        catch (Exception e)
        {
            System.out.println("Error");
        }
   
     }
       public ArrayList<Notification> getAllData()
       {
           try 
        {
            openConnection();
            ArrayList<Notification>Notificationlist = new ArrayList<>();
            ResultSet rs = stmt.executeQuery("select * from notification");
            while (rs.next())
            {                
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String discription = rs.getString("discription");
                String time=rs.getString("notifications_time"); 
                Notificationlist.add(new Notification(id, title, discription,time));
               
            }
            closeConnection();
            return Notificationlist;
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
       public void deleteNotification(int id)
       {
       try 
        {
            openConnection();
            ResultSet rs = stmt.executeQuery("select * from notification where id="+id);
            rs.next();
            rs.deleteRow();
           closeConnection();
            
        } 
        catch (Exception e)
        {
            System.out.println("Error");
        }
            
       }
    public static void main(String[] args) {
        databaseConnection database=new databaseConnection();
    }
}
  
    
   
 
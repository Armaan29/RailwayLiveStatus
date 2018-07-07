
package AdminPackage;

import DatabasePackage.databaseConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import model.Notification;
import org.json.JSONArray;
import org.json.JSONObject;
public class ServerWork implements Runnable
{   
    Socket socket;
databaseConnection connection;
    public ServerWork(Socket socket) {
        this.socket = socket;
        connection = new databaseConnection();
    }

    @Override
    public void run()
    {
        try 
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            String msg = br.readLine();
            if(msg.equalsIgnoreCase("login"))
            {
                
            }
            else if(msg.equalsIgnoreCase("notification"))
            {
                
                ArrayList<Notification> list = connection.getAllData();
                JSONObject jObject = new JSONObject();
                try
                {
                    JSONArray jArray = new JSONArray();
                    for (Notification notif : list)
                    {
                      JSONObject notifJSON = new JSONObject();
                      notifJSON.put("id", notif.getId());
                      notifJSON.put("title", notif.getTitle());
                      notifJSON.put("description", notif.getDescription());
                      notifJSON.put("time", notif.getTime());
                      jArray.put(notifJSON);
    
                    }
                    jObject.put("notificationList", jArray);
                    pw.println(jObject.toString());
                    pw.flush();
                } catch (Exception jse) {
                    jse.printStackTrace();
                }
            }
            
            
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    

    public static void main(String[] args) {
     ServerWork work = new ServerWork(null);
        
    }
}

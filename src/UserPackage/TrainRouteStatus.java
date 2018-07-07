package UserPackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.Classes;
import model.Days;
import model.Route;
import model.Station;
import model.Train;
import org.json.JSONArray;
import org.json.JSONObject;

public class TrainRouteStatus extends javax.swing.JFrame {

    public TrainRouteStatus() 
    {
        setContentPane(new JLabel(new ImageIcon("image3.jpg")));
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RouteTrainNumberTextField = new javax.swing.JTextField();
        RouteTrainSubmitButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        RouteTrainNumberTextField.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        RouteTrainNumberTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RouteTrainNumberTextFieldKeyTyped(evt);
            }
        });
        getContentPane().add(RouteTrainNumberTextField);
        RouteTrainNumberTextField.setBounds(340, 220, 330, 70);

        RouteTrainSubmitButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RouteTrainSubmitButton.setText("SUBMIT");
        RouteTrainSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RouteTrainSubmitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RouteTrainSubmitButton);
        RouteTrainSubmitButton.setBounds(400, 340, 130, 60);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ENTER TRAIN NUMBER");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(60, 300, 180, 70);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("ENTER  TRAIN  NUMBER");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 0, 280, 70);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 220, 280, 70);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(90, 60, 30));
        jLabel3.setText("TRAIN  ROUTE  STATUS");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 0, 290, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(160, 30, 410, 60);

        setSize(new java.awt.Dimension(763, 596));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RouteTrainSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RouteTrainSubmitButtonActionPerformed
        String number = RouteTrainNumberTextField.getText();
        try 
        {
            URL url = new URL("http://api.railwayapi.com/v2/route/train/"+number+"/apikey/"+"5fl1mk2db7"+"/");
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String data = "";
            while(true)
            {
                String json = br.readLine();
                if(json == null)
                {
                    break;
                }
                data = data+json;
            }
            JSONObject object = new JSONObject(data);
            int responseCode = object.getInt("response_code");
            if(responseCode == 200)
            {
                JSONObject train = object.getJSONObject("train");
                String trainName = train.getString("name");
                String trainNumber = train.getString("number");
                JSONArray daysArray = train.getJSONArray("days");
                Days days[] = new Days[7];
                for(int i = 0;i<daysArray.length();i++)
                {
                    JSONObject dayObject = daysArray.getJSONObject(i);
                    String code = dayObject.getString("code");
                    String runs = dayObject.getString("runs");
                    Days day = new Days(runs, code);
                    days[i] = day;
                }
                //classes
                
                JSONArray classesArray =train.getJSONArray("classes");
                Classes classArray[] =new Classes[8];
                for(int j=0;j<classArray.length;j++)
                {
                    JSONObject classObject = classesArray.getJSONObject(j);
                    String code1 = classObject.getString("code");
                    String available = classObject.getString("available");
                    classArray[j] = new Classes(code1, available);
                }
            //route
                JSONArray routeArray =object.getJSONArray("route");
                ArrayList<Route> routeList = new ArrayList<>();
                for(int k =0; k<routeArray.length();k++)
                {
                    JSONObject routeObject = routeArray.getJSONObject(k);
                    int routeNumber = routeObject.getInt("no");
                    String source = routeObject.getString("scharr");
                    String departure = routeObject.getString("schdep");
                    int distance = routeObject.getInt("distance");
                    int halt = routeObject.getInt("halt");
                    int day = routeObject.getInt("day");
                    JSONObject stationObject = routeObject.getJSONObject("station");
                    String stationName = stationObject.getString("name");
                    String stationCode = stationObject.getString("code");
                    Station station = new Station(stationName, stationCode);
                    Route route = new Route(routeNumber, source, departure, distance, halt, day, station);
                    routeList.add(route);
                }
             
                Train trainData = new Train(trainName, trainNumber);
                trainData.setDays(days);
                trainData.setClasses(classArray);
                trainData.setRouteList(routeList);
                
                TrainRouteShow show = new TrainRouteShow(trainData);
                show.setVisible(true);
                
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Train Not Found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        
    }//GEN-LAST:event_RouteTrainSubmitButtonActionPerformed

    private void RouteTrainNumberTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RouteTrainNumberTextFieldKeyTyped
        char ch = evt.getKeyChar();
        if(ch>='0'&&ch<='9')
        {
            
        }
        else
        {
            evt.consume();
        }
    }//GEN-LAST:event_RouteTrainNumberTextFieldKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrainRouteStatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RouteTrainNumberTextField;
    private javax.swing.JButton RouteTrainSubmitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

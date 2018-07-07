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

public class TrainNumberLiveTrainStatus extends javax.swing.JFrame {
    DateTextField calender;
    
  public TrainNumberLiveTrainStatus() {
      setContentPane(new JLabel(new ImageIcon("image3.jpg") ));
        initComponents();
          calender =new DateTextField();
        calender.setBounds(270,230,250,50);
        this.add(calender);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LiveTrainStatusSubmitButton = new javax.swing.JButton();
        LiveTrainNumberTextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        LiveTrainStatusSubmitButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LiveTrainStatusSubmitButton.setText("SUBMIT");
        LiveTrainStatusSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LiveTrainStatusSubmitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LiveTrainStatusSubmitButton);
        LiveTrainStatusSubmitButton.setBounds(340, 320, 100, 50);

        LiveTrainNumberTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        LiveTrainNumberTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LiveTrainNumberTextFieldKeyTyped(evt);
            }
        });
        getContentPane().add(LiveTrainNumberTextField);
        LiveTrainNumberTextField.setBounds(270, 130, 250, 50);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("TRAIN  NUMBER");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 0, 200, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(50, 130, 180, 50);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("DATE");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 0, 140, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(50, 230, 180, 50);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setText("LIVE  TRAIN  STATUS");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(30, 0, 310, 50);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(130, 10, 330, 50);

        setSize(new java.awt.Dimension(672, 468));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LiveTrainStatusSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LiveTrainStatusSubmitButtonActionPerformed
        String number = LiveTrainNumberTextField.getText();
        String date = calender.getText();
        try 
        {
            URL url = new URL("http://api.railwayapi.com/v2/live/train/"+number+"/date/"+date+"/apikey/"+"5fl1mk2db7"+"/");
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
                
            //route
                JSONArray routeArray =object.getJSONArray("route");
                ArrayList<Route>trainLiveStatusList = new ArrayList<>();
                for(int k =0; k<routeArray.length();k++)
                {
                    
                    JSONObject routeObject = routeArray.getJSONObject(k);
                    int routeNumber = routeObject.getInt("no");
                    String source = routeObject.getString("scharr");
                    String departure = routeObject.getString("schdep");
                    int distance = routeObject.getInt("distance");
                    String actualArrival= routeObject.getString("actarr");
                    String actualDeparture= routeObject.getString("actdep");
                    int late = routeObject.getInt("latemin");
                    JSONObject stationObject = routeObject.getJSONObject("station");
                    String stationName = stationObject.getString("name");
                    String stationCode = stationObject.getString("code");
                    Station station = new Station(stationName, stationCode);
                    Route route = new Route(routeNumber, source, departure, distance, actualArrival,actualDeparture,late,station);
                    trainLiveStatusList.add(route);
                }
             
                Train trainData = new Train(trainName, trainNumber);
                trainData.setRouteList(trainLiveStatusList);
                
                LiveTrainStatusFrame show = new LiveTrainStatusFrame(trainData);
                show.setVisible(true);
                
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Train Not Found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_LiveTrainStatusSubmitButtonActionPerformed

    private void LiveTrainNumberTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LiveTrainNumberTextFieldKeyTyped
         char ch = evt.getKeyChar();
        if(ch>='0'&&ch<='9')
        {
            
        }
        else
        {
            evt.consume();
        }
    }//GEN-LAST:event_LiveTrainNumberTextFieldKeyTyped

    public static void main(String[] args) {
        
    
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrainNumberLiveTrainStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainNumberLiveTrainStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainNumberLiveTrainStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainNumberLiveTrainStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrainNumberLiveTrainStatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LiveTrainNumberTextField;
    private javax.swing.JButton LiveTrainStatusSubmitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}

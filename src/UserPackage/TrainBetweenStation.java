
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

public class TrainBetweenStation extends javax.swing.JFrame {
        DateTextField calender;
        ArrayList<Train>add;
    public TrainBetweenStation() {
        setContentPane(new JLabel(new ImageIcon("image3.jpg")));
        add= new ArrayList<>();
        calender = new DateTextField();
        calender.setBounds(350,420,370,60);
        this.add(calender);
        initComponents();
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sourceStationTextField = new javax.swing.JTextField();
        submitTrainBetweenButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        destinationStationTextField1 = new javax.swing.JTextField();
        jPanel50 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        sourceStationTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(sourceStationTextField);
        sourceStationTextField.setBounds(350, 160, 370, 60);

        submitTrainBetweenButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        submitTrainBetweenButton.setText("SUBMIT");
        submitTrainBetweenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitTrainBetweenButtonActionPerformed(evt);
            }
        });
        getContentPane().add(submitTrainBetweenButton);
        submitTrainBetweenButton.setBounds(470, 540, 150, 70);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("DATE");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 0, 160, 60);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jPanel3);
        jPanel3.setBounds(640, 180, 160, 60);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(640, 180, 160, 60);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("DATE");
        jPanel16.add(jLabel7);
        jLabel7.setBounds(10, 0, 160, 60);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(null);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.add(jPanel18);
        jPanel18.setBounds(640, 180, 160, 60);

        jPanel16.add(jPanel17);
        jPanel17.setBounds(640, 180, 160, 60);

        jPanel1.add(jPanel16);
        jPanel16.setBounds(70, 400, 160, 60);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("DATE");
        jPanel19.add(jLabel8);
        jLabel8.setBounds(10, 0, 160, 60);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setLayout(null);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.add(jPanel21);
        jPanel21.setBounds(640, 180, 160, 60);

        jPanel19.add(jPanel20);
        jPanel20.setBounds(640, 180, 160, 60);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("DATE");
        jPanel22.add(jLabel9);
        jLabel9.setBounds(10, 0, 160, 60);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setLayout(null);

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.add(jPanel24);
        jPanel24.setBounds(640, 180, 160, 60);

        jPanel22.add(jPanel23);
        jPanel23.setBounds(640, 180, 160, 60);

        jPanel19.add(jPanel22);
        jPanel22.setBounds(70, 400, 160, 60);

        jPanel1.add(jPanel19);
        jPanel19.setBounds(70, 400, 160, 60);

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("DATE");
        jPanel25.add(jLabel10);
        jLabel10.setBounds(10, 0, 160, 60);

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setLayout(null);

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.add(jPanel27);
        jPanel27.setBounds(640, 180, 160, 60);

        jPanel25.add(jPanel26);
        jPanel26.setBounds(640, 180, 160, 60);

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("DATE");
        jPanel28.add(jLabel11);
        jLabel11.setBounds(10, 0, 160, 60);

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setLayout(null);

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.add(jPanel30);
        jPanel30.setBounds(640, 180, 160, 60);

        jPanel28.add(jPanel29);
        jPanel29.setBounds(640, 180, 160, 60);

        jPanel25.add(jPanel28);
        jPanel28.setBounds(70, 400, 160, 60);

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("DATE");
        jPanel31.add(jLabel12);
        jLabel12.setBounds(10, 0, 160, 60);

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setLayout(null);

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.add(jPanel33);
        jPanel33.setBounds(640, 180, 160, 60);

        jPanel31.add(jPanel32);
        jPanel32.setBounds(640, 180, 160, 60);

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("DATE");
        jPanel34.add(jLabel13);
        jLabel13.setBounds(10, 0, 160, 60);

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.setLayout(null);

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.add(jPanel36);
        jPanel36.setBounds(640, 180, 160, 60);

        jPanel34.add(jPanel35);
        jPanel35.setBounds(640, 180, 160, 60);

        jPanel31.add(jPanel34);
        jPanel34.setBounds(70, 400, 160, 60);

        jPanel25.add(jPanel31);
        jPanel31.setBounds(70, 400, 160, 60);

        jPanel1.add(jPanel25);
        jPanel25.setBounds(70, 400, 160, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(70, 420, 160, 60);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jPanel6);
        jPanel6.setBounds(640, 180, 160, 60);

        jPanel4.add(jPanel5);
        jPanel5.setBounds(640, 180, 160, 60);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("DESTINATION");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(10, 0, 180, 60);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(null);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(null);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.add(jPanel9);
        jPanel9.setBounds(640, 180, 160, 60);

        jPanel7.add(jPanel8);
        jPanel8.setBounds(640, 180, 160, 60);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("DESTINATION");
        jPanel7.add(jLabel4);
        jLabel4.setBounds(10, 0, 180, 60);

        jPanel4.add(jPanel7);
        jPanel7.setBounds(70, 290, 160, 60);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(null);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(null);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.add(jPanel12);
        jPanel12.setBounds(640, 180, 160, 60);

        jPanel10.add(jPanel11);
        jPanel11.setBounds(640, 180, 160, 60);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("DESTINATION");
        jPanel10.add(jLabel5);
        jLabel5.setBounds(10, 0, 180, 60);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(null);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(null);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.add(jPanel15);
        jPanel15.setBounds(640, 180, 160, 60);

        jPanel13.add(jPanel14);
        jPanel14.setBounds(640, 180, 160, 60);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("DESTINATION");
        jPanel13.add(jLabel6);
        jLabel6.setBounds(10, 0, 180, 60);

        jPanel10.add(jPanel13);
        jPanel13.setBounds(70, 290, 160, 60);

        jPanel4.add(jPanel10);
        jPanel10.setBounds(70, 290, 160, 60);

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));
        jPanel37.setLayout(null);

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));
        jPanel38.setLayout(null);

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));
        jPanel38.add(jPanel39);
        jPanel39.setBounds(640, 180, 160, 60);

        jPanel37.add(jPanel38);
        jPanel38.setBounds(640, 180, 160, 60);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("DESTINATION");
        jPanel37.add(jLabel14);
        jLabel14.setBounds(10, 0, 180, 60);

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));
        jPanel40.setLayout(null);

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));
        jPanel41.setLayout(null);

        jPanel42.setBackground(new java.awt.Color(255, 255, 255));
        jPanel41.add(jPanel42);
        jPanel42.setBounds(640, 180, 160, 60);

        jPanel40.add(jPanel41);
        jPanel41.setBounds(640, 180, 160, 60);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("DESTINATION");
        jPanel40.add(jLabel15);
        jLabel15.setBounds(10, 0, 180, 60);

        jPanel37.add(jPanel40);
        jPanel40.setBounds(70, 290, 160, 60);

        jPanel43.setBackground(new java.awt.Color(255, 255, 255));
        jPanel43.setLayout(null);

        jPanel44.setBackground(new java.awt.Color(255, 255, 255));
        jPanel44.setLayout(null);

        jPanel45.setBackground(new java.awt.Color(255, 255, 255));
        jPanel44.add(jPanel45);
        jPanel45.setBounds(640, 180, 160, 60);

        jPanel43.add(jPanel44);
        jPanel44.setBounds(640, 180, 160, 60);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("DESTINATION");
        jPanel43.add(jLabel16);
        jLabel16.setBounds(10, 0, 180, 60);

        jPanel46.setBackground(new java.awt.Color(255, 255, 255));
        jPanel46.setLayout(null);

        jPanel47.setBackground(new java.awt.Color(255, 255, 255));
        jPanel47.setLayout(null);

        jPanel48.setBackground(new java.awt.Color(255, 255, 255));
        jPanel47.add(jPanel48);
        jPanel48.setBounds(640, 180, 160, 60);

        jPanel46.add(jPanel47);
        jPanel47.setBounds(640, 180, 160, 60);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("DESTINATION");
        jPanel46.add(jLabel17);
        jLabel17.setBounds(10, 0, 180, 60);

        jPanel43.add(jPanel46);
        jPanel46.setBounds(70, 290, 160, 60);

        jPanel37.add(jPanel43);
        jPanel43.setBounds(70, 290, 160, 60);

        jPanel4.add(jPanel37);
        jPanel37.setBounds(70, 290, 160, 60);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(70, 290, 160, 60);

        jPanel49.setBackground(new java.awt.Color(255, 255, 255));
        jPanel49.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("SOURCE");
        jPanel49.add(jLabel1);
        jLabel1.setBounds(20, 0, 150, 60);

        getContentPane().add(jPanel49);
        jPanel49.setBounds(70, 160, 160, 60);

        destinationStationTextField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(destinationStationTextField1);
        destinationStationTextField1.setBounds(350, 290, 370, 60);

        jPanel50.setBackground(new java.awt.Color(255, 255, 255));
        jPanel50.setLayout(null);

        jLabel18.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel18.setText("TRAIN  BETWEEN  STATION");
        jPanel50.add(jLabel18);
        jLabel18.setBounds(40, 0, 460, 70);

        getContentPane().add(jPanel50);
        jPanel50.setBounds(190, 20, 460, 70);

        setSize(new java.awt.Dimension(988, 742));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
                          

    private void submitTrainBetweenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitTrainBetweenButtonActionPerformed
    String source = sourceStationTextField.getText();
    String destination = destinationStationTextField1.getText(); 
        try 
        {
             String date = calender.getText();
            URL url = new URL("http://api.railwayapi.com/v2/between/source/"+source+"/dest/"+destination+"/date/"+date+"/apikey/"+"5fl1mk2db7"+"/");
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
                JSONArray trainArray = object.getJSONArray("trains");
                for (int i = 0; i < trainArray.length(); i++) {
                    
                JSONObject train =trainArray.getJSONObject(i);
                String trainNumber = train.getString("number");
                String trainName = train.getString("name");
                String travelTime = train.getString("travel_time");
                String sourceDepartureTime = train.getString("src_departure_time");
                String destinationArrivalTime= train.getString("dest_arrival_time");
                        
                JSONObject fromStation = train.getJSONObject("from_station");
                String code = fromStation.getString("code");
                String name =fromStation.getString("name");
                
                JSONObject tostation = train.getJSONObject("to_station");
                String destinationcode = tostation.getString("code");
                String destinationname =tostation.getString("name");
                       
               
                //classes
                
                JSONArray classesArray =train.getJSONArray("classes");
                Classes classArray[] =new Classes[8];
                for(int j=0;j<classArray.length;j++)
                {
                    
                    JSONObject classObject = classesArray.getJSONObject(j);
                    String code1 = classObject.getString("code");
                    String available = classObject.getString("available");
                    String codeName = classObject.getString("name");
                    classArray[j] = new Classes(code1, available);
                }
                
                //days
                JSONArray daysArray = train.getJSONArray("days");
                Days days[] = new Days[7];
                for(int k = 0;k<daysArray.length();k++)
                {
                    JSONObject dayObject = daysArray.getJSONObject(k);
                    String code1 = dayObject.getString("code");
                    //String runs = "";
                    String runs = dayObject.get("runs").toString();
                    Days day = new Days(runs, code1);
                    days[k] = day;
                }
                
             
                Train trainData = new Train(trainName, trainNumber);
                trainData.setFromStation(name);
                trainData.setFromStation(code);
                trainData.setDays(days);
                trainData.setSourceDepartureTime(sourceDepartureTime);
                trainData.setToStation(destinationcode);
                trainData.setDestinationArriavlTime(destinationArrivalTime);
                trainData.setTravelTime(travelTime);
                trainData.setToStation(destinationname);
                trainData.setClasses(classArray);
                add.add(trainData);
                }
                TrainBetweenStationTable show = new TrainBetweenStationTable(add);
                show.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Train Not Found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_submitTrainBetweenButtonActionPerformed
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
            java.util.logging.Logger.getLogger(TrainBetweenStation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainBetweenStation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainBetweenStation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainBetweenStation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrainBetweenStation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField destinationStationTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField sourceStationTextField;
    private javax.swing.JButton submitTrainBetweenButton;
    // End of variables declaration//GEN-END:variables
}

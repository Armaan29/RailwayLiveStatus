
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
import model.Fare;
import model.FareRequest;
import model.Route;
import model.Station;
import model.Train;
import org.json.JSONArray;
import org.json.JSONObject;

public class TrainFareEnquiry extends javax.swing.JFrame {
     DateTextField calender;
     ArrayList<String> quotaList;
      
    public TrainFareEnquiry() {
        
        setContentPane(new JLabel(new ImageIcon("image3.jpg")));
        initComponents();
        quotaList = new ArrayList<String>();
        quotaList.add("GN");
        quotaList.add("LD");
        quotaList.add("DF");
        quotaList.add("FT");
        quotaList.add("TQ");
        quotaList.add("PT");
        quotaList.add("HP");
        quotaList.add("SS");
         
        calender = new DateTextField();
        calender.setBounds(390,540,390,60);
        this.add(calender);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        quotaComboBox = new javax.swing.JComboBox();
        trainNumberTextField = new javax.swing.JTextField();
        stationTextField = new javax.swing.JTextField();
        destinationNameTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        submitButtonFare = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        quotaComboBox.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        quotaComboBox.setMaximumRowCount(10);
        quotaComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1. GN (General Quota)", "2. LD (Ladies Quota)", "3. DF (Defence Quota)", "4. FT (Foreign Tourist Quota)", "5. TQ (Tatkal Quota)", "6. PT (Premium Tatkal Quota)", "7. HP (Physically Handicapped Quota)", "8. SS (Senior Citizen Quota) " }));
        quotaComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quotaComboBoxMouseClicked(evt);
            }
        });
        quotaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quotaComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(quotaComboBox);
        quotaComboBox.setBounds(390, 440, 390, 60);

        trainNumberTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        trainNumberTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                trainNumberTextFieldKeyTyped(evt);
            }
        });
        getContentPane().add(trainNumberTextField);
        trainNumberTextField.setBounds(390, 40, 390, 60);

        stationTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        stationTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stationTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(stationTextField);
        stationTextField.setBounds(390, 140, 390, 60);

        destinationNameTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(destinationNameTextField);
        destinationNameTextField.setBounds(390, 240, 390, 60);

        ageTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        ageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextFieldActionPerformed(evt);
            }
        });
        ageTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ageTextFieldKeyTyped(evt);
            }
        });
        getContentPane().add(ageTextField);
        ageTextField.setBounds(390, 340, 390, 60);

        submitButtonFare.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        submitButtonFare.setText("SUBMIT");
        submitButtonFare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonFareActionPerformed(evt);
            }
        });
        getContentPane().add(submitButtonFare);
        submitButtonFare.setBounds(460, 680, 200, 70);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 10, 160, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("TRAIN  NUMBER");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 0, 180, 60);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(60, 40, 180, 60);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setText("SOURCE");
        jPanel6.add(jLabel6);
        jLabel6.setBounds(10, 0, 180, 60);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(60, 140, 180, 60);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setText("DESTINATION");
        jPanel7.add(jLabel7);
        jLabel7.setBounds(10, 0, 180, 60);

        getContentPane().add(jPanel7);
        jPanel7.setBounds(60, 240, 180, 60);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setText("AGE");
        jPanel8.add(jLabel8);
        jLabel8.setBounds(10, 0, 180, 60);

        getContentPane().add(jPanel8);
        jPanel8.setBounds(60, 340, 180, 60);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setText("QUOTA");
        jPanel9.add(jLabel9);
        jLabel9.setBounds(10, 0, 180, 60);

        getContentPane().add(jPanel9);
        jPanel9.setBounds(60, 440, 180, 60);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("DATE");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 0, 180, 60);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(60, 540, 180, 60);

        setSize(new java.awt.Dimension(1049, 868));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void quotaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quotaComboBoxActionPerformed
    }//GEN-LAST:event_quotaComboBoxActionPerformed

    private void submitButtonFareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonFareActionPerformed
          String number = trainNumberTextField.getText();
          String source = stationTextField.getText();
          String destination = destinationNameTextField.getText();
          String age= ageTextField.getText();
          int index = quotaComboBox.getSelectedIndex();
          String quota = quotaList.get(index);
          String date = calender.getText();
         try {
        URL url = new URL("http://api.railwayapi.com/v2/fare/train/"+number+"/source/"+source+"/dest/"+destination+"/age/"+age+"/quota/"+quota+"/date/"+date+"/apikey/"+"5fl1mk2db7"+"/");
           
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
              // String trainName = train.getString("name");
                String trainNumber = train.getString("number");
                Train trainObject = new Train("", trainNumber);
                JSONObject fromStation = object.getJSONObject("from_station");
                String code = fromStation.getString("code");
                String name =fromStation.getString("name");
                Station fromStationObject = new Station(name, code);
                
                
                JSONObject tostation = object.getJSONObject("to_station");
                String desinationcode = tostation.getString("code");
                String destinationname =tostation.getString("name");
                Station toStationObject = new Station(destinationname, desinationcode);
                
                JSONObject quotaFare = object.getJSONObject("quota");
                String quotaCode = quotaFare.getString("code");
                String quotaName = quotaFare.getString("name");
                Station quotaObject = new Station(quotaName, quotaCode);
               
//Fare 
                JSONArray fareArray =object.getJSONArray("fare");
                ArrayList<Fare> fareList = new ArrayList<>();
                for(int k =0; k<fareArray.length();k++)
                {
                    JSONObject fareObject = fareArray.getJSONObject(k);
                    String fareCode = fareObject.getString("code");
                    String fareName = fareObject.getString("name");
                    String fareFare = fareObject.getString("fare");
                    Fare fare = new Fare(fareName, fareCode, fareFare);
                    fareList.add(fare);    
                }
//                Train trainData = new Train(trainName, trainNumber);
//                trainData.setFare(Fare);
                
                FareRequest request = new FareRequest(trainObject, fromStationObject, toStationObject, quotaObject, fareList);
                TrainFareTable show = new TrainFareTable(request);
                show.setVisible(true);
                
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Train Not Found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        

    }//GEN-LAST:event_submitButtonFareActionPerformed

    private void ageTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageTextFieldKeyTyped
        char ch = evt.getKeyChar();
        if(ch>='0'&&ch<='9')
        {
            
        }
        else
        {
            evt.consume();
        }
    }//GEN-LAST:event_ageTextFieldKeyTyped

    private void quotaComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quotaComboBoxMouseClicked
       int quota =evt.getButton();
       
       
    }//GEN-LAST:event_quotaComboBoxMouseClicked

    private void ageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextFieldActionPerformed

    private void stationTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stationTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stationTextFieldActionPerformed

    private void trainNumberTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_trainNumberTextFieldKeyTyped
       char ch = evt.getKeyChar();
        if(ch>='0'&&ch<='9')
        {
            
        }
        else
        {
            evt.consume();
        }
    }//GEN-LAST:event_trainNumberTextFieldKeyTyped

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
            java.util.logging.Logger.getLogger(TrainFareEnquiry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainFareEnquiry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainFareEnquiry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainFareEnquiry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrainFareEnquiry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageTextField;
    private javax.swing.JTextField destinationNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JComboBox quotaComboBox;
    private javax.swing.JTextField stationTextField;
    private javax.swing.JButton submitButtonFare;
    private javax.swing.JTextField trainNumberTextField;
    // End of variables declaration//GEN-END:variables
}

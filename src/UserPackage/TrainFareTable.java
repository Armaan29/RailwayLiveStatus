
package UserPackage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import model.FareRequest;
import model.Station;


public class TrainFareTable extends javax.swing.JFrame {
FareRequest fare;
Station station; 
Station free;
Station quota;
    public TrainFareTable(FareRequest fare)
    {
         setContentPane(new JLabel(new ImageIcon("image3.jpg")));
        
        initComponents();
        this.fare=fare;
        station = fare.getToStation();
        String destination=station.getStationName();
        free = fare.getFromStation();
        String source = free.getStationName();
        quota = fare.getQuota();
        String quota1=quota.getStationName();
        destinationTextField.setText(destination);
        sourceTextField.setText(source);
        quotaTextField.setText(quota1);
        
        MyModelFare model = new MyModelFare(fare.getFareList());
        trainFareTable.setModel(model);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        trainFareTable = new javax.swing.JTable();
        sourceTextField = new javax.swing.JTextField();
        destinationTextField = new javax.swing.JTextField();
        quotaTextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        trainFareTable.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        trainFareTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        trainFareTable.setRowHeight(30);
        jScrollPane1.setViewportView(trainFareTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 262, 890, 310);

        sourceTextField.setEditable(false);
        sourceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(sourceTextField);
        sourceTextField.setBounds(200, 50, 230, 50);

        destinationTextField.setEditable(false);
        getContentPane().add(destinationTextField);
        destinationTextField.setBounds(200, 140, 230, 50);

        quotaTextField.setEditable(false);
        getContentPane().add(quotaTextField);
        quotaTextField.setBounds(640, 50, 230, 50);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("QUOTA");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 0, 110, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(480, 50, 130, 50);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("DESTINATION");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 0, 150, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 140, 160, 50);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 228, 890, 2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("SOURCE ");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(10, 0, 160, 50);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 50, 160, 50);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Classes  Description:-                    \n1. 3A(AC 3-Tier)                                  5. FC(First Class)\n2 .SL(Sleeper)                                     6. 2A(AC 2-Tier)\n3. 1A(AC First Class)                         7. CC(AC Chair Class)\n4. 2S(Second Sitting)                         8.  3E(AC 3-Tier Economy)");
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 630, 540, 130);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("Classes  Description:-                    \n1. 3A(AC 3-Tier)                                  5. FC(First Class)\n2 .SL(Sleeper)                                     6. 2A(AC 2-Tier)\n3. 1A(AC First Class)                         7. CC(AC Chair Class)\n4. 2S(Second Sitting)                         8.  3E(AC 3-Tier Economy)");
        jScrollPane3.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(0, 630, 460, 110);

        setSize(new java.awt.Dimension(908, 815));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sourceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceTextFieldActionPerformed
       
    }//GEN-LAST:event_sourceTextFieldActionPerformed

   {
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
            java.util.logging.Logger.getLogger(TrainFareTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainFareTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainFareTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainFareTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrainFareTable(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField destinationTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField quotaTextField;
    private javax.swing.JTextField sourceTextField;
    private javax.swing.JTable trainFareTable;
    // End of variables declaration//GEN-END:variables
}

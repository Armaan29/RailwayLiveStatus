package UserPackage;

import DatabasePackage.databaseConnection;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class FirstPageForm extends javax.swing.JFrame
{
 databaseConnection connection;
    public FirstPageForm() {
        connection= new databaseConnection();
         setContentPane(new JLabel(new ImageIcon("image3.jpg")));
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        notificationUserButton = new javax.swing.JButton();
        LiveTrainStatusButton = new javax.swing.JButton();
        TrainRouteButton = new javax.swing.JButton();
        trainsBetweenStationButton = new javax.swing.JButton();
        trainFareEnquiryButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        notificationUserButton.setBackground(new java.awt.Color(255, 255, 255));
        notificationUserButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        notificationUserButton.setText("NOTIFICATIONS");
        notificationUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificationUserButtonActionPerformed(evt);
            }
        });
        getContentPane().add(notificationUserButton);
        notificationUserButton.setBounds(590, 510, 390, 160);

        LiveTrainStatusButton.setBackground(new java.awt.Color(255, 255, 255));
        LiveTrainStatusButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LiveTrainStatusButton.setText("Live Train Status");
        LiveTrainStatusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LiveTrainStatusButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LiveTrainStatusButton);
        LiveTrainStatusButton.setBounds(30, 70, 390, 160);

        TrainRouteButton.setBackground(new java.awt.Color(255, 255, 255));
        TrainRouteButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TrainRouteButton.setText("TRAIN ROUTE");
        TrainRouteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrainRouteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(TrainRouteButton);
        TrainRouteButton.setBounds(580, 70, 390, 160);

        trainsBetweenStationButton.setBackground(new java.awt.Color(255, 255, 255));
        trainsBetweenStationButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        trainsBetweenStationButton.setText("TRAINS BETWEEN STATIONS");
        trainsBetweenStationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainsBetweenStationButtonActionPerformed(evt);
            }
        });
        getContentPane().add(trainsBetweenStationButton);
        trainsBetweenStationButton.setBounds(310, 290, 390, 160);

        trainFareEnquiryButton.setBackground(new java.awt.Color(255, 255, 255));
        trainFareEnquiryButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        trainFareEnquiryButton.setText("TRAIN FARE ENQUIRY");
        trainFareEnquiryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainFareEnquiryButtonActionPerformed(evt);
            }
        });
        getContentPane().add(trainFareEnquiryButton);
        trainFareEnquiryButton.setBounds(30, 510, 390, 160);

        setSize(new java.awt.Dimension(1053, 784));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void notificationUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificationUserButtonActionPerformed
    connection.openConnection();
     NotificationClickPage show = new NotificationClickPage();
     show.setVisible(true);
    }//GEN-LAST:event_notificationUserButtonActionPerformed

    private void LiveTrainStatusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LiveTrainStatusButtonActionPerformed
     TrainNumberLiveTrainStatus show = new TrainNumberLiveTrainStatus();
     show.setVisible(true);
    }//GEN-LAST:event_LiveTrainStatusButtonActionPerformed

    private void TrainRouteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrainRouteButtonActionPerformed
      TrainRouteStatus show = new TrainRouteStatus();
      show.setVisible(true);
    }//GEN-LAST:event_TrainRouteButtonActionPerformed

    private void trainsBetweenStationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainsBetweenStationButtonActionPerformed
       TrainBetweenStation show = new TrainBetweenStation();
       show.setVisible(true);
    }//GEN-LAST:event_trainsBetweenStationButtonActionPerformed

    private void trainFareEnquiryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainFareEnquiryButtonActionPerformed
       TrainFareEnquiry show = new TrainFareEnquiry();
       show.setVisible(true);
    }//GEN-LAST:event_trainFareEnquiryButtonActionPerformed

  
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FirstPageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstPageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstPageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstPageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstPageForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LiveTrainStatusButton;
    private javax.swing.JButton TrainRouteButton;
    private javax.swing.JButton notificationUserButton;
    private javax.swing.JButton trainFareEnquiryButton;
    private javax.swing.JButton trainsBetweenStationButton;
    // End of variables declaration//GEN-END:variables
}

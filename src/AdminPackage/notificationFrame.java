
package AdminPackage;

import DatabasePackage.databaseConnection;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class notificationFrame extends javax.swing.JFrame {

    databaseConnection connection;
    public notificationFrame() {
        setContentPane(new JLabel(new ImageIcon("image3.jpg")));
        initComponents();
        connection = new databaseConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        titleTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ADD NOTIFICATIONS");
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Title");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 0, 70, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 150, 250, 70);

        titleTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(titleTextField);
        titleTextField.setBounds(340, 150, 880, 80);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Description");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(50, 0, 250, 90);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(30, 300, 250, 80);

        addButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton);
        addButton.setBounds(660, 730, 210, 80);

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        descriptionTextArea.setRows(5);
        jScrollPane1.setViewportView(descriptionTextArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(340, 300, 880, 380);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setText("ADD  NOTIFICATIONS");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(130, 0, 420, 80);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(350, 10, 570, 80);

        setSize(new java.awt.Dimension(1258, 934));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
    String Title=titleTextField.getText();
    String discription=descriptionTextArea.getText();
    connection.addNotifications(Title, discription);
    JOptionPane.showMessageDialog(null,"NOTIFICATION ADD SUCCESSFULLY");
    titleTextField.setText("");
    descriptionTextArea.setText("");
    
    }//GEN-LAST:event_addButtonActionPerformed
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
            java.util.logging.Logger.getLogger(notificationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(notificationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(notificationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(notificationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new notificationFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField titleTextField;
    // End of variables declaration//GEN-END:variables
}

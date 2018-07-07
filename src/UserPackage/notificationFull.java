/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserPackage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import model.Notification;
public class notificationFull extends javax.swing.JFrame {
   Notification notif;
    public notificationFull(Notification notif) {
         this.notif = notif;
        setContentPane(new JLabel(new ImageIcon("image3.jpg") ));
         initComponents();
         titleTextField.setText(notif.getTitle());
       descriptionTextArea.setText(notif.getDescription());
   
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        titleTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("TITLE");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 0, 180, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(60, 90, 180, 60);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("DESCRIPTION");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 0, 180, 60);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(60, 220, 180, 60);

        titleTextField.setEditable(false);
        titleTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(titleTextField);
        titleTextField.setBounds(330, 90, 460, 60);

        descriptionTextArea.setEditable(false);
        descriptionTextArea.setColumns(20);
        descriptionTextArea.setFont(new java.awt.Font("Monospaced", 0, 17)); // NOI18N
        descriptionTextArea.setRows(5);
        jScrollPane1.setViewportView(descriptionTextArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(330, 220, 460, 270);

        setSize(new java.awt.Dimension(849, 636));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(notificationFull.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(notificationFull.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(notificationFull.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(notificationFull.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new notificationFull(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField titleTextField;
    // End of variables declaration//GEN-END:variables
}

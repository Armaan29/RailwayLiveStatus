/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserPackage;

import AdminPackage.Login;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Firstpage extends javax.swing.JFrame {

  
    public Firstpage() {
         setContentPane(new JLabel(new ImageIcon("image3.jpg")));
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userTextField = new javax.swing.JButton();
        adminTextfield = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        userTextField.setBackground(new java.awt.Color(255, 255, 255));
        userTextField.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        userTextField.setText("USER");
        userTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(userTextField);
        userTextField.setBounds(290, 280, 190, 170);

        adminTextfield.setBackground(new java.awt.Color(255, 255, 255));
        adminTextfield.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        adminTextfield.setText("ADMIN");
        adminTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminTextfieldActionPerformed(evt);
            }
        });
        getContentPane().add(adminTextfield);
        adminTextfield.setBounds(20, 30, 190, 170);

        setSize(new java.awt.Dimension(562, 563));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextFieldActionPerformed
        FirstPageForm  show = new FirstPageForm();
        show.setVisible(true);
    }//GEN-LAST:event_userTextFieldActionPerformed

    private void adminTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminTextfieldActionPerformed
   Login show = new Login();
   show.setVisible(true);
    }//GEN-LAST:event_adminTextfieldActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Firstpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Firstpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Firstpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Firstpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Firstpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminTextfield;
    private javax.swing.JButton userTextField;
    // End of variables declaration//GEN-END:variables
}

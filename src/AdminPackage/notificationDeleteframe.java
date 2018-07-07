package AdminPackage;

import DatabasePackage.databaseConnection;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.Notification;

public class notificationDeleteframe extends javax.swing.JFrame 
{
      Notification notif;
      databaseConnection connection;
      public notificationDeleteframe(Notification notif)
    {
       
       connection=new databaseConnection();
       this.notif = notif;
       setContentPane(new JLabel(new ImageIcon("image3.jpg") ));
       initComponents();
       titleDeleteTextField.setText(notif.getTitle());
       descriptionDeleteTextArea.setText(notif.getDescription());
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deleteButton = new javax.swing.JButton();
        titleDeleteTextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionDeleteTextArea = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Description = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        deleteButton.setBackground(new java.awt.Color(255, 255, 255));
        deleteButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton);
        deleteButton.setBounds(310, 380, 90, 50);

        titleDeleteTextField.setBackground(new java.awt.Color(255, 255, 255));
        titleDeleteTextField.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        getContentPane().add(titleDeleteTextField);
        titleDeleteTextField.setBounds(170, 50, 400, 70);

        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Title");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 0, 100, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 50, 0, 70);

        descriptionDeleteTextArea.setColumns(20);
        descriptionDeleteTextArea.setRows(5);
        jScrollPane1.setViewportView(descriptionDeleteTextArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(170, 150, 400, 190);

        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setText("Title");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 0, 140, 70);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 50, 140, 70);

        jPanel4.setLayout(null);

        Description.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Description.setText("Description");
        jPanel4.add(Description);
        Description.setBounds(30, 0, 140, 110);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(10, 150, 140, 130);

        setSize(new java.awt.Dimension(642, 496));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int option = JOptionPane.showConfirmDialog(null,"ARE YOU SURE?");
        if(option == JOptionPane.YES_OPTION)
        {
        connection.deleteNotification(notif.getId());
        JOptionPane.showMessageDialog(this,"Deleted");
        dispose();
        }
        else
        {
            dispose();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed
    public static void main(String[] args) {
       
       
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(notificationDeleteframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(notificationDeleteframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(notificationDeleteframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(notificationDeleteframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new notificationDeleteframe(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Description;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextArea descriptionDeleteTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField titleDeleteTextField;
    // End of variables declaration//GEN-END:variables
}

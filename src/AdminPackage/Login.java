package AdminPackage;
import DatabasePackage.databaseConnection;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    databaseConnection connection;

    public Login()     
    {
        setContentPane(new JLabel(new ImageIcon("image2.jpg") ));
        initComponents();
        connection = new databaseConnection();
        
           }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginButton = new javax.swing.JButton();
        useridTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LOGIN");
        getContentPane().setLayout(null);

        loginButton.setText("LOGIN");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton);
        loginButton.setBounds(290, 310, 160, 70);
        getContentPane().add(useridTextField);
        useridTextField.setBounds(250, 80, 330, 60);
        getContentPane().add(passwordTextField);
        passwordTextField.setBounds(250, 200, 330, 60);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("UserId");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 120, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(80, 80, 120, 60);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Password");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 120, 60);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(80, 200, 120, 60);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        
      connection.openConnection();
        try {
            boolean result =connection.loginCheck(useridTextField.getText(),passwordTextField.getText());
            if(result==true)
            {
            dispose();
            AfterLogin show = new AfterLogin();
            show.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid UserId Or Password");
                useridTextField.setText("");
                passwordTextField.setText("");
            }
        } catch (Exception e) 
        {
            System.out.println("Error");
        }     
         connection.closeConnection();
          
    }//GEN-LAST:event_loginButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JTextField useridTextField;
    // End of variables declaration//GEN-END:variables
}

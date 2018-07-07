package UserPackage;

import DatabasePackage.databaseConnection;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import model.Notification;
import org.json.JSONArray;
import org.json.JSONObject;
public class NotificationClickPage extends javax.swing.JFrame {

    databaseConnection connection;
    ArrayList<Notification>list;
    public NotificationClickPage() {
        connection=new databaseConnection();
        list= new ArrayList<>();
        setContentPane(new JLabel(new ImageIcon("image3.jpg")));
        initComponents();
        try 
        {
            Socket socket = new Socket("192.168.43.23", 9000);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            pw.println("notification");
            pw.flush();
            String msg = br.readLine();
            list = new ArrayList<>();
            JSONObject object = new JSONObject(msg);
            JSONArray notificationArray = object.getJSONArray("notificationList");
            for(int i=0;i<notificationArray.length();i++)
            {
                JSONObject notif = notificationArray.getJSONObject(i);
                int id = notif.getInt("id");
                String title = notif.getString("title");
                String description = notif.getString("description");
                String time = notif.getString("time");
                Notification n = new Notification(id, title, description, time);
                list.add(n);
            }
        } catch (Exception e) 
        {
            System.out.println("error");
        }
        MyModel model=new MyModel(list);
        clientDataShowTable.setModel(model);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        clientDataShowTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        clientDataShowTable.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        clientDataShowTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        clientDataShowTable.setRowHeight(30);
        clientDataShowTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientDataShowTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(clientDataShowTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 170, 800, 380);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 26)); // NOI18N
        jLabel1.setText("NOTIFICATIONS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 0, 400, 90);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(220, 20, 400, 90);

        setSize(new java.awt.Dimension(830, 656));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clientDataShowTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientDataShowTableMouseClicked
     int index = clientDataShowTable.rowAtPoint(new Point(evt.getX(), evt.getY()));
      Notification notif = list.get(index);
      new notificationFull(notif).setVisible(true);
    }//GEN-LAST:event_clientDataShowTableMouseClicked

    public static void main(String[] args) {
      
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
            java.util.logging.Logger.getLogger(NotificationClickPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotificationClickPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotificationClickPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotificationClickPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() 
            {
                new NotificationClickPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable clientDataShowTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

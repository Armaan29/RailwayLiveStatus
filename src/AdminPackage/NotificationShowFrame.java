
package AdminPackage;

import DatabasePackage.databaseConnection;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import model.Notification;

public class NotificationShowFrame extends javax.swing.JFrame {
    ArrayList<Notification>NotificationList;
    databaseConnection connection;
    public NotificationShowFrame() 
    {
       
       connection = new databaseConnection();
        setContentPane(new JLabel(new ImageIcon("image3.jpg") ));
       initComponents();
       refreshData();
    }
    
    void refreshData()
    {
        NotificationList=connection.getAllData();
       MyModel model=new MyModel(NotificationList);
       notificationTable.setModel(model);
    }
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        notificationTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NOTIFICATION TABLE");
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        notificationTable.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        notificationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title", "Description", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        notificationTable.setRowHeight(30);
        notificationTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        notificationTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notificationTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(notificationTable);
        if (notificationTable.getColumnModel().getColumnCount() > 0) {
            notificationTable.getColumnModel().getColumn(0).setHeaderValue("Title");
            notificationTable.getColumnModel().getColumn(1).setHeaderValue("Description");
            notificationTable.getColumnModel().getColumn(2).setHeaderValue("Time");
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 170, 740, 310);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 26)); // NOI18N
        jLabel1.setText("NOTIFICATIONS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 0, 400, 90);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(210, 20, 400, 90);

        setSize(new java.awt.Dimension(756, 607));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void notificationTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notificationTableMouseClicked
        int index = notificationTable.rowAtPoint(new Point(evt.getX(), evt.getY()));
        Notification notif = NotificationList.get(index);
        
        new notificationDeleteframe(notif).setVisible(true);
    }//GEN-LAST:event_notificationTableMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        refreshData();
    }//GEN-LAST:event_formWindowActivated
    public static void main(String[] args) {
        
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotificationShowFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable notificationTable;
    // End of variables declaration//GEN-END:variables
}

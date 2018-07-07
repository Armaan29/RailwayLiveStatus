package UserPackage;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import model.Train;

public class TrainBetweenStationTable extends javax.swing.JFrame
{
    ArrayList<Train> data;
    
    public TrainBetweenStationTable(ArrayList<Train>data) 
    {setContentPane(new JLabel(new ImageIcon("image3.jpg")));
        initComponents();
       this.data =data;
       int number =data.size();
       stationTotalTextField.setText(number+" TRAINS FOUND");
       MyModelBetweenStation model = new MyModelBetweenStation(data);
       trainBetweenTable.setModel(model);
      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        trainBetweenTable = new javax.swing.JTable();
        stationTotalTextField = new javax.swing.JTextField();
        jPanel50 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        trainBetweenTable.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        trainBetweenTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13"
            }
        ));
        trainBetweenTable.setRowHeight(30);
        jScrollPane1.setViewportView(trainBetweenTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 190, 1070, 400);

        stationTotalTextField.setEditable(false);
        stationTotalTextField.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        getContentPane().add(stationTotalTextField);
        stationTotalTextField.setBounds(370, 640, 330, 80);

        jPanel50.setBackground(new java.awt.Color(255, 255, 255));
        jPanel50.setLayout(null);

        jLabel18.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(175, 63, 14));
        jLabel18.setText("TRAIN  BETWEEN  STATION");
        jPanel50.add(jLabel18);
        jLabel18.setBounds(40, 0, 460, 70);

        getContentPane().add(jPanel50);
        jPanel50.setBounds(230, 60, 460, 70);

        setSize(new java.awt.Dimension(1087, 797));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
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
            java.util.logging.Logger.getLogger(TrainBetweenStationTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainBetweenStationTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainBetweenStationTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainBetweenStationTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrainBetweenStationTable(null).setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField stationTotalTextField;
    private javax.swing.JTable trainBetweenTable;
    // End of variables declaration//GEN-END:variables
}

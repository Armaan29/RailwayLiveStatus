
package UserPackage;


import javax.swing.ImageIcon;
import javax.swing.JLabel;
import model.Train;

public class LiveTrainStatusFrame extends javax.swing.JFrame {
    Train train;
    public LiveTrainStatusFrame(Train train)
    {
        
        this.train=train;
        setContentPane(new JLabel(new ImageIcon("image3.jpg")));
        initComponents();
        String name = train.getName();
        String number = train.getTrainNo();
        trainNumberTextField.setText(number);
        trainNameTextField.setText(name);
        MyModelLive model;
        model = new MyModelLive(train.getRouteList());
        LiveTrainStatusShowTable.setModel(model);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        trainNameTextField = new javax.swing.JTextField();
        trainNumberTextField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        LiveTrainStatusShowTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        trainNameTextField.setEditable(false);
        trainNameTextField.setBackground(new java.awt.Color(255, 255, 255));
        trainNameTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        trainNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainNameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(trainNameTextField);
        trainNameTextField.setBounds(510, 30, 350, 50);

        trainNumberTextField.setEditable(false);
        trainNumberTextField.setBackground(new java.awt.Color(255, 255, 255));
        trainNumberTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        trainNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainNumberTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(trainNumberTextField);
        trainNumberTextField.setBounds(170, 30, 170, 50);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(370, 150, 0, 2);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(370, 0, 50, 120);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(0, 120, 880, 2);

        LiveTrainStatusShowTable.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        LiveTrainStatusShowTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        LiveTrainStatusShowTable.setRowHeight(30);
        jScrollPane1.setViewportView(LiveTrainStatusShowTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 190, 870, 330);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("TRAIN  NAME");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 130, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(380, 30, 120, 50);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("TRAIN  NUMBER");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 150, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 30, 150, 50);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("LIVE STATUS");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(30, 0, 120, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(320, 130, 180, 40);

        setSize(new java.awt.Dimension(892, 701));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void trainNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainNumberTextFieldActionPerformed
                 
    }//GEN-LAST:event_trainNumberTextFieldActionPerformed

    private void trainNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainNameTextFieldActionPerformed
   
    }//GEN-LAST:event_trainNameTextFieldActionPerformed
    public static void main(String[] args) {
        
    

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LiveTrainStatusFrame(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable LiveTrainStatusShowTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField trainNameTextField;
    private javax.swing.JTextField trainNumberTextField;
    // End of variables declaration//GEN-END:variables
}

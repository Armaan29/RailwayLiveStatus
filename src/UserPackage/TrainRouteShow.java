
package UserPackage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.Classes;
import model.Days;
import model.Train;



public class TrainRouteShow extends javax.swing.JFrame {
    Train train;
    public TrainRouteShow(Train train) {
        setContentPane(new JLabel(new ImageIcon("image3.jpg") ));
        initComponents();
        this.train = train;
        String name = train.getName();
        String number = train.getTrainNo();
        trainNameShowTextField.setText(name);
        trainNumberShowTextField1.setText(number);
        Days days[] = train.getDays();
        for (int i = 0; i < days.length; i++) {
            Days day = days[i];
            System.out.println(day.getRuns());
        }
        if(days[0].getRuns().equals("Y"))
        {
            ImageIcon icon = new ImageIcon("tick.png");
            MondayLabel.setIcon(icon);
                    }
        else
        {
            ImageIcon icon = new ImageIcon("cross.png");
            MondayLabel.setIcon(icon);
        }
        if(days[1].getRuns().equals("Y"))
        {
              ImageIcon icon = new ImageIcon("tick.png");
            TuesdayLabel.setIcon(icon);
                    }
        else
        {
            ImageIcon icon = new ImageIcon("cross.png");
             TuesdayLabel.setIcon(icon);
          
        }
        if(days[2].getRuns().equals("Y"))
        {
              ImageIcon icon = new ImageIcon("tick.png");
              WednesdayLabel.setIcon(icon);
                    }
        else
        {
            ImageIcon icon = new ImageIcon("cross.png");
            WednesdayLabel.setIcon(icon);
          
        }
        if(days[3].getRuns().equals("Y"))
        {
              ImageIcon icon = new ImageIcon("tick.png");
              ThursdayLabel.setIcon(icon);
                    }
        else
        {
            ImageIcon icon = new ImageIcon("cross.png");
            ThursdayLabel.setIcon(icon);
          
        }
        if(days[4].getRuns().equals("Y"))
        {
               ImageIcon icon = new ImageIcon("tick.png");
               FridayLabel.setIcon(icon);
         }
        else
        {
            ImageIcon icon = new ImageIcon("cross.png");
            FridayLabel.setIcon(icon);
         
        }
        if(days[5].getRuns().equals("Y"))
        {
                 ImageIcon icon = new ImageIcon("tick.png");
            SaturdayLabel.setIcon(icon);
                    }
        else
        {
            ImageIcon icon = new ImageIcon("cross.png");
            SaturdayLabel.setIcon(icon);
       
        }
        if(days[6].getRuns().equals("Y"))
        {
            ImageIcon icon = new ImageIcon("tick.png");
            SundayLabel.setIcon(icon);
                    }
        else
        {
            ImageIcon icon = new ImageIcon("cross.png");
            SundayLabel.setIcon(icon);
          
        }
        Classes classes[]=train.getClasses();
        for (int k = 0; k <classes.length; k++)
        {
         if(classes[0].getCode().equals("3A"))
        {
            ImageIcon icon = new ImageIcon("tick.png");
            A3Label.setIcon(icon);
                    }
        else
        {
            ImageIcon icon = new ImageIcon("cross.png");
            A3Label.setIcon(icon);
        }   
         if(classes[1].getCode().equals("SL"))
        {
            ImageIcon icon = new ImageIcon("tick.png");
            SLLabel.setIcon(icon);
                    }
        else
        {
            ImageIcon icon = new ImageIcon("cross.png");
            SLLabel.setIcon(icon);
        }   
         if(classes[2].getCode().equals("1A"))
        {
            ImageIcon icon = new ImageIcon("tick.png");
            A1Label.setIcon(icon);
                    }
        else
        {
            ImageIcon icon = new ImageIcon("cross.png");
            A1Label.setIcon(icon);
        }   
         if(classes[3].getCode().equals("2S"))
        {
            ImageIcon icon = new ImageIcon("tick.png");
            S2Label.setIcon(icon);
                    }
        else
        {
            ImageIcon icon = new ImageIcon("cross.png");
            S2Label.setIcon(icon);
        }   
         if(classes[4].getCode().equals("FC"))
        {
            ImageIcon icon = new ImageIcon("tick.png");
            FCLabel.setIcon(icon);
                    }
        else
        {
            ImageIcon icon = new ImageIcon("cross.png");
            FCLabel.setIcon(icon);
        }   
         if(classes[5].getCode().equals("2A"))
        {
            ImageIcon icon = new ImageIcon("tick.png");
            A2Label.setIcon(icon);
                    }
        else
        {
            ImageIcon icon = new ImageIcon("cross.png");
            A2Label.setIcon(icon);
        }   
         if(classes[6].getCode().equals("CC"))
        {
            ImageIcon icon = new ImageIcon("tick.png");
            CCLabel.setIcon(icon);
              
        }
        else
        {
            ImageIcon icon = new ImageIcon("cross.png");
            CCLabel.setIcon(icon);
        }   
         if(classes[0].getCode().equals("3E"))
        {
            ImageIcon icon = new ImageIcon("tick.png");
            E3Label.setIcon(icon);
                    }
        else
        {
            ImageIcon icon = new ImageIcon("cross.png");
            E3Label.setIcon(icon);
        }   
        }
        MyModelUser model = new MyModelUser(train.getRouteList());
        trainRouteTable.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        trainNameShowTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        trainNumberShowTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        trainRouteTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        A3Label = new javax.swing.JLabel();
        SLLabel = new javax.swing.JLabel();
        A1Label = new javax.swing.JLabel();
        S2Label = new javax.swing.JLabel();
        FCLabel = new javax.swing.JLabel();
        A2Label = new javax.swing.JLabel();
        E3Label = new javax.swing.JLabel();
        CCLabel = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        MondayLabel = new javax.swing.JLabel();
        TuesdayLabel = new javax.swing.JLabel();
        WednesdayLabel = new javax.swing.JLabel();
        ThursdayLabel = new javax.swing.JLabel();
        SundayLabel = new javax.swing.JLabel();
        SaturdayLabel = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        FridayLabel = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("TRAIN NAME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(460, 20, 120, 40);

        trainNameShowTextField.setEditable(false);
        trainNameShowTextField.setBackground(new java.awt.Color(255, 255, 255));
        trainNameShowTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainNameShowTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(trainNameShowTextField);
        trainNameShowTextField.setBounds(600, 20, 440, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("TRAIN NUMBER");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 170, 40);

        trainNumberShowTextField1.setEditable(false);
        trainNumberShowTextField1.setBackground(new java.awt.Color(255, 255, 255));
        trainNumberShowTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainNumberShowTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(trainNumberShowTextField1);
        trainNumberShowTextField1.setBounds(190, 20, 150, 40);

        trainRouteTable.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        trainRouteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        trainRouteTable.setRowHeight(30);
        jScrollPane1.setViewportView(trainRouteTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 320, 1070, 300);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 72, 1070, 10);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 330, 0, 2);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 250, 1070, 10);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("  S");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(240, 140, 30, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("  M");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 140, 30, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText(" W");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 140, 30, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("  T");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(130, 140, 30, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("  T");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 140, 30, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("  F");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(170, 140, 30, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText(" S");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(210, 140, 30, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("  3E");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(880, 140, 30, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setText("  3A");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(600, 140, 40, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setText("  1A");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(678, 140, 32, 40);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setText("  2S");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(720, 140, 40, 40);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setText("  SL");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(640, 140, 30, 40);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setText("  FC");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(760, 140, 30, 40);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel16.setText("  2A");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(800, 140, 40, 40);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel17.setText("  CC");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(840, 140, 40, 40);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(400, 110, 0, 0);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(450, 0, 60, 250);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("CLASSES");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(470, 80, 110, 30);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("RUNNING  DAYS");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(10, 80, 180, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("ROUTE");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(420, 260, 110, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);
        jPanel1.add(A3Label);
        A3Label.setBounds(10, 0, 30, 30);
        jPanel1.add(SLLabel);
        SLLabel.setBounds(50, 0, 30, 30);
        jPanel1.add(A1Label);
        A1Label.setBounds(90, 0, 30, 30);
        jPanel1.add(S2Label);
        S2Label.setBounds(130, 0, 30, 30);
        jPanel1.add(FCLabel);
        FCLabel.setBounds(170, 0, 30, 30);
        jPanel1.add(A2Label);
        A2Label.setBounds(210, 0, 30, 30);
        jPanel1.add(E3Label);
        E3Label.setBounds(290, 0, 30, 30);
        jPanel1.add(CCLabel);
        CCLabel.setBounds(250, 0, 30, 30);
        jPanel1.add(jLabel30);
        jLabel30.setBounds(250, 0, 30, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(600, 170, 330, 30);
        getContentPane().add(jLabel26);
        jLabel26.setBounds(850, 170, 30, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);
        jPanel2.add(MondayLabel);
        MondayLabel.setBounds(10, 0, 30, 30);
        jPanel2.add(TuesdayLabel);
        TuesdayLabel.setBounds(50, 0, 30, 30);
        jPanel2.add(WednesdayLabel);
        WednesdayLabel.setBounds(90, 0, 30, 30);
        jPanel2.add(ThursdayLabel);
        ThursdayLabel.setBounds(120, 0, 30, 30);
        jPanel2.add(SundayLabel);
        SundayLabel.setBounds(230, 0, 30, 30);
        jPanel2.add(SaturdayLabel);
        SaturdayLabel.setBounds(200, 0, 30, 30);
        jPanel2.add(jLabel29);
        jLabel29.setBounds(200, 0, 30, 30);
        jPanel2.add(FridayLabel);
        FridayLabel.setBounds(160, 0, 30, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 170, 270, 30);
        getContentPane().add(jLabel24);
        jLabel24.setBounds(130, 170, 30, 30);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Classes  Description:-                    \n1. 3A(AC 3-Tier)                                  5. FC(First Class)\n2 .SL(Sleeper)                                     6. 2A(AC 2-Tier)\n3. 1A(AC First Class)                         7. CC(AC Chair Class)\n4. 2S(Second Sitting)                         8.  3E(AC 3-Tier Economy)");
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 630, 540, 140);

        setSize(new java.awt.Dimension(1089, 840));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void trainNameShowTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainNameShowTextFieldActionPerformed
             
    
    }//GEN-LAST:event_trainNameShowTextFieldActionPerformed

    private void trainNumberShowTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainNumberShowTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trainNumberShowTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(TrainRouteShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainRouteShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainRouteShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainRouteShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrainRouteShow(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A1Label;
    private javax.swing.JLabel A2Label;
    private javax.swing.JLabel A3Label;
    private javax.swing.JLabel CCLabel;
    private javax.swing.JLabel E3Label;
    private javax.swing.JLabel FCLabel;
    private javax.swing.JLabel FridayLabel;
    private javax.swing.JLabel MondayLabel;
    private javax.swing.JLabel S2Label;
    private javax.swing.JLabel SLLabel;
    private javax.swing.JLabel SaturdayLabel;
    private javax.swing.JLabel SundayLabel;
    private javax.swing.JLabel ThursdayLabel;
    private javax.swing.JLabel TuesdayLabel;
    private javax.swing.JLabel WednesdayLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField trainNameShowTextField;
    private javax.swing.JTextField trainNumberShowTextField1;
    private javax.swing.JTable trainRouteTable;
    // End of variables declaration//GEN-END:variables
}

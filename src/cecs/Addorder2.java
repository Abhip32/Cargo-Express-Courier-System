/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cecs;

import java.sql.DriverManager;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Abhishek Patil
 */
public class Addorder2 extends javax.swing.JFrame {

    /**
     * Creates new form Addorder2
     */
    String nm1;
    String id1;
    String id2;
    public Addorder2() {
        initComponents();
    }
    public Addorder2(String id, String nm, String idd) {
        initComponents();
        nm1=nm;
        id1=id;
        id2=idd;
        tid.setText( id);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Name = new javax.swing.JLabel();
        Name1 = new javax.swing.JLabel();
        Name2 = new javax.swing.JLabel();
        Name3 = new javax.swing.JLabel();
        head = new javax.swing.JLabel();
        sendername = new javax.swing.JTextField();
        receivername = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        receiveradress = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        senderadress = new javax.swing.JTextArea();
        head1 = new javax.swing.JLabel();
        service = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Name4 = new javax.swing.JLabel();
        dateo = new javax.swing.JTextField();
        Name5 = new javax.swing.JLabel();
        dated = new javax.swing.JTextField();
        tid = new javax.swing.JTextField();
        sendername1 = new javax.swing.JLabel();
        sendername2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        Name.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setText("Sender Address");

        Name1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        Name1.setForeground(new java.awt.Color(255, 255, 255));
        Name1.setText("Sender Name");

        Name2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        Name2.setForeground(new java.awt.Color(255, 255, 255));
        Name2.setText("Receiver Name");

        Name3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        Name3.setForeground(new java.awt.Color(255, 255, 255));
        Name3.setText("Receiver Address");

        head.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        head.setForeground(new java.awt.Color(255, 255, 255));
        head.setText("Tracking ID");

        sendername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendernameActionPerformed(evt);
            }
        });

        receivername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receivernameActionPerformed(evt);
            }
        });

        receiveradress.setColumns(20);
        receiveradress.setRows(5);
        jScrollPane1.setViewportView(receiveradress);

        senderadress.setColumns(20);
        senderadress.setRows(5);
        jScrollPane2.setViewportView(senderadress);

        head1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        head1.setForeground(new java.awt.Color(255, 255, 255));
        head1.setText("Service Type");

        service.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select delivery type", "Gold (Fastest Delivery)", "Silver(Moderate Delivery)", "Bronze(Ordinary Delivery)" }));

        jButton1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 102, 0));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 102, 0));
        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Name4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        Name4.setForeground(new java.awt.Color(255, 255, 255));
        Name4.setText("Date Of Order");

        Name5.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        Name5.setForeground(new java.awt.Color(255, 255, 255));
        Name5.setText("Date Of Delivery");

        sendername1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        sendername1.setForeground(new java.awt.Color(255, 255, 255));
        sendername1.setText("Cargo Express Courier System");

        sendername2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        sendername2.setForeground(new java.awt.Color(255, 255, 255));
        sendername2.setText("Add Order");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cecs/Web capture_5-11-2021_111348_depositphotos.com.jpeg"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cecs/mainlogo.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(head)
                                    .addComponent(head1)
                                    .addComponent(Name1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Name))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Name3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Name2)))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sendername, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(receivername, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(service, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(103, 103, 103)
                                        .addComponent(Name5)
                                        .addGap(57, 57, 57))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(dated, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(20, 20, 20))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton1)
                                                .addGap(37, 37, 37))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Name4)
                                .addComponent(dateo, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(sendername2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(sendername1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(sendername1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sendername2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Name1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sendername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Name4, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dateo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name2)
                            .addComponent(receivername, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Name3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(head, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(service, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2)
                                    .addComponent(jButton1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(head1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Name5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dated, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sendernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sendernameActionPerformed

    private void receivernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receivernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_receivernameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            java.sql.Connection Con=DriverManager.getConnection("jdbc:derby://localhost:1527/CECS","root","password");
            String sql="DELETE FROM ORDERDETAILS WHERE sendername=?";
            java.sql.PreparedStatement Psmt=Con.prepareStatement(sql);
            Psmt.setString(1,"");
            Psmt.execute();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        new Addorder(nm1,id2).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         try{
            java.sql.Connection Con=DriverManager.getConnection("jdbc:derby://localhost:1527/CECS","root","password");
            String sql="UPDATE ORDERDETAILS SET servicetype=?,sendername=?,senderadress=?,receivername=?,receiveradress=?,amount=?,progress=?,orderdate=?,receivedate=? WHERE ID=?";
            
            java.sql.PreparedStatement Psmt=Con.prepareStatement(sql);
            String ser=service.getSelectedItem().toString();
            Psmt.setString(1,ser);
            Psmt.setString(2,sendername.getText());
            Psmt.setString(3,senderadress.getText());
            Psmt.setString(4,receivername.getText());
            Psmt.setString(5,receiveradress.getText()); 
            Psmt.setString(7,"20");
            Psmt.setString(10,id1);
            System.out.println(id1);
            if(ser=="Gold (Fastest Delivery)")
            {
                Psmt.setString(6,"600");
                LocalDate dt2=LocalDate.now();
                Psmt.setString(8,dt2.toString());
                LocalDate dt3=dt2.plusDays(3);
                Psmt.setString(9,dt3.toString());
                dateo.setText(dt2.toString());
                dated.setText(dt3.toString());
            }
            else if(ser=="Silver(Moderate Delivery)")
            {
                Psmt.setString(6,"400");
                LocalDate dt2=LocalDate.now();
                Psmt.setString(8,dt2.toString());
                LocalDate dt3=dt2.plusDays(5);
                Psmt.setString(9,dt3.toString());
                 dateo.setText(dt2.toString());
                dated.setText(dt3.toString());
            }
            else if(ser=="Bronze(Ordinary Delivery)")
            {
                Psmt.setString(6,"200");
                LocalDate dt2=LocalDate.now();
                Psmt.setString(8,dt2.toString());
                LocalDate dt3=dt2.plusDays(7);
                Psmt.setString(9,dt3.toString());
                dateo.setText(dt2.toString());
                System.out.println(dt2.toString());
                dated.setText(dt3.toString());
            }
            Psmt.execute();
            if(sendername.getText().equals("")||senderadress.getText().equals("")||receivername.getText().equals("")||receiveradress.getText().equals("")||ser.equals("select delivery type"))
            {
                JOptionPane.showMessageDialog(null,"Please Fill All Fields");
            }
            else
            {
             JOptionPane.showMessageDialog(null,"Order Added","Please Check All Details by clicking next", JOptionPane.PLAIN_MESSAGE);
             new DetailsPage(nm1,id1,id2).setVisible(true);
             this.dispose();
             }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Please Fill All Fields");
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Addorder2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addorder2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addorder2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addorder2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Addorder2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Name1;
    private javax.swing.JLabel Name2;
    private javax.swing.JLabel Name3;
    private javax.swing.JLabel Name4;
    private javax.swing.JLabel Name5;
    private javax.swing.JTextField dated;
    private javax.swing.JTextField dateo;
    private javax.swing.JLabel head;
    private javax.swing.JLabel head1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea receiveradress;
    private javax.swing.JTextField receivername;
    private javax.swing.JTextArea senderadress;
    private javax.swing.JTextField sendername;
    private javax.swing.JLabel sendername1;
    private javax.swing.JLabel sendername2;
    private javax.swing.JComboBox<String> service;
    private javax.swing.JTextField tid;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory.system;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

/**
 *
 * @author CALAK
 */
public class set_akses extends javax.swing.JInternalFrame {

    Connection conn=null;
    Statement stmn;
    ResultSet rs;
    public set_akses() {
        initComponents();
        
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background31 = new design.background3();
        panelTransparant1 = new design.panelTransparant();
        panelTransparant2 = new design.panelTransparant();
        button2 = new design.button();
        jLabel5 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        panelTransparant3 = new design.panelTransparant();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        panelTransparant4 = new design.panelTransparant();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        panelTransparant6 = new design.panelTransparant();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setEnabled(false);
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(1090, 535));

        panelTransparant2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pencarian Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10), new java.awt.Color(102, 102, 102))); // NOI18N

        button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/exit.png"))); // NOI18N
        button2.setText("Keluar");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Username");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USER", "JEMMY", "CALAK" }));

        panelTransparant3.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu Master"));

        jCheckBox4.setText("Data Suplier");

        jCheckBox3.setText("Input Suplier");

        jCheckBox2.setText("Data Barang");

        jCheckBox1.setText("Input Barang");

        jCheckBox5.setText("Input Cabang");

        jCheckBox6.setText("Data Cabang");

        javax.swing.GroupLayout panelTransparant3Layout = new javax.swing.GroupLayout(panelTransparant3);
        panelTransparant3.setLayout(panelTransparant3Layout);
        panelTransparant3Layout.setHorizontalGroup(
            panelTransparant3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparant3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTransparant3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5))
                .addGap(32, 32, 32)
                .addGroup(panelTransparant3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox2))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelTransparant3Layout.setVerticalGroup(
            panelTransparant3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparant3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTransparant3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTransparant3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTransparant3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        panelTransparant4.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu Transaksi"));

        jCheckBox7.setText("Daftar Barang Masuk");

        jCheckBox8.setText("Daftar Barang Keluar");

        jCheckBox9.setText("Input Barang Keluar");

        jCheckBox10.setText("Input Barang Masuk");

        jCheckBox11.setText("Retur Barang");

        jCheckBox18.setText("Data Cabang");

        javax.swing.GroupLayout panelTransparant4Layout = new javax.swing.GroupLayout(panelTransparant4);
        panelTransparant4.setLayout(panelTransparant4Layout);
        panelTransparant4Layout.setHorizontalGroup(
            panelTransparant4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparant4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTransparant4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox10)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox11))
                .addGap(32, 32, 32)
                .addGroup(panelTransparant4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox18)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTransparant4Layout.setVerticalGroup(
            panelTransparant4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparant4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTransparant4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox10)
                    .addComponent(jCheckBox9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTransparant4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTransparant4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox11)
                    .addComponent(jCheckBox18))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        panelTransparant6.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu Setting"));

        jCheckBox21.setText("Hak Akses");

        jCheckBox22.setText("Input User");

        javax.swing.GroupLayout panelTransparant6Layout = new javax.swing.GroupLayout(panelTransparant6);
        panelTransparant6.setLayout(panelTransparant6Layout);
        panelTransparant6Layout.setHorizontalGroup(
            panelTransparant6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparant6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox22)
                .addGap(46, 46, 46)
                .addComponent(jCheckBox21)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        panelTransparant6Layout.setVerticalGroup(
            panelTransparant6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparant6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTransparant6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox22)
                    .addComponent(jCheckBox21))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelTransparant2Layout = new javax.swing.GroupLayout(panelTransparant2);
        panelTransparant2.setLayout(panelTransparant2Layout);
        panelTransparant2Layout.setHorizontalGroup(
            panelTransparant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparant2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelTransparant2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelTransparant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTransparant6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelTransparant2Layout.createSequentialGroup()
                        .addComponent(panelTransparant3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelTransparant4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTransparant2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTransparant2Layout.setVerticalGroup(
            panelTransparant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparant2Layout.createSequentialGroup()
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(panelTransparant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTransparant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panelTransparant3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelTransparant4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panelTransparant6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 160, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hak Akses User");

        javax.swing.GroupLayout panelTransparant1Layout = new javax.swing.GroupLayout(panelTransparant1);
        panelTransparant1.setLayout(panelTransparant1Layout);
        panelTransparant1Layout.setHorizontalGroup(
            panelTransparant1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparant1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTransparant2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelTransparant1Layout.createSequentialGroup()
                .addGap(436, 436, 436)
                .addComponent(jLabel4)
                .addContainerGap(532, Short.MAX_VALUE))
        );
        panelTransparant1Layout.setVerticalGroup(
            panelTransparant1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTransparant1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelTransparant2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout background31Layout = new javax.swing.GroupLayout(background31);
        background31.setLayout(background31Layout);
        background31Layout.setHorizontalGroup(
            background31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTransparant1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        background31Layout.setVerticalGroup(
            background31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTransparant1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_button2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private design.background3 background31;
    private design.button button2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private design.panelTransparant panelTransparant1;
    private design.panelTransparant panelTransparant2;
    private design.panelTransparant panelTransparant3;
    private design.panelTransparant panelTransparant4;
    private design.panelTransparant panelTransparant6;
    // End of variables declaration//GEN-END:variables
}

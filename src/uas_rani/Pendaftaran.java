/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_rani;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static uas_rani.Config.Koneksi;

/**
 *
 * @author IT SAYGON WATERPARK
 */
public class Pendaftaran extends javax.swing.JFrame {

    /**
     * Creates new form Pendaftaran
     */
    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabModel;
    Connection cn = Koneksi();
    
    public Pendaftaran() {
        initComponents();
        
        
        btnGroupJebnisKelamin.add(radioLakilaki);
        btnGroupJebnisKelamin.add(radioPerempaun);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupJebnisKelamin = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        in_nama = new javax.swing.JTextField();
        in_nik = new javax.swing.JTextField();
        radioLakilaki = new javax.swing.JRadioButton();
        radioPerempaun = new javax.swing.JRadioButton();
        in_alamat = new javax.swing.JTextField();
        in_ibu = new javax.swing.JTextField();
        in_tglLahir = new javax.swing.JTextField();
        in_saldoPerdana = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btn_daftar = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        batal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Pendaftaran Nasabah Baru");

        jLabel2.setText("Nama Nasabah");

        jLabel3.setText("NIK");

        jLabel4.setText("Jenis Kelamin");

        jLabel5.setText("Alamat");

        jLabel6.setText("Nama Ibu Kandung");

        jLabel7.setText("Tgl Lahir (yyyy-mm-dd)");

        radioLakilaki.setText("Laki-laki");

        radioPerempaun.setText("Perempuan");

        in_tglLahir.setToolTipText("Format tgl yyy-mm-dd");

        in_saldoPerdana.setText("0");

        jLabel8.setText("Saldo Perdana");

        btn_daftar.setText("Daftar");
        btn_daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_daftarActionPerformed(evt);
            }
        });

        clear.setText("Bersihkan");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        batal.setText("Batal");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radioLakilaki)
                        .addGap(18, 18, 18)
                        .addComponent(radioPerempaun))
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(in_nama, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                    .addComponent(in_nik)
                    .addComponent(in_alamat)
                    .addComponent(in_ibu)
                    .addComponent(in_tglLahir)
                    .addComponent(in_saldoPerdana))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btn_daftar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(batal)
                .addGap(0, 79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(in_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(in_nik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioLakilaki)
                    .addComponent(radioPerempaun))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(in_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(in_ibu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(in_tglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(in_saldoPerdana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_daftar)
                    .addComponent(clear)
                    .addComponent(batal))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_batalActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        in_nama.setText("");
        in_nik.setText("");
        in_alamat.setText("");
        in_tglLahir.setText("");
        in_saldoPerdana.setText("");
        in_ibu.setText("");
        radioLakilaki.setSelected(false);
        radioPerempaun.setSelected(false);
    }//GEN-LAST:event_clearActionPerformed

    private void btn_daftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_daftarActionPerformed
        // TODO add your handling code here:
        String nama     = in_nama.getText().toString();
        String nik      = in_nik.getText().toString();
        String alamat   = in_alamat.getText().toString();
        String tgl_lahir= in_tglLahir.getText().toString();
        String ibu      = in_ibu.getText().toString();
        int saldo    = Integer.parseInt(in_saldoPerdana.getText());
        String jenis_Kelamin = "";
        if(radioLakilaki.isSelected()){
            jenis_Kelamin = "laki-laki";
        }else if (radioPerempaun.isSelected()){
            jenis_Kelamin = "perempuan";
        }else{
            JOptionPane.showMessageDialog(rootPane, "Jenis Kelamin belum dipilih..");
        }
        
        if(nama.equals("") || nik.equals("") || alamat.equals("") || tgl_lahir.equals("") || ibu.equals("") || saldo == 0){
            JOptionPane.showMessageDialog(rootPane, "ada field yang kosong...");
        }else{
            String query = "INSERT INTO nasabah "
                            +"(`id`, `nama`, `nik`, `jenis_kelamin`, `alamat`, `ibu_kandung`, `tgl_lahir`, `saldo`)"
                            +" VALUES (NULL, '"+nama+"', '"+nik+"', '"+jenis_Kelamin+"', '"+alamat+"', '"+ibu+"', '"+tgl_lahir+"', '"+saldo+"');";
            
            try {
                st = cn.createStatement();
                st.executeUpdate(query);
                JOptionPane.showMessageDialog(rootPane, "Berhasil menambahkan data..");
                
                in_nama.setText("");
                in_nik.setText("");
                in_alamat.setText("");
                in_tglLahir.setText("");
                in_saldoPerdana.setText("");
                in_ibu.setText("");
                radioLakilaki.setSelected(false);
                radioPerempaun.setSelected(false);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Gagal Regitrasi Nasabah...");
            }
        }
    }//GEN-LAST:event_btn_daftarActionPerformed

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
            java.util.logging.Logger.getLogger(Pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pendaftaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.ButtonGroup btnGroupJebnisKelamin;
    private javax.swing.JButton btn_daftar;
    private javax.swing.JButton clear;
    private javax.swing.JTextField in_alamat;
    private javax.swing.JTextField in_ibu;
    private javax.swing.JTextField in_nama;
    private javax.swing.JTextField in_nik;
    private javax.swing.JTextField in_saldoPerdana;
    private javax.swing.JTextField in_tglLahir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton radioLakilaki;
    private javax.swing.JRadioButton radioPerempaun;
    // End of variables declaration//GEN-END:variables
}

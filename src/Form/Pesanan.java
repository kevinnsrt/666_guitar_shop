/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form;

/**
 *
 * @author nitro
 */

import Config.Koneksi; 
import com.mysql.cj.jdbc.Blob;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
public class Pesanan extends javax.swing.JFrame {
    private Connection conn;
    /**
     * Creates new form Pesanan
     */
   public Pesanan() {
    initComponents();
    try {
        conn = Koneksi.getConnection(); 
        if (conn != null) {
            System.out.println("Koneksi berhasil di dalam Pesanan");
        }
        getData(); // 
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Koneksi gagal: " + e.getMessage());
    }
}


    private void getData(){
    DefaultTableModel model = (DefaultTableModel) tbl_pesanan.getModel();
    model.setRowCount(0); 
    
    try {
        String sql = "SELECT * FROM pesanan";
        PreparedStatement st = conn.prepareStatement(sql);
        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            int id_pesanan = rs.getInt("id_pesanan");
            int id = rs.getInt("id");
            String nama_pesanan = rs.getString("nama_pesanan");
            String nama_user = rs.getString("nama_user");

           
            Object[] rowData = {id_pesanan,id,nama_pesanan, nama_user};
            model.addRow(rowData);
        }

        rs.close();
        st.close();
    } catch (Exception e) {
        Logger.getLogger(Pesanan.class.getName()).log(Level.SEVERE, null, e);
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_pesanan = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        sidebar = new javax.swing.JPanel();
        pesananButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        pesananButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_pesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Pesanan", "ID Barang", "Pesanan", "Nama User"
            }
        ));
        jScrollPane1.setViewportView(tbl_pesanan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 1220, 640));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Selesai");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 740, 110, 50));

        sidebar.setBackground(new java.awt.Color(51, 51, 51));

        pesananButton.setBackground(new java.awt.Color(0, 102, 102));
        pesananButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pesananButton.setForeground(new java.awt.Color(204, 204, 204));
        pesananButton.setText("Pesanan Masuk");
        pesananButton.setBorderPainted(false);
        pesananButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesananButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DASHBOARD");

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Stock Barang");
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Riwayat Pesanan");
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        pesananButton2.setBackground(new java.awt.Color(51, 51, 51));
        pesananButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pesananButton2.setForeground(new java.awt.Color(204, 204, 204));
        pesananButton2.setText("Daftar Users");
        pesananButton2.setBorderPainted(false);
        pesananButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesananButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pesananButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pesananButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(pesananButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(pesananButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(630, Short.MAX_VALUE))
        );

        getContentPane().add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 1080));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pesanan ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 16, 980, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrouund_hero.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, -1, 920));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Barang().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       int selectedRow = tbl_pesanan.getSelectedRow();
if (selectedRow != -1) {
    int id_pesanan = (int) tbl_pesanan.getValueAt(selectedRow, 0); 
    int id = (int) tbl_pesanan.getValueAt(selectedRow, 1); 

    try {
        // Mulai transaksi
        conn.setAutoCommit(false);
        
        int id_barang = (int) tbl_pesanan.getValueAt(selectedRow, 1);
        String nama_pesanan = (String) tbl_pesanan.getValueAt(selectedRow, 2);
        String nama_user = (String) tbl_pesanan.getValueAt(selectedRow, 3);
        
        //Move to History Pesanan
        String HistoryPesananQuery = "INSERT INTO history_pesanan (id_history_pesanan, id_barang, pesanan ,nama_user) VALUES (?,?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(HistoryPesananQuery)) {
        ps.setInt(1, id_pesanan); // ID barang
        ps.setInt(2, id_barang); // ID barang
        ps.setString(3, nama_pesanan); // Nama pesanan
        ps.setString(4, nama_user); // Nama user

        // Eksekusi query
        ps.executeUpdate();
        }
        
        // Hapus dari tabel pesanan
        String deletePesananQuery = "DELETE FROM pesanan WHERE id_pesanan = ?";
        try (PreparedStatement psPesanan = conn.prepareStatement(deletePesananQuery)) {
            psPesanan.setInt(1, id_pesanan);
            psPesanan.executeUpdate();
        }

        // Kurangi jumlah_barang di tabel barang
        String updateBarangQuery = "UPDATE barang SET jumlah_barang = jumlah_barang - 1 WHERE id = ? AND jumlah_barang > 0";
        String deleteBarangQuery = "DELETE FROM barang WHERE id = ? AND jumlah_barang = 0";

        try (PreparedStatement psUpdate = conn.prepareStatement(updateBarangQuery);
        PreparedStatement psDelete = conn.prepareStatement(deleteBarangQuery)) {

        // Kurangi jumlah_barang
        psUpdate.setInt(1, id);
        int rowsUpdated = psUpdate.executeUpdate();

        if (rowsUpdated > 0) {
        System.out.println("Jumlah barang berhasil dikurangi.");

        // Hapus barang jika jumlah_barang menjadi 0
        psDelete.setInt(1, id);
        int rowsDeleted = psDelete.executeUpdate();

        if (rowsDeleted > 0) {
            System.out.println("Barang telah dihapus karena stok habis.");
        }
        } else {
        System.out.println("Barang tidak tersedia atau stok habis.");
        }
        } catch (SQLException e) {
        e.printStackTrace();
        }



        // Commit transaksi
        conn.commit();
        JOptionPane.showMessageDialog(this, "Pesanan Selesai");
        getData(); // Refresh data
    } catch (SQLException e) {

        JOptionPane.showMessageDialog(this, "Gagal menghapus data!", "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        JOptionPane.showMessageDialog(this, "Pesanan Selesai");
    }
} else {
    JOptionPane.showMessageDialog(this, "Silakan pilih data yang akan dihapus.", "Peringatan", JOptionPane.WARNING_MESSAGE);
}

    }//GEN-LAST:event_jButton2ActionPerformed

    private void pesananButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesananButtonActionPerformed
        new Pesanan().setVisible(true);
        dispose();
    }//GEN-LAST:event_pesananButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new HistoryPesanan().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void pesananButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesananButton2ActionPerformed
        new Users().setVisible(true);
        dispose();
    }//GEN-LAST:event_pesananButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pesananButton;
    private javax.swing.JButton pesananButton2;
    private javax.swing.JPanel sidebar;
    private javax.swing.JTable tbl_pesanan;
    // End of variables declaration//GEN-END:variables
}


import java.sql.Statement;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Koneksi.conek1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class MenuSupervisor extends javax.swing.JPanel {
private String username;
private String userId;
private String userIdinvestor;
HashMap<String, String> tableDataMap = new HashMap<>();



 
    /**
     * Creates new form MenuPelaksana
     */
   

    /**
     * Creates new form MenuPelaksana
     */
    

    /**
     * Creates new form MenuPelaksana
     */
    /**
     * Creates new form MenuPelaksana
     */
   
    /**
     * Creates new form MenuPelaksana
     */
    /**
     * Creates new form MenuPelaksana
     */
    /**
     * Creates new form MenuPelaksana
     */
    /**
     * Creates new form MenuPelaksana
     */
    public MenuSupervisor(String username,  String userId, String userIdinvestor) {
        initComponents();
        this.username = username;
        this.userId = userId;
         this.userIdinvestor = userIdinvestor;
       
        datatable();
        b_tolak.setVisible(false);
        b_setuju.setVisible(false);
       
        
       
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainpane = new javax.swing.JPanel();
        Data_proyek = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        b_cari = new rojerusan.RSMaterialButtonRectangle();
        txtcari = new javax.swing.JTextField();
        b_setuju = new rojerusan.RSMaterialButtonRectangle();
        b_tolak = new rojerusan.RSMaterialButtonRectangle();
        b_step = new rojerusan.RSMaterialButtonRectangle();
        detail_step = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table3 = new javax.swing.JTable();
        b_keluar = new rojerusan.RSMaterialButtonRectangle();

        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(42, 37, 98)));
        setLayout(new java.awt.CardLayout());

        mainpane.setBackground(new java.awt.Color(255, 255, 255));
        mainpane.setLayout(new java.awt.CardLayout());

        Data_proyek.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setText("DATA PROYEK");

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table1.setGridColor(new java.awt.Color(0, 0, 255));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        b_cari.setBackground(new java.awt.Color(42, 37, 98));
        b_cari.setText("CARI");
        b_cari.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        b_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cariActionPerformed(evt);
            }
        });

        txtcari.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(42, 37, 98)));
        txtcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcariActionPerformed(evt);
            }
        });

        b_setuju.setBackground(new java.awt.Color(42, 37, 98));
        b_setuju.setText("SETUJU");
        b_setuju.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        b_setuju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_setujuActionPerformed(evt);
            }
        });

        b_tolak.setBackground(new java.awt.Color(42, 37, 98));
        b_tolak.setText("TOLAK");
        b_tolak.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        b_tolak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_tolakActionPerformed(evt);
            }
        });

        b_step.setBackground(new java.awt.Color(42, 37, 98));
        b_step.setText("detail step");
        b_step.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_stepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Data_proyekLayout = new javax.swing.GroupLayout(Data_proyek);
        Data_proyek.setLayout(Data_proyekLayout);
        Data_proyekLayout.setHorizontalGroup(
            Data_proyekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Data_proyekLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Data_proyekLayout.createSequentialGroup()
                .addComponent(b_step, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_tolak, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_setuju, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Data_proyekLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        Data_proyekLayout.setVerticalGroup(
            Data_proyekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Data_proyekLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Data_proyekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_setuju, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_tolak, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_step, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        mainpane.add(Data_proyek, "card2");

        detail_step.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel4.setText("DETAIL STEP PROYEK");

        table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table3MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(table3);

        b_keluar.setBackground(new java.awt.Color(42, 37, 98));
        b_keluar.setText("KEMBALI");
        b_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_keluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout detail_stepLayout = new javax.swing.GroupLayout(detail_step);
        detail_step.setLayout(detail_stepLayout);
        detail_stepLayout.setHorizontalGroup(
            detail_stepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detail_stepLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detail_stepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detail_stepLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(detail_stepLayout.createSequentialGroup()
                        .addGroup(detail_stepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(b_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 477, Short.MAX_VALUE))))
        );
        detail_stepLayout.setVerticalGroup(
            detail_stepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detail_stepLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainpane.add(detail_step, "card2");

        add(mainpane, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void b_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cariActionPerformed
 try {
        Statement statement =  conek1.GetConnection().createStatement();
        ResultSet res=statement.executeQuery("select * from transaksi left join status_investor on  transaksi.ID_investor = status_investor.id_investor where transaksi.nama_proyek like '%" + txtcari.getText() + "%'; ");
        
        DefaultTableModel tbl = new DefaultTableModel();
               tbl.addColumn("ID TRANSAKSI");

        tbl.addColumn("ID PROYEK");
        tbl.addColumn("NAMA PERUSAHAAN");
    tbl.addColumn("NAMA PROYEK");
    tbl.addColumn("LOKASI PROYEK");
    tbl.addColumn("ESTIMASI");
    tbl.addColumn("STATUS");
    
        
                table1.setModel(tbl);
                
                while(res.next())
            {
                tbl.addRow(new Object[] {
                                      res.getString("Id_transaksi"),

                  res.getString("ID_proyek"),
                               res.getString("nama_perusahaan"),

                res.getString("nama_proyek"),
                res.getString("lokasi_proyek"),
                res.getString("estimasi_proyek"),
                     res.getString("status_supervisor")
                   
                });
                 table1.setModel(tbl);
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this,"salah");
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_b_cariActionPerformed

    private void b_setujuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_setujuActionPerformed
       DefaultTableModel model = (DefaultTableModel) table1.getModel();
    int row = table1.getSelectedRow();
    
    // Validasi jika baris yang dipilih valid
    if (row >= 0) {
        // Kolom pertama dan kedua
        
        String id_proyek = String.valueOf(table1.getValueAt(row, 1)); // ID Proyek
                        String id_transaksi = String.valueOf(table1.getValueAt(row, 0)); // ID Proyek

        try {
        
        // Simpan ke database
        Statement statement = conek1.GetConnection().createStatement();
      String sql = "INSERT INTO `status_investor`( `status_supervisor`, `status_analis`, `id_proyek`, `id_investor`,`id_transaksi`) VALUES "
              + "('Disetujui','','"+id_proyek+"','"+userIdinvestor+"','"+id_transaksi+"')";

        statement.executeUpdate(sql);
        statement.close();

        // Notifikasi sukses
       
        JOptionPane.showMessageDialog(null, "Proyek berhasil disetujui");

 
        // Reset ke pilihan default
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Data gagal disimpan: " + e.getMessage());
    }
    }
    datatable();
// TODO add your handling code here:
    }//GEN-LAST:event_b_setujuActionPerformed

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcariActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked

        b_tolak.setVisible(true);
            b_setuju.setVisible(true);
                      

// TODO add your handling code here:
    }//GEN-LAST:event_table1MouseClicked

    private void b_tolakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_tolakActionPerformed
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
    int row = table1.getSelectedRow();
    
    // Validasi jika baris yang dipilih valid
    if (row >= 0) {
        // Kolom pertama dan kedua
        
        String id_proyek = String.valueOf(table1.getValueAt(row, 1));
                String id_transaksi = String.valueOf(table1.getValueAt(row, 0)); // ID Proyek
// ID Proyek
       
        try {
        
        // Simpan ke database
        Statement statement = conek1.GetConnection().createStatement();
      String sql = "INSERT INTO `status_investor`( `status_supervisor`, `status_analis`, `id_proyek`, `id_investor`, `id_transaksi`) VALUES "
              + "('DiTolak','','"+id_proyek+"','"+userIdinvestor+"','" + id_transaksi+"')";

        statement.executeUpdate(sql);
        statement.close();

        // Notifikasi sukses
       
        JOptionPane.showMessageDialog(null, "Proyek telah Ditolak");

 
        // Reset ke pilihan default
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Data gagal disimpan: " + e.getMessage());
    }
    }
    datatable();
        // TODO add your handling code here:
    }//GEN-LAST:event_b_tolakActionPerformed

    private void b_stepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_stepActionPerformed
        mainpane.removeAll();
        mainpane.repaint();
        mainpane.revalidate();

        mainpane.add(detail_step);
        mainpane.repaint();
        mainpane.revalidate();
        
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
    int row = table1.getSelectedRow();
    
    // Validasi jika baris yang dipilih valid
    if (row >= 0) {
        // Kolom pertama dan kedua
        
        String id_proyek = String.valueOf(table1.getValueAt(row, 1));
                String nama_perusahaan = String.valueOf(table1.getValueAt(row, 2)); // ID Proyek
// ID Proyek
        tableDataMap.put(nama_perusahaan, id_proyek);
    }
        

        datatable3();
        // TODO add your handling code here:
    }//GEN-LAST:event_b_stepActionPerformed

    private void table3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table3MouseClicked
        
        b_keluar.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_table3MouseClicked

    private void b_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_keluarActionPerformed
        mainpane.removeAll();
        mainpane.repaint();
        mainpane.revalidate();

        mainpane.add(Data_proyek);
        mainpane.repaint();
        mainpane.revalidate();
        // TODO add your handling code here:
    }//GEN-LAST:event_b_keluarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Data_proyek;
    private rojerusan.RSMaterialButtonRectangle b_cari;
    private rojerusan.RSMaterialButtonRectangle b_keluar;
    private rojerusan.RSMaterialButtonRectangle b_setuju;
    private rojerusan.RSMaterialButtonRectangle b_step;
    private rojerusan.RSMaterialButtonRectangle b_tolak;
    private javax.swing.JPanel detail_step;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel mainpane;
    private javax.swing.JTable table1;
    private javax.swing.JTable table3;
    private javax.swing.JTextField txtcari;
    // End of variables declaration//GEN-END:variables

    private void datatable() {
        DefaultTableModel tbl = new DefaultTableModel();
         tbl.addColumn("ID TRANSAKSI");

        tbl.addColumn("ID PROYEK");
        tbl.addColumn("NAMA PERUSAHAAN");
    tbl.addColumn("NAMA PROYEK");
    tbl.addColumn("LOKASI PROYEK");
    tbl.addColumn("ESTIMASI");
    tbl.addColumn("STATUS");
   
   
    table1.setModel(tbl);
    
    try {
        Statement statement =conek1.GetConnection().createStatement();
        ResultSet res = statement.executeQuery("select * from transaksi left join status_investor on  transaksi.id_transaksi = status_investor.id_transaksi where transaksi.id_investor = '" + userIdinvestor + "'; ");
        
        while (res.next()) {
            tbl.addRow(new Object[]{
                res.getString("id_transaksi"),
               res.getString("ID_proyek"),
                               res.getString("nama_perusahaan"),

                res.getString("nama_proyek"),
                res.getString("lokasi_proyek"),
                res.getString("estimasi_proyek"),
                     res.getString("status_supervisor")
                 
                
                 
                    
               
            });
        }
    } catch (Exception e) {
        e.printStackTrace(); 
          JOptionPane.showMessageDialog(this, "Gagal memuat data: " + e.getMessage());  
       
    }
    }

   private void datatable3() {
        if (!tableDataMap.isEmpty()) {
        // Mengambil satu ID proyek dari HashMap
        String idProyek = tableDataMap.values().iterator().next();
        

        // Menyiapkan table model
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID PROYEK");
        tbl.addColumn("ID STEP");
        tbl.addColumn("STEP");
        tbl.addColumn("TARGET");
                tbl.addColumn("DANA");

         tbl.addColumn("STATUS");

        // Set table model untuk table2
        table3.setModel(tbl);

        try {
            // Membuat statement dari koneksi
            Statement statement = conek1.GetConnection().createStatement();

            // Menjalankan query untuk mengambil data berdasarkan ID proyek
            String sql = "SELECT * FROM step_proyek WHERE id_proyek = '" + idProyek + "'";
            ResultSet res = statement.executeQuery(sql);

            // Menambahkan data ke dalam table model
            while (res.next()) {
                tbl.addRow(new Object[]{
                     res.getString("id_proyek"),
                    res.getString("id_step"),
                    
                    res.getString("step"),
                    res.getString("target"),
                     res.getString("Dana_perstep"),
                     res.getString("status")
                   
                });
            }

            // Menutup result set dan statement
            res.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal memuat data: " + e.getMessage());
        }  
        }
   }

   
}

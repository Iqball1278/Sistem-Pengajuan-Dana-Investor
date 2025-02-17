
import Koneksi.conek1;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class ProfileManajer extends javax.swing.JPanel {
private String userId;
private String username;

    /**
     * Creates new form ProfilePelaksana
     */
    public ProfileManajer(String username, String userId) throws SQLException {
        initComponents();
              this.userId = userId;
              this.username = username;
              loadUserProfile(userId);
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
        Profile = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txttlp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtalamat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        b_edit = new rojerusan.RSMaterialButtonRectangle();
        jLabel7 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();

        setLayout(new java.awt.CardLayout());

        mainpane.setBackground(new java.awt.Color(45, 59, 150));
        mainpane.setLayout(new java.awt.CardLayout());

        Profile.setBackground(new java.awt.Color(31, 43, 56));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Male User_4.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(147, 153, 159));
        jLabel2.setText("ID");

        txttlp.setBackground(new java.awt.Color(75, 85, 95));
        txttlp.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txttlp.setForeground(new java.awt.Color(242, 242, 242));
        txttlp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 85, 95)));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(147, 153, 159));
        jLabel3.setText("Email");

        txtid.setBackground(new java.awt.Color(75, 85, 95));
        txtid.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtid.setForeground(new java.awt.Color(242, 242, 242));
        txtid.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtid.setAlignmentX(2.0F);
        txtid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 85, 95)));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(201, 204, 207));
        jLabel4.setText("Personal Data");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(147, 153, 159));
        jLabel5.setText("Nama");

        txtalamat.setBackground(new java.awt.Color(75, 85, 95));
        txtalamat.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtalamat.setForeground(new java.awt.Color(242, 242, 242));
        txtalamat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 85, 95)));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(147, 153, 159));
        jLabel6.setText("No Telepon");

        txtemail.setBackground(new java.awt.Color(75, 85, 95));
        txtemail.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtemail.setForeground(new java.awt.Color(242, 242, 242));
        txtemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 85, 95)));

        b_edit.setBackground(new java.awt.Color(75, 85, 95));
        b_edit.setText("Edit");
        b_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_editActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(147, 153, 159));
        jLabel7.setText("Alamat");

        txtnama.setBackground(new java.awt.Color(75, 85, 95));
        txtnama.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtnama.setForeground(new java.awt.Color(242, 242, 242));
        txtnama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 85, 95)));

        javax.swing.GroupLayout ProfileLayout = new javax.swing.GroupLayout(Profile);
        Profile.setLayout(ProfileLayout);
        ProfileLayout.setHorizontalGroup(
            ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfileLayout.createSequentialGroup()
                .addGroup(ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProfileLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2))
                    .addGroup(ProfileLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ProfileLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4))
                            .addComponent(b_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(176, Short.MAX_VALUE))
            .addGroup(ProfileLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProfileLayout.createSequentialGroup()
                        .addGroup(ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProfileLayout.createSequentialGroup()
                        .addGroup(ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txttlp, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtalamat, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnama, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtemail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtid, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(21, 21, 21))))
        );
        ProfileLayout.setVerticalGroup(
            ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfileLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(ProfileLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)))
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttlp, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainpane.add(Profile, "card2");

        add(mainpane, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void b_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_editActionPerformed
                String Id = txtid.getText();

        String nama = txtnama.getText();
         String alamat = txtalamat.getText();
                String email = txtemail.getText();
                        String nomer = txttlp.getText();


        
        try {
        // Query SQL untuk update data
        Statement statement = conek1.GetConnection().createStatement();
    String query = "UPDATE manajer SET nama = '" + nama + "', alamat = '" +alamat + "', email = '" + email + "', No_telp = '" + nomer + "' WHERE id_admin = '" + txtid.getText() + "';";
    statement.executeUpdate(query);
    JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(this, "Error updating data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}
        // TODO add your handling code here:
    }//GEN-LAST:event_b_editActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Profile;
    private rojerusan.RSMaterialButtonRectangle b_edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel mainpane;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txttlp;
    // End of variables declaration//GEN-END:variables

    private void loadUserProfile(String userId) throws SQLException {
      try {
          Statement statement =conek1.GetConnection().createStatement();
      
        ResultSet rs = statement.executeQuery("select * from manajer wHERE username = '" + username +"';");
        
        if (rs.next()) {
                String id = rs.getString("id_manajer");
                String fullName = rs.getString("Nama");
                 String alamat = rs.getString("Alamat");
                String email = rs.getString("email");
                String nomer = rs.getString("no_Telepon");
               

                // Tampilkan data di GUI (misalnya dengan JLabel atau JTextField)
                // Contoh: Menampilkan data ke dalam JTextField
                txtid.setText(id);
                txtnama.setText(" "+ fullName);
                txtemail.setText(" "+email);
                txtalamat.setText(" "+alamat);
                txttlp.setText(" "+nomer);
                
               
               
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

  
}

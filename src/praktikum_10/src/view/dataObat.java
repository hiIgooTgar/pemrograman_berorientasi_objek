package view;

import config.koneksi;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class dataObat extends javax.swing.JFrame {

    private DefaultTableModel model;

    private static final java.util.logging.Logger Logger = java.util.logging.Logger.getLogger(dataObat.class.getName());

    public dataObat() {
        initComponents();
        setLocationRelativeTo(null);

        model = new DefaultTableModel();
        tableDataObat.setModel(model);
        model.addColumn("ID");
        model.addColumn("Kode Obat");
        model.addColumn("Nama Obat");
        model.addColumn("Kategori");
        model.addColumn("Satuan");
        model.addColumn("Harga Beli");
        model.addColumn("Harga Jual");
        model.addColumn("Stok");
    }

    private void loadData() {
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        try {
            Connection conn = koneksi.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM obat ORDER BY id_obat ASC");
            int a = 1;

            while (rs.next()) {
                Object[] data = {
                    a++,
                    rs.getString("kode_obat"),
                    rs.getString("nama_obat"),
                    rs.getString("kategori"),
                    rs.getString("satuan"),
                    rs.getString("harga_beli"),
                    rs.getString("harga_jual"),
                    rs.getString("stok"),};
                model.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error load data : " + e.getMessage());
        }
    }

    private void searchData(String keyword) {
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        try {
            Connection conn = koneksi.getConnection();
            String sql = "SELECT * FROM obat WHERE kode_obat LIKE ? OR nama_obat LIKE ? ORDER BY id_obat ASC";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, "%" + keyword + "%");
            pst.setString(2, "%" + keyword + "%");

            ResultSet rs = pst.executeQuery();
            int a = 1;
            while (rs.next()) {
                Object[] data = {
                    a++,
                    rs.getString("kode_obat"),
                    rs.getString("nama_obat"),
                    rs.getString("kategori"),
                    rs.getString("satuan"),
                    rs.getString("harga_beli"),
                    rs.getString("harga_jual"),
                    rs.getString("stok"),};
                model.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error search : " + e.getMessage());
        }
    }

    private void clearData() {
        inputKode.setText("");
        inputNama.setText("");
        selectKategori.setSelectedIndex(0);
        selectSatuan.setSelectedIndex(0);
        inputHargaJual.setText("");
        inputHargaBeli.setText("");
        inputStok.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputKode = new javax.swing.JTextField();
        inputNama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        selectKategori = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        selectSatuan = new javax.swing.JComboBox<>();
        inputHargaBeli = new javax.swing.JTextField();
        inputHargaJual = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        inputStok = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDataObat = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        inputSearching = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("Data Obat - Apotek Alam Sutra");

        jLabel3.setText("Kode Obat");

        jLabel4.setText("Nama Obat");

        jLabel5.setText("Kategori Obat");

        selectKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih kategori obat", "Antibiotik", "Antiseptik", "Antihistamin (Alergi)", "Vitamin & Suplemen", "Obat Batuk & Flu", "Antijamur", "Antivirus", "Obat Resep Dokter" }));

        jLabel6.setText("Satuan");

        selectSatuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih satuan obat", "Tablet", "Kapsul", "Sirup", "Salep", "Krim", "Infus", "Kaplet", "Pil", "Serbuk", "Larutan" }));

        jLabel7.setText("Harga Beli");

        jLabel8.setText("Harga Jual");

        jLabel9.setText("Stok");

        btnAdd.setBackground(new java.awt.Color(51, 153, 255));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Simpan");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(51, 153, 255));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Ubah");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(51, 153, 255));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Hapus");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(51, 153, 255));
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        tableDataObat.setModel(new javax.swing.table.DefaultTableModel(
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
        tableDataObat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDataObatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDataObat);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel10.setText("Pencarian");

        inputSearching.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputSearchingKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(inputKode, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(selectKategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addComponent(selectSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(inputHargaBeli)
                            .addComponent(jLabel8)
                            .addComponent(inputHargaJual, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputStok, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(522, 522, 522)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputSearching, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(12, 12, 12)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(inputHargaBeli, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(inputKode)
                            .addComponent(selectKategori))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel6))))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputHargaJual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(inputNama, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(selectSatuan)))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputStok, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(inputSearching, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah data akan disimpan?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.NO_OPTION) {
            return;
        }

        try {
            Connection conn = koneksi.getConnection();
            String sql = "INSERT INTO obat(kode_obat, nama_obat, kategori, satuan, harga_beli, harga_jual, stok) VALUES(?,?,?,?,?,?,?)";

            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, inputKode.getText());
            pst.setString(2, inputNama.getText());
            pst.setString(3, selectKategori.getSelectedItem().toString());
            pst.setString(4, selectSatuan.getSelectedItem().toString());
            pst.setDouble(5, Double.parseDouble(inputHargaBeli.getText()));
            pst.setDouble(6, Double.parseDouble(inputHargaJual.getText()));
            pst.setInt(7, Integer.parseInt(inputStok.getText()));

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan");
            loadData();
            clearData();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, "Error tambah : " + e.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int selected = tableDataObat.getSelectedRow();
        if (selected == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data yang akan diubah!");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Apakah data akan diubah?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.NO_OPTION) {
            return;
        }

        try {
            Connection conn = koneksi.getConnection();
            String sql = "UPDATE obat SET kode_obat=?, nama_obat=?, kategori=?, satuan=?, harga_beli=?, harga_jual=?, stok=? WHERE id_obat=?";

            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, inputKode.getText());
            pst.setString(2, inputNama.getText());
            pst.setString(3, selectKategori.getSelectedItem().toString());
            pst.setString(4, selectSatuan.getSelectedItem().toString());
            pst.setDouble(5, Double.parseDouble(inputHargaBeli.getText()));
            pst.setDouble(6, Double.parseDouble(inputHargaJual.getText()));
            pst.setInt(7, Integer.parseInt(inputStok.getText()));

            int id = Integer.parseInt(model.getValueAt(selected, 0).toString());
            pst.setInt(8, id);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Data berhasil diubah");
            loadData();
            clearData();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, "Error diubah : " + e.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selected = tableDataObat.getSelectedRow();
        if (selected == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data yang akan dihapus!");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Apakah data akan dihapus?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.NO_OPTION) {
            return;
        }

        try {
            Connection conn = koneksi.getConnection();
            int id = Integer.parseInt(model.getValueAt(selected, 0).toString());

            PreparedStatement pst = conn.prepareStatement("DELETE FROM obat WHERE id_obat=?");
            pst.setInt(1, id);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
            loadData();
            clearData();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, "Error hapus : " + e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearData();
    }//GEN-LAST:event_btnClearActionPerformed

    private void tableDataObatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDataObatMouseClicked
        int selected = tableDataObat.getSelectedRow();
        if (selected != -1) {
            inputKode.setText(model.getValueAt(selected, 1).toString());
            inputNama.setText(model.getValueAt(selected, 2).toString());
            selectKategori.setSelectedItem(model.getValueAt(selected, 3).toString());
            selectSatuan.setSelectedItem(model.getValueAt(selected, 4).toString());
            inputHargaJual.setText(model.getValueAt(selected, 5).toString());
            inputHargaBeli.setText(model.getValueAt(selected, 6).toString());
            inputStok.setText(model.getValueAt(selected, 7).toString());
        }
    }//GEN-LAST:event_tableDataObatMouseClicked

    private void inputSearchingKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputSearchingKeyReleased
        searchData(inputSearching.getText());
    }//GEN-LAST:event_inputSearchingKeyReleased

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataObat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField inputHargaBeli;
    private javax.swing.JTextField inputHargaJual;
    private javax.swing.JTextField inputKode;
    private javax.swing.JTextField inputNama;
    private javax.swing.JTextField inputSearching;
    private javax.swing.JTextField inputStok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> selectKategori;
    private javax.swing.JComboBox<String> selectSatuan;
    private javax.swing.JTable tableDataObat;
    // End of variables declaration//GEN-END:variables
}

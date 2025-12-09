package view;

import dao.mahasiswaDao;
import model.mahasiswa;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class formMahasiswa extends javax.swing.JFrame {

    public formMahasiswa() {
        initComponents();
        load_table();
    }

    private void load_table() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIM");
        model.addColumn("Nama");
        model.addColumn("Prodi");
        model.addColumn("No Telp");
        model.addColumn("Alamat");

        String sql = "SELECT * FROM mahasiswa ORDER BY nim ASC";

        try (Connection conn = config.koneksi.getConnection();
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("nim"),
                    rs.getString("nama"),
                    rs.getString("prodi"),
                    rs.getString("no_telp"),
                    rs.getString("alamat")
                });
            }
            if (model.getRowCount() == 0) {
                model.addRow(new Object[]{"", "", "Data mahasiswa tidak ditemukan", "", ""});
            }
            tabelMahasiswa.setModel(model);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Gagal memuat data mahasiswa: " + e.getMessage(),
                    "Error Database",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    private void clearForm() {
        inputNim.setText("");
        inputNama.setText("");
        comboProdi.setSelectedIndex(0);
        inputTelp.setText("");
        inputAlamat.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputNim = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboProdi = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        inputTelp = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputAlamat = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelMahasiswa = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Data Mahasiswa - Universitas Amikom Purwokerto");

        jLabel2.setText("NIM");

        jLabel3.setText("Nama");

        jLabel4.setText("Program Studi");

        comboProdi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Prodi", "Informatika", "Sistem Informasi", "Teknologi Informasi", "Ilmu Komunikasi", "Bisnis Digital", "Manajemen", "Hukum" }));

        jLabel5.setText("No Telepon");

        btnAdd.setText("Simpan");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        inputAlamat.setColumns(20);
        inputAlamat.setRows(5);
        jScrollPane1.setViewportView(inputAlamat);

        jLabel6.setText("Alamat");

        tabelMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Prodi", "No Telp", "Alamat"
            }
        ));
        tabelMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelMahasiswa);

        btnUpdate.setText("Ubah");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Hapus");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputTelp, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboProdi, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputNama, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputNim, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))))
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(jLabel1)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(104, 104, 104))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputNim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(14, 14, 14)
                        .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboProdi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String nim = inputNim.getText();
        String nama = inputNama.getText();
        String prodi = comboProdi.getSelectedItem().toString();
        String no_telp = inputTelp.getText();
        String alamat = inputAlamat.getText();

        if (nim.isEmpty() || nama.isEmpty() || no_telp.isEmpty() || alamat.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        mahasiswa m = new mahasiswa(nim, nama, prodi, no_telp, alamat);
        mahasiswaDao dao = new mahasiswaDao();

        boolean berhasil = dao.simpan(m);
        if (berhasil) {
            JOptionPane.showMessageDialog(this, "Data mahasiswa berhasil ditambahkan.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            load_table();
            clearForm();
        } else {
            JOptionPane.showMessageDialog(this, "Gagal menyimpan data mahasiswa.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        inputNim.setText("");
        inputNama.setText("");
        comboProdi.setSelectedIndex(0);
        inputTelp.setText("");
        inputAlamat.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String nim = inputNim.getText().trim();
        String nama = inputNama.getText().trim();
        String prodi = comboProdi.getSelectedItem().toString();
        String noTelp = inputTelp.getText().trim();
        String alamat = inputAlamat.getText().trim();

        int baris = tabelMahasiswa.getSelectedRow();
        if (baris == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris mahasiswa yang ingin diubah.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String nimLama = tabelMahasiswa.getModel().getValueAt(baris, 0).toString();

        if (nim.isEmpty() || nama.isEmpty() || noTelp.isEmpty() || alamat.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        mahasiswa m = new mahasiswa(nim, nama, prodi, noTelp, alamat);

        mahasiswaDao dao = new mahasiswaDao();
        boolean berhasil = dao.update(m, nimLama);

        if (berhasil) {
            JOptionPane.showMessageDialog(this, "Data mahasiswa berhasil diubah.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            load_table();
            clearForm();
        } else {
            JOptionPane.showMessageDialog(this, "Gagal mengubah data mahasiswa.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tabelMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMahasiswaMouseClicked
        int baris = tabelMahasiswa.getSelectedRow();
        if (baris == -1) {
            return;
        }

        String nim = tabelMahasiswa.getValueAt(baris, 0).toString();
        String nama = tabelMahasiswa.getValueAt(baris, 1).toString();
        String prodi = tabelMahasiswa.getValueAt(baris, 2).toString();
        String noTelp = tabelMahasiswa.getValueAt(baris, 3).toString();
        String alamat = tabelMahasiswa.getValueAt(baris, 4).toString();

        inputNim.setText(nim);
        inputNama.setText(nama);
        comboProdi.setSelectedItem(prodi);
        inputTelp.setText(noTelp);
        inputAlamat.setText(alamat);
    }//GEN-LAST:event_tabelMahasiswaMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String nim = inputNim.getText();
        if (nim.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Pilih data yang akan dihapus dari tabel!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this,
                "Yakin ingin menghapus data mahasiswa dengan NIM: " + nim + "?",
                "Konfirmasi Hapus",
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            mahasiswaDao dao = new mahasiswaDao();
            dao.delete(nim);
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            load_table();
            clearForm();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox comboProdi;
    private javax.swing.JTextArea inputAlamat;
    private javax.swing.JTextField inputNama;
    private javax.swing.JTextField inputNim;
    private javax.swing.JTextField inputTelp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelMahasiswa;
    // End of variables declaration//GEN-END:variables
}

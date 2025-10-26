package praktikum_5;

import javax.swing.JOptionPane;

public class formRental extends javax.swing.JFrame {

    private static final java.util.logging.Logger Logger
            = java.util.logging.Logger.getLogger(formRental.class.getName());

    public formRental() {
        initComponents();
        setLocationRelativeTo(null);
        txtKapasitas.setVisible(false);
        chkSopir.setVisible(false);
        txtTipe.setVisible(false);
        labelMobil.setVisible(false);
        labelMotor.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPlat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtLama = new javax.swing.JTextField();
        txtMerk = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDiskon = new javax.swing.JTextField();
        cbJenis = new javax.swing.JComboBox<>();
        labelMobil = new javax.swing.JLabel();
        txtKapasitas = new javax.swing.JTextField();
        labelMotor = new javax.swing.JLabel();
        txtTipe = new javax.swing.JTextField();
        chkSopir = new javax.swing.JCheckBox();
        btnHitung = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Form Rental Kendaraan");

        jLabel2.setText("Nama Penyewa");

        jLabel3.setText("Jenis Kendaraan");

        jLabel4.setText("Plat Nomor");

        jLabel5.setText("Lama Sewa (Hari)");

        jLabel6.setText("Merk Kendaraan");

        jLabel7.setText("Harga Sewa/Hari");

        jLabel8.setText("Diskon");

        cbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jenis Kendaraan", "Mobil", "Motor" }));
        cbJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJenisActionPerformed(evt);
            }
        });

        labelMobil.setText("Jika Mobil : Kapasitas");

        labelMotor.setText("Jika Motor : Tipe");

        chkSopir.setText("Sopir");

        btnHitung.setText("Hitung Biaya");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        btnInfo.setText("Tampil Info");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        jScrollPane2.setViewportView(txtOutput);

        jScrollPane1.setViewportView(jScrollPane2);

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNama, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(txtPlat)
                                        .addComponent(txtLama)
                                        .addComponent(cbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)
                                        .addComponent(labelMobil)
                                        .addComponent(txtKapasitas, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(41, 41, 41)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMerk, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8)
                                        .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelMotor)
                                        .addComponent(txtTipe, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(chkSopir, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(395, 395, 395)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbJenis))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMerk, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLama, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelMotor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTipe, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelMobil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKapasitas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkSopir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHitung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJenisActionPerformed
        String jenis = cbJenis.getSelectedItem().toString();
        if (jenis.equals("Mobil")) {
            txtKapasitas.setVisible(true);
            chkSopir.setVisible(true);
            labelMobil.setVisible(true);
            txtTipe.setVisible(false);
            labelMotor.setVisible(false);
        } else if (jenis.equals("Motor")) {
            txtKapasitas.setVisible(false);
            chkSopir.setVisible(false);
            labelMobil.setVisible(false);
            txtTipe.setVisible(true);
            labelMotor.setVisible(true);
        } else {
            txtKapasitas.setVisible(false);
            chkSopir.setVisible(false);
            txtTipe.setVisible(false);
            labelMobil.setVisible(false);
            labelMotor.setVisible(false);
        }
    }//GEN-LAST:event_cbJenisActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        String namaInput = txtNama.getText().trim();
        String jenisInput = cbJenis.getSelectedItem().toString();
        String merkInput = txtMerk.getText().trim();
        String platInput = txtPlat.getText().trim();
        String hargaInput = txtHarga.getText().trim();
        String lamaInput = txtLama.getText().trim();
        String diskonInput = txtDiskon.getText().trim();
        String kapasitasInput = txtKapasitas.getText().trim();
        String tipeInput = txtTipe.getText().trim();

        if (namaInput.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (jenisInput.isEmpty() || jenisInput.equals("Pilih Jenis Kendaraan")) {
            JOptionPane.showMessageDialog(this, "Jenis kendaraan harus dipilih!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (merkInput.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Merk kendaraan harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (platInput.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Plat kendaraan harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (hargaInput.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Harga sewa/hari harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (lamaInput.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lama sewa harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (jenisInput.equalsIgnoreCase("Mobil")) {
            if (kapasitasInput.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Kapasitas mobil harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
            }

        } else if (jenisInput.equalsIgnoreCase("Motor")) {
            if (tipeInput.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tipe motor harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }

        String nama = txtNama.getText();
        String merk = txtMerk.getText();
        String plat = txtPlat.getText();
        double harga = Double.parseDouble(txtHarga.getText());
        int lama = Integer.parseInt(txtLama.getText());
        double diskon = txtDiskon.getText().isEmpty() ? 0 : Double.parseDouble(txtDiskon.getText());
        String jenis = cbJenis.getSelectedItem().toString();

        double total;
        if (jenis.equals("Mobil")) {
            int kapasitas = Integer.parseInt(txtKapasitas.getText());
            boolean sopir = chkSopir.isSelected();
            Mobil car = new Mobil(merk, plat, harga, kapasitas, sopir);
            total = (diskon > 0) ? car.hitungBiaya(lama, diskon) : car.hitungBiaya(lama);
            txtOutput.setText("Nama Penyewa : " + nama + "\n" + car.tampilInfo() + "\nTotal Biaya : Rp " + total);
        } else {
            String tipe = txtTipe.getText();
            Motor motor = new Motor(merk, plat, harga, tipe);
            total = (diskon > 0) ? motor.hitungBiaya(lama, diskon) : motor.hitungBiaya(lama);
            txtOutput.setText("Nama Penyewa : " + nama + "\n" + motor.tampilInfo() + "\nTotal Biaya : Rp " + total);
        }
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        txtOutput.setText("Silahkan isi data rental, lalu klik Hitung Biaya");
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtNama.setText("");
        cbJenis.setSelectedIndex(0);
        txtMerk.setText("");
        txtPlat.setText("");
        txtHarga.setText("");
        txtLama.setText("");
        txtDiskon.setText("");
        txtKapasitas.setText("");
        txtTipe.setText("");
        txtOutput.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formRental().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cbJenis;
    private javax.swing.JCheckBox chkSopir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelMobil;
    private javax.swing.JLabel labelMotor;
    private javax.swing.JTextField txtDiskon;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtKapasitas;
    private javax.swing.JTextField txtLama;
    private javax.swing.JTextField txtMerk;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextArea txtOutput;
    private javax.swing.JTextField txtPlat;
    private javax.swing.JTextField txtTipe;
    // End of variables declaration//GEN-END:variables
}

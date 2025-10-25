package praktikum_4;
import javax.swing.JOptionPane;
import java.awt.Color;

public class formAksesModifierTugas extends javax.swing.JFrame {

    private Pegawai Pegawai;
    private Manajer Manajer;
    private Staff Staff;

    public formAksesModifierTugas() {
        initComponents();
        Pegawai = new Pegawai();
        Manajer = new Manajer();
        Staff = new Staff();
        labelValidasi.setText("");
        outputAreaPegawai.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        outputAreaPegawai = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnTambahPegawai = new javax.swing.JButton();
        btnUbahGaji = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labelValidasi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        outputAreaPegawai.setColumns(20);
        outputAreaPegawai.setRows(5);
        jScrollPane1.setViewportView(outputAreaPegawai);

        btnTambahPegawai.setText("Tampilkan Data Pegawai");
        btnTambahPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahPegawaiActionPerformed(evt);
            }
        });

        btnUbahGaji.setText("Ubah Gaji");
        btnUbahGaji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahGajiActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Data Pegawai - PT Ingin Maju");

        labelValidasi.setText("Gaji Pegawai");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(531, 531, 531)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelValidasi)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTambahPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(btnUbahGaji, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambahPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUbahGaji, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(labelValidasi)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahPegawaiActionPerformed
        String inputPegawai = JOptionPane.showInputDialog(
                this,
                "Masukkan Nama Pegawai : ",
                "Data Pegawai",
                JOptionPane.QUESTION_MESSAGE
        );

        if (inputPegawai == null || inputPegawai.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama pegawai tidak boleh kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Pegawai.namaPublic = inputPegawai;

        String data_output = "=== Data Pegawai - PT Ingin Maju ===\n"
                + "Nama Pegawai : " + Pegawai.namaPublic + "\n"
                + "Gaji (akses private via getter) : Rp " + String.format("%.0f", Pegawai.getGajiPrivate())
                + "\n\n" + Manajer.getInfo()
                + "\n\n" + Staff.getInfo();

        outputAreaPegawai.setText(data_output);
    }//GEN-LAST:event_btnTambahPegawaiActionPerformed

    private void btnUbahGajiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahGajiActionPerformed
        String inputGaji = JOptionPane.showInputDialog(
                this,
                "Masukkan Gaji Baru:",
                "Ubah Gaji Pegawai",
                JOptionPane.QUESTION_MESSAGE
        );

        if (inputGaji == null) {
            labelValidasi.setText("Perubahan gaji dibatalkan.");
            labelValidasi.setForeground(Color.GRAY);
            return;
        }

        try {
            double gajiBaru = Double.parseDouble(inputGaji);

            if (gajiBaru <= 0) {
                labelValidasi.setText("Gaji harus lebih besar dari nol!");
                labelValidasi.setForeground(Color.RED);
                JOptionPane.showMessageDialog(this,
                        "Gaji (" + inputGaji + ") tidak valid. Gaji harus positif!",
                        "Validasi Gagal",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            Pegawai.setGajiPrivate(gajiBaru);

            String gajiTampil = String.format("%.0f", gajiBaru);

            labelValidasi.setText("Gaji berhasil diubah menjadi Rp " + gajiTampil + " via setter!");
            labelValidasi.setForeground(Color.BLUE);

            JOptionPane.showMessageDialog(this,
                    "Gaji berhasil diubah untuk semua pegawai menjadi Rp " + gajiTampil + ".",
                    "Perubahan Berhasil",
                    JOptionPane.INFORMATION_MESSAGE);

            String data_output = "=== Data Pegawai - PT Ingin Maju ===\n"
                    + "Nama Pegawai : " + Pegawai.namaPublic + "\n"
                    + "Gaji (akses private via getter) : Rp " + String.format("%.0f", Pegawai.getGajiPrivate())
                    + "\n\n" + Manajer.getInfo()
                    + "\n\n" + Staff.getInfo();
            outputAreaPegawai.setText(data_output);
        } catch (NumberFormatException e) {
            labelValidasi.setText("Input '" + inputGaji + "' harus berupa angka!");
            labelValidasi.setForeground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,
                    "Input tidak valid. Masukkan angka tanpa simbol mata uang (contoh: 1000000).",
                    "Error Format Input",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnUbahGajiActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formAksesModifierTugas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTambahPegawai;
    private javax.swing.JButton btnUbahGaji;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelValidasi;
    private javax.swing.JTextArea outputAreaPegawai;
    // End of variables declaration//GEN-END:variables
}

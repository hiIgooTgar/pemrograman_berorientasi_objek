package praktikum_4;
import javax.swing.JOptionPane;
public class formMahasiswaTugas extends javax.swing.JFrame {

    public formMahasiswaTugas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        namaLabel = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        nimLabel = new javax.swing.JLabel();
        txtNim = new javax.swing.JTextField();
        jurusanLabel = new javax.swing.JLabel();
        cbJurusan = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();
        btnTampil = new javax.swing.JButton();
        alamatLabel = new javax.swing.JLabel();
        jenisKelaminLabel = new javax.swing.JLabel();
        cpJenisKelamin = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaAlamat = new javax.swing.JTextArea();
        dosenPembimbingLabel = new javax.swing.JLabel();
        txtDosenPembimbing = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleLabel.setText("Data Mahasiwa Universitas Amikom Purwokerto");

        namaLabel.setText("Nama lengkap");

        nimLabel.setText("NIM");

        jurusanLabel.setText("Jurusan");

        cbJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Prodi", "Informatika", "Sistem Informasi", "Teknologi Informasi", "Ilmu Komunikasi", "Bisnis Digital" }));

        outputArea.setColumns(20);
        outputArea.setRows(5);
        jScrollPane1.setViewportView(outputArea);

        btnTampil.setText("Tampilkan");
        btnTampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilActionPerformed(evt);
            }
        });

        alamatLabel.setText("Alamat");

        jenisKelaminLabel.setText("Jenis Kelamin");

        cpJenisKelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jenis Kelamin", "Laki-laki", "Perempuan" }));

        textAreaAlamat.setColumns(20);
        textAreaAlamat.setRows(5);
        jScrollPane2.setViewportView(textAreaAlamat);

        dosenPembimbingLabel.setText("Dosen Pembimbing");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(namaLabel)
                    .addComponent(txtNama)
                    .addComponent(nimLabel)
                    .addComponent(txtNim)
                    .addComponent(jurusanLabel)
                    .addComponent(cbJurusan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cpJenisKelamin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dosenPembimbingLabel)
                    .addComponent(jenisKelaminLabel)
                    .addComponent(txtDosenPembimbing, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(alamatLabel)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(titleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(btnTampil, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(titleLabel)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaLabel)
                    .addComponent(alamatLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nimLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jurusanLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jenisKelaminLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpJenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dosenPembimbingLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDosenPembimbing, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTampil, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilActionPerformed
        String namaInput = txtNama.getText().trim();
        String nimInput = txtNim.getText().trim();
        String jurusanInput = cbJurusan.getSelectedItem().toString();
        String jenisKelaminInput = cpJenisKelamin.getSelectedItem().toString();
        String dosenPembimbingInput = txtDosenPembimbing.getText().trim();
        String alamatInput = textAreaAlamat.getText().trim();

        if (namaInput.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (nimInput.isEmpty()) {
            JOptionPane.showMessageDialog(this, "NIM harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (jurusanInput.isEmpty() || jurusanInput.equals("Pilih Jurusan")) {
            JOptionPane.showMessageDialog(this, "Jurusan harus dipilih!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (jenisKelaminInput.isEmpty() || jenisKelaminInput.equals("Pilih Jenis Kelamin")) {
            JOptionPane.showMessageDialog(this, "Jenis Kelamin harus dipilih!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (dosenPembimbingInput.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Dosen Pembimbing harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (alamatInput.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Alamat harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        MahasiswaTugas mhs = new MahasiswaTugas();

        mhs.setNama(txtNama.getText());
        mhs.setNim(txtNim.getText());
        mhs.setJurusan(cbJurusan.getSelectedItem().toString());
        mhs.setJenisKelamin(cpJenisKelamin.getSelectedItem().toString());
        mhs.setDosenPembimbing(txtDosenPembimbing.getText());
        mhs.setAlamat(textAreaAlamat.getText());

        String output = "Data Mahasiswa \n\n"
                + "Nama : " + mhs.getNama() + "\n"
                + "NIM : " + mhs.getNim() + "\n"
                + "Jurusan : " + mhs.getJurusan() + "\n"
                + "Jenis Kelamin : " + mhs.getJenisKelamin() + "\n"
                + "Dosen Pembimbing : " + mhs.getDosenPembimbing() + "\n"
                + "Alamat : " + mhs.getAlamat();
        outputArea.setText(output);
        
        txtNama.setText("");
        txtNim.setText("");
        cbJurusan.setSelectedIndex(0);
        cpJenisKelamin.setSelectedIndex(0);
        txtDosenPembimbing.setText("");
        textAreaAlamat.setText("");
    }//GEN-LAST:event_btnTampilActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtNama.setText("");
        txtNim.setText("");
        cbJurusan.setSelectedIndex(0);
        cpJenisKelamin.setSelectedIndex(0);
        txtDosenPembimbing.setText("");
        textAreaAlamat.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formMahasiswaTugas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alamatLabel;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTampil;
    private javax.swing.JComboBox<String> cbJurusan;
    private javax.swing.JComboBox<String> cpJenisKelamin;
    private javax.swing.JLabel dosenPembimbingLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jenisKelaminLabel;
    private javax.swing.JLabel jurusanLabel;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JLabel nimLabel;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JTextArea textAreaAlamat;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField txtDosenPembimbing;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNim;
    // End of variables declaration//GEN-END:variables
}

package praktikum_6;
import javax.swing.JOptionPane;
public class formBangunRuang extends javax.swing.JFrame {
    private static final java.util.logging.Logger Logger = java.util.logging.Logger.getLogger(formBangunRuang.class.getName());

    public formBangunRuang() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(220, 240, 255));
        outputArea.setEditable(false);
        setLocationRelativeTo(null);
        titleKubus.setVisible(false);
        titleSisi.setVisible(false);
        inputSisiKubus.setVisible(false);
        titleBalok.setVisible(false);
        titlePanjang.setVisible(false);
        titleLebar.setVisible(false);
        titleTinggi.setVisible(false);
        inputPanjangBalok.setVisible(false);
        inputLebarBalok.setVisible(false);
        inputTinggiBalok.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbJenisBangunRuang = new javax.swing.JComboBox<>();
        titleKubus = new javax.swing.JLabel();
        titleSisi = new javax.swing.JLabel();
        inputSisiKubus = new javax.swing.JTextField();
        titleBalok = new javax.swing.JLabel();
        titlePanjang = new javax.swing.JLabel();
        inputPanjangBalok = new javax.swing.JTextField();
        titleLebar = new javax.swing.JLabel();
        titleTinggi = new javax.swing.JLabel();
        inputLebarBalok = new javax.swing.JTextField();
        inputTinggiBalok = new javax.swing.JTextField();
        btnHitungVolume = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Aplikasi Hitung Volume Bangun Ruang");

        jLabel2.setText("Bangun Ruang");

        cbJenisBangunRuang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Bangun Ruang", "Kubus", "Balok" }));
        cbJenisBangunRuang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJenisBangunRuangActionPerformed(evt);
            }
        });

        titleKubus.setText("Hitung Volume Kubus");

        titleSisi.setText("Sisi Kubus");

        titleBalok.setText("Hitung Volume Balok");

        titlePanjang.setText("Panjang");

        titleLebar.setText("Lebar");

        titleTinggi.setText("Tinggi");

        btnHitungVolume.setText("Hitung Volume");
        btnHitungVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungVolumeActionPerformed(evt);
            }
        });

        outputArea.setColumns(20);
        outputArea.setRows(5);
        jScrollPane1.setViewportView(outputArea);

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
                        .addGap(179, 179, 179)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titleBalok)
                            .addComponent(jLabel2)
                            .addComponent(cbJenisBangunRuang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(titleKubus)
                            .addComponent(titleSisi)
                            .addComponent(inputSisiKubus)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputPanjangBalok, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(titlePanjang))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titleLebar)
                                    .addComponent(inputLebarBalok, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titleTinggi)
                                    .addComponent(inputTinggiBalok, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(btnHitungVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbJenisBangunRuang, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(titleKubus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleSisi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputSisiKubus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(titleBalok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titlePanjang)
                    .addComponent(titleLebar)
                    .addComponent(titleTinggi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPanjangBalok, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputLebarBalok, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputTinggiBalok, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHitungVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbJenisBangunRuangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJenisBangunRuangActionPerformed
        String jenis = cbJenisBangunRuang.getSelectedItem().toString();
        if (jenis.equals("Kubus")) {
            titleKubus.setVisible(true);
            titleSisi.setVisible(true);
            inputSisiKubus.setVisible(true);
            titleBalok.setVisible(false);
            titlePanjang.setVisible(false);
            titleLebar.setVisible(false);
            titleTinggi.setVisible(false);
            inputPanjangBalok.setVisible(false);
            inputLebarBalok.setVisible(false);
            inputTinggiBalok.setVisible(false);
        } else if (jenis.equals("Balok")) {
            titleKubus.setVisible(false);
            titleSisi.setVisible(false);
            inputSisiKubus.setVisible(false);
            titleBalok.setVisible(true);
            titlePanjang.setVisible(true);
            titleLebar.setVisible(true);
            titleTinggi.setVisible(true);
            inputPanjangBalok.setVisible(true);
            inputLebarBalok.setVisible(true);
            inputTinggiBalok.setVisible(true);
        } else {
            titleKubus.setVisible(false);
            titleSisi.setVisible(false);
            inputSisiKubus.setVisible(false);
            titleBalok.setVisible(false);
            titlePanjang.setVisible(false);
            titleLebar.setVisible(false);
            titleTinggi.setVisible(false);
            inputPanjangBalok.setVisible(false);
            inputLebarBalok.setVisible(false);
            inputTinggiBalok.setVisible(false);
        }
    }//GEN-LAST:event_cbJenisBangunRuangActionPerformed

    private void btnHitungVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungVolumeActionPerformed
        String jenisInput = cbJenisBangunRuang.getSelectedItem().toString();
        String sisiInput = inputSisiKubus.getText().trim();
        String panjangInput = inputPanjangBalok.getText().trim();
        String lebarInput = inputLebarBalok.getText().trim();
        String tinggiInput = inputTinggiBalok.getText().trim();

        double volume = 0.0;
        String hasil = "";
        bangunRuang bangun = null;

        if (jenisInput.isEmpty() || jenisInput.equals("Pilih Bangun Ruang")) {
            JOptionPane.showMessageDialog(this, "Bangun ruang harus dipilih!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (jenisInput.equalsIgnoreCase("Kubus")) {
            if (sisiInput.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Input sisi kubus harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
            }
            double sisi = Double.parseDouble(sisiInput);
            bangun = new Kubus(sisi);
            volume = bangun.hitungVolume(sisi);
            hasil = "==== Volume Kubus ====\n" 
             + "Sisi : " + String.format("%.0f", sisi) 
             + "\nHasil Volume : " + String.format("%.0f", volume);
        } else if (jenisInput.equalsIgnoreCase("Balok")) {
            if (panjangInput.isEmpty() || lebarInput.isEmpty() || tinggiInput.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Semua dimensi Balok (Panjang, Lebar, Tinggi) harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
            }
            double p = Double.parseDouble(panjangInput);
            double l = Double.parseDouble(lebarInput);
            double t = Double.parseDouble(tinggiInput);
            bangun = new Balok(p, l, t);
            volume = bangun.hitungVolume(p, l, t);
            hasil = "==== Volume Balok ====\n" 
             + "Panjang : " + String.format("%.0f", p) 
             + "\nLebar : " + String.format("%.0f", l)
             + "\nTinggi : " + String.format("%.0f", t)
             + "\nHasil Volume : " + String.format("%.0f", volume);
        }

        if (bangun != null) {
            outputArea.setText(hasil);
        } else {
            outputArea.setText(""); 
        }
    }//GEN-LAST:event_btnHitungVolumeActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        cbJenisBangunRuang.setSelectedIndex(0);
        inputSisiKubus.setText("");
        inputPanjangBalok.setText("");
        inputLebarBalok.setText("");
        inputTinggiBalok.setText("");
        outputArea.setText(""); 
    }//GEN-LAST:event_btnResetActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formBangunRuang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHitungVolume;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cbJenisBangunRuang;
    private javax.swing.JTextField inputLebarBalok;
    private javax.swing.JTextField inputPanjangBalok;
    private javax.swing.JTextField inputSisiKubus;
    private javax.swing.JTextField inputTinggiBalok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JLabel titleBalok;
    private javax.swing.JLabel titleKubus;
    private javax.swing.JLabel titleLebar;
    private javax.swing.JLabel titlePanjang;
    private javax.swing.JLabel titleSisi;
    private javax.swing.JLabel titleTinggi;
    // End of variables declaration//GEN-END:variables
}

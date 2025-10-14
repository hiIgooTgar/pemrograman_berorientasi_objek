package praktikum_3;

public class Tugas_MainUI extends javax.swing.JFrame {
    private int count_number_heap = 0;

    Mobil mobil;
    Motor motor;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Tugas_MainUI.class.getName());

    public Tugas_MainUI() {
        initComponents();
        txtOutput.setEditable(false);
        count_heap.setEditable(false);
    }
    
    private void updateCountHeap() {
        int totalHeap = Motor.getJumlahHeapMotor() + Mobil.getJumlahHeapMobil();
        count_heap.setText(String.valueOf(totalHeap));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuatMotor = new javax.swing.JButton();
        btnHapusMotor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        scrollPane1 = new javax.swing.JScrollPane();
        btnKeluar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        btnBuatMobil = new javax.swing.JButton();
        btnHapusMobil = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        count_heap = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuatMotor.setText("Buat Objek Motor");
        btnBuatMotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuatMotorActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuatMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 160, -1));

        btnHapusMotor.setText("Hapus Objek Motor");
        btnHapusMotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusMotorActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapusMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Manajemen Memori di OOP Java");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));
        getContentPane().add(scrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 273, -1, -1));

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, -1, -1));

        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        jScrollPane2.setViewportView(txtOutput);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 700, 380));

        btnBuatMobil.setText("Buat Objek Mobil");
        btnBuatMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuatMobilActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuatMobil, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 160, -1));

        btnHapusMobil.setText("Hapus Objek Mobil");
        btnHapusMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusMobilActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapusMobil, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        jLabel2.setText("Jumlah heap : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 690, -1, -1));
        getContentPane().add(count_heap, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 690, 190, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuatMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuatMotorActionPerformed
        motor = new Motor("Merah", "Vario");
        txtOutput.append("Objek Motor dibuat di heap memory.\n");
        txtOutput.append("Referensi Motor disimpan di stack memory.\n");
        txtOutput.append("Jumlah objek aktif di heap: " + Motor.getJumlahHeapMotor() + "\n\n");
        updateCountHeap();
    }//GEN-LAST:event_btnBuatMotorActionPerformed

    private void btnHapusMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusMotorActionPerformed
        motor = null;
        System.gc();
        txtOutput.append("Referensi objek dihapus (motor = null).\n");
        txtOutput.append("Garbage Collector akan membersihkan memori motor.\n\n");
    }//GEN-LAST:event_btnHapusMotorActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnBuatMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuatMobilActionPerformed
        mobil = new Mobil("Merah", "Toyota");
        txtOutput.append("Objek Mobil dibuat di heap memory.\n");
        txtOutput.append("Referensi Mobil disimpan di stack memory.\n");
        txtOutput.append("Jumlah objek aktif di heap: " + Mobil.getJumlahHeapMobil() + "\n\n");
        updateCountHeap();
    }//GEN-LAST:event_btnBuatMobilActionPerformed

    private void btnHapusMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusMobilActionPerformed
        mobil = null;
        System.gc();
        txtOutput.append("Referensi objek dihapus (mobil = null).\n");
        txtOutput.append("Garbage Collector akan membersihkan memori mobil.\n\n");
    }//GEN-LAST:event_btnHapusMobilActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Tugas_MainUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuatMobil;
    private javax.swing.JButton btnBuatMotor;
    private javax.swing.JButton btnHapusMobil;
    private javax.swing.JButton btnHapusMotor;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JTextField count_heap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane scrollPane1;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables
}

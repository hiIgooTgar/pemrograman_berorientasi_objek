package praktikum_3;

public class Tugas_MainUI extends javax.swing.JFrame {
    Mobil mobil;
    Motor motor;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Tugas_MainUI.class.getName());

    public Tugas_MainUI() {
        initComponents();
        txtOutput.setEditable(false);
        count_heap.setText("Jumlah heap mobil dan motor : 0");
        count_heap_mobil.setText("Jumlah aktif heap mobil : 0");
        count_heap_motor.setText("Jumlah aktif heap motor : 0");
    }

    private void updateCountHeap() {
        int totalHeap = Motor.getJumlahHeapMotor() + Mobil.getJumlahHeapMobil();
        count_heap.setText("Jumlah heap mobil dan motor : " + totalHeap);
    }

    private void updateCountHeapMobil() {
        int totalHeapMobil = Mobil.getJumlahHeapMobil();
        count_heap_mobil.setText("Jumlah aktif heap mobil : " + totalHeapMobil);
    }

    private void updateCountHeapMotor() {
        int totalHeapMotor = Motor.getJumlahHeapMotor();
        count_heap_motor.setText("Jumlah aktif heap motor : " + totalHeapMotor);
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
        count_heap = new javax.swing.JLabel();
        count_heap_motor = new javax.swing.JLabel();
        count_heap_mobil = new javax.swing.JLabel();

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel1.setText("Manajemen Memori di OOP Java");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));
        getContentPane().add(scrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 273, -1, -1));

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, -1, -1));

        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        jScrollPane2.setViewportView(txtOutput);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 840, 380));

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

        count_heap.setText("Jumlah heap mobil dan motor : 0");
        getContentPane().add(count_heap, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 730, -1, -1));

        count_heap_motor.setText("Jumlah akitf heap motor : 0");
        getContentPane().add(count_heap_motor, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 690, -1, -1));

        count_heap_mobil.setText("Jumlah aktif heap mobil : 0");
        getContentPane().add(count_heap_mobil, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 690, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnBuatMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuatMotorActionPerformed
        motor = new Motor("Merah", "Vario");
        txtOutput.append("Objek Motor dibuat di heap memory.\n");
        txtOutput.append("Referensi Motor disimpan di stack memory.\n");
        txtOutput.append("Jumlah objek aktif di heap: " + Motor.getJumlahHeapMotor() + "\n\n");
        updateCountHeapMotor();
        updateCountHeap();
    }//GEN-LAST:event_btnBuatMotorActionPerformed
    private void btnHapusMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusMotorActionPerformed
        if (motor != null && Motor.getJumlahHeapMotor() != 0) {
            txtOutput.append("Referensi objek Motor dihapus (motor = null).\n");
            Motor.decrementMotor();
            System.gc();
            txtOutput.append("Garbage Collector dipanggil untuk membersihkan memori motor.\n");
            txtOutput.append("Jumlah objek heap yang aktif: " + Motor.getJumlahHeapMotor() + "\n\n");
            updateCountHeapMotor();
            updateCountHeap();
        } else {
            txtOutput.append("Objek Motor sudah null (bernilai 0). Tidak ada yang perlu dihapus.\n\n");
        }
    }//GEN-LAST:event_btnHapusMotorActionPerformed
    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnKeluarActionPerformed
    private void btnBuatMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuatMobilActionPerformed
        mobil = new Mobil("Hitam", "Toyota");
        txtOutput.append("Objek Mobil dibuat di heap memory.\n");
        txtOutput.append("Referensi Mobil disimpan di stack memory.\n");
        txtOutput.append("Jumlah objek aktif di heap: " + Mobil.getJumlahHeapMobil() + "\n\n");
        updateCountHeapMobil();
        updateCountHeap();
    }//GEN-LAST:event_btnBuatMobilActionPerformed
    private void btnHapusMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusMobilActionPerformed
        if (mobil != null && Mobil.getJumlahHeapMobil() != 0) {
            txtOutput.append("Referensi objek Mobil dihapus (mobil = null).\n");
            Mobil.decrementMobil();
            System.gc();
            txtOutput.append("Garbage Collector dipanggil untuk membersihkan memori mobil.\n");
            txtOutput.append("Jumlah objek heap yang aktif: " + Mobil.getJumlahHeapMobil() + "\n\n");
            updateCountHeapMobil();
            updateCountHeap();
        } else {
            txtOutput.append("Objek Mobil sudah null (bernilai 0). Tidak ada yang perlu dihapus.\n\n");
        }
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
    private javax.swing.JLabel count_heap;
    private javax.swing.JLabel count_heap_mobil;
    private javax.swing.JLabel count_heap_motor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane scrollPane1;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables
}

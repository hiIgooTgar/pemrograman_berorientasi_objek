package view;

import java.io.InputStream;
import java.sql.Connection;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class dashboard extends javax.swing.JFrame {

    public dashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        navDataObat = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        reportDataObat = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        btnLogout = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem11.setText("jMenuItem11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("Dashboard Apotek Alam Sutra");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Hallo, Selamat Datang Administrator");

        jMenu2.setText("Dashboard");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Data Master");

        navDataObat.setText("Data Obat");
        navDataObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navDataObatActionPerformed(evt);
            }
        });
        jMenu3.add(navDataObat);

        jMenuItem5.setText("Data Supplier");
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Data Kategori Obat");
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Data Satuan Obat");
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Data Pegawai");
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("Data Pelanggan");
        jMenu3.add(jMenuItem9);

        jMenuItem3.setText("Data Dokter");
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Transaksi");

        jMenuItem10.setText("Penjualan Obat");
        jMenu4.add(jMenuItem10);

        jMenuItem12.setText("Pembelian Obat");
        jMenu4.add(jMenuItem12);

        jMenuItem13.setText("Retur Penjualan");
        jMenu4.add(jMenuItem13);

        jMenuItem15.setText("Retur Pembelian");
        jMenu4.add(jMenuItem15);

        jMenuItem16.setText("Resep Dokter");
        jMenu4.add(jMenuItem16);

        jMenuItem14.setText("Manajemen Stok");
        jMenu4.add(jMenuItem14);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Laporan");

        reportDataObat.setText("Laporan Data Obat");
        reportDataObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportDataObatActionPerformed(evt);
            }
        });
        jMenu5.add(reportDataObat);

        jMenuItem18.setText("Laporan Penjualan");
        jMenu5.add(jMenuItem18);

        jMenuItem21.setText("Laporan Pembelian");
        jMenu5.add(jMenuItem21);

        jMenuItem20.setText("Laporan Stok");
        jMenu5.add(jMenuItem20);

        jMenuItem19.setText("Laporan Supplier");
        jMenu5.add(jMenuItem19);

        jMenuItem22.setText("Laporan Obat Kadaluarsa");
        jMenu5.add(jMenuItem22);

        jMenuItem23.setText("Laporan Obat Terlaris");
        jMenu5.add(jMenuItem23);

        jMenuItem24.setText("Laporan Keuangan");
        jMenu5.add(jMenuItem24);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Utilitis");

        jMenuItem26.setText("Manajemen User");
        jMenu6.add(jMenuItem26);

        jMenuItem25.setText("Backup Database");
        jMenu6.add(jMenuItem25);

        jMenuItem27.setText("Restore Database");
        jMenu6.add(jMenuItem27);

        jMenuItem28.setText("Pengaturan Apotek");
        jMenu6.add(jMenuItem28);

        jMenuItem29.setText("Log Aktivitas");
        jMenu6.add(jMenuItem29);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Bantuan");

        jMenuItem30.setText("Panduan Aplikasi");
        jMenu7.add(jMenuItem30);

        jMenuItem31.setText("Tentang Aplikasi");
        jMenu7.add(jMenuItem31);

        jMenuBar1.add(jMenu7);

        btnLogout.setText("Logout");
        jMenuBar1.add(btnLogout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1))
                .addContainerGap(261, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(207, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void navDataObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navDataObatActionPerformed
        dataObat obat = new dataObat();
        obat.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_navDataObatActionPerformed

    private void reportDataObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportDataObatActionPerformed
        try {
            Connection conn = config.koneksi.getConnection();
            InputStream is = getClass().getResourceAsStream("/report/report_apotek.jasper");
            if(is == null) {
                JOptionPane.showMessageDialog(null, "File report obat tidak ditemukan!");
                return;
            }
            
            JasperPrint jp = JasperFillManager.fillReport(is, null, conn);
            JasperViewer viewer = new JasperViewer(jp, false);
            viewer.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error : " + e.getMessage());
        }
    }//GEN-LAST:event_reportDataObatActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnLogout;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem navDataObat;
    private javax.swing.JMenuItem reportDataObat;
    // End of variables declaration//GEN-END:variables
}

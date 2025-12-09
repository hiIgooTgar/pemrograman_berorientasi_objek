package dao;

import config.koneksi;
import model.mahasiswa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class mahasiswaDao {

    public boolean simpan(mahasiswa m) {
        String sql = "INSERT INTO mahasiswa (nim, nama, prodi, no_telp, alamat) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = koneksi.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, m.getNim());
            ps.setString(2, m.getNama());
            ps.setString(3, m.getProdi());
            ps.setString(4, m.getNoTelp());
            ps.setString(5, m.getAlamat());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error simpan mahasiswa: " + e.getMessage());
            return false;
        }
    }

    public boolean update(mahasiswa m, String nimLama) {
        String sql = "UPDATE mahasiswa SET nim = ?, nama = ?, prodi = ?, no_telp = ?, alamat = ? WHERE nim = ?";
        try (Connection conn = koneksi.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, m.getNim());
            ps.setString(2, m.getNama());
            ps.setString(3, m.getProdi());
            ps.setString(4, m.getNoTelp());
            ps.setString(5, m.getAlamat());
            ps.setString(6, nimLama);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Gagal mengupdate mahasiswa: " + e.getMessage());
            return false;
        }
    }

    public void delete(String nim) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = koneksi.getConnection();
            String sql = "DELETE FROM mahasiswa WHERE nim = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, nim);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error delete: " + e.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}

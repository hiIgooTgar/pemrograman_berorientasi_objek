package config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static  Connection conn;
    
    public static Connection getConnection() {
        if(conn == null) {
            try {
                String url  = "jdbc:mysql://localhost:3306/igo_apotek_24sa11a159";
                String user = "root";
                String pass = "";

                conn = DriverManager.getConnection(url, user, pass);
                System.out.println("Koneksi terhubung");
            } catch (SQLException e) {
                System.out.println("Koneksi gagal : " + e.getMessage());
            }
        }
        return conn;
    }
}

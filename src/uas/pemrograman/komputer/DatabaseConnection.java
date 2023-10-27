package uas.pemrograman.komputer;

import com.mysql.cj.jdbc.MysqlDataSource; // Tambahkan import ini
import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection sambungkeDB() {
        try {
            MysqlDataSource mds = new MysqlDataSource();
            mds.setUser("root");
            mds.setPassword("");
            mds.setDatabaseName("data_umkm");
            mds.setPortNumber(3306);
            mds.setServerName("localhost");
            mds.setServerTimezone("Asia/Jakarta");
            Connection con = mds.getConnection();
            return con;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            e.printStackTrace(); // Tambahkan ini untuk melihat trace error secara lengkap
        }
        return null;
    }

    public static void main(String[] args) {
        Connection c = sambungkeDB();
        if (c != null) {
            System.out.println("Terhubung");
        } else {
            System.out.println("Gagal terhubung");
        }
    }
}

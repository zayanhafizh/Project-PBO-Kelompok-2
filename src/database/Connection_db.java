package database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class Connection_db {
    public static Connection getConnection() {
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Kelompok6Database.db");
            //JOptionPane.showMessageDialog(null, "Berhasil Koneksi ke Database");
            
            return conn;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}

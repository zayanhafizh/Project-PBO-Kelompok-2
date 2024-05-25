/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectpbokelompok2;
import model.User;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.*;


/**
 *
 * @author M Zayan Hafizh H
 */
public class ProjectPBOKelompok2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProjectPBOKelompok2 app = new ProjectPBOKelompok2();
        app.SelectAll();
    }
    
    public void SelectAll(){
        User user;
        List<User> userList = new ArrayList<>();
        String sql = "SELECT * FROM user";
        
       try(Connection conn = connect();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql)) {
           //Loop through result set
           while (rs.next()) {
               System.out.println(rs.getString("Username") + '\t' + rs.getString("Password"));
           }
       }
       catch(SQLException e) {
           System.out.println(e.getMessage());
       }
       
    }
    
    public Connection connect() {
        String url = "jdbc:sqlite:Kelompok6Database.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}

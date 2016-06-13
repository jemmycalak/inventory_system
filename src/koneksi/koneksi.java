/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import com.mysql.jdbc.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jemmy Calak
 */
public class koneksi {
    ResultSet rs;
    com.mysql.jdbc.Connection kon=null;
    
    public static com.mysql.jdbc.Connection koneksi(){
        String driver = "com.mysql.jdbc.Driver";
        String host = "jdbc:mysql://localhost/db_is";
        String user = "root";
        String password = "";        
        try {
            Class.forName(driver);
            com.mysql.jdbc.Connection conn = (com.mysql.jdbc.Connection) DriverManager.getConnection(host,user,password);
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Koneksi");
        }
        return null;
    }
    
}

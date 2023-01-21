/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahmoudi_etudiant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author mohamed_mahmoudi
 */
public class DB {

    public static Connection c;

    public static Connection getConnection() throws Exception {
        if (c == null) {
            Class.forName("com.mysql.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/getudiant", "getud", "000000");
        }
        return c;
    }

    // Send data TO Database
    public static void setData(String sql) throws Exception {
        DB.getConnection().createStatement().executeUpdate(sql);
    }

    // Get Data From Database
    public static ResultSet getData(String sql) throws Exception {
        ResultSet rs = DB.getConnection().createStatement().executeQuery(sql);
        return rs;
    }
}

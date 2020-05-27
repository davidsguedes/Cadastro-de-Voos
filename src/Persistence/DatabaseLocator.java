/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Persistence;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;


public class DatabaseLocator {
    private static DatabaseLocator instance = new DatabaseLocator();

    private DatabaseLocator() {}
    
    public static DatabaseLocator getInstance() {
        return instance;             
    }
    
    public Connection getConnection() throws ClassNotFoundException, SQLException {
         Class.forName("com.mysql.jdbc.Driver");
        Connection conn = null;
        conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/projetoVoo1", "guedes", "Fatima012020");
        return conn;
        //jdbc:mysql://localhost:3306/?user=guedes
    }
}

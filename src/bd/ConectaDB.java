/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Windows 10
 */
public class ConectaDB {
    static String dato;
    static String usuario="Relacional12";
    static String  password = "12345";
    static String url="jdbc:sqlserver://localhost:1433; databaseName=Diagrama1";
    public static Connection conexion(){
        Connection cn = null;
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection(url,usuario,password);
        }catch(Exception ex)
        {
            javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage()); 
        }
        return cn;
    }
}


package SDAproject;

import java.sql.*;
import javax.swing.JOptionPane;

public class myconnection {
    Connection con;
    Statement st;
    
    public myconnection(){
        try{
        String url = "jdbc:sqlserver://localhost\\DESKTOP-8FQ55NB:1433;databaseName=test;integratedSecurity=true;";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        con = DriverManager.getConnection(url);
        st = con.createStatement();
            System.out.println("Connected");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

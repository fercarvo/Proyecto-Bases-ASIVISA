package Clases.Util;


import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConectorBDD {
    String url; 
    String dbName;
    String driver;
    String userName; 
    String password;
    Connection con;
    Statement st;

    public ConectorBDD() {
        url = "localhost"; 
        dbName = "BaseASIVISA";
        driver = "com.mysql.jdbc.Driver";
        userName = "root"; 
        password = "1991";
        con = null;
        st = null;
    }
    
   public void conectar() throws SQLException{
       
       con = DriverManager.getConnection(url, userName, password);
       st = (Statement) con.createStatement();
   }
   
   public void desconectar() throws SQLException{
       con.close();
   }
    
    


    
    
}

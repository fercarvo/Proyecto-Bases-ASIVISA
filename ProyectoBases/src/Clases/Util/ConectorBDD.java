package Clases.Util;


import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConectorBDD {
    private String url; 
    private String dbName;
    private String driver;
    private String userName; 
    private String password;
    private Connection con;
    private Statement st;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public Statement getSt() {
        return st;
    }

    public void setSt(Statement st) {
        this.st = st;
    }
   
}

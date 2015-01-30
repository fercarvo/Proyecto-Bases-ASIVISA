package Clases.Util;


import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class ConectorBDD {
    private String url; 
    private String dbName;
    private String driver;
    private String userName; 
    private String password;
    private Connection con;
    private Statement st;

    public ConectorBDD() {
        url = "jdbc:mysql://localhost/BaseASIVISA"; 
        dbName = "BaseASIVISA";
        driver = "com.mysql.jdbc.Driver";
        userName = "ASIVISA"; 
        password = "asivisa";
        con = null;
        st = null;
    }
    
   public void conectar() throws SQLException{
       
       con = DriverManager.getConnection(url, userName, password);
       //st = (Statement) con.createStatement();
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
   
    public void listaTablas() throws SQLException{
        ArrayList<String> tablas= new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement("show tables");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                tablas.add(rs.getString(1));
            }
            System.out.println("Se encontraron "+ tablas.size()+ " tablas");
            for (String tabla : tablas) {
                System.out.println(tabla);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar las tablas");
            throw e;
        }
    }
}

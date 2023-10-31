package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Main {
    
    private Connection conectar = null;
    
    private final String usuario = "root";
    
    private final String contrasena = "123456789";
    
    private final Statement st = null;
    
    private final ResultSet  rs = null;
    
    private final String cadena = "jdbc:mysql://localhost:3306/personal1";
    
    public Connection establecerConeccion(){
        
        try{
            this.conectar = DriverManager.getConnection(cadena, usuario, contrasena);
            JOptionPane.showMessageDialog(null, "Se conectó correctamente");
        }catch (Exception e){
            System.out.println(e);
        }
        return this.conectar;
        
    }
    
    public static void main(String[] args) {
        Main app = new Main();
        app.establecerConeccion();
    }
    
    
}

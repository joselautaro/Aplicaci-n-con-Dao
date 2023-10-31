package Interfaces;

import Dao.Main;
import Personas.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class DAOEmpleadoImplementacion implements DAOEmpleado{
    
    //Establemos una estancia de la clase main aquí
    Main main = new Main();
    
    public DAOEmpleadoImplementacion(){}

    @Override
    public void registrar(Empleado empleado) {
        
        //Implementamos un try-catch
        try{
            
            Connection conectar = this.main.establecerConeccion();
            PreparedStatement insertar = conectar.prepareStatement("INSERT INTO empleados (id, nombre) VALUES (?, ?)");
            insertar.setInt(1, empleado.getId());
            insertar.setString(2, empleado.getEmpleado());
            insertar.executeUpdate();
            
        }catch(Exception e){
            System.out.println(e);
        }
       
    }

    @Override
    public void modificar(Empleado empleado) {
        
    }

    @Override
    public void eliminar(Empleado empleado) {
       
    }

    @Override
    public void buscar(Empleado empleado) {
        
    }
    
    
    
}

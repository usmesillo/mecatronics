package Datos;

import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jaime
 */
public class mecatronicsService {
    
    public static boolean listarDatos(String usuario, String contraseña){
    return MecatronicsDAO.leerDatos(usuario,contraseña);
    
    }
    
    public static void agregarCliente(Cliente nuevoCliente) throws SQLException{
   
    MecatronicsDAO.añadirClientes(nuevoCliente);
    }
    
     public static void leerPlanes() throws SQLException{
   
    MecatronicsDAO.leerPlanes();
    }
      public static void leerCiudades(int idDepartamento) throws SQLException{
   
    MecatronicsDAO.leerCiudades(idDepartamento);
    }
}

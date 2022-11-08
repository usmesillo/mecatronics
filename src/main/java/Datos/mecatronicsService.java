package Datos;

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
    
    
    
}

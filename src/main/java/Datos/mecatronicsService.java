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
    
    public static void listarDatos(String usuario, String contraseña){
    MecatronicsDAO.leerDatos(usuario,contraseña);
    
    }
}

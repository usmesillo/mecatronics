package Datos;


import java.sql.Connection;
import mx.com.gm.jdbc.mecatronics.interfaz.login;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jaime
 */
public class inicio {
    
    public static void main(String[] args) {
      
        Conexion conexion = new Conexion();
        
        try(Connection cnx= conexion.get_connection()) {
          login login1 =new login();
          login1.show(true);
        } catch (Exception e) {
            System.out.println(e);
        
        
      
    }
    }
}

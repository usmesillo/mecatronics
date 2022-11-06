package Datos;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jaime
 */
public class Conexion {
    
    public Connection get_connection(){
    Connection conection = null;
    
        try {
            conection = DriverManager.getConnection("jdbc:mysql://localhost/mecatronics?useSSL=false&serverTimezone=UTC", "root", "admin");
            if(conection!=null){
                System.out.println("Conexion exitosa");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return conection;
    }
    
}

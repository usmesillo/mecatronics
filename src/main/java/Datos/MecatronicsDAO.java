package Datos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jaime
 */
public class MecatronicsDAO {
    
    public static boolean leerDatos(String user, String contraseña){
    Conexion db_connect = new Conexion();
    
      PreparedStatement ps=null;
            ResultSet rs=null;
            boolean entrar=false;
        try(Connection conexion =db_connect.get_connection()) {
          String query="Select * From empleados";
          ps=conexion.prepareStatement(query);
          rs=ps.executeQuery();
          boolean encontrado=false;
          while(rs.next()&&encontrado==false){
              if(rs.getString("usuario").equals(user)){
                  if(rs.getString("contraseña").equals(contraseña)){
                  entrar=true;
                  encontrado=true;
                   JOptionPane.showMessageDialog(null, "Bienvenido "+ user);
                  }else{
                      JOptionPane.showMessageDialog(null, "Contraeña Incorrecta");
                  
                  }
              
              }else{
                     JOptionPane.showMessageDialog(null, "Usuario incorrecto");
              }
          }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    return entrar;
    }
}

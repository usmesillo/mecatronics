package Datos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import mx.com.gm.jdbc.mecatronics.interfaz.PanelAgregarCliente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jaime
 */

public class MecatronicsDAO {
  public static Empleado empleadoActual=null;
    public static boolean leerDatos(String user, String contraseña){
    Conexion db_connect = new Conexion();
    
      PreparedStatement ps=null;
            ResultSet rs=null;
            boolean entrar=false;
        try(Connection conexion =db_connect.get_connection()) {
          String query="Select * From empleados INNER JOIN personas ON empleados.idPersona = personas.idPersona";
          ps=conexion.prepareStatement(query);
          rs=ps.executeQuery();
          boolean encontrado=false;
          while(rs.next()&&encontrado==false){
              if(rs.getString("usuario").equals(user)){
                  if(rs.getString("contraseña").equals(contraseña)){
                  entrar=true;
                  empleadoActual=new Empleado(Integer.parseInt(rs.getString("idEmpleado")), Integer.parseInt(rs.getString("idPersona")), rs.getString("usuario"), rs.getString("contraseña"),rs.getString("cargo"), Integer.parseInt(rs.getString("idPersona")), rs.getString("nombre"),rs.getString("apellido"), rs.getString("rutaFoto"));
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
    public static void leerPlanes(){
    Conexion db_connect = new Conexion();
    
      PreparedStatement ps=null;
            ResultSet rs=null;
           
        try(Connection conexion =db_connect.get_connection()) {
          String query="Select * From planes";
          ps=conexion.prepareStatement(query);
          rs=ps.executeQuery();
          
          while(rs.next()){
              PanelAgregarCliente.setComboboxPlanes(rs.getString("nombrePlan"));
          }
            
        } catch (Exception e) {
            System.out.println(e);
        }
   
    }
       public static void leerCiudades(int idDepartamento){
    Conexion db_connect = new Conexion();
    
      PreparedStatement ps=null;
            ResultSet rs=null;
           
        try(Connection conexion =db_connect.get_connection()) {
          String query="SELECT * FROM ciudades where idDepartamento="+idDepartamento;
          ps=conexion.prepareStatement(query);
          rs=ps.executeQuery();
          //ps.setInt(1, idDepartamento);
          while(rs.next()){
              PanelAgregarCliente.setComboboxCiudades(rs.getString("nombreCiudad"));
          }
            
        } catch (Exception e) {
            System.out.println(e);
        }
   
    }
    
    
     public static void añadirClientes(Cliente nuevoCliente) throws SQLException{
    Conexion db_connect = new Conexion();
    
    
            
        try(Connection conexion =db_connect.get_connection()) {
              PreparedStatement ps=null;
              try {
                 String query="insert into mecatronics.clientes(documento,direccion,planId,telefono,personaId,email,barrio,idCiudad,idDepartamento,idPais)values(?,?,?,?,?,?,?,?,?,?);";
                 ps=conexion.prepareStatement(query);
                 ps.setString(1, nuevoCliente.getDocumento());
                 ps.setString(2, nuevoCliente.getDireccion());
                 ps.setInt(3, nuevoCliente.getPlanId());
                 ps.setString(4, nuevoCliente.getTelefono());
                 ps.setInt(5, nuevoCliente.getPersonaId());
                 ps.setString(6, nuevoCliente.getEmail());
                  ps.setString(7, nuevoCliente.getBarrio());
                   ps.setInt(8, nuevoCliente.getIdCiudad());
                    ps.setInt(9, nuevoCliente.getIdDepartamento());
                     ps.setInt(10, nuevoCliente.getIdPais());
            } catch (SQLException ex) {
                  System.out.println(ex);
            }
         
    /**
     *
     */
    
        }
     }
}

package Datos;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import mx.com.gm.jdbc.mecatronics.interfaz.PanelAgregarCliente;
import mx.com.gm.jdbc.mecatronics.interfaz.PanelModificarCliente;

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
    public static void leerPlanesPanelModificarClientes(){
    Conexion db_connect = new Conexion();
    
      PreparedStatement ps=null;
            ResultSet rs=null;
           
        try(Connection conexion =db_connect.get_connection()) {
          String query="Select * From planes";
          ps=conexion.prepareStatement(query);
          rs=ps.executeQuery();
          
          while(rs.next()){
              PanelModificarCliente.setComboboxPlanes(rs.getString("nombrePlan"));
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
       public static void leerCiudadesPanelModificarClientes(int idDepartamento){
    Conexion db_connect = new Conexion();
    
      PreparedStatement ps=null;
            ResultSet rs=null;
           
        try(Connection conexion =db_connect.get_connection()) {
          String query="SELECT * FROM ciudades where idDepartamento="+idDepartamento;
         ps=conexion.prepareStatement(query);
          rs=ps.executeQuery();
          //ps.setInt(1, idDepartamento);
          while(rs.next()){
              PanelModificarCliente.setComboboxCiudades(rs.getString("nombreCiudad"));
          }
            
        } catch (Exception e) {
            System.out.println(e);
        }
   
    }  
       
       public static void borrarClientes(String documento){
    Conexion db_connect = new Conexion();
    
      PreparedStatement ps=null;
            ResultSet rs=null;
           
        try(Connection conexion =db_connect.get_connection()) {
         String query = "DELETE FROM clientes WHERE documento ="+documento;
 ps=conexion.prepareStatement(query);
    ps.executeUpdate();
//statement.setString(1, documento);


            
        } catch (Exception e) {
            System.out.println(e);
        }
   
    }  
       public static void leerDepartamentos(int idPais){
    Conexion db_connect = new Conexion();
    
      PreparedStatement ps=null;
            ResultSet rs=null;
           
        try(Connection conexion =db_connect.get_connection()) {
          String query="SELECT * FROM departamentos where idPais="+idPais;
          ps=conexion.prepareStatement(query);
          rs=ps.executeQuery();
          //ps.setInt(1, idPais);
          while(rs.next()){
              PanelAgregarCliente.setComboboxDepartamentos(rs.getString("nombreDepartamento"));
          }
            
        } catch (Exception e) {
            System.out.println(e);
        }
   
    }
       public static void leerDepartamentosPanelModificarClientes(int idPais){
    Conexion db_connect = new Conexion();
    
      PreparedStatement ps=null;
            ResultSet rs=null;
           
        try(Connection conexion =db_connect.get_connection()) {
          String query="SELECT * FROM departamentos where idPais="+idPais;
          ps=conexion.prepareStatement(query);
          rs=ps.executeQuery();
          //ps.setInt(1, idPais);
          while(rs.next()){
              PanelModificarCliente.setComboboxDepartamentos(rs.getString("nombreDepartamento"));
          }
            
        } catch (Exception e) {
            System.out.println(e);
        }
   
    }
       
          public static int devoldorIdDepartamentosPorNombre(String departamento){
    Conexion db_connect = new Conexion();
    int idPaisDevuelto=0;
      PreparedStatement ps=null;
            ResultSet rs=null;
           
        try(Connection conexion =db_connect.get_connection()) {
          String query="SELECT * FROM departamentos where nombreDepartamento=?";
          ps=conexion.prepareStatement(query);
          
          ps.setString(1,departamento);
          rs=ps.executeQuery();
          while(rs.next()){
             idPaisDevuelto=(rs.getInt("idDepartamento"));
          }
            
        } catch (Exception e) {
            System.out.println(e);
        }
   return idPaisDevuelto;
    }
          
           public static int devoldorIdPaisesPorNombre(String pais){
    Conexion db_connect = new Conexion();
    int idPaisDevuelto=0;
      PreparedStatement ps=null;
            ResultSet rs=null;
           
        try(Connection conexion =db_connect.get_connection()) {
          String query="SELECT * FROM paises where nombrePais=?";
          ps=conexion.prepareStatement(query);
          
          ps.setString(1, pais);
          rs=ps.executeQuery();
          while(rs.next()){
             idPaisDevuelto=(rs.getInt("idPais"));
          }
            
        } catch (Exception e) {
            System.out.println(e);
        }
   return idPaisDevuelto;
    }
           public static int devoldorIdCiudadesPorNombre(String ciudad){
    Conexion db_connect = new Conexion();
    int idCiudadDevuelto=0;
      PreparedStatement ps=null;
            ResultSet rs=null;
           
        try(Connection conexion =db_connect.get_connection()) {
          String query="SELECT * FROM ciudades where nombreCiudad=?";
          ps=conexion.prepareStatement(query);
          
          ps.setString(1, ciudad);
          rs=ps.executeQuery();
          while(rs.next()){
             idCiudadDevuelto=(rs.getInt("idCiudad"));
          }
            
        } catch (Exception e) {
            System.out.println(e);
        }
   return idCiudadDevuelto;
    }
           public static int devolverIdPlan(String plan){
    Conexion db_connect = new Conexion();
    int idPlanDevuelto=0;
      PreparedStatement ps=null;
            ResultSet rs=null;
           
        try(Connection conexion =db_connect.get_connection()) {
          String query="SELECT * FROM planes where nombrePlan=?";
          ps=conexion.prepareStatement(query);
          
          ps.setString(1, plan);
          rs=ps.executeQuery();
          while(rs.next()){
             idPlanDevuelto=(rs.getInt("idPlan"));
          }
            
        } catch (Exception e) {
            System.out.println(e);
        }
   return idPlanDevuelto;
    }
       
       
       
       public static void leerPaises(){
    Conexion db_connect = new Conexion();
    
      PreparedStatement ps=null;
            ResultSet rs=null;
           
        try(Connection conexion =db_connect.get_connection()) {
          String query="SELECT * FROM paises";
          ps=conexion.prepareStatement(query);
          rs=ps.executeQuery();
          //ps.setInt(1, idDepartamento);
          while(rs.next()){
              PanelAgregarCliente.setComboboxPaises(rs.getString("nombrePais"));
          }
            
        } catch (Exception e) {
            System.out.println(e);
        }
   
    }
        public static void leerPaisesPanelModificarClientes(){
    Conexion db_connect = new Conexion();
    
      PreparedStatement ps=null;
            ResultSet rs=null;
           
        try(Connection conexion =db_connect.get_connection()) {
          String query="SELECT * FROM paises";
          ps=conexion.prepareStatement(query);
          rs=ps.executeQuery();
          //ps.setInt(1, idDepartamento);
          while(rs.next()){
              PanelModificarCliente.setComboboxPaises(rs.getString("nombrePais"));
          }
            
        } catch (Exception e) {
            System.out.println(e);
        }
   
    }
       
           
       public static Cliente leerClientesPorDocumento(String documento){
    Conexion db_connect = new Conexion();
    Cliente clienteBuscado=null;
    
      PreparedStatement ps=null;
            ResultSet rs=null;
           
        try(Connection conexion =db_connect.get_connection()) {
          String query="SELECT * FROM clientes where documento="+documento;
          ps=conexion.prepareStatement(query);
          rs=ps.executeQuery();
          //ps.setString(1, "");
          while(rs.next()){
             clienteBuscado=new Cliente(rs.getString("documento"), rs.getString("telefono"), rs.getString("email"), rs.getString("barrio"), rs.getString("direccion"), rs.getInt("planId"), rs.getInt("idDepartamento"), rs.getInt("idCiudad"),rs.getInt("idPais"), rs.getString("nombre"), rs.getString("apellido"), rs.getInt("idEstado"));
          }
            
        } catch (Exception e) {
            System.out.println(e);
        }
   return clienteBuscado;
    }
       public static ArrayList<Factura> leerFacturasPorDocumento(String documento){
    Conexion db_connect = new Conexion();
        ArrayList<Factura> facturasEncontradas = new ArrayList();       
    
      PreparedStatement ps=null;
            ResultSet rs=null;
           int index=0;
           Factura facturaActual;
        try(Connection conexion =db_connect.get_connection()) {
          String query="SELECT * FROM facturas where documentoCliente="+documento;
          ps=conexion.prepareStatement(query);
          rs=ps.executeQuery();
          //ps.setString(1, "");
          while(rs.next()){
              DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
		Date date =rs.getDate("fechaFacturacion") ;        
		String dateToStr = dateFormat.format(date);
                String fechaCuadrada=dateToStr;
              facturaActual=new Factura(rs.getInt("idFacturas"), rs.getDouble("valorFactura"), rs.getString("documentoCliente"), rs.getString("motivoFactura"),fechaCuadrada);
              facturasEncontradas.add(index,facturaActual);
                      index++;
                      
                      System.out.println(fechaCuadrada);
          }
            
        } catch (Exception e) {
            System.out.println(e);
        }
   return facturasEncontradas;
    }
    public static void ModificarClientes(String documento,String documentoNuevo,String nombre,String apellido,String direccion,int planId,String telefono,String email,String barrio,int idPais,int idCiudad,int idDepartamento) throws SQLException{
    Conexion db_connect = new Conexion();
    
    
            
        try(Connection conexion =db_connect.get_connection()) {
              PreparedStatement ps=null;
              try {
                 String query="UPDATE clientes SET nombre = ?, direccion = ?, documento = ?, apellido= ?, email= ?,telefono=?,barrio=?,planId=?,idPais=?,idCiudad=?,idDepartamento=? WHERE (documento = ?)";
                 ps=conexion.prepareStatement(query);
                 ps.setString(1,nombre);
                 ps.setString(2,direccion);
                 ps.setString(3,documentoNuevo);
                 ps.setString(4,apellido);
                 ps.setString(5,email);
                 ps.setString(6,telefono);
                 ps.setString(7,barrio);
                 ps.setInt(8, planId);
                 ps.setInt(9, idPais);
                 ps.setInt(10, idCiudad);
                 ps.setInt(11, idDepartamento);
                 ps.setString(12,documento);
                 
                 
                
                  
                   
                  
                  
                     
                     
                      ps.executeUpdate();
            } catch (SQLException ex) {
                  System.out.println(ex);
            }
        }
    }
    
    
     public static void añadirClientes(Cliente nuevoCliente) throws SQLException{
    Conexion db_connect = new Conexion();
    
    
            
        try(Connection conexion =db_connect.get_connection()) {
              PreparedStatement ps=null;
              try {
                 String query="insert into clientes(documento,nombre,apellido,direccion,planId,telefono,email,idPais,idCiudad,idDepartamento,barrio,idEstado)values(?,?,?,?,?,?,?,?,?,?,?,?)";
                 ps=conexion.prepareStatement(query);
                 ps.setString(1, nuevoCliente.getDocumento());
                 ps.setString(2, nuevoCliente.getNombre());
                 ps.setString(3, nuevoCliente.getApellido());
                 ps.setString(4, nuevoCliente.getDireccion());
                 ps.setInt(5, nuevoCliente.getPlanId());
                 ps.setString(6, nuevoCliente.getTelefono());
                 
                 ps.setString(7, nuevoCliente.getEmail());
                 ps.setInt(8, nuevoCliente.getIdPais());
                  ps.setInt(9, nuevoCliente.getIdCiudad());
                    ps.setInt(10, nuevoCliente.getIdDepartamento());
                  ps.setString(11, nuevoCliente.getBarrio());
                  
                     
                      ps.setInt(12, nuevoCliente.getIdEstado());
                      ps.executeUpdate();
            } catch (SQLException ex) {
                  System.out.println(ex);
            }
              
              
         
    /**
     *
     */
    
        }
     }
}

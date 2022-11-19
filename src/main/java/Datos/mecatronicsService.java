package Datos;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mx.com.gm.jdbc.mecatronics.interfaz.PanelCliente;

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
        public static void leerPaises() throws SQLException{
   
    MecatronicsDAO.leerPaises();
    }
        
         public static void leerDepartamentos(int idPais) throws SQLException{
   
    MecatronicsDAO.leerDepartamentos(idPais);
    }
         public static void leerPlanesPanelModificarClientes() throws SQLException{
   
    MecatronicsDAO.leerPlanesPanelModificarClientes();
    }
      public static void leerCiudadesPanelModificarClientes(int idDepartamento) throws SQLException{
   
    MecatronicsDAO.leerCiudadesPanelModificarClientes(idDepartamento);
    }
        public static void leerPaisesPanelModificarClientes() throws SQLException{
   
    MecatronicsDAO.leerPaisesPanelModificarClientes();
    }
        
         public static void leerDepartamentosPanelModificarClientes(int idPais) throws SQLException{
   
    MecatronicsDAO.leerDepartamentosPanelModificarClientes(idPais);
    }
         
         public static int devoldorIdDepartamentosPorNombre(String departamento){
         
        return MecatronicsDAO.devoldorIdDepartamentosPorNombre(departamento);
         }
         
         public static int devoldorIdPaisesPorNombre(String pais){
         
        return MecatronicsDAO.devoldorIdPaisesPorNombre(pais);
         }
         
          public static int devoldorIdPlan(String plan){
         
        return MecatronicsDAO.devolverIdPlan(plan);
         }
          public static int devoldorIdCiudadesPorNombre(String ciudad){
         
        return MecatronicsDAO.devoldorIdCiudadesPorNombre(ciudad);
         }
          public static Cliente leerClientePorDocumento(String documento){
          
          return MecatronicsDAO.leerClientesPorDocumento(documento);
          }
          
          public static void borrarCliente(){
              DefaultTableModel tm = (DefaultTableModel) PanelCliente.getTabla().getModel();
          String dato=String.valueOf(tm.getValueAt(PanelCliente.getTabla().getSelectedRow(),0));
         
          MecatronicsDAO.borrarClientes(dato);
           JOptionPane.showMessageDialog(null, "Cliente con Documento "+dato + " ha sido eliminado");
          }
          
          public static Cliente leerClienteTabla(){
          DefaultTableModel tm = (DefaultTableModel) PanelCliente.getTabla().getModel();
          String dato=String.valueOf(tm.getValueAt(PanelCliente.getTabla().getSelectedRow(),0));
          return MecatronicsDAO.leerClientesPorDocumento(dato);
          }
          
          public static void modificarClientes(String documento,String documentoNuevo,String nombre,String apellido,String direccion,int planId,String telefono,String email,String barrio,int idPais,int idCiudad,int idDepartamento) throws SQLException{
          MecatronicsDAO.ModificarClientes(documento, documentoNuevo, nombre, apellido, direccion, planId, telefono, email, barrio, idPais, idCiudad, idDepartamento);
          }
          
          public static ArrayList<Factura> leerFacturasPorDocumento(String documento){
          return MecatronicsDAO.leerFacturasPorDocumento(documento);
          
          }
}


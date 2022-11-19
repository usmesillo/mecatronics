/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author Jaime
 */
public class Cliente extends Persona{
    
    String documento,telefono,email,barrio,direccion;
    
    int planId,idDepartamento,idCiudad,idPais,idEstado;

    
    public Cliente(String documento, String telefono, String email, String barrio, String direccion, int planId, int idDepartamento, int idCiudad, int idPais, String nombre, String apellido,int idEstado) {
        super(nombre, apellido);
        this.documento = documento;
        this.telefono = telefono;
        this.email = email;
        this.barrio = barrio;
        this.direccion = direccion;
        this.planId = planId;
        this.idDepartamento = idDepartamento;
        this.idCiudad = idCiudad;
        this.idPais = idPais;
        this.idEstado=idEstado;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

 

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

 



   
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avion;

import java.util.ArrayList;

/**
 *
 * @author Alejo02
 */
public class PersonaCliente {
    
    private String nombre;
    
    private Integer numIdentificacion;
    
    private String fechaNacimiento;
    
    private ArrayList<PersonaCliente> persona;

    public PersonaCliente(String nombre, Integer numIdentificacion, String fechaNacimiento) {
        this.nombre = nombre;
        this.numIdentificacion = numIdentificacion;
        this.fechaNacimiento = fechaNacimiento;
    }

    public PersonaCliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setNumIdentificacion(Integer numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<PersonaCliente> getPersona() {
        return persona;
    }

    public void setPersona(ArrayList<PersonaCliente> persona) {
        this.persona = persona;
    }
    
    
        
}

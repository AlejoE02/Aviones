/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avion;

/**
 *
 * @author Alejo02
 */
public class Silla {
       
    private String tipoSilla;
    
    private int precio;
    
    private boolean estado;
    
    private PersonaCliente persona;

    public Silla( String tipoSilla, int precio, boolean estado) {
        this.tipoSilla = tipoSilla;
        this.precio = precio;
        this.estado = estado;
    }

    public String getTipoSilla() {
        return tipoSilla;
    }

    public void setTipoSilla(String tipoSilla) {
        this.tipoSilla = tipoSilla;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public PersonaCliente getPersona() {
        return persona;
    }

    public void setPersona(PersonaCliente persona) {
        this.persona = persona;
    }
    
    
    
}

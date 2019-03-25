/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Alejo02
 */
public class Avion {
    
    private String destino;
    
    private String tipoAvion;
    
    private boolean estado;
    
    private HashMap<String, Silla> sillas;
    
    public Avion(String destino, String tipoAvion, boolean estado) {
        this.destino = destino;
        this.tipoAvion = tipoAvion;
        sillas=new HashMap<>();
        this.estado = estado;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getTipoAvion() {
        return tipoAvion;
    }

    public void setTipoAvion(String tipoAvion) {
        this.tipoAvion = tipoAvion;
    }

    public HashMap<String, Silla> getSillas() {
        return sillas;
    }

    public void setSillas(HashMap<String, Silla> sillas) {
        this.sillas = sillas;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}

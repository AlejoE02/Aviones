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
public class Avion {
    
    private String destino;
    
    private String tipoAvion;
    
    private final boolean estado;
    
    ArrayList<Silla> sillas;
    
    public Avion(String destino, String tipoAvion) {
        this.destino = destino;
        this.tipoAvion = tipoAvion;
        sillas=new ArrayList<>();
        this.estado=true;
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

    public ArrayList<Silla> getSillas() {
        return sillas;
    }

    public void setSillas(ArrayList<Silla> sillas) {
        this.sillas = sillas;
    }
    
    
    
}

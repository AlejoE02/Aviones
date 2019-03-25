/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avion;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alejo02
 */
public class Inicio {

    Listas listas = new Listas();
    //ArrayList<Avion> avion;
    //ArrayList<PersonaCliente> persona;
    Scanner sc = new Scanner(System.in);
    MenuCompra mc;

    public void Inicio() {
        llenarAviones();
        sillas1();
        sillas2();
        sillas3();
        menuCompra();
    }

    public void menuCompra() {
        mc = new MenuCompra(listas);
        int opcion;
        do {
            System.out.println("FLYUDEC");
            System.out.println("1. Comprar Tiquete");
            System.out.println("2. Finalizar Compras");
            System.out.println("3. Ver Reporte de Ventas");
            System.out.print("Escoja la opción : ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    mc.verAviones(listas.getAvion());
                    break;
                case 2:
                    mc.cerrarVuelo(listas.getAvion());
                    break;
                case 3:
                    mc.reporteVentas(listas.getAvion());
                    break;
            }
        } while (opcion != 0);
    }

    public void llenarAviones() {
        listas.getAvion().add(new Avion("Santa Marta", "Vuelo Comercial", false));
        listas.getAvion().add(new Avion("Medellin", "Vuelo Charter", false));
        listas.getAvion().add(new Avion("Las Vegas", "Vuelo Privado", false));
    }

    public void sillas1() {
        //sillas de Primera clase

        listas.getAvion().get(0).getSillas().put("A1", new Silla("Primera Clase", 700, false));
        listas.getAvion().get(0).getSillas().put("A2", new Silla("Primera Clase", 700, true));

        listas.getAvion().get(0).getSillas().put("B1", new Silla("Primera Clase", 700, true));
        listas.getAvion().get(0).getSillas().put("B2", new Silla("Primera Clase", 700, false));

        listas.getAvion().get(0).getSillas().put("C1", new Silla("Primera Clase", 700, false));
        listas.getAvion().get(0).getSillas().put("C2", new Silla("Primera Clase", 700, false));

        //sillas de clase turista
        listas.getAvion().get(0).getSillas().put("D1", new Silla("Turista", 400, false));
        listas.getAvion().get(0).getSillas().put("D2", new Silla("Turista", 400, false));
        listas.getAvion().get(0).getSillas().put("D3", new Silla("Turista", 400, false));
        listas.getAvion().get(0).getSillas().put("D4", new Silla("Turista", 400, false));

        listas.getAvion().get(0).getSillas().put("E1", new Silla("Turista", 400, false));
        listas.getAvion().get(0).getSillas().put("E2", new Silla("Turista", 400, false));
        listas.getAvion().get(0).getSillas().put("E3", new Silla("Turista", 400, false));
        listas.getAvion().get(0).getSillas().put("E4", new Silla("Turista", 400, false));

        listas.getAvion().get(0).getSillas().put("F1", new Silla("Turista", 400, false));
        listas.getAvion().get(0).getSillas().put("F2", new Silla("Turista", 400, false));
        listas.getAvion().get(0).getSillas().put("F3", new Silla("Turista", 400, false));
        listas.getAvion().get(0).getSillas().put("F4", new Silla("Turista", 400, false));

        listas.getAvion().get(0).getSillas().put("G1", new Silla("Turista", 400, false));
        listas.getAvion().get(0).getSillas().put("G2", new Silla("Turista", 400, false));
        listas.getAvion().get(0).getSillas().put("G3", new Silla("Turista", 400, false));
        listas.getAvion().get(0).getSillas().put("G4", new Silla("Turista", 400, false));

        listas.getAvion().get(0).getSillas().put("H1", new Silla("Turista", 400, false));
        listas.getAvion().get(0).getSillas().put("H2", new Silla("Turista", 400, false));
        listas.getAvion().get(0).getSillas().put("H3", new Silla("Turista", 400, false));
        listas.getAvion().get(0).getSillas().put("H4", new Silla("Turista", 400, false));

        listas.getAvion().get(0).getSillas().put("I1", new Silla("Turista", 400, false));
        listas.getAvion().get(0).getSillas().put("I2", new Silla("Turista", 400, false));
        listas.getAvion().get(0).getSillas().put("I3", new Silla("Turista", 400, false));
        listas.getAvion().get(0).getSillas().put("I4", new Silla("Turista", 400, false));

        listas.getAvion().get(0).getSillas().put("J1", new Silla("Turista", 400, false));
        listas.getAvion().get(0).getSillas().put("J2", new Silla("Turista", 400, false));
        listas.getAvion().get(0).getSillas().put("J3", new Silla("Turista", 400, false));
        listas.getAvion().get(0).getSillas().put("J4", new Silla("Turista", 400, false));
    }
    
    
    public void sillas2(){
        
        listas.getAvion().get(1).getSillas().put("A1", new Silla("Turista", 400, false));
        listas.getAvion().get(1).getSillas().put("A2", new Silla("Turista", 400, false));
        listas.getAvion().get(1).getSillas().put("A3", new Silla("Turista", 400, false));
        listas.getAvion().get(1).getSillas().put("A4", new Silla("Turista", 400, false));
        
        listas.getAvion().get(1).getSillas().put("B1", new Silla("Turista", 400, false));
        listas.getAvion().get(1).getSillas().put("B2", new Silla("Turista", 400, false));
        listas.getAvion().get(1).getSillas().put("B3", new Silla("Turista", 400, false));
        listas.getAvion().get(1).getSillas().put("B4", new Silla("Turista", 400, false));
        
        listas.getAvion().get(1).getSillas().put("C1", new Silla("Turista", 400, false));
        listas.getAvion().get(1).getSillas().put("C2", new Silla("Turista", 400, false));
        listas.getAvion().get(1).getSillas().put("C3", new Silla("Turista", 400, false));
        listas.getAvion().get(1).getSillas().put("C4", new Silla("Turista", 400, false));
        
        listas.getAvion().get(1).getSillas().put("D1", new Silla("Turista", 400, false));
        listas.getAvion().get(1).getSillas().put("D2", new Silla("Turista", 400, false));
        listas.getAvion().get(1).getSillas().put("D3", new Silla("Turista", 400, false));
        listas.getAvion().get(1).getSillas().put("D4", new Silla("Turista", 400, false));

        listas.getAvion().get(1).getSillas().put("E1", new Silla("Turista", 400, false));
        listas.getAvion().get(1).getSillas().put("E2", new Silla("Turista", 400, false));
        listas.getAvion().get(1).getSillas().put("E3", new Silla("Turista", 400, false));
        listas.getAvion().get(1).getSillas().put("E4", new Silla("Turista", 400, false));

        listas.getAvion().get(1).getSillas().put("F1", new Silla("Turista", 400, false));
        listas.getAvion().get(1).getSillas().put("F2", new Silla("Turista", 400, false));
        listas.getAvion().get(1).getSillas().put("F3", new Silla("Turista", 400, false));
        listas.getAvion().get(1).getSillas().put("F4", new Silla("Turista", 400, false));

        listas.getAvion().get(1).getSillas().put("G1", new Silla("Turista", 400, false));
        listas.getAvion().get(1).getSillas().put("G2", new Silla("Turista", 400, false));
        listas.getAvion().get(1).getSillas().put("G3", new Silla("Turista", 400, false));
        listas.getAvion().get(1).getSillas().put("G4", new Silla("Turista", 400, false));
        
        listas.getAvion().get(1).getSillas().put("H1", new Silla("Turista", 400, false));
        listas.getAvion().get(1).getSillas().put("H2", new Silla("Turista", 400, false));
        listas.getAvion().get(1).getSillas().put("H3", new Silla("Turista", 400, false));
        listas.getAvion().get(1).getSillas().put("H4", new Silla("Turista", 400, false));
        
        listas.getAvion().get(1).getSillas().put("I1", new Silla("Turista", 400, false));
        listas.getAvion().get(1).getSillas().put("I2", new Silla("Turista", 400, false));
        listas.getAvion().get(1).getSillas().put("I3", new Silla("Turista", 400, false));
        listas.getAvion().get(1).getSillas().put("I4", new Silla("Turista", 400, false));

        listas.getAvion().get(1).getSillas().put("J1", new Silla("Turista", 400, false));
        listas.getAvion().get(1).getSillas().put("J2", new Silla("Turista", 400, false));
        listas.getAvion().get(1).getSillas().put("J3", new Silla("Turista", 400, false));
        listas.getAvion().get(1).getSillas().put("J4", new Silla("Turista", 400, false));
    }

    public void sillas3() {
        //sillas para el jet
        listas.getAvion().get(2).getSillas().put("A1", new Silla("Primera Clase", 1000, false));
        listas.getAvion().get(2).getSillas().put("A2", new Silla("Primera Clase", 1000, false));

        listas.getAvion().get(2).getSillas().put("B1", new Silla("Primera Clase", 1000, false));
        listas.getAvion().get(2).getSillas().put("B2", new Silla("Primera Clase", 1000, false));

        listas.getAvion().get(2).getSillas().put("C1", new Silla("Primera Clase", 1000, false));
        listas.getAvion().get(2).getSillas().put("C2", new Silla("Primera Clase", 1000, false));
        
        listas.getAvion().get(2).getSillas().put("D1", new Silla("Primera Clase", 1000, false));
        listas.getAvion().get(2).getSillas().put("D2", new Silla("Primera Clase", 1000, false));
    }
}

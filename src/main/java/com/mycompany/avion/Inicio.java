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

    PersonaCliente cliente;
    ArrayList<Avion> avion;
    ArrayList<PersonaCliente> persona;
    Scanner sc = new Scanner(System.in);

    public void Inicio() {
        avion = new ArrayList<>();
        llenarAviones();
        sillas1();
        sillas2();
    }

    public void llenarAviones() {
        avion.add(new Avion("Santa Marta", "Avion Comercial"));
        avion.add(new Avion("Medellin", "Avion Comercial"));
        avion.add(new Avion("Las Vegas", "Jet Privado"));
    }

    public ArrayList<PersonaCliente> agregarCliente() {

        System.out.print("Digite el nombre del cliente : ");
        String nombre = sc.next();
        System.out.print("Digite el número de identificación del cliente : ");
        Integer cc = sc.nextInt();
        System.out.print("Introduzca la fecha de nacimiento con formato dd/mm/yyyy : ");
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = sc.next();
        Date testDate = null;
        String date = fecha;
        try {
            testDate = df.parse(date);
            cliente = new PersonaCliente(nombre, cc, fecha);
            persona.add(cliente);
            return persona;
        } catch (Exception e) {
            System.out.println("formato invalido");
            return persona;
        }
        
    }

    public void sillas1() {
        //sillas de Primera clase 
        avion.get(0).getSillas().add(new Silla('A', 1, "Primera Clase", 400, false));
        avion.get(0).getSillas().add(new Silla('B', 1, "Primera Clase", 400, false));
        avion.get(0).getSillas().add(new Silla('A', 2, "Primera Clase", 400, false));
        avion.get(0).getSillas().add(new Silla('B', 2, "Primera Clase", 400, false));
        //sillas de clase turista
        avion.get(0).getSillas().add(new Silla('A', 4, "Turismo", 400, false));
        avion.get(0).getSillas().add(new Silla('B', 4, "Turismo", 400, false));
        avion.get(0).getSillas().add(new Silla('C', 5, "Turismo", 400, false));
        avion.get(0).getSillas().add(new Silla('D', 5, "Turismo", 400, false));
        avion.get(0).getSillas().add(new Silla('C', 6, "Turismo", 400, false));
        avion.get(0).getSillas().add(new Silla('D', 6, "Turismo", 400, false));
        avion.get(0).getSillas().add(new Silla('C', 7, "Turismo", 400, false));
        avion.get(0).getSillas().add(new Silla('D', 7, "Turismo", 400, false));
        avion.get(0).getSillas().add(new Silla('C', 8, "Turismo", 400, false));
        avion.get(0).getSillas().add(new Silla('D', 8, "Turismo", 400, false));
        avion.get(0).getSillas().add(new Silla('C', 9, "Turismo", 400, false));
        avion.get(0).getSillas().add(new Silla('D', 9, "Turismo", 400, false));
        avion.get(0).getSillas().add(new Silla('C', 10, "Turismo", 400, false));
        avion.get(0).getSillas().add(new Silla('D', 10, "Turismo", 400, false));
        avion.get(0).getSillas().add(new Silla('C', 11, "Turismo", 400, false));
        avion.get(0).getSillas().add(new Silla('D', 11, "Turismo", 400, false));
        avion.get(0).getSillas().add(new Silla('C', 12, "Turismo", 400, false));
        avion.get(0).getSillas().add(new Silla('D', 12, "Turismo", 400, false));
    }

    public void sillas2() {
        //sillas para el jet
        avion.get(0).getSillas().add(new Silla('A', 1, "Primera Clase", 400, false));
        avion.get(0).getSillas().add(new Silla('B', 1, "Primera Clase", 400, false));
        avion.get(0).getSillas().add(new Silla('A', 2, "Primera Clase", 400, false));
        avion.get(0).getSillas().add(new Silla('B', 2, "Primera Clase", 400, false));
        avion.get(0).getSillas().add(new Silla('A', 3, "Primera Clase", 400, false));
        avion.get(0).getSillas().add(new Silla('B', 3, "Primera Clase", 400, false));
    }
}

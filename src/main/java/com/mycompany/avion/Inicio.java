/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avion;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Alejo02
 */
public class Inicio {

    public Inicio() {
    }

    PersonaCliente cliente;

    public PersonaCliente agregarCliente() {
        Scanner sc = new Scanner(System.in);
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
            System.out.println("Fecha creada correctamente");
        } catch (Exception e) {
            System.out.println("formato invalido");
        }

        cliente = new PersonaCliente(nombre, cc, fecha);
        System.out.print("Cliente : " + cliente.getNombre()
                + "\nIdentificación : " + cliente.getNumIdentificacion()
                + "\nFecha de Nacimiento : " + cliente.getFechaNacimiento());
        return cliente;
    }
}

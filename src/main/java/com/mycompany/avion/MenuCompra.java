/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avion;

import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Alejo02
 */
public class MenuCompra {

    Scanner sc = new Scanner(System.in);
    Listas listas;

    public MenuCompra(Listas listas) {
        this.listas = listas;
    }

    public MenuCompra() {
    }

    public void verAviones(ArrayList<Avion> avion) {
        String opcion;
        for (int i = 0; i < avion.size(); i++) {
            if (avion.get(i).isEstado() == false) {
                System.out.println(i + "." + " Destino : " + avion.get(i).getDestino() + ", " + " Tipo : "
                        + avion.get(i).getTipoAvion());
            }
        }
        System.out.println("3. Cancelar");
        System.out.print("Escoja la opcion : ");
        opcion = sc.next();
        switch (opcion) {
            case "0":
                System.out.println("\033[32mD = " + "\033[32mDisponible"
                        + "\n\033[31mX = "+ "\033[31mOcupado");
                pintarSillasGrande(avion.get(0).getSillas());
                break;
            case "1":
                System.out.println("\033[32mD = " + "\033[32mDisponible"
                        + "\033[31mX = "+ "\033[31mOcupado");
                pintarSillasMediano(avion.get(1).getSillas());
                break;
            case "2":
                System.out.println("\033[32mD = " + "\033[32mDisponible"
                        + "\033[31mX = "+ "\033[31mOcupado");
                pintarSillasJet(avion.get(2).getSillas());
                break;
            case "3":
                break;
            default:
                System.out.println("!Opcion no Valida¡");
                break;
        }

    }

    public void pintarSillasGrande(HashMap<String, Silla> mapaSillas) {
        System.out.println("\033[34m                              ***");
        System.out.println("\033[34m                             *****");
        System.out.println("\033[34m                            *******");
        System.out.println("\033[34m                           *********");
        System.out.println("\033[34m                          ***********");
        System.out.println("\033[34m                         *************");
        System.out.println("\033[34m                        ****************");
        System.out.println("\033[34m                       ******************");
        System.out.println("\033[34m                      *                  *");
        System.out.println("\033[34m                      *    " + pintarSilla(mapaSillas.get("A1").isEstado(), "A1") + "     " + pintarSilla(mapaSillas.get("A2").isEstado(), "A2") + "\033[34m   *");
        System.out.println("\033[34m                      *    " + pintarSilla(mapaSillas.get("B1").isEstado(), "B1") + "     " + pintarSilla(mapaSillas.get("B2").isEstado(), "B2") + "\033[34m   *");
        System.out.println("\033[34m                      *    " + pintarSilla(mapaSillas.get("C1").isEstado(), "C1") + "     " + pintarSilla(mapaSillas.get("C2").isEstado(), "C2") + "\033[34m   *");
        System.out.println("\033[34m               ********                  ********");
        System.out.println("\033[34m         **************                  **************");
        System.out.println("\033[34m     ******************  " + pintarSilla(mapaSillas.get("D1").isEstado(), "D1") + pintarSilla(mapaSillas.get("D2").isEstado(), "D2") + "  "
                + pintarSilla(mapaSillas.get("D3").isEstado(), "D3") + pintarSilla(mapaSillas.get("D4").isEstado(), "D4") + "\033[34m  ******************");
        System.out.println("\033[34m***********************  " + pintarSilla(mapaSillas.get("E1").isEstado(), "E1") + pintarSilla(mapaSillas.get("E2").isEstado(), "E2") + "  "
                + pintarSilla(mapaSillas.get("E3").isEstado(), "E3") + pintarSilla(mapaSillas.get("E4").isEstado(), "E4") + "\033[34m  ***********************");
        System.out.println("\033[34m         ******       *  " + pintarSilla(mapaSillas.get("F1").isEstado(), "F1") + pintarSilla(mapaSillas.get("F2").isEstado(), "F2") + "  "
                + pintarSilla(mapaSillas.get("F3").isEstado(), "F3") + pintarSilla(mapaSillas.get("F4").isEstado(), "F4") + "\033[34m  *        ******     ");
        System.out.println("\033[34m          ****        *  " + pintarSilla(mapaSillas.get("G1").isEstado(), "G1") + pintarSilla(mapaSillas.get("G2").isEstado(), "G2") + "  "
                + pintarSilla(mapaSillas.get("G3").isEstado(), "G3") + pintarSilla(mapaSillas.get("G4").isEstado(), "G4") + "\033[34m  *         ****      ");
        System.out.println("\033[34m           **         *  " + pintarSilla(mapaSillas.get("H1").isEstado(), "H1") + pintarSilla(mapaSillas.get("H2").isEstado(), "H2") + "  "
                + pintarSilla(mapaSillas.get("H3").isEstado(), "H3") + pintarSilla(mapaSillas.get("H4").isEstado(), "H4") + "\033[34m  *          **       ");
        System.out.println("\033[34m                      *  " + pintarSilla(mapaSillas.get("I1").isEstado(), "I1") + pintarSilla(mapaSillas.get("I2").isEstado(), "I2") + "  "
                + pintarSilla(mapaSillas.get("I3").isEstado(), "I3") + pintarSilla(mapaSillas.get("I4").isEstado(), "I4") + "\033[34m  *");
        System.out.println("\033[34m                      *  " + pintarSilla(mapaSillas.get("J1").isEstado(), "J1") + pintarSilla(mapaSillas.get("J2").isEstado(), "J2") + "  "
                + pintarSilla(mapaSillas.get("J3").isEstado(), "J3") + pintarSilla(mapaSillas.get("J4").isEstado(), "J4") + "\033[34m  *");
        System.out.println("\033[34m                      *                  *");
        System.out.println("\033[34m                       ******************");
        System.out.println("\033[34m                        ***************");
        System.out.println("\033[34m                         *************");
        System.out.println("\033[34m                         *************");
        System.out.println("\033[34m                        ***************");
        System.out.println("\033[34m                       *****************");
        System.out.println("\033[34m                      *******************");
        System.out.println("\033[34m                     *********************");
        System.out.println("\033[30m");

        String silla;
        System.out.print("Escoja la silla que desea reservear : ");
        silla = sc.next().toUpperCase();
        validarSilla(mapaSillas, silla);

    }

    public void pintarSillasMediano(HashMap<String, Silla> mapaSillas) {
        System.out.println("\033[34m                              ***");
        System.out.println("\033[34m                             *****");
        System.out.println("\033[34m                            *******");
        System.out.println("\033[34m                           *********");
        System.out.println("\033[34m                          ***********");
        System.out.println("\033[34m                         *************");
        System.out.println("\033[34m                        ****************");
        System.out.println("\033[34m                       ******************");
        System.out.println("\033[34m                      *                  *");
        System.out.println("\033[34m                      *  " + pintarSilla(mapaSillas.get("A1").isEstado(), "A1") + pintarSilla(mapaSillas.get("A2").isEstado(), "A2") + "  "
                + pintarSilla(mapaSillas.get("A3").isEstado(), "A3") + pintarSilla(mapaSillas.get("A4").isEstado(), "A4") + "\033[34m  *");
        System.out.println("\033[34m                      *  " + pintarSilla(mapaSillas.get("B1").isEstado(), "B1") + pintarSilla(mapaSillas.get("B2").isEstado(), "B2") + "  "
                + pintarSilla(mapaSillas.get("B3").isEstado(), "B3") + pintarSilla(mapaSillas.get("B4").isEstado(), "B4") + "\033[34m  *");
        System.out.println("\033[34m                      *  " + pintarSilla(mapaSillas.get("C1").isEstado(), "C1") + pintarSilla(mapaSillas.get("C2").isEstado(), "C2") + "  "
                + pintarSilla(mapaSillas.get("C3").isEstado(), "C3") + pintarSilla(mapaSillas.get("C4").isEstado(), "C4") + "\033[34m  *");
        System.out.println("\033[34m               ********  " + pintarSilla(mapaSillas.get("D1").isEstado(), "D1") + pintarSilla(mapaSillas.get("D2").isEstado(), "D2") + "  "
                + pintarSilla(mapaSillas.get("D3").isEstado(), "D3") + pintarSilla(mapaSillas.get("D4").isEstado(), "D4") + "\033[34m  ********");
        System.out.println("\033[34m         **************  " + pintarSilla(mapaSillas.get("E1").isEstado(), "E1") + pintarSilla(mapaSillas.get("E2").isEstado(), "E2") + "  "
                + pintarSilla(mapaSillas.get("E3").isEstado(), "E3") + pintarSilla(mapaSillas.get("E4").isEstado(), "E4") + "\033[34m  **************");
        System.out.println("\033[34m     ******************  " + pintarSilla(mapaSillas.get("F1").isEstado(), "F1") + pintarSilla(mapaSillas.get("F2").isEstado(), "F2") + "  "
                + pintarSilla(mapaSillas.get("F3").isEstado(), "F3") + pintarSilla(mapaSillas.get("F4").isEstado(), "F4") + "\033[34m  ******************");
        System.out.println("\033[34m***********************  " + pintarSilla(mapaSillas.get("G1").isEstado(), "G1") + pintarSilla(mapaSillas.get("G2").isEstado(), "G2") + "  "
                + pintarSilla(mapaSillas.get("G3").isEstado(), "G3") + pintarSilla(mapaSillas.get("G4").isEstado(), "G4") + "\033[34m  ***********************");
        System.out.println("\033[34m        ******        *  " + pintarSilla(mapaSillas.get("H1").isEstado(), "H1") + pintarSilla(mapaSillas.get("H2").isEstado(), "H2") + "  "
                + pintarSilla(mapaSillas.get("H3").isEstado(), "H3") + pintarSilla(mapaSillas.get("H4").isEstado(), "H4") + "\033[34m  *        ******     ");
        System.out.println("\033[34m         ****         *  " + pintarSilla(mapaSillas.get("I1").isEstado(), "I1") + pintarSilla(mapaSillas.get("I2").isEstado(), "I2") + "  "
                + pintarSilla(mapaSillas.get("I3").isEstado(), "I3") + pintarSilla(mapaSillas.get("I4").isEstado(), "I4") + "\033[34m  *         ****      ");
        System.out.println("\033[34m          **          *  " + pintarSilla(mapaSillas.get("J1").isEstado(), "J1") + pintarSilla(mapaSillas.get("J2").isEstado(), "J2") + "  "
                + pintarSilla(mapaSillas.get("J3").isEstado(), "J3") + pintarSilla(mapaSillas.get("J4").isEstado(), "J4") + "\033[34m  *          **       ");
        System.out.println("\033[34m                      *                  *");
        System.out.println("\033[34m                       ******************");
        System.out.println("\033[34m                        ***************");
        System.out.println("\033[34m                         *************");
        System.out.println("\033[34m                         *************");
        System.out.println("\033[34m                        ***************");
        System.out.println("\033[34m                       *****************");
        System.out.println("\033[34m                      *******************");
        System.out.println("\033[34m                     *********************");
        System.out.println("\033[30m");

        String silla;
        System.out.print("Escoja la silla que desea reservear : ");
        silla = sc.next().toUpperCase();
        validarSilla(mapaSillas, silla);
    }

    public void pintarSillasJet(HashMap<String, Silla> mapaSillas) {
        System.out.println("\033[34m                              ***");
        System.out.println("\033[34m                             *****");
        System.out.println("\033[34m                            *******");
        System.out.println("\033[34m                           *********");
        System.out.println("\033[34m                          ***********");
        System.out.println("\033[34m                         *************");
        System.out.println("\033[34m                        ****************");
        System.out.println("\033[34m                       ******************");
        System.out.println("\033[34m                      *                  *");
        System.out.println("\033[34m                      *                  *");
        System.out.println("\033[34m                      *                  *");
        System.out.println("\033[34m               ********  " + pintarSilla(mapaSillas.get("A1").isEstado(), "A1") + "        " + pintarSilla(mapaSillas.get("A2").isEstado(), "A2") + "\033[34m  ********");
        System.out.println("\033[34m         **************  " + pintarSilla(mapaSillas.get("B1").isEstado(), "B1") + "        " + pintarSilla(mapaSillas.get("B2").isEstado(), "B2") + "\033[34m  **************");
        System.out.println("\033[34m     ******************  " + pintarSilla(mapaSillas.get("C1").isEstado(), "C1") + "        " + pintarSilla(mapaSillas.get("C2").isEstado(), "C2") + "\033[34m  ******************");
        System.out.println("\033[34m***********************  " + pintarSilla(mapaSillas.get("D1").isEstado(), "D1") + "        " + pintarSilla(mapaSillas.get("D2").isEstado(), "D2") + "\033[34m  ***********************");
        System.out.println("\033[34m         ******       *                  *       ******      ");
        System.out.println("\033[34m          ****        *                  *        ****       ");
        System.out.println("\033[34m           **         *                  *         **        ");
        System.out.println("\033[34m                       ******************");
        System.out.println("\033[34m                        ***************");
        System.out.println("\033[34m                         *************");
        System.out.println("\033[34m                         *************");
        System.out.println("\033[34m                        ***************");
        System.out.println("\033[34m                       *****************");
        System.out.println("\033[34m                      *******************");
        System.out.println("\033[34m                     *********************");
        System.out.println("\033[30m");

        String silla;
        System.out.print("Escoja la silla que desea reservear : ");
        silla = sc.next().toUpperCase();
        validarSilla(mapaSillas, silla);
    }

    public String pintarSilla(boolean estado, String id) {

        String estadoColor;

        if (estado == false) {
            //              Negro +     Verda       + Negro
            estadoColor = "\033[30m" + id + "\033[32mD" + "\033[30m";
        } else {
            //              Negro +     Rojo       + Negro
            estadoColor = "\033[30m" + id + "\033[31mX" + "\033[30m";
        }

        return estadoColor;
    }

    public PersonaCliente agregarCliente() {
        PersonaCliente cliente = new PersonaCliente();
        boolean seguir = true;
        System.out.print("Digite el nombre del cliente : ");
        String nombre = sc.next().toUpperCase();
        cliente.setNombre(nombre);
        while (seguir == true) {
            try {
                System.out.print("Digite el número de identificación del cliente : ");
                String numero = sc.next();
                int cc;
                cc = Integer.parseInt(numero);
                cliente.setNumIdentificacion(cc);
                seguir = false;
            } catch (NumberFormatException e) {
                System.out.println("No es una identificación valida");
                seguir = true;
            }
        }
        boolean seguir2 = true;
        while (seguir2 == true) {
            try {
                System.out.print("Introduzca la fecha de nacimiento con formato dd/mm/yyyy : ");
                SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                String fecha = sc.next();
                Date testDate = null;
                String date = fecha;
                testDate = df.parse(date);
                cliente.setFechaNacimiento(fecha);
                seguir2 = false;
            } catch (Exception e) {
                System.out.println("formato invalido");
                seguir2 = true;
            }
        }

        return cliente;
    }

    public boolean validarSilla(HashMap<String, Silla> mapaSilla, String datoSilla) {
        boolean ocupado = false;

        if (mapaSilla.containsKey(datoSilla)) {
            if (mapaSilla.get(datoSilla).isEstado()) {
                System.out.println("La silla ya esta asignada, intente nuevamente");
            } else {
                System.out.println("Silla disponible");
                System.out.println("Valor de la silla : " + mapaSilla.get(datoSilla).getPrecio() + " USD");
                System.out.println("Desea reservar la silla"
                        + "\n1. Si"
                        + "\n2. No");
                System.out.print("Escoja la opcion : ");
                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        mapaSilla.get(datoSilla).setPersona(agregarCliente());
                        mapaSilla.get(datoSilla).setEstado(true);
                        System.out.println(mapaSilla.get(datoSilla).getPersona().getNombre()
                                + ", " + "Silla reservada Exitosamente");
                        break;
                    case 2:
                        break;
                    default:
                        System.out.println("!Opcion no valida¡");
                        break;

                }
            }
        }

        return ocupado;
    }

    public void cerrarVuelo(ArrayList<Avion> avion) {
        String opcion;
        for (int i = 0; i < avion.size(); i++) {
            if (avion.get(i).isEstado() == false) {
                System.out.println(i + "." + " Destino : " + avion.get(i).getDestino() + ", " + " Tipo : "
                        + avion.get(i).getTipoAvion());
            }
        }
        System.out.println("3. Cancelar");
        System.out.print("Seleccione el avion que desea cerrar : ");
        opcion = sc.next();
        switch (opcion) {
            case "0":
                avion.get(0).setEstado(true);
                System.out.println("Vuelo cerrado Exitosamente");
                break;
            case "1":
                avion.get(1).setEstado(true);
                System.out.println("Vuelo cerrado Exitosamente");
                break;
            case "2":
                avion.get(2).setEstado(true);
                System.out.println("Vuelo cerrado Exitosamente");
                break;
            case "3":
                break;
            default:
                System.out.println("!Opcion no Valida¡");
                break;
        }
    }

    public void reporteVentas(ArrayList<Avion> avion) {
        for (int i = 0; i < avion.size(); i++) {
            int sumatoria = 0;
            if (avion.get(i).isEstado() == true) {
                for (String iterador1 : avion.get(i).getSillas().keySet()) {
                    if (avion.get(i).getSillas().get(iterador1).isEstado() == true) {
                        sumatoria = sumatoria + avion.get(i).getSillas().get(iterador1).getPrecio();
                    } else {
                        sumatoria = sumatoria + 0;
                    }
                }
                System.out.println(avion.get(i).getTipoAvion() + " " + sumatoria + " USD");
            }
        }
    }

}

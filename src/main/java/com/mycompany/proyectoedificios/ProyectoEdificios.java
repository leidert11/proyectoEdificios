/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoedificios;

/**
 *
 * @author user
 */
public class ProyectoEdificios {

    public static void main(String[] args) {
        String[] nombresPisosZenith = {"parqueadero motos ", "recepcion y cafeteria","parqueadero carros 1","parqueadero carros 2" ,"majorel","vacio","campus","vacio","cafetería 2"};
        Torre torreZenith = new Torre(9, "blanco verde y marrón", "acero y concreto", "torre zenith", nombresPisosZenith);

        String[] nombresPisosBaichala = { "entrada principal", "majorel", "majorel 2", "majorel 3", "archivo", "area ejecutiva", "area administrativa", "terraza"};
        Torre torreBaichala = new Torre(8, "blanco verde marrón y gris", "vidrio y metal", "torre baichala", nombresPisosBaichala);

        Edificio edificio1 = torreZenith;
        Edificio edificio2 = torreBaichala;

        System.out.println("el nombre del edificio 1 es: " + edificio1.getNombre());
        System.out.println("el color del edificio 1 es: " + edificio1.getColor());
        System.out.println("el área del edificio 1 es: " + edificio1.calcularArea());
        System.out.println(" ");
        System.out.println("el nombre del edificio 2 es: " + edificio2.getNombre());
        System.out.println("el color del edificio 2 es: " + edificio2.getColor());
        System.out.println("el área del edificio 2 es: " + edificio2.calcularArea());
        System.out.println(" ");


        for (int i = 0; i < torreZenith.getPisos(); i++) {
            System.out.println("Nombre del piso " + i + ": " + torreZenith.getNombrePiso(i));
        }
        System.out.println(" ");

        for (int i = 0; i < torreZenith.getPisos(); i++) {
            System.out.println("Nombre del piso " + i + ": " + torreBaichala.getNombrePiso(i));
        }
    }
}
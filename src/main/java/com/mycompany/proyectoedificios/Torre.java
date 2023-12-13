/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoedificios;

/**
 *
 * @author user
 */
public class Torre extends Edificio {

    private String[] nombresPisos;

    public Torre(int pisos, String color, String material, String nombre, String[] nombresPisos) {
        super(pisos, color, material, nombre);
        this.nombresPisos = nombresPisos;
    }

    public String[] getNombresPisos() {
        return this.nombresPisos;
    }

    public void setNombresPisos(String[] nombresPisos) {
        this.nombresPisos = nombresPisos;
    }

    public String getNombrePiso(int piso) {
        if (piso >= 0 && piso < this.getPisos()) {
            return this.nombresPisos[piso];
        } else {
            System.out.println("El piso no existe");
            return null;
        }
    }

    public double calcularArea() {
        return this.getPisos() * 100;
    }
}

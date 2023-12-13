/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoedificios;

/**
 *
 * @author user
 */
public abstract class Edificio {

    private int pisos; 
    private String color; 
    private String material; 
    private String nombre; 

    public Edificio(int pisos, String color, String material, String nombre) {
        this.pisos = pisos;
        this.color = color;
        this.material = material;
        this.nombre = nombre;
    }

    public int getPisos() {
        return this.pisos;
    }

    public void setPisos(int pisos) {
        if (pisos > 0) {
            this.pisos = pisos;
        } else {
            System.out.println("El numero de pisos debe ser positivo");
        }
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();
}

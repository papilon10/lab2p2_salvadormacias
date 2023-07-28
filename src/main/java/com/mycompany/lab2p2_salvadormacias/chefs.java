/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2p2_salvadormacias;

/**
 *
 * @author papilon10
 */
public class chefs {
    String nombre;
    int edad;
    String turno;
    int numero_estrellas;
    double sueldo;

    public chefs() {
    }

    public chefs(String nombre, int edad, String turno, int numero_estrellas, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.turno = turno;
        this.numero_estrellas = numero_estrellas;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getNumero_estrellas() {
        return numero_estrellas;
    }

    public void setNumero_estrellas(int numero_estrellas) {
        this.numero_estrellas = numero_estrellas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "chefs{" + "nombre=" + nombre + ", edad=" + edad + ", turno=" + turno + ", numero_estrellas=" + numero_estrellas + ", sueldo=" + sueldo + '}';
    }
    
    
    
}

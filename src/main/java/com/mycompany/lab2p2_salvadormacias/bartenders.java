/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2p2_salvadormacias;

/**
 *
 * @author papilon10
 */
public class bartenders {
     
    String nombre;
    int edad;
    String turno;
    double sueldo;
    int numero_licores;
    
    public bartenders(){
}

    public bartenders(String nombre, int edad, String turno, double sueldo, int numero_licores) {
        this.nombre = nombre;
        this.edad = edad;
        this.turno = turno;
        this.sueldo = sueldo;
        this.numero_licores = numero_licores;
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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getNumero_licores() {
        return numero_licores;
    }

    public void setNumero_licores(int numero_licores) {
        this.numero_licores = numero_licores;
    }

    @Override
    public String toString() {
        return "bartenders{" + "nombre=" + nombre + ", edad=" + edad + ", turno=" + turno + ", sueldo=" + sueldo + ", numero_licores=" + numero_licores + '}';
    }
    
    
}




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2p2_salvadormacias;

/**
 *
 * @author papilon10
 */
public class meseros {

    String nombre;
    int edad;
    String turno;
    double sueldo;
    double propina;

    public meseros() {
    }

    public meseros(String nombre, int edad, String turno, double sueldo, double propina) {
        this.nombre = nombre;
        this.edad = edad;
        this.turno = turno;
        this.sueldo = sueldo;
        this.propina = propina;
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

    public double getPropina() {
        return propina;
    }

    public void setPropina(double propina) {
        this.propina = propina;
    }

    @Override
    public String toString() {
        return "meseros{" + "nombre=" + nombre + ", edad=" + edad + ", turno=" + turno + ", sueldo=" + sueldo + ", propina=" + propina + '}';
    }

    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2p2_salvadormacias;

/**
 *
 * @author papilon10
 */
public class mesas {

int numero_platos;
int numero_utensilios;
double precio_total;

    public mesas() {
    }

    public mesas(int numero_platos, int numero_utensilios, double precio_total) {
        this.numero_platos = numero_platos;
        this.numero_utensilios = numero_utensilios;
        this.precio_total = precio_total;
    }

    public int getNumero_platos() {
        return numero_platos;
    }

    public void setNumero_platos(int numero_platos) {
        this.numero_platos = numero_platos;
    }

    public int getNumero_utensilios() {
        return numero_utensilios;
    }

    public void setNumero_utensilios(int numero_utensilios) {
        this.numero_utensilios = numero_utensilios;
    }

    public double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(double precio_total) {
        this.precio_total = precio_total;
    }

    @Override
    public String toString() {
        return "mesas{" + "numero_platos=" + numero_platos + ", numero_utensilios=" + numero_utensilios + ", precio_total=" + precio_total + '}';
    }


    
}


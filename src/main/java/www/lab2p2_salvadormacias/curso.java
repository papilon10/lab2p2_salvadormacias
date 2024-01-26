/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.lab2p2_salvadormacias;

/**
 *
 * @author Apple
 */
public class curso {

    String titulo;
    String instructor;
    int semanas;
    String plataforma;

    public curso() {
    }

    public curso(String titulo, String instructor, int semanas, String plataforma) {
        this.titulo = titulo;
        this.instructor = instructor;
        this.semanas = semanas;
        this.plataforma = plataforma;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getSemanas() {
        return semanas;
    }

    public void setSemanas(int semanas) {
        this.semanas = semanas;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "curso{" + "titulo=" + titulo + ", instructor=" + instructor + ", semanas=" + semanas + ", plataforma=" + plataforma + '}';
    }

}

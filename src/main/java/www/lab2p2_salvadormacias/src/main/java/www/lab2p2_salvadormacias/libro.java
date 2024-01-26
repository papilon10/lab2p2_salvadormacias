/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.lab2p2_salvadormacias;

import java.util.Date;

/**
 *
 * @author Apple
 */
public class libro {

    String titulo;
    String autor;
    String género;
    Date publicacion;
    String disponibilidad;

    public libro() {
    }

    public libro(String titulo, String autor, String género, Date publicacion, String disponibilidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.género = género;
        this.publicacion = publicacion;
        this.disponibilidad = disponibilidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGénero() {
        return género;
    }

    public void setGénero(String género) {
        this.género = género;
    }

    public Date getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Date publicacion) {
        this.publicacion = publicacion;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "libro{" + "titulo=" + titulo + ", autor=" + autor + ", g\u00e9nero=" + género + ", publicacion=" + publicacion + ", disponibilidad=" + disponibilidad + '}';
    }

}

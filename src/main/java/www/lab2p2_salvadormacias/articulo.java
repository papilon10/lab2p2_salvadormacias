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
public class articulo {

    String titulo;
    String autor;
    String tema;
    Date publicacion;
    boolean acceso;

    public articulo() {
    }

    public articulo(String titulo, String autor, String tema, Date publicacion, boolean acceso) {
        this.titulo = titulo;
        this.autor = autor;
        this.tema = tema;
        this.publicacion = publicacion;
        this.acceso = acceso;
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

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Date getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Date publicacion) {
        this.publicacion = publicacion;
    }

    public boolean isAcceso() {
        return acceso;
    }

    public void setAcceso(boolean acceso) {
        this.acceso = acceso;
    }

    @Override
    public String toString() {
        return "articulo{" + "titulo=" + titulo + ", autor=" + autor + ", tema=" + tema + ", publicacion=" + publicacion + ", acceso=" + acceso + '}';
    }

}

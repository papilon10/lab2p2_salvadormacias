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
public class conferencia {

    String titulo;
    String conferencista;
    Date fecha;
    int duración;
    String enlace;

    public conferencia() {
    }

    public conferencia(String titulo, String conferencista, Date fecha, int duración, String enlace) {
        this.titulo = titulo;
        this.conferencista = conferencista;
        this.fecha = fecha;
        this.duración = duración;
        this.enlace = enlace;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConferencista() {
        return conferencista;
    }

    public void setConferencista(String conferencista) {
        this.conferencista = conferencista;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getDuración() {
        return duración;
    }

    public void setDuración(int duración) {
        this.duración = duración;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    @Override
    public String toString() {
        return "conferencia{" + "titulo=" + titulo + ", conferencista=" + conferencista + ", fecha=" + fecha + ", duraci\u00f3n=" + duración + ", enlace=" + enlace + '}';
    }

}

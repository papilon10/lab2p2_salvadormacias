/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.lab2p2_salvadormacias;

/**
 *
 * @author Apple
 */
public class usuario {

    String nombre;
    String contrasena;
    String tipo;

    public usuario() {
    }

    public usuario(String nombre, String contrasena, String tipo) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean verify(String usuario, String contrasena, String tipoUsuario) {
        return this.nombre.equals(usuario) && this.contrasena.equals(contrasena) && this.tipo.equalsIgnoreCase(tipoUsuario);
    }

    @Override
    public String toString() {
        return "usuario{" + "nombre=" + nombre + ", contrasena=" + contrasena + ", tipo=" + tipo + '}';
    }

}

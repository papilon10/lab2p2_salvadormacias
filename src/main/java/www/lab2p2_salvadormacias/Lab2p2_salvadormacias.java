/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package www.lab2p2_salvadormacias;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Apple
 */
public class Lab2p2_salvadormacias {

    public static Scanner lea = new Scanner(System.in);
    public static Scanner str = new Scanner(System.in);

    public static ArrayList inventario = new ArrayList();
    public static ArrayList<usuario> usuarios = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("---Bienvenido al sistema de Inventario de Biblioteca Virtual---");
        System.out.println("1. listar recursos\n2. Crear recurso \n3. Eliminar recurso \n4. Modificar recurso\n5. salir");
        System.out.println("Ingrese opcion: ");
        int opcion = lea.nextInt();
        do {
            switch (opcion) {
                case 1: {

                }
                break;

                case 2: {
                    System.out.println("1.libro\n2.articulo\n3.curso\n4.conferencia\n5.salir");
                    System.out.println("Ingrese opcion: ");
                    int opc_agregar = lea.nextInt();
                    do {
                        switch (opc_agregar) {
                            case 1: {
                                System.out.println("Ingrese el titulo: ");
                                String titulo = str.nextLine();
                                System.out.println("Ingrese el autor: ");
                                String autor = str.nextLine();
                                System.out.println("Ingrese el genero: ");
                                String genero = str.nextLine();
                                System.out.println("Ingrese la año de publicacion en formato dd/MM/yyyy: ");
                                String fechaString = str.nextLine();

                                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                                try {
                                    Date fecha = formato.parse(fechaString);
                                    System.out.println("Ingrese la disponibilidad [s/n]: ");
                                    String disponibilidad = str.nextLine();
                                    inventario.add(new libro(titulo, autor, genero, fecha, disponibilidad));
                                } catch (ParseException e) {
                                    System.out.println("la fecha fue ingresada en un formato invalido ");
                                }

                            }//fin case libro
                            break;

                            case 2: {
                                System.out.println("Ingrese el titulo: ");
                                String titulo = str.nextLine();
                                System.out.println("Ingrese el autor: ");
                                String autor = str.nextLine();
                                System.out.println("Ingrese el tema: ");
                                String tema = str.nextLine();
                                System.out.println("Ingrese la fecha de publicacion en formato dd/MM/yyyy: ");
                                String fechaString = str.nextLine();

                                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                                try {
                                    Date fecha = formato.parse(fechaString);
                                    System.out.println("Ingrese si tiene acceso en linea [s/n]: ");
                                    String acceso = str.nextLine();
                                    inventario.add(new articulo(titulo, autor, tema, fecha, acceso));
                                } catch (ParseException e) {
                                    System.out.println("la fecha fue ingresada en un formato invalido ");
                                }

                            }//fin case articulo
                            break;

                            case 3: {
                                System.out.println("Ingrese el titulo: ");
                                String titulo = str.nextLine();
                                System.out.println("Ingrese el instructor: ");
                                String instructor = str.nextLine();
                                System.out.println("Ingrese la duracion en semanas: ");
                                int duracion = lea.nextInt();
                                System.out.println("Ingrese la plataforma de ensenanza: ");
                                String plataforma = str.nextLine();
                                inventario.add(new curso(titulo, instructor, duracion, plataforma));
                                

                            }//fin case curso
                            break;

                            case 4: {
                                System.out.println("Ingrese el titulo: ");
                                String titulo = str.nextLine();
                                System.out.println("Ingrese el conferencista : ");
                                String conferencista  = str.nextLine();
                                 System.out.println("Ingrese la fecha de la conferencia en formato dd/MM/yyyy: ");
                                String fechaString = str.nextLine();

                                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                                try {
                                    Date fecha = formato.parse(fechaString);
                                    System.out.println("Ingrese el enlace de acceso: ");
                                    String enlace = str.nextLine();
                                    inventario.add(new conferencia(titulo, conferencista, fecha, opcion, enlace));
                                } catch (ParseException e) {
                                    System.out.println("la fecha fue ingresada en un formato invalido ");
                                }
                                

                            }//fin case conferencia
                            break;

                            default: {
                                System.out.println("opcion ingresada es invalida...");

                            }
                            break;
                        }//fin switch 
                    } while (opc_agregar != 5);

                }//fin case 2
                break;

                case 3: {

                }
                break;

                case 4: {

                }
                break;

                default: {
                    System.out.println("Opcion ingresada es invalida...");

                }
                break;

            }//fin switch

        } while (opcion != 5);
    }//fin main

}//fin clase

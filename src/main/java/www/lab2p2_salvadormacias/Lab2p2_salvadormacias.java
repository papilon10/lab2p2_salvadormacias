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
        usuario predeterminado = new usuario("admin", "1234", "bibliotecario");
        System.out.println("Ingrese su usuario:");
        String usuario = str.nextLine();
        System.out.println("Ingrese su contraseña:");
        String contrasena = str.nextLine();
        System.out.println("Ingrese su tipo de usuario (estudiante, profesor, bibliotecario):");
        String tipo = str.nextLine();
        if (predeterminado.verify(usuario, contrasena, tipo)) {
            System.out.println("Inicio de sesión exitoso.");
            System.out.println("---Bienvenido al sistema de Inventario de Biblioteca Virtual---");
            System.out.println("1. listar recursos\n2. Crear recurso \n3. Eliminar recurso \n4. Modificar recurso\n5. salir");
            System.out.println("Ingrese opcion: ");
            int opcion = lea.nextInt();
            boolean salida = false;
            do {
                switch (opcion) {
                    case 1: {
                        if (inventario.isEmpty()) {
                            System.out.println("el inventario no cuenta con recursos...");

                        } else {
                            for (int i = 0; i < inventario.size(); i++) {
                                System.out.println(
                                        inventario.indexOf(inventario.get(i)) + "-"
                                        + inventario.get(i)
                                );

                            }
                        }//fin if
                        break;

                    }//fin listar

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
                                    break;

                                }//fin case libro

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
                                    break;

                                }//fin case articulo

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
                                    String conferencista = str.nextLine();
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
                                    break;

                                }//fin case conferencia

                                default: {
                                    System.out.println("opcion ingresada es invalida...");

                                }
                                break;
                            }//fin switch 
                        } while (opc_agregar != 5);
                        break;

                    }//fin case 2

                    case 3: {
                        System.out.println("---inventario disponible---");
                        for (int i = 0; i < inventario.size(); i++) {
                            System.out.println(
                                    inventario.indexOf(inventario.get(i)) + "-"
                                    + inventario.get(i)
                            );

                        }
                        System.out.println("Ingrese el indice del recurso a eliminar: ");
                        int i = lea.nextInt();
                        inventario.remove(i);
                        System.out.println("el recurso fue eliminado exitosamente...");
                        break;

                    }

                    case 4: {
                        System.out.println("---inventario disponible---");
                        for (int i = 0; i < inventario.size(); i++) {
                            System.out.println(
                                    inventario.indexOf(inventario.get(i)) + "-"
                                    + inventario.get(i)
                            );

                        }
                        System.out.println("Ingrese el indice del recurso a modificar: ");
                        int i = lea.nextInt();
                        if (inventario.get(i) instanceof libro) {
                            System.out.println("Ingrese el nuevo titulo: ");
                            String titulo = str.nextLine();
                            inventario.set(i, titulo);
                            System.out.println("Ingrese el genero: ");
                            String genero = str.nextLine();
                            inventario.set(i, genero);

                            System.out.println("Ingrese la año de publicacion en formato dd/MM/yyyy: ");
                            String fechaString = str.nextLine();

                            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                            try {
                                Date fecha = formato.parse(fechaString);
                                inventario.set(i, fecha);

                            } catch (ParseException e) {
                                System.out.println("la fecha fue ingresada en un formato invalido ");
                            }
                            System.out.println("Ingrese la disponiblidad: ");
                            String disponibilidad = str.nextLine();
                            inventario.set(i, genero);

                        } else if (inventario.get(i) instanceof articulo) {
                            System.out.println("Ingrese el titulo: ");
                            String titulo = str.nextLine();
                            inventario.set(i, titulo);
                            System.out.println("Ingrese el autor: ");
                            String autor = str.nextLine();
                            inventario.set(i, autor);
                            System.out.println("Ingrese el tema: ");
                            String tema = str.nextLine();
                            System.out.println("Ingrese la fecha de publicacion en formato dd/MM/yyyy: ");
                            String fechaString = str.nextLine();

                            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                            try {
                                Date publicacion = formato.parse(fechaString);
                                inventario.set(i, publicacion);

                            } catch (ParseException e) {
                                System.out.println("la fecha fue ingresada en un formato invalido ");
                            }
                            inventario.set(i, tema);
                            System.out.println("Ingrese si tiene acceso en linea [s/n]: ");
                            String acceso = str.nextLine();
                            inventario.set(i, acceso);

                        } else if (inventario.get(i) instanceof curso) {
                            System.out.println("Ingrese el titulo: ");
                            String titulo = str.nextLine();
                            inventario.set(i, titulo);
                            System.out.println("Ingrese el instructor: ");
                            String instructor = str.nextLine();
                            inventario.set(i, instructor);
                            System.out.println("Ingrese la duracion en semanas: ");
                            int duracion = lea.nextInt();
                            inventario.set(i, duracion);
                            System.out.println("Ingrese la plataforma de ensenanza: ");
                            String plataforma = str.nextLine();
                            inventario.set(i, plataforma);

                        } else if (inventario.get(i) instanceof conferencia) {
                            System.out.println("Ingrese el titulo: ");
                            String titulo = str.nextLine();
                            inventario.set(i, titulo);
                            System.out.println("Ingrese el conferencista : ");
                            String conferencista = str.nextLine();
                            inventario.set(i, conferencista);
                            System.out.println("Ingrese la fecha de la conferencia en formato dd/MM/yyyy: ");
                            String fechaString = str.nextLine();

                            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                            try {
                                Date fecha = formato.parse(fechaString);
                                inventario.set(i, fecha);
                                System.out.println("Ingrese el enlace de acceso: ");
                                String enlace = str.nextLine();
                                inventario.set(i, enlace);
                            } catch (ParseException e) {
                                System.out.println("la fecha fue ingresada en un formato invalido ");
                            }

                        }
                        break;

                    }//fin modificar

                    case 5: {
                        salida = true;
                        System.out.println("se abandonara el programa...");

                    }//fin case 5

                    default: {
                        System.out.println("Opcion ingresada es invalida...");

                        break;

                    }

                }//fin switch

            } while (salida != true);
        } else {
            System.out.println("los datos del usuario son incorrectos...");

        }

    }//fin main

}//fin clase

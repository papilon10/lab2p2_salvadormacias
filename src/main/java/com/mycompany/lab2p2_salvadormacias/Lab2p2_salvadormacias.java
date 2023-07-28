/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab2p2_salvadormacias;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author papilon10
 */
public class Lab2p2_salvadormacias {

    public static Scanner lea = new Scanner(System.in);
    public static Scanner str = new Scanner(System.in);
    private static Map<String, String> users = new HashMap<>();

    public static void main(String[] args) {

        users.put("gerente", "g3r$nt0");
        ArrayList chef = new ArrayList<chefs>();
        ArrayList meseros = new ArrayList();
        ArrayList bartenders = new ArrayList();
        ArrayList mesas = new ArrayList();

        System.out.println("Inicio de sesión");

        while (true) {
            System.out.print("Usuario: ");
            String usuario = lea.nextLine();

            System.out.print("Contraseña: ");
            String contra = lea.nextLine();

            if (login(usuario, contra)) {
                System.out.println("Inicio de sesión exitoso. ¡Hola, " + usuario + "!\n\n");
                int opcion = 0;
                while (opcion
                        != 5) {
                    System.out.println("Bienvenido al sistema");
                    System.out.println("Opciones dispnibles:\n"
                            + "1.Chefs\n"
                            + "2.Meseros\n"
                            + "3.Bartenders\n"
                            + "4.Mesas\n"
                            + "5.salir\n");
                    System.out.println("Ingrese opcion: ");
                    opcion = lea.nextInt();
                    if (opcion == 1) {
                        int op_chefs = 0;
                        while (op_chefs != 5) {
                            System.out.println("1.agregar un chef\n"
                                    + "2.listar chefs\n"
                                    + "3.modificar un chef\n"
                                    + "4.eliminar un chef\n"
                                    + "5.salir");

                            op_chefs = lea.nextInt();
                            if (op_chefs == 1) {
                                String nombre;
                                int edad;
                                String turno;
                                int numero_estrellas;
                                double sueldo;
                                System.out.println("Ingrese el nombre: ");
                                nombre = str.nextLine();
                                System.out.println("Ingrese la edad: ");
                                edad = lea.nextInt();
                                System.out.println("Ingrese el turno: ");
                                turno = str.nextLine();
                                System.out.println("Ingrese el numero de estrellas: ");
                                numero_estrellas = lea.nextInt();
                                System.out.println("Ingrese el sueldo: ");
                                sueldo = lea.nextDouble();
                                if (chef.size() <= 14) {
                                    chef.add(new chefs(nombre, edad, turno, numero_estrellas, sueldo));
                                    System.out.println("Chef agregado exitosamente\n");

                                } else {
                                    System.out.println("La lista de chefs no puede ser mayor a 14");
                                }

                            } else if (op_chefs == 2) {

                                for (Object y : chef) {
                                    System.out.println(chef.indexOf(y)
                                            + "-" + y + "\n");

                                }

                            } else if (op_chefs == 3) {
                                System.out.println("Ingrese la posicion del chef a modificar:");
                                int p = lea.nextInt();
                                if (p >= 0 && p < chef.size()) {
                                    System.out.println("Ingrese el nuevo nombre: ");
                                    String nombre = str.next();
                                    chef.set(p, nombre);
                                    System.out.println("Ingrese la nueva edad: ");
                                    int edad = lea.nextInt();
                                    chef.set(p, edad);
                                    System.out.println("Ingrese el turno: ");
                                    String turno = str.nextLine();
                                    chef.set(p, turno);
                                    System.out.println("Ingrese el nuevo numero de estrellas: ");
                                    int numero_estrellas = lea.nextInt();
                                    chef.set(p, numero_estrellas);
                                    System.out.println("Ingrese el nuevo sueldo: ");
                                    double sueldo = lea.nextDouble();
                                    chef.set(p, sueldo);

                                } else {
                                    System.out.println("Ingrese posicion fuera de rango");
                                }

                            } else if (op_chefs == 4) {
                                System.out.println("Ingrese la posicion del chef a modificar:");
                                int p = lea.nextInt();
                                if (p >= 0 && p < chef.size()) {
                                    chef.remove(p);

                                } else {
                                    System.out.println("Ingrese posicion fuera de rango");
                                }

                            }
                        }//fin while

                    }//fin chefs

                    if (opcion == 2) {
                        int op_meseros = 0;
                        while (op_meseros != 5) {
                            System.out.println("1.agregar un mesero\n"
                                    + "2.listar meseros\n"
                                    + "3.modificar un mesero\n"
                                    + "4.eliminar un mesero\n"
                                    + "5.salir");

                            op_meseros = lea.nextInt();
                            if (op_meseros == 1) {
                                String nombre;
                                int edad;
                                String turno;
                                double sueldo;
                                double propina;
                                System.out.println("Ingrese el nombre: ");
                                nombre = str.nextLine();
                                System.out.println("Ingrese la edad: ");
                                edad = lea.nextInt();
                                System.out.println("Ingrese el turno: ");
                                turno = str.nextLine();
                                System.out.println("Ingrese la propina: ");
                                propina = lea.nextInt();
                                System.out.println("Ingrese el sueldo: ");
                                sueldo = lea.nextDouble();

                                if (meseros.size() <= 8) {
                                    meseros.add(new meseros(nombre, edad, turno, sueldo, propina));
                                    System.out.println("Mesero agregado exitosamente\n");
                                } else {
                                    System.out.println("La lista de meseros no puede ser mayor a 8");
                                }

                            } else if (op_meseros == 2) {

                                for (Object y : meseros) {
                                    System.out.println(meseros.indexOf(y)
                                            + "-" + y + "\n");

                                }

                            } else if (op_meseros == 3) {
                                System.out.println("Ingrese la posicion del mesero a modificar:");
                                int p = lea.nextInt();
                                String nombre;
                                if (p >= 0 && p < meseros.size()) {
                                    System.out.println("Ingrese el nuevo nombre: ");
                                    nombre = str.nextLine();
                                    meseros.set(p, nombre);
                                    System.out.println("Ingrese la nueva edad: ");
                                    int edad = lea.nextInt();
                                    meseros.set(p, edad);
                                    System.out.println("Ingrese el nuevo turno: ");
                                    String turno = str.nextLine();
                                    meseros.set(p, turno);

                                    System.out.println("Ingrese la nueva propina: ");
                                    double propina = lea.nextInt();
                                    meseros.set(p, propina);

                                    System.out.println("Ingrese el nuevo sueldo: ");
                                    double sueldo = lea.nextDouble();
                                    meseros.set(p, sueldo);

                                } else {
                                    System.out.println("Ingrese posicion fuera de rango");
                                }

                            } else if (op_meseros == 4) {
                                System.out.println("Ingrese la posicion del mesero a eliminar:");
                                int p = lea.nextInt();
                                if (p >= 0 && p < meseros.size()) {
                                    meseros.remove(p);

                                } else {
                                    System.out.println("Ingrese posicion fuera de rango");
                                }

                            }
                        }//fin while

                    }//fin meseros

                    if (opcion == 3) {
                        int op_bartenders = 0;
                        while (op_bartenders != 5) {
                            System.out.println("1.agregar un bartender\n"
                                    + "2.listar bartender\n"
                                    + "3.modificar un bartender\n"
                                    + "4.eliminar un bartender\n"
                                    + "5.salir");

                            op_bartenders = lea.nextInt();
                            if (op_bartenders == 1) {
                                String nombre;
                                int edad;
                                String turno;
                                double sueldo;
                                int numero_licores;
                                System.out.println("Ingrese el nombre: ");
                                nombre = str.nextLine();
                                System.out.println("Ingrese la edad: ");
                                edad = lea.nextInt();
                                System.out.println("Ingrese el turno: ");
                                turno = str.nextLine();
                                System.out.println("Ingrese el numero de licores: ");
                                numero_licores = lea.nextInt();
                                System.out.println("Ingrese el sueldo: ");
                                sueldo = lea.nextDouble();
                                if (bartenders.size() <= 4) {
                                    meseros.add(new meseros(nombre, edad, turno, sueldo, numero_licores));
                                    System.out.println("bartender agregado exitosamente\n");

                                }

                            } else if (op_bartenders == 2) {

                                for (Object y : bartenders) {
                                    System.out.println(bartenders.indexOf(y)
                                            + "-" + y + "\n");

                                }

                            } else if (op_bartenders == 3) {
                                System.out.println("Ingrese la posicion del bartender a modificar:");
                                int p = lea.nextInt();
                                String nombre;
                                if (p >= 0 && p < bartenders.size()) {
                                    System.out.println("Ingrese el nuevo nombre: ");
                                    nombre = str.nextLine();
                                    bartenders.set(p, nombre);
                                    System.out.println("Ingrese la nueva edad: ");
                                    int edad = lea.nextInt();
                                    bartenders.set(p, edad);
                                    System.out.println("Ingrese el nuevo turno: ");
                                    String turno = str.nextLine();
                                    bartenders.set(p, turno);
                                    System.out.println("Ingrese el nuevo numero de licores: ");
                                    int numero_licores = lea.nextInt();
                                    bartenders.set(p, numero_licores);
                                    System.out.println("Ingrese el nuevo sueldo: ");
                                    double sueldo = lea.nextDouble();
                                    bartenders.set(p, sueldo);

                                } else {
                                    System.out.println("Ingrese posicion fuera de rango");
                                }

                            } else if (op_bartenders == 4) {
                                System.out.println("Ingrese la posicion del bartender a eliminar:");
                                int p = lea.nextInt();
                                if (p >= 0 && p < bartenders.size()) {
                                    bartenders.remove(p);

                                } else {
                                    System.out.println("Ingrese posicion fuera de rango");
                                }

                            }
                        }

                    }//fin bartenders

                    if (opcion == 4) {
                        int numero_platos;
                        int numero_utensilios;
                        double precio_total;
                        double suma = 0.0;
                        int op_mesas = 0;
                        while (op_mesas != 5) {
                            System.out.println("1.agregar una mesa\n"
                                    + "2.listar mesas\n"
                                    + "3.modificar una mesa\n"
                                    + "4.eliminar una mesa\n"
                                    + "5.salir");

                            op_mesas = lea.nextInt();
                            if (op_mesas == 1) {
                                System.out.println("Ingrese el numero de platos: ");
                                numero_platos = lea.nextInt();
                                System.out.println("Ingrese el numero de utensilios: ");
                                numero_utensilios = lea.nextInt();
                                System.out.println("Ingrese el precio total: ");
                                precio_total = lea.nextDouble();
                                suma += precio_total;

                                if (mesas.size() <= 10) {
                                    mesas.add(new mesas(numero_platos, numero_utensilios, precio_total));
                                    System.out.println("mesa agregado exitosamente\n");

                                }

                            } else if (op_mesas == 2) {

                                for (Object y : mesas) {
                                    System.out.println(mesas.indexOf(y)
                                            + "-" + y + "\n");
                                    System.out.println("La suma total es de:" + suma);

                                }

                            } else if (op_mesas == 3) {
                                System.out.println("Ingrese la posicion de la mesa a modificar:");
                                int p = lea.nextInt();
                                String nombre;
                                if (p >= 0 && p < mesas.size()) {
                                    System.out.println("Ingrese el nuevo numero de platos: ");
                                     numero_platos= lea.nextInt();
                                     mesas.set(p, numero_platos);
                                     System.out.println("Ingrese el nuevo numero de utensilios: ");
                                     numero_utensilios=lea.nextInt();
                                     mesas.set(p, numero_utensilios);
                                     System.out.println("Ingrese el nuevo precio total: ");
                                     precio_total=lea.nextInt();
                                     mesas.set(p, precio_total);
                                     suma+=precio_total;

                                } else {
                                    System.out.println("Ingrese posicion fuera de rango");
                                }

                            } else if (op_mesas == 4) {
                                System.out.println("Ingrese la posicion de la mesa a eliminar:");
                                int p = lea.nextInt();
                                if (p >= 0 && p < mesas.size()) {
                                    mesas.remove(p);

                                } else {
                                    System.out.println("Ingrese posicion fuera de rango");
                                }

                            }
                        }

                    }//fin mesas

                }

                break;
            } else {
                System.out.println("Usuario o contraseña incorrectos. Intente nuevamente.\n");
            }
        }

        lea.close();
    }

    private static boolean login(String username, String password) {
        String storedPassword = users.get(username);
        return storedPassword != null && storedPassword.equals(password);
    }

}//fin clase


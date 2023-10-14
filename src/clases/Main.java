/*Desarrollar un programa que permita almacenar 16 nombres de mascotas
en una matriz llamada “mascotas”, posteriormente el programa deberá
mostrar el contenido de las filas y columnas con índices impares de la
matriz. Nota: el número de mascotas a mostrar es de 4 y deberán
mostrarse en formato de matriz, es decir, simulando filas y columnas.*/
package clases;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Declaracion de variables y Sanner
        Scanner scanner = new Scanner(System.in);
        String nombre = "";
        String matriz[][] = new String[4][4];

        //Ingreso de datos
        System.out.println("============[Nombres]==============");
        System.out.println("                                   ");
        System.out.print("Ingrese el nombre de la mascota 1: ");
        nombre = scanner.next();
        matriz[0][0] = nombre;
        System.out.println("                                   ");

        System.out.print("Ingrese el nombre de la mascota 2: ");
        nombre = scanner.next();
        matriz[0][1] = nombre;
        System.out.println("                                   ");

        System.out.print("Ingrese el nombre de la mascota 3: ");
        nombre = scanner.next();
        matriz[0][2] = nombre;
        System.out.println("                                   ");

        System.out.print("Ingrese el nombre de la mascota 4: ");
        nombre = scanner.next();
        matriz[0][3] = nombre;
        System.out.println("                                   ");

        System.out.print("Ingrese el nombre de la mascota 5: ");
        nombre = scanner.next();
        matriz[1][0] = nombre;
        System.out.println("                                   ");

        System.out.print("Ingrese el nombre de la mascota 6: ");
        nombre = scanner.next();
        matriz[1][1] = nombre;
        System.out.println("                                   ");

        System.out.print("Ingrese el nombre de la mascota 7: ");
        nombre = scanner.next();
        matriz[1][2] = nombre;
        System.out.println("                                   ");

        System.out.print("Ingrese el nombre de la mascota 8: ");
        nombre = scanner.next();
        matriz[1][3] = nombre;
        System.out.println("                                   ");

        System.out.print("Ingrese el nombre de la mascota 9: ");
        nombre = scanner.next();
        matriz[2][0] = nombre;
        System.out.println("                                   ");

        System.out.print("Ingrese el nombre de la mascota 10: ");
        nombre = scanner.next();
        matriz[2][1] = nombre;
        System.out.println("                                   ");

        System.out.print("Ingrese el nombre de la mascota 11: ");
        nombre = scanner.next();
        matriz[2][2] = nombre;
        System.out.println("                                   ");

        System.out.print("Ingrese el nombre de la mascota 12: ");
        nombre = scanner.next();
        matriz[2][3] = nombre;
        System.out.println("                                   ");

        System.out.print("Ingrese el nombre de la mascota 13: ");
        nombre = scanner.next();
        matriz[3][0] = nombre;
        System.out.println("                                   ");

        System.out.print("Ingrese el nombre de la mascota 14: ");
        nombre = scanner.next();
        matriz[3][1] = nombre;
        System.out.println("                                   ");

        System.out.print("Ingrese el nombre de la mascota 15: ");
        nombre = scanner.next();
        matriz[3][2] = nombre;
        System.out.println("                                   ");

        System.out.print("Ingrese el nombre de la mascota 16: ");
        nombre = scanner.next();
        matriz[3][3] = nombre;
        System.out.println("                                   ");

        //Impresion de la Matriz
        System.out.println("==============[Tabla]==============");
        System.out.println("                                   ");
        System.out.println("Nombres de las Mascotas");
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print("[");
                System.out.print(matriz[x][y]);
                System.out.print("]");
                if (y != matriz[x].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        System.out.println("                                   ");
        System.out.println("===================================");
    }

}

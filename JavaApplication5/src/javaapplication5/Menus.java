package javaapplication5;

import java.util.Scanner;

public class Menus {

    static double mostrar_submenus(String factura, double cupo, String tipo_menu, String articulo1,
            double precio1,
            String articulo2,
            double precio2,
            String articulo3,
            double precio3,
            String articulo4,
            double precio4) {
        int op;
        Funciones f = new Funciones();
        do {
            System.out.println("""
                               ***************************
                                       Menu %s
                               ***************************
                               Escoge un articulo:
                               1.   Articulo:   %s     
                                    Precio:     %s
                               2.   Articulo:   %s     
                                    Precio:     %s
                               3.   Articulo:   %s     
                                    Precio:     %s
                               4.   Articulo:   %s     
                                    Precio:     %s
                               5.   Salir
                               """.formatted(tipo_menu, articulo1, precio1, articulo2, precio2, articulo3, precio3, articulo4, precio4));
            op = new Scanner(System.in).nextInt();
            while (op < 1 || op > 5) {
                System.out.println("Error, opciones no válidas.");
                op = new Scanner(System.in).nextInt();
            }
            switch (op) {
                case 1 -> {
                    cupo = f.iva_aplicado(cupo, precio1);
                    factura = f.armar_factura(factura, articulo1, precio1);
                }
                case 2 -> {
                    cupo = f.iva_aplicado(cupo, precio2);
                    factura = f.armar_factura(factura, articulo2, precio2);
                }
                case 3 -> {
                    cupo = f.iva_aplicado(cupo, precio3);
                    factura = f.armar_factura(factura, articulo3, precio3);
                }
                case 4 -> {
                    cupo = f.iva_aplicado(cupo, precio4);
                    factura = f.armar_factura(factura, articulo4, precio4);
                }
            }
        } while (op != 5);
        return cupo;
    }

    public void menu_principal(double cupo) {
        int op;
        String factura = "";
        do {
            System.out.println("""
                               ***************************
                               Bienvenido a nuestro sistema
                               ***************************
                               Escoge una categoría:
                               1.   Deportivos.
                               2.   Tecnología.
                               3.   Hobbies.
                               4.   Alimentos.
                               5.   Mostrar Factura.
                               6.   Salir
                               """);
            op = new Scanner(System.in).nextInt();
            while (op < 1 || op > 6) {
                System.out.println("Error, opciones no válidas.");
                op = new Scanner(System.in).nextInt();
            }
            switch (op) {
                case 1 -> cupo = mostrar_submenus(factura, cupo, "Deportivos", "Balón", 150000, "Raqueta", 250000, "Camisa", 85000, "Zapatos", 250000);
                case 2 -> cupo = mostrar_submenus(factura, cupo, "Tecnología", "Celular", 1800000, "Parlantes", 180000, "Audifonos", 35000, "Monitor", 600000);
                case 3 -> cupo = mostrar_submenus(factura, cupo, "Hobbies", "Ajedrez", 35000, "Domino", 15000, "Parqués", 25000, "Monopoly", 450000);
                case 4 -> cupo = mostrar_submenus(factura, cupo, "Alimentos", "Leche", 5700, "Ponqué", 12500, "Panes", 2000, "Huevos", 17000);
                case 5 -> System.out.println(factura);
            }
        } while (op != 6);
    }
}
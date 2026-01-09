package javaapplication5;

import java.util.Scanner;

public class CARRITO_ONLINE {

    public static void main(String[] args) {
        System.out.println("Ingrese el cupo máximo de compra");
        double cupo_maximo = new Scanner(System.in).nextDouble();
        Menus menu = new Menus();
        menu.menu_principal(cupo_maximo);
    }
}
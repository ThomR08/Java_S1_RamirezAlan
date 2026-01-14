package javaapplication5;

import java.util.Scanner;

public class Funciones {

    public String armar_factura(String factura, String articulo, double precio) {
        factura += """
                   **
                   Articulo:  """ + articulo + "\n"
                + "Precio:    " + precio + "\n"
                + "**\n";
        return factura;
    }

    static double reasignar_cupo(double cupo, double valor_articulo) {
        cupo = cupo - valor_articulo;
        System.out.println("Monto restante: " + cupo);
        return cupo;
    }

    static double validar_cupo(double cupo, double valor_articulo) {
        if (cupo < valor_articulo) {
            System.out.println("No se puede comprar el articulo. Saldo: " + cupo);
        } else {
            cupo = reasignar_cupo(cupo, valor_articulo);
        }
        return cupo;
    }

    public double iva_aplicado(double cupo, double valor_articulo) {
        System.out.println("¿El producto tiene IVA aplicado?\n1=SI\n2=NO");
        int op = new Scanner(System.in).nextInt();
        while (op < 1 || op > 2) {
            System.out.println("Error, escoja una opción valida!");
            op = new Scanner(System.in).nextInt();
        }
        if (op == 1) {
            double valor_articulo_aux = valor_articulo * 1.19;
            System.out.println("El producto con IVA es: " + valor_articulo_aux);
            cupo = validar_cupo(cupo, valor_articulo_aux);
        } else {
            cupo = validar_cupo(cupo, valor_articulo);
        }
        return cupo;
    }
}
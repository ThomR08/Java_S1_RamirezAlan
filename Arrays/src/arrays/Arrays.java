package arrays;

import java.util.Scanner;

public class Arrays {

    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static String scnString(boolean isVoid) {

        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            input = scanner.nextLine();

            if (!isVoid && (input == null || input.trim().isEmpty())) {
                System.out.println("No se permiten valores vacios. Vuelve a intentarlo.");
            } else {
                return input;
            }
        }
    }

    public static int scnInt(int min, int max) {

        Scanner scanner = new Scanner(System.in);
        int input;

        while (true) {

            if (scanner.hasNextInt()) {
                input = scanner.nextInt();

                if (input < min || input > max) {
                    System.out.println("Opción fuera de rango, escoge un número del " + min + " al " + max + ".");
                } else {
                    return input;
                }

            } else {
                System.out.println("Solo se permiten números enteros. Vuelve a intentarlo.");
                scanner.nextLine(); 
            }
        }
    }
    
    public static double scnDouble() {

        Scanner scanner = new Scanner(System.in);
        double input;

        while (true) {

            if (scanner.hasNextDouble()) {
                input = scanner.nextDouble();
                return input;
                    
            } else {
                System.out.println("Solo se permiten números enteros. Vuelve a intentarlo.");
                scanner.nextLine(); 
            }
        }
    }

    public static void main(String[] args) {

        Producto productos[] = new Producto[3];

        productos[0] = new Producto(1, "Monopoly", "Tremendo juego", 89900);
        productos[1] = new Producto(2, "Uno", "Para jugar en familiaa", 29900);
        productos[2] = new Producto(3, "Chess", "Juego de estrategia", 59900);

        System.out.println("""
                           Bienvenido a la tienda de juegos de mesa
                           
                           Acontinuación ingresa el id del producto a comprar:""");
        for (Producto producto : productos) {
            System.out.println("ID: " + producto.getId() + " | $" + producto.getPrecio() + " | " + producto.getNombre() + ", " + producto.getDescripcion());
        }

        System.out.println("""
                           
                           Ingresa el ID del juego a comprar: """);
        int inputID = scnInt(1, productos.length);
        // hola :D
    }

}

package variables;

import java.util.Scanner;

public class Variables {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Input
        
        System.out.println("Hola");
        System.out.println("Xd");
        
        /* ESTRUCTURA DE UNA VARIABLE
        
            TipoVariable NombreVariable;
            TipoVariable NombreVariable = Valor;
        
            LECTURA:
            TipoVariable NombreVariable = x.nextTipoVariable;
        */
        System.out.println("Ingrese el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la edad:");
        int edad = scanner.nextInt();
        System.out.println("Ingrese su estatura:");
        double estatura = scanner.nextDouble();
        System.out.println("Ingrese su número de cedula:");
        long cedula = scanner.nextLong();
        
        // ------------------------------
        
        System.out.println("""
                           Bienvenido %s tus datos son los siguientes:
                           
                           - Cedula: %s
                           - Edad: %s
                           - Estatura %s""".formatted(nombre, cedula, edad, estatura));
    }
    
}

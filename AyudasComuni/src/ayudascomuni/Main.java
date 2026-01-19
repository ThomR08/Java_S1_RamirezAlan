package ayudascomuni;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GestorFundacion gestor = new GestorFundacion();

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            mostrarMenu();
            int opcion = leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1 -> registrarEmpleado();
                case 2 -> registrarColaborador();
                case 3 -> registrarBeneficiario();
                case 4 -> gestor.verPersonas();
                case 5 -> presentarPersona();
                case 6 -> {
                    System.out.println("\n¡Gracias por usar el sistema de la fundación!");
                    continuar = false;
                }
                default -> System.out.println("\n❌ Opción inválida. Intente nuevamente.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("""
                           ========================================
                           Sistema de Gestión Fundación de ayudas
                           
                           Escoje una opción a continuació
                           1. Registrar Empleado
                           2. Registrar Colaborador
                           3. Registrar Beneficiario
                           4. Ver todas las personas
                           5. Presentar persona específica
                           6. Salir
                           ========================================""");
    }

    private static void registrarEmpleado() {
        System.out.println("\n--- REGISTRO DE EMPLEADO ---");
        
        String documento = leerTexto("Documento: ");
        String nombre = leerTexto("Nombre: ");
        String apellido = leerTexto("Apellido: ");
        int edad = leerEntero("Edad: ");
        String direccion = leerTexto("Dirección: ");
        double salario = leerDouble("Salario: ");
        String cargo = leerTexto("Cargo: ");
        String horario = seleccionarHorario();

        Empleado empleado = new Empleado(documento, nombre, apellido, edad, 
                                         direccion, salario, cargo, horario);
        gestor.registrarPersona(empleado);
    }

    private static void registrarColaborador() {
        System.out.println("\n--- REGISTRO DE COLABORADOR ---");
        
        String documento = leerTexto("Documento: ");
        String nombre = leerTexto("Nombre: ");
        String apellido = leerTexto("Apellido: ");
        int edad = leerEntero("Edad: ");
        String direccion = leerTexto("Dirección: ");
        int horas = leerEntero("Horas al mes (máximo 25): ");

        Colaborador colaborador = new Colaborador(documento, nombre, apellido, edad, 
                                                   direccion, horas);
        gestor.registrarPersona(colaborador);
    }

    private static void registrarBeneficiario() {
        System.out.println("\n--- REGISTRO DE BENEFICIARIO ---");
        
        String documento = leerTexto("Documento: ");
        String nombre = leerTexto("Nombre: ");
        String apellido = leerTexto("Apellido: ");
        int edad = leerEntero("Edad: ");
        String direccion = leerTexto("Dirección: ");
        int ayudas = leerEntero("Ayudas por mes (máximo 5): ");

        Beneficiario beneficiario = new Beneficiario(documento, nombre, apellido, edad, 
                                                      direccion, ayudas);
        gestor.registrarPersona(beneficiario);
    }

    private static void presentarPersona() {
        String documento = leerTexto("\nIngrese el documento de la persona: ");
        Persona persona = gestor.buscarPersona(documento);

        if (persona != null) {
            System.out.println();
            persona.presentarse();
        } else {
            System.out.println("\n❌ No se encontró una persona con ese documento.");
        }
    }

    private static String seleccionarHorario() {
        System.out.println("Seleccione horario:");
        System.out.println("1. 8:00 AM - 5:00 PM");
        System.out.println("2. 2:00 PM - 11:00 PM");
        int opcion = leerEntero("Opción: ");
        return opcion == 1 ? "8-5 pm" : "2-11 pm";
    }

    private static String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.print("Por favor ingrese un número válido: ");
            scanner.next();
        }
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }

    private static double leerDouble(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextDouble()) {
            System.out.print("Por favor ingrese un número válido: ");
            scanner.next();
        }
        double valor = scanner.nextDouble();
        scanner.nextLine();
        return valor;
    }
}
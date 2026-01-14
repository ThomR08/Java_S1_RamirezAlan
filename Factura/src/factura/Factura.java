package factura;

import java.util.Scanner;

public class Factura {
    
    static int validacion(int valorminimo, int valormaximo, String mensaje){
        boolean validar = false;
        int op = 0;
        do {
            try {
                System.out.println(mensaje);
                op = new Scanner(System.in).nextInt();
                while( op < valorminimo || op > valormaximo) {
                    System.out.println("Opcion no valida, intente nuevamente. ");
                    op = new Scanner(System.in).nextInt();
                }
                validar = true;
            } catch (Exception e) {
                System.out.println("Error, solo se admiten numeros. ");
            }
        } while (validar == false);
        return op;
    }
    
    static String solicitarProductos() {
        String producto = "0,";
        int op = 0;
        do {
            try {
                System.out.println("Ingrese el valor del producto");
                int aux_producto = new Scanner(System.in).nextInt();
                if(aux_producto < 0){
                    System.out.println("Error, solo se admiten valores en positivo");
                } else {
                    // 80000,90000,150000,
                    producto += String.valueOf(aux_producto) + ",";
                    op = validacion(1,2,"¿Desea continuar?\n1=SI\n2=NO");
                }
            } catch(Exception e) {
                System.out.println("Error, solo se pueden numero enteros");
            }
        } while(op!=2);
        return producto.substring(0, producto.length() -1);
    }
    
    static void mostrarDetalles(Detalle_Factura f){
        if(f != null) {
        System.out.println("*******************");
        System.out.println("DETALLE");
        System.out.println("Cedula: "+f.getCedula());
        System.out.println("Nombre: "+f.getNombre());
        System.out.println("Apellido: "+f.getApellido());
        System.out.println("Productos: "+((f.getProductos().split(",").length) - 1));
        System.out.println("TOTAL: "+f.getTotal());
        } else {
            System.out.println("Esta mesa no solicito platillos");
        }
    }
    
    public static void main(String[] args) {
        Detalle_Factura f1 = null;
        Detalle_Factura f2 = null;
        Detalle_Factura f3 = null;
        Detalle_Factura f4 = null;
        
        for (int i = 0; i < 4; i++) {
            System.out.println("MESA " + (i + 1));            
            int op = validacion(1, 2, "¿Esta mesa ordeno platillos?\n1=SI\n2=NO");
            if (op == 2){
                continue;
            }
            System.out.println("Ingrese la cedula de la persona");
            String cedula = new Scanner(System.in).nextLine();
            System.out.println("Ingrese el nombre de la persona");
            String nombre = new Scanner(System.in).nextLine();
            System.out.println("Ingrese el apellido de la persona");
            String apellido = new Scanner(System.in).nextLine();
            System.out.println("Ingrese el dia del mes");
            int dia = validacion(1,31,"Opcion no valida, intente nuevamente");
            validacion(1, 31, "Ingrese el dia del mes");
            String productos = solicitarProductos();
            if (i == 0){
                f1 = new Detalle_Factura(cedula, nombre, apellido, productos, dia);
            } else {
                if (i == 1) {
                    f2 = new Detalle_Factura(cedula, nombre, apellido, productos, dia);
                } else {
                    if (i == 2) {
                        f3 = new Detalle_Factura(cedula, nombre, apellido, productos, dia);
                    } else {
                            f4 = new Detalle_Factura(cedula, nombre, apellido, productos, dia);
                        }
                    } 
                }
            }
        System.out.println("DETALLES");
        mostrarDetalles(f1);
        mostrarDetalles(f2);
        mostrarDetalles(f3);
        mostrarDetalles(f4);
        }
    }
package condicionales;

import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("""
                           Bienvenido a la Calculadora de Horas Extra
                           -----
                           Ingrese su salario: """);
        double salario = scn.nextDouble();
        
        if(salario<2847000){
            System.out.println("Ingresaste un salario menor a 2 SMMLV para Colombia ($2,847,000).");
            return;
        }
        
        System.out.println("Ingrese el número de horas extra ENTRE SEMANA de los primeros QUINCE días del mes: ");
        double horasEntreSemana15 = scn.nextDouble();
        
        if(horasEntreSemana15<0){
            System.out.println("Ingresaste un número negativo, imposible realizar la operación.");
            return;
        }
        
        System.out.println("Ingrese el número de horas extra de FIN SEMANA de los primeros QUINCE días del mes: ");
        double horasFinSemana15 = scn.nextDouble();
        
        if(horasFinSemana15<0){
            System.out.println("Ingresaste un número negativo, imposible realizar la operación.");
            return;
        }
        
        System.out.println("Ingrese el número de horas extra DEPUES de los primeros quince días del mes (Entre semana y fin de semana): ");
        double horasDespuesDel15 = scn.nextDouble();
        
        if(horasFinSemana15<0){
            System.out.println("Ingresaste un número negativo, imposible realizar la operación.");
            return;
        }
        
        // Sacar el pago de las horas:
        
        double pagoHorasEntreSemana15 = salario*horasEntreSemana15*1/100;
        double pagoHorasFinSemana15 = salario*horasFinSemana15*2/100;
        double pagoHorasDespuesDel15 = salario*horasDespuesDel15*3/100;
        
        double total = pagoHorasEntreSemana15+pagoHorasFinSemana15+pagoHorasDespuesDel15;
        
        double salarioTotal = salario+total;

        
        System.out.println("""
                           Calculo realizado Exitosamente
                           -----
                           Salario base: %s
                           Pago por Horas Extra: %s
                           Salario total: %s""".formatted(salario, total, salarioTotal));

    }
    
}
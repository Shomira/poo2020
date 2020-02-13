package deber_seleccion;
import deber_seleccion.NumeroMayor;

import java.util.Scanner;
public class EjecutaNumMayor {
    public static void main(String[] args) {
        // Creacion de un objeto apartir de otro
        NumeroMayor numMayor = new NumeroMayor();
        // para lectura de datos
        Scanner entrada = new Scanner(System.in);

        System.out.println("\t\tCALCULO DE NUMERO MAYOR DENTO DE UN CONJUNTO DE NUMEROS ");

        // Ingreso de los numeros requeridos para el proceso de seleccion de numero mayor
        System.out.println("Ingrese el valor del número 1: ");
        double num1 = entrada.nextDouble();

        System.out.println("Ingrese el valor del número 2:");
        double num2 = entrada.nextDouble();

        System.out.println("Ingrese el valor del número 3: ");
        double num3 = entrada.nextDouble();

        System.out.println("Ingrese el valor del número 4: ");
        double num4 = entrada.nextDouble();
        // Actualizacion de los valores asignandole los valores de entrada
        numMayor.setNum1(num1);
        numMayor.setNum2(num2);
        numMayor.setNum3(num3);
        numMayor.setNum3(num3);
        //llamada al metodo para que calcule el  numero mayor
        numMayor.Calcular_numero();
        System.out.println( "El numero mayor es: \n" + numMayor.getNumMayor());
    }
}

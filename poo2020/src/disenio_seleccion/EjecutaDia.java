package disenio_seleccion;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class EjecutaDia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Dia objDia = new Dia();

        System.out.println("\n --------------DETERMINAR EL NOMBRE DEL DIA---------------\n");

        // Lectura de datos

        System.out.print("Ingrese el  numero de dia en un rango de  (1-7): \n");
        int numDia = entrada.nextInt();

        // Establecer el valor qde entrada en el objeto
        objDia.setNumDia(numDia);

        // Calcular el nombre
        objDia.calcularNombreDia();

        // Impresion de datos, obtenidos ya  los datos del objeto
        System.out.println("\n_____________________ RESULTADO _______________________");
        System.out.println("El dia es = " + objDia.getNombreDia());

    }

}

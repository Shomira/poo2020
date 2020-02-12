package diseniopo;

import java.util.Scanner;

public class EjecutaEstudIanteUtpl {
    public static void main(String[] args){
        // Declaracion de variables
        String nombre;
        double nota1;
        double nota2;
        // ingreso de datos
        Scanner entrada = new Scanner(System.in);
        // Ingreso de datos requeridos
        System.out.println("Ingrese el nombre del Estudiante: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la nota del Primer Bimestre perteneciente a "+ nombre+": ");
        nota1 = entrada.nextDouble();
        System.out.println("Igrese la nota del Sgundo Bimestre perteneciente a " + nombre +": ");
        nota2 = entrada.nextDouble();
        EstudianteUtpl estudiante1 =  new EstudianteUtpl();
        System.out.println(estudiante1.obtener_Promedio(nombre, nota1, nota2));


    }

}

package deber_seleccion;

import java.util.Scanner;

public class EjecutaPromedioEstudiante {
    public static void main(String[] args) {
        // Se declara, crea e inicia el objeto de la clase Estudiante
        PromedioEstudiante estudiante1 = new PromedioEstudiante();
        // Crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n      CALCULAR PROMEDIO ESTUDIANTE\n");
        System.out.println("Ingrese el nombre del estudiante");
        String nombre = entrada.nextLine();
        // Ingreso de datos de las calificaciones
        System.out.println("Ingrese calificacion 1");
        double calf1 = entrada.nextDouble();

        System.out.println("Ingrese calificacion 2");
        double calf2 = entrada.nextDouble();

        System.out.println("Ingrese calificacion 3");
        double calf3 = entrada.nextDouble();

        System.out.println("Ingrese calificacion 4");
        double calf4 = entrada.nextDouble();
        // Establecer los datos de entrada en los datos del objeto
        estudiante1.setCalf1(calf1);
        estudiante1.setCalf2(calf2);
        estudiante1.setCalf3(calf3);
        estudiante1.setCalf4(calf4);

        // calcular promedio
        //estudiante1.calcular_promedio();

        // Impresion de datos
        System.out.println("\n--------------- RESULTADOS ---------------");
        System.out.println(estudiante1.obtener_Promedio(nombre, calf1, calf2, calf3, calf4));

    }
}

package deber_seleccion;
import disenio_seleccion.Empleado;

import java.util.Scanner;

import java.util.Scanner;

public class EjecutaEmpleado2 {
    public static void main(String[] args) {

        // Se declara, crea e inicia el objeto de la clase Empleado
        Empleado empleado2 = new Empleado();
        // Crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n      CALCULA SUELDO DOBLE DE UN EMPLEADO\n");
        System.out.println("Ingrese el nombre del Empleado");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese el numero de horas trabajadas");
        int horas =  entrada.nextInt();

        System.out.println("Ingrese el valor de la cuota por hora");
        double cuota = entrada.nextDouble();

        // Establecer los valores de entrada , en los datos del objeto
        empleado2.setNombre(nombre);
        empleado2.setHoras(horas);
        empleado2.setCuota(cuota);

        //Calculo de Sueldo
        empleado2.calcularSueldo();

        // Impresion de datos
        System.out.println("\n--------------- RESULTADOS ---------------");
        System.out.println("Nombre Empleado: " + empleado2.getNombre());
        System.out.println("Sueldo = " + empleado2.getSueldo());


    }

}

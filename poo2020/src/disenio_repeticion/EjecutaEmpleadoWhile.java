package disenio_repeticion;

import java.util.Scanner;

public class EjecutaEmpleadoWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opcion;
        System.out.println("________CALCULO DE SUELDOS DE EMPLEADOS________");
        System.out.println(" Ingrese la cuota por hora: ");
        double cuota = teclado.nextDouble();
        // limpieza para entrada de datos
        teclado.nextLine();
        opcion = "SI";
        while (opcion.equals("SI")){

            System.out.println(" Escriba el Nombre del empleado: ");
            String nombre = teclado.nextLine();
            System.out.println(" Ingrese el numero de horas que ha trabajado " + nombre + ": ");
            int horas = teclado.nextInt();

            Empleado empleado = new Empleado(nombre, horas);
            empleado.setCuota(cuota);
            empleado.calcularSueldo();

            System.out.println("Nombre: "+ empleado.getNombre()+ "\nSueldo: "+ empleado.getSueldo());
            // limpieza para entrada de datos
            teclado.nextLine();
            System.out.println("Desea calcular el sueldo de otro empleado si/no: ");
            opcion = teclado.nextLine();
            opcion = opcion.toUpperCase();
        }
    }
}

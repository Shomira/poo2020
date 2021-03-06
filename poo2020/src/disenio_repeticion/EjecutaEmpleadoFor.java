package disenio_repeticion;

import java.util.Scanner;

public class EjecutaEmpleadoFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opcion;
        System.out.println("________Calculo de sueldos de empleados________");
        System.out.println("cuota por hora: ");
        double cuota = teclado.nextDouble();
        // limpieza para entrada de datos
        teclado.nextLine();
        opcion = "SI";
        for (int i = 0; opcion.equals("SI"); i++) {
                System.out.println("Nombre del empleado: ");
                String nombre = teclado.nextLine();
                System.out.println("horas trabajadas: ");
                int horas = teclado.nextInt();

                Empleado empleado = new Empleado(nombre, horas);
                empleado.setCuota(cuota);
                empleado.calcularSueldo();

                System.out.println("Nombre: " + empleado.getNombre() + "\nSueldo: " + empleado.getSueldo());
                // limpieza para entrada de datos
                teclado.nextLine();
                System.out.println("Desea calcular el sueldo de otro empleado si/no: ");
                opcion = teclado.nextLine();
                opcion = opcion.toUpperCase();
            }
        }
    }


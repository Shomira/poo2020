package disenio_seleccion;
import java.util.Scanner;
public class EjecutaEmpleado {
    public static void main(String[] args) {

        // Se declara, crea e inicia el objeto de la clase Empleado
        Empleado empleado1 = new Empleado();
        // Crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n      CALCULA SUELDO DOBLE DE UN EMPLEADO\n");
        System.out.println("Ingrese el nombre del Empleado");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese el numero de horas trabajadas");
        int horas =  entrada.nextInt();

        System.out.println("Ingrese el valorde la cuota por hora");
        double cuota = entrada.nextDouble();

        // Establecer los valores de entrada , en los datos del objeto
        empleado1.setNombre(nombre);
        empleado1.setHoras(horas);
        empleado1.setCuota(cuota);

        //Calculo de Sueldo
         empleado1.calcularSueldo();

        // Impresion de datos
        System.out.println("\n--------------- RESULTADOS ---------------");
        System.out.println("Nombre = " + empleado1.getNombre());
        System.out.println("Sueldo = " + empleado1.getSueldo());


    }

}

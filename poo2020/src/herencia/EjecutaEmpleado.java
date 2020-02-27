package herencia;

import herenciaEmpleado.EmpleadoHoras;
import herenciaEmpleado.EmpleadoSueldoFij;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Declaracion de variables
        String nombreEh, cargoEh, dependenciaEh;
        int horas, opcion;
        double cuotaH, sueldo;
        //Ingreso de datoss
        System.out.println(" INGRESO DE DATOS DEL EMPLEADO");
        System.out.println(" Ingrese el nombre del Empleado");
        nombreEh= entrada.nextLine();

        System.out.println(" Escriba el cargo que desempeña " + nombreEh);
        cargoEh = entrada.nextLine();

        System.out.println(" Escriba el nombre del departamento al que pertenece " + nombreEh);
        dependenciaEh = entrada.nextLine();

        System.out.println(" Escriba el numero deacuerdo a la opcion que desea : \n1.Sueldo por Horas" +
                "\n2.Sueldo si es por Empleado Asalariado");
        opcion = entrada.nextInt();
        if (opcion == 1){
            System.out.println("Ingrese el numero de horas trabajadas por " + nombreEh);
            horas = entrada.nextInt();

            System.out.println("Ingrese el valor de la cuota por hora: ");
            cuotaH = entrada.nextDouble();
            // Creacion del objeto Empleado por horas
            EmpleadoHoras empH =new EmpleadoHoras(nombreEh, cargoEh, dependenciaEh,horas, cuotaH);
            empH.calcularSueldo();
            System.out.println("________________________________________");
            System.out.println(" Datos objeto Empleado");
            System.out.println("Nombre: " + empH.getNombre() + "\nCargo: " + empH.getCargo() +"\nDependencia: " +
                    empH.getDepartamento()+ "\nSueldo: " + empH.getSueldo());
        }else{
            System.out.println("Ingrese el sueldo del empleado ");
            sueldo = entrada.nextDouble();
            // Creacion del objeto empleado asalariado
            EmpleadoSueldoFij empA =new EmpleadoSueldoFij(nombreEh, cargoEh, dependenciaEh,sueldo);

            System.out.println("________________________________________");
            System.out.println(" Datos objeto empleado");
            System.out.println("Nombre: " + empA.getNombre() + "\nCargo: " + empA.getCargo() +"\nDependencia: " +
                    empA.getDepartamento()+ "\nSueldo: " + empA.getValorMensual());



        }


    }
}

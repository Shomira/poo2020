package polimorfismo_poo;
import java.util.Scanner;
public class EjecutaEmpleado12 {
    public static void main(String[] args) {

        // Obtener el sueldo Quincenal de un empleado por horas
        EmpleadoPorHoras2 empHoras = new EmpleadoPorHoras2();
        Scanner entrada = new Scanner(System.in);
        System.out.println("CALCULO SUELDO QUINCENAL");

        System.out.println("Ingrese las horas trabajadas: ");
        // Actualizacion directa del valor de la variable
        empHoras.setHorasTr(entrada.nextInt());

        System.out.println("Ingrese las cuota por hora: ");
        empHoras.setCuotaHora(entrada.nextDouble());

        empHoras.calcularSueldoQna();
        System.out.println("El sueldo Quincenal es :  " + empHoras.getSueldo());

        // Creacion del segundo objeto
        EmpleadoAsalariado2 empAs =  new EmpleadoAsalariado2();
        System.out.println("CALCULO DEL SUELDO DE UN EMPLEADO ASALARIADO ");
        System.out.println("Ingrese el sueldo mensual");
        // Actualiza el valor de la variable con el valor ingresado
        empAs.setSueldoMensual(entrada.nextDouble());
        // calcular el sueldo llama al metodo
        empAs.calcularSueldoQna();
        System.out.println("El sueldo Quicenal  de un empleado Asalariado esn de : " + empAs.getSueldo() );


    }
}

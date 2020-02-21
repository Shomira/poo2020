package arreglosdeberpoo;
import java.util.Scanner;
public class EjecutaCedula {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cedula;
        System.out.println("\tVERIFICACION DE LA VALIDEZ DE NUMEROS DE CEDULA\t");
        System.out.println("Ingrese el numero de cedula:");
        cedula = entrada.nextLine();

        Cedula cedula1 = new Cedula(cedula);

        System.out.println("El numero  de cedula ingresado es : " + cedula +"\n"+ cedula1.CompCedula());


    }
}
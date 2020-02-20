package arreglosPoo;
import java.util.Scanner;
public class EjecutaArreglo {
    public static void main(String[] args) {

        // Declaraciones
        // Variables
        int vectA[] = new int[10];
        int vectB[] = new int[10];


        // Crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nCALCULA EL PRODUCTO DE DOS VECTORES\n");

        // Se declara, crea e inicia el objeto de la clase Vectores
        Arreglo vector1 = new Arreglo();

        System.out.println("_________  VECTOR A   __________");
        for ( int i = 0; i <= 9; i++) {
            System.out.print("Ingrese los valores del  Vector para la posicion: A[" + i + "]: ");
            vectA[i] = entrada.nextInt();
        }

        System.out.println("_________VECTOR B _____________");
        for (int i = 0; i <= 9; i++) {
            System.out.print("Ingrese el valor del Vector para la posicion : B[" + i + "]: ");
            vectB[i] = entrada.nextInt();
        }

        // Establecer
        vector1.setVectorA(vectA);
        vector1.setVectorB(vectB);

        // Calcular
        vector1.calcularProducto();

        // Imprimir
        System.out.println("--------- Salida ----------");
        System.out.println("\tVector A\tVector B");
        for (int i = 0; i <= 9; i++) {
            System.out.println("\t\t" + vector1.getVectorA()[i] + "\t\t" + vector1.getVectorB()[i]);
        }
        System.out.println("Producto = " + vector1.getProduct());
    }
}

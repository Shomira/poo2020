package polimorfismoVolumen;

import herenciaVolumen.Cilindro;
import herenciaVolumen.Cono;
import herenciaVolumen.Cubo;
import herenciaVolumen.Esfera;

import java.util.Scanner;

public class EjecutaVolumen2 {
    public static void main(String[] args) {
        String nombre;
        int opcion = 1;
        double radio;
        Scanner entrada = new Scanner (System.in);
        // Ciclo que controla el ingreso de los calculos de los datos
        while(opcion != 5) {
            System.out.println("CALCULO DEL VOLUMEN DE FIGURAS GEOMETRICAS");
            // Menu inicial
            System.out.println("Digitar el numero deacuerdo al area de la figura que desee:\n" +
                    "|1.CUBO\t |\n|2.CILINDRO |\n|3.CONO|\n|4.ESFERA |\n|5.FIN |\n------------");

            opcion = entrada.nextInt();
            switch (opcion) {

                case 1:
                    nombre = "CUBO";
                    System.out.println("Ingrese el valor de arista del Cubo: ");
                    double arista = entrada.nextDouble();

                    // Creacion del objeto (Metodo constructor
                    Cubo2 Cub = new Cubo2(arista, nombre);
                    System.out.println("El Volumen del Cubo es: " + Cub.calcularVolumen());
                    break;
                case 2:
                    nombre = "CILINDRO";
                    // INGRESO de datos
                    System.out.println("Ingrese el valor del  radio del cilindro: ");
                    radio = entrada.nextDouble();

                    System.out.println("Ingrese el valor de la altura del cilindro: ");
                    double alturaCil = entrada.nextDouble();
                    // Creacion del construtor
                    Cilindro2 Cil = new Cilindro2(radio, alturaCil, nombre);
                    Cil.calcularVolumen();
                    // impresion de datos
                    System.out.println("El Volumen del Cilindro es: " + Cil.getVolumenCild());
                    break;
                case 3:
                    nombre = "CONO";
                    // Ingreso de datos
                    System.out.println("Ingrese el valor del  radio del Cono: ");
                    radio = entrada.nextDouble();

                    System.out.println("Ingrese el valor de la altura del Cono: ");
                    double alturaCon = entrada.nextDouble();
                    // Creacion del COnstructor
                    Cono2 Con = new Cono2(radio, alturaCon, nombre);
                    Con.calcularVolumen();

                    System.out.println("El Volumen del Cono es : " +Con.getVolumenCono());
                    break;
                case 4:
                    nombre = "ESFERA";
                    // INgreso de datos
                    System.out.println("Ingrese el valor del radio de la Esfera : ");
                    radio = entrada.nextDouble();
                    // Creacion del constructor
                    Esfera2 Es = new Esfera2(radio, nombre);
                    Es.calcularVolumen();
                    // Impresion de datos
                    System.out.println("El volumen de la Esfera es: " + Es.getVolumenEs());
                    break;
                case 5:
                    break;
            }
        }
    }
}

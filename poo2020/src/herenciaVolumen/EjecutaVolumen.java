package herenciaVolumen;
import java.util.Scanner;
public class EjecutaVolumen {
    public static void main(String[] args) {
        String nombre;
        int opcion = 1;
        double radio;
        Scanner entrada = new Scanner (System.in);
    while(opcion != 5) {
        System.out.println("CALCULO DEL VOLUMEN DE FIGURAS GEOMETRICAS");
        System.out.println("Digitar el numero deacuerdo al area de la figura que desee:\n" +
                "|1.CUBO\t |\n|2.CILINDRO |\n|3.CONO|\n|4.ESFERA |\n|5.FIN |\n------------");

        opcion = entrada.nextInt();
        switch (opcion) {

            case 1:
                nombre = "CUBO";
                System.out.println("Ingrese el valor de arista del Cubo: ");
                double arista = entrada.nextDouble();
                // Creacion del objeto
                Cubo Cub = new Cubo(arista, nombre);

                System.out.println("El Volumen del Cubo es: " + Cub.calcularVolumenCub());
                break;
            case 2:
                nombre = "CILINDRO";
                System.out.println("Ingrese el valor del  radio del cilindro: ");
                radio = entrada.nextDouble();

                System.out.println("Ingrese el valor de la altura del cilindro: ");
                double alturaCil = entrada.nextDouble();
                // Creacion del objeto
                Cilindro Cil = new Cilindro(radio, alturaCil, nombre);

                System.out.println("El Volumen del Cilindro es: " + Cil.calcularVolumenCild());
                break;
            case 3:
                nombre = "CONO";
                System.out.println("Ingrese el valor del  radio del Cono: ");
                radio = entrada.nextDouble();

                System.out.println("Ingrese el valor de la altura del Cono: ");
                double alturaCon = entrada.nextDouble();
                // Creacion del objeto
                Cono Con = new Cono(radio, alturaCon, nombre);

                System.out.println("El Volumen del Cono es : " +Con.calcularVolumenCono());
                break;
            case 4:
                nombre = "ESFERA";
                System.out.println("Ingrese el valor del radio de la Esfera : ");
                radio = entrada.nextDouble();
                // Creacion del objeto
                Esfera Es = new Esfera(radio, nombre);

                System.out.println("El volumen de la Esfera es: " + Es.calcularVolEs());
                break;
            case 5:
                break;
        }
    }
    }
}

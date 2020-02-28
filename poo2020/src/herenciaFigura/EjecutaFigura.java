package herenciaFigura;
import java.util.Scanner;
public class EjecutaFigura {
    public static void main(String[] args) {
        String nombre;
        Scanner entrada = new Scanner (System.in);
        System.out.println("CALCULO DEL  AREA DE FIGURAS GEOMETRICAS");
        System.out.println("Digitar el numero deacuerdo al area de la figura que desee:\n" +
                "|1.Circulo\t |\n|2.Cuadrado  |\n|3.Rectangulo|\n|4.Triangulo |\n------------");

        int opcion = entrada.nextInt();

        switch(opcion ){
            case 1:
                nombre = "Circulo";
                System.out.println("Ingrese el radio del circulo: ");
                double radio = entrada.nextDouble();
                // Creacion del objeto
                Circulo Cir = new Circulo(radio, nombre);
                Cir.calcularAreaCir();
                System.out.println("El area del Triangulo con un radio de " + radio+ " es:" +Cir.getAreaCir());
                break;
            case 2:
                nombre = "Cuadrado";
                System.out.println("Ingrese el valor un lado del cuadrado: ");
                double lado = entrada.nextDouble();
                // Creacion del objeto
                Cuadrado1 Cuad = new Cuadrado1(lado,nombre);
                Cuad.calcularAreaCuad();
                System.out.println("El area del Cuadrado es: " + Cuad.getAreaCuad());
                break;
            case 3:
                nombre = "Rectangulo";
                System.out.println("Ingrese el valor la base del Rectangulo: ");
                double base = entrada.nextDouble();

                System.out.println("Ingrese el valor de la altura del Rectangulo: ");
                double altura = entrada.nextDouble();
                // Creacion del objeto
                Rectangulo1 Rect= new Rectangulo1(base, altura ,nombre);
                Rect.calcularAreaRect();

                System.out.println("El area del Rectangulo es: " + Rect.getAreaRecta());
                break;
             case 4 :
                 nombre = "Triangulo";
                System.out.println("Ingrese el valor la base del Triangulo: ");
                double baseT= entrada.nextDouble();

                System.out.println("Ingrese el valor de la altura del Triangulo: ");
                double alturaT = entrada.nextDouble();
                // Creacion del objeto
                Triangulo1 Tri = new Triangulo1(baseT, alturaT ,nombre);
                Tri.calcularAreaTri();


                System.out.println("El area del Rectangulo es: " + Tri.getAreaTria());
                break;

        }
    }
}

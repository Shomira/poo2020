package polimorfismo_Figura;

import herenciaFigura.Circulo;
import herenciaFigura.Cuadrado1;
import herenciaFigura.Rectangulo1;
import herenciaFigura.Triangulo1;

import java.util.Scanner;

public class EjecutaFigura2 {
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
                // Creacion del objeto
                Circulo2  Cir = new Circulo2();

                // Ingreso de datos y actualizacion de los valores de las variables que se encuentran en las subclases
                System.out.println("Ingrese el radio del circulo: ");
                Cir.setRadio(entrada.nextDouble());

                Cir.calcularArea();
                System.out.println("El area del Triangulo  es:" +Cir.getArea());
                break;
            case 2:
                nombre = "Cuadrado";
                // Creacion del objeto
                Cuadrado2 Cuad = new Cuadrado2();

                // Ingreso de datos y actualizacion de los valores de las variables que se encuentran en las subclases
                System.out.println("Ingrese el valor un lado del cuadrado: ");
                Cuad.setLadoCuad(entrada.nextDouble());

                Cuad.calcularArea();
                System.out.println("El area del Cuadrado es: " + Cuad.getArea());
                break;
            case 3:
                nombre = "Rectangulo";
                // Creacion del objeto
                Rectangulo2 Rect = new Rectangulo2();

                // Ingreso de datos y actualizacion de los valores de las variables que se encuentran en las subclases
                System.out.println("Ingrese el valor la base del Rectangulo: ");
                Rect.setBaseRecta(entrada.nextDouble());

                System.out.println("Ingrese el valor de la altura del Rectangulo: ");
                Rect.setAlturaRecta(entrada.nextDouble());

                Rect.calcularArea();

                System.out.println("El area del Rectangulo es: " + Rect.getArea());
                break;
            case 4 :
                nombre = "Triangulo";
                // Creacion del objeto
                Triangulo2 Tri =  new Triangulo2();

                // Ingreso de datos y actualizacion de los valores de las variables que se encuentran en las subclases
                System.out.println("Ingrese el valor la base del Triangulo: ");
                Tri.setBaseTria(entrada.nextDouble());

                System.out.println("Ingrese el valor de la altura del Triangulo: ");
                Tri.setAlturaTria(entrada.nextDouble());

                Tri.calcularArea();
                System.out.println("El area del Rectangulo es: " + Tri.getArea());
                break;

        }
    }
}

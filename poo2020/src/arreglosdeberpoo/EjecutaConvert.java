package arreglosdeberpoo;

import java.util.Scanner;

public class EjecutaConvert {
    public static void main(String[] args) {

        // Crear objeto para entrada de datos por el teclado
        Scanner entrada =  new Scanner(System.in);
        System.out.println("_______ CONVERTIDOR DE NUMEROS BINARIOS EN DECIMALES _________");
        String numero ;
        // Se declara, crea e inicia el objeto de la clase Vectores
        Convert  conv = new Convert();
        //Ingreso de datos
        System.out.println("Ingrese un numero en sistema binario de 6 digitos:");
        numero = entrada.nextLine();
        // Establecer
        conv.setNum(numero);
        // Calcular
        conv.calcular_decimal();
        // Imprimir
        System.out.println("--------- Salida ----------");
        System.out.println("El numero binario: " + numero+ " en base Decimal es: "+conv.getResult());

        }
    }


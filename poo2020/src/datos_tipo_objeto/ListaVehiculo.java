package datos_tipo_objeto;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class ListaVehiculo {
    public static void main(String[] args) {
        // declaracion de variables
        String placa, modelo, marca, color;
        int anio;
        double cil;

        Scanner entrada = new Scanner(System.in);
        // Creacion de una list con el tipo de dato vehiculo
        List<Vehiculo2> vehiculos = new ArrayList<Vehiculo2>();

        System.out.println("----SISTEMA DE INGRESO DE VEHICULOS----");

        // Declaracion de variable apra controlar el ciclo do while
        boolean band = true;
        do{
            System.out.println(" Digite 1 para ingresar nuevo.\nDigite 2 para presentar.\nDigite 3 para salir");
            int op = entrada.nextInt();
            switch (op){
                case 1:
                    System.out.println("Ingrese placa: ");
                    placa = entrada.nextLine();
                    System.out.println("Ingrese marca: ");
                    marca = entrada.nextLine();
                    System.out.println("Ingrese modelo: ");
                    modelo = entrada.nextLine();
                    System.out.println("Ingrese color: ");
                    color = entrada.nextLine();
                    System.out.println("Ingrese anio: ");
                    anio = entrada.nextInt();
                    System.out.println("Ingrese Cilindraje ");
                    cil = entrada.nextDouble();
                    // creacion de objeto de tipo vehiculo
                    Vehiculo2 Veh = new Vehiculo2(placa,marca,anio,modelo,color,cil);
                    break;
                case 2:




            }

        }while();
    }
}

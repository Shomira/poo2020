package diseniopo;

import java.util.Scanner;

public class EjecutaCerveza {
    public static void main(String[] args) {
        // objeto que trabaaja con datos de entrada
        Scanner  entrada = new Scanner(System.in);
        //Ingreso de datos
        System.out.println("Nombre de la cerveza : ");
        String nombre = entrada.nextLine();
        System.out.println("Tipo cerveza: ");
        String tipo = entrada.nextLine();
        System.out.println("Ingrese el costo: ");
        double precio = entrada.nextDouble();
        System.out.println("Ingrese el numero de unidades: ");
        int unidades = entrada.nextInt();
        // Creacion del objeto
        Cerveza cerveza = new Cerveza(precio,unidades,nombre, tipo );

        System.out.println("Cerveza: "+ nombre+"\nTipo:" + tipo+ "\nUnidades Vendidas: "
                +unidades+"\nTotal en ventas es: "+cerveza.calcular_ventas(unidades, precio ));
        // Impresion de datos de la ficha
         cerveza.crear_ficha(nombre, tipo, unidades, cerveza.calcular_ventas(unidades,precio));


        // Objeto que trabaja con datos quemados

        Cerveza cerveza1 = new Cerveza(1.50,34,"Pilsener","normal");
        // accede

        Double total_ventas = cerveza1.getUnidades_vendidas() * cerveza1.getPrecio();
        System.out.println("Precio: "+ cerveza1.getPrecio() + "\nUnidades Vendidas: " +
                cerveza1.getUnidades_vendidas()+"\nNombre: " + cerveza1.getNombre()+ "\nTipo:"+
                cerveza1.getTipo() + "\nTotal ventas: " + total_ventas );



    }
}

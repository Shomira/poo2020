package intropoo;

import diagramaClase.Ejemplo1;

public class EjecutaTiempo {

    public static void main(String[] args) {
        // Creacion de objetos tiempo
        Tiempo tiempo = new Tiempo();
        tiempo.actualizar_hora(10);
        tiempo.actualizar_minuto(52);
        tiempo.actualizar_segundo(44);
        String mostrar_t = tiempo.obtener_Tiempo();
        System.out.println(mostrar_t);

    }

}
package diagramaClase;

public class EjecutaComputadora {
    public static void main(String[] args) {
        // Creacion de objetos tiempo
        Computadora comp1 = new Computadora();
        comp1.actualizar_color("blanco");
        comp1.actualizar_tamaño("16 pulg");
        comp1.actualizar_peso(18.9);
        comp1.actualizar_marca("ASUS");
        comp1.actualizar_generacion("9th Gen");
        // obtencion de datos
        String color = comp1.obtener_color();
        String tamaño = comp1.obtener_tamaño();
        Double peso = comp1.obtener_peso();
        String marca = comp1.obtener_marca();
        String generacion = comp1.obtener_generacion();

        comp1.mostrar();
        comp1.procesar();
        comp1.almacenar();
        comp1.buscar();
    }
}

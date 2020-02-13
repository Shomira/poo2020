package diagramaClase;

public class EjecutaCelular {
    public static void main(String[] args) {
        //creacion de objetos Docente
        Celular celular = new Celular();
        celular.actualizar_precio(600.00);
        celular.actualizar_marca("Xiaomi");
        celular.actualizar_ram("6 RAM");
        celular.actualizar_procesador("Octa-core Max");



        double t = celular.obtener_precio();
        String t1 = celular.obtener_marca();

        String t4 = celular.obtener_procesador();


        celular.llamar();
        celular.grabar();
        celular.mensajear();

    }
}

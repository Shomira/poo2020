package diagramaClase;

public class EjecutaDocente {
    public static void main(String[] args) {
        // Creacion de objetos tiempo
        Docente docente1 = new Docente();
        docente1.actualizar_nombre("Richard");
        docente1.actualizar_titulo("Ing");
        docente1.actualizar_correo("rsguaya.utpl.edu.ec");
        docente1.actualizar_cedula("11530459097");
        docente1.actualizar_celular("09867894522");
        // obtencion de datos

        String nombre = docente1.obtener_nombre();
        String correo = docente1.obtener_correo();
        String titulo = docente1.obtener_titulo();
        String cedula = docente1.obtener_cedula();
        String celular = docente1.obtener_celular();

        docente1.enseñar();
        docente1.calificar();
        docente1.usarInstalaciones();
        docente1.investigar();
        docente1.guiar();
    }
}

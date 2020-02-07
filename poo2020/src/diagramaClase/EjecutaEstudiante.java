
package diagramaClase;

//promedio

public class EjecutaEstudiante {
    public static void main(String[] args) {
        // Creacion de objetos tiempo
        Estudiante estudiante1 = new Estudiante();
        estudiante1.actualizar_nombre("Shields");
        estudiante1.actualizar_carrera("Computacion");
        estudiante1.actualizar_correo("example20@.gmail.com");
        estudiante1.actualizar_cedula("11530151765");
        estudiante1.actualizar_celular("0984647563");
        // obtencion de datos
        //String promedio = estudiante1.actualizar_promedio();
        //String aprobacion = estudiante1.obtener_aprobacion(promedio);
        String nombre = estudiante1.obtener_nombre();
        String correo = estudiante1.obtener_correo();
        String carrera = estudiante1.obtener_carrera();
        String cedula = estudiante1.obtener_cedula();
        String celular = estudiante1.obtener_celular();

        estudiante1.estudiar();
        estudiante1.jugar();
        estudiante1.aprender();
        estudiante1.usarInstalaciones();
    }

}

package datos_tipo_objeto;

public class Estudiante {
    private String cedula;
    private int edad;
    private String nombre;
    private String carrera;
    private String correo;

    public Estudiante(){

    }
// Cuando se tiene mas constructores se llama sobrecarga de metodos

    public Estudiante(String cedula, int edad, String nombre, String carrera, String correo) {
        this.cedula = cedula;
        this.edad = edad;
        this.nombre = nombre;
        this.carrera = carrera;
        this.correo = correo;
    }

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCorreo() {
        return correo;
    }

    /**
     *
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
}

package herencia;
/**
 * Clse que hereda de la clse persona.
 * Contendra todos los atributos y objetos definidos en persona
 * Con la palabra resevada extends
 */
public class Estudiante extends Persona{

    /**
     * Constructor para la clse estudiante
     * @param carrera
     * @param nom
     * @param ident
     * @param estadoCivil
     * @param fechaNaci
     */
    public Estudiante (String carrera, String nom , String ident, String estadoCivil, String fechaNaci){
        this.carrera = carrera;
        this.nombre = nombre;
        this.identificacion = ident;
        this.estadoCivil = estadoCivil;
        this.fechaNaci = fechaNaci;


    }

    // Atributos propios de la clase Estudiante
    private String carrera;

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public void matricular(){
        System.out.println("Metodo para matricular");

    }
    public void aprender(){
        System.out.println("metodo para aprender");

    }
}

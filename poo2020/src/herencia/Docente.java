package herencia;
/**
 * Clse que hereda de la clse persona.
 * Contendra todos los atributos y objetos definidos en persona
 * con la palabra reservada estends
 */
public class Docente extends Persona{
    // Atributos propios de la clase Docente
    private String area;

    public Docente(String area, String nom , String ident, String estadoCivil, String fechaNaci){
        this.area = area;
        this.nombre = nombre;
        this.identificacion = ident;
        this.estadoCivil = estadoCivil;
        this.fechaNaci = fechaNaci;

    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    public void enseniar(){
        System.out.println("Metodo para enseniar" );
    }
    public void calificar(){
        System.out.println("Metodo para calificar ");
    }
}

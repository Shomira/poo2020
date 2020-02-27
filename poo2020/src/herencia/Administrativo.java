package herencia;

/**
 * Clse que hereda de la clse persona.
 * Contendra todos los atributos y objetos definidos en persona
 */
public class Administrativo extends Persona {
    // Atributos propios de la clase Administrativo
    private String dependencia;

    public Administrativo(String dependencia, String nom , String ident, String estadoCivil, String fechaNaci){
        this.dependencia = dependencia;
        this.nombre = nombre;
        this.identificacion = ident;
        this.estadoCivil = estadoCivil;
        this.fechaNaci = fechaNaci;

    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }
    public void gestionarPro(){
        System.out.println("Metodo para gestionar procesos");
    }

}

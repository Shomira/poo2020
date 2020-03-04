package herenciaVolumen;

public class VolFigura {
    // Atribut que sera heredado
    protected String nombre;

    /**
     * Metodo que obtiene el valor de la vsriable nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que establece el valor de la variable nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

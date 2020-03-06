package polimorfismoVolumen;

public abstract class VolFigura2 {
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

    /**
     * Metodo para calcular el volumen de la figura y que lo heredan las clases hijas
      */
    public abstract double calcularVolumen();

}

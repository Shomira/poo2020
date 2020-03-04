package polimorfismo_Figura;

public abstract class Figura2 {
    // Atribut que sera heredado
    protected String nombre;
    protected double area;


    /**
     * Metodo Abstracto, que sera implementaod dentro de las clases hijas
     */
    public abstract void calcularArea();
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
     *
     * @return
     */
    public double getArea() {
        return area;
    }

}

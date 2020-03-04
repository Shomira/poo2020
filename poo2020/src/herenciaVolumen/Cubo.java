package herenciaVolumen;
// Llamado a la clase de cual hereda atributos
public class Cubo extends  VolFigura{
    private double arista;
    private double volumenCub;
    private String nombre;

    /**
     * Creacion del metodo constructor
     * @param arista
     * @param nombre
     */
    public Cubo(double arista, String nombre){
        this.arista = arista;
        this.nombre= nombre;

    }

    /**
     * Metodo que calcula el volumen del cubo
     * @return volumen cubo
     */
    public double calcularVolumenCub(){
        volumenCub = Math.pow(arista,3);
        return volumenCub;
    }

    /**
     * Metodo que obtiene el valor de la variable
     * @return arista
     */
    public double getArista() {
        return arista;
    }

    /**
     * Metodo que actualiza el valor de la variable
     * @param arista
     */
    public void setArista(double arista) {
        this.arista = arista;
    }

    /**
     * Metodo que obtiene el valor de la variable
     * @return volumnCub
     */
    public double getVolumenCub() {
        return volumenCub;
    }

    /**
     * Metodo que actualiza el valor de la variable
     * @param volumenCub
     */
    public void setVolumenCub(double volumenCub) {
        this.volumenCub = volumenCub;
    }
}
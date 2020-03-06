package polimorfismoVolumen;

public class Cubo2 extends VolFigura2 {
    private double arista;
    private double volumenCub;
    private String nombre;

    /**
     * Creacion del metodo constructor
     * @param arista
     * @param nombre
     */
    public Cubo2(double arista, String nombre){
        this.arista = arista;
        this.nombre= nombre;

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

    /**
     * Metodo para calcular el volumen de la figura y que lo heredan las clases hijas
     */
    @Override
    public double calcularVolumen() {
        volumenCub = Math.pow(arista,3);
        return volumenCub;
    }
}

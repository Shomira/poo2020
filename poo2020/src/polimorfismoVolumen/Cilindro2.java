package polimorfismoVolumen;

public class Cilindro2 extends VolFigura2{
    private double radioCild;
    private double alturaCild;
    private double volumenCild;

    /**
     * Metodo Constructor
     * @param radioCild
     * @param alturaCild
     * @param nombre
     */
    public Cilindro2(double radioCild, double alturaCild, String nombre){
        this.radioCild = radioCild;
        this.alturaCild = alturaCild;
        this.nombre= nombre;

    }



    /**
     * Metodo pra obtener el valor de la variable RadioCil
     * @return radiocil
     */
    public double getRadioCild() {
        return radioCild;
    }

    /**
     * Metodo para establecr el valor de la variable radio
     * @param radioCild
     */
    public void setRadioCild(double radioCild) {
        this.radioCild = radioCild;
    }

    /**
     * Metodo para obtener el valor de la variable Altura del cilindro
     * @return alturaCild
     */
    public double getAlturaCild() {
        return alturaCild;
    }

    /**
     * metodo para eztablecer el valor de la variable altura del cilindro
     * @param alturaCild
     */
    public void setAlturaCild(double alturaCild) {
        this.alturaCild = alturaCild;
    }

    /**
     * Metodo para obtener el valor de la variable volumen cilindro
     * @return volumen Cild
     */
    public double getVolumenCild() {
        return volumenCild;
    }

    /**
     * Metodo para Actualizar el valor de la variable volumen cilindro
     * @param volumenCild
     */
    public void setVolumenCild(double volumenCild) {
        this.volumenCild = volumenCild;
    }

    /**
     * Metodo para calcular el volumen del cilindro
     * @return volumenCild
     */
    @Override
    public double calcularVolumen() {
        volumenCild = 3.14*Math.pow(radioCild,2)*alturaCild;
        return volumenCild;

    }
}

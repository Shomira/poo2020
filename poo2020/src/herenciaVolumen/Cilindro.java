package herenciaVolumen;

public class Cilindro extends VolFigura{
    private double radioCild;
    private double alturaCild;
    private double volumenCild;

    /**
     * Metodo Constructor
     * @param radioCild
     * @param alturaCild
     * @param nombre
     */
    public Cilindro(double radioCild, double alturaCild, String nombre){
        this.radioCild = radioCild;
        this.alturaCild = alturaCild;
        this.nombre= nombre;

    }

    public double calcularVolumenCild(){
        volumenCild = 3.14*Math.pow(radioCild,2)*alturaCild;
        return volumenCild;


    }
    public double getRadioCild() {
        return radioCild;
    }

    public void setRadioCild(double radioCild) {
        this.radioCild = radioCild;
    }

    public double getAlturaCild() {
        return alturaCild;
    }

    public void setAlturaCild(double alturaCild) {
        this.alturaCild = alturaCild;
    }

    public double getVolumenCild() {
        return volumenCild;
    }

    public void setVolumenCild(double volumenCild) {
        this.volumenCild = volumenCild;
    }
}


package herenciaVolumen;
// llamado a la clase de cual hereda atributos
public class Cono extends VolFigura{
    private double radioCono;
    private double alturaCono;
    private double volumenCono;

    /**
     * metodo constructor para la clase Cono
     * @param radioCono
     * @param alturaCono
     * @param nombre
     */
    public Cono(double radioCono, double alturaCono, String nombre){
        this.radioCono =  radioCono;
        this.alturaCono = alturaCono;
        this.nombre= nombre;

    }

    /**
     * Metodo que caldula el Volumen del cono
     * @return volumen Cono
     */
    public double calcularVolumenCono(){
        volumenCono = ((Math.PI*Math.pow(radioCono,2)*alturaCono)/3);
        return volumenCono;


    }

    /**
     * Metodo que obtiene  el valor de la variable radio Cono
     * @return radio COno
     */
    public double getRadioCono() {
        return radioCono;
    }

    /**
     * Metodo que actualiza el valor de la variable radio del cono
     * @param radioCono
     */
    public void setRadioCono(double radioCono) {
        this.radioCono = radioCono;
    }

    /**
     * Metodo que obtiene el valor de la variable Altura
     * @return altura cono
     */
    public double getAlturaCono() {
        return alturaCono;
    }

    /**
     * \Metodo que actualiza el valor de la variblae altura cono
     * @param alturaCono
     */
    public void setAlturaCono(double alturaCono) {
        this.alturaCono = alturaCono;
    }

    /**
     * Metodo que obtiene el valor de la varibale volumen cono
     * @return
     */
    public double getVolumenCono() {
        return volumenCono;
    }

    /**
     * Metodo que actualiza el valor de la variable volumne cono
     * @param volumenCono
     */
    public void setVolumenCono(double volumenCono) {
        this.volumenCono = volumenCono;
    }
}

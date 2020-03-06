package polimorfismoVolumen;

public class Esfera2 extends VolFigura2{
    private double radio;
    private  double volumenEs;


    /**
     * Creacio del metodo constructor usando las variables de la clase heredada
     * @param radio
     * @param nombre
     */
    public Esfera2(double radio, String nombre){
        this.radio = radio;
        this.nombre= nombre;


    }

    /**
     * Metodo que obtienen el valor del radio de la esfera
     * @return radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     *  Metodo que establece el valord el rado de la esfera
     * @param radio
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * metodo que obtiene el valor de la variable volumen Es
     * @return volumenEs
     */
    public double getVolumenEs() {
        return volumenEs;
    }

    /**
     * Metodo que establece el valor de la variable volumenEs
     * @param volumenEs
     */
    public void setVolumenEs(double volumenEs) {
        this.volumenEs = volumenEs;
    }
    /**
     * metodo que permite calcular le volumen de la espera
     */

    /**
     * Metodo para calcular el volumen de la figura y que lo heredan las clases hijas
     */
    @Override
    public double  calcularVolumen() {
        // Mth.PI  es el valor de pi
        volumenEs = (4* (Math.PI * Math.pow(radio,3)))/3;
        return  volumenEs;

    }
}

package herenciaVolumen;

public class Cono extends VolFigura{
    private double radioCono;
    private double alturaCono;
    private double volumenCono;


    public Cono(double radioCono, double alturaCono, String nombre){
        this.radioCono =  radioCono;
        this.alturaCono = alturaCono;
        this.nombre= nombre;

    }

    public double calcularVolumenCono(){
        volumenCono = ((Math.PI*Math.pow(radioCono,2)*alturaCono)/3);
        return volumenCono;


    }

    public double getRadioCono() {
        return radioCono;
    }

    public void setRadioCono(double radioCono) {
        this.radioCono = radioCono;
    }

    public double getAlturaCono() {
        return alturaCono;
    }

    public void setAlturaCono(double alturaCono) {
        this.alturaCono = alturaCono;
    }

    public double getVolumenCono() {
        return volumenCono;
    }

    public void setVolumenCono(double volumenCono) {
        this.volumenCono = volumenCono;
    }
}

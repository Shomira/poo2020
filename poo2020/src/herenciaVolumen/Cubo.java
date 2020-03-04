package herenciaVolumen;

public class Cubo extends  VolFigura{
    private double arista;
    private double volumenCub;
    private String nombre;

    public Cubo(double arista, String nombre){
        this.arista = arista;
        this.nombre= nombre;

    }
    public double calcularVolumenCub(){
        volumenCub = Math.pow(arista,3);
        return volumenCub;
    }


    public double getArista() {
        return arista;
    }

    public void setArista(double arista) {
        this.arista = arista;
    }

    public double getVolumenCub() {
        return volumenCub;
    }

    public void setVolumenCub(double volumenCub) {
        this.volumenCub = volumenCub;
    }
}
package herenciaVolumen;

public class Esfera extends  VolFigura{
    private double radio;
    private  double volumenEs;



    public Esfera(double radio,  String nombre){
        this.radio = radio;
        this.nombre= nombre;


    }
    public double calcularVolEs(){
        volumenEs = (4* (Math.PI * Math.pow(radio,3)))/3;
        return volumenEs;
    }
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getVolumenEs() {
        return volumenEs;
    }

    public void setVolumenEs(double volumenEs) {
        this.volumenEs = volumenEs;
    }
}

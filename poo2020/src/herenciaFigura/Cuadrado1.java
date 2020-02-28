package herenciaFigura;

public class Cuadrado1 extends Figura{
    private double ladoCuad;
    private double areaCuad;

    public Cuadrado1(double ladoCuad, String nombre){
        this.ladoCuad = ladoCuad;
        this.nomFigura = nombre;

    }
    public double calcularAreaCuad(){
        areaCuad = Math.pow(ladoCuad,2) ;
        return areaCuad;

    }
    public double getLadoCuad() {
        return ladoCuad;
    }

    public void setLadoCuad(double ladoCuad) {
        this.ladoCuad = ladoCuad;
    }

    public double getAreaCuad() {
        return areaCuad;
    }

    public void setAreaCuad(double areaCuad) {
        this.areaCuad = areaCuad;
    }
}

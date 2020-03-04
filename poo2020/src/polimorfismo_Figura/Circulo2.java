package polimorfismo_Figura;

public class Circulo2 extends Figura2{
    private double radio;


    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Metodo Abstracto, que sera implementaod dentro de las clases hijas
     */
    @Override
    public void calcularArea() {
        area = 3.14*(Math.pow(radio,2));
    }
}

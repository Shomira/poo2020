package polimorfismo_Figura;

public class Triangulo2 extends Figura2 {
    private double baseTria;
    private double alturaTria;


    /**
     * Metodo para establecer el valor de la variable
     * @param baseTria
     */
    public void setBaseTria(double baseTria) {
        this.baseTria = baseTria;
    }

    /**
     * Metodo para establecer el valor de la variable
     * @param alturaTria
     */
    public void setAlturaTria(double alturaTria) {
        this.alturaTria = alturaTria;
    }

    /**
     * Metodo Abstracto, que sera implementaod dentro de las clases hijas
     */
    @Override
    public void calcularArea() {
        area = (baseTria * alturaTria)/2;

    }
}

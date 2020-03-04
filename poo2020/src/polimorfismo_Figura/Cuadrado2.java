package polimorfismo_Figura;

public class Cuadrado2 extends  Figura2 {
    private double ladoCuad;


    /**
     * Metodo p[ara establecer el vALOR DE LA CVARIABLE LADO CUADRADO
     * @param ladoCuad
     */
    public void setLadoCuad(double ladoCuad) {
        this.ladoCuad = ladoCuad;
    }

    /**
     * Metodo Abstracto, que sera implementaod dentro de las clases hijas
     */
    @Override
    public void calcularArea() {
        area = Math.pow(ladoCuad,2) ;
    }
}

package polimorfismo_Figura;

public class Rectangulo2 extends Figura2 {
    private double baseRecta;
    private double alturaRecta;


    /**
     * Metodo para establecer el valor de la variable Base dle rectangulo
     * @param baseRecta
     */
    public void setBaseRecta(double baseRecta) {
        this.baseRecta = baseRecta;
    }

    /**
     * Metodo que establece el valor de la variable
     * @param alturaRecta
     */
    public void setAlturaRecta(double alturaRecta) {
        this.alturaRecta = alturaRecta;
    }

    /**
     * Metodo Abstracto, que sera implementaod dentro de las clases hijas
     */
    @Override
    public void calcularArea() {
        area = baseRecta * alturaRecta;

    }
}

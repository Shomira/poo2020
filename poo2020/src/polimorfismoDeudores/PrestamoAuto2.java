package polimorfismoDeudores;

public class PrestamoAuto2 extends ClienteDeudor2{
    private double intGeAu;

    /**
     * metodo constructor con las variables heredadas
     * @param numCu
     * @param numCl
     * @param nom
     * @param capPrest
     * @param plazo
     */
    public PrestamoAuto2(String  numCu, int numCl, String nom, double capPrest, int plazo){
        this.setNumCuentaD(numCu);
        this.numClienteD = numCl;
        this.nomD = nom;
        this.capPrest = capPrest;
        this.plazoInvD = plazo;


    }

    /**
     * metodo que obtiene el valor de la variable
     * @return intGeAu
     */
    public double getIntGeAu() {
        return intGeAu;
    }

    /**
     * metodo qeu actualiza el valor de la variable
     * @param intGeAu
     */
    public void setIntGeAu(double intGeAu) {
        this.intGeAu = intGeAu;
    }

    @Override
    public void CalcularInt() {
        tazaInt = 0.15;
        intGeAu = capPrest * (intGeAu * plazoInvD);

    }
}

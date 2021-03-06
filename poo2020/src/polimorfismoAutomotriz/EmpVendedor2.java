package polimorfismoAutomotriz;

public class EmpVendedor2 extends Empleado2{
    private double precioAuto;
    private int numAutos;
    private double sueldoQuinV;
    private double valorventa;

    /**
     * Metodo constructor Generado a base de los atributos heredados de la clase Empleado
     * @param nombre
     * @param dep
     * @param pues
     */
    public EmpVendedor2(String nombre,  String dep, String pues ){
        this.nombre = nombre;
        this.departamento =  dep;
        this.puesto = pues;
    }

    /**
     *
     */


    /**
     * metodo que obtiene el valor de la vairbale precio
     * @return precioAuto
     */
    public double getPrecioAuto() {
        return precioAuto;
    }

    public void setPrecioAuto(double precioAuto) {
        this.precioAuto = precioAuto;
    }

    /**
     * Metodo que obtiene el valor de la variable
     * @return numAutos
     */
    public int getNumAutos() {
        return numAutos;
    }

    /**
     * Metodo que actualiza el valor de la varibale numAutos
     * @param numAutos
     */

    public void setNumAutos(int numAutos) {
        this.numAutos = numAutos;
    }

    /**
     * Metodoq ue obtiene el valor de la variable
     * @return sueldoQuinV
     */
    public double getSueldoQuinV() {
        return sueldoQuinV;
    }

    /**
     * Metodo que estabece el valor de la variable sueldo quincenal
     * @param sueldoQuinV
     */
    public void setSueldoQuinV(double sueldoQuinV) {
        this.sueldoQuinV = sueldoQuinV;
    }

    /**
     * Metodo que calcula el sueldo quqincenal drl vendedor
     */
    @Override
    public void CalcularSueldoQuin() {
        double sueldo = 0;
        for(int i = 0; i<numAutos; i++){
            sueldo = precioAuto * 0.02;
            sueldo += sueldo;

        }
        sueldoQuinV += sueldo;

    }
}

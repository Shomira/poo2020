package polimorfismoAutomotriz;

public class EmpAdmvo2 extends Empleado2{
    private  double sueldoMensual;
    private double sueldoQuinAd;

    /**
     * Metodo constructor usando Herencia desde la clase Empleado
     * @param SueldoMensual
     * @param nombre
     * @param dep
     * @param pues
     */
    public EmpAdmvo2(double SueldoMensual,String nombre,  String dep, String pues ){
        this.sueldoMensual = SueldoMensual;
        this.nombre = nombre;
        this.departamento =  dep;
        this.puesto = pues;
    }


    /**
     * Metodo para obtener el valor de la variable SueldoMensual
     * @return sueldoMensual
     */
    public double getSueldoMensual() {
        return sueldoMensual;
    }

    /**
     * Metodo para actualizar  el valor de la variable SueldoMensual
     * @param sueldoMensual
     */
    public void setSueldoMensual(double sueldoMensual) {
        sueldoMensual = sueldoMensual;
    }

    public double getSueldoQuinAd() {
        return sueldoQuinAd;
    }

    public void setSueldoQuinAd(double sueldoQuinAd) {
        this.sueldoQuinAd = sueldoQuinAd;
    }

    /**
     * Metodo para calcular el sueldo del Administrador
     */

    /**
     * Metodo para calcular El sueldo QUinsenal
     */
    @Override
    public void CalcularSueldoQuin() {
        sueldoQuinAd =  sueldoMensual /2;
    }
}

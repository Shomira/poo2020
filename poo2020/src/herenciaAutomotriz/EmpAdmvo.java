package herenciaAutomotriz;

public class EmpAdmvo extends Empleado {
    private  double sueldoMensual;
    private double sueldoQuinAd;

    public EmpAdmvo(double SueldoMensual,String nombre,  String dep, String pues ){
        this.sueldoMensual = SueldoMensual;
        this.nombre = nombre;
        this.departamento =  dep;
        this.puesto = pues;
    }
    public void calcularQuinA(){
        sueldoQuinAd =  sueldoMensual /2;

    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        sueldoMensual = sueldoMensual;
    }

    public double getSueldoQuinAd() {
        return sueldoQuinAd;
    }

    public void setSueldoQuinAd(double sueldoQuinAd) {
        this.sueldoQuinAd = sueldoQuinAd;
    }
}

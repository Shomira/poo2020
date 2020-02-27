package herenciaEmpleado;

public class EmpleadoHoras extends Empleado{
    private int horas;
    private double cuotaH;
    private double sueldo;

    public EmpleadoHoras(String nombre, String cargo, String dependencia, int horas, double cuotaH){
        this.nombre = nombre;
        this.cargo = cargo;
        this.departamento = dependencia;
        this.horas = horas;
        this.cuotaH = cuotaH;
    }
    public double  calcularSueldo(){

        setSueldo(horas * cuotaH);
        return getSueldo();
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }


    public double getCuotaH() {
        return cuotaH;
    }

    public void setCuotaH(double cuotaH) {
        this.cuotaH = cuotaH;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}

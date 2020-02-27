package herenciaEmpleado;

public class EmpleadoSueldoFij extends Empleado{
    private double valorMensual;

    public EmpleadoSueldoFij(String nombre, String cargo, String dependencia, double valorMensual){
        this.nombre = nombre;
        this.cargo = cargo;
        this.departamento = dependencia;
        this.valorMensual = valorMensual ;
    }

    public double getValorMensual() {
        return valorMensual;
    }

    public void setValorMensual(double valorMensual) {
        this.valorMensual = valorMensual;
    }
}

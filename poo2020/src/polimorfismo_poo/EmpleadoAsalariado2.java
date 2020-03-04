package polimorfismo_poo;

public class EmpleadoAsalariado2 extends Empleado12 {
    private double sueldoMensual;

    /**
     * Metodo para obtener el valor de la variable sueldomENSUAL
     * @return
     */
    public double getSueldoMensual() {
        return sueldoMensual;
    }
    /**
     * Metodo para establecer el valor de la variable Sueldo Mensual
     * @param sueldoMensual
     */
    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    /**
     * Implementacion dentro de las clases hijas del  Metodo Abstracto creado dentro de la clase padre
     */
    @Override

    public void calcularSueldoQna() {
        // Almacena en la VARIABLE  mheredada sueldo
        sueldo = sueldoMensual /2;

    }
}

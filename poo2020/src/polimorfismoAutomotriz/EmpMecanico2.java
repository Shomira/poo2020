package polimorfismoAutomotriz;

public class EmpMecanico2 extends Empleado2  {
    private int numTrabajos;
    private double cuotaTra;
    private double sueldo;
    private double sueldoQuin;

    /**
     * metodo constructor
     * @param nombre
     * @param dep
     * @param pues
     */
    public EmpMecanico2(String nombre,  String dep, String pues ){
        this.nombre = nombre;
        this.departamento =  dep;
        this.puesto = pues;
    }

    /**
     * metodo para obtener el valor de la variable Num Trabajos
     * @return numTrabajos
     */

    public int getNumTrabajos() {
        return numTrabajos;
    }

    /**
     * Metodo para Establecer el valor de la variable
     * @param numTrabajos
     */
    public void setNumTrabajos(int numTrabajos) {
        this.numTrabajos = numTrabajos;
    }

    /**
     * metodo para obtener el valor de la variable cuotaTra
     * @return cuotaTra
     */
    public double getCuotaTra() {
        return cuotaTra;
    }

    /**
     * Metodo para Establecer el valor de la variable
     * @param cuotaTra
     */
    public void setCuotaTra(double cuotaTra) {
        this.cuotaTra = cuotaTra;
    }

    /**
     * metodo para obtener el valor de la variable Num Trabajos
     * @return sueldo
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * Metodo para Establecer el valor de la variable
     * @param sueldo
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * metodo para obtener el valor de la variable sueldoQuin
     * @return sueldoQuin
     */
    public double getSueldoQuin() {
        return sueldoQuin;
    }

    /**
     * Metodo para Establecer el valor de la variable
     * @param sueldoQuin
     */
    public void setSueldoQuin(double sueldoQuin) {
        this.sueldoQuin = sueldoQuin;
    }

    /**
     * Metodo para Calcular el Sueldo Quincenal del Mecanico
     */

    /**
     * Metodo para calcular El sueldo QUinsenal
     */
    @Override
    public void CalcularSueldoQuin() {
        sueldo = 0;
        for (int i = 0 ; i< numTrabajos; i++) {
            sueldo = cuotaTra * 0.04;
            sueldoQuin += sueldo;
        }

    }
}

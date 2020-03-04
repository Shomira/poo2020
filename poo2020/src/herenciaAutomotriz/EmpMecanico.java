package herenciaAutomotriz;

public class EmpMecanico {
    private int numTrabajos;
    private double cuotaTra;
    private double sueldo;
    private double sueldoQuin;


    public void calcularQuinM(){
        sueldo = 0;
        for (int i = 0 ; i< numTrabajos; i++) {
            sueldo = cuotaTra * 0.04;
            sueldoQuin += sueldo;
        }
    }

    public int getNumTrabajos() {
        return numTrabajos;
    }

    public void setNumTrabajos(int numTrabajos) {
        this.numTrabajos = numTrabajos;
    }

    public double getCuotaTra() {
        return cuotaTra;
    }

    public void setCuotaTra(double cuotaTra) {
        this.cuotaTra = cuotaTra;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldoQuin() {
        return sueldoQuin;
    }

    public void setSueldoQuin(double sueldoQuin) {
        this.sueldoQuin = sueldoQuin;
    }
}

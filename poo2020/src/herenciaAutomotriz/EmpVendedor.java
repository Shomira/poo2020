package herenciaAutomotriz;

public class EmpVendedor {
    private double precioAuto;
    private int numAutos;
    private double sueldoQuinV;
    private double valorventa;

    public void calcularQuinV(){
        double sueldo = 0;
        for(int i = 0; i<numAutos; i++){
            sueldo = precioAuto * 0.02;
            sueldo += sueldo;

        }
        sueldoQuinV += sueldo;

    }


    public double getPrecioAuto() {
        return precioAuto;
    }

    public void setPrecioAuto(double precioAuto) {
        this.precioAuto = precioAuto;
    }

    public int getNumAutos() {
        return numAutos;
    }

    public void setNumAutos(int numAutos) {
        this.numAutos = numAutos;
    }

    public double getSueldoQuinV() {
        return sueldoQuinV;
    }

    public void setSueldoQuinV(double sueldoQuinV) {
        this.sueldoQuinV = sueldoQuinV;
    }
}

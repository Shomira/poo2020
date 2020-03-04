package polimorfismo_poo;

public class EmpleadoPorHoras2 extends  Empleado12{
    // Atributos propios de la clase empleado por horas
    private int horasTr;
    private double cuotaHora;

    // Tambien se extienden los atributos de la clase padre
    /**
     * Metodo para establecer el valor de la variable cuotaHora
     * @param cuotaHora
     *
     */
    public void setCuotaHora(double cuotaHora) {
        this.cuotaHora = cuotaHora;
    }

    /**
     * Metodo para estBLECER el valor a la variable horasTr
     * @param horasTr
     */
    public void setHorasTr(int horasTr) {
        this.horasTr = horasTr;
    }
    // que empiezan con @ son anotaciones, que sirven para anotar comportamientos, @override significa sobreescrito
    @Override
    public void calcularSueldoQna() {
        sueldo = horasTr * cuotaHora;

    }
    // Tambien se extienden los metodos de la clase padre
}

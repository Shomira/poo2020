package polimorfismo_poo;

public abstract  class Empleado12 {
    // Definicion de atributos protegidos para que puedan se heredados
    protected String nombre;
    protected String departamento;
    protected String puesto;
    protected double sueldo;

    /**
     * Metodo Abstracto, que sera implementaod dentro de las clases hijas
     */
    public abstract void calcularSueldoQna();
    /**
     * Metodo que opbtiene el valor de la
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * metodo para establecer el valor de la variable
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * metodo para obteneer el valor de la variable departamento
     * @return departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Metodo para actualizar el valor de la variable
     * @param departamento
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     *metodo que obtiene el valor de la variable puesto
     * @return
     */
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

}

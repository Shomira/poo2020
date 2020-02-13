package deber_seleccion;

public class PromedioEstudiante {
    private String nombre;
    private double calf1;
    private double calf2;
    private double calf3;
    private double calf4;
    private double promedio;
    private String observacion;


    /**
     * Metodo para calcular el promedio de estudiante y mediante el mismo determinar si aprobo o no
     * @param nombre
     * @param calf1
     * @param calf2
     * @return result
     */
    public String obtener_Promedio (String nombre, double calf1, double calf2, double calf3, double calf4 ){
        String result = "";
        double suma = calf1 + calf2 + calf3 + calf4 ;
        if (suma > 60){
            result = "El alumno "+ nombre +" esta Aprobado con una nota de: " + suma;
        }else{
            result = "El alumno "+ nombre +" esta Reprobado con una nota de: " + suma;;
        }
        return result;
    }


    /**
     * Metodo que obtiene el valor de la variable nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para actualizar el valor de la variable nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener el valor de la variable Calf1
     * @return calf1
     */
    public double getCalf1() {
        return calf1;
    }

    /**
     * Metodo para ctualizar el valor de la variable calf1
     * @param calf1
     */
    public void setCalf1(double calf1) {
        this.calf1 = calf1;
    }

    /**
     * Metodo para obtener el valor de la variable Calf2
     * @return calf2
     */
    public double getCalf2() {
        return calf2;
    }

    /**
     * Metodo para ctualizar el valor de la variable calf2
     * @param calf2
     */
    public void setCalf2(double calf2) {
        this.calf2 = calf2;
    }

    /**
     * Metodo para obtener el valor de la variable Calf3
     * @return calf3
     */
    public double getCalf3() {
        return calf3;
    }

    /**
     * Metodo para ctualizar el valor de la variable calf3
     * @param calf3
     */
    public void setCalf3(double calf3) {
        this.calf3 = calf3;
    }

    /**
     * Metodo para obtener el valor de la variable Calf4
     * @return calf4
     */
    public double getCalf4() {
        return calf4;
    }

    /**
     * Metodo para ctualizar el valor de la variable calf4
     * @param calf4
     */
    public void setCalf4(double calf4) {
        this.calf4 = calf4;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}

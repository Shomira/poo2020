package diseniopo;
/*
* Para el próxmimo día miércoles 12 de febrero realizar las siguientes actividades:
Leer desde la página 264, 273, control de lectura
Deber.  Determinar si un estudiante de UTPL aprueba o no y con que nota una materia, si aprueba
* con normalidad o si se queda a supletorios.  Considerar que la asignatura tiene 2 bimestres.
*  El análisis del problema se debe realizar en una hoja a mano y la implementación en el proyecto,
*  dentro del paquete diseniopoo, subir al github
* */

public class EstudianteUtpl {
    private String nombre;
    private String carrera;
    private String area;
    private String materia;
    private String correo;
    private int edad;
    private String cedula;
    private int numCicloActual;
    private double promedio;
    private String tipoSangre;
    private String Direccion;
    private String sexo;
    private String celular;
    private double notaBim1;
    private double notaBim2;

    /**
     * Metodo para calcular el promedio de estudiante y mediante el mismo determinar si aprobo o no
     * @param nombre
     * @param notaBim1
     * @param notaBim2
     * @return
     */
    public String obtener_Promedio (String nombre, double notaBim1, double notaBim2 ){
        String result = "";
        double suma = notaBim1 + notaBim2;
        if (suma >=27.50){
            result = "El alumno "+ nombre +" esta Aprobado con una nota de: " + suma;
        }else{
            result = "El alumno "+ nombre +" esta Reprobado con una nota de: " + suma;;
        }
        return result;
    }


    /**
     * Metodo para obtener  el valor para la variable nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para actualizar la variable nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener el valor para la variable carrera
     * @return carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * Metodo para actualizar la variable carrera
     * @param carrera
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * Metodo para obtener el valor para la variable area
     * @return area
     */
    public String getArea() {
        return area;
    }

    /**
     * Metodo para actualizar al variable Area
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * Metodo para obtener el valor de la variable Materia
     * @return
     */
    public String getMateria() {
        return materia;
    }

    /**
     * Metodo para actualizar la variable materia
     * @param materia
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }

    /**
     * Metodo para obtener el valor de la variable correo
     * @return correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Metodo para actualizar el valor de la variable correo
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Metodo para obtener el valor de la variable  edad
     * @return edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Metodo para actualizar el vlaor de la variable edad
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     *Metodo para obtener el valor de la variable cedula
     * @return cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Metodo para actualizar el valor de la variable cedula
     * @param cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Metodo para obtener el valor de la variable numCicloActual
     * @return  numCicloActual
     */
    public int getNumCicloActual() {
        return numCicloActual;
    }

    /**
     * Metodo para actualizar el valor de la variable NumCicloActual
     * @param numCicloActual
     */
    public void setNumCicloActual(int numCicloActual) {
        this.numCicloActual = numCicloActual;
    }

    /**
     * Metodo para obtener el valor de la variable Promedio
     * @return promedio
     */
    public double getPromedio() {
        return promedio;
    }

    /**
     * Metodo para actualizar el valor de la variable Promedio
     * @param promedio
     */
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    /**
     * Metodo para obtener el valor de variable TipoSnagre
     * @return tipoSangre
     */
    public String getTipoSangre() {
        return tipoSangre;
    }

    /**
     *  Metodo para actualizar la variable TipoSangre
     * @param tipoSangre
     */
    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    /**Metodo para obtener el valor de la variable Direccion
     *
     * @return direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * \Metodo para actualizar el valor de la variable direccion
     * @param direccion
     */
    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
    /**Metodo para obtener el valor de la variable Sexo
     *
     * @return sexo
     */
    public String getSexo() {
        return sexo;
    }
    /**Metodo para actualizar el valor de la variable sexo
     *
     * @param sexo
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * Metodo para obtener el valor de la variable celular
     * @return celular
     */
    public String getCelular() {
        return celular;
    }
    /**Metodo para actualizar el valor de la variable celular
     *
     * @param celular
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * Metodo para obtener el valor de la variable notaBim2
     * @return notaBim1
     */
    public double getNotaBim1() {
        return notaBim1;
    }
    /**Metodo para actualizar el valor de la variable notaBim1
     *
     * @param notaBim1
     */
    public void setNotaBim1(double notaBim1) {
        this.notaBim1 = notaBim1;
    }

    /**
     * Metodo para obtener el valor de la variable notaBim1
     * @return notaBim2
     */
    public double getNotaBim2() {
        return notaBim2;
    }
    /**Metodo para actualizar el valor de la variable notaBim2
     *
     * @param notaBim2
     */
    public void setNotaBim2(double notaBim2) {
        this.notaBim2 = notaBim2;
    }
}
package diagramaClase;

public class Estudiante {
    private String nombre;
    private String correo;
    private int edad;
    private String cedula;
    private String celular;
    private String Direccion;
    private String sexo;
    private String carrera;
    private String area;
    private String numMaterias;
    private int ciclo;
    private float promedio;
    private String tipoSangre;
    private String estadoCivil;

    /**
     *Metodo para obtener el valor de aprobacion del estudiante
     * @param promedio
     * @return promedioEs
     */

    public String obtener_aprobacion(float promedio){
        String promedioEs;
        if (this.promedio >= 28.0){
                promedioEs = "Aprobado";
         }else{
             promedioEs = "Resprobado";
        }
        //return Integer.parseInt(promedioEs);
        return promedioEs;
    }

    /**
     * Metodo para obtener el valor del la variable nombre
     * @return nombre
     */
    public String  obtener_nombre(){
        String nombre = "";
        return nombre;
    }

    /**
     * Metodo para obtener el correo
     * @return correo
     */
    public String  obtener_correo(){
        String correo = "";
        return correo;
    }

    /**
     * Metodo para obtener el valor para la variable  carrera
     * @return carrera
     */

    public String obtener_carrera(){
        this.carrera = carrera;
        return carrera;
    }

    /**
     * metodo para obtener  el valor de la variable cedula
     * @return cedula
     */
    public String  obtener_cedula(){
        String cedula = "";
        return cedula;
    }

    /**
     * Metodo para  obtener el valor de la variable celular
     * @return celular
     */
    public String  obtener_celular(){
        String celular = "";
        return celular;
    }
    ///////////////////////////////

    /**
     *
     * @param promedio
     */
    public void  actualizar_promedio(float promedio ){
        // Asigna a la variable global la local
        // Con el this hacemos referencia a variables globales
        this.promedio = promedio;

    }
    /**
     * Metod que actualiza la variable nombre
     * @param nombre
     */
    public void  actualizar_nombre(String nombre ){
        // Asigna a la variable global la local
        // Con el this hacemos referencia a variables globales
        this.nombre = nombre;

    }

    /**
     * Metodo para actualizar la variable carrera
     * @param carrera
     */

    public void  actualizar_carrera(String carrera){
        // Asigna a la variable global la local
        // Con el this hacemos referencia a variables globales
        this.carrera = carrera;

    }

    /**
     * Metodo para actualizar la variable correo
     * @param correo
     */

    public void  actualizar_correo(String correo){
        // Asigna a la variable global la local
        // Con el this hacemos referencia a variables globales
        this.correo = correo;

    }
    /**
     * Metodo para actualizar la variable cedula
     * @param cedula
     */

    public void  actualizar_cedula(String cedula){
        // Asigna a la variable global la local
        // Con el this hacemos referencia a variables globales
        this.cedula = cedula;

    }
    /**
     * Metodo para actualizar la variable celular
     * @param celular
     */

    public void  actualizar_celular(String celular){
        // Asigna a la variable global la local
        // Con el this hacemos referencia a variables globales
        this.celular = celular;

    }

    /**
     * Metodo para estudiar
     */
    public void  estudiar(){

    }

    public void  jugar(){

    }
    public void  aprender(){

    }
    public void  usarInstalaciones(){


    }

}

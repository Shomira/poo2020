package diagramaClase;

public class Universidad {
    private String carreras;
    private int num_estudiantes;
    private int num_docentes;
    private int num_administrativos;
    private String infraestructura;
    private String departamentos;
    private String tipo;
    private String materias;


    /**
     * Metodo para obtener el valor del la variable carreras
     * @return carreras
     */
    public String  obtener_carreras(){
        return carreras;
    }

    /**
     * Metodo para obtener el el valor para al variable num_estudiantes
     * @return num_estudiantes
     */
    public int obtener_num_estudiantes(){
        return num_estudiantes;
    }

    /**
     * Metodo para obtener el valor para la variable  num_docentes
     * @return num_docentes
     */

    public int obtener_num_docentes(int num_docentes){
        this.num_docentes = num_docentes;
        return num_docentes;
    }

    /**
     * metodo para obtener  el valor de la variable cedula
     * @return cedula
     */
    public int  obtener_num_administrativos(){
        return num_administrativos;
    }

    /**
     * Metodo para  obtener el valor de la variable celular
     * @return celular
     */
    public String  obtener_infraestructura(){

        return infraestructura;
    }
    ///////////////////////////////

    /**
     * Metod que actualiza la variable carreras
     * @param carreras
     */
    public void  actualizar_nombre(String carreras ){
        // Asigna a la variable global la local
        // Con el this hacemos referencia a variables globales
        this.carreras= carreras;

    }

    /**
     * Metodo para actualizar la variable num_ewstudiantes
     * @param num_estudiantes
     */

    public void  actualizar_fechaNacimiento(int num_estudiantes){
        // Asigna a la variable global la local
        // Con el this hacemos referencia a variables globales
        this.num_estudiantes = num_estudiantes;

    }

    /**
     * Metodo para actualizar la variable num_docentes
     * @param num_docentes
     */

    public void  actualizar_correo(int num_docentes){
        // Asigna a la variable global la local
        // Con el this hacemos referencia a variables globales
        this.num_estudiantes = num_docentes;

    }
    /**
     * Metodo para actualizar la variable num_administrativos
     * @param num_administrativos
     */

    public void  actualizar_cedula(int num_administrativos){
        // Asigna a la variable global la local
        // Con el this hacemos referencia a variables globales
        this.num_administrativos = num_administrativos;

    }
    /**
     * Metodo para actualizar la variable infraestructura
     * @param infraestructura
     */

    public void  actualizar_celular(String infraestructura){
        // Asigna a la variable global la local
        // Con el this hacemos referencia a variables globales
        this.infraestructura = infraestructura;

    }

    /**
     * Metodos para universidad
     */
    public void  orientar(){

    }

    public void  investigar(){

    }
    public void formar(){

    }
    public void  cobrar(){

    }
    public void  certificar(){

    }

}


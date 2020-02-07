package diagramaClase;

public class Docente {
    private String nombre;
    private String correo;
    private int edad;
    private String cedula;
    private String celular;
    private String Direccion;
    private String sexo;
    private String titulo;
    private String areaTrabajo;
    private String tipoSangre;
    private String estadoCivil;

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
     * Metodo para obtener el valor para la variable  titulo
     * @return titulo
     */

    public String obtener_titulo(String titulo){
        this.titulo = titulo;
        return titulo;
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
     * Metod que actualiza la variable nombre
     * @param nombre
     */
    public void  actualizar_nombre(String nombre ){
        // Asigna a la variable global la local
        // Con el this hacemos referencia a variables globales
        this.nombre = nombre;

    }

    /**
     * Metodo para actualizar la variable titulo
     * @param titulo
     */

    public void  actualizar_titulo(String titulo){
        // Asigna a la variable global la local
        // Con el this hacemos referencia a variables globales
        this.titulo = titulo;

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
     * Metodo para enseñar
     */
    public void  enseñar(){
        System.out.println("Metodo para enseniar ");

    }

    public void  calificar(){
        System.out.println("Metodo para calificar");

    }
    public void  investigar(){
        System.out.println("Metodo para investigar");

    }
    public void  usarInstalaciones(){
        System.out.println("Metodo para Usar Instalaciones");

    }
    public void  guiar(){

        System.out.println("Metodo para guiar");
    }

}


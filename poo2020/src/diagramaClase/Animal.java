package diagramaClase;

public class Animal{
    private float peso;
    private String tipo;
    private  String nombre;
    private  String especie;
    private  String region;
    private String sexo;
    private String tipo_reproduccion;

    /**
     * Metodo para obtener el valor de la variable peso
     * @return this.peso
     */

    // Creacion de metodos
    public float obtener_peso(){
        return this.peso;
    }
    /**
     * Metodo para obtener el valor de la variable tipo
     * @return tipo
     */

    public String  obtener_tipo(){
        return tipo;
    }
    /**
     * Metodo para obtener el valor de la variable nombre
     * @return this.nombre
     */

    public String obtener_nombre(){
        return this.nombre;
    }

    /**
     * Metodo para obtener el valor de la variable especie
     * @return especie
     */

    public String obtener_especie(){
        return especie;
    }

    /**
     * Metodo para obtener el valor de la variable region
     * @return region
     */
    public String obtener_region(){
        return region;
    }

    /**
     * Metodo para obtener el valor de la variable tipo_reproduccion
     * @return tipo_reproduccion
     */
    public String  obtener_tipo_reproduccion(){
        return tipo_reproduccion ;
    }

    ///////////////////////////////

    /**
     * Metod que actualiza la variable peso
     * @param peso
     */
    public void  actualizar_peso(float peso ){
        // Asigna a la variable global la local
        // Con el this hacemos referencia a variables globales
        this.peso = peso;

    }
    /**
     * Metodo para actualizar la variable tipo
     * @param tipo
     */

    public void  actualizar_tipo(String tipo){
        // Asigna a la variable global la local
        // Con el this hacemos referencia a variables globales
        this.tipo = tipo;

    }

    /**
     * Metodo para actualizar la variable nombre
     * @param nombre
     */

    public void  actualizar_nombre(String nombre){
        // Asigna a la variable global la local
        // Con el this hacemos referencia a variables globales
        this.nombre = nombre;

    }

    /**
     * Metodo para actualizar la variable especie
     * @param especie
     */

    public void  actualizar_especie(String  especie){
        // Asigna a la variable global la local
        // Con el this hacemos referencia a variables globales
        this.especie = especie;

    }

    /**
     * Metodo para actualizar la variable region
     * @param region
     */

    public void  actualizar_region(String region){
        // Asigna a la variable global la local
        // Con el this hacemos referencia a variables globales
        this.region = region;

    }

    public void  respirar(){

    }

    public void  alimentarse(){

    }
    public void  reproducirse(){

    }


}

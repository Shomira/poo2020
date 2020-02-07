package diagramaClase;

public class Celular {
    private float precio;
    private String marca;
    private float peso;
    private int ram;
    private int capacidad_gb;
    private String procesador;
    private String pulgadas;
    private String material;
    private float bateria ;
    private int camara;

    /**
     * Metodo para obtener el valor de la variable precio
     * @return this.precio
     */

    // Creacion de metodos
    public float  obtener_precio(){
        return this.precio;
    }
    /**
     * Metodo para obtener el valor de la variable marca
     * @return marca
     */

    public String  obtener_marca(){
        return marca;
    }
    /**
     * Metodo para obtener el valor de la variable peso
     * @return this.peso
     */

    public float  obtener_peso(){
        return this.peso;
    }

    /**
     * Metodo para obtener el valor de la variable ram
     * @return ram
     */

    public int obtener_ram(){
        return ram;
    }

    /**
     * Metodo para obtener el valor de la variable capacidad_gb
     * @return capacidad_gb
     */
    public int obtener_capacidad_gb(){
        return capacidad_gb ;
    }

    /**
     * Metodo para obtener el valor de la variable procesador
     * @return procesador
     */
    public String  obtener_procesador(){
        return procesador ;
    }

    ///////////////////////////////

    /**
     * Metod que actualiza la variable precio
     * @param precio
     */
    public void  actualizar_precio(float precio ){
        // Asigna a la variable global la local
        // Con el this hacemos referencia a variables globales
        this.precio = precio;

    }
    /**
     * Metodo para actualizar la variable marca
     * @param marca
     */

    public void  actualizar_marca(String marca){
        // Asigna a la variable global la local
        // Con el this hacemos referencia a variables globales
        this.marca = marca;

    }

    /**
     * Metodo para actualizar la variable peso
     * @param peso
     */

    public void  actualizar_peso(float peso){
        // Asigna a la variable global la local
        // Con el this hacemos referencia a variables globales
        this.peso = peso;

    }

    /**
     * Metodo para actualizar la variable ram
     * @param ram
     */

    public void  actualizar_peso(int ram){
        // Asigna a la variable global la local
        // Con el this hacemos referencia a variables globales
        this.ram = ram;

    }

    /**
     * Metodo para actualizar la variable cappacidad_gb
     * @param capacidad_gb
     */

    public void  actualizar_capacidad_gb(int capacidad_gb){
        // Asigna a la variable global la local
        // Con el this hacemos referencia a variables globales
        this.capacidad_gb = capacidad_gb;

    }

    public void  llamar(){

    }

    public void  grabar(){

    }
    public void  mensajear(){

    }
    public void  navegarr(){

    }
    public void  fotografiar(){

    }
    public void  localizar(){

    }

}

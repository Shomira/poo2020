package diagramaClase;

public class Computadora {
    private String color;
    private String tamaño;
    private double peso;
    private String marca;
    private String generacion;
    private String procesador;
    private String fechaCompra;
    private String velocidadPorcesador;

    /**
     * Metodo para obtener el valor de la variable color
     * @return this.color
     */

    // Creacion de metodos
    public String  obtener_color(){
        return this.color;
    }
    /**
     * Metodo para obtener el valor de la variable tamaño
     * @return tamaño
     */

    public String  obtener_tamaño(){
        return tamaño;
    }
    /**
     * Metodo para obtener el valor de la variable peso
     * @return this.peso
     */

    public double obtener_peso(){
        return this.peso;
    }

    /**
     * Metodo para obtener el valor de la variable marca
     * @return marca
     */

    public String  obtener_marca(){
        return marca;
    }

    /**
     * Metodo para obtener el valor de la variable generacion
     * @return generacion
     */
    public String obtener_generacion(){
        return generacion;
    }

    /**
     * Metodo para obtener el valor de la variable fechaCOmpra
     * @return fechaCompra
     */
    public String  obtener_fechaCompra(){
        String tiempo = "Dia,mes, año";
        return fechaCompra;
    }

    ///////////////////////////////

    /**
     * Metod que actualiza la variable color
     * @param color
     */
    public void  actualizar_color(String color ){
        // Asigna a la variable global la local
        // Con el this hacemos referencia a variables globales
        this.color = color;

    }

    /**
     * Metodo para actualizar la variable tamaño
     * @param tamaño
     */

    public void  actualizar_tamaño(String tamaño){
        // Asigna a la variable global la local
        // Con el this hacemos referencia a variables globales
        this.tamaño = tamaño;

    }

    /**
     * Metodo para actualizar la variable peso
     * @param peso
     */

    public void  actualizar_peso(double peso){
        // Asigna a la variable global la local
        // Con el this hacemos referencia a variables globales
        this.peso = peso;

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
     * Metodo para actualizar la variable generacion
     * @param generacion
     */

    public void  actualizar_generacion(String generacion){
        // Asigna a la variable global la local
        // Con el this hacemos referencia a variables globales
        this.generacion = generacion;

    }

    public void  mostrar(){

    }

    public void  procesar(){

    }
    public void  almacenar(){

    }
    public void  buscar(){

    }

}

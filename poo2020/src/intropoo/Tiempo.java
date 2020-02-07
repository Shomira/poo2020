package intropoo;

public class Tiempo {
    // Definicion de atributos  globales
    private int  hora;
    private int minuto;
    private int segundo;

    /**
     * Metodo para obtener el valor de la variable hora
     * @return this.hora
     */

    // Creacion de metodos
    public int  obtener_hora(){
        return this.hora;
    }
    /**
     * Metodo para obtener el valor de la variable minuto
     * @return minuto
     */

    public int  obtener_minuto(){
        return minuto;
    }
    /**
     * Metodo para obtener el valor de la variable segundo
     * @return this.segundo
     */

    public int  obtener_segundo(){
        return this.segundo;
    }

    /**
     * Metodo para obtener el tiempo en formato hh:mm:ss
     * @return tiempo
     */

    // Devuelve la hora completa
    public String  obtener_Tiempo(){
        String tiempo = hora+":"+ minuto+":"+ segundo;
        return tiempo;
    }

    /**
     * Metodo para actualizar la variable  hora
     * @param hora
     */
    // No devuelve nada solo actualiza la variable hora
    public void  actualizar_hora(int hora){
        // Asigna a la variable global la local
        // Con el this hacemos referencia a variables globales
        this.hora = hora;

    }

    /**
     * Metodo para actualizar la variable minuto
     * @param minuto
     */

    public void  actualizar_minuto(int minuto){
        // Asigna a la variable global la local
        // Con el this hacemos referencia a variables globales
        this.minuto = minuto;

    }

    /**
     * Metodo para actualizar la variable segundo
     * @param segundo
     */

    public void  actualizar_segundo(int segundo){
        // Asigna a la variable global la local
        // Con el this hacemos referencia a variables globales
        this.segundo = segundo;

    }





}

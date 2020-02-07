package diseniopo;

public class Cerveza {
    private double precio;
    private int unidades_vendidas ;
    private String nombre;
    private String tipo;

    public Cerveza(double precio, int unidades_vendidas, String nombre, String tipo){
        this.precio = precio;
        this.unidades_vendidas = unidades_vendidas;
        this.nombre = nombre;
        this.tipo =  tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidades_vendidas() {
        return unidades_vendidas;
    }

    public void setUnidades_vendidas(int unidades_vendidas) {
        this.unidades_vendidas = unidades_vendidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    // Creacion de un metodo al que se le envia parametros y los concatena
    public void crear_ficha(String nombre, String tipo, int unidades_vendidas, double precio ){
        System.out.println("Cerveza: "+  nombre+"\nTipo:" + tipo+ "\nUnidades Vendidas: "+ unidades_vendidas +"\nTotal en ventas es: "+ precio);
    }
    // mtodo para calcular las ventas
    public double calcular_ventas(int unidades_vendidas, double precio){
        double calcular_ventas =  unidades_vendidas*precio;
        return calcular_ventas;
    }

}

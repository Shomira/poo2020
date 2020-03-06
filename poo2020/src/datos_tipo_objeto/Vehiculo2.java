package datos_tipo_objeto;

public class Vehiculo2 {
    private String placa;
    private String marca;
    private int anio;
    private String modelo;
    private String color;
    private double cilindraje;

    public Vehiculo2(String placa, String marca, int anio, String modelo, String color, double cilindraje) {
        this.placa = placa;
        this.marca = marca;
        this.anio = anio;
        this.modelo = modelo;
        this.color = color;
        this.cilindraje = cilindraje;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}

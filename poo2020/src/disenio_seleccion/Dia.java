package disenio_seleccion;

public class Dia {
    private int  numDia;
    private String nombreDia;

    /**
     * Metod que nos permite calcular el nombre del dia
     */
    public void calcularNombreDia()
    {
        switch (numDia)
        {
            case 1:
                nombreDia = "Domingo";
                break;
            case 2:
                nombreDia = "Lunes";
                break;
            case 3:
                nombreDia = "Martes";
                break;
            case 4:
                nombreDia = "Miercoles";
                break;
            case 5:
                nombreDia = "Jueves";
                break;
            case 6:
                nombreDia = "Viernes";
                break;
            case 7:
                nombreDia = "Sabado";
                break;
            default:
                nombreDia = "No esta en el rango de 1 a 7";
        }

    }

    /**
     * Metodo que obtiene el valor de la variable numDia
     * @return numDia
     */
    public int getNumDia() {
        return numDia;
    }

    /**
     * Metodo que actualiza el valor de la variable num
     * @param num
     */
    public void setNumDia(int num) {
        this.numDia = num;
    }

    /**
     * Metodo que obtiene el valor de nombreDia
     * @return nombreDia
     */
    public String getNombreDia() {
        return nombreDia;
    }

    /**
     * Metodo que actualiza el valor de la variable nombre
     * @param nombre
     */
    public void setNombreDia(String nombre) {
        this.nombreDia = nombre;
    }
}

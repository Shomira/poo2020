package arreglosdeberpoo;
public class Cedula {
    private String cedula;
    private String mensaje;
    private int digitoV ;
    // Inicializacion del arreglo de los coeficientes que seran multiplicadors
    private int [] arregloCo = {2,1,2,1,2,1,2,1,2};
    private int mult = 0;
    private int suma = 0;


    public Cedula(String cedula){
        this.cedula = cedula;
    }
    /**
     * Metodo para convertir Sting a enteros
     * @return nums[]
     */
    public int[] convert(){
        int[] arreglo = new int[cedula.length()];
        for(int i=0; i<cedula.length(); i++){
            // convierte los char en int
            arreglo[i] = Character.getNumericValue(cedula.charAt(i));
        }
        return arreglo;
    }

    /**
     * Metodo para obtener suma
     * @return
     */
    public int Suma(){
        for (int i = 0; i < 9; i++) {
            mult = convert()[i] * arregloCo[i];
            // Si la suma e mayor o igual a 10 se le resta 9
            if (mult >= 10){
                mult = mult - 9;
            }
            suma = suma + mult;
        }
        return suma;
    }

    public String  CompCedula(){
        String mensaje = "";
        digitoV = 0;
        digitoV = 10 - (Suma()%10);

        if (digitoV == 10){
            digitoV = 0;
        }
        // Impresion del digito verificador
        System.out.println("Digito verificador : " + digitoV );
        if (digitoV == convert()[9]){
            mensaje = "El numero de cedula es correcto";
        }else{
            mensaje = "Cedula incorrecta";
        }
        return mensaje;
    }
}
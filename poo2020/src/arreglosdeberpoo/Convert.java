package arreglosdeberpoo;

public class Convert {
    private String num;
    private int result;

    public void calcular_decimal() {
        int numero = Integer.parseInt(num);
        // Creacion de arreglo
        int[] esEnteros = new int[6];

        int c = 5;
        // Almacena los valores de cada uno
        for (int i = 0; i < esEnteros.length ; i++) {
            // Comandos qeu asigna el valor ultimo a la posicion primera
            esEnteros[c] = (int)((numero/Math.pow(10,i))%10);
            c--;
        }
        c= 5;
        // Ciclo que itera cada posicion realizando al respectivamultiplicacion con base 2
        for(int b= 0 ;b < esEnteros.length;b++){
            result +=  (esEnteros[b]* (int)Math.pow(2,c));
            System.out.println("Iteracion valor: " +esEnteros[b]);
            c--;
            setResult(result);
        }
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }


    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

}


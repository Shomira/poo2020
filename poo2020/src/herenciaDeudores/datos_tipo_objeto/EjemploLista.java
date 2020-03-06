package datos_tipo_objeto;

// Importacion para al creacion de las listas
import java.util.ArrayList;
import java.util.List;

public class EjemploLista {
    public static void main(String[] args) {
        // Creacion de una lista en java para almacenar valores de tipo String
        List<String> uni = new ArrayList<String>();
        uni.add("Utpl");
        System.out.println("Tamaño de la lista  "+ uni.size());
        uni.add("UTPL");
        System.out.println("Tamaño de la lista  "+ uni.size());
        uni.add("ESPOL");
        System.out.println("Tamanño de la lista  "+ uni.size());
        System.out.println(uni.size() );

        // Eliminacion del elemento en la posicion1
        uni.remove(1);
        // Recorreremos la lista
        System.out.println("Lista recorrida con el for ");
        for(int i = 0; i<uni.size(); i++ ){

            System.out.println(uni.get(i));
        }

        // Reemplaazar un valor indicado en la lista
        uni.set(0,"UIDE");
        /*Primera opcion
        for(int i = 0; i<uni.size(); i++ ){
            System.out.println(uni.get(i));
        }
    */
        System.out.println("-------------------------");
        // foreach parar recorrer lista universidades
        // una variable de tipo string itera los valores de la lista uni
        for(String univ : uni){
            System.out.println(univ);
        }
    }
}

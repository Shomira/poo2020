package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNombre {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<String> nombres = new ArrayList<String>();
        int op = 1;

        for (int i= 0; op < 3; i++){
            // Presentacion del menu
            System.out.println("DIGITE UNA OPCION:\n1.Agregar nuevo nombre\n2.Presentar lista de nombre\n3. Salir");
            op = entrada.nextInt();
            entrada.nextLine();
            if(op == 1 ){
                System.out.println("Ingrese un nombre: ");
                // Agregar los valores a una lista
                nombres.add(entrada.nextLine());
            }else if (op == 2){
                System.out.println(" Presentacion de las listas ");
                for(int a = 0; a<nombres.size(); a++ ){
                    // get acceder a las posiciones de las listas
                    System.out.println(nombres.get(a));
                }
            }else {
                op = 4;
            }


        }

    }
}

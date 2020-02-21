package arreglosdeberpoo;
import java.util.Scanner;
public class EjecutaFichaEs {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nom[] = new String[5];
        int edad[] = new int[5];
        String uni[] = new String[5];
        String cel[] = new String[5];
        int numEs = 5;
        System.out.println("____INGRESO DE DATOS____");
        for (int i=0, r=1; i< numEs;i++, r++){
            // Ingreso de datos del estudiante
            System.out.println("Ingrese el nombre  del estudiante " + r+": ");
            nom[i] = entrada.nextLine();

            System.out.println("Ingrese la edad del estudiante " + r+": ");
            edad[i]= entrada.nextInt();
            entrada.nextLine();

            System.out.println("Ingrese las iniciales de la universidad del estudiante " + r+": ");
            uni[i] = entrada.nextLine().toUpperCase();

            System.out.println("Ingrese el numero de celular del estudiante" + r+": ");
            cel[i] = entrada.nextLine();


        }
        // Crear e iniciar el objeto
        FichaEs Ficha = new FichaEs();
        // Establecer
        Ficha.setCel(cel);
        Ficha.setNom(nom);
        Ficha.setEdad(edad);
        Ficha.setUni(uni);
        // Obtener
        Ficha.getCel();
        Ficha.getNom();
        Ficha.getEdad();
        Ficha.getUni();
        Ficha.ImprmirDatos();



    }
}

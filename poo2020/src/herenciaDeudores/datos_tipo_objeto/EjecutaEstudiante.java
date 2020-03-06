package datos_tipo_objeto;
import java.util.Scanner;
public class EjecutaEstudiante {
    public static void main(String[] args) {
        // Declaracion de variables
        int c;
        double acumEd =  0;
        Estudiante [] estudiantes = new Estudiante[2];
        Estudiante est;
        boolean band = true;

        Scanner entrada = new Scanner(System.in);
        for (c = 0; c < estudiantes.length; c++) {
           //entrada.nextLine();
            Estudiante estu = new Estudiante();
            System.out.println("Ingrese  el nombre del estudiante");
            estu.setNombre(entrada.nextLine());
            System.out.println("Ingrese el numero de cedula ");
            estu.setCedula(entrada.nextLine());
            System.out.println("Ingrese la edad del estudiante ");
            estu.setEdad(entrada.nextInt());
            entrada.nextLine();
            System.out.println("Ingrese el nombre de la carrera que cursa ");
            estu.setCarrera(entrada.nextLine());
            System.out.println("Ingrese el correo del estudiante ");
            estu.setCorreo(entrada.nextLine());

            // Asignamos erl objeto est a la variable estu
            //est = estu;
            estudiantes[c] = estu;
        }
        System.out.println(" LISTA DE ESTUDIANTES");
        System.out.println("Cedula\t\tNombre");
        for(c = 0; c < estudiantes.length; c++){
            System.out.println(estudiantes[c].getCedula()+"\t\t"+estudiantes[c].getNombre());
            acumEd += estudiantes[c].getEdad();

        }
        System.out.println("Imprimir promedio edad estudiantes : "+ acumEd /estudiantes.length);
    }
}

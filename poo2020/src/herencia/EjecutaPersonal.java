package herencia;
import java.util.Date;
import java.util.Scanner;
public class EjecutaPersonal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Declaracion de variables
        String nombre, ident, estadoCivil, carrera, fechaNaci;

        System.out.println("\tCREACION DE OBJETO ESTUDIANTE ");
        System.out.println(" Ingrese el nombre : ");
        nombre = entrada.nextLine();

        System.out.println(" Ingrese la identificacion: ");
        ident = entrada.nextLine();

        System.out.println(" Ingrese el estado civil");
        estadoCivil = entrada.nextLine();

        System.out.println(" Igrese la fecha de nacimiento");
        fechaNaci = entrada.nextLine();

        System.out.println(" Ingrese el nombre de la carrera");
        carrera = entrada.nextLine();
        // creacion del objeto de la clase Estudiante luego de recibir los valores
        herencia.Estudiante es = new herencia.Estudiante(carrera, nombre, ident, estadoCivil, fechaNaci);

        System.out.println("________________________________________");
        System.out.println(" Datos objeto estudiante");
        System.out.println("Nombre: " + es.getNombre() + "\nIdentificacion: " + es.getIdentificacion()+ "\nCarrera: "
                + es.getCarrera()+ "\nEstado Civil: " + es.getEstadoCivil()+"\nFecha Nacimiento: " + es.getFechaNaci());


        // Declaracion de variables Docente
        String nombreDc, identDc, estadoCivilDc, area, fechaNaciDc;
        System.out.println("\tCREACION DE OBJETO DOCENTE");
        System.out.println(" Ingrese el nombre : ");
        nombreDc = entrada.nextLine();

        System.out.println(" Ingrese la identificacion: ");
        identDc = entrada.nextLine();

        System.out.println(" Ingrese el estado civil");
        estadoCivilDc = entrada.nextLine();

        System.out.println(" Igrese la fecha de nacimiento");
        fechaNaciDc = entrada.nextLine();

        System.out.println(" Ingrese el nombre del area");
        area = entrada.nextLine();
        // creacion del objeto de la clase Estudiante luego de recibir los valores
       Docente dc = new Docente(area, nombreDc, identDc, estadoCivilDc, fechaNaciDc);

        System.out.println("________________________________________");
        System.out.println(" Datos objeto Docente");
        System.out.println("Nombre: " + dc.getNombre() + "\nIdentificacion: " + dc.getIdentificacion()+ "\nCarrera: "
                + dc.getArea()+ "\nEstado Civil: " + dc.getEstadoCivil()+"\nFecha Nacimiento: " + dc.getFechaNaci());

        // Declaracion de variables Docente
        String nombreA, identA, estadoCivilA, dependencia, fechaNaciA;
        System.out.println("\tCREACION DE OBJETO Administrativo");
        System.out.println(" Ingrese el nombre : ");
        nombreA = entrada.nextLine();

        System.out.println(" Ingrese la identificacion: ");
        identA = entrada.nextLine();

        System.out.println(" Ingrese el estado civil");
        estadoCivilA = entrada.nextLine();

        System.out.println(" Igrese la fecha de nacimiento");
        fechaNaciA = entrada.nextLine();

        System.out.println(" Ingrese el nombre de la dependencia");
        dependencia = entrada.nextLine();
        // creacion del objeto de la clase Estudiante luego de recibir los valores
        Administrativo Ad = new Administrativo(dependencia, nombreA, identA, estadoCivilA, fechaNaciA);

        System.out.println("________________________________________");
        System.out.println(" Datos objeto Administrativo     ");
        System.out.println("Nombre: " + Ad.getNombre() + "\nIdentificacion: " + Ad.getIdentificacion()+ "\nCarrera: "
                + Ad.getDependencia()+ "\nEstado Civil: " + Ad.getEstadoCivil()+"\nFecha Nacimiento: " + Ad.getFechaNaci());


    }
}

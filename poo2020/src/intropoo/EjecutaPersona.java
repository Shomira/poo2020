package intropoo;

public class EjecutaPersona {
    public static void main(String[] args) {
        //Creacion de objeto, con inicializacion de valores usos del constructor persona

        Persona persona = new Persona("Femenino", "Católica", 20, "Persona1");
        System.out.println("\nNombre: "+persona.getNombre()+"\nGénero: "+ persona.getGenero()+"\nEdad: "+persona.getEdad()+
                "\nReligión: "+persona.getReligion());

        //Creaciion de objeto con cosntructor

        Persona persona2 = new Persona("Masculino", "Catolica", 21);
        Persona persona3 = new Persona("Masculino", "Catolica", 20);
        System.out.println("\nGenero persona2 : "+ persona2.getGenero()+ "\nReligion: " + persona2.getReligion()+"\nEdad: " +
                ""+persona2.getEdad());
        System.out.println("Nombre Persona2 " + persona2.getNombre());

    }
}

package arreglosdeberpoo;

public class FichaEs {
    private String[] nom =  new String[5];
    private int[] edad;
    private String[] uni;
    private String[] cel;
    // Generacion de la ficha Academica
    public void ImprmirDatos(){
        System.out.println("____FICHAS ESTUDIANTILES___");
        for(int i=0, n=1; i< nom.length; i++, n++){
            System.out.println(" \t\tEstudiante "+ n);
            System.out.println("-\t\tNombre: " + nom[i]);
            System.out.println("-\t\tEdad: " + edad[i]);
            System.out.println("-\t\tUniversodad: " + uni[i]);
            System.out.println("-\t\tCelular: "+ cel[i]+"\n\n");


        }
    }
    public String[] getNom() {
        return nom;
    }

    public void setNom(String[] nom) {
        nom = nom;
    }

    public int[] getEdad() {
        return edad;
    }

    public void setEdad(int[] edad) {
        this.edad = edad;
    }

    public String[] getUni() {
        return uni;
    }

    public void setUni(String[] uni) {
        this.uni = uni;
    }

    public String[] getCel() {
        return cel;
    }

    public void setCel(String[] cel) {
        this.cel = cel;
    }
}

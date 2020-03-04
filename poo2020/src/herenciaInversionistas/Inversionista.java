package herenciaInversionistas;
import java.util.Scanner;
public class Inversionista {
    protected int numCuenta;
    protected int numCliente;
    protected String nom;
    protected double capInvert;
    protected double tazaInt;
    protected int plazoInv;
/*
    public void Datos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de Cliente: ");
        this.numCliente = entrada.nextInt();
        System.out.println("Ingrese el nombre del Cliente: ");
        this.nom = entrada.nextLine();
        System.out.println("Ingrese el Numero de Cuenta: ");
        this.numCuenta = entrada.nextInt();
        System.out.println("Digite la cantidad del valor invertido: ");
        this.capInvert = entrada.nextDouble();
        System.out.println("Ingrese el plazo de la inversion : ");
        this.capInvert = entrada.nextInt();
    }
*/
    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getCapInvert() {
        return capInvert;
    }

    public void setCapInvert(double capInvert) {
        this.capInvert = capInvert;
    }

    public double getTazaInt() {
        return tazaInt;
    }

    public void setTazaInt(double tazaInt) {
        this.tazaInt = tazaInt;
    }

    public int getPlazoInv() {
        return plazoInv;
    }

    public void setPlazoInv(int plazoInv) {
        this.plazoInv = plazoInv;
    }
}

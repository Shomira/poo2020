package herenciaInversionistas;



import java.util.Scanner;

public class EjecutaInversionista {
    public static void main(String[] args) {
        int opcion = 0;
        int numCli, numCu, plazoInv;
        double capInvert;
        String nombre;
        Scanner entrada = new Scanner(System.in);
        String cadena2 = "" ;
        System.out.println("CALCULO DE DE INTERESES ANUALES");
        String cadena = "REPORTE DE INVERSIONES\nNo.CLIENTE\t\t\tNOMBRE\t\t\t\tNo.CUENTA\t\t\t\tINTERES POR PAGAR\n";
        cadena += "-----------------------------------------------------------------------------------------";
        while(opcion <= 4){
            System.out.println("Digite un numero deacuerdo al tipo de INVERSIONISTA:\n" +
                    "|1. Cuenta Ahorro|\n"+ "|2. Pagare \t |\n" + "|3.Cuenta Maestra\t |");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    entrada.nextLine();
                    System.out.println("Ingrese el nombre del Cliente: ");
                    nombre = entrada.nextLine();
                    System.out.println("Ingrese el numero de Cliente: ");
                    numCli = entrada.nextInt();
                    System.out.println("Ingrese el Numero de Cuenta: ");
                    numCu = entrada.nextInt();
                    System.out.println("Digite la cantidad del valor invertido: ");
                    capInvert = entrada.nextDouble();
                    System.out.println("Ingrese el plazo de la inversion : ");
                    plazoInv = entrada.nextInt();
                    // Creacion del objeto
                    CuentaAhorro Ch = new CuentaAhorro(numCu,numCli,nombre,capInvert,plazoInv);
                    Ch.calcularIntA();
                    cadena2 = String.format("%-22s%-22s%-22s%-22s%-22f\n",numCli,nombre, numCu,Ch.getIntGeA());
                    System.out.println(Ch.getIntGeA());
                    break;
                case 2:
                    entrada.nextLine();
                    System.out.println("Ingrese el nombre del Cliente: ");
                    nombre = entrada.nextLine();
                    System.out.println("Ingrese el numero de Cliente: ");
                    numCli = entrada.nextInt();
                    System.out.println("Ingrese el Numero de Cuenta: ");
                    numCu = entrada.nextInt();
                    System.out.println("Digite la cantidad del valor del pagare: ");
                    capInvert = entrada.nextDouble();
                    System.out.println("Ingrese el plazo en meses del vencimiento del pagare: ");
                    plazoInv = entrada.nextInt();
                    // Creacion del objeto
                    Pagare Pag = new Pagare(numCu,numCli,nombre,capInvert,plazoInv);
                    Pag.CalcularIntPa();
                    System.out.println(Pag.getIntGeP());
                    cadena2 = String.format("%-22s%-22s%-22s%-22s%-22f\n",cadena2,numCli,nombre, numCu,Pag.getIntGeP());

                    break;
                case 3:
                    // E n el caso de una cuenta maestra la canrtidad minima que debe tener es de 10000
                    entrada.nextLine();
                    System.out.println("Ingrese el nombre del Cliente: ");
                    nombre = entrada.nextLine();
                    System.out.println("Ingrese el numero de Cliente: ");
                    numCli = entrada.nextInt();
                    System.out.println("Ingrese el Numero de Cuenta: ");
                    numCu = entrada.nextInt();
                    System.out.println("Digite la cantidad del valor invertido: ");
                    capInvert = entrada.nextDouble();
                    if(capInvert <10001){
                        System.out.println("El tipo de cuenta que ha escogido es Cuenta Mestra," +
                                " por lo tanto su inversion debe superar los 10000\nIntente nuevamente porfavor");
                        break;

                    }
                    System.out.println("Ingrese el plazo de la inversion : ");
                    plazoInv = entrada.nextInt();
                    // Creacion del objeto
                    CuentaMaestra Cm = new CuentaMaestra(numCu,numCli,nombre,capInvert,plazoInv);
                    Cm.calcularIntCm();
                    cadena2 = String.format("%-22s%-22s%-22s%-22s%-22f\n",cadena2,numCli,nombre, numCu,Cm.getIntGeMa());
                    System.out.println(Cm.getIntGeMa());

                    break;
            }
            entrada.nextLine();
            System.out.println("Desea Calcular de algun otro inversor Ingrese Si/No");
            String opcion2 = entrada.nextLine().toUpperCase();
            System.out.println(opcion2);
            if (opcion2.equals("NO")){
                System.out.println(cadena+"\n"+ cadena2 );
                opcion = 5;
            }else{
                System.out.println();
                opcion = 4;

            }

        }

    }

}

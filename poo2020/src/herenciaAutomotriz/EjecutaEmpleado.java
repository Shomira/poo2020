package herenciaAutomotriz;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
public class EjecutaEmpleado {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner entrada = new Scanner(System.in);
        String dep ;
        String rfc = "RFC";
        String cadena2 = String.format("%s","") ;
        System.out.println("CALCULO DE SUELDO DE EMPLEADOS");
        String cadena = "REPORTE NOMINA QUINCENAL\nRFC\t\t\tNOMBRE\t\t\t\tDEPTO\t\t\t\tPUESTO\t\t\t\tSUELDOQUINCENAL\n";
        cadena += "-----------------------------------------------------------------------------------------";
        while(opcion <= 4){
            System.out.println("Digite un numero deacuerdo al tipo de empleado porfavor:\n" +
                    "|1.Administrativo|\n"+ "|2.Mecanico\t |\n" + "|3.Vendedor\t |");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    dep = "Administrativo";
                    entrada.nextLine();
                    System.out.println("Ingrese el nombre del Empleado: ");
                    String nombre = entrada.nextLine().toUpperCase();
                    System.out.println(" Escriba el Puesto que ocupa " + nombre+ " en la empresa: ");
                    String puestoA = entrada.nextLine();

                    System.out.println("Ingrese el Sueldo Mensual de " + nombre + " :");
                    double sueldoM = entrada.nextDouble();
                    // Creacion del objeto
                    EmpAdmvo empA = new EmpAdmvo(sueldoM, nombre, dep, puestoA);
                    empA.calcularQuinA();
                    cadena2 = String.format("%-10s%-22s%-22s%-22s%-22f\n",rfc,nombre, dep, puestoA, empA.getSueldoQuinAd());
                    break;
                case 2:
                    entrada.nextLine();
                    dep = "Mecanico";
                    System.out.println("Ingrese el nombre del Mecanico: ");
                    String nombreM = entrada.nextLine().toUpperCase();

                    System.out.println(" Escriba el puesto que ocupa " + nombreM );
                    String puestoM = entrada.nextLine();
                    System.out.println("Ingrese el numero de trabajos que ha realizado el mecanico " + nombreM);
                    int numTra = entrada.nextInt();

                    // Creacion del objeto Mecanico
                    EmpMecanico Mec = new EmpMecanico();

                    Mec.setNumTrabajos(numTra);

                    for(int i =1 ; i<=numTra;i++){
                        System.out.println("Ingrese el valor del trabajo "+ i +" realizado: ");
                        double cuotaTr = entrada.nextDouble();
                        Mec.setCuotaTra(cuotaTr);
                        Mec.calcularQuinM();
                    }
                    cadena2 = String.format("%-22s%-10s%-22s%-22s%-22s%-22f\n", cadena2,rfc, nombreM , dep, puestoM , Mec.getSueldoQuin());

                    break;
                case 3:
                    entrada.nextLine();
                    dep = "Vendedor";
                    System.out.println("Ingrese el nombre del Vendedor: ");
                    String nombreV = entrada.nextLine().toUpperCase();

                    System.out.println(" Escriba el puesto que ocupa " + nombreV );
                    String puestoV = entrada.nextLine();
                    System.out.println("Ingrese el numero de Autos vendidos por: " + nombreV);
                    int numAut = entrada.nextInt();

                    // Creacion del objeto Mecanico
                    EmpVendedor Vend = new EmpVendedor();

                    Vend.setNumAutos(numAut);
                    for(int i =1 ; i<=numAut;i++){
                        System.out.println("Ingrese el valor del Auto "+ i +" vendido: ");
                        double precioAut = entrada.nextDouble();
                        Vend.setPrecioAuto(precioAut);
                        Vend.calcularQuinV();
                    }
                    cadena2 = String.format("%-22s%-10s%-22s%-22s%-22s%-22f\n",cadena2,rfc, nombreV , dep , puestoV , Vend.getSueldoQuinV());
                    break;
            }
            entrada.nextLine();
            System.out.println("Desea Calcular el Sueldo Quincenal de algun otro empleado Ingrese Si/No");
            String op = entrada.nextLine().toUpperCase();
            System.out.println(op);
            if (op.equals("NO")){
                System.out.println(cadena+"\n");
                System.out.println(cadena2);
                opcion = 5;
            }else{
                System.out.println();
                opcion = 4;

            }

        }

    }


}

package herenciaAutomotriz;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
public class EjecutaEmpleado {
    public static void main(String[] args) {
        // Inicializacion de variables
        int opcion = 0;
        String dep ;
        String rfc = "RFC";
        String cadena2 = String.format("%s","") ;

        Scanner entrada = new Scanner(System.in);

        System.out.println("CALCULO DE SUELDO DE EMPLEADOS");
        // Encabezado del reporte Final
        String cadena = "REPORTE NOMINA QUINCENAL\nRFC\t\t\tNOMBRE\t\t\t\tDEPTO\t\t\t\tPUESTO\t\t\t\tSUELDOQUINCENAL\n";
        cadena += "-----------------------------------------------------------------------------------------";
        // Ciclo repetitivo que permite controlar el ingreso de datos deacuerdo a al desicion del usuario
        while(opcion <= 4){
            // Opciones de tipos de Empleados
            System.out.println("Digite un numero deacuerdo al tipo de empleado porfavor:\n" +
                    "|1.Administrativo|\n"+ "|2.Mecanico\t |\n" + "|3.Vendedor\t |");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    dep = "Administrativo";
                    entrada.nextLine();
                    // Ingreso de datos
                    System.out.println("Ingrese el nombre del Empleado: ");
                    String nombre = entrada.nextLine().toUpperCase();

                    System.out.println(" Escriba el Puesto que ocupa " + nombre+ " en la empresa: ");
                    String puestoA = entrada.nextLine();

                    System.out.println("Ingrese el Sueldo Mensual de " + nombre + " :");
                    double sueldoM = entrada.nextDouble();

                    // Creacion del objeto metodo constructor
                    EmpAdmvo empA = new EmpAdmvo(sueldoM, nombre, dep, puestoA);
                    empA.calcularQuinA();
                    // Almacenamiento de la cadena que se imprimira al final en el reporte
                    // "%-10s%-22s%-22s%-22s%-22f nos permite separar el valor de las variables
                    cadena2 = String.format("%-10s%-22s%-22s%-22s%-22f\n",rfc,nombre, dep, puestoA, empA.getSueldoQuinAd());
                    break;
                case 2:
                    entrada.nextLine();
                    // Inicializacion del departamento deacuerdo a la opcion elegida po el usuario
                    dep = "Mecanico";
                    // Ingreso de datos
                    System.out.println("Ingrese el nombre del Mecanico: ");
                    String nombreM = entrada.nextLine().toUpperCase();

                    System.out.println(" Escriba el puesto que ocupa " + nombreM );
                    String puestoM = entrada.nextLine();

                    System.out.println("Ingrese el numero de trabajos que ha realizado el mecanico " + nombreM);
                    int numTra = entrada.nextInt();

                    // Creacion del objeto Mecanico
                    EmpMecanico Mec = new EmpMecanico(nombreM,dep,puestoM);
                    // Actualizacion de la variable numero de trabajos
                    Mec.setNumTrabajos(numTra);

                    for(int i =1 ; i<=numTra;i++){
                        System.out.println("Ingrese el valor del trabajo "+ i +" realizado: ");
                        double cuotaTr = entrada.nextDouble();
                        // Actualizacion de la variable Cuota trabajo
                        Mec.setCuotaTra(cuotaTr);
                        // Calculo del saldo Quincenal
                        Mec.calcularQuinM();
                    }
                    // Almacenamiento De los valores de las variables que se necesita ara imprimir el reporte
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
                    EmpVendedor Vend = new EmpVendedor(nombreV,dep,puestoV);

                    // Establecer el valor de la variable que representa el numerod e autos vendidos
                    Vend.setNumAutos(numAut);
                    // Ciclo que se basa en los numeros de autos vendidos para que ingresen el valor y sacar la ganancia
                    // que genera el sueldo quincenal del vendedor
                    for(int i =1 ; i<=numAut;i++){
                        System.out.println("Ingrese el valor del Auto "+ i +" vendido: ");
                        double precioAut = entrada.nextDouble();
                        // Actualizacion de la variable precio de auto
                        Vend.setPrecioAuto(precioAut);
                        // calculo de el sueldo quincenal
                        Vend.calcularQuinV();
                    }
                    // Almacenamiento De los valores de las variables que se necesita para imprimir el reporte
                    cadena2 = String.format("%-22s%-10s%-22s%-22s%-22s%-22f\n",cadena2,rfc, nombreV , dep , puestoV , Vend.getSueldoQuinV());
                    break;
            }
            // Limpieza
            entrada.nextLine();
            // Opcion si se deseacalcular el sueldo de algun otro empleado
            System.out.println("Desea Calcular el Sueldo Quincenal de algun otro empleado Ingrese Si/No");
            String op = entrada.nextLine().toUpperCase();
            System.out.println(op);
            // SI no desea calcular mas entonces se imprime el reporte
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

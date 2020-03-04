package herenciaInversionistas;
//Las cuentas de ahorros pagan entre el 1% y el 3% de interés. Todo depende de la institución.
//
//Este contenido ha sido publicado originalmente por Revista Líderes en la siguiente dirección:
// https://www.revistalideres.ec/lideres/cuentas-bancarias-beneficios-cliente-dinero.html.

public class CuentaAhorro extends Inversionista{
    private double intGeA;
    public CuentaAhorro(int numCu, int numCl, String nom, double capInvert, int plazo){
        this.numCuenta = numCu;
        this.numCliente = numCl;
        this.nom = nom;
        this.capInvert = capInvert;
        this.plazoInv = plazo;


    }

    public void calcularIntA() {
        if (capInvert >= 700 && capInvert <= 1000){
            tazaInt = 0.08;
            intGeA = (capInvert * tazaInt) * plazoInv;

        }else if (capInvert >=2000 && capInvert <= 4000){
            tazaInt = 0.15;
            intGeA = (capInvert * tazaInt) * plazoInv;
        }else if(capInvert > 4500) {
            tazaInt = 0.20;
            intGeA = (capInvert * tazaInt) * plazoInv;
        }
    }

    public double getIntGeA() {
        return intGeA;
    }

    public void setIntGeA(double intGeA) {
        this.intGeA = intGeA;
    }
}

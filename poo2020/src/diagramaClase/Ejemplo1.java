package diagramaClase;

public class Ejemplo1
{
    private int atributo1;//Este atributo es privado
    private int contador = 0; //Contador de registro

    //Si un atributo es privado podemos crear método get y set ...
    //... para éste y permitir el acceso a él desde otras instancias

    public void setAtributo1(int valor)
    {
        contador++;//Contador que lleva el registro de ediciones del atributo1
        atributo1 = valor;//Establecemos el valor del atributo
    }

    public int getAtributo1(int i)
    {
        return atributo1;//Retornamos el valor actual del atributo
    }

    //Get para el contador
    public int getContador()
    {
        return contador;
    }
    //Notar que no ponemos un set, pues no nos interesa que el contador pueda ser cambiado.

    public int actualizar_contador(){
        // Asigna a la variable global la local
        // Con el this hacemos referencia a variables globales
        this.contador = contador;

        return contador;
    }

}


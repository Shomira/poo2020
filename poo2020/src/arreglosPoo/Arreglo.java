package arreglosPoo;

public class Arreglo {
    private int[] vectorA = new int[10];
    private int[] vectorB = new int[10];
    private int product;


    public void calcularProducto(){
        product = 0;
        for(int i=0; i <= 9;i++){
            product =  product +(vectorA[i] * vectorB[i]);
        }
    }


    public int[] getVectorA() {
        return vectorA;
    }

    public void setVectorA(int[] vectorA) {
        this.vectorA = vectorA;
    }

    public int[] getVectorB() {
        return vectorB;
    }

    public void setVectorB(int[] vectorB) {
        this.vectorB = vectorB;
    }

    public int getProduct() {
        return product;
    }

    public void setProduct(int producto) {
        this.product = producto;
    }
}

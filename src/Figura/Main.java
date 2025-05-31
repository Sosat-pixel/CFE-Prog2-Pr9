package Figura;

public class Main {
    public static void main(String[] args) {

        Figura figuras[] = new Figura[2];

        figuras[0] = new Circulo(20);
        figuras[1] = new Rectangulo(12, 5);

        for(Figura f:figuras){
            System.out.println("El área es: " + f.calcularArea());
        }
    }
}

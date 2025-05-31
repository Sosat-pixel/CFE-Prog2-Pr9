package Vehiculo;

public class Auto implements Vehiculo {

    private int velocidadActual;

    public Auto(int velocidadActual){
        this.velocidadActual = velocidadActual;
    }



    @Override
    public void arrancar() {
        System.out.println("*Ruido de vehículo arrancando*");
    }

    @Override
    public void acelerar(int velocidad) {
        this.velocidadActual += velocidad;
        System.out.println("La velocidad actual aumentó de: " + this.velocidadActual + " a " + (this.velocidadActual + velocidad));
    }

    @Override
    public void frenar() {
        System.out.println("La velocidad bajó de: " + this.velocidadActual + " a 0 ");
        this.velocidadActual = 0;
        System.out.println("Frenando...");
    }

}


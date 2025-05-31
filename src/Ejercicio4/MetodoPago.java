package Ejercicio4;

public abstract class MetodoPago {

    private String titular;


    public MetodoPago(String titular){
        this.titular = titular;
    }

    abstract void procesarPago (double monto);

    public String getTitular(){
        return this.titular;
    }


}


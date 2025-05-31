package Ejercicio5;

public abstract class Entrada {
    private String numeroEntrada;
    private int horaAcceso;


    public Entrada(String numeroEntrada, int horaAcceso){
        this.numeroEntrada = numeroEntrada;
        this.horaAcceso = horaAcceso;
    }

    abstract boolean validarEntrada();

    void mostrarDatos(){
        System.out.println("Número de entrada: " + this.numeroEntrada);
        System.out.println("Hora de acceso: " + this.horaAcceso);
    }

    public int getHoraAcceso(){
        return this.horaAcceso;
    }

}

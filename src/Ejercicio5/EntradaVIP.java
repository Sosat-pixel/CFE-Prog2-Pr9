package Ejercicio5;

public class EntradaVIP extends  Entrada{

    public EntradaVIP(String numeroEntrada, int horaAcceso) {
        super(numeroEntrada, horaAcceso);
    }
    @Override
    boolean validarEntrada(){
       return true;
    }
}

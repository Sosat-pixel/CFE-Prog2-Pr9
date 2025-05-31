package Ejercicio5;

public class EntradaGeneral extends Entrada {

    public EntradaGeneral(String numeroEntrada, int horaAcceso){
        super(numeroEntrada,horaAcceso);
    }

    @Override
    boolean validarEntrada() {
        if(getHoraAcceso() >= 10 && getHoraAcceso() <= 22) {
            return true;
        } return false;
    }
}

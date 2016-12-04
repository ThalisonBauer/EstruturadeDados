package Aula14;

/**
 * Created by Thalison on 25/11/2016.
 */
public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();
        Doador doador = new Doador();
        Receptor receptor = new Receptor();
        Orgaos  orgaos = new Orgaos();

        doador.lerDoador();
        fila.addInicioDoador(doador);
    }
}

package Aula12;
import java.util.Scanner;

public class Elemento {
    int valor;
    Elemento proximo;

    public  void ler(){
        Scanner tc = new Scanner(System.in);
        System.out.println("Informe um valor");
        valor = tc.nextInt();
    }
    public void mostrar(){
        System.out.println(this.valor);

    }
}

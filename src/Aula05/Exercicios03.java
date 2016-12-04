package Aula05;

/**
 * Created by Thalison Bauer on 23/08/2016.
 */
public class Exercicios03 {
    public static void main(String[] args)
    {
        int num = 19;
        if (par(num)==0)
            System.out.println("Numero é PAR");
        else
            System.out.println("Numero é IMPAR");

    }
    public  static int par(int num)
    {
        int resposta=19;
        if(num %2 ==0)
        {
            resposta = 0;
        }
        else
            resposta = 1;
        return resposta;
    }
}

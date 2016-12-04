package Aula05;

import java.util.Scanner;

/**
 * Created by Thalison Bauer on 23/08/2016.
 */
public class Exercicios01 {
    public static int funcSoma(int b[])
    {
        int resultado=0;
        for(int i=0;i<10;i++)
        {
            resultado +=b[i];
        }
      return resultado;
    }

    public static void main(String[] args)
    {
        Scanner tc = new Scanner(System.in);
        int vetorA[] = new int[10],temp;
        for (int i=0; i <10;i++)
        {
            System.out.println("Informe 10 numeros");
            vetorA[i] = tc.nextInt();
           }

        System.out.println(funcSoma(vetorA));

    }
}

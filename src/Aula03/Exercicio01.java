package Aula03;

import java.util.Scanner;

/**
 * Created by Thalison Bauer on 16/08/2016.
 */
public class Exercicio01 {
    public static void main(String[] args)
    {
        int i,j,cont=0;
        float media=0, soma=0;
        float temp[] = new float[7];


        Scanner tc = new Scanner(System.in);
            for(i=0;i<7;i++)
            {
                System.out.printf("Informe a Temperadora do %dº dia ",i+1);
                temp[i] = tc.nextFloat();
                soma = soma + temp[i];
            }
                media = soma / i;

        for(j=0;j<7;j++)
        {
            if(temp[j]>media)
            {
                cont++;
            }
        }
        System.out.printf("A media da Temperatura é:%.2f ,e %d dias estão a cima da media",media,cont);
    }
}

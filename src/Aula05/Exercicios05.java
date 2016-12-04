package Aula05;

import java.util.Scanner;

/**
 * Created by Thalison Bauer on 23/08/2016.
 */
public class Exercicios05 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner tc = new Scanner(System.in);
            do
            {
                System.out.printf("Informe 1");
                num1 = tc.nextInt();
                System.out.printf("Informe 2");
                num2 = tc.nextInt();
            }while(num1 %2 !=0 || num2 %2 == 0);
        System.out.println(Verifica(num1,num2));

    }
    public static int Verifica(int num1,int num2)
    {
        int result = num1 + num2;
        return result;
    }
}


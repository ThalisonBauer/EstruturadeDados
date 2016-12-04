package Aula09;

import java.util.Scanner;

public class Exercicio04 {
    public static char[] pilha = new char[13];
    public static int topo;
    public static String palavra;
    public static Scanner tc = new Scanner(System.in);

    public static void push(char a)
    {
        topo++;
        pilha[topo] = a;
    }
    public void pop()
    {
        topo--;
    }
    public static void ler()
    {
        System.out.println("Informe a palavra");
        palavra = tc.next();
    }
    public static void main(String[] args)
    {
        char aux;
        ler();
        for(int i=palavra.length();i>0;i--)
        {
          aux= palavra.charAt(i-1);
            push(aux);
        }
        System.out.println(pilha);
    }
}

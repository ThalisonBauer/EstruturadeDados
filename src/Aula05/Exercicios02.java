package Aula05;

/**
 * Created by Thalison Bauer on 23/08/2016.
 */
public class Exercicios02 {
    public static int ContVogais(String nome)
    {   int cont=0;
        char c;
        for(int i=0;i < nome.length();i++)
        {
          c = nome.charAt(i);
            if( c=='a' || c=='e' || c=='i' || c=='o' ||  c=='u')
            {
                cont++;
            }
        }
        return cont;
    }
    public static void main(String[] args)
    {
     String nome = "Thalison";
        System.out.println(ContVogais(nome));

    }
}

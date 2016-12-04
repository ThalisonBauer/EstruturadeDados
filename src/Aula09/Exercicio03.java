package Aula09;

/**
 * Created by Thalison Bauer on 27/09/2016.
 */
public class Exercicio03 {
    public static  void ordem(char vet[])
    {
        for(int i=0;i<vet.length;i++)
        {
            if(vet[i] =='a')
            {
                vet[i]=compa(vet[i+2],vet[i+3]);
            }
        }
    }
    public static char compa(char gen, char gen2)
    {
        if((gen=='g')&&(gen2=='c'))
        {
            return 't';
        }
        if((gen=='t')||(gen=='c'))
        {
            return 'a';
        }
        return gen;
    }
    public static void invert(char dna[])
    {
      int[] vet = new int[8];
        for(int i =dna.length-1; i >=0;i--)
        {
            vet[i] = dna[i];

        }
        for(int i=0;i<dna.length;i++)
        {
            System.out.println(vet[i]);
        }
    }
    public static void main(String[] args) {
        char dna[] = {'a','t','g','c','a','t','g','c'};
        for(int i=0; i<dna.length;i++)
        {
            System.out.println(dna[i]);
        }
        ordem(dna);
        System.out.println();
        for (int i=0;i<dna.length;i++)
        {
            System.out.println(dna[i]);
        }
        invert(dna);
    }
}

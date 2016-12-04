package Aula05;

/**
 * Created by Thalison Bauer on 23/08/2016.
 */
class Consoantes{
    int n;
}
public class Exercicios04 {
    public static void main(String[] args) {
        Consoantes nConsoantes = new Consoantes();
        nConsoantes.n=123981238;
        String nome = "Thalison";
        Troca(nConsoantes,nome);
        System.out.println(nConsoantes.n);

    }
    public static void Troca(Consoantes n,String nome)
    {   int conta = nome.length();
        int cont=0;
        char c;
        for(int i=0;i < nome.length();i++)
        {
            c = nome.charAt(i);
            if( c=='a' || c=='e' || c=='i' || c=='o' ||  c=='u')
            {
                cont++;
            }
        }
        int resultado = conta  - cont;
        n.n=resultado;
    }
}

package Aula08;
import java.util.Scanner;

public class Fila {
    int[] vetor;
    int fim;
    public int Scan()
    {
        int inteir = 0;
        Scanner tc = new Scanner(System.in);
        inteir = tc.nextInt();
        return inteir;
    }
    public void isInit()
    {
        fim=-1;
        vetor= new int[10];
    }
    public boolean isEmpty()
    {
        if(fim==-1)
            return true;
        else return false;
    }
    public boolean isFull()
    {
        if(fim==10)
            return true;
        else return false;
    }

    public void addFila(){
        int posi;
        if(isFull()==false) {
            fim++;
            System.out.println("Informe valor:");
            posi = Scan();
            vetor[fim] = posi;
            System.out.println("Parabens, Valor inserido");
        }
        else
            System.out.println("Fila Esgotada!");
    }
    public void removFila()
    {
        for (int i=0;i<fim;i++)
        {
            int o=0;
            vetor[o] = vetor[i];
            o++;

        }
    }
    public void listFila()
    {
        for(int i=0;i<=this.fim;i++)
        {
            System.out.println(vetor[i]);
        }
    }
}

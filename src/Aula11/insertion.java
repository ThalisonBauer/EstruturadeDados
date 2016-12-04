package Aula11;
import java.util.Random;

public class insertion {
    public int vetor[] = new int[100000];
    public int vetor1[] = new int[100000];
    public int vetor2[] = new int[100000];

    public void isInit() {
        Random r = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = r.nextInt(9999999);
            vetor1[i] = vetor[i];
            vetor2[i] = vetor[i];
        }
    }
    public  long bubbleSort()
    {
        long start = System.currentTimeMillis();
        int aux = 0;
        boolean controle;
        for(int i=0;i < vetor2.length;i++)
        {
            controle = true;
            for (int j=0; j<(vetor2.length -1);j++)
            {
                if(vetor2[j] > vetor2[j+1])
                {
                    aux = vetor2[j];
                    vetor2[j] = vetor2[j+1];
                    vetor2[j+1]=aux;
                    controle = false;
                }
            }
            if (controle)
            {
                break;
            }
        }
        long elapsed = System.currentTimeMillis() - start;
        return elapsed;
    }
    public long selectionSort()
    {
        long start = System.currentTimeMillis();
        int menor;
        int idMenor;
            for(int i=0;i<vetor1.length -1;i++)
            {
                menor = vetor1[i];
                idMenor = i;
                for (int j = i+1;j<vetor1.length;j++)
                {
                    if(vetor1[j] < menor)
                    {
                        menor = vetor1[j];
                        idMenor = j;
                    }
                }
                vetor1[idMenor] = vetor1[i];
                vetor1[i] = menor;
            }
        long elapsed = System.currentTimeMillis() - start;
        return elapsed;
    }

    public long insertionSort() {
        long start = System.currentTimeMillis();
        for (int i = 1; i < vetor.length; i++) {
            int temp = vetor[i];
            int j;
            for (j = i - 1; j >= 0 && temp < vetor[j]; j--) {
                vetor[j + 1] = vetor[j];
                vetor[j] = temp;
            }
        }
        long elapsed = System.currentTimeMillis() - start;
        return elapsed;
    }
}

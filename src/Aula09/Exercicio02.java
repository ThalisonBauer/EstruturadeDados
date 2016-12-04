package Aula09;
public class Exercicio02 {
    int inicio;
    int fim;
    boolean isInit;
    int [] vet = new int[10];
    public boolean inicializar()
    {
        this.inicio = -1;
        this.fim = -1;
        isInit = true;
        return true;
    }
    public boolean isFull()
    {
        if(this.fim==9)
        {
            System.out.println("Fila Cheia");
            return true;
        }else{
            return false;
        }
    }
    public boolean isEmpty()
    {
        if(this.fim == -1)
        {
            System.out.println("Fila vazia");
            return  true;
        }else{
            return false;
        }
    }
    public void add(int a)
    {
        if(!isFull())
        {
            this.fim++;
            vet[this.fim] = a;
        }
    }
    public void remover()
    {
        if(!isEmpty())
        {
            for(int i=0; i < this.fim-1;i++)
            {
                vet[i] = vet[i+1];
            }
        }
    }

    public static void main(String[] args) {

    }
}


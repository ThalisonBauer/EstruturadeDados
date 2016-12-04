package Aula06;

/**
 * Created by Thalison Bauer on 30/08/2016.
 */
public class Pilha {
    int vetor[] = new int[10];
    int topo;
        public void isInit()
        {
            this.topo=-1;
        }
        public void isEmpty()
        {
            if(topo == -1)
            {
                System.out.println("A PILHA ESTA VAZIA");
            }
            else
                System.out.println("CONTEM ELEMENTOS NA PILHA");
        }
        public void isFull()
        {
            if(topo == 9 )
            {
                System.out.println("A PILHA ESTA CHEIA");
            }
            else
                System.out.println("A PILHA NAO ESTA CHEIA");
        }
        public boolean push(int valor)
        {
            if(topo>9)
            {
                System.out.printf("Windows ME");
                return false;
            }
            this.topo++;
            this.vetor[this.topo] = valor;
            return true;
        }
        public boolean pop ()
        {
            if(topo > -1)
            {
                this.topo--;
                return true;
            }
            else
                System.out.println("A PILHA ESTA VAZIA");
            return false;
        }

        public int top()
        {
            int cavao = vetor[topo];
            return cavao;
        }
        public int pull(int num)
        {
            pop();
            push(num);
            return vetor[topo];
        }
}

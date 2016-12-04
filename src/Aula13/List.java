package Aula13;

import java.util.Scanner;

public class List {
    Container topo;
    Container base;
    int qtdContainer;

    public boolean isFull(){
        if(this.qtdContainer==5);
        return true;
    }
    public void addTopo(Container c){
        if(this.base==null)
        {
            this.base = c;
            this.topo = c;
            this.qtdContainer++;
        }else if(isFull()!=true){
            this.topo.proximo = c;
            this.topo = c;
            this.qtdContainer++;
        }else{
            System.out.println("Empilhamento maximo atingido");
        }
    }
    public void removContainer(int bloco){
        String seachContainer;
        Scanner tc = new Scanner(System.in);
        System.out.println("Informe codigo do Container:");
        seachContainer = tc.next();
    }

}

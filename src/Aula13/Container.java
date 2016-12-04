package Aula13;

import java.util.Scanner;

public class Container {
    public String codContainer;
    public String paisOrigem;
    public long timePatio;
    public int tipoProduto;
    public Container proximo;

    public void ler(){
            Scanner tc = new Scanner(System.in);
            System.out.println("Infome Cod do Conteiner");
            this.codContainer = tc.next();
            System.out.println("Informe Pais Origem");
            this.paisOrigem = tc.next();
            System.out.println("| 1:Perecivel | 2:Não Perecivel |");
            this.tipoProduto = tc.nextInt();
            timePatio = System.currentTimeMillis();

    }
}

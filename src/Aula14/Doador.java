package Aula14;
import java.util.Scanner;

public class Doador {
    public String nomeDoador;
    public int idadeDoador;
    public int tipoSanguiDoador;
    public Doador doadorAnterior;
    public Doador doadorProximo;
    Orgaos orgaos;
    Fila fila = new Fila();

    public void lerDoador(){
        Scanner tc = new Scanner(System.in);
        System.out.println("Nome Doador:");
        nomeDoador = tc.next();
        System.out.println("Idade Doador:");
        idadeDoador = tc.nextInt();
        System.out.println("1:A+ | 2:A-  | 3:B+ | 4:B-");
        System.out.println("5:AB+| 6:AB- | 7:O+ | 8:O-");
        tipoSanguiDoador = tc.nextInt();
        orgaos.lerOrgao();



    }
}

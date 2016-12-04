package Aula14;

import java.util.Scanner;

/**
 * Created by Thalison on 22/11/2016.
 */
public class Receptor {
    public String nomeReceptor;
    public int idadeReceptor;
    public int tipoSanguiReceptor;
    public String orgao;
    public int urgencia;
    public Receptor receptorAnterior;
    public Receptor receptorProximo;
    int rps = 1;

    public void lerReceptor() {
        Scanner tc = new Scanner(System.in);
        System.out.println("Nome Receptor");
        nomeReceptor = tc.next();
        System.out.println("Idade Receptor");
        idadeReceptor = tc.nextInt();
        System.out.println("1:A+ | 2:A-  | 3:B+ | 4:B-");
        System.out.println("5:AB+| 6:AB- | 7:O+ | 8:O-");
        tipoSanguiReceptor = tc.nextInt();
        System.out.println("1:Coração");
        System.out.println("2:Córneas");
        System.out.println("3:Sangue");
        rps = tc.nextInt();
        if (rps == 1) {
            orgao = "coracao";
        } else if (rps == 2) {
            orgao = "cornea";
        } else if (rps == 3) {
            orgao = "sangue";
        } else {
            System.out.println("Opção Errada:");
        }
        System.out.println("Grau de urgencia 1-5[MAIOR URG... 5]");
        urgencia = tc.nextInt();
    }
}

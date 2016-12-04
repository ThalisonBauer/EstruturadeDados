package Aula14;

import java.util.Scanner;

/**
 * Created by Thalison on 22/11/2016.
 */
public class Orgaos {
    boolean coracao, cornea,sangue;
    int rps=1;
    public void lerOrgao(){
        Scanner tc = new Scanner(System.in);
        System.out.println("Deseja doar ou Receber Coração?");
        System.out.println("1:SIM | 2:NÃO");
        rps = tc.nextInt();
        if(rps==1){coracao=true;}else{coracao=false;}
        System.out.println("Deseja doar ou Receber Córneas?");
        System.out.println("1:SIM | 2:NÃO");
        rps = tc.nextInt();
        if(rps==1){cornea=true;}else{cornea=false;}
        System.out.println("Deseja doar ou Receber Sangue?");
        System.out.println("1:SIM | 2:NÃO");
        rps = tc.nextInt();
        if(rps==1){sangue=true;}else{sangue=false;}
    }
}



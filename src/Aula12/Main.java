package Aula12;

import java.util.Scanner;

/**
 * Created by Thalison Bauer on 25/10/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int opc = 0;
        int valor;
        Lista list = new Lista();
        do{
            System.out.println("1:ADD | 2:REMV | 3: LIST | 0:SAIR");
            opc = tc.nextInt();
            switch (opc){
                case 1: {
                    Elemento e = new Elemento();
                    e.ler();
                    System.out.println("1:INI | 2:POS | 3:FIM | 0:SAIR");
                        opc = tc.nextInt();
                    switch (opc) {
                        case 1:
                            list.addInicio(e);
                            break;
                        case 2:
                            System.out.println("Qual posição deseja ADD");
                            valor = tc.nextInt();
                            list.addPosition(e, valor);
                            break;
                        case 3:
                            list.addFim(e);
                            break;
                        case 0:
                            break;
                    }
                }break;
                case 2: {
                    System.out.println("1:INI | 2:POS | 3:FIM | 0:SAIR ");
                    opc = tc.nextInt();
                    switch (opc) {
                        case 1:
                            list.remInicio();
                            break;
                        case 2:
                            System.out.println("Qual posição deseja ADD");
                            valor = tc.nextInt();
                            list.remPosition(valor);
                            break;
                        case 3:
                            list.remFim();
                            break;
                        case 0:
                            break;
                    }
                }break;
                case 3:{
                    list.list();
                }break;
                case 0:
                    break;
            }
        }while(opc != 0);
    }
}

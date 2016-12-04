package Aula06;

import java.util.Scanner;

/**
 * Created by Thalison Bauer on 30/08/2016.
 */
public class testePilha {
    public static void main(String[] args) {
        Pilha minhaPilha = new Pilha();
        boolean nome=true;
        int resp=0;
        Scanner tc = new Scanner(System.in);
        minhaPilha.isInit();
        System.out.println("--------------MENU---------------");
        System.out.println("1- Verificar Empty:");
        System.out.println("2- Verificas Full:");
        System.out.println("3- Inserir dados:");
        System.out.println("4- Deletar:");
        System.out.println("5- Exibir ultimo elemento:");
        System.out.println("6- Sair:");
        System.out.println("---------------------------------");
            do
            {
                resp = tc.nextInt();
                switch (resp)
                {
                    case 1:
                        minhaPilha.isEmpty();break;
                    case 2:
                        minhaPilha.isFull();break;
                    case 3:
                        System.out.println("Informe o Valor de deseja inserir:");
                        int num = tc.nextInt();
                        minhaPilha.push(num);break;
                    case 4:
                        minhaPilha.pop();break;
                    case 5:
                        int numero = minhaPilha.top();
                        System.out.println(numero);
                        break;
                    case 6:
                        nome = false;
                        break;
                    default:
                        System.out.println("Opção invalida: DIGITE NOVAMENTE");
                }
            }while (nome==true);

    }
}

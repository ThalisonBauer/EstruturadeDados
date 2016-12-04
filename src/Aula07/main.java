package Aula07;

import java.util.Scanner;

/**
 * Created by Thalison Bauer on 06/09/2016.
 */
public class main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        boolean nome=true;
        int opc=0;
        Estacionamento interno = new Estacionamento();
        Estacionamento externo = new Estacionamento();

        interno.isInit();
        externo.isInit();

        System.out.println("1 ADD | 2 REMOV | 3 SAIR PROGRAMA |");
        do
        {
            opc = tc.nextInt();
            switch (opc)
            {
                case 1:
                {
                    Carro carro = new Carro();
                    System.out.println("INFORME A PLACA [AAA-111]");
                    carro.placa = tc.next();
                    carro.n_manobras++;
                    interno.addCarro(carro);
                    break;
                }
                case 2:
                {
                    Carro carro = new Carro();
                    Carro r;
                    System.out.println("INFORME A PLACA DO CARRO PARA RETIRADA");
                    carro.placa = tc.next();
                    for(int i=interno.topo;i>0;i--)
                    {
                        r=interno.vagas[i];

                        if(r.placa.equalsIgnoreCase(carro.placa))
                        {

                            System.out.println("CARRO REMOVIDO");
                            interno.topo--;
                            break;
                        }
                        else
                        {
                            r=interno.dellCarro(); r.n_manobras++;
                            externo.addCarro(r);r.n_manobras++;
                        }
                    }
                    for(int i=0;i==externo.topo;i++)
                    {
                        r = externo.dellCarro(); r.n_manobras++;
                        interno.addCarro(r); r.n_manobras++;
                    }
                    break;
                }
            }

        }while(nome==true);
    }
}

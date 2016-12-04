package Aula08;

/**
 * Created by Thalison Bauer on 13/09/2016.
 */
public class main {
    public static void main(String[] args) {
        int opc = 0;
        Fila fila = new Fila();

        fila.isInit();
            do {
                System.out.println("1 ADD | 2 REM | 3 LIST | 4 SAIR");
                opc = fila.Scan();
                switch (opc)
                {
                    case 1:
                        fila.addFila();break;
                    case 2:
                        fila.removFila();break;
                    case 3:
                        fila.listFila();break;
                }
            }while(opc!=0);
    }
}

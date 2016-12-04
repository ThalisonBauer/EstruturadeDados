package Aula03;

/**
 * Created by Thalison Bauer on 16/08/2016.
 */
public class Exercicio02 {
    public static void main(String[]args) {
        int vetorA[] = {15, 44, 23, 1, 0, 18, 17, 37, 35, 54};
        int vetorB[] = {32, 115, 48, 55, 51, 0, -48, 85, 15, 99};
        int vetorC[][] = new int[4][20];
        int l = 0, c = 0, soma;
        for (c = 0; c < 4; c++) {
            switch (c) {
                case 1:
                    for (l = 0; l < 10; l++) {
                        soma = vetorA[l] * vetorB[l];
                        vetorC[c][l] = soma;
                        soma = 0;
                    }
                    break;
                case 2:
                    for (l = 0; l < 10; l++) {
                        soma = vetorA[l] + vetorB[l];
                        vetorC[c][l] = soma;
                        soma = 0;
                    }
                    break;
                case 3:
                    for (l = 0; l < 10; l++) {
                        soma = vetorA[l] - vetorB[l];
                        vetorC[c][l] = soma;
                        soma = 0;
                    }
                    break;
                case 4:
                    for (int b = 0; b < vetorA.length - 1; b++) {
                        for (int d = 0; d < vetorB.length - 1; d++) {
                            if (vetorA[b] != vetorB[d]) {
                                vetorC[l][b] = vetorA[b];
                            }
                        }

                    }
                    break;
            }
        }

        for (int z = 0; z < 20; z++) {
            System.out.println("Vetor:" + vetorC[l][z]);
        }

    }
}

package AtividadeFormativa;

import java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.Elements.Origin;

public class matrizEx {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exercicio1() {
        System.out.println("Digite o n° de colunas:");
        int col = sc.nextInt();
        System.out.println("Digite o n° de linhas:");
        int row = sc.nextInt();
        int tab[][] = new int[col][row];

        // MATRIZ NORMAL
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                tab[i][j] = rd.nextInt(9);

            }

        }
        for (int i = 0; i < col; i++) {
            System.out.println("|");
            for (int j = 0; j < row; j++) {
                System.out.println(+tab[i][j] + "");
            }
            System.out.println("========================");
        }
        // MATRIZ SUBSTIUIDA
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                tab[i][j] = rd.nextInt(9);
                if (i > j) {
                    tab[i][j] = 1;
                } else if (i == j) {
                    tab[i][j] = 0;
                } else if (j > i) {
                    tab[i][j] = 2;
                }
            }
        }
    }

    public void exercicioVetor() {
        int valorSorteado = rd.nextInt(1000);
        boolean TenteNovamente = true;
        while (TenteNovamente) {
            System.out.println("Digite o n°:");
            int nEscrito = sc.nextInt();
            if (nEscrito == valorSorteado) {
                System.out.println("Acertou o n° sorteado");
                TenteNovamente = false;
            } else if (nEscrito < valorSorteado) {
                System.out.println("O valor é maior do que o n° escrito");
            } else if (nEscrito > valorSorteado) {
                System.out.println("O valor é menor do que o n° escrito");
            }
        }
    }

    public void exercicio3() {
        int vetor[] = new int[rd.nextInt(900)+100];
        int cont = 0;

        for (int i = 0; i < vetor.length; i++) {
           vetor[i] = rd.nextInt(100)+1;
        }
        int  contImparNoPar = 0;
        int contParNoImpar = 0;
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i]%2==1){
                System.out.println(vetor[i]);
                if(i%2==1){
                    contParNoImpar++;
                }
            }
        }
        for (int i = 0; i < vetor.length; i+=2) {
            if(vetor[i]%2==1){
                contImparNoPar++;
            }
        }
        System.out.println(contImparNoPar);
        System.out.println(contParNoImpar);
    }
}

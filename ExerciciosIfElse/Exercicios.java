package ExerciciosIfElse;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Informe o primeiro valor:");
        int valor1 = sc.nextInt();
        System.out.println("Informe o segundo valor");
        int valor2 = sc.nextInt();
        if (valor1 > valor2) {
            System.out.println("O primeiro valor é maior" + valor1);
        } else {
            System.out.println("O segundo valor é maior" + valor2);
        }
    }

    // tem que prestar muita atenção nas pontuações e ao abrir as pastas!
    public void exercicio2() {
        System.out.println("Informe o ano que nasceu:");
        double dataNascimento = sc.nextDouble();
        double anoAtual = 2023;
        double idade = anoAtual - dataNascimento;
        if (idade >= 16) {
            System.out.println("Pode votar");
        } else {
            System.out.println("Não pode votar");
        }
    }

    public void exercicio3() {
        System.out.println("Informe a senha:");
        int senha = sc.nextInt();
        if (senha == 1234) {
            System.out.println("Acesso Permitido");
        } else {
            System.out.println("Acesso Negado");
        }
    }

    public void exercicio4alt() {
        System.out.println("Informe a quantidade de maças compradas:");
        int nMacas = sc.nextInt();
        double ValorMaca = 0;
        if (nMacas < 12) {
            ValorMaca = 0.30;
        }
        if (nMacas > 12) {
            ValorMaca = 0.25;
        }
        double valorCompra = nMacas * ValorMaca;
        System.out.println("O Valor da compra é R$" + valorCompra);
    }

    public void exercicio5() {
        System.out.println("Informe o 1º valor:");
        double valor1 = sc.nextInt();
        System.out.println("Informe o 2º valor:");
        double valor2 = sc.nextInt();
        System.out.println("Informe o 3º valor:");
        double valor3 = sc.nextInt();
        if (valor1 > valor2 && valor1 > valor3 && valor2 > valor3) {
            System.out.println("Ordem crescente:");
            System.out.println(valor3);
            System.out.println(valor2);
            System.out.println(valor1);
        } else if (valor3 > valor1 && valor3 > valor2 && valor1 > valor2) {
            System.out.println("Ordem crescente:");
            System.out.println(valor2);
            System.out.println(valor1);
            System.out.println(valor3);
        } else if (valor2 > valor1 && valor2 > valor3 && valor1 > valor3) {
            System.out.println("Ordem crescente:");
            System.out.println(valor3);
            System.out.println(valor1);
            System.out.println(valor2);
        } else if (valor2 > valor3 && valor2 > valor1 && valor3 > valor1) {
            System.out.println("Ordem crescente:");
            System.out.println(valor1);
            System.out.println(valor3);
            System.out.println(valor2);
        } else if (valor1 > valor2 && valor1 > valor3 && valor3 > valor2) {
            System.out.println("Ordem crescente:");
            System.out.println(valor2);
            System.out.println(valor3);
            System.out.println(valor1);
        } else if (valor3 > valor1 && valor3 > valor2 && valor2 > valor1) {
            System.out.println("Ordem crescente:");
            System.out.println(valor1);
            System.out.println(valor2);
            System.out.println(valor3);
        } else {
            System.out.println("Ordem crescente:");
            System.out.println(valor2);
            System.out.println(valor1);
            System.out.println(valor3);
        }

    }

    public void exercicio6() {
        System.out.println("Informe seu sexo [Digite 1 para masculino ou 2 para feminino]:");
        int sexo = sc.nextInt();
        System.out.println("Digite sua Altura:");
        double altura = sc.nextDouble();
        double pesoIdeal;
        if (sexo == 1) {
            pesoIdeal = 72.7 * altura - 58;
        } else {
           pesoIdeal = 62.1 * altura - 44.7;
            System.out.println("Aqui está o peso ideal:" + pesoIdeal);
        }
    }

    public void exercicio1ex() {
        System.out.println("Informe um numero:");
        int n = sc.nextInt();
        if (n % 2 == 0){
        System.out.println("É par");
        } else {
            System.out.println("É impar");
        }
    }
    public void exercicio2ex() {
        System.out.println("Escreva a nota");
        double nota = sc.nextDouble();
        if (nota>=7) {
            System.out.println("Passou");
        }
        if (nota>=5 %% nota<7) {
            System.out.println("Recuperação");
        }
        if (nota<5) {
            System.out.println("Não passou");
        }
    }
}

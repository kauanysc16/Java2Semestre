package EstruturaDecisaoIfElse;

import java.util.Scanner;

public class DecisaoIfElse {
    Scanner sc = new Scanner(System.in);

    public void decisaoIf() {
        // desencadeado:basicamente um if dentro do outro
        System.out.println("Informe o Preço do Produto");
        double precoProduto = sc.nextDouble();
        double desconto = 0.0;
        // se precoProduto>=100 <200 então desconto=5
        if (precoProduto >= 100) {
            desconto = 5.0;
        }
        // se precoProduto>=200 <300 então desconto =10
        if(precoProduto>=200){
            desconto=10;
        }
        //se precoProduto>=300 então desconto =15
            if (precoProduto >= 300) {
                desconto = 15.0;}
                //
        // realizar a Conta
        double valorDesconto = precoProduto * desconto / 100;
        double precoFinal = precoProduto - valorDesconto;
        System.out.println("O valor do Produto é R$" + precoFinal);

    }
    //If encadeado(If-Else)
    public void DecisaoIfElse() {
        System.out.println("Informe o Preço do Produto");
        double precoProduto = sc.nextDouble();
        double desconto = 0.0;
        //Estrutara de decisão encadeada
        if(precoProduto>=300){
            desconto= 15;//1º condição
        }
        else if(precoProduto>=200){
            desconto= 10;//1º condição
        }
        else if(precoProduto>=100){
            desconto=5;//2ºcondição
        }
        else{
            desconto=0;
        }
       // else n precisa do parenteses-nunca!!(sem condição)
        //realizar a conta
        double valorDesconto = precoProduto * desconto / 100;
        double precoFinal = precoProduto - valorDesconto;
        System.out.println("O valor do Produto é R$" + precoFinal);

       
    }
}

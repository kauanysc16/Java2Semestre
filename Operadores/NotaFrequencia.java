package Operadores;

import java.util.Scanner;

public class NotaFrequencia {
    Scanner sc = new Scanner(System.in);
public void calcular(){
    System.out.println("Informe a nota 1 do aluno");
int nota1 = sc.nextInt();
System.out.println("Informe a nota 2 do aluno");
int nota2 = sc.nextInt();
//Operação Aritmética
double media = (nota1+nota2)/2;
//Média = nota1
//Média += nota2
//Média /=2
System.out.println("A média do aluno é"+ media);
boolean mediaAprovada = media>=50; 
System.out.println("O Aluno está aprovado por nota?"+ mediaAprovada);
System.out.println("Informe a frequência do aluno");
int frequência= sc.nextInt();
boolean frequenciaAprovada = frequência >=75;
System.out.println("O aluno está aprovado por frequência?"+ frequenciaAprovada);
boolean resultadoFinal = (mediaAprovada==true)&&(frequenciaAprovada==true);
System.out.println("O aluno está aprovado no curso?"+resultadoFinal);
}
}
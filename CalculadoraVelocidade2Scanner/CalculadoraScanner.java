package CalculadoraVelocidade2Scanner;

import java.util.Scanner;

public class CalculadoraScanner {
    public CalculadoraScanner(double d) {
    }

    public void calcular(){
Scanner sc = new Scanner(System.in);
System.out.println("Informe a Distância Percorrida");
double distanciaPercorrida = sc.nextDouble();
System.out.println("A distância percorrida foi de"+ distanciaPercorrida +"Km");
System.out.println("Informe o tempo gasto na viagem");
double tempoGasto = sc.nextDouble();
System.out.println("O Tempo gasto na viagem foi de" + tempoGasto + "horas");
sc.close();
double velocidadeMedia = distanciaPercorrida/tempoGasto;
System.out.println("A Velocidade Media foi de"+ velocidadeMedia +"km/h");
}
}

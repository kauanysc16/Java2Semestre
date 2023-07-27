package CalculadoraVelocidade2Scanner;

public class CalculadoraCustoViagem {
    public static void main(String[] args) {
        System.out.println("custoViagem2.0");
        int distanciaKm = 2951;
        int carroDistancia = 10;
        int combustivel = 5;
        float custo = distanciaKm/carroDistancia;
        float total = custo*combustivel;

        System.out.println("o custo total é de:");
        System.out.println(total + "$");
    }
}

package EstruturaDecisaoSwitch;

import java.util.Scanner;

/**
 * SwitchCase
 */
public class SwitchCase {
    Scanner sc = new Scanner(System.in);

    public void letra() {
        System.out.println("Digite uma letra:");
        String letra = sc.nextLine();
        switch (letra) {
            case "a":
                System.out.println(letra + "É uma vogal");
                break;
            case "e":
                System.out.println(letra + "É uma vogal");
                break;
            case "i":
                System.out.println(letra + "É uma vogal");
                break;
            case "o":
                System.out.println(letra + "É uma vogal");
                break;
            case "u":
                System.out.println(letra + "É uma vogal");
            default:
                System.out.println(letra + "É consoante");
                break;
        }
    }

    public void mes() {
        System.out.println("Digite um Numero:");
        String mes = sc.nextLine();
        String mesDoAno;
        switch (Numero) {
            case 1: mesDoAno = "Janeiro";
                break;
            case 2: mesDoAno = "Fevereiro";
                break;
            case 3: mesDoAno = "Março";
                break;
            case 4: mesDoAno = "Abril";
                break;
            case 5: mesDoAno = "Maio";
                break;
            case 6: mesDoAno = "Junho";
                break;
            case 7: mesDoAno = "Julho";
                break;
            case 8: mesDoAno = "Agosto";
                break;
            case 9: mesDoAno = "Setembro";
                break;
            case 10: mesDoAno = "Outubro";
                break;
        }
    }
    }

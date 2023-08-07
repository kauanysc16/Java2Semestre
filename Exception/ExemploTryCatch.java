package Exception;

import javax.swing.JOptionPane;

/**
 * ExemploTryCatch
 */
public class ExemploTryCatch {

    public static void main(String[] args) {
        int n1, n2;
        boolean ligado = true;
        String operacoes[] = {"Soma", "Subtração", "Multiplicação", "Divisão", "Sair"};
        while (ligado) {
            try {
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número Inteiro: "));
                n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um número Inteiro: "));
                int i = JOptionPane.showOptionDialog(null, "Escolha a Operação Desejada", "Operação", JOptionPane.DEFAULT_OPTION, JOptionPane.CANCEL_OPTION, null, operacoes, operacoes[0]);
                if(i==0){
                                   JOptionPane.showMessageDialog(null, "A soma de" + n1 + " + " + n2 + " = " + (n1 + n2));
                }else if(i==1){
                                                       JOptionPane.showMessageDialog(null, "A soma de" + n1 + " - " + n2 + " = " + (n1 - n2));

                }
                 else if(i==2){
                                                       JOptionPane.showMessageDialog(null, "A soma de" + n1 + " * " + n2 + " = " + (n1 * n2));

                }
                 else if(i==3){
                                                       JOptionPane.showMessageDialog(null, "A soma de" + n1 + " / " + n2 + " = " + (n1 / n2));
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "FALHA " + "Valor digitado não é número inteiro");
            ligado= false;
            }
                    catch (ArithmeticException e) {
                        JOptionPane.showMessageDialog(null, "FALHA " + "Valor digitado não é número inteiro");
        }
         catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "FALHA " + "Valor digitado não é número inteiro");

    }
}
    }
}
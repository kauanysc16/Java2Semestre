package Exception;

import javax.swing.JOptionPane;

public class ExemploThrow {
    public static void main(String[] args) {
        boolean tenteNovamente = true;
        String senha;
        while (tenteNovamente) {
            try {
                senha = JOptionPane.showInputDialog("Informe uma senha");
                if (senha.length() < 8) {
                    throw new Exception("Senha < 8 Caracteres");
                }
                tenteNovamente = false;
                JOptionPane.showMessageDialog(null, "Senha Cadastrada com Sucesso", "senha", 1);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Senha", 0);
            }
        }
    }
}

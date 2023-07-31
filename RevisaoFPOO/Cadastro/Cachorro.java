package Cadastro;

import javax.swing.JOptionPane;

public class Cachorro extends Animais {
    
    int acao = 0;

    public void cadastrarCachorro() {
        JOptionPane.showMessageDialog(null, "----- Menu Cadastro Canino ----- \n        Preencha os Campos");

        setProprietario(JOptionPane.showInputDialog("      ----- Menu Cadastro ----- \n      Informe o Nome do Proprietário: "));
        setPorte(JOptionPane.showInputDialog("      ----- Menu Cadastro ----- \n      Informe o Porte do Animal: "));
        setPeso(Integer.parseInt(JOptionPane.showInputDialog("      ----- Menu Cadastro ----- \n      Informe o Peso do Animal: ")));
        setEspecie(JOptionPane.showInputDialog("      ----- Menu Cadastro ----- \n      Informe a Raça do Animal: "));
        setGenero(JOptionPane.showInputDialog("      ----- Menu Cadastro ----- \n      Informe o Sexo do Animal: "));
    }
}
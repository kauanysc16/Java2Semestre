package AtividadeFinal;

import javax.swing.JOptionPane;

public class Conta extends Pessoas {
    // atributos
    double saldo;
    int codigo = 0;
    String contaTipo;
    int senha;
    double emprestimo = 0;
    int acao = 0;

    // métodos

    // construtor(vazio default)
    public Conta() {
    }

    // sets and gets
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getContaTipo() {
        return contaTipo;
    }

    public void setContaTipo(String contaTipo) {
        this.contaTipo = contaTipo;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(double emprestimo) {
        this.emprestimo = emprestimo;
    }

    public int getAcao() {
        return acao;
    }

    public void setAcao(int acao) {
        this.acao = acao;
    }

    // métodos outros
    public void criacao() {
        acao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a conta: "));
        switch (acao) {

            case 1:
                JOptionPane.showInputDialog("Criação de Conta: Pessoa Física");
                setNome(JOptionPane.showInputDialog("Informe o nome da conta:"));
                setSenha(Integer
                        .parseInt(JOptionPane.showInputDialog("Informe a senha da conta:")));
                setCpf(JOptionPane.showInputDialog("Informe o seu CPF:"));
                setContaTipo("Conta PF");

                break;

            case 2:
                JOptionPane.showInputDialog("Criação de Conta: Pessoa Jurídica");
                setNome(JOptionPane.showInputDialog("Informe o nome da conta:"));
                setSenha(Integer
                        .parseInt(JOptionPane.showInputDialog("Informe a senha da conta:")));
                setCnpj(JOptionPane.showInputDialog("Informe o seu CNPJ:"));
                setContaTipo("Conta PJ");
                break;
            default:

        }
    }

    public void entrarConta() {
        String nome = JOptionPane.showInputDialog(null, "Escreva o nome da conta:");
        int senha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a senha da conta:"));
        if (nome.equals(getNome()) && senha == setSenha()) {
            int receber = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "\n1 - Saque; \n2 - Depósitar; \n3 - Empréstimo; \n4 - Sair da Conta."));
            switch (receber) {
                case 1: {
                    saque();
                    break;
                }
                case 2: {
                    deposito();
                    break;
                }
                case 3: {
                    emprestimo();
                    break;
                }
                default:
                    JOptionPane.showMessageDialog(null, "Saiu da conta.");
                    break;
            }
        }
    }

    private int setSenha() {
        return 0;
    }

    double saque() {
        JOptionPane.showMessageDialog(null, "Método de Saque");
        double saquear = Double.parseDouble(
                JOptionPane.showInputDialog("informe a quantidade de valores para saquear (Limite: 3000):"));
        if (saquear > 0 && saquear < 3000) {
            if (!(saldo < saquear)) {
                saldo = saldo - saquear;
            } else {
                JOptionPane.showInputDialog("saldo insuficiente");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Valor fora do limite");
        }
        return saldo;
    }

    // Método de Depósito
    double deposito() {
        double deposito = Double.parseDouble(
                JOptionPane.showInputDialog("Informe o valor para depositar:"));
        saldo = saldo + deposito;
        return saldo;
    }

    // Método de empréstimo
    public double emprestimo() {
        double emprestimo = Double.parseDouble(
                JOptionPane.showInputDialog("Informe o valor para o emprestimo:"));
        saldo = saldo + emprestimo;
        JOptionPane.showMessageDialog(null, "Dívida a pagar: " + emprestimo);
        return saldo;
    }

    public void criarConta() {
    }
}
package Controller;

import java.util.Calendar;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Connection.ProdutosDAO;

public class ProdutosControl {
    // atributos
    private List<Carros> carros;
    private DefaultTableModel tableModel;
    private JTable table;

    // construtor
    public ProdutosControl(List<Carros> carros, DefaultTableModel tableModel, JTable table) {
        this.des = carros;
        this.tableModel = tableModel;
        this.table = table;
    }

    // métodos
    // Método para atualizar a tabela de exibição com dados do banco de dados
    private void atualizarTabela() {
        tableModel.setRowCount(0); // Limpa todas as linhas existentes na tabela
        carros = new ProdutosDAO().listarTodos();
        // Obtém os carros atualizados do banco de dados
        for (Carros carro : carros) {
            // Adiciona os dados de cada carro como uma nova linha na tabela Swing
            tableModel.addRow(new Object[] { carro.getMarca(), carro.getModelo(),
                    carro.getAno(), carro.getPlaca(), carro.getValor() });
        }
    }

    // método Cadastrar
    public void cadastrar(String marca, String modelo, String ano, String placa, String valor) {
        try {
            if (Integer.parseInt(valor) < 0 || Integer.parseInt(valor) > 1000000) {
                System.out.println("Valor incorreto");
            } else if (Integer.parseInt(ano) > 2025 || Integer.parseInt(ano) < 1950) {
                System.out.println("valor incorreto");
            } else {
                new ProdutosDAO().cadastrar(marca, modelo, ano, placa, valor);
                new RegistrosSistemas().registrarOperacao("Cadastro do Carro " + marca + " " + modelo + " " + placa
                        + " Cadastrado com sucesso");
                atualizarTabela();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(table, e);
        }

    }

    // método Apagar
    public void apagar(String placa) {
        new ProdutosDAO().apagar(placa);
        atualizarTabela();
    }

    // métodos Atualizar pela Placa
    public void atualizar(String marca, String modelo, String ano, String placa, String valor) {
        new ProdutosDAO().atualizar(marca, modelo, ano, placa, valor);
        atualizarTabela();
    }
}
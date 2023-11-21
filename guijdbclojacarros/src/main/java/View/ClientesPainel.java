package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;
import Connection.ClientesDAO;
import Model.Clientes;
import java.awt.*;
import java.awt.event.ActionListener;
import javafx.event.ActionEvent;

public class ClientesPainel extends JPanel {

    private JTextField nomeField, enderecoField, telefoneField, cpfField;
    private JTable table;
    private DefaultTableModel tableModel;
    private JTextComponent carroField;
    private ClientesDAO operacoes;
    private JButton cadastrar, apagar, editar;

    public ClientesPainel() {
        // Configuração do layout
        setLayout(new GridLayout(5, 2, 10, 10));

        // Adiciona componentes à interface
        add(new JLabel("Nome:"));
        nomeField = new JTextField();
        add(nomeField);

        add(new JLabel("Endereço:"));
        enderecoField = new JTextField();
        add(enderecoField);

        add(new JLabel("Telefone:"));
        telefoneField = new JTextField();
        add(telefoneField);

        add(new JLabel("CPF:"));
        cpfField = new JTextField();
        add(cpfField);

        add(new JLabel("Carro:"));
        carroField = new JTextField();
        add(carroField);

        add(new JLabel("Cadastro Carros"));
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2));
        inputPanel.add(new JLabel("Nome"));
        nomeField = new JTextField(20);
        inputPanel.add(nomeField);
        inputPanel.add(new JLabel("Endereço"));
        enderecoField = new JTextField(20);
        inputPanel.add(enderecoField);
        inputPanel.add(new JLabel("Telefone"));
        telefoneField = new JTextField(20);
        inputPanel.add(telefoneField);
        inputPanel.add(new JLabel("Cpf"));
        cpfField = new JTextField(20);
        inputPanel.add(cpfField);
        inputPanel.add(new JLabel("Carro"));
        carroField = new JTextField(20);
        inputPanel.add(carroField);
        add(inputPanel);
        JPanel botoes = new JPanel();
        botoes.add(cadastrar = new JButton("Cadastrar"));
        botoes.add(editar = new JButton("Editar"));
        botoes.add(apagar = new JButton("Apagar"));
        add(botoes);

        JScrollPane jSPane = new JScrollPane();
        add(jSPane);

        tableModel = new DefaultTableModel(new Object[][] {},
                new String[] { "Nome", "Endereço", "Telefone", "CPF", "Carro" });
        table = new JTable(tableModel);
        jSPane.setViewportView(table);

        // Botão para realizar o cadastro
        JButton cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.addActionListener(e -> {

            cadastrarCliente();

        });
        add(cadastrarButton);
    }

    private void cadastrarCliente() {
        // Aqui você implementaria a lógica para cadastrar o cliente no banco de dados
        String nome = nomeField.getText();
        String endereco = enderecoField.getText();
        String telefone = telefoneField.getText();
        String cpf = cpfField.getText();
        String carro = carroField.getText();

        // Exemplo: Imprimir os dados do cliente
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("CPF: " + cpf);
        System.out.println("Carro: " + carro);

        // Cria o banco de dados caso não tenha sido criado
        new ClientesDAO().criaTabela();

    }

    // Configura a ação do botão "apagar" para excluir um registro no banco de dados
    apagar.addActionListener(e->

    {
            operacoes.apagar(carroField.getText());
            // Limpa os campos de entrada após a operação de exclusão
            nomeField.setText("");
            enderecoField.setText("");
            telefoneField.setText("");
            cpfField.setText("");
            carroField.setText("");
        });
};

package View;

import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import Connection.ClientesDAO;

import Controller.ClientesControl;

import java.awt.GridLayout;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Model.Clientes;

public class ClientesPainel extends JPanel {
    // atributos
    private JButton cadastrar, apagar, editar;
    private JTextField nomeField, enderecoField, telefoneField, cpfField,
            carroField;
    private List<Clientes> clientes;
    private JTable table;
    private DefaultTableModel tableModel;
    private int linhaSelecionada = -1;

    // construtor
    public ClientesPainel() {
        super();
        // entrada de dados
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new JLabel("Cadastro Clientes"));
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
        // tabela de carros
        JScrollPane jSPane = new JScrollPane();
        add(jSPane);

        tableModel = new DefaultTableModel(new Object[][] {},
                new String[] { "Nome", "Endereço", "Telefone", "Cpf", "Carro" });
        table = new JTable(tableModel);
        jSPane.setViewportView(table);

        // tratamento de tabela
        // Cria o banco de dados caso não tenha sido criado
        new ClientesDAO().criaTabela();
        // incluindo elementos do banco na criação do painel
        atualizarTabela();

        // tratamento de Eventos
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    nomeField.setText((String) table.getValueAt(linhaSelecionada, 0));
                    enderecoField.setText((String) table.getValueAt(linhaSelecionada, 1));
                    telefoneField.setText((String) table.getValueAt(linhaSelecionada, 2));
                    cpfField.setText((String) table.getValueAt(linhaSelecionada, 3));
                    carroField.setText((String) table.getValueAt(linhaSelecionada, 4));
                }
            }
        });
        // Cria um objeto operacoes da classe CarrosControl para executar operações no
        // banco de dados
        ClientesControl operacoes = new ClientesControl(clientes, tableModel, table);
        // Configura a ação do botão "cadastrar" para adicionar um novo registro no
        // banco
        // de dados
        cadastrar.addActionListener(e -> {

            // Chama o método "cadastrar" do objeto operacoes com os valores dos
            // campos de entrada

            operacoes.cadastrar(nomeField.getText(), enderecoField.getText(),
                    telefoneField.getText(), cpfField.getText(), carroField.getText());
            // Limpa os campos de entrada após a operação de cadastro
            nomeField.setText("");
            enderecoField.setText("");
            telefoneField.setText("");
            cpfField.setText("");
            carroField.setText("");

        });

        // Configura a ação do botão "editar" para atualizar um registro no banco de
        // dados
        editar.addActionListener(e -> {
            operacoes.atualizar(nomeField.getText(), enderecoField.getText(), telefoneField.getText(),
                    cpfField.getText(), carroField.getText());
            // Limpa os campos de entrada após a operação de atualização
            nomeField.setText("");
            enderecoField.setText("");
            telefoneField.setText("");
            cpfField.setText("");
            carroField.setText("");

        });

        // Configura a ação do botão "apagar" para excluir um registro no banco de dados
        apagar.addActionListener(e -> {
            operacoes.apagar(cpfField.getText());
            // Limpa os campos de entrada após a operação de exclusão
            nomeField.setText("");
            enderecoField.setText("");
            telefoneField.setText("");
            cpfField.setText("");
            carroField.setText("");
        });
    }

    private void atualizarTabela() {
        tableModel.setRowCount(0);
        clientes = new ClientesDAO().listarTodos();
        for (Clientes clientes : clientes) {
            tableModel.addRow(new Object[] { clientes.getNome(), clientes.getEndereço(),
                    clientes.getTelefone(), clientes.getCpf(), clientes.getCarro() });
        }
    }
}
package Model;

public class Clientes {
    private String nome;
    private String senha;
    private String telefone;
    private String cpf;
    private String produto;

    // construtor
    public Clientes(String nome, String senha, String telefone, String cpf, String produto) {
        this.nome = nome;
        this.senha = senha;
        this.telefone = telefone;
        this.cpf = cpf;
        this.produto = produto;
    }

    // getters setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return senha;
    }

    public void setEndereço(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getproduto() {
        return produto;
    }

    public void setproduto(String produto) {
        this.produto = produto;
    }

}
package Model;

public class Produtos {
    //atributos
    private String descricao;
private String marca;
private String valid;
private String valor;



//construtor
public Produtos(String descricao, String marca, String valid, String placa, String valor) {
    this.descricao = descricao;
    this.marca = marca;
    this.valid = valid;
   
    this.valor = valor;
}

//getters Setters
public String getdescricao() {
    return descricao;
}

public void setdescricao(String descricao) {
    this.descricao = descricao;
}

public String getmarca() {
    return marca;
}

public void setmarca(String marca) {
    this.marca = marca;
}

public String getAno() {
    return valid;
}

public void setAno(String valid) {
    this.valid = valid;
}

public String getValor() {
    return valor;
}

public void setValor(String valor) {
    this.valor = valor;
}
}
 
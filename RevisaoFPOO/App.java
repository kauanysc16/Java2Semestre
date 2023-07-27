import java.time.LocalDateTime;

import javax.swing.JOptionPane;

import Cadastro.Animais;
import Cadastro.Cachorro;
import Cadastro.Gato;
import Cadastro.OutrosAnimais;

public class App {
    public static void main(String[] args) {
        // armazenar os meus objetos
        Gato gatos[] = new Gato[10];
        Cachorro cachorros[] = new Cachorro[10];
        OutrosAnimais outrosAnimais[] = new OutrosAnimais[10];
        // contador
        int contGatos = 0, contCachorros = 0, contOutros = 0;
        // criar o cadastro
        // JOptionPane.showMessageDialog(null, "Bem vindo ao consultório da Dr.
        // Laylla");
    boolean aberto = true;
        // if(LocalDateTime.now(zone:null)>8 && LocalDateTime.now(zone:null)<18){
        // aberto=true;
        // }else{
        // aberto= false;
        // }

        while (aberto) {
            int acao = Integer.parseInt(JOptionPane.showInputDialog("1-Cadastrar PET\n 2-Agendar Consulta\n 3-Sair"));
            if (acao == 1) {
int acao2 = Integer.parseInt(JOptionPane.showInputDialog("1-Gato\n2-Cachorro\n3-Outros"));
if(acao2 ==1){
    //Cadastro do Gato
}else if (acao2 ==2) {
    //Cadastro do Cachorro
}else if (acao==3){
    //cadastro de outros Pet
}else {
    JOptionPane.
}
            }else if(acao==2){
                //agendamento
            }
        }
    }
}